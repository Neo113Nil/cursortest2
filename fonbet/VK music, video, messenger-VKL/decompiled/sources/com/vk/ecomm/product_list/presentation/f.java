package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.product_list.presentation.ProductListMviTask;
import com.vk.ecomm.product_list.presentation.e;
import com.vk.ecomm.product_list.presentation.j;
import com.vk.ecomm.product_list.presentation.k;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.aqd0;
import xsna.lj50;
import xsna.on50;
import xsna.sj50;

/* compiled from: ProductListMviActor.kt */
/* loaded from: classes18.dex */
public final class f extends al50<aqd0, e, on50, ProductListMviTask, k, j> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        e eVar = (e) lj50Var;
        if (eVar instanceof e.c) {
            c(j.a.a);
            return;
        }
        boolean z = eVar instanceof e.f;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            a(new ProductListMviTask.LoadProducts(((aqd0) sj50Var.getCurrentState()).b.b));
            return;
        }
        if (eVar instanceof e.b) {
            e.b bVar = (e.b) eVar;
            c(new j.c(bVar.b, ((aqd0) sj50Var.getCurrentState()).b.e, ((aqd0) sj50Var.getCurrentState()).b.f, ((aqd0) sj50Var.getCurrentState()).b.g, ((aqd0) sj50Var.getCurrentState()).b.h, ((aqd0) sj50Var.getCurrentState()).b.c.get(bVar.b.s)));
            return;
        }
        if (eVar instanceof e.a) {
            c(new j.b(((e.a) eVar).b));
            return;
        }
        if (eVar instanceof e.d) {
            e.d dVar = (e.d) eVar;
            e(new k.c(dVar.b, dVar.c, dVar.d));
        } else if (eVar instanceof e.C1002e) {
            a(ProductListMviTask.RecalculateRestrictions.b);
        } else if (eVar instanceof e.h) {
            a(new ProductListMviTask.TrackProductView(((e.h) eVar).b));
        } else {
            if (!(eVar instanceof e.g)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new ProductListMviTask.TrackOpenProduct(((e.g) eVar).b));
        }
    }
}
