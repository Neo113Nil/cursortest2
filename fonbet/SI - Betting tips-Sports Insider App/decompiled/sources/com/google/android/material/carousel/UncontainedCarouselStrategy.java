package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.l1;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f6, float f10, float f11) {
        float max = Math.max(1.5f * f11, f6);
        float f12 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f10;
        if (max > f12) {
            max = Math.max(f12, f11 * 1.2f);
        }
        return Math.min(f10, max);
    }

    private KeylineState createCenterAlignedKeylineState(int i5, float f6, float f10, int i10, float f11, float f12, float f13) {
        float min = Math.min(f12, f10);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, f10, f6);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f11, f10, f6);
        float f14 = f11 / 2.0f;
        float f15 = (f13 + 0.0f) - f14;
        float f16 = f15 + f14;
        float f17 = min / 2.0f;
        float f18 = (i10 * f10) + f16;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f10, i5).addAnchorKeyline((f15 - f14) - f17, childMaskPercentage, min).addKeyline(f15, childMaskPercentage2, f11, false).addKeylineRange((f10 / 2.0f) + f16, 0.0f, f10, i10, true);
        addKeylineRange.addKeyline(f14 + f18, childMaskPercentage2, f11, false);
        addKeylineRange.addAnchorKeyline(f18 + f11 + f17, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f6, int i5, float f10, int i10, float f11, int i11, float f12) {
        float min = Math.min(f12, f10);
        float max = Math.max(min, 0.5f * f11);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(max, f10, f6);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(min, f10, f6);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f11, f10, f6);
        float f13 = (i10 * f10) + 0.0f;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f10, i5).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f10 / 2.0f, 0.0f, f10, i10, true);
        if (i11 > 0) {
            float f14 = (f11 / 2.0f) + f13;
            f13 += f11;
            addKeylineRange.addKeyline(f14, childMaskPercentage3, f11, false);
        }
        addKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f13, childMaskPercentage2, min);
        return addKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public CarouselStrategy.StrategyType getStrategyType() {
        return CarouselStrategy.StrategyType.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        l1 l1Var = (l1) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) l1Var).topMargin + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f10 = measuredHeight;
        float f11 = f6;
        float f12 = f10 + f11;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f11;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f11;
        int max = Math.max(1, (int) Math.floor(r1 / f12));
        float f13 = containerWidth - (max * f12);
        if (carousel.getCarouselAlignment() == 1) {
            float f14 = f13 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f11, f12, max, Math.max(Math.min(3.0f * f14, f12), getSmallItemSizeMin() + f11), extraSmallSize2, f14);
        }
        int i5 = 1;
        if (f13 <= 0.0f) {
            i5 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f11, containerWidth, f12, max, calculateMediumChildSize(extraSmallSize, f12, f13), i5, extraSmallSize2);
    }
}
