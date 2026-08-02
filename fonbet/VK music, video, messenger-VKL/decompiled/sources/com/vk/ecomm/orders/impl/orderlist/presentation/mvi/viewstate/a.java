package com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate;

import defpackage.q0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.epx;
import xsna.imy;
import xsna.lm50;
import xsna.mr;
import xsna.qoy;

/* compiled from: OrderListViewState.kt */
/* loaded from: classes18.dex */
public interface a extends lm50 {

    /* compiled from: OrderListViewState.kt */
    /* renamed from: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a$a, reason: collision with other inner class name */
    public static final class C1000a implements a {
        public static final C1000a b = new C1000a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1000a);
        }

        public final int hashCode() {
            return -1712493664;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: OrderListViewState.kt */
    public static final class b implements a {
        public final imy b;

        public b(imy imyVar) {
            this.b = imyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            imy imyVar = this.b;
            if (imyVar == null) {
                return 0;
            }
            return imyVar.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.b + ')';
        }
    }

    /* compiled from: OrderListViewState.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1226538703;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: OrderListViewState.kt */
    public static final class d implements a {
        public final List b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public d(ListBuilder listBuilder, boolean z, boolean z2, boolean z3) {
            this.b = listBuilder;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderList(ordersItems=");
            mr.c(", isPaginationAvailable=", sb, this.b);
            sb.append(this.c);
            sb.append(", isBlockingProgress=");
            sb.append(this.d);
            sb.append(", isRefreshing=");
            return q0.a(sb, this.e, ')');
        }
    }
}
