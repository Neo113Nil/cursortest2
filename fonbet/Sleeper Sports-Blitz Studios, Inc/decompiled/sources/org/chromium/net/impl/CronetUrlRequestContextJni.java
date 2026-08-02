package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes10.dex */
class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUrlRequestContextJni() {
    }

    public static CronetUrlRequestContext.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CronetUrlRequestContext.Natives) jniTestInstanceHolder.value;
        }
        return new CronetUrlRequestContextJni();
    }

    public static void setInstanceForTesting(CronetUrlRequestContext.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addPkp(long urlRequestContextConfig, String host, byte[][] hashes, boolean includeSubdomains, long expirationTime) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addPkp(urlRequestContextConfig, host, hashes, includeSubdomains, expirationTime);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addQuicHint(long urlRequestContextConfig, String host, int port, int alternatePort) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(urlRequestContextConfig, host, port, alternatePort);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void configureNetworkQualityEstimatorForTesting(long nativePtr, boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(nativePtr, useLocalHostRequests, useSmallerResponses, disableOfflineCheck);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextAdapter(long urlRequestContextConfig) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(urlRequestContextConfig);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextConfig(byte[] serializedRequestContextConfigOptions) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(serializedRequestContextConfigOptions);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void destroy(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_destroy(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void flushWritePropertiesForTesting(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_flushWritePropertiesForTesting(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void initRequestContextOnInitThread(long nativePtr, CronetUrlRequestContext self) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(nativePtr, self);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideRTTObservations(long nativePtr, boolean should) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(nativePtr, should);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideThroughputObservations(long nativePtr, boolean should) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(nativePtr, should);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void startNetLogToDisk(long nativePtr, String dirPath, boolean logAll, int maxSize) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(nativePtr, dirPath, logAll, maxSize);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean startNetLogToFile(long nativePtr, String fileName, boolean logAll) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(nativePtr, fileName, logAll);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void stopNetLog(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(nativePtr);
    }
}
