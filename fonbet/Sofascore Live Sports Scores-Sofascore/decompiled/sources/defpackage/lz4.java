package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lz4 implements oz4 {
    public final be5 a;
    public final int b;

    public lz4(int i, be5 be5Var) {
        this.a = be5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz4)) {
            return false;
        }
        lz4 lz4Var = (lz4) obj;
        return this.a == lz4Var.a && this.b == lz4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetTimeToShowBannerAdsOnStreamVideoView(unit=" + this.a + ", value=" + this.b + ")";
    }
}
