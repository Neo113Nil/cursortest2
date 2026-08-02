package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.l1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        int i5;
        int i10;
        l1 l1Var = (l1) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i5 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i5 = ((ViewGroup.MarginLayoutParams) l1Var).topMargin;
            i10 = ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
        }
        float f6 = i5 + i10;
        float f10 = containerHeight;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f6, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f10 + f6, f10), 1, f10));
    }
}
