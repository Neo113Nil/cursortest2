package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JavaHandlerThread;

/* loaded from: classes10.dex */
class JavaHandlerThreadJni implements JavaHandlerThread.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    JavaHandlerThreadJni() {
    }

    public static JavaHandlerThread.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (JavaHandlerThread.Natives) jniTestInstanceHolder.value;
        }
        return new JavaHandlerThreadJni();
    }

    public static void setInstanceForTesting(JavaHandlerThread.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void initializeThread(long nativeJavaHandlerThread, long nativeEvent) {
        GEN_JNI.org_chromium_base_JavaHandlerThread_initializeThread(nativeJavaHandlerThread, nativeEvent);
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void onLooperStopped(long nativeJavaHandlerThread) {
        GEN_JNI.org_chromium_base_JavaHandlerThread_onLooperStopped(nativeJavaHandlerThread);
    }
}
