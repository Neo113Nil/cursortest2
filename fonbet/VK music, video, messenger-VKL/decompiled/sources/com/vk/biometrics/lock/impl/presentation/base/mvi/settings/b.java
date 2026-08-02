package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.f4z;
import xsna.hsk0;
import xsna.k97;
import xsna.p97;
import xsna.q97;
import xsna.ug5;
import xsna.wj50;
import xsna.wk50;
import xsna.x87;

/* compiled from: BiometricsLockSettingsFeature.kt */
/* loaded from: classes15.dex */
public final class b extends wk50<k97, x87, a, c> {
    public final p97 f;
    public final boolean g;
    public final io.reactivex.rxjava3.subjects.d<q97> h;
    public final f4z i;

    public b(p97 p97Var, boolean z, io.reactivex.rxjava3.subjects.d<q97> dVar) {
        super(a.d.b, new d(new x87(0)));
        this.f = p97Var;
        this.g = z;
        this.h = dVar;
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(x87 x87Var, a aVar) {
        x87 x87Var2 = x87Var;
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.d;
        p97 p97Var = this.f;
        if (z) {
            boolean k = p97Var.k();
            long h = p97Var.h();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            T(new c.C0434c(k, this.g, h == timeUnit.toMillis(0L) ? ug5.b.b : h == timeUnit.toMillis(1L) ? ug5.c.b : h == timeUnit.toMillis(5L) ? ug5.a.b : h == timeUnit.toMillis(30L) ? ug5.d.b : ug5.a.b));
            return;
        }
        boolean z2 = aVar2 instanceof a.e;
        f4z f4zVar = this.i;
        if (z2) {
            f4zVar.b(f.c.a);
            return;
        }
        if (aVar2 instanceof a.k) {
            if (!x87Var2.b) {
                f4zVar.b(f.e.a);
                return;
            }
            f4zVar.b(new f.i(new hsk0.b(false)));
            p97Var.i(false);
            T(new c.e(false));
            return;
        }
        if (aVar2 instanceof a.C0429a) {
            f4zVar.b(new f.i(new hsk0.c(true)));
            f4zVar.b(f.a.a);
            return;
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            if (bVar instanceof a.b.C0431b) {
                f4zVar.b(new f.i(new hsk0.b(false)));
                T(c.a.b.b);
                return;
            } else if (bVar instanceof a.b.c) {
                T(c.a.C0433c.b);
                return;
            } else {
                if (!(bVar instanceof a.b.C0430a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(c.a.C0432a.b);
                return;
            }
        }
        if (aVar2 instanceof a.c) {
            f4zVar.b(new f.i(new hsk0.d(true)));
            T(c.b.b);
            return;
        }
        if (aVar2 instanceof a.f) {
            boolean z3 = ((a.f) aVar2).b;
            if (z3) {
                f4zVar.b(new f.i(new hsk0.b(true)));
            }
            p97Var.i(z3);
            T(new c.e(z3));
            return;
        }
        if (aVar2 instanceof a.h) {
            f4zVar.b(new f.C0435f(e43.l(ug5.b.b, ug5.c.b, ug5.a.b, ug5.d.b)));
            return;
        }
        if (aVar2 instanceof a.g) {
            ug5 ug5Var = ((a.g) aVar2).b;
            f4zVar.b(new f.i(new hsk0.a(ug5Var.a())));
            this.h.onNext(new q97.f(ug5Var.a()));
            p97Var.o(ug5Var.a());
            T(new c.d(ug5Var));
            return;
        }
        if (aVar2 instanceof a.i) {
            f4zVar.b(f.g.a);
        } else {
            if (!(aVar2 instanceof a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(f.h.a);
        }
    }

    public final wj50<f> U() {
        return this.i;
    }
}
