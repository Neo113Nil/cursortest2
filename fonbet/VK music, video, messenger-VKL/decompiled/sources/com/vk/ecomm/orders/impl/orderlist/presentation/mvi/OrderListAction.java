package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import xsna.asp;
import xsna.epx;
import xsna.k73;
import xsna.lj50;
import xsna.vu5;
import xsna.zrp;

/* compiled from: OrderListAction.kt */
/* loaded from: classes18.dex */
public abstract class OrderListAction implements lj50 {

    /* compiled from: OrderListAction.kt */
    public static final class ClickSpan extends OrderListAction {
        public final String b;
        public final Object c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrderListAction.kt */
        public static final class Tag {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Tag[] $VALUES;
            public static final Tag OPEN_GROUP;
            public static final Tag OPEN_INTEGRATION_ORDER;
            public static final Tag OPEN_LINK;

            static {
                Tag tag = new Tag("OPEN_INTEGRATION_ORDER", 0);
                OPEN_INTEGRATION_ORDER = tag;
                Tag tag2 = new Tag("OPEN_GROUP", 1);
                OPEN_GROUP = tag2;
                Tag tag3 = new Tag("OPEN_LINK", 2);
                OPEN_LINK = tag3;
                Tag[] tagArr = {tag, tag2, tag3};
                $VALUES = tagArr;
                $ENTRIES = new asp(tagArr);
            }

            public Tag() {
                throw null;
            }

            public static Tag valueOf(String str) {
                return (Tag) Enum.valueOf(Tag.class, str);
            }

            public static Tag[] values() {
                return (Tag[]) $VALUES.clone();
            }
        }

        public ClickSpan(String str, Object obj) {
            this.b = str;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickSpan)) {
                return false;
            }
            ClickSpan clickSpan = (ClickSpan) obj;
            return epx.f(this.b, clickSpan.b) && epx.f(this.c, clickSpan.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Object obj = this.c;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickSpan(actionTag=");
            sb.append(this.b);
            sb.append(", data=");
            return k73.c(sb, this.c, ')');
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class a extends OrderListAction {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 967719793;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class b extends OrderListAction {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 967750058;
        }

        public final String toString() {
            return "ClickCart";
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class c extends OrderListAction {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 967902667;
        }

        public final String toString() {
            return "ClickHelp";
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class d extends OrderListAction {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClickOrder(orderId="), this.b, ')');
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class e extends OrderListAction {
        public final int b;
        public final OrderPreview.ActionType c;

        public e(int i, OrderPreview.ActionType actionType) {
            this.b = i;
            this.c = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "ClickOrderAction(orderId=" + this.b + ", type=" + this.c + ')';
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class f extends OrderListAction {
        public final UserId b;
        public final long c;

        public f(long j, UserId userId) {
            this.b = userId;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickProduct(groupId=");
            sb.append(this.b);
            sb.append(", productId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class g extends OrderListAction {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -50545314;
        }

        public final String toString() {
            return "ClickRetry";
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class h extends OrderListAction {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1840975260;
        }

        public final String toString() {
            return "LoadNextOrders";
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class i extends OrderListAction {
        public final OrderPaymentResult b;

        public i(OrderPaymentResult orderPaymentResult) {
            this.b = orderPaymentResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PaymentComplete(result=" + this.b + ')';
        }
    }

    /* compiled from: OrderListAction.kt */
    public static final class j extends OrderListAction {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 431514685;
        }

        public final String toString() {
            return "Refresh";
        }
    }
}
