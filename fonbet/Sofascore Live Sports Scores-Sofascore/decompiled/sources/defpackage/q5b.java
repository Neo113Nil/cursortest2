package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q5b {
    public final e1d A;
    public final e1d B;
    public z05 a;
    public final eqf b;
    public final mvh c;
    public final fp4 d;
    public jdj e;
    public final e1d f;
    public final e1d g;
    public dma h;
    public final e1d i;
    public q80 j;
    public final e1d k;
    public final e1d l;
    public final e1d m;
    public final e1d n;
    public final e1d o;
    public boolean p;
    public final e1d q;
    public final gja r;
    public final e1d s;
    public final e1d t;
    public Function1 u;
    public final gt3 v;
    public final gt3 w;
    public final gt3 x;
    public final gtj y;
    public long z;

    public q5b(z05 z05Var, eqf eqfVar, mvh mvhVar) {
        this.a = z05Var;
        this.b = eqfVar;
        this.c = mvhVar;
        fp4 fp4Var = new fp4(8, false);
        q80 q80Var = r80.a;
        long j = pej.b;
        wcj wcjVar = new wcj(q80Var, j, (pej) null);
        fp4Var.b = wcjVar;
        fp4Var.c = new xl0(q80Var, wcjVar.b);
        this.d = fp4Var;
        Boolean bool = Boolean.FALSE;
        this.f = e.f(bool);
        this.g = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.i = e.f(null);
        this.k = e.f(p69.a);
        this.l = e.f(bool);
        this.m = e.f(bool);
        this.n = e.f(bool);
        this.o = e.f(bool);
        this.p = true;
        this.q = e.f(Boolean.TRUE);
        this.r = new gja(mvhVar);
        this.s = e.f(bool);
        this.t = e.f(bool);
        this.u = new isa(23);
        this.v = new gt3(this, 1);
        this.w = new gt3(this, 2);
        this.x = new gt3(this, 3);
        this.y = yqo.n();
        this.z = r13.i;
        this.A = e.f(new pej(j));
        this.B = e.f(new pej(j));
    }

    public final p69 a() {
        return (p69) ((eoh) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((eoh) this.f).getValue()).booleanValue();
    }

    public final dma c() {
        dma dmaVar = this.h;
        if (dmaVar == null || !dmaVar.f()) {
            return null;
        }
        return dmaVar;
    }

    public final bej d() {
        return (bej) ((eoh) this.i).getValue();
    }

    public final void e(long j) {
        ((eoh) this.B).setValue(new pej(j));
    }

    public final void f(long j) {
        ((eoh) this.A).setValue(new pej(j));
    }
}
