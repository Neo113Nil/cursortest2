package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.f;
import java.util.Collections;
import java.util.List;
import xsna.dw80;
import xsna.on50;
import xsna.vj50;

/* compiled from: OrderListBootstrapper.kt */
/* loaded from: classes18.dex */
public final class b implements vj50<dw80, on50, f, d> {
    public final dw80 a;

    public b(dw80 dw80Var) {
        this.a = dw80Var;
    }

    @Override // xsna.vj50
    public final dw80 a() {
        return dw80.a(this.a, 0, null, null, 0, true, false, null, false, false, null, 2015);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ d b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<f> c(dw80 dw80Var) {
        f.d dVar = new f.d();
        if (!dw80Var.g) {
            dVar = null;
        }
        return Collections.singletonList(dVar);
    }
}
