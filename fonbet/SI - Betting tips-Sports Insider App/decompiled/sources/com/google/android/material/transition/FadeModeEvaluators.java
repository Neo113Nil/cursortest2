package com.google.android.material.transition;

import androidx.appcompat.widget.c1;
import d9.e;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f10, float f11, float f12) {
            return FadeModeResult.endOnTop(KotlinVersion.MAX_COMPONENT_VALUE, TransitionUtils.lerp(0, KotlinVersion.MAX_COMPONENT_VALUE, f10, f11, f6));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f10, float f11, float f12) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(KotlinVersion.MAX_COMPONENT_VALUE, 0, f10, f11, f6), KotlinVersion.MAX_COMPONENT_VALUE);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f10, float f11, float f12) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(KotlinVersion.MAX_COMPONENT_VALUE, 0, f10, f11, f6), TransitionUtils.lerp(0, KotlinVersion.MAX_COMPONENT_VALUE, f10, f11, f6));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f6, float f10, float f11, float f12) {
            float w10 = e.w(f11, f10, f12, f10);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(KotlinVersion.MAX_COMPONENT_VALUE, 0, f10, w10, f6), TransitionUtils.lerp(0, KotlinVersion.MAX_COMPONENT_VALUE, w10, f11, f6));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i5, boolean z5) {
        if (i5 == 0) {
            return z5 ? IN : OUT;
        }
        if (i5 == 1) {
            return z5 ? OUT : IN;
        }
        if (i5 == 2) {
            return CROSS;
        }
        if (i5 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(c1.i(i5, "Invalid fade mode: "));
    }
}
