package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class h extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final InputField e;

    public h(String str, boolean z, String str2, boolean z2, InputField inputField) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = inputField;
    }

    public static h d(h hVar, InputField inputField, int i) {
        String str = hVar.a;
        boolean z = hVar.b;
        String str2 = hVar.c;
        boolean z2 = (i & 8) != 0 ? hVar.d : false;
        if ((i & 16) != 0) {
            inputField = hVar.e;
        }
        return new h(str, z, str2, z2, inputField);
    }

    @Override // xsna.f060
    public final k a() {
        InputField inputField = this.e;
        return inputField.i != null ? new k.a(this) : inputField.a();
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.a, hVar.a) && this.b == hVar.b && epx.f(this.c, hVar.c) && this.d == hVar.d && epx.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(urd0.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PromoCodeField(id=" + this.a + ", affectsPrice=" + this.b + ", prompt=" + this.c + ", isHidden=" + this.d + ", inputField=" + this.e + ')';
    }
}
