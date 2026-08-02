package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.pk50;
import xsna.shy;
import xsna.vu5;

/* compiled from: OrderListEvent.kt */
/* loaded from: classes18.dex */
public interface c extends pk50 {

    /* compiled from: OrderListEvent.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1257633693;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class b implements c {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("GoToCart(cartQuantity="), this.a, ')');
        }
    }

    /* compiled from: OrderListEvent.kt */
    /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c$c, reason: collision with other inner class name */
    public static final class C0996c implements c {
        public static final C0996c a = new C0996c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0996c);
        }

        public final int hashCode() {
            return -2067351150;
        }

        public final String toString() {
            return "GoToHelp";
        }
    }

    /* compiled from: OrderListEvent.kt */
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
            return ho8.a(new StringBuilder("OpenExternalLink(link="), this.a, ')');
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class e implements c {
        public final UserId a;
        public final long b;

        public e(long j, UserId userId) {
            this.a = userId;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenGood(groupId=");
            sb.append(this.a);
            sb.append(", productId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class f implements c {
        public final UserId a;

        public f(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenGroup(groupId="), this.a, ')');
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class g implements c {
        public final UserId a;
        public final int b;
        public final String c;

        public g(UserId userId, int i, String str) {
            this.a = userId;
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenMarketOrder(userId=");
            sb.append(this.a);
            sb.append(", orderId=");
            sb.append(this.b);
            sb.append(", displayedOrderId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class h implements c {
        public final OrderPaymentParameters a;

        public h(OrderPaymentParameters orderPaymentParameters) {
            this.a = orderPaymentParameters;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenPayment(params=" + this.a + ')';
        }
    }

    /* compiled from: OrderListEvent.kt */
    public static final class i implements c {
        public final ReviewSuggestion a;

        public i(ReviewSuggestion reviewSuggestion) {
            this.a = reviewSuggestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowReviewSuggestion(suggest=" + this.a + ')';
        }
    }

    /* compiled from: OrderListEvent.kt */
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
