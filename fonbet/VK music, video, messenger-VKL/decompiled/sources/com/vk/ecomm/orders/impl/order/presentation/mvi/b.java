package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.ecomm.orders.impl.order.presentation.mvi.f;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bfm;
import xsna.gx80;
import xsna.on50;
import xsna.vj50;

/* compiled from: OrderBootstrapper.kt */
/* loaded from: classes18.dex */
public final class b implements vj50<gx80, on50, f, d> {
    public final bfm a;

    public b(bfm bfmVar) {
        this.a = bfmVar;
    }

    @Override // xsna.vj50
    public final gx80 a() {
        return (gx80) this.a.invoke();
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ d b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<f> c(gx80 gx80Var) {
        return gx80Var.e == null ? Collections.singletonList(f.a.b) : EmptyList.b;
    }
}
