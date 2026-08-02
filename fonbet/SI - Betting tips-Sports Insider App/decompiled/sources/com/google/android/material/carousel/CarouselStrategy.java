package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr2[i5] = iArr[i5] * 2;
        }
        return iArr2;
    }

    public static float getChildMaskPercentage(float f6, float f10, float f11) {
        return 1.0f - ((f6 - f11) / (f10 - f11));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public StrategyType getStrategyType() {
        return StrategyType.CONTAINED;
    }

    public void initialize(Context context) {
        float f6 = this.smallSizeMin;
        if (f6 <= 0.0f) {
            f6 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f6;
        float f10 = this.smallSizeMax;
        if (f10 <= 0.0f) {
            f10 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f10;
    }

    @NonNull
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f6) {
        this.smallSizeMax = f6;
    }

    public void setSmallItemSizeMin(float f6) {
        this.smallSizeMin = f6;
    }

    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i5) {
        return false;
    }
}
