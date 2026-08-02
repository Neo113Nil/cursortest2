package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.l1;
import com.google.android.play.core.appupdate.b;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        l1 l1Var = (l1) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) l1Var).topMargin + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f6;
        float max = Math.max(getSmallItemSizeMax() + f6, smallItemSizeMin);
        float f10 = containerHeight;
        float min = Math.min(measuredWidth + f6, f10);
        float e7 = b.e((measuredWidth / 3.0f) + f6, smallItemSizeMin + f6, max + f6);
        float f11 = (min + e7) / 2.0f;
        int i5 = 0;
        int[] iArr = f10 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int max2 = (int) Math.max(1.0d, Math.floor(e.d(max, CarouselStrategyHelper.maxValue(r1), f10, min)));
        int ceil = (((int) Math.ceil(f10 / min)) - max2) + 1;
        int[] iArr2 = new int[ceil];
        for (int i10 = 0; i10 < ceil; i10++) {
            iArr2[i10] = max2 + i10;
        }
        int i11 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, e7, smallItemSizeMin, max, i11 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f11, i11 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, min, iArr2);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, e7, smallItemSizeMin, max, iArr, f11, MEDIUM_COUNTS, min, iArr2);
        } else {
            i5 = i11;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f6, containerHeight, findLowestCostArrangement, i5);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i5) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i5 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i5 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
