package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f6, FitModeResult fitModeResult);

    FitModeResult evaluate(float f6, float f10, float f11, float f12, float f13, float f14, float f15);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
