package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i8l implements vfc {
    public final iv1 a;

    public i8l(iv1 iv1Var) {
        this.a = iv1Var;
    }

    @Override // defpackage.vfc
    public final int a(x6a x6aVar, long j, int i, ema emaVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (emaVar == ema.a ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return llf.c(this.a.a(i, i2, emaVar), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8l) && this.a.equals(((i8l) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
