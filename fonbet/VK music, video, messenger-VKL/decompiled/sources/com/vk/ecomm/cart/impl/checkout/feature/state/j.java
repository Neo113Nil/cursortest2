package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import java.util.List;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.fw3;
import xsna.i7i0;
import xsna.qoy;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class j extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final DeliveryPoint c;
    public final List<Integer> d;
    public final i7i0 e;

    public j(String str, boolean z, DeliveryPoint deliveryPoint, List<Integer> list, i7i0 i7i0Var) {
        this.a = str;
        this.b = z;
        this.c = deliveryPoint;
        this.d = list;
        this.e = i7i0Var;
    }

    public static j d(j jVar, DeliveryPoint deliveryPoint, i7i0 i7i0Var, int i) {
        String str = jVar.a;
        boolean z = jVar.b;
        if ((i & 4) != 0) {
            deliveryPoint = jVar.c;
        }
        return new j(str, z, deliveryPoint, jVar.d, i7i0Var);
    }

    @Override // xsna.f060
    public final k a() {
        i7i0 i7i0Var = this.e;
        return (i7i0Var.a && this.c == null) ? new k.a(d(this, null, i7i0.a(i7i0Var, i7i0Var.f), 15)) : k.b.a;
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return epx.f(this.a, jVar.a) && this.b == jVar.b && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        DeliveryPoint deliveryPoint = this.c;
        return this.e.hashCode() + fw3.a((b + (deliveryPoint == null ? 0 : deliveryPoint.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "SelectDeliveryPointField(id=" + this.a + ", affectsPrice=" + this.b + ", selected=" + this.c + ", availableServices=" + this.d + ", selectField=" + this.e + ')';
    }
}
