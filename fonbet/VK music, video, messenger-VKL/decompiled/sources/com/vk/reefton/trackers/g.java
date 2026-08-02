package com.vk.reefton.trackers;

import com.vk.reefton.dto.ReefLocationSource;
import com.vk.reefton.literx.completable.CompletableCreate;
import com.vk.reefton.trackers.l;
import xsna.aof0;
import xsna.azz;
import xsna.b8h0;
import xsna.fhr;
import xsna.fnf0;
import xsna.l7i;
import xsna.ml1;
import xsna.qof0;
import xsna.tnf0;
import xsna.unf0;
import xsna.vof0;
import xsna.xnf0;

/* compiled from: ReefLocationTracker.kt */
/* loaded from: classes5.dex */
public final class g extends l {
    public final fnf0 a;
    public final xnf0 b;
    public final unf0 c;
    public final aof0 d;
    public final b8h0 e;
    public fhr f;

    /* compiled from: ReefLocationTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            fnf0 a = qof0Var.a();
            xnf0 xnf0Var = qof0Var.j;
            if (xnf0Var == null) {
                xnf0Var = qof0Var.k.invoke();
                qof0Var.j = xnf0Var;
            }
            unf0 unf0Var = qof0Var.l;
            if (unf0Var == null) {
                unf0Var = qof0Var.m.invoke();
                qof0Var.l = unf0Var;
            }
            return new g(a, xnf0Var, unf0Var, qof0Var.b(), qof0Var.e());
        }
    }

    public g(fnf0 fnf0Var, xnf0 xnf0Var, unf0 unf0Var, aof0 aof0Var, b8h0 b8h0Var) {
        this.a = fnf0Var;
        this.b = xnf0Var;
        this.c = unf0Var;
        this.d = aof0Var;
        this.e = b8h0Var;
        new azz(ReefLocationSource.UNKNOWN, null, null, null, null, null, false, null);
        this.f = new fhr(null, null);
    }

    public static azz g(tnf0 tnf0Var) {
        ReefLocationSource reefLocationSource = tnf0Var.a;
        double d = tnf0Var.b;
        double d2 = tnf0Var.c;
        long j = tnf0Var.d;
        float f = tnf0Var.e;
        float f2 = tnf0Var.f;
        return new azz(reefLocationSource, Double.valueOf(d2), Double.valueOf(d), Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), tnf0Var.g, tnf0Var.h);
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new CompletableCreate(new ml1(25, this, vof0Var));
    }

    public final void h(vof0 vof0Var, tnf0 tnf0Var) {
        azz g = g(tnf0Var);
        vof0Var.a(new azz(g.a, g.b, g.c, g.d, g.e, g.f, g.g, g.h));
    }
}
