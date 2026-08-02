package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import xsna.hn50;
import xsna.ln50;
import xsna.on50;
import xsna.vu5;

/* compiled from: OrderListTask.kt */
/* loaded from: classes18.dex */
public interface f extends hn50 {

    /* compiled from: OrderListTask.kt */
    public static final class a implements f {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ChangeOrderAsViewed(orderId="), this.b, ')');
        }
    }

    /* compiled from: OrderListTask.kt */
    public static final class b implements f {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("GetPaymentParams(orderId="), this.b, ')');
        }
    }

    /* compiled from: OrderListTask.kt */
    public static final class c implements f {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.b == cVar.b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(5) * 31);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LoadNextOrders(count=5, offset="), this.b, ')');
        }
    }

    /* compiled from: OrderListTask.kt */
    public static final class d implements f {
        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(5);
        }

        public final String toString() {
            return "LoadOrderList(ordersPerRequest=5)";
        }
    }
}
