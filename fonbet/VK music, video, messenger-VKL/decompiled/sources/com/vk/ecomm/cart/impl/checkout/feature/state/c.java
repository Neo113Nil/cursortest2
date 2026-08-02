package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class c extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final a c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: CheckoutFields.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final Coordinates c;

        public a(int i, String str, Coordinates coordinates) {
            this.a = i;
            this.b = str;
            this.c = coordinates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            Coordinates coordinates = this.c;
            return a + (coordinates == null ? 0 : coordinates.hashCode());
        }

        public final String toString() {
            return "City(id=" + this.a + ", title=" + this.b + ", coordinates=" + this.c + ')';
        }
    }

    public c(String str, boolean z, a aVar, boolean z2, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = z;
        this.c = aVar;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static c d(c cVar, a aVar, String str, int i) {
        String str2 = cVar.a;
        boolean z = cVar.b;
        if ((i & 4) != 0) {
            aVar = cVar.c;
        }
        return new c(str2, z, aVar, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, str);
    }

    @Override // xsna.f060
    public final k a() {
        a aVar;
        return (this.d && ((aVar = this.c) == null || aVar.a == 0)) ? new k.a(d(this, null, this.g, 255)) : k.b.a;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c) && this.d == cVar.d && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        a aVar = this.c;
        int a2 = urd0.a(qoy.b((b + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=");
        sb.append(this.b);
        sb.append(", city=");
        sb.append(this.c);
        sb.append(", isRequired=");
        sb.append(this.d);
        sb.append(", label=");
        sb.append(this.e);
        sb.append(", placeholder=");
        sb.append(this.f);
        sb.append(", requiredErrorMsg=");
        sb.append(this.g);
        sb.append(", value=");
        sb.append(this.h);
        sb.append(", error=");
        return ho8.a(sb, this.i, ')');
    }
}
