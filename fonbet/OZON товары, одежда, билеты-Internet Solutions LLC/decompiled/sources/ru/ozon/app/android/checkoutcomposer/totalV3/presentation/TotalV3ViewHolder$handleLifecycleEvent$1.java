package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TotalV3ViewHolder$handleLifecycleEvent$1 extends C7735q implements Function1<HandledState<CreateAndPayViewState>, Unit> {
    TotalV3ViewHolder$handleLifecycleEvent$1(Object obj) {
        super(1, obj, TotalV3ViewHolder.class, "observePaymentLoader", "observePaymentLoader(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HandledState<CreateAndPayViewState> handledState) {
        invoke2(handledState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HandledState<CreateAndPayViewState> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TotalV3ViewHolder) this.receiver).observePaymentLoader(p02);
    }
}
