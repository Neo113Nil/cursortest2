package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.InputHintChecker;

/* loaded from: classes10.dex */
public class InputHintCheckerJni implements InputHintChecker.Natives {
    private static JniTestInstanceHolder sOverride;

    public static InputHintChecker.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (InputHintChecker.Natives) jniTestInstanceHolder.value;
        }
        return new InputHintCheckerJni();
    }

    public static void setInstanceForTesting(InputHintChecker.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean failedToInitializeForTesting() {
        return GEN_JNI.org_chromium_base_InputHintChecker_failedToInitializeForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean hasInputForTesting() {
        return GEN_JNI.org_chromium_base_InputHintChecker_hasInputForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean hasInputWithThrottlingForTesting() {
        return GEN_JNI.org_chromium_base_InputHintChecker_hasInputWithThrottlingForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean isInitializedForTesting() {
        return GEN_JNI.org_chromium_base_InputHintChecker_isInitializedForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void onCompositorViewHolderTouchEvent() {
        GEN_JNI.org_chromium_base_InputHintChecker_onCompositorViewHolderTouchEvent();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void setIsAfterInputYieldForTesting(boolean after) {
        GEN_JNI.org_chromium_base_InputHintChecker_setIsAfterInputYieldForTesting(after);
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void setView(Object view) {
        GEN_JNI.org_chromium_base_InputHintChecker_setView(view);
    }
}
