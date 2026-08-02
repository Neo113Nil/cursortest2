package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class ProductsInBotV2ViewHolder$bind$2 extends C7735q implements Function1<Long, Unit> {
    ProductsInBotV2ViewHolder$bind$2(Object obj) {
        super(1, obj, ProductsInBotV2ViewModel.class, "deleteProduct", "deleteProduct(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((ProductsInBotV2ViewModel) this.receiver).deleteProduct(j11);
    }
}
