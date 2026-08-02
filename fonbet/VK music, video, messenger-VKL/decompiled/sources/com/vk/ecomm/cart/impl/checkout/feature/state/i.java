package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import kotlin.text.Regex;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.ho8;
import xsna.i7i0;
import xsna.qoy;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class i extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final CourierAddress c;
    public final i7i0 d;
    public final Regex e;
    public final String f;

    public i(String str, boolean z, CourierAddress courierAddress, i7i0 i7i0Var, Regex regex, String str2) {
        this.a = str;
        this.b = z;
        this.c = courierAddress;
        this.d = i7i0Var;
        this.e = regex;
        this.f = str2;
    }

    public static i d(i iVar, CourierAddress courierAddress, i7i0 i7i0Var, int i) {
        String str = iVar.a;
        boolean z = iVar.b;
        if ((i & 4) != 0) {
            courierAddress = iVar.c;
        }
        CourierAddress courierAddress2 = courierAddress;
        if ((i & 8) != 0) {
            i7i0Var = iVar.d;
        }
        return new i(str, z, courierAddress2, i7i0Var, iVar.e, iVar.f);
    }

    @Override // xsna.f060
    public final k a() {
        CourierAddress courierAddress;
        i7i0 i7i0Var = this.d;
        return (i7i0Var.a && ((courierAddress = this.c) == null || courierAddress.b.length() == 0)) ? new k.a(d(this, null, i7i0.a(i7i0Var, i7i0Var.f), 55)) : k.b.a;
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return epx.f(this.a, iVar.a) && this.b == iVar.b && epx.f(this.c, iVar.c) && epx.f(this.d, iVar.d) && epx.f(this.e, iVar.e) && epx.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        CourierAddress courierAddress = this.c;
        int hashCode = (this.d.hashCode() + ((b + (courierAddress == null ? 0 : courierAddress.hashCode())) * 31)) * 31;
        Regex regex = this.e;
        int hashCode2 = (hashCode + (regex == null ? 0 : regex.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectCourierDeliveryPointField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", selectField=");
        sb.append(this.d);
        sb.append(", validationRegex=");
        sb.append(this.e);
        sb.append(", validationErrorMsg=");
        return ho8.a(sb, this.f, ')');
    }
}
