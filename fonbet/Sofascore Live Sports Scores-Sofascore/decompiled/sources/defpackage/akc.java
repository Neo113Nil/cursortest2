package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class akc extends wtc implements ug3, oma {
    public LinkedHashMap o;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        float f = ((p75) tgj.x(this, l7a.c)).a;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        qhe J = g1cVar.J(j);
        boolean z = this.n && !Float.isNaN(f) && p75.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0;
        int e0 = !Float.isNaN(f) ? m1cVar.e0(f) : 0;
        int i = J.a;
        if (z) {
            i = Math.max(i, e0);
        }
        int i2 = J.b;
        if (z) {
            i2 = Math.max(i2, e0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.o = linkedHashMap;
            }
            pok pokVar = l7a.b;
            int round = Math.round((e0 - J.a) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(pokVar, Integer.valueOf(round));
            ye9 ye9Var = l7a.a;
            int round2 = Math.round((e0 - J.b) / 2.0f);
            linkedHashMap.put(ye9Var, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.o;
        if (map == null) {
            map = lm5.a;
            map.getClass();
        }
        return m1cVar.v0(i, i2, map, new b5a(i, J, i2, 1));
    }
}
