package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.state.OrderError;
import xsna.epx;
import xsna.iu80;
import xsna.yl50;

/* compiled from: OrderPatch.kt */
/* loaded from: classes18.dex */
public interface d extends yl50 {

    /* compiled from: OrderPatch.kt */
    public interface a extends d {

        /* compiled from: OrderPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.order.presentation.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C0992a implements a {
            public final OrderError a;

            public C0992a(OrderError orderError) {
                this.a = orderError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0992a) && this.a == ((C0992a) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Failed(error=" + this.a + ')';
            }
        }

        /* compiled from: OrderPatch.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1130788092;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: OrderPatch.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 734159423;
            }

            public final String toString() {
                return "StartRefresh";
            }
        }

        /* compiled from: OrderPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.order.presentation.mvi.d$a$d, reason: collision with other inner class name */
        public static final class C0993d implements a {
            public final iu80 a;

            public C0993d(iu80 iu80Var) {
                this.a = iu80Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0993d) && epx.f(this.a, ((C0993d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(order=" + this.a + ')';
            }
        }
    }

    /* compiled from: OrderPatch.kt */
    public interface b extends d {

        /* compiled from: OrderPatch.kt */
        public static final class a implements b {
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

        /* compiled from: OrderPatch.kt */
        /* renamed from: com.vk.ecomm.orders.impl.order.presentation.mvi.d$b$b, reason: collision with other inner class name */
        public static final class C0994b implements b {
            public static final C0994b a = new C0994b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0994b);
            }

            public final int hashCode() {
                return -250558854;
            }

            public final String toString() {
                return "Start";
            }
        }
    }
}
