package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.product_list.presentation.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aqd0;
import xsna.bm50;
import xsna.c5g;
import xsna.epx;
import xsna.vpd0;

/* compiled from: ProductListMviReducer.kt */
/* loaded from: classes18.dex */
public final class l implements bm50<aqd0, k> {
    @Override // xsna.bm50
    public final aqd0 a(aqd0 aqd0Var, k kVar) {
        aqd0 aqd0Var2 = aqd0Var;
        k kVar2 = kVar;
        if (kVar2 instanceof k.e) {
            return aqd0.a(aqd0Var2, true, null, null, 27);
        }
        if (kVar2 instanceof k.a) {
            return aqd0.a(aqd0Var2, false, ((k.a) kVar2).a, null, 3);
        }
        if (kVar2 instanceof k.b) {
            return aqd0.a(aqd0Var2, false, null, ((k.b) kVar2).a, 11);
        }
        if (!(kVar2 instanceof k.c)) {
            if (kVar2 instanceof k.d) {
                return aqd0.a(aqd0Var2, false, ((k.d) kVar2).a, null, 23);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<vpd0> list = aqd0Var2.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (vpd0 vpd0Var : list) {
            k.c cVar = (k.c) kVar2;
            if (vpd0Var.a == cVar.a && epx.f(vpd0Var.b, cVar.b)) {
                vpd0Var = vpd0.a(vpd0Var, cVar.c, false, 261887);
            }
            arrayList.add(vpd0Var);
        }
        return aqd0.a(aqd0Var2, false, arrayList, null, 23);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        return true;
    }
}
