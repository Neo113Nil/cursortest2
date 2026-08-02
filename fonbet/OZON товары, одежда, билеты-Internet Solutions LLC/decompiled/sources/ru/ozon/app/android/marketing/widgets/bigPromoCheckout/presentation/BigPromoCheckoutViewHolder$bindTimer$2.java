package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class BigPromoCheckoutViewHolder$bindTimer$2 extends C7735q implements Function1<BigPromoCheckoutTickVO, Unit> {
    BigPromoCheckoutViewHolder$bindTimer$2(Object obj) {
        super(1, obj, BigPromoCheckoutViewHolder.class, "onTick", "onTick(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTickVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigPromoCheckoutTickVO bigPromoCheckoutTickVO) {
        invoke2(bigPromoCheckoutTickVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigPromoCheckoutTickVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((BigPromoCheckoutViewHolder) this.receiver).onTick(p02);
    }
}
