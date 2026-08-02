package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v3e extends wtc implements oma {
    public p3e o;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        float b = this.o.b(m1cVar.getLayoutDirection());
        float d = this.o.d();
        float c = this.o.c(m1cVar.getLayoutDirection());
        float a = this.o.a();
        if (!((p75.a(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0) & (p75.a(d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0) & (p75.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0) & (p75.a(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0))) {
            p3a.a("Padding must be non-negative");
        }
        int e0 = m1cVar.e0(b);
        int e02 = m1cVar.e0(c) + e0;
        int e03 = m1cVar.e0(d);
        int e04 = m1cVar.e0(a) + e03;
        qhe J = g1cVar.J(cn3.i(-e02, -e04, j));
        return m1c.G0(m1cVar, cn3.g(J.a + e02, j), cn3.f(J.b + e04, j), new b5a(J, e0, e03, 3));
    }
}
