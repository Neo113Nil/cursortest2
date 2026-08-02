package com.vk.ecomm.cart.impl.checkout.feature.state;

import java.util.List;
import xsna.b7r;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class d extends b7r {
    public final String a;
    public final boolean b;
    public final List<a> c;
    public final String d;

    /* compiled from: CheckoutFields.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeliveryOptionField(type=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", info=");
            sb.append(this.c);
            sb.append(", defaultMessage=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public d(String str, String str2, boolean z, List list) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = str2;
    }

    public static d d(d dVar, String str) {
        String str2 = dVar.a;
        boolean z = dVar.b;
        List<a> list = dVar.c;
        dVar.getClass();
        return new d(str2, str, z, list);
    }

    @Override // xsna.b7r
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.a, dVar.a) && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveriesField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=");
        sb.append(this.b);
        sb.append(", deliveries=");
        sb.append(this.c);
        sb.append(", selectedType=");
        return ho8.a(sb, this.d, ')');
    }
}
