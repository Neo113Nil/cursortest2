package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.l1;
import com.google.android.play.core.appupdate.b;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i5) {
        int itemCount = arrangement.getItemCount() - i5;
        boolean z5 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i10 = arrangement.smallCount;
            if (i10 > 0) {
                arrangement.smallCount = i10 - 1;
            } else {
                int i11 = arrangement.mediumCount;
                if (i11 > 1) {
                    arrangement.mediumCount = i11 - 1;
                }
            }
            itemCount--;
        }
        return z5;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        boolean z5;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        l1 l1Var = (l1) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) l1Var).topMargin + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f6;
        float max = Math.max(getSmallItemSizeMax() + f6, smallItemSizeMin);
        float f10 = containerHeight;
        float min = Math.min(measuredHeight + f6, f10);
        float e7 = b.e((measuredHeight / 3.0f) + f6, smallItemSizeMin + f6, max + f6);
        float f11 = (min + e7) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        float f12 = 2.0f * smallItemSizeMin;
        if (f10 <= f12) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        float f13 = f6;
        int max2 = (int) Math.max(1.0d, Math.floor(e.d(max, CarouselStrategyHelper.maxValue(iArr4), f10 - (CarouselStrategyHelper.maxValue(iArr3) * f11), min)));
        int ceil = (int) Math.ceil(f10 / min);
        int i5 = (ceil - max2) + 1;
        int[] iArr5 = new int[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            iArr5[i10] = ceil - i10;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, e7, smallItemSizeMin, max, iArr4, f11, iArr3, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        boolean ensureArrangementFitsItemCount = ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount());
        int i11 = findLowestCostArrangement.mediumCount;
        if (i11 == 0 && findLowestCostArrangement.smallCount == 0 && f10 > f12) {
            findLowestCostArrangement.smallCount = 1;
            z5 = true;
        } else {
            z5 = ensureArrangementFitsItemCount;
        }
        if (z5) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, e7, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f11, new int[]{i11}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f13, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i5) {
        if (i5 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i5 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
