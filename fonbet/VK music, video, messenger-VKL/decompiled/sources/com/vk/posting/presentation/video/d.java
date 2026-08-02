package com.vk.posting.presentation.video;

import com.vk.posting.presentation.video.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.d3t0;
import xsna.dm50;
import xsna.epx;
import xsna.t9o0;

/* compiled from: VideoPickerReducer.kt */
/* loaded from: classes5.dex */
public final class d extends dm50<h, c, d3t0> {
    @Override // xsna.dm50
    public final d3t0 c(d3t0 d3t0Var, c cVar) {
        d3t0 d3t0Var2 = d3t0Var;
        c cVar2 = cVar;
        if (!(cVar2 instanceof c.b)) {
            if (cVar2 instanceof c.a) {
                return d3t0.a(d3t0Var2, null, false, null, true, ((c.a) cVar2).b, 15);
            }
            throw new NoWhenBranchMatchedException();
        }
        c.b bVar = (c.b) cVar2;
        if (epx.f(bVar, c.b.C1539b.b)) {
            return d3t0.a(d3t0Var2, null, true, null, false, null, 51);
        }
        if (bVar instanceof c.b.a) {
            return d3t0.a(d3t0Var2, null, false, ((c.b.a) bVar).b, false, null, 35);
        }
        if (bVar instanceof c.b.d) {
            return d3t0.a(d3t0Var2, ((c.b.d) bVar).b, false, null, false, null, 33);
        }
        if (bVar instanceof c.b.C1540c) {
            return d3t0.a(d3t0Var2, null, false, null, false, null, 47);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final h d() {
        return new h(e(new t9o0(6)));
    }

    @Override // xsna.dm50
    public final void h(d3t0 d3t0Var, h hVar) {
        f(hVar.a, d3t0Var);
    }
}
