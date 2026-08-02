package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CompletionOnceCallback;

/* loaded from: classes10.dex */
class CompletionOnceCallbackJni implements CompletionOnceCallback.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CompletionOnceCallbackJni() {
    }

    public static CompletionOnceCallback.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CompletionOnceCallback.Natives) jniTestInstanceHolder.value;
        }
        return new CompletionOnceCallbackJni();
    }

    public static void setInstanceForTesting(CompletionOnceCallback.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CompletionOnceCallback.Natives
    public void run(long nativeCompletionOnceCallbackAdapter, int result) {
        GEN_JNI.org_chromium_net_impl_CompletionOnceCallback_run(nativeCompletionOnceCallbackAdapter, result);
    }
}
