package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ucj extends bw4 implements oma, a09, ug3 {
    public cej q;
    public boolean r;
    public final u32 s;
    public Map t;

    public ucj(cej cejVar, jwj jwjVar, dfj dfjVar, boolean z, kja kjaVar) {
        this.q = cejVar;
        this.r = z;
        u32 u32Var = new u32(cejVar.g);
        k1(u32Var);
        this.s = u32Var;
        cej cejVar2 = this.q;
        cejVar2.getClass();
        boolean z2 = this.r;
        ((eoh) cejVar2.a.a).setValue(new xaj(jwjVar, dfjVar, z2, !z2, kjaVar.c == 4));
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        ((eoh) this.q.c).setValue(dmaVar);
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        cej cejVar = this.q;
        ema layoutDirection = m1cVar.getLayoutDirection();
        sf8 sf8Var = (sf8) tgj.x(this, dh3.k);
        yaj yajVar = cejVar.a;
        waj wajVar = new waj(m1cVar, layoutDirection, sf8Var, j);
        ((eoh) yajVar.b).setValue(wajVar);
        xaj xajVar = (xaj) ((eoh) yajVar.a).getValue();
        if (xajVar == null) {
            u3a.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            pvd.x();
            return null;
        }
        aej e = yajVar.e(xajVar, wajVar);
        long j2 = e.c;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        qhe J = g1cVar.J(pco.E(i, i, i2, i2));
        ((eoh) this.q.f).setValue(new p75(this.r ? m1cVar.C0(ufa.l(e.b.b(0))) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Map map = this.t;
        if (map == null) {
            map = new LinkedHashMap(2);
        }
        map.put(mo.a, Integer.valueOf(Math.round(e.d)));
        map.put(mo.b, Integer.valueOf(Math.round(e.e)));
        this.t = map;
        return m1cVar.v0(i, i2, map, new b3(J, 19));
    }
}
