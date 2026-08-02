package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.f;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.f4z;
import xsna.h87;
import xsna.hsk0;
import xsna.p87;
import xsna.p97;
import xsna.q97;
import xsna.ug5;
import xsna.wj50;
import xsna.wk50;

/* compiled from: BiometricsLockSecuritySetupFeature.kt */
/* loaded from: classes15.dex */
public final class b extends wk50<p87, h87, a, c> {
    public final p97 f;
    public final io.reactivex.rxjava3.subjects.d<q97> g;
    public final f4z h;

    public b(p97 p97Var, io.reactivex.rxjava3.subjects.d<q97> dVar) {
        super(a.b.b, new d(new h87(false, false)));
        this.f = p97Var;
        this.g = dVar;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(h87 h87Var, a aVar) {
        a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            T(c.C0437c.b);
            return;
        }
        boolean z = aVar2 instanceof a.c;
        f4z f4zVar = this.h;
        if (z) {
            f4zVar.b(f.a.a);
            return;
        }
        if (aVar2 instanceof a.h) {
            f4zVar.b(f.d.a);
            return;
        }
        boolean z2 = aVar2 instanceof a.g;
        p97 p97Var = this.f;
        if (z2) {
            p97Var.i(false);
            V(false);
            f4zVar.b(f.b.a);
            return;
        }
        if (aVar2 instanceof a.C0436a) {
            T(c.b.b);
            return;
        }
        if (!(aVar2 instanceof a.d)) {
            if (aVar2 instanceof a.e) {
                T(new c.a());
                return;
            } else {
                if (!(aVar2 instanceof a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new c.d());
                return;
            }
        }
        boolean z3 = ((a.d) aVar2).b;
        p97Var.i(z3);
        if (z3) {
            long currentTimeMillis = System.currentTimeMillis();
            p97Var.l(currentTimeMillis);
            this.g.onNext(new q97.i(currentTimeMillis));
            V(true);
            f4zVar.b(f.b.a);
        }
    }

    public final wj50<f> U() {
        return this.h;
    }

    public final void V(boolean z) {
        Iterator it = e43.l(new hsk0.b(z), new hsk0.a(ug5.a.b.a()), new hsk0.c(false), new hsk0.e(false), new hsk0.d(false)).iterator();
        while (it.hasNext()) {
            this.h.b(new f.e((hsk0) it.next()));
        }
    }
}
