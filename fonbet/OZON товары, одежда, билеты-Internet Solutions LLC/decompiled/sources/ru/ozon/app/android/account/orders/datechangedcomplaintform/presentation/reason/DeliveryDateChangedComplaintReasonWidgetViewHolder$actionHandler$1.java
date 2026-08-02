package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.reason;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class DeliveryDateChangedComplaintReasonWidgetViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction.Click, Unit> {
    DeliveryDateChangedComplaintReasonWidgetViewHolder$actionHandler$1(Object obj) {
        super(1, obj, SelectReasonDelegate.class, "handleAction", "handleAction(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SelectReasonDelegate) this.receiver).handleAction(p02);
    }
}
