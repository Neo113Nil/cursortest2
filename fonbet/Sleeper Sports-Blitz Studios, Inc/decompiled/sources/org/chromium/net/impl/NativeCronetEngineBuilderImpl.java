package org.chromium.net.impl;

import android.content.Context;
import android.os.SystemClock;
import internal.org.chromium.build.BuildConfig;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes10.dex */
public class NativeCronetEngineBuilderImpl extends CronetEngineBuilderImpl {
    private static final AtomicLong sLogCronetInitializationRef = new AtomicLong(0);
    private static final CronetLogger.CronetSource sCronetSource = computeCronetSource();

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String hostName, Set pinsSha256, boolean includeSubdomains, Date expirationDate) {
        return super.addPublicKeyPins(hostName, (Set<byte[]>) pinsSha256, includeSubdomains, expirationDate);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String host, int port, int alternatePort) {
        return super.addQuicHint(host, port, alternatePort);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean value) {
        return super.enableBrotli(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean value) {
        return super.enableHttp2(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int cacheMode, long maxSize) {
        return super.enableHttpCache(cacheMode, maxSize);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean value) {
        return super.enableNetworkQualityEstimator(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean value) {
        return super.enablePublicKeyPinningBypassForLocalTrustAnchors(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean value) {
        return super.enableQuic(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean value) {
        return super.enableSdch(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String options) {
        return super.setExperimentalOptions(options);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader loader) {
        return super.setLibraryLoader(loader);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setProxyOptions(ProxyOptions proxyOptions) {
        return super.setProxyOptions(proxyOptions);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String value) {
        return super.setStoragePath(value);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int priority) {
        return super.setThreadPriority(priority);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String userAgent) {
        return super.setUserAgent(userAgent);
    }

    public NativeCronetEngineBuilderImpl(Context context) {
        super(context, sCronetSource);
    }

    private static CronetLogger.CronetSource computeCronetSource() {
        ClassLoader classLoader = CronetEngineBuilderImpl.class.getClassLoader();
        if (BuildConfig.CRONET_FOR_AOSP_BUILD) {
            return CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM;
        }
        if (!ExperimentalCronetEngine.class.getClassLoader().equals(classLoader)) {
            return CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
        }
        return CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED;
    }

    static CronetLogger.CronetSource getCronetSource() {
        return sCronetSource;
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        AtomicLong atomicLong = sLogCronetInitializationRef;
        atomicLong.compareAndSet(0L, this.mLogger.generateId());
        return atomicLong.get();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this, uptimeMillis);
        this.mMockCertVerifier = 0L;
        return cronetUrlRequestContext;
    }
}
