package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.k73;
import xsna.lj50;
import xsna.vu5;
import xsna.zrp;

/* compiled from: OrderAction.kt */
/* loaded from: classes18.dex */
public abstract class OrderAction implements lj50 {

    /* compiled from: OrderAction.kt */
    public static final class ClickSpan extends OrderAction {
        public final String b;
        public final Object c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrderAction.kt */
        public static final class Tag {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Tag[] $VALUES;
            public static final Tag CLICK_RECIPIENT_PHONE;
            public static final Tag OPEN_CHAT_WITH_SELLER;
            public static final Tag OPEN_GROUP;
            public static final Tag OPEN_LINK;
            public static final Tag OPEN_MAP;

            static {
                Tag tag = new Tag("OPEN_GROUP", 0);
                OPEN_GROUP = tag;
                Tag tag2 = new Tag("OPEN_MAP", 1);
                OPEN_MAP = tag2;
                Tag tag3 = new Tag("CLICK_RECIPIENT_PHONE", 2);
                CLICK_RECIPIENT_PHONE = tag3;
                Tag tag4 = new Tag("OPEN_LINK", 3);
                OPEN_LINK = tag4;
                Tag tag5 = new Tag("OPEN_CHAT_WITH_SELLER", 4);
                OPEN_CHAT_WITH_SELLER = tag5;
                Tag[] tagArr = {tag, tag2, tag3, tag4, tag5};
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

    /* compiled from: OrderAction.kt */
    public static final class a extends OrderAction {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 886834961;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class b extends OrderAction {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 917112732;
        }

        public final String toString() {
            return "ClickPayment";
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class c extends OrderAction {
        public final UserId b;
        public final long c;

        public c(long j, UserId userId) {
            this.b = userId;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
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

    /* compiled from: OrderAction.kt */
    public static final class d extends OrderAction {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1736992190;
        }

        public final String toString() {
            return "ClickRetry";
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class e extends OrderAction {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.b, ')');
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class f extends OrderAction {
        public final OrderPaymentResult b;

        public f(OrderPaymentResult orderPaymentResult) {
            this.b = orderPaymentResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PaymentComplete(result=" + this.b + ')';
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class g extends OrderAction {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1088120867;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: OrderAction.kt */
    public static final class h extends OrderAction {
        public final long b;

        public h(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("ReviewProduct(productId="));
        }
    }
}
