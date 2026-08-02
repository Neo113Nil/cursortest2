package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BigPromoNavbarViewHolder$timerTicker$2 extends C7735q implements Function1<BigPromoTickVO, Unit> {
    BigPromoNavbarViewHolder$timerTicker$2(Object obj) {
        super(1, obj, BigPromoNavbarViewHolder.class, "onTick", "onTick(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTickVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigPromoTickVO bigPromoTickVO) {
        invoke2(bigPromoTickVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigPromoTickVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((BigPromoNavbarViewHolder) this.receiver).onTick(p02);
    }
}
