package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.SystemClock;
import internal.org.jni_zero.JNINamespace;
import internal.org.jni_zero.NativeClassQualifiedName;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ObserverList;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetEngineBuilderImpl;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.net.impl.proto.RequestContextConfigOptions;
import org.chromium.net.urlconnection.CronetHttpURLConnection;
import org.chromium.net.urlconnection.CronetURLStreamHandlerFactory;

@JNINamespace("cronet")
/* loaded from: classes10.dex */
public class CronetUrlRequestContext extends CronetEngineBase {
    public static final String ALWAYS_ENABLE_BROTLI_FLAG_NAME = "Cronet_always_enable_brotli";
    static final String LOG_TAG = "CronetUrlRequestContext";
    public static final String OVERRIDE_NETWORK_THREAD_PRIORITY_FLAG_NAME = "Cronet_override_network_thread_priority";
    private static final HashSet<String> sInUseStoragePaths = new HashSet<>();
    private final AtomicInteger mActiveRequestCount;
    private int mDownstreamThroughputKbps;
    private int mEffectiveConnectionType;
    private final Object mFinishedListenerLock;
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap;
    private int mHttpRttMs;
    private final String mInUseStoragePath;
    private final ConditionVariable mInitCompleted;
    private boolean mIsLogging;
    private boolean mIsStoppingNetLog;
    private final Object mLock;
    private final long mLogId;
    private final CronetLogger mLogger;
    private long mNetworkHandle;
    private final boolean mNetworkQualityEstimatorEnabled;
    private final Object mNetworkQualityLock;
    private Thread mNetworkThread;
    private List<VersionSafeProxyCallback> mProxyCallbacks;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> mRttListenerList;
    private final AtomicInteger mRunningRequestCount;
    private final ConditionVariable mStopNetLogCompleted;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> mThroughputListenerList;
    private int mTransportRttMs;
    private long mUrlRequestContextAdapter;

    interface Natives {
        void addPkp(long urlRequestContextConfig, String host, byte[][] hashes, boolean includeSubdomains, long expirationTime);

        void addQuicHint(long urlRequestContextConfig, String host, int port, int alternatePort);

        @NativeClassQualifiedName("CronetContextAdapter")
        void configureNetworkQualityEstimatorForTesting(long nativePtr, boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck);

        long createRequestContextAdapter(long urlRequestContextConfig);

        long createRequestContextConfig(byte[] serializedRequestContextConfigOptions);

        @NativeClassQualifiedName("CronetContextAdapter")
        void destroy(long nativePtr);

        @NativeClassQualifiedName("CronetContextAdapter")
        void flushWritePropertiesForTesting(long nativePtr);

        @NativeClassQualifiedName("CronetContextAdapter")
        void initRequestContextOnInitThread(long nativePtr, CronetUrlRequestContext self);

        @NativeClassQualifiedName("CronetContextAdapter")
        void provideRTTObservations(long nativePtr, boolean should);

        @NativeClassQualifiedName("CronetContextAdapter")
        void provideThroughputObservations(long nativePtr, boolean should);

        @NativeClassQualifiedName("CronetContextAdapter")
        void startNetLogToDisk(long nativePtr, String dirPath, boolean logAll, int maxSize);

        @NativeClassQualifiedName("CronetContextAdapter")
        boolean startNetLogToFile(long nativePtr, String fileName, boolean logAll);

        @NativeClassQualifiedName("CronetContextAdapter")
        void stopNetLog(long nativePtr);
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String url, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(url, callback, executor);
    }

    long getLogId() {
        return this.mLogId;
    }

    CronetLogger getCronetLogger() {
        return this.mLogger;
    }

    private static final class CronetInitializedInfoLogger {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final CronetLogger.CronetInitializedInfo mCronetInitializedInfo;
        private final CronetLogger mCronetLogger;
        private final long mStartUptimeMillis;

        public CronetInitializedInfoLogger(CronetLogger cronetLogger, long cronetInitializationRef, long startUptimeMillis) {
            CronetLogger.CronetInitializedInfo cronetInitializedInfo = new CronetLogger.CronetInitializedInfo();
            this.mCronetInitializedInfo = cronetInitializedInfo;
            this.mCronetLogger = cronetLogger;
            cronetInitializedInfo.cronetInitializationRef = cronetInitializationRef;
            cronetInitializedInfo.source = NativeCronetEngineBuilderImpl.getCronetSource();
            cronetInitializedInfo.cronetImplVersion = ImplVersion.getCronetVersion();
            this.mStartUptimeMillis = startUptimeMillis;
        }

        public void onUserThreadDone() {
            int elapsedTime = getElapsedTime();
            synchronized (this.mCronetInitializedInfo) {
                this.mCronetInitializedInfo.engineCreationLatencyMillis = elapsedTime;
                maybeLog();
            }
        }

        public void onInitThreadDone() {
            int elapsedTime = getElapsedTime();
            synchronized (this.mCronetInitializedInfo) {
                this.mCronetInitializedInfo.engineAsyncLatencyMillis = elapsedTime;
                maybeLog();
            }
        }

        private void maybeLog() {
            if (this.mCronetInitializedInfo.engineCreationLatencyMillis < 0 || this.mCronetInitializedInfo.engineAsyncLatencyMillis < 0) {
                return;
            }
            this.mCronetLogger.logCronetInitializedInfo(this.mCronetInitializedInfo);
        }

        private int getElapsedTime() {
            return (int) (SystemClock.uptimeMillis() - this.mStartUptimeMillis);
        }
    }

    public CronetUrlRequestContext(final CronetEngineBuilderImpl builder, long startUptimeMillis) {
        Object obj = new Object();
        this.mLock = obj;
        this.mInitCompleted = new ConditionVariable(false);
        this.mRunningRequestCount = new AtomicInteger(0);
        this.mActiveRequestCount = new AtomicInteger(0);
        this.mNetworkQualityLock = new Object();
        this.mFinishedListenerLock = new Object();
        this.mEffectiveConnectionType = 0;
        this.mHttpRttMs = -1;
        this.mTransportRttMs = -1;
        this.mDownstreamThroughputKbps = -1;
        ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> observerList = new ObserverList<>();
        this.mRttListenerList = observerList;
        ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> observerList2 = new ObserverList<>();
        this.mThroughputListenerList = observerList2;
        this.mFinishedListenerMap = new HashMap();
        this.mStopNetLogCompleted = new ConditionVariable();
        this.mNetworkHandle = -1L;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext");
        try {
            observerList.disableThreadAsserts();
            observerList2.disableThreadAsserts();
            this.mNetworkQualityEstimatorEnabled = builder.networkQualityEstimatorEnabled();
            boolean ensureInitialized = CronetLibraryLoader.ensureInitialized(builder.getContext(), builder);
            if (builder.httpCacheMode() == 1) {
                String storagePath = builder.storagePath();
                this.mInUseStoragePath = storagePath;
                HashSet<String> hashSet = sInUseStoragePaths;
                synchronized (hashSet) {
                    try {
                        if (!hashSet.add(storagePath)) {
                            throw new IllegalStateException("Disk cache storage path already in use");
                        }
                    } finally {
                    }
                }
            } else {
                this.mInUseStoragePath = null;
            }
            if (builder.getProxyOptions() != null) {
                this.mProxyCallbacks = builder.getProxyOptions().createProxyCallbackList();
            }
            synchronized (obj) {
                scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
                try {
                    this.mUrlRequestContextAdapter = CronetUrlRequestContextJni.get().createRequestContextAdapter(createNativeUrlRequestContextConfig(builder));
                    if (scoped != null) {
                        scoped.close();
                    }
                    if (this.mUrlRequestContextAdapter == 0) {
                        throw new NullPointerException("Context Adapter creation failed.");
                    }
                } finally {
                }
            }
            CronetLogger.CronetSource cronetSource = NativeCronetEngineBuilderImpl.getCronetSource();
            CronetLogger createLogger = CronetLoggerFactory.createLogger(builder.getContext(), cronetSource);
            this.mLogger = createLogger;
            this.mLogId = createLogger.generateId();
            CronetLogger.CronetEngineBuilderInfo loggerInfo = builder.toLoggerInfo();
            try {
                createLogger.logCronetEngineCreation(getLogId(), loggerInfo, buildCronetVersion(), cronetSource);
            } catch (RuntimeException e) {
                Log.i(LOG_TAG, "Error while trying to log CronetEngine creation: ", (Throwable) e);
            }
            final CronetInitializedInfoLogger cronetInitializedInfoLogger = ensureInitialized ? new CronetInitializedInfoLogger(this.mLogger, loggerInfo.getCronetInitializationRef(), startUptimeMillis) : null;
            CronetLibraryLoader.postToInitThread(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.1
                final /* synthetic */ CronetUrlRequestContext this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this.this$0.mLock) {
                        ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
                        try {
                            CronetUrlRequestContextJni.get().initRequestContextOnInitThread(this.this$0.mUrlRequestContextAdapter, this.this$0);
                            if (scoped2 != null) {
                                scoped2.close();
                            }
                        } finally {
                        }
                    }
                    CronetInitializedInfoLogger cronetInitializedInfoLogger2 = cronetInitializedInfoLogger;
                    if (cronetInitializedInfoLogger2 != null) {
                        cronetInitializedInfoLogger2.onInitThreadDone();
                    }
                }
            });
            if (cronetInitializedInfoLogger != null) {
                cronetInitializedInfoLogger.onUserThreadDone();
            }
            if (scoped != null) {
                scoped.close();
            }
        } finally {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public static long createNativeUrlRequestContextConfig(CronetEngineBuilderImpl builder) {
        long createRequestContextConfig = CronetUrlRequestContextJni.get().createRequestContextConfig(createRequestContextConfigOptions(builder).toByteArray());
        if (createRequestContextConfig == 0) {
            throw new IllegalArgumentException("Experimental options parsing failed.");
        }
        for (CronetEngineBuilderImpl.QuicHint quicHint : builder.quicHints()) {
            CronetUrlRequestContextJni.get().addQuicHint(createRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (CronetEngineBuilderImpl.Pkp pkp : builder.publicKeyPins()) {
            CronetUrlRequestContextJni.get().addPkp(createRequestContextConfig, pkp.mHost, pkp.mHashes, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        return createRequestContextConfig;
    }

    private static RequestContextConfigOptions createRequestContextConfigOptions(CronetEngineBuilderImpl engineBuilder) {
        Map<String, ResolvedFlags.Value> flags = HttpFlagsForImpl.getHttpFlags(ContextUtils.getApplicationContext(), NativeCronetEngineBuilderImpl.getCronetSource()).flags();
        ResolvedFlags.Value value = flags.get(OVERRIDE_NETWORK_THREAD_PRIORITY_FLAG_NAME);
        ResolvedFlags.Value value2 = flags.get(ALWAYS_ENABLE_BROTLI_FLAG_NAME);
        RequestContextConfigOptions.Builder networkThreadPriority = RequestContextConfigOptions.newBuilder().setQuicEnabled(engineBuilder.quicEnabled()).setHttp2Enabled(engineBuilder.http2Enabled()).setBrotliEnabled((value2 != null ? value2.getBoolValue() : false) || engineBuilder.brotliEnabled()).setDisableCache(engineBuilder.cacheDisabled()).setHttpCacheMode(engineBuilder.httpCacheMode()).setHttpCacheMaxSize(engineBuilder.httpCacheMaxSize()).setMockCertVerifier(engineBuilder.mockCertVerifier()).setEnableNetworkQualityEstimator(engineBuilder.networkQualityEstimatorEnabled()).setBypassPublicKeyPinningForLocalTrustAnchors(engineBuilder.publicKeyPinningBypassForLocalTrustAnchorsEnabled()).setNetworkThreadPriority(value != null ? (int) value.getIntValue() : 0);
        if (engineBuilder.getProxyOptions() != null) {
            networkThreadPriority.setProxyOptions(engineBuilder.getProxyOptions().createProxyOptionsProto());
        }
        if (engineBuilder.getUserAgent() != null) {
            networkThreadPriority.setUserAgent(engineBuilder.getUserAgent());
        }
        if (engineBuilder.storagePath() != null) {
            networkThreadPriority.setStoragePath(engineBuilder.storagePath());
        }
        if (engineBuilder.getDefaultQuicUserAgentId() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(engineBuilder.getDefaultQuicUserAgentId());
        }
        if (engineBuilder.experimentalOptions() != null) {
            networkThreadPriority.setExperimentalOptions(engineBuilder.experimentalOptions());
        }
        return networkThreadPriority.build();
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String url, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(url, callback, executor, this);
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalUrlRequest createRequest(String url, UrlRequest.Callback callback, Executor executor, int priority, Collection<Object> requestAnnotations, boolean disableCache, boolean disableConnectionMigration, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, RequestFinishedInfo.Listener requestFinishedListener, int idempotency, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor, byte[] sharedDictionaryHash, ByteBuffer sharedDictionary, String sharedDictionaryId) {
        long j = networkHandle == -1 ? this.mNetworkHandle : networkHandle;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetUrlRequest(this, url, priority, callback, executor, requestAnnotations, disableCache, disableConnectionMigration, allowDirectExecutor, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, requestFinishedListener, idempotency, j, method, requestHeaders, uploadDataProvider, uploadDataProviderExecutor, sharedDictionaryHash, sharedDictionary, sharedDictionaryId);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    protected ExperimentalBidirectionalStream createBidirectionalStream(String url, BidirectionalStream.Callback callback, Executor executor, String httpMethod, List<Map.Entry<String, String>> requestHeaders, int priority, boolean delayRequestHeadersUntilFirstFlush, Collection<Object> requestAnnotations, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        long j = networkHandle == -1 ? this.mNetworkHandle : networkHandle;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetBidirectionalStream(this, url, priority, callback, executor, httpMethod, requestHeaders, delayRequestHeadersUntilFirstFlush, requestAnnotations, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, j);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        return "Cronet/" + ImplVersion.getCronetVersionWithLastChange();
    }

    @Override // org.chromium.net.CronetEngine
    public int getActiveRequestCount() {
        return this.mActiveRequestCount.get();
    }

    private CronetLogger.CronetVersion buildCronetVersion() {
        return new CronetLogger.CronetVersion(getVersionString().split("/")[1].split("@")[0]);
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#shutdown");
        try {
            if (this.mInUseStoragePath != null) {
                HashSet<String> hashSet = sInUseStoragePaths;
                synchronized (hashSet) {
                    hashSet.remove(this.mInUseStoragePath);
                }
            }
            synchronized (this.mLock) {
                checkHaveAdapter();
                if (this.mRunningRequestCount.get() != 0) {
                    throw new IllegalStateException("Cannot shutdown with running requests.");
                }
                if (Thread.currentThread() == this.mNetworkThread) {
                    throw new IllegalThreadStateException("Cannot shutdown from network thread.");
                }
            }
            this.mInitCompleted.block();
            stopNetLog();
            synchronized (this.mLock) {
                if (!haveRequestContextAdapter()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    CronetUrlRequestContextJni.get().destroy(this.mUrlRequestContextAdapter);
                    this.mUrlRequestContextAdapter = 0L;
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

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String fileName, boolean logAll) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            if (!CronetUrlRequestContextJni.get().startNetLogToFile(this.mUrlRequestContextAdapter, fileName, logAll)) {
                throw new RuntimeException("Unable to start NetLog");
            }
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToDisk(String dirPath, boolean logAll, int maxSize) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            CronetUrlRequestContextJni.get().startNetLogToDisk(this.mUrlRequestContextAdapter, dirPath, logAll, maxSize);
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging && !this.mIsStoppingNetLog) {
                CronetUrlRequestContextJni.get().stopNetLog(this.mUrlRequestContextAdapter);
                this.mIsStoppingNetLog = true;
                this.mStopNetLogCompleted.block();
                this.mStopNetLogCompleted.close();
                synchronized (this.mLock) {
                    this.mIsStoppingNetLog = false;
                    this.mIsLogging = false;
                }
            }
        }
    }

    public void flushWritePropertiesForTesting() {
        synchronized (this.mLock) {
            CronetUrlRequestContextJni.get().flushWritePropertiesForTesting(this.mUrlRequestContextAdapter);
        }
    }

    public void stopNetLogCompleted() {
        this.mStopNetLogCompleted.open();
    }

    private void onBeforeTunnelRequest(int chainId, final ProxyCallbackRequestImpl request) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onBeforeTunnelRequest");
        try {
            final VersionSafeProxyCallback versionSafeProxyCallback = this.mProxyCallbacks.get(chainId);
            postTaskToExecutor(versionSafeProxyCallback.getExecutor(), new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VersionSafeProxyCallback.this.onBeforeTunnelRequest(request);
                }
            }, "onBeforeTunnelRequest");
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

    private void onTunnelHeadersReceived(int chainId, String[] headers, final int statusCode, final CompletionOnceCallback callback) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onTunnelHeadersReceived");
        try {
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < headers.length; i += 2) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(headers[i], headers[i + 1]));
            }
            final VersionSafeProxyCallback versionSafeProxyCallback = this.mProxyCallbacks.get(chainId);
            postTaskToExecutor(versionSafeProxyCallback.getExecutor(), new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CronetUrlRequestContext.lambda$onTunnelHeadersReceived$1(CompletionOnceCallback.this, versionSafeProxyCallback, arrayList, statusCode);
                }
            }, "onTunnelHeadersReceived");
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

    static /* synthetic */ void lambda$onTunnelHeadersReceived$1(CompletionOnceCallback completionOnceCallback, VersionSafeProxyCallback versionSafeProxyCallback, ArrayList arrayList, int i) {
        try {
            try {
                int i2 = versionSafeProxyCallback.onTunnelHeadersReceived(Collections.unmodifiableList(arrayList), i) ? 0 : -100;
                if (completionOnceCallback != null) {
                    completionOnceCallback.close();
                }
            } finally {
                completionOnceCallback.run(-100);
            }
        } catch (Throwable th) {
            if (completionOnceCallback != null) {
                try {
                    completionOnceCallback.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public int getEffectiveConnectionType() {
        int convertConnectionTypeToApiValue;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            convertConnectionTypeToApiValue = convertConnectionTypeToApiValue(this.mEffectiveConnectionType);
        }
        return convertConnectionTypeToApiValue;
    }

    @Override // org.chromium.net.CronetEngine
    public int getHttpRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mHttpRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public int getTransportRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mTransportRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public int getDownstreamThroughputKbps() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mDownstreamThroughputKbps;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long networkHandle) {
        this.mNetworkHandle = networkHandle;
    }

    @Override // org.chromium.net.CronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            CronetUrlRequestContextJni.get().configureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, useLocalHostRequests, useSmallerResponses, disableOfflineCheck);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRttListener(NetworkQualityRttListener listener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, true);
                }
            }
            this.mRttListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRttListener(NetworkQualityRttListener listener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(listener)) && this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener listener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, true);
                }
            }
            this.mThroughputListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener listener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(listener)) && this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new CronetHttpURLConnection(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new CronetURLStreamHandlerFactory(this);
    }

    void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
        this.mRunningRequestCount.incrementAndGet();
    }

    void onRequestDestroyed() {
        this.mRunningRequestCount.decrementAndGet();
    }

    void onRequestFinished() {
        this.mActiveRequestCount.decrementAndGet();
    }

    public long getUrlRequestContextAdapter() {
        long j;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j = this.mUrlRequestContextAdapter;
        }
        return j;
    }

    private void checkHaveAdapter() throws IllegalStateException {
        if (!haveRequestContextAdapter()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean haveRequestContextAdapter() {
        return this.mUrlRequestContextAdapter != 0;
    }

    private static int convertConnectionTypeToApiValue(int type) {
        if (type == 0) {
            return 0;
        }
        int i = 1;
        if (type != 1) {
            i = 2;
            if (type != 2) {
                i = 3;
                if (type != 3) {
                    i = 4;
                    if (type != 4) {
                        if (type == 5) {
                            return 5;
                        }
                        throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + type);
                    }
                }
            }
        }
        return i;
    }

    private void initNetworkThread() {
        this.mNetworkThread = Thread.currentThread();
        this.mInitCompleted.open();
    }

    private void onEffectiveConnectionTypeChanged(int effectiveConnectionType) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = effectiveConnectionType;
        }
    }

    private void onRTTOrThroughputEstimatesComputed(final int httpRttMs, final int transportRttMs, final int downstreamThroughputKbps) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = httpRttMs;
            this.mTransportRttMs = transportRttMs;
            this.mDownstreamThroughputKbps = downstreamThroughputKbps;
        }
    }

    private void onRttObservation(final int rttMs, final long whenMs, final int source) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> it = this.mRttListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityRttListenerWrapper next = it.next();
                final int i = rttMs;
                final long j = whenMs;
                final int i2 = source;
                postObservationTaskToExecutor(next.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.2
                    final /* synthetic */ CronetUrlRequestContext this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        next.onRttObservation(i, j, i2);
                    }
                }, "onRttObservation");
                rttMs = i;
                whenMs = j;
                source = i2;
            }
        }
    }

    private void onThroughputObservation(final int throughputKbps, final long whenMs, final int source) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> it = this.mThroughputListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper next = it.next();
                final int i = throughputKbps;
                final long j = whenMs;
                final int i2 = source;
                postObservationTaskToExecutor(next.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.3
                    final /* synthetic */ CronetUrlRequestContext this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        next.onThroughputObservation(i, j, i2);
                    }
                }, "onThroughputObservation");
                throughputKbps = i;
                whenMs = j;
                source = i2;
            }
        }
    }

    void reportRequestFinished(final RequestFinishedInfo requestInfo, RefCountDelegate inflightCallbackCount, VersionSafeCallbacks.RequestFinishedInfoListener extraRequestFinishedInfoListener) {
        ArrayList<VersionSafeCallbacks.RequestFinishedInfoListener> arrayList = new ArrayList();
        synchronized (this.mFinishedListenerLock) {
            arrayList.addAll(this.mFinishedListenerMap.values());
        }
        if (extraRequestFinishedInfoListener != null) {
            arrayList.add(extraRequestFinishedInfoListener);
        }
        for (final VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener : arrayList) {
            postObservationTaskToExecutor(requestFinishedInfoListener.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.4
                final /* synthetic */ CronetUrlRequestContext this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    requestFinishedInfoListener.onRequestFinished(requestInfo);
                }
            }, inflightCallbackCount, "reportRequestFinished");
        }
    }

    private static void postTaskToExecutor(Executor executor, final Runnable task, final String name) {
        executor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CronetUrlRequestContext.lambda$postTaskToExecutor$2(name, task);
            }
        });
    }

    static /* synthetic */ void lambda$postTaskToExecutor$2(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#postTaskToExecutor " + str + " running callback");
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

    private static void postObservationTaskToExecutor(Executor executor, final Runnable task, final RefCountDelegate inflightCallbackCount, final String name) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#postObservationTaskToExecutor " + name);
        if (inflightCallbackCount != null) {
            try {
                inflightCallbackCount.increment();
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
        try {
            executor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CronetUrlRequestContext.lambda$postObservationTaskToExecutor$3(name, task, inflightCallbackCount);
                }
            });
        } catch (RejectedExecutionException e) {
            if (inflightCallbackCount != null) {
                inflightCallbackCount.decrement();
            }
            Log.e(LOG_TAG, "Exception posting task to executor", (Throwable) e);
        }
        if (scoped != null) {
            scoped.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void lambda$postObservationTaskToExecutor$3(String str, Runnable runnable, RefCountDelegate refCountDelegate) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#postObservationTaskToExecutor " + str + " running callback");
        try {
            try {
                try {
                    runnable.run();
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
            } catch (Exception e) {
                Log.e(LOG_TAG, "Exception thrown from observation task", (Throwable) e);
            }
        } finally {
            if (refCountDelegate != null) {
                refCountDelegate.decrement();
            }
        }
    }

    private static void postObservationTaskToExecutor(Executor executor, Runnable task, String name) {
        postObservationTaskToExecutor(executor, task, null, name);
    }

    public boolean isNetworkThread(Thread thread) {
        return thread == this.mNetworkThread;
    }
}
