package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.epx;
import xsna.gy80;
import xsna.oq;
import xsna.vu5;
import xsna.yl50;

/* compiled from: OrderListPatch.kt */
/* loaded from: classes18.dex */
public interface d extends yl50 {

    /* compiled from: OrderListPatch.kt */
    public static final class a implements d {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("CartCounterResult(count="), this.a, ')');
        }
    }

    /* compiled from: OrderListPatch.kt */
    public interface b extends d {

        /* compiled from: OrderListPatch.kt */
        public static final class a implements b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failure(error="), this.a, ')');
            }
        }

        /* compiled from: OrderListPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d$b$b, reason: collision with other inner class name */
        public static final class C0997b implements b {
            public final gy80 a;

            public C0997b(gy80 gy80Var) {
                this.a = gy80Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0997b) && epx.f(this.a, ((C0997b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Result(response=" + this.a + ')';
            }
        }

        /* compiled from: OrderListPatch.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 356209188;
            }

            public final String toString() {
                return "Start";
            }
        }
    }

    /* compiled from: OrderListPatch.kt */
    public interface c extends d {

        /* compiled from: OrderListPatch.kt */
        public static final class a implements c {
            public final ArrayList a;

            public a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("Complete(orders="), this.a);
            }
        }

        /* compiled from: OrderListPatch.kt */
        public static final class b implements c {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failed(error="), this.a, ')');
            }
        }

        /* compiled from: OrderListPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d$c$c, reason: collision with other inner class name */
        public static final class C0998c implements c {
            public static final C0998c a = new C0998c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0998c);
            }

            public final int hashCode() {
                return 1428055342;
            }

            public final String toString() {
                return "Start";
            }
        }
    }

    /* compiled from: OrderListPatch.kt */
    /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d$d, reason: collision with other inner class name */
    public interface InterfaceC0999d extends d {

        /* compiled from: OrderListPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d$d$a */
        public static final class a implements InterfaceC0999d {
            public final OrderPaymentResult a;

            public a(OrderPaymentResult orderPaymentResult) {
                this.a = orderPaymentResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Complete(result=" + this.a + ')';
            }
        }

        /* compiled from: OrderListPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d$d$b */
        public static final class b implements InterfaceC0999d {
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
                return vu5.b(new StringBuilder("Start(orderId="), this.a, ')');
            }
        }
    }

    /* compiled from: OrderListPatch.kt */
    public static final class e implements d {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 800604827;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: OrderListPatch.kt */
    public static final class f implements d {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ViewOrder(orderId="), this.a, ')');
        }
    }
}
