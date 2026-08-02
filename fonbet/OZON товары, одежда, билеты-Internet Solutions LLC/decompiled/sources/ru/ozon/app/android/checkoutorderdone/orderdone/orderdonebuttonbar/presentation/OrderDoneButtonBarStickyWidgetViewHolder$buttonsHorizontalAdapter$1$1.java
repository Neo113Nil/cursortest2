package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderDoneButtonBarStickyWidgetViewHolder$buttonsHorizontalAdapter$1$1 extends C7735q implements Function1<AtomAction, Unit> {
    OrderDoneButtonBarStickyWidgetViewHolder$buttonsHorizontalAdapter$1$1(Object obj) {
        super(1, obj, OrderDoneButtonBarStickyWidgetViewHolder.class, "onClickAction", "onClickAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((OrderDoneButtonBarStickyWidgetViewHolder) this.receiver).onClickAction(p02);
    }
}
