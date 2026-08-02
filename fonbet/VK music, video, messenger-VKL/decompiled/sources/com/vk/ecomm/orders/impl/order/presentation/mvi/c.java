package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.pk50;
import xsna.vu5;

/* compiled from: OrderEvent.kt */
/* loaded from: classes18.dex */
public interface c extends pk50 {

    /* compiled from: OrderEvent.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1729794877;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class b implements c {
        public final UserId a;
        public final long b;
        public final String c;

        public b(long j, UserId userId, String str) {
            this.a = userId;
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChatWithSeller(groupId=");
            sb.append(this.a);
            sb.append(", contactId=");
            sb.append(this.b);
            sb.append(", displayOrderNumber=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: OrderEvent.kt */
    /* renamed from: com.vk.ecomm.orders.impl.order.presentation.mvi.c$c, reason: collision with other inner class name */
    public static final class C0991c implements c {
        public final UserId a;

        public C0991c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0991c) && epx.f(this.a, ((C0991c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenGroup(groupId="), this.a, ')');
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class d implements c {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class e implements c {
        public final UserId a;
        public final DeliveryPoint b;

        public e(UserId userId, DeliveryPoint deliveryPoint) {
            this.a = userId;
            this.b = deliveryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "OpenMap(groupId=" + this.a + ", deliveryPoint=" + this.b + ')';
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class f implements c {
        public final OrderPaymentParameters a;

        public f(OrderPaymentParameters orderPaymentParameters) {
            this.a = orderPaymentParameters;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenPayment(params=" + this.a + ')';
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class g implements c {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenPhoneDialer(phone="), this.a, ')');
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class h implements c {
        public final UserId a;
        public final long b;

        public h(long j, UserId userId) {
            this.a = userId;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenProduct(groupId=");
            sb.append(this.a);
            sb.append(", productId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class i implements c {
        public final int a;
        public final long b;

        public i(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && this.b == iVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewProduct(orderId=");
            sb.append(this.a);
            sb.append(", productId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: OrderEvent.kt */
    public static final class j implements c {
        public final OrderSnackbar a;

        public j(OrderSnackbar orderSnackbar) {
            this.a = orderSnackbar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(snackbar=" + this.a + ')';
        }
    }
}
