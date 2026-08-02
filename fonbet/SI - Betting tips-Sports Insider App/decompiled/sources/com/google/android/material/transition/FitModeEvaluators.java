package com.google.android.material.transition;

import android.graphics.RectF;
import androidx.appcompat.widget.c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f6, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f6;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f6, float f10, float f11, float f12, float f13, float f14, float f15) {
            float lerp = TransitionUtils.lerp(f12, f14, f10, f11, f6, true);
            float f16 = lerp / f12;
            float f17 = lerp / f14;
            return new FitModeResult(f16, f17, lerp, f13 * f16, lerp, f15 * f17);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f6, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f6;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f6, float f10, float f11, float f12, float f13, float f14, float f15) {
            float lerp = TransitionUtils.lerp(f13, f15, f10, f11, f6, true);
            float f16 = lerp / f13;
            float f17 = lerp / f15;
            return new FitModeResult(f16, f17, f12 * f16, lerp, f14 * f17, lerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i5, boolean z5, RectF rectF, RectF rectF2) {
        if (i5 == 0) {
            return shouldAutoFitToWidth(z5, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i5 == 1) {
            return WIDTH;
        }
        if (i5 == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException(c1.i(i5, "Invalid fit mode: "));
    }

    private static boolean shouldAutoFitToWidth(boolean z5, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        return z5 ? (height2 * width) / width2 >= height : (width2 * height) / width >= height2;
    }
}
