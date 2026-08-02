package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PriceV2MainPriceWidgetViewHolder$bind$1$1$1 extends C7735q implements Function1<Integer, Unit> {
    PriceV2MainPriceWidgetViewHolder$bind$1$1$1(Object obj) {
        super(1, obj, PriceV2MainPriceView.class, "updateScrollableGradientColor", "updateScrollableGradientColor(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((PriceV2MainPriceView) this.receiver).updateScrollableGradientColor(i11);
    }
}
