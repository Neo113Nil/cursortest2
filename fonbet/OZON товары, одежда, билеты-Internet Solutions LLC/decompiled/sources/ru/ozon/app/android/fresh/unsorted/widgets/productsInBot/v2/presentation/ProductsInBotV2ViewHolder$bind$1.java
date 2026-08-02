package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class ProductsInBotV2ViewHolder$bind$1 extends C7735q implements Function2<Long, Integer, Unit> {
    ProductsInBotV2ViewHolder$bind$1(Object obj) {
        super(2, obj, ProductsInBotV2ViewModel.class, "setProduct", "setProduct(JI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, Integer num) {
        invoke(l11.longValue(), num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11, int i11) {
        ((ProductsInBotV2ViewModel) this.receiver).setProduct(j11, i11);
    }
}
