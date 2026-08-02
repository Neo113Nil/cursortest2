package org.chromium.net.impl;

import android.os.Build;
import android.os.Process;
import com.google.firebase.perf.FirebasePerformance;
import internal.org.jni_zero.JNINamespace;
import internal.org.jni_zero.NativeClassQualifiedName;
import j$.time.Duration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.UrlResponseInfoImpl;
import org.chromium.net.impl.VersionSafeCallbacks;

@JNINamespace("cronet")
/* loaded from: classes10.dex */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final VersionSafeCallbacks.BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private CronetException mException;
    private final Executor mExecutor;
    private boolean mFinalUserCallbackThrew;
    private int mFlushCount;
    private RefCountDelegate mInflightDoneCallbackCount;
    private final String mInitialMethod;
    private final int mInitialPriority;
    private final String mInitialUrl;
    private final CronetLogger mLogger;
    private CronetMetrics mMetrics;
    private long mNativeStream;
    private final long mNetworkHandle;
    private int mNonfinalUserCallbackExceptionCount;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private int mReadCount;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final String[] mRequestHeaders;
    private boolean mRequestHeadersSent;
    private UrlResponseInfoImpl mResponseInfo;
    private Runnable mTerminalRunnable;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final Object mNativeStreamLock = new Object();
    private int mReadState = 0;
    private int mWriteState = 0;
    private final ArrayList<ByteBuffer> mPendingData = new ArrayList<>();
    private final ArrayDeque<ByteBuffer> mFlushData = new ArrayDeque<>();

    interface Natives {
        long createBidirectionalStream(CronetBidirectionalStream self, long urlRequestContextAdapter, boolean sendRequestHeadersAutomatically, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle);

        @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        void destroy(long nativePtr);

        @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        boolean readData(long nativePtr, ByteBuffer byteBuffer, int position, int limit);

        @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        void sendRequestHeaders(long nativePtr);

        @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        int start(long nativePtr, String url, int priority, String method, String[] headers, boolean endOfStream);

        @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        boolean writevData(long nativePtr, ByteBuffer[] buffers, int[] positions, int[] limits, boolean endOfStream);
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface State {
        public static final int CANCELED = 5;
        public static final int ERROR = 6;
        public static final int ERROR_POSTING_TO_EXECUTOR = 11;
        public static final int NOT_STARTED = 0;
        public static final int READING = 3;
        public static final int READING_DONE = 4;
        public static final int STARTED = 1;
        public static final int SUCCESS = 7;
        public static final int WAITING_FOR_FLUSH = 8;
        public static final int WAITING_FOR_READ = 2;
        public static final int WRITING = 9;
        public static final int WRITING_DONE = 10;
    }

    private final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        private OnReadCompletedRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    boolean z = false;
                    if (this.mEndOfStream) {
                        CronetBidirectionalStream.this.mReadState = 4;
                        if (CronetBidirectionalStream.this.mWriteState == 10) {
                            z = true;
                        }
                    } else {
                        CronetBidirectionalStream.this.mReadState = 2;
                    }
                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onReadCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                    if (z) {
                        CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                    }
                }
            } catch (Exception e) {
                CronetBidirectionalStream.this.onNonfinalCallbackException(e);
            }
        }
    }

    private final class OnWriteCompletedRunnable implements Runnable {
        private ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        OnWriteCompletedRunnable(ByteBuffer buffer, boolean endOfStream) {
            this.mByteBuffer = buffer;
            this.mEndOfStream = endOfStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    boolean z = false;
                    if (this.mEndOfStream) {
                        CronetBidirectionalStream.this.mWriteState = 10;
                        if (CronetBidirectionalStream.this.mReadState == 4) {
                            z = true;
                        }
                    }
                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onWriteCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                    if (z) {
                        CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                    }
                }
            } catch (Exception e) {
                CronetBidirectionalStream.this.onNonfinalCallbackException(e);
            }
        }
    }

    CronetBidirectionalStream(CronetUrlRequestContext requestContext, String url, int priority, BidirectionalStream.Callback callback, Executor executor, String httpMethod, List<Map.Entry<String, String>> requestHeaders, boolean delayRequestHeadersUntilNextFlush, Collection<Object> requestAnnotations, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        this.mRequestContext = requestContext;
        this.mInitialUrl = url;
        this.mInitialPriority = convertStreamPriority(priority);
        this.mCallback = new VersionSafeCallbacks.BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = httpMethod;
        this.mRequestHeaders = stringsFromHeaderList(requestHeaders);
        this.mDelayRequestHeadersUntilFirstFlush = delayRequestHeadersUntilNextFlush;
        this.mRequestAnnotations = requestAnnotations;
        this.mTrafficStatsTagSet = trafficStatsTagSet;
        this.mTrafficStatsTag = trafficStatsTag;
        this.mTrafficStatsUidSet = trafficStatsUidSet;
        this.mTrafficStatsUid = trafficStatsUid;
        this.mNetworkHandle = networkHandle;
        this.mLogger = requestContext.getCronetLogger();
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#start");
        try {
            synchronized (this.mNativeStreamLock) {
                if (this.mReadState != 0) {
                    throw new IllegalStateException("Stream is already started.");
                }
                try {
                    this.mNativeStream = CronetBidirectionalStreamJni.get().createBidirectionalStream(this, this.mRequestContext.getUrlRequestContextAdapter(), !this.mDelayRequestHeadersUntilFirstFlush, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
                    int start = CronetBidirectionalStreamJni.get().start(this.mNativeStream, this.mInitialUrl, this.mInitialPriority, this.mInitialMethod, this.mRequestHeaders, !doesMethodAllowWriteData(r5));
                    if (start == -1) {
                        throw new IllegalArgumentException("Invalid http method " + this.mInitialMethod);
                    }
                    if (start > 0) {
                        throw new IllegalArgumentException("Invalid header with headername: " + this.mRequestHeaders[start - 1]);
                    }
                    this.mRequestContext.onRequestStarted();
                    RefCountDelegate refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            CronetBidirectionalStream.this.onRequestFinished();
                        }
                    });
                    this.mInflightDoneCallbackCount = refCountDelegate;
                    refCountDelegate.increment();
                    this.mWriteState = 1;
                    this.mReadState = 1;
                } catch (RuntimeException e) {
                    destroyNativeStreamLocked();
                    throw e;
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } finally {
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(ByteBuffer buffer) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#read");
        try {
            synchronized (this.mNativeStreamLock) {
                Preconditions.checkHasRemaining(buffer);
                Preconditions.checkDirect(buffer);
                if (this.mReadState != 2) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (this.mOnReadCompletedTask == null) {
                    this.mOnReadCompletedTask = new OnReadCompletedRunnable();
                }
                this.mReadState = 3;
                if (!CronetBidirectionalStreamJni.get().readData(this.mNativeStream, buffer, buffer.position(), buffer.limit())) {
                    this.mReadState = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
                this.mReadCount++;
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(ByteBuffer buffer, boolean endOfStream) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#write");
        try {
            synchronized (this.mNativeStreamLock) {
                Preconditions.checkDirect(buffer);
                if (!buffer.hasRemaining() && !endOfStream) {
                    throw new IllegalArgumentException("Empty buffer before end of stream.");
                }
                if (this.mEndOfStreamWritten) {
                    throw new IllegalArgumentException("Write after writing end of stream.");
                }
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    this.mPendingData.add(buffer);
                    if (endOfStream) {
                        this.mEndOfStreamWritten = true;
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        int i;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#flush");
        try {
            synchronized (this.mNativeStreamLock) {
                if (!isDoneLocked() && ((i = this.mWriteState) == 8 || i == 9)) {
                    if (this.mPendingData.isEmpty() && this.mFlushData.isEmpty()) {
                        if (!this.mRequestHeadersSent) {
                            this.mRequestHeadersSent = true;
                            CronetBidirectionalStreamJni.get().sendRequestHeaders(this.mNativeStream);
                            if (!doesMethodAllowWriteData(this.mInitialMethod)) {
                                this.mWriteState = 10;
                            }
                        }
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                    if (!this.mPendingData.isEmpty()) {
                        this.mFlushData.addAll(this.mPendingData);
                        this.mPendingData.clear();
                    }
                    if (this.mWriteState == 9) {
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    } else {
                        sendFlushDataLocked();
                        this.mFlushCount++;
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void sendFlushDataLocked() {
        int size = this.mFlushData.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer poll = this.mFlushData.poll();
            byteBufferArr[i] = poll;
            iArr[i] = poll.position();
            iArr2[i] = poll.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        Natives natives = CronetBidirectionalStreamJni.get();
        boolean z = false;
        long j = this.mNativeStream;
        if (this.mEndOfStreamWritten && this.mPendingData.isEmpty()) {
            z = true;
        }
        if (natives.writevData(j, byteBufferArr, iArr, iArr2, z)) {
            return;
        }
        this.mWriteState = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    public List<ByteBuffer> getPendingDataForTesting() {
        ArrayList arrayList;
        synchronized (this.mNativeStreamLock) {
            arrayList = new ArrayList();
            Iterator<ByteBuffer> it = this.mPendingData.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().asReadOnlyBuffer());
            }
        }
        return arrayList;
    }

    public List<ByteBuffer> getFlushDataForTesting() {
        ArrayList arrayList;
        synchronized (this.mNativeStreamLock) {
            arrayList = new ArrayList();
            Iterator<ByteBuffer> it = this.mFlushData.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().asReadOnlyBuffer());
            }
        }
        return arrayList;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#cancel");
        try {
            synchronized (this.mNativeStreamLock) {
                if (!isDoneLocked() && this.mReadState != 0) {
                    this.mWriteState = 5;
                    this.mReadState = 5;
                    this.mTerminalRunnable = new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            CronetBidirectionalStream.this.lambda$cancel$0();
                        }
                    };
                    destroyNativeStreamLocked();
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$0() {
        this.mCallback.onCanceled(this, this.mResponseInfo);
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mReadState != 0 && this.mNativeStream == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeOnSucceededOnExecutor() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#maybeOnSucceededOnExecutor");
        try {
            synchronized (this.mNativeStreamLock) {
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (this.mWriteState == 10 && this.mReadState == 4) {
                    this.mWriteState = 7;
                    this.mReadState = 7;
                    this.mTerminalRunnable = new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            CronetBidirectionalStream.this.lambda$maybeOnSucceededOnExecutor$1();
                        }
                    };
                    destroyNativeStreamLocked();
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeOnSucceededOnExecutor$1() {
        this.mCallback.onSucceeded(this, this.mResponseInfo);
    }

    private void onStreamReady(final boolean requestHeadersSent) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.1
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mNativeStreamLock) {
                    if (this.this$0.isDoneLocked()) {
                        return;
                    }
                    this.this$0.mRequestHeadersSent = requestHeadersSent;
                    this.this$0.mReadState = 2;
                    if (!CronetBidirectionalStream.doesMethodAllowWriteData(this.this$0.mInitialMethod) && this.this$0.mRequestHeadersSent) {
                        this.this$0.mWriteState = 10;
                    } else {
                        this.this$0.mWriteState = 8;
                    }
                    try {
                        this.this$0.mCallback.onStreamReady(this.this$0);
                    } catch (Exception e) {
                        this.this$0.onNonfinalCallbackException(e);
                    }
                }
            }
        }, "onStreamReady");
    }

    private void onResponseHeadersReceived(int httpStatusCode, String negotiatedProtocol, String[] headers, long receivedByteCount) {
        try {
            try {
                this.mResponseInfo = prepareResponseInfoOnNetworkThread(httpStatusCode, negotiatedProtocol, headers, receivedByteCount);
                postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                            if (CronetBidirectionalStream.this.isDoneLocked()) {
                                return;
                            }
                            CronetBidirectionalStream.this.mReadState = 2;
                            try {
                                VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                                CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                                bidirectionalStreamCallback.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                            } catch (Exception e) {
                                CronetBidirectionalStream.this.onNonfinalCallbackException(e);
                            }
                        }
                    }
                }, "onResponseHeadersReceived");
            } catch (Exception unused) {
                failWithException(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
            }
        } catch (Exception unused2) {
        }
    }

    private void onReadCompleted(final ByteBuffer byteBuffer, int bytesRead, int initialPosition, int initialLimit, long receivedByteCount) {
        int i;
        this.mResponseInfo.setReceivedByteCount(receivedByteCount);
        if (byteBuffer.position() != initialPosition || byteBuffer.limit() != initialLimit) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (bytesRead < 0 || (i = initialPosition + bytesRead) > initialLimit) {
            failWithException(new CronetExceptionImpl("Invalid number of bytes read", null));
            return;
        }
        this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
        this.mOnReadCompletedTask.mEndOfStream = bytesRead == 0;
        postTaskToExecutor(this.mOnReadCompletedTask, "onReadCompleted");
    }

    private void onWritevCompleted(final ByteBuffer[] byteBuffers, int[] initialPositions, int[] initialLimits, boolean endOfStream) {
        boolean z;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 8;
            if (!this.mFlushData.isEmpty()) {
                sendFlushDataLocked();
            }
            for (int i = 0; i < byteBuffers.length; i++) {
                ByteBuffer byteBuffer = byteBuffers[i];
                if (byteBuffer.position() != initialPositions[i] || byteBuffer.limit() != initialLimits[i]) {
                    failWithException(new CronetExceptionImpl("ByteBuffer modified externally during write", null));
                    return;
                }
                if (endOfStream) {
                    z = true;
                    if (i == byteBuffers.length - 1) {
                        postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z), "onWritevCompleted");
                    }
                }
                z = false;
                postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z), "onWritevCompleted");
            }
        }
    }

    private void onResponseTrailersReceived(String[] trailers) {
        final UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = new UrlResponseInfoImpl.HeaderBlockImpl(headersListFromStrings(trailers));
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.3
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mNativeStreamLock) {
                    if (this.this$0.isDoneLocked()) {
                        return;
                    }
                    try {
                        VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = this.this$0.mCallback;
                        CronetBidirectionalStream cronetBidirectionalStream = this.this$0;
                        bidirectionalStreamCallback.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, headerBlockImpl);
                    } catch (Exception e) {
                        this.this$0.onNonfinalCallbackException(e);
                    }
                }
            }
        }, "onResponseTrailersReceived");
    }

    private void onError(int errorCode, int nativeError, int nativeQuicError, int source, String errorString, long receivedByteCount) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(receivedByteCount);
        }
        if (errorCode == 10 || nativeQuicError != 0) {
            failWithException(new QuicExceptionImpl("Exception in BidirectionalStream: " + errorString, errorCode, nativeError, nativeQuicError, source));
        } else {
            failWithException(new BidirectionalStreamNetworkException("Exception in BidirectionalStream: " + errorString, errorCode, nativeError));
        }
    }

    private String getTerminalStateAsString() {
        throwIfNotInTerminalState();
        int i = this.mReadState;
        if (i == 5) {
            return "CANCELED";
        }
        if (i == 6) {
            return "ERROR";
        }
        if (i == 7) {
            return "SUCCESS";
        }
        if (i == 11) {
            return "ERROR_POSTING_TO_EXECUTOR";
        }
        throw new IllegalStateException(String.format("Unknown callback type to execute: %d", Integer.valueOf(this.mReadState)));
    }

    public CronetMetrics getFinishedRequestTimings() {
        if (!isInTerminalState()) {
            throw new IllegalStateException("getFinishedRequestTimings can be only called when the request has finished.");
        }
        CronetMetrics cronetMetrics = this.mMetrics;
        if (cronetMetrics != null) {
            return cronetMetrics;
        }
        throw new IllegalStateException(String.format("Metrics should not be null as the request has reached the terminal state of: %s", getTerminalStateAsString()));
    }

    private boolean isInTerminalState() {
        int i = this.mReadState;
        if (i != this.mWriteState) {
            return false;
        }
        return i == 5 || i == 6 || i == 7 || i == 11;
    }

    private void throwIfNotInTerminalState() {
        if (!isInTerminalState()) {
            throw new IllegalStateException(String.format("Expected the bidirectional stream to be in a terminal state! readState = %d, writeState = %d", Integer.valueOf(this.mReadState), Integer.valueOf(this.mWriteState)));
        }
    }

    private void onNativeStreamAdapterDestroyed(CronetMetrics metrics, boolean quicConnectionMigrationAttempted, boolean quicConnectionMigrationSuccessful) {
        if (this.mReadState == 0) {
            return;
        }
        throwIfNotInTerminalState();
        if (this.mTerminalRunnable == null) {
            if (this.mReadState != 11) {
                throw new IllegalStateException("Expected a terminal runnable, but found none.");
            }
            return;
        }
        this.mMetrics = metrics;
        if (metrics == null) {
            this.mMetrics = CronetMetrics.empty();
        }
        this.mQuicConnectionMigrationAttempted = quicConnectionMigrationAttempted;
        this.mQuicConnectionMigrationSuccessful = quicConnectionMigrationSuccessful;
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CronetBidirectionalStream.this.lambda$onNativeStreamAdapterDestroyed$2();
            }
        }, String.format("executeTerminalCallback[%s]", getTerminalStateAsString()));
        try {
            this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, getFinishedReason(), this.mResponseInfo, this.mException), this.mInflightDoneCallbackCount, null);
        } finally {
            this.mInflightDoneCallbackCount.decrement();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNativeStreamAdapterDestroyed$2() {
        try {
            try {
                this.mTerminalRunnable.run();
            } catch (Exception e) {
                onFinalCallbackException(getTerminalStateAsString(), e);
            }
        } finally {
            this.mInflightDoneCallbackCount.decrement();
        }
    }

    private int getFinishedReason() {
        throwIfNotInTerminalState();
        int i = this.mReadState;
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        if (i == 7) {
            return 0;
        }
        if (i == 11) {
            return 1;
        }
        throw new IllegalStateException("Cronet bidirectional stream read state is " + this.mReadState + " which is not a valid finished state!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestFinished() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mLogger.logCronetTrafficInfo(this.mRequestContext.getLogId(), buildCronetTrafficInfo(getFinishedReason(), this.mQuicConnectionMigrationAttempted, this.mQuicConnectionMigrationSuccessful));
        }
        this.mRequestContext.onRequestFinished();
    }

    private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo(int finishedReason, boolean quicConnectionMigrationAttempted, boolean quicConnectionMigrationSuccessful) {
        Map<String, List<String>> map;
        String str;
        boolean z;
        int i;
        long estimateHeadersSizeInBytes;
        long max;
        long estimateHeadersSizeInBytes2;
        long max2;
        Duration ofSeconds;
        Duration ofSeconds2;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason;
        int i2;
        int quicDetailedErrorCode;
        int connectionCloseSource;
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            map = urlResponseInfoImpl.getAllHeaders();
            str = this.mResponseInfo.getNegotiatedProtocol();
            int httpStatusCode = this.mResponseInfo.getHttpStatusCode();
            z = this.mResponseInfo.wasCached();
            i = httpStatusCode;
        } else {
            map = Collections.EMPTY_MAP;
            str = "";
            z = false;
            i = 0;
        }
        String str2 = str;
        long longValue = this.mMetrics.getSentByteCount().longValue();
        if (z && longValue == 0) {
            max = 0;
            estimateHeadersSizeInBytes = 0;
        } else {
            estimateHeadersSizeInBytes = CronetRequestCommon.estimateHeadersSizeInBytes(this.mRequestHeaders);
            max = Math.max(0L, longValue - estimateHeadersSizeInBytes);
        }
        long longValue2 = this.mMetrics.getReceivedByteCount().longValue();
        if (z && longValue2 == 0) {
            max2 = 0;
            estimateHeadersSizeInBytes2 = 0;
        } else {
            estimateHeadersSizeInBytes2 = CronetRequestCommon.estimateHeadersSizeInBytes(map);
            max2 = Math.max(0L, longValue2 - estimateHeadersSizeInBytes2);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getResponseStart() != null) {
            ofSeconds = Duration.ofMillis(this.mMetrics.getResponseStart().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            ofSeconds = Duration.ofSeconds(0L);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getRequestEnd() != null) {
            ofSeconds2 = Duration.ofMillis(this.mMetrics.getRequestEnd().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            ofSeconds2 = Duration.ofSeconds(0L);
        }
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
        CronetException cronetException = this.mException;
        if (cronetException instanceof NetworkExceptionImpl) {
            i2 = ((NetworkExceptionImpl) cronetException).getCronetInternalErrorCode();
            requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
        } else {
            if (cronetException instanceof QuicExceptionImpl) {
                QuicExceptionImpl quicExceptionImpl = (QuicExceptionImpl) cronetException;
                int cronetInternalErrorCode = quicExceptionImpl.getCronetInternalErrorCode();
                i2 = cronetInternalErrorCode;
                quicDetailedErrorCode = quicExceptionImpl.getQuicDetailedErrorCode();
                connectionCloseSource = quicExceptionImpl.getConnectionCloseSource();
                requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
                return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i, ofSeconds, ofSeconds2, str2, quicConnectionMigrationAttempted, quicConnectionMigrationSuccessful, CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(finishedReason), this.mNonfinalUserCallbackExceptionCount, this.mReadCount, this.mFlushCount, true, this.mFinalUserCallbackThrew, Process.myUid(), i2, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource(), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getDnsStart(), this.mMetrics.getDnsEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getSslStart(), this.mMetrics.getSslEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getConnectStart(), this.mMetrics.getConnectEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getRequestStart(), this.mMetrics.getSendingStart(), -1L));
            }
            if (cronetException != null) {
                requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER;
            }
            requestFailureReason = requestFailureReason2;
            i2 = 0;
        }
        quicDetailedErrorCode = 0;
        connectionCloseSource = 0;
        return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i, ofSeconds, ofSeconds2, str2, quicConnectionMigrationAttempted, quicConnectionMigrationSuccessful, CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(finishedReason), this.mNonfinalUserCallbackExceptionCount, this.mReadCount, this.mFlushCount, true, this.mFinalUserCallbackThrew, Process.myUid(), i2, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource(), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getDnsStart(), this.mMetrics.getDnsEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getSslStart(), this.mMetrics.getSslEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getConnectStart(), this.mMetrics.getConnectEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getRequestStart(), this.mMetrics.getSendingStart(), -1L));
    }

    public void setOnDestroyedCallbackForTesting(Runnable onDestroyedCallbackForTesting) {
        this.mOnDestroyedCallbackForTesting = onDestroyedCallbackForTesting;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doesMethodAllowWriteData(String methodName) {
        return (methodName.equals("GET") || methodName.equals(FirebasePerformance.HttpMethod.HEAD)) ? false : true;
    }

    private static ArrayList<Map.Entry<String, String>> headersListFromStrings(String[] headers) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(headers.length / 2);
        for (int i = 0; i < headers.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(headers[i], headers[i + 1]));
        }
        return arrayList;
    }

    private static String[] stringsFromHeaderList(List<Map.Entry<String, String>> headersList) {
        String[] strArr = new String[headersList.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : headersList) {
            int i2 = i + 1;
            strArr[i] = entry.getKey();
            i += 2;
            strArr[i2] = entry.getValue();
        }
        return strArr;
    }

    private static int convertStreamPriority(int priority) {
        if (priority == 0) {
            return 1;
        }
        if (priority == 1) {
            return 2;
        }
        if (priority == 2) {
            return 3;
        }
        if (priority == 3) {
            return 4;
        }
        if (priority == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Invalid stream priority.");
    }

    private void postTaskToExecutor(final Runnable task, final String name) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#postTaskToExecutor " + name);
        try {
            try {
                this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CronetBidirectionalStream.lambda$postTaskToExecutor$3(name, task);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                synchronized (this.mNativeStreamLock) {
                    this.mWriteState = 11;
                    this.mReadState = 11;
                    destroyNativeStreamLocked();
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ void lambda$postTaskToExecutor$3(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#postTaskToExecutor " + str + " running callback");
        try {
            runnable.run();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int httpStatusCode, String negotiatedProtocol, String[] headers, long receivedByteCount) {
        return new UrlResponseInfoImpl(Arrays.asList(this.mInitialUrl), httpStatusCode, "", headersListFromStrings(headers), false, negotiatedProtocol, null, receivedByteCount);
    }

    private void destroyNativeStreamLocked() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#destroyNativeStreamLocked");
        try {
            Log.i(CronetUrlRequestContext.LOG_TAG, "destroyNativeStreamLocked " + toString());
            if (this.mNativeStream == 0) {
                if (scoped != null) {
                    scoped.close();
                    return;
                }
                return;
            }
            CronetBidirectionalStreamJni.get().destroy(this.mNativeStream);
            if (this.mReadState != 0) {
                this.mRequestContext.onRequestDestroyed();
            }
            this.mNativeStream = 0L;
            Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failWithExceptionOnExecutor(CronetException e) {
        this.mException = e;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 6;
            this.mReadState = 6;
            this.mTerminalRunnable = new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CronetBidirectionalStream.this.lambda$failWithExceptionOnExecutor$4();
                }
            };
            destroyNativeStreamLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$failWithExceptionOnExecutor$4() {
        this.mCallback.onFailed(this, this.mResponseInfo, this.mException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNonfinalCallbackException(Exception e) {
        this.mNonfinalUserCallbackExceptionCount++;
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", e);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) e);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    private void failWithException(final CronetException exception) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.4
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.failWithExceptionOnExecutor(exception);
            }
        }, "failWithException");
    }

    private void onFinalCallbackException(String method, Exception e) {
        this.mFinalUserCallbackThrew = true;
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in " + method + " method", (Throwable) e);
    }
}
