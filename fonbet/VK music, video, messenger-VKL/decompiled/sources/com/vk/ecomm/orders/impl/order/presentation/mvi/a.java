package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.ecomm.orders.impl.order.presentation.mvi.c;
import com.vk.ecomm.orders.impl.order.presentation.mvi.d;
import com.vk.ecomm.orders.impl.order.presentation.mvi.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.ax80;
import xsna.dx80;
import xsna.gx80;
import xsna.iu80;
import xsna.lj50;
import xsna.on50;
import xsna.ou80;
import xsna.sj50;

/* compiled from: OrderActor.kt */
/* loaded from: classes18.dex */
public final class a extends al50<gx80, OrderAction, on50, f, d, c> {

    /* compiled from: OrderActor.kt */
    /* renamed from: com.vk.ecomm.orders.impl.order.presentation.mvi.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0990a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderAction.ClickSpan.Tag.values().length];
            try {
                iArr[OrderAction.ClickSpan.Tag.OPEN_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderAction.ClickSpan.Tag.OPEN_MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderAction.ClickSpan.Tag.CLICK_RECIPIENT_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderAction.ClickSpan.Tag.OPEN_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderAction.ClickSpan.Tag.OPEN_CHAT_WITH_SELLER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a() {
        throw null;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ou80 ou80Var;
        dx80 dx80Var;
        ax80 ax80Var;
        String str;
        OrderAction orderAction = (OrderAction) lj50Var;
        if (orderAction instanceof OrderAction.d) {
            a(f.a.b);
            return;
        }
        if (orderAction instanceof OrderAction.a) {
            c(c.a.a);
            return;
        }
        if (orderAction instanceof OrderAction.g) {
            a(f.c.b);
            return;
        }
        if (orderAction instanceof OrderAction.b) {
            a(f.b.b);
            return;
        }
        if (orderAction instanceof OrderAction.f) {
            e(new d.b.a(((OrderAction.f) orderAction).b));
            return;
        }
        if (orderAction instanceof OrderAction.e) {
            c(new c.d(((OrderAction.e) orderAction).b));
            return;
        }
        boolean z = orderAction instanceof OrderAction.ClickSpan;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (!z) {
            if (orderAction instanceof OrderAction.c) {
                OrderAction.c cVar = (OrderAction.c) orderAction;
                c(new c.h(cVar.c, cVar.b));
                return;
            } else {
                if (!(orderAction instanceof OrderAction.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderAction.h hVar = (OrderAction.h) orderAction;
                Integer num = ((gx80) sj50Var.getCurrentState()).c;
                if (num != null) {
                    c(new c.i(num.intValue(), hVar.b));
                    return;
                }
                return;
            }
        }
        OrderAction.ClickSpan clickSpan = (OrderAction.ClickSpan) orderAction;
        String str2 = clickSpan.b;
        Object obj = clickSpan.c;
        int i = C0990a.$EnumSwitchMapping$0[OrderAction.ClickSpan.Tag.valueOf(str2).ordinal()];
        r3 = null;
        DeliveryPoint deliveryPoint = null;
        if (i == 1) {
            UserId userId = obj instanceof UserId ? (UserId) obj : null;
            if (userId != null) {
                c(new c.C0991c(userId));
                return;
            }
            return;
        }
        if (i == 2) {
            iu80 iu80Var = ((gx80) sj50Var.getCurrentState()).e;
            UserId userId2 = (iu80Var == null || (dx80Var = iu80Var.f) == null) ? null : dx80Var.c;
            iu80 iu80Var2 = ((gx80) sj50Var.getCurrentState()).e;
            if (iu80Var2 != null && (ou80Var = iu80Var2.l) != null) {
                deliveryPoint = ou80Var.c;
            }
            if (userId2 == null || deliveryPoint == null) {
                return;
            }
            c(new c.e(userId2, deliveryPoint));
            return;
        }
        if (i == 3) {
            iu80 iu80Var3 = ((gx80) sj50Var.getCurrentState()).e;
            if (iu80Var3 == null || (ax80Var = iu80Var3.m) == null || (str = ax80Var.b) == null) {
                return;
            }
            c(new c.g(str));
            return;
        }
        if (i == 4) {
            String str3 = obj instanceof String ? (String) obj : null;
            if (str3 != null) {
                c(new c.d(str3));
                return;
            }
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        iu80 iu80Var4 = ((gx80) sj50Var.getCurrentState()).e;
        dx80 dx80Var2 = iu80Var4 != null ? iu80Var4.f : null;
        UserId userId3 = dx80Var2 != null ? dx80Var2.c : null;
        Long l = dx80Var2 != null ? dx80Var2.d : null;
        iu80 iu80Var5 = ((gx80) sj50Var.getCurrentState()).e;
        String str4 = iu80Var5 != null ? iu80Var5.c : null;
        if (userId3 == null || l == null || str4 == null) {
            return;
        }
        c(new c.b(l.longValue(), userId3, str4));
    }
}
