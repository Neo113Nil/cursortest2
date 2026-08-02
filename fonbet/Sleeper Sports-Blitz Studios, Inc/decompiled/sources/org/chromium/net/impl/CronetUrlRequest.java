package org.chromium.net.impl;

import android.os.Build;
import android.os.Process;
import internal.org.jni_zero.JNINamespace;
import internal.org.jni_zero.NativeClassQualifiedName;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;

@JNINamespace("cronet")
/* loaded from: classes10.dex */
public final class CronetUrlRequest extends ExperimentalUrlRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    private final VersionSafeCallbacks.UrlRequestCallback mCallback;
    private final ByteBuffer mDictionary;
    private final String mDictionaryId;
    private final byte[] mDictionarySha256Hash;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private boolean mFinalUserCallbackThrew;
    private int mFinishedReason;
    private final int mIdempotency;
    private final String mInitialMethod;
    private final String mInitialUrl;
    private final CronetLogger mLogger;
    private CronetMetrics mMetrics;
    private final long mNetworkHandle;
    private int mNonfinalUserCallbackExceptionCount;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private int mReadCount;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedListener;
    private final List<Map.Entry<String, String>> mRequestHeaders;
    private UrlResponseInfoImpl mResponseInfo;
    private boolean mStarted;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final CronetUploadDataStream mUploadDataStream;
    private final List<String> mUrlChain;
    private long mUrlRequestAdapter;
    private final Object mUrlRequestAdapterLock = new Object();
    private boolean mWaitingOnRead;
    private boolean mWaitingOnRedirect;

    interface Natives {
        @NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean addRequestHeader(long nativePtr, String name, String value);

        long createRequestAdapter(CronetUrlRequest self, long urlRequestContextAdapter, String url, int priority, boolean disableCache, boolean disableConnectionMigration, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, int idempotency, byte[] dictionarySha256Hash, ByteBuffer dictionary, int dictionaryPosition, int dictionaryCapacity, String dictionaryId, long networkHandle);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        void destroy(long nativePtr, boolean sendOnCanceled);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        void followDeferredRedirect(long nativePtr);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        void getStatus(long nativePtr, VersionSafeCallbacks.UrlRequestStatusListener listener);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean readData(long nativePtr, ByteBuffer byteBuffer, int position, int capacity);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean setHttpMethod(long nativePtr, String method);

        @NativeClassQualifiedName("CronetURLRequestAdapter")
        void start(long nativePtr);
    }

    private static int convertIdempotency(int idempotency) {
        int i = 1;
        if (idempotency != 1) {
            i = 2;
            if (idempotency != 2) {
                return 0;
            }
        }
        return i;
    }

    private static int convertRequestPriority(int priority) {
        if (priority == 0) {
            return 1;
        }
        if (priority == 1) {
            return 2;
        }
        if (priority != 2) {
            return priority != 4 ? 4 : 5;
        }
        return 3;
    }

    private final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;

        private OnReadCompletedRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.checkCallingThread();
            ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.mWaitingOnRead = true;
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onReadCompleted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, byteBuffer);
                }
            } catch (Exception e) {
                CronetUrlRequest.this.onNonfinalCallbackException(e);
            }
        }
    }

    CronetUrlRequest(CronetUrlRequestContext requestContext, String url, int priority, UrlRequest.Callback callback, Executor executor, Collection<Object> requestAnnotations, boolean disableCache, boolean disableConnectionMigration, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, RequestFinishedInfo.Listener requestFinishedListener, int idempotency, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor, byte[] dictionarySha256Hash, ByteBuffer dictionary, String dictionaryId) {
        ArrayList arrayList = new ArrayList();
        this.mUrlChain = arrayList;
        Objects.requireNonNull(url, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(dictionaryId, "Dictionary ID is expect to be an empty string if not specified");
        this.mAllowDirectExecutor = allowDirectExecutor;
        this.mRequestContext = requestContext;
        this.mLogger = requestContext.getCronetLogger();
        this.mInitialUrl = url;
        arrayList.add(url);
        this.mPriority = convertRequestPriority(priority);
        this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
        this.mExecutor = executor;
        this.mRequestAnnotations = requestAnnotations;
        this.mDisableCache = disableCache;
        this.mDisableConnectionMigration = disableConnectionMigration;
        this.mTrafficStatsTagSet = trafficStatsTagSet;
        this.mTrafficStatsTag = trafficStatsTag;
        this.mTrafficStatsUidSet = trafficStatsUidSet;
        this.mTrafficStatsUid = trafficStatsUid;
        this.mRequestFinishedListener = requestFinishedListener != null ? new VersionSafeCallbacks.RequestFinishedInfoListener(requestFinishedListener) : null;
        this.mDictionarySha256Hash = dictionarySha256Hash;
        this.mDictionary = dictionary;
        this.mDictionaryId = dictionaryId;
        this.mIdempotency = convertIdempotency(idempotency);
        this.mNetworkHandle = networkHandle;
        this.mInitialMethod = method;
        this.mRequestHeaders = Collections.unmodifiableList(new ArrayList(requestHeaders));
        this.mUploadDataStream = uploadDataProvider != null ? new CronetUploadDataStream(uploadDataProvider, uploadDataProviderExecutor, this) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        if (r23 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        r23.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0116, code lost:
    
        if (r23 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0118, code lost:
    
        r23.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    @Override // org.chromium.net.UrlRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void start() {
        ScopedSysTraceEvent scopedSysTraceEvent;
        int i;
        Natives natives;
        long urlRequestContextAdapter;
        String str;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        int i5;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#start");
        try {
            try {
                synchronized (this.mUrlRequestAdapterLock) {
                    try {
                        checkNotStarted();
                        try {
                            natives = CronetUrlRequestJni.get();
                            urlRequestContextAdapter = this.mRequestContext.getUrlRequestContextAdapter();
                            try {
                                str = this.mInitialUrl;
                                try {
                                    i2 = this.mPriority;
                                    try {
                                        z = this.mDisableCache;
                                        try {
                                            z2 = this.mDisableConnectionMigration;
                                            try {
                                                z3 = this.mTrafficStatsTagSet;
                                                try {
                                                    i3 = this.mTrafficStatsTag;
                                                    try {
                                                        z4 = this.mTrafficStatsUidSet;
                                                        try {
                                                            i4 = this.mTrafficStatsUid;
                                                            try {
                                                                i5 = this.mIdempotency;
                                                                scopedSysTraceEvent = scoped;
                                                            } catch (RuntimeException e) {
                                                                e = e;
                                                            }
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                            i = 1;
                                                        }
                                                    } catch (RuntimeException e3) {
                                                        e = e3;
                                                        i = 1;
                                                    }
                                                } catch (RuntimeException e4) {
                                                    e = e4;
                                                    i = 1;
                                                }
                                            } catch (RuntimeException e5) {
                                                e = e5;
                                                i = 1;
                                            }
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            i = 1;
                                        }
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                        i = 1;
                                    }
                                } catch (RuntimeException e8) {
                                    e = e8;
                                    i = 1;
                                }
                            } catch (RuntimeException e9) {
                                e = e9;
                                i = 1;
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            i = 1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        scopedSysTraceEvent = scoped;
                    }
                    try {
                        byte[] bArr = this.mDictionarySha256Hash;
                        ByteBuffer byteBuffer = this.mDictionary;
                        int position = byteBuffer != null ? byteBuffer.position() : 0;
                        ByteBuffer byteBuffer2 = this.mDictionary;
                        int limit = byteBuffer2 != null ? byteBuffer2.limit() : 0;
                        try {
                            i = 1;
                        } catch (RuntimeException e11) {
                            e = e11;
                            i = 1;
                            destroyRequestAdapterLocked(i);
                            this.mRequestContext.onRequestFinished();
                            throw e;
                        }
                        try {
                            this.mUrlRequestAdapter = natives.createRequestAdapter(this, urlRequestContextAdapter, str, i2, z, z2, z3, i3, z4, i4, i5, bArr, byteBuffer, position, limit, this.mDictionaryId, this.mNetworkHandle);
                            this.mRequestContext.onRequestStarted();
                            if (!CronetUrlRequestJni.get().setHttpMethod(this.mUrlRequestAdapter, this.mInitialMethod)) {
                                throw new IllegalArgumentException("Invalid http method " + this.mInitialMethod);
                            }
                            boolean z5 = false;
                            for (Map.Entry<String, String> entry : this.mRequestHeaders) {
                                if (entry.getKey().equalsIgnoreCase("Content-Type") && !entry.getValue().isEmpty()) {
                                    z5 = true;
                                }
                                if (!CronetUrlRequestJni.get().addRequestHeader(this.mUrlRequestAdapter, entry.getKey(), entry.getValue())) {
                                    throw new IllegalArgumentException("Invalid header with headername: " + entry.getKey());
                                }
                            }
                            CronetUploadDataStream cronetUploadDataStream = this.mUploadDataStream;
                            if (cronetUploadDataStream != null) {
                                if (!z5) {
                                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                }
                                this.mStarted = true;
                                cronetUploadDataStream.postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        CronetUrlRequest.this.mUploadDataStream.initializeWithRequest();
                                        synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                                            if (CronetUrlRequest.this.isDoneLocked()) {
                                                return;
                                            }
                                            CronetUrlRequest.this.mUploadDataStream.attachNativeAdapterToRequest(CronetUrlRequest.this.mUrlRequestAdapter);
                                            CronetUrlRequest.this.startInternalLocked();
                                        }
                                    }
                                }, "CronetUrlRequest#start");
                            } else {
                                this.mStarted = true;
                                startInternalLocked();
                            }
                        } catch (RuntimeException e12) {
                            e = e12;
                            destroyRequestAdapterLocked(i);
                            this.mRequestContext.onRequestFinished();
                            throw e;
                        }
                    } catch (RuntimeException e13) {
                        e = e13;
                        i = 1;
                        destroyRequestAdapterLocked(i);
                        this.mRequestContext.onRequestFinished();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                if (scopedSysTraceEvent == null) {
                    throw th5;
                }
                try {
                    scopedSysTraceEvent.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            scopedSysTraceEvent = scoped;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternalLocked() {
        CronetUrlRequestJni.get().start(this.mUrlRequestAdapter);
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#followRedirect");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                if (!this.mWaitingOnRedirect) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.mWaitingOnRedirect = false;
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    CronetUrlRequestJni.get().followDeferredRedirect(this.mUrlRequestAdapter);
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

    @Override // org.chromium.net.UrlRequest
    public void read(ByteBuffer buffer) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#read");
        try {
            Preconditions.checkHasRemaining(buffer);
            Preconditions.checkDirect(buffer);
            synchronized (this.mUrlRequestAdapterLock) {
                if (!this.mWaitingOnRead) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                this.mWaitingOnRead = false;
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    if (!CronetUrlRequestJni.get().readData(this.mUrlRequestAdapter, buffer, buffer.position(), buffer.limit())) {
                        this.mWaitingOnRead = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    this.mReadCount++;
                    if (scoped != null) {
                        scoped.close();
                    }
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

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#cancel");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                if (!isDoneLocked() && this.mStarted) {
                    destroyRequestAdapterLocked(2);
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

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mStarted && this.mUrlRequestAdapter == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener unsafeListener) {
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(unsafeListener);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                CronetUrlRequestJni.get().getStatus(this.mUrlRequestAdapter, urlRequestStatusListener);
            } else {
                postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.2
                    final /* synthetic */ CronetUrlRequest this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#getStatus running callback");
                        try {
                            urlRequestStatusListener.onStatus(-1);
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
                }, "getStatus");
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable onDestroyedCallbackForTesting) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = onDestroyedCallbackForTesting;
        }
    }

    public void setOnDestroyedUploadCallbackForTesting(Runnable onDestroyedUploadCallbackForTesting) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(onDestroyedUploadCallbackForTesting);
    }

    public long getUrlRequestAdapterForTesting() {
        long j;
        synchronized (this.mUrlRequestAdapterLock) {
            j = this.mUrlRequestAdapter;
        }
        return j;
    }

    private void postTaskToExecutor(final Runnable task, final String name) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#postTaskToExecutor " + name);
        try {
            try {
                this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CronetUrlRequest.lambda$postTaskToExecutor$0(name, task);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
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

    static /* synthetic */ void lambda$postTaskToExecutor$0(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#postTaskToExecutor " + str + " running callback");
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

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int httpStatusCode, String httpStatusText, String[] headers, boolean wasCached, String negotiatedProtocol, String proxyServer, long receivedByteCount) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(headers[i], headers[i + 1]));
        }
        return new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), httpStatusCode, httpStatusText, arrayList, wasCached, negotiatedProtocol, proxyServer, receivedByteCount);
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mStarted || isDoneLocked()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    public CronetMetrics getFinishedRequestTimings() {
        return this.mMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRequestAdapterLocked(int finishedReason) {
        this.mFinishedReason = finishedReason;
        if (this.mUrlRequestAdapter == 0) {
            return;
        }
        this.mRequestContext.onRequestDestroyed();
        CronetUrlRequestJni.get().destroy(this.mUrlRequestAdapter, finishedReason == 2);
        this.mUrlRequestAdapter = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNonfinalCallbackException(Exception e) {
        this.mNonfinalUserCallbackExceptionCount++;
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", e);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) e);
        failWithException(callbackExceptionImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinalCallbackException(String method, Exception e) {
        this.mFinalUserCallbackThrew = true;
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in " + method + " method", (Throwable) e);
    }

    void onUploadException(Throwable e) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UploadDataProvider", e);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", e);
        failWithException(callbackExceptionImpl);
    }

    private void failWithException(final CronetException exception) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mException = exception;
            destroyRequestAdapterLocked(1);
        }
    }

    private void onRedirectReceived(final String newLocation, int httpStatusCode, String httpStatusText, String[] headers, boolean wasCached, String negotiatedProtocol, String proxyServer, long receivedByteCount) {
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(httpStatusCode, httpStatusText, headers, wasCached, negotiatedProtocol, proxyServer, receivedByteCount);
        this.mUrlChain.add(newLocation);
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.3
            final /* synthetic */ CronetUrlRequest this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.checkCallingThread();
                synchronized (this.this$0.mUrlRequestAdapterLock) {
                    if (this.this$0.isDoneLocked()) {
                        return;
                    }
                    this.this$0.mWaitingOnRedirect = true;
                    try {
                        this.this$0.mCallback.onRedirectReceived(this.this$0, prepareResponseInfoOnNetworkThread, newLocation);
                    } catch (Exception e) {
                        this.this$0.onNonfinalCallbackException(e);
                    }
                }
            }
        }, "onRedirectReceived");
    }

    private void onResponseStarted(int httpStatusCode, String httpStatusText, String[] headers, boolean wasCached, String negotiatedProtocol, String proxyServer, long receivedByteCount) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(httpStatusCode, httpStatusText, headers, wasCached, negotiatedProtocol, proxyServer, receivedByteCount);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.4
            @Override // java.lang.Runnable
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.mWaitingOnRead = true;
                    try {
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onResponseStarted(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    } catch (Exception e) {
                        CronetUrlRequest.this.onNonfinalCallbackException(e);
                    }
                }
            }
        }, "onResponseStarted");
    }

    private void onReadCompleted(final ByteBuffer byteBuffer, int bytesRead, int initialPosition, int initialLimit, long receivedByteCount) {
        this.mResponseInfo.setReceivedByteCount(receivedByteCount);
        if (byteBuffer.position() != initialPosition || byteBuffer.limit() != initialLimit) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.mOnReadCompletedTask == null) {
            this.mOnReadCompletedTask = new OnReadCompletedRunnable();
        }
        this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
        postTaskToExecutor(this.mOnReadCompletedTask, "onReadCompleted");
    }

    private void onSucceeded(long receivedByteCount) {
        this.mResponseInfo.setReceivedByteCount(receivedByteCount);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.destroyRequestAdapterLocked(0);
                    try {
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onSucceeded(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    } catch (Exception e) {
                        CronetUrlRequest.this.onFinalCallbackException("onSucceeded", e);
                    }
                    CronetUrlRequest.this.maybeReportMetrics();
                }
            }
        }, "onSucceeded");
    }

    private void onError(int errorCode, int nativeError, int nativeQuicError, int source, String errorString, long receivedByteCount) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(receivedByteCount);
        }
        if (errorCode == 10 || nativeQuicError != 0) {
            failWithException(new QuicExceptionImpl("Exception in CronetUrlRequest: " + errorString, errorCode, nativeError, nativeQuicError, source));
        } else {
            failWithException(new NetworkExceptionImpl("Exception in CronetUrlRequest: " + errorString, mapUrlRequestErrorToApiErrorCode(errorCode), nativeError));
        }
    }

    private void onCanceled() {
        if (this.mMetrics == null) {
            this.mMetrics = CronetMetrics.empty();
        }
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onCanceled(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                } catch (Exception e) {
                    CronetUrlRequest.this.onFinalCallbackException("onCanceled", e);
                }
                CronetUrlRequest.this.maybeReportMetrics();
            }
        }, "onCanceled");
    }

    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener listener, final int loadState) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.7
            final /* synthetic */ CronetUrlRequest this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                listener.onStatus(UrlRequestUtil.convertLoadState(loadState));
            }
        }, "onStatus");
    }

    private void onMetricsCollected(long requestStartMs, long dnsStartMs, long dnsEndMs, long connectStartMs, long connectEndMs, long sslStartMs, long sslEndMs, long sendingStartMs, long sendingEndMs, long pushStartMs, long pushEndMs, long responseStartMs, long requestEndMs, boolean socketReused, long sentByteCount, long receivedByteCount, boolean quicConnectionMigrationAttempted, boolean quicConnectionMigrationSuccessful) {
        if (this.mMetrics != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.mMetrics = new CronetMetrics(requestStartMs, dnsStartMs, dnsEndMs, connectStartMs, connectEndMs, sslStartMs, sslEndMs, sendingStartMs, sendingEndMs, pushStartMs, pushEndMs, responseStartMs, requestEndMs, socketReused, sentByteCount, receivedByteCount);
        this.mQuicConnectionMigrationAttempted = quicConnectionMigrationAttempted;
        this.mQuicConnectionMigrationSuccessful = quicConnectionMigrationSuccessful;
    }

    private void onNativeAdapterDestroyed() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                Runnable runnable = this.mOnDestroyedCallbackForTesting;
                if (runnable != null) {
                    runnable.run();
                }
                if (this.mException == null) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (this.mMetrics == null) {
                    this.mMetrics = CronetMetrics.empty();
                }
                Runnable runnable2 = new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed running callback");
                        try {
                            try {
                                VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                urlRequestCallback.onFailed(cronetUrlRequest, cronetUrlRequest.mResponseInfo, CronetUrlRequest.this.mException);
                            } catch (Exception e) {
                                CronetUrlRequest.this.onFinalCallbackException("onFailed", e);
                            }
                            CronetUrlRequest.this.maybeReportMetrics();
                            if (scoped2 != null) {
                                scoped2.close();
                            }
                        } catch (Throwable th) {
                            if (scoped2 != null) {
                                try {
                                    scoped2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                };
                ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback");
                try {
                    try {
                        this.mExecutor.execute(runnable2);
                    } catch (RejectedExecutionException e) {
                        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                    }
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                } finally {
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

    void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(Thread.currentThread())) {
            throw new InlineExecutionProhibitedException();
        }
    }

    private int mapUrlRequestErrorToApiErrorCode(int errorCode) {
        switch (errorCode) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                Log.e(CronetUrlRequestContext.LOG_TAG, "Unknown error code: " + errorCode);
                return errorCode;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo() {
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
                i2 = quicExceptionImpl.getCronetInternalErrorCode();
                quicDetailedErrorCode = quicExceptionImpl.getQuicDetailedErrorCode();
                connectionCloseSource = quicExceptionImpl.getConnectionCloseSource();
                requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
                long j = max;
                boolean z2 = this.mQuicConnectionMigrationAttempted;
                boolean z3 = this.mQuicConnectionMigrationSuccessful;
                Duration duration = ofSeconds;
                CronetLogger.CronetTrafficInfo.RequestTerminalState finishedReasonToCronetTrafficInfoRequestTerminalState = CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(this.mFinishedReason);
                int i3 = this.mNonfinalUserCallbackExceptionCount;
                int i4 = this.mReadCount;
                CronetUploadDataStream cronetUploadDataStream = this.mUploadDataStream;
                return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, j, estimateHeadersSizeInBytes2, max2, i, duration, ofSeconds2, str2, z2, z3, finishedReasonToCronetTrafficInfoRequestTerminalState, i3, i4, cronetUploadDataStream != null ? 0 : cronetUploadDataStream.getReadCount(), false, this.mFinalUserCallbackThrew, Process.myUid(), i2, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource(), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getDnsStart(), this.mMetrics.getDnsEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getSslStart(), this.mMetrics.getSslEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getConnectStart(), this.mMetrics.getConnectEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getRequestStart(), this.mMetrics.getSendingStart(), -1L));
            }
            if (cronetException != null) {
                requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER;
            }
            requestFailureReason = requestFailureReason2;
            i2 = 0;
        }
        quicDetailedErrorCode = 0;
        connectionCloseSource = 0;
        long j2 = max;
        boolean z22 = this.mQuicConnectionMigrationAttempted;
        boolean z32 = this.mQuicConnectionMigrationSuccessful;
        Duration duration2 = ofSeconds;
        CronetLogger.CronetTrafficInfo.RequestTerminalState finishedReasonToCronetTrafficInfoRequestTerminalState2 = CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(this.mFinishedReason);
        int i32 = this.mNonfinalUserCallbackExceptionCount;
        int i42 = this.mReadCount;
        CronetUploadDataStream cronetUploadDataStream2 = this.mUploadDataStream;
        return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, j2, estimateHeadersSizeInBytes2, max2, i, duration2, ofSeconds2, str2, z22, z32, finishedReasonToCronetTrafficInfoRequestTerminalState2, i32, i42, cronetUploadDataStream2 != null ? 0 : cronetUploadDataStream2.getReadCount(), false, this.mFinalUserCallbackThrew, Process.myUid(), i2, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource(), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getDnsStart(), this.mMetrics.getDnsEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getSslStart(), this.mMetrics.getSslEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getConnectStart(), this.mMetrics.getConnectEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getRequestStart(), this.mMetrics.getSendingStart(), -1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportMetrics() {
        RefCountDelegate refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CronetUrlRequest.this.lambda$maybeReportMetrics$1();
            }
        });
        try {
            if (this.mMetrics == null) {
                throw new IllegalStateException("The metrics should have been initialized.");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.mLogger.logCronetTrafficInfo(this.mRequestContext.getLogId(), buildCronetTrafficInfo());
                } catch (RuntimeException e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Error while trying to log CronetTrafficInfo: ", (Throwable) e);
                }
            }
            this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException), refCountDelegate, this.mRequestFinishedListener);
        } finally {
            refCountDelegate.decrement();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportMetrics$1() {
        this.mRequestContext.onRequestFinished();
    }
}
