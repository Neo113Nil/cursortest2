package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t3e implements p3e {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public t3e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || !(f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            p3a.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.p3e
    public final float a() {
        return this.d;
    }

    @Override // defpackage.p3e
    public final float b(ema emaVar) {
        return emaVar == ema.a ? this.a : this.c;
    }

    @Override // defpackage.p3e
    public final float c(ema emaVar) {
        return emaVar == ema.a ? this.c : this.a;
    }

    @Override // defpackage.p3e
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t3e)) {
            return false;
        }
        t3e t3eVar = (t3e) obj;
        return p75.b(this.a, t3eVar.a) && p75.b(this.b, t3eVar.b) && p75.b(this.c, t3eVar.c) && p75.b(this.d, t3eVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) p75.c(this.a)) + ", top=" + ((Object) p75.c(this.b)) + ", end=" + ((Object) p75.c(this.c)) + ", bottom=" + ((Object) p75.c(this.d)) + ')';
    }
}
