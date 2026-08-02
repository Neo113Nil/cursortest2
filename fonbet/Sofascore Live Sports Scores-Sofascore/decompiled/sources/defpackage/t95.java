package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t95 extends wtc implements oma {
    public dx o;
    public Function2 p;
    public ewd q;
    public boolean r;

    @Override // defpackage.wtc
    public final void d1() {
        this.r = false;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        if (!m1cVar.W() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new c7a((J.b & 4294967295L) | (J.a << 32)), new an3(j));
            dx dxVar = this.o;
            lo4 lo4Var = (lo4) pair.a;
            Object obj = pair.b;
            lo4 f = dxVar.f();
            e1d e1dVar = (e1d) dxVar.h;
            if (!Intrinsics.c(f, lo4Var)) {
                ((eoh) ((e1d) dxVar.n)).setValue(lo4Var);
                q1d q1dVar = (q1d) dxVar.m;
                j2d j2dVar = q1dVar.b;
                j2d j2dVar2 = q1dVar.b;
                boolean g = j2dVar.g();
                if (g) {
                    try {
                        ax axVar = (ax) dxVar.o;
                        float c = dxVar.f().c(obj);
                        if (!Float.isNaN(c)) {
                            axVar.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            ((eoh) e1dVar).setValue(null);
                        }
                        ((eoh) ((e1d) dxVar.c)).setValue(obj);
                        ((eoh) ((e1d) dxVar.d)).setValue(obj);
                        j2dVar2.f(null);
                    } catch (Throwable th) {
                        j2dVar2.f(null);
                        throw th;
                    }
                }
                if (!g) {
                    ((eoh) e1dVar).setValue(obj);
                }
            }
        }
        this.r = m1cVar.W() || this.r;
        return m1c.G0(m1cVar, J.a, J.b, new fa(20, m1cVar, this, J));
    }
}
