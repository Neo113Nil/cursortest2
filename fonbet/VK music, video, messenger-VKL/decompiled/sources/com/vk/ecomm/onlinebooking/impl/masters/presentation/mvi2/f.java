package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm50;
import xsna.nr7;

/* compiled from: BookingMastersScreenReducer.kt */
/* loaded from: classes18.dex */
public final class f implements bm50<nr7, e> {
    @Override // xsna.bm50
    public final nr7 a(nr7 nr7Var, e eVar) {
        nr7 nr7Var2 = nr7Var;
        e eVar2 = eVar;
        if (eVar2 instanceof e.c) {
            return nr7.a(nr7Var2, ((e.c) eVar2).a, false, null);
        }
        if (eVar2 instanceof e.b) {
            return nr7.a(nr7Var2, null, true, null);
        }
        if (!(eVar2 instanceof e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        e.a aVar = (e.a) eVar2;
        return nr7.a(nr7Var2, null, false, new nr7.a(com.vk.ecomm.onlinebooking.impl.common.b.c(aVar.a), aVar.b));
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(e eVar) {
        return true;
    }
}
