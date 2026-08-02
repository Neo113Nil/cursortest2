package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class udg {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public udg(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udg)) {
            return false;
        }
        udg udgVar = (udg) obj;
        return this.a == udgVar.a && this.b == udgVar.b && this.c == udgVar.c && this.d == udgVar.d && this.e == udgVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(wv8.a(this.c, dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASInterstitialAd(duration=");
        sb.append(this.a);
        sb.append(", shouldCloseOnClick=");
        sb.append(this.b);
        sb.append(", closeButtonAppearanceDelay=");
        sb.append(this.c);
        sb.append(", autoCloseWhenVideoEnds=");
        sb.append(this.d);
        sb.append(", isSkippable=");
        return wt3.p(sb, this.e, ")");
    }
}
