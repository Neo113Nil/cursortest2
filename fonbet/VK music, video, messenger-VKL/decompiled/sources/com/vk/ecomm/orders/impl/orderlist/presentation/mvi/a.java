package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.dw80;
import xsna.h2s;
import xsna.jw00;
import xsna.kw00;
import xsna.lj50;
import xsna.on50;
import xsna.sj50;

/* compiled from: OrderListActor.kt */
/* loaded from: classes18.dex */
public final class a extends al50<dw80, OrderListAction, on50, f, d, c> {
    public final kw00 c;

    /* compiled from: OrderListActor.kt */
    /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0995a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderPreview.ActionType.values().length];
            try {
                iArr[OrderPreview.ActionType.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPreview.ActionType.Review.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderListAction.ClickSpan.Tag.values().length];
            try {
                iArr2[OrderListAction.ClickSpan.Tag.OPEN_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderListAction.ClickSpan.Tag.OPEN_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderListAction.ClickSpan.Tag.OPEN_INTEGRATION_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a(sj50<dw80, on50, f, d, c> sj50Var, kw00 kw00Var) {
        super(sj50Var);
        this.c = kw00Var;
    }

    @Override // xsna.al50, xsna.uic
    public final void clear() {
        this.c.b("order_list_carts");
    }

    @Override // xsna.al50, xsna.qj50
    public final void init() {
        this.c.a("order_list_carts", new jw00.d[]{jw00.a.c}, new h2s(this, 25));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        String str;
        OrderListAction orderListAction = (OrderListAction) lj50Var;
        if (orderListAction.equals(OrderListAction.a.b)) {
            c(c.a.a);
            return;
        }
        boolean equals = orderListAction.equals(OrderListAction.g.b);
        kw00 kw00Var = this.c;
        if (equals) {
            e(d.b.c.a);
            a(new f.d());
            kw00Var.c("order_list_carts");
            return;
        }
        if (orderListAction.equals(OrderListAction.j.b)) {
            e(d.e.a);
            a(new f.d());
            kw00Var.c("order_list_carts");
            return;
        }
        boolean equals2 = orderListAction.equals(OrderListAction.h.b);
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (equals2) {
            dw80 dw80Var = (dw80) sj50Var.getCurrentState();
            e(d.c.C0998c.a);
            a(new f.c(dw80Var.c.size()));
            return;
        }
        if (orderListAction.equals(OrderListAction.b.b)) {
            c(new c.b(((dw80) sj50Var.getCurrentState()).f));
            return;
        }
        if (orderListAction.equals(OrderListAction.c.b)) {
            c(c.C0996c.a);
            return;
        }
        if (orderListAction instanceof OrderListAction.d) {
            OrderPreview orderPreview = ((dw80) sj50Var.getCurrentState()).c.get(Integer.valueOf(((OrderListAction.d) orderListAction).b));
            if (orderPreview == null) {
                return;
            }
            boolean z = orderPreview.f;
            int i = orderPreview.c;
            OrderSource orderSource = orderPreview.n;
            if (!z && (orderSource instanceof OrderSource.Market)) {
                e(new d.f(i));
            }
            if (orderSource instanceof OrderSource.Market) {
                c(new c.g(orderPreview.b, i, orderPreview.d));
                return;
            }
            if (!(orderSource instanceof OrderSource.Ozon)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z) {
                a(new f.a(i));
            }
            String str2 = ((OrderSource.Ozon) orderSource).c;
            if (str2 != null) {
                c(new c.d(str2));
                return;
            }
            return;
        }
        if (orderListAction instanceof OrderListAction.e) {
            dw80 dw80Var2 = (dw80) sj50Var.getCurrentState();
            OrderListAction.e eVar = (OrderListAction.e) orderListAction;
            OrderPreview.ActionType actionType = eVar.c;
            int i2 = eVar.b;
            int i3 = C0995a.$EnumSwitchMapping$0[actionType.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c(new c.i(new ReviewSuggestion.Order(i2)));
                return;
            }
            OrderPreview orderPreview2 = dw80Var2.c.get(Integer.valueOf(i2));
            if (orderPreview2 == null) {
                return;
            }
            OrderSource orderSource2 = orderPreview2.n;
            int i4 = orderPreview2.c;
            if (orderSource2 instanceof OrderSource.Market) {
                e(new d.InterfaceC0999d.b(i4));
                a(new f.b(i4));
                return;
            } else {
                if (!(orderSource2 instanceof OrderSource.Ozon)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = ((OrderSource.Ozon) orderSource2).c;
                if (str3 != null) {
                    c(new c.d(str3));
                    return;
                }
                return;
            }
        }
        if (orderListAction instanceof OrderListAction.f) {
            OrderListAction.f fVar = (OrderListAction.f) orderListAction;
            c(new c.e(fVar.c, fVar.b));
            return;
        }
        if (!(orderListAction instanceof OrderListAction.ClickSpan)) {
            if (!(orderListAction instanceof OrderListAction.i)) {
                throw new NoWhenBranchMatchedException();
            }
            e(new d.InterfaceC0999d.a(((OrderListAction.i) orderListAction).b));
            return;
        }
        dw80 dw80Var3 = (dw80) sj50Var.getCurrentState();
        OrderListAction.ClickSpan clickSpan = (OrderListAction.ClickSpan) orderListAction;
        String str4 = clickSpan.b;
        Object obj = clickSpan.c;
        int i5 = C0995a.$EnumSwitchMapping$1[OrderListAction.ClickSpan.Tag.valueOf(str4).ordinal()];
        if (i5 == 1) {
            UserId userId = obj instanceof UserId ? (UserId) obj : null;
            if (userId != null) {
                c(new c.f(userId));
                return;
            }
            return;
        }
        if (i5 == 2) {
            String str5 = obj instanceof String ? (String) obj : null;
            if (str5 != null) {
                c(new c.d(str5));
                return;
            }
            return;
        }
        if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            OrderPreview orderPreview3 = dw80Var3.c.get(num);
            OrderSource orderSource3 = orderPreview3 != null ? orderPreview3.n : null;
            if (!(orderSource3 instanceof OrderSource.Ozon) || (str = ((OrderSource.Ozon) orderSource3).c) == null) {
                return;
            }
            c(new c.d(str));
            if (orderPreview3.f) {
                return;
            }
            a(new f.a(orderPreview3.c));
        }
    }
}
