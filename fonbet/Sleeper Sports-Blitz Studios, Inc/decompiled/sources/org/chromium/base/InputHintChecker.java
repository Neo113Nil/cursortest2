package org.chromium.base;

import android.os.Build;
import android.view.View;
import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class InputHintChecker {
    private static boolean sAllowSetViewForTesting;

    public interface Natives {
        boolean failedToInitializeForTesting();

        boolean hasInputForTesting();

        boolean hasInputWithThrottlingForTesting();

        boolean isInitializedForTesting();

        void onCompositorViewHolderTouchEvent();

        void setIsAfterInputYieldForTesting(boolean after);

        void setView(Object view);
    }

    public static void setView(View view) {
        if (sAllowSetViewForTesting || Build.VERSION.SDK_INT >= 35) {
            InputHintCheckerJni.get().setView(view);
        }
    }

    public static void onCompositorViewHolderTouchEvent() {
        InputHintCheckerJni.get().onCompositorViewHolderTouchEvent();
    }

    public static void setAllowSetViewForTesting(boolean allow) {
        sAllowSetViewForTesting = allow;
    }

    public static boolean isInitializedForTesting() {
        return InputHintCheckerJni.get().isInitializedForTesting();
    }

    public static boolean failedToInitializeForTesting() {
        return InputHintCheckerJni.get().failedToInitializeForTesting();
    }

    public static boolean hasInputForTesting() {
        return InputHintCheckerJni.get().hasInputForTesting();
    }

    public static boolean hasInputWithThrottlingForTesting() {
        return InputHintCheckerJni.get().hasInputWithThrottlingForTesting();
    }

    public static void setWrongViewForTesting() {
        InputHintCheckerJni.get().setView(new Object());
    }

    public static void setIsAfterInputYieldForTesting(boolean after) {
        InputHintCheckerJni.get().setIsAfterInputYieldForTesting(after);
    }
}
