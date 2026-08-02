package com.vk.ecomm.orders.impl.order.presentation.mvi;

import xsna.hn50;
import xsna.ln50;
import xsna.on50;

/* compiled from: OrderTask.kt */
/* loaded from: classes18.dex */
public interface f extends hn50 {

    /* compiled from: OrderTask.kt */
    public static final class a implements f {
        public static final a b = new a();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -2036290151;
        }

        public final String toString() {
            return "LoadOrder";
        }
    }

    /* compiled from: OrderTask.kt */
    public static final class b implements f {
        public static final b b = new b();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 290891294;
        }

        public final String toString() {
            return "LoadPaymentUrl";
        }
    }

    /* compiled from: OrderTask.kt */
    public static final class c implements f {
        public static final c b = new c();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 714138626;
        }

        public final String toString() {
            return "RefreshOrder";
        }
    }
}
