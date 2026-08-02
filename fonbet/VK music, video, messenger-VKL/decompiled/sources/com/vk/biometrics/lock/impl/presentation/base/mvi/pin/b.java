package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.d;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.m;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.time.DurationUnit;
import xsna.asu0;
import xsna.cm;
import xsna.d77;
import xsna.eoo;
import xsna.epo;
import xsna.epx;
import xsna.f4z;
import xsna.g54;
import xsna.gzs;
import xsna.i77;
import xsna.mh;
import xsna.ni0;
import xsna.p60;
import xsna.p97;
import xsna.ph3;
import xsna.q97;
import xsna.r4q0;
import xsna.r57;
import xsna.ux5;
import xsna.wj50;
import xsna.wk50;
import xsna.wla0;
import xsna.x67;
import xsna.x77;
import xsna.z67;
import xsna.zno;

/* compiled from: BiometricsLockPinFeature.kt */
/* loaded from: classes15.dex */
public final class b extends wk50<x77, h, a, d> {
    public final p97 f;
    public final c g;
    public final boolean h;
    public final io.reactivex.rxjava3.subjects.d<q97> i;
    public final f4z j;
    public final epo k;

    public b(p97 p97Var, c cVar, boolean z, io.reactivex.rxjava3.subjects.d<q97> dVar) {
        super(a.g.b, new e(z));
        this.f = p97Var;
        this.g = cVar;
        this.h = z;
        this.i = dVar;
        this.j = new f4z();
        epo epoVar = new epo();
        epoVar.b = this;
        this.k = epoVar;
    }

    public static void V(b bVar, gzs gzsVar) {
        zno.a aVar = zno.c;
        int i = 5;
        bVar.e.b(q.T(gzsVar).A(zno.e(eoo.e(200, DurationUnit.MILLISECONDS)), TimeUnit.MILLISECONDS).subscribe(new ph3(new p60(i), i)));
    }

    @Override // xsna.wk50
    public final void N(h hVar, a aVar) {
        h hVar2 = hVar;
        a aVar2 = aVar;
        d77 d77Var = hVar2.b;
        boolean z = aVar2 instanceof a.g;
        p97 p97Var = this.f;
        char c = 1;
        f4z f4zVar = this.j;
        if (z) {
            ux5 b = p97Var.b();
            Object obj = r57.a;
            long a = (r57.a(b.b()) + b.a()) - System.currentTimeMillis();
            if (a > 0) {
                f4zVar.b(i77.a);
                W(a);
            }
            c.e eVar = c.e.a;
            c cVar = this.g;
            T(new d.h(cVar, epx.f(cVar, eVar) && this.h && a <= 0, new wla0(b.a, a > 0 && epx.f(cVar, eVar), a)));
            return;
        }
        if (aVar2 instanceof a.h) {
            f4zVar.b(new g.b(false));
            return;
        }
        if (aVar2 instanceof a.i) {
            int i = ((a.i) aVar2).b;
            if (d77Var.a.length() < 4) {
                T(new d.a(i));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.k) {
            T(d.j.b);
            return;
        }
        if (aVar2 instanceof a.c) {
            V(this, new cm(3, this, hVar2));
            return;
        }
        if (aVar2 instanceof a.d) {
            V(this, new mh(this, 11));
            return;
        }
        if (aVar2 instanceof a.j) {
            T(d.i.b);
            return;
        }
        if (aVar2 instanceof a.f) {
            T(new d.g(((a.f) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.C0425a) {
            T(new d.b(((a.C0425a) aVar2).b, UnlockType.BIOMETRICS));
            return;
        }
        if (aVar2 instanceof a.b) {
            p97Var.i(false);
            T(d.c.b);
            return;
        }
        if (aVar2 instanceof a.l) {
            T(d.l.b);
            return;
        }
        if (aVar2 instanceof a.e) {
            V(this, new ni0(c == true ? 1 : 0, this, hVar2));
            return;
        }
        if (aVar2 instanceof a.n) {
            T(new d.m(wla0.a(((a.n) aVar2).b, d77Var.d.a)));
        } else {
            if (!(aVar2 instanceof a.m)) {
                throw new NoWhenBranchMatchedException();
            }
            a.m mVar = (a.m) aVar2;
            f4zVar.b(new g.C0428g(new r4q0.a(d77Var.d.a, UnlockType.PASSWORD, mVar.b, mVar.c)));
        }
    }

    public final wj50<g> U() {
        return this.j;
    }

    public final void W(final long j) {
        m mVar = new m(new x67());
        asu0 asu0Var = asu0.a;
        this.e.b(mVar.q(asu0Var.c()).o(asu0Var.d()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.y67
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                epo epoVar = com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b.this.k;
                dpo dpoVar = (dpo) epoVar.c;
                if (dpoVar != null) {
                    dpoVar.cancel();
                }
                dpo dpoVar2 = new dpo(j, epoVar);
                epoVar.c = dpoVar2;
                dpoVar2.start();
            }
        }, new z67(new g54(3), 0)));
    }
}
