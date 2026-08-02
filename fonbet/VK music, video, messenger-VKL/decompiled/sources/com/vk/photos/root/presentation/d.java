package com.vk.photos.root.presentation;

import com.vk.photos.root.presentation.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.gzn;
import xsna.iga0;

/* compiled from: PhotosRootReducer.kt */
/* loaded from: classes4.dex */
public final class d extends dm50<i, c, iga0> {
    @Override // xsna.dm50
    public final iga0 c(iga0 iga0Var, c cVar) {
        iga0 iga0Var2 = iga0Var;
        c cVar2 = cVar;
        if (cVar2 instanceof c.d) {
            return iga0.a(iga0Var2, ((c.d) cVar2).b, false, false, false, 14);
        }
        if (cVar2 instanceof c.C1510c) {
            return iga0.a(iga0Var2, 0, ((c.C1510c) cVar2).b, false, false, 13);
        }
        if (cVar2 instanceof c.a) {
            return iga0.a(iga0Var2, 0, false, ((c.a) cVar2).b, false, 11);
        }
        if (cVar2 instanceof c.b) {
            return iga0.a(iga0Var2, 0, false, false, ((c.b) cVar2).b, 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new gzn(25)));
    }

    @Override // xsna.dm50
    public final void h(iga0 iga0Var, i iVar) {
        f(iVar.a, iga0Var);
    }
}
