package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$pagerState$1$1 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ PlacementSliderPagerConfig $pagerConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$pagerState$1$1(PlacementSliderPagerConfig placementSliderPagerConfig) {
        super(0);
        this.$pagerConfig = placementSliderPagerConfig;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$pagerConfig.getPageCount());
    }
}
