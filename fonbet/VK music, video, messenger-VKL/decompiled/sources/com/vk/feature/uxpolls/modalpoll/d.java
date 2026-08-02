package com.vk.feature.uxpolls.modalpoll;

import com.vk.feature.uxpolls.modalpoll.c;
import com.vk.feature.uxpolls.modalpoll.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.i0r;

/* compiled from: UxPollsReducer.kt */
/* loaded from: classes18.dex */
public final class d extends dm50<g, c, f> {
    @Override // xsna.dm50
    public final f c(f fVar, c cVar) {
        f fVar2 = fVar;
        c cVar2 = cVar;
        if (cVar2 instanceof c.C1027c) {
            return f.a(fVar2, f.a.c.b, 2);
        }
        if (cVar2 instanceof c.b) {
            return f.a(fVar2, f.a.b.b, 2);
        }
        if (cVar2 instanceof c.a) {
            return f.a(fVar2, new f.a.C1029a(((c.a) cVar2).b), 2);
        }
        if (cVar2.equals(c.d.b)) {
            return f.a(fVar2, null, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new i0r(25)));
    }

    @Override // xsna.dm50
    public final void h(f fVar, g gVar) {
        f(gVar.a, fVar);
    }
}
