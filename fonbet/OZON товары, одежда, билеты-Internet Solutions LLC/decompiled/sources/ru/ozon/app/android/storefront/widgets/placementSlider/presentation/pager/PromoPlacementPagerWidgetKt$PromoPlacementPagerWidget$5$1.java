package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$5$1 extends C7735q implements Function1<Integer, Integer> {
    PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$5$1(Object obj) {
        super(1, obj, PlacementSliderPagerConfig.class, "nextPage", "nextPage(I)I", 0);
    }

    public final Integer invoke(int i11) {
        return Integer.valueOf(((PlacementSliderPagerConfig) this.receiver).nextPage(i11));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
