package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetLibraryLoader;

/* loaded from: classes10.dex */
class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
    private static JniTestInstanceHolder sOverride;

    CronetLibraryLoaderJni() {
    }

    public static CronetLibraryLoader.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CronetLibraryLoader.Natives) jniTestInstanceHolder.value;
        }
        return new CronetLibraryLoaderJni();
    }

    public static void setInstanceForTesting(CronetLibraryLoader.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void cronetInitOnInitThread(int traceNetLogCaptureMode) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread(traceNetLogCaptureMode);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public String getCronetVersion() {
        return (String) GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getCronetVersion();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public int getTraceNetLogCaptureModeForTesting() {
        return GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getTraceNetLogCaptureModeForTesting();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void nativeInit(boolean initializePerfetto) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_nativeInit(initializePerfetto);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void setMinLogLevel(int loggingLevel) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(loggingLevel);
    }
}
