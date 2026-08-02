package com.vk.managed_groups.impl.list;

import com.vk.managed_groups.impl.list.e;
import xsna.dm50;
import xsna.qm0;
import xsna.si00;

/* compiled from: ManagedGroupsListReducer.kt */
/* loaded from: classes3.dex */
public final class f extends dm50<g, e, si00> {
    @Override // xsna.dm50
    public final si00 c(si00 si00Var, e eVar) {
        e eVar2 = eVar;
        return eVar2 instanceof e.a ? new si00(((e.a) eVar2).b) : si00Var;
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new qm0(29)));
    }

    @Override // xsna.dm50
    public final void h(si00 si00Var, g gVar) {
        f(gVar.a, si00Var);
    }
}
