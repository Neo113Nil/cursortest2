package defpackage;

import android.os.Build;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ebj extends cbj implements ug3 {
    public jwj q;
    public lcj r;
    public cej s;
    public boolean t;
    public final e1d u;
    public final q50 v;
    public final eob w;
    public g9i x;

    public ebj(jwj jwjVar, lcj lcjVar, cej cejVar, boolean z) {
        this.q = jwjVar;
        this.r = lcjVar;
        this.s = cejVar;
        this.t = z;
        e1d f = e.f(new c7a(0L));
        this.u = f;
        this.v = new q50(new dnd(tz9.u(this.q, this.r, this.s, ((c7a) ((eoh) f).getValue()).a)), g3h.b, new dnd(g3h.c), 8);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: dbj
            public final /* synthetic */ ebj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                ebj ebjVar = this.b;
                switch (i2) {
                    case 0:
                        return (dnd) ebjVar.v.d();
                    default:
                        s75 s75Var = (s75) obj;
                        kx4 kx4Var = (kx4) tgj.x(ebjVar, dh3.h);
                        ((eoh) ebjVar.u).setValue(new c7a((kx4Var.e0(s75.b(s75Var.a)) << 32) | (kx4Var.e0(s75.a(s75Var.a)) & 4294967295L)));
                        return Unit.a;
                }
            }
        };
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: dbj
            public final /* synthetic */ ebj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                ebj ebjVar = this.b;
                switch (i22) {
                    case 0:
                        return (dnd) ebjVar.v.d();
                    default:
                        s75 s75Var = (s75) obj;
                        kx4 kx4Var = (kx4) tgj.x(ebjVar, dh3.h);
                        ((eoh) ebjVar.u).setValue(new c7a((kx4Var.e0(s75.b(s75Var.a)) << 32) | (kx4Var.e0(s75.a(s75Var.a)) & 4294967295L)));
                        return Unit.a;
                }
            }
        };
        if (!fob.a()) {
            a70.m("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        eob eobVar = new eob(function1, function12, Build.VERSION.SDK_INT == 28 ? tla.b : uie.a);
        k1(eobVar);
        this.w = eobVar;
    }

    @Override // defpackage.cbj
    public final void K(dma dmaVar) {
        this.w.K(dmaVar);
    }

    @Override // defpackage.wtc
    public final void c1() {
        o1();
    }

    @Override // defpackage.cbj, defpackage.p3h
    public final void i(b4h b4hVar) {
        this.w.i(b4hVar);
    }

    @Override // defpackage.cbj
    public final void n1(jwj jwjVar, lcj lcjVar, cej cejVar, boolean z) {
        jwj jwjVar2 = this.q;
        lcj lcjVar2 = this.r;
        cej cejVar2 = this.s;
        boolean z2 = this.t;
        this.q = jwjVar;
        this.r = lcjVar;
        this.s = cejVar;
        this.t = z;
        if (Intrinsics.c(jwjVar, jwjVar2) && Intrinsics.c(lcjVar, lcjVar2) && Intrinsics.c(cejVar, cejVar2) && z == z2) {
            return;
        }
        o1();
    }

    @Override // defpackage.cbj, defpackage.ga5
    public final void o(yma ymaVar) {
        ymaVar.a();
        this.w.o(ymaVar);
    }

    public final void o1() {
        g9i g9iVar = this.x;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.x = null;
        if (fob.a()) {
            this.x = xw3.L(Y0(), null, null, new vki(this, rq3Var, 13), 3);
        }
    }
}
