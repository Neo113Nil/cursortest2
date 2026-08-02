package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ox4 implements kx4 {
    public final float a;
    public final float b;
    public final og8 c;

    public ox4(float f, float f2, og8 og8Var) {
        this.a = f;
        this.b = f2;
        this.c = og8Var;
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        if (mfj.a(lfj.b(j), 4294967296L)) {
            return this.c.b(lfj.c(j));
        }
        a70.r("Only Sp can convert to Px");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        return Float.compare(this.a, ox4Var.a) == 0 && Float.compare(this.b, ox4Var.b) == 0 && this.c.equals(ox4Var.c);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + fc6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return v8a.E(4294967296L, this.c.a(f));
    }
}
