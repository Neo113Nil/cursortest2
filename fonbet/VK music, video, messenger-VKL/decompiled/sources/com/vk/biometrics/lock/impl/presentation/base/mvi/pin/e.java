package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.brm0;
import xsna.d77;
import xsna.dm50;
import xsna.epx;
import xsna.erm0;
import xsna.o3v;
import xsna.p57;
import xsna.vr0;
import xsna.wla0;
import xsna.x77;
import xsna.xla0;

/* compiled from: BiometricsLockPinReducer.kt */
/* loaded from: classes15.dex */
public final class e extends dm50<x77, d, h> {
    public final boolean d;

    public e(boolean z) {
        super(new h(0));
        this.d = z;
    }

    public static h i(h hVar, xla0 xla0Var) {
        return h.a(hVar, d77.a(hVar.b, null, null, xla0Var, null, null, 27), null, null, false, 14);
    }

    public static Pair k(h hVar, boolean z, UnlockType unlockType) {
        return new Pair(h.a(hVar, d77.a(hVar.b, brm0.x(4, "*"), null, null, null, unlockType, 14), null, null, false, 14), z ? new xla0.d() : new xla0.b());
    }

    @Override // xsna.dm50
    public final h c(h hVar, d dVar) {
        h hVar2 = hVar;
        d dVar2 = dVar;
        d77 d77Var = hVar2.b;
        p57 p57Var = hVar2.d;
        c cVar = hVar2.c;
        if (dVar2 instanceof d.h) {
            d.h hVar3 = (d.h) dVar2;
            wla0 wla0Var = hVar3.d;
            return new h(new d77(wla0Var, 23), hVar3.b, p57.a(p57Var, wla0Var.a >= 6, false, 14), hVar3.c && !wla0Var.b);
        }
        if (dVar2 instanceof d.a) {
            h a = h.a(hVar2, d77.a(d77Var, d77Var.a + ((d.a) dVar2).b, null, new xla0.c(), null, null, 26), null, null, false, 6);
            if (!d77Var.d.b) {
                return a;
            }
            Pair k = k(hVar2, false, UnlockType.PASSWORD);
            return i((h) k.d(), (xla0) k.g());
        }
        if (dVar2 instanceof d.j) {
            d77 a2 = d77.a(hVar2.b, erm0.w0(1, d77Var.a), null, null, null, null, 30);
            return h.a(hVar2, a2, null, null, j(a2, cVar), 6);
        }
        if (dVar2 instanceof d.e) {
            return h.a(hVar2, d77.a(d77Var, "", d77Var.a, null, null, null, 28), c.C0426c.a, null, false, 12);
        }
        if (dVar2 instanceof d.k) {
            return i(hVar2, new xla0.d());
        }
        if (dVar2 instanceof d.f) {
            h i = i(hVar2, new xla0.b());
            if (!(cVar instanceof c.a)) {
                return i;
            }
            d77 d77Var2 = i.b;
            wla0 wla0Var2 = d77Var2.d;
            int i2 = wla0Var2.a + 1;
            return h.a(i, d77.a(d77Var2, null, null, null, wla0.a(wla0Var2, i2), null, 23), null, p57.a(p57Var, i2 >= 6, false, 14), false, 10);
        }
        if (dVar2 instanceof d.i) {
            return h.a(hVar2, null, null, p57.a(p57Var, false, true, 11), false, 11);
        }
        if (dVar2 instanceof d.g) {
            o3v o3vVar = ((d.g) dVar2).b;
            if (o3vVar instanceof o3v.b) {
                return h.a(hVar2, null, null, p57.a(p57Var, false, false, 11), false, 11);
            }
            if (o3vVar instanceof o3v.a) {
                return h.a(hVar2, null, null, new p57(false, false, false, false), false, 11);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (dVar2 instanceof d.b) {
            Pair k2 = k(hVar2, ((d.b) dVar2).b, UnlockType.BIOMETRICS);
            return i((h) k2.d(), (xla0) k2.g());
        }
        if (dVar2 instanceof d.C0427d) {
            d77 a3 = d77.a(d77Var, "", null, new xla0.a(), null, null, 26);
            return h.a(hVar2, a3, null, null, j(a3, cVar), 6);
        }
        if (dVar2 instanceof d.c) {
            return h.a(hVar2, null, null, p57.a(p57Var, false, false, 7), false, 3);
        }
        if (dVar2 instanceof d.l) {
            return h.a(hVar2, null, null, p57.a(p57Var, false, false, 13), false, 11);
        }
        if (!(dVar2 instanceof d.m)) {
            throw new NoWhenBranchMatchedException();
        }
        d77 a4 = d77.a(d77Var, null, null, null, ((d.m) dVar2).b, null, 23);
        return h.a(hVar2, a4, null, null, j(a4, cVar), 6);
    }

    @Override // xsna.dm50
    public final x77 d() {
        return new x77(e(new vr0(2)));
    }

    @Override // xsna.dm50
    public final void h(h hVar, x77 x77Var) {
        f(x77Var.a, hVar);
    }

    public final boolean j(d77 d77Var, c cVar) {
        return d77Var.a.length() == 0 && epx.f(cVar, c.e.a) && !d77Var.d.b && this.d;
    }
}
