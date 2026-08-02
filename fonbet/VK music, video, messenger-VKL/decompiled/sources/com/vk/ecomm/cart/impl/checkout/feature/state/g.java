package com.vk.ecomm.cart.impl.checkout.feature.state;

import java.util.List;
import xsna.b7r;
import xsna.epx;
import xsna.ms9;
import xsna.oq;
import xsna.qoy;
import xsna.xw80;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class g extends b7r {
    public final String a;
    public final a b;

    /* compiled from: CheckoutFields.kt */
    public interface a {

        /* compiled from: CheckoutFields.kt */
        /* renamed from: com.vk.ecomm.cart.impl.checkout.feature.state.g$a$a, reason: collision with other inner class name */
        public static final class C0926a implements a {
            public final Throwable a;

            public C0926a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0926a) && epx.f(this.a, ((C0926a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CheckoutFields.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: CheckoutFields.kt */
        public static final class c implements a {
            public final List<xw80> a;

            public c(List<xw80> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Result(products="), this.a);
            }
        }
    }

    public g(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public static g d(g gVar, a aVar) {
        String str = gVar.a;
        gVar.getClass();
        gVar.getClass();
        return new g(str, aVar);
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + qoy.b(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "OrderListField(id=" + this.a + ", affectsPrice=false, state=" + this.b + ')';
    }
}
