package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderDoneCrossButtonNewWidgetViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction, Boolean> {
    OrderDoneCrossButtonNewWidgetViewHolder$actionHandler$1(Object obj) {
        super(1, obj, OrderDoneCrossButtonNewWidgetViewHolder.class, "handleSellerMiniAppHomeNavigation", "handleSellerMiniAppHomeNavigation(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        boolean handleSellerMiniAppHomeNavigation;
        Intrinsics.checkNotNullParameter(p02, "p0");
        handleSellerMiniAppHomeNavigation = ((OrderDoneCrossButtonNewWidgetViewHolder) this.receiver).handleSellerMiniAppHomeNavigation(p02);
        return Boolean.valueOf(handleSellerMiniAppHomeNavigation);
    }
}
