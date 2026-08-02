package ru.ozon.app.android.account.orders.cancel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CancelReasonFragment$setupObservers$1$1$3 extends C7735q implements Function1<CancelReasonVO.Button, Unit> {
    CancelReasonFragment$setupObservers$1$1$3(Object obj) {
        super(1, obj, CancelReasonFragment.class, "handleButton", "handleButton(Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CancelReasonVO.Button button) {
        invoke2(button);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CancelReasonVO.Button p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CancelReasonFragment) this.receiver).handleButton(p02);
    }
}
