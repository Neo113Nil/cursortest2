package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JniCallbackImpl;

/* loaded from: classes10.dex */
class JniCallbackImplJni implements JniCallbackImpl.Natives {
    private static JniTestInstanceHolder sOverride;

    JniCallbackImplJni() {
    }

    public static JniCallbackImpl.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (JniCallbackImpl.Natives) jniTestInstanceHolder.value;
        }
        return new JniCallbackImplJni();
    }

    public static void setInstanceForTesting(JniCallbackImpl.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.JniCallbackImpl.Natives
    public void destroy(boolean isRepeating, long callbackPtr) {
        GEN_JNI.org_chromium_base_JniCallbackImpl_destroy(isRepeating, callbackPtr);
    }

    @Override // org.chromium.base.JniCallbackImpl.Natives
    public void onResult(boolean isRepeating, long callbackPtr, Object result) {
        GEN_JNI.org_chromium_base_JniCallbackImpl_onResult(isRepeating, callbackPtr, result);
    }
}
