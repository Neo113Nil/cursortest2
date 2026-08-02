package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gyc implements kx4 {
    public aej a;
    public final /* synthetic */ hyc b;

    public gyc(hyc hycVar) {
        this.b = hycVar;
    }

    public final aej a(long j, long j2) {
        long j3;
        hyc hycVar = this.b;
        dfj dfjVar = hycVar.l;
        long a = lfj.d(j2) ? iyc.a(hycVar.l.a.b, j2) : j2;
        if (!lfj.a(a, hycVar.l.a.b)) {
            hycVar.f(dfj.a(hycVar.l, 0L, a, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213));
        }
        if (hycVar.f > 1) {
            ema emaVar = hycVar.n;
            emaVar.getClass();
            j3 = hycVar.h(j, emaVar);
        } else {
            j3 = j;
        }
        ema emaVar2 = hycVar.n;
        emaVar2.getClass();
        eyc b = hycVar.b(j3, emaVar2);
        ema emaVar3 = hycVar.n;
        emaVar3.getClass();
        aej g = hycVar.g(emaVar3, j3, b);
        this.a = g;
        hycVar.f(dfjVar);
        return g;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        kx4 kx4Var = this.b.k;
        kx4Var.getClass();
        return kx4Var.getFontScale();
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        if (!lfj.d(j)) {
            return j() * C(j);
        }
        hyc hycVar = this.b;
        if (lfj.d(hycVar.l.a.b)) {
            a70.r("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (lfj.a(hycVar.l.a.b, lfj.c)) {
            a70.r("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return lfj.c(j) * h0(hycVar.l.a.b);
    }

    @Override // defpackage.kx4
    public final float j() {
        kx4 kx4Var = this.b.k;
        kx4Var.getClass();
        return kx4Var.j();
    }
}
