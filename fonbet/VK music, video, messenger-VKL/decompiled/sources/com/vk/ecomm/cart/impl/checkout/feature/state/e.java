package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import java.util.List;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class e extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final List<a> e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: CheckoutFields.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Option(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public e(String str, boolean z, boolean z2, String str2, List<a> list, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static e d(e eVar, String str, String str2, int i) {
        String str3 = eVar.a;
        boolean z = eVar.b;
        boolean z2 = eVar.c;
        String str4 = eVar.d;
        List<a> list = eVar.e;
        String str5 = eVar.f;
        String str6 = eVar.g;
        if ((i & 128) != 0) {
            str = eVar.h;
        }
        return new e(str3, z, z2, str4, list, str5, str6, str, str2);
    }

    @Override // xsna.f060
    public final k a() {
        String str;
        return (this.c && ((str = this.h) == null || str.length() == 0)) ? new k.a(d(this, null, this.g, 255)) : k.b.a;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g) && epx.f(this.h, eVar.h) && epx.f(this.i, eVar.i);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
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
        StringBuilder sb = new StringBuilder("DropdownField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=");
        sb.append(this.b);
        sb.append(", isRequired=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", options=");
        sb.append(this.e);
        sb.append(", placeholder=");
        sb.append(this.f);
        sb.append(", requiredErrorMsg=");
        sb.append(this.g);
        sb.append(", selectedOptionId=");
        sb.append(this.h);
        sb.append(", error=");
        return ho8.a(sb, this.i, ')');
    }
}
