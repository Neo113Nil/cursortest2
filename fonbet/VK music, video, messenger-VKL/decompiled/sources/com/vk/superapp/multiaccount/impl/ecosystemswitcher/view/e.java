package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.d;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.wr0;

/* compiled from: EcosystemProfileReducer.kt */
/* loaded from: classes6.dex */
public final class e extends dm50<i, d, h> {
    @Override // xsna.dm50
    public final h c(h hVar, d dVar) {
        h hVar2 = hVar;
        d dVar2 = dVar;
        if (dVar2 instanceof d.c) {
            return h.a(hVar2, null, ((d.c) dVar2).b, 1);
        }
        if (dVar2 instanceof d.b) {
            return h.a(hVar2, new h.a.b(((d.b) dVar2).b), null, 2);
        }
        if (dVar2 instanceof d.C1895d) {
            return h.a(hVar2, new h.a.c(((d.C1895d) dVar2).b), null, 2);
        }
        if (dVar2 instanceof d.a) {
            return h.a(hVar2, new h.a.C1897a(((d.a) dVar2).b), null, 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new wr0(14)));
    }

    @Override // xsna.dm50
    public final void h(h hVar, i iVar) {
        f(iVar.a, hVar);
    }
}
