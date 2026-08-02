package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gma {
    public final int a;
    public final int b;
    public final boolean c;

    public gma(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gma)) {
            return false;
        }
        gma gmaVar = (gma) obj;
        return this.a == gmaVar.a && this.b == gmaVar.b && this.c == gmaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return lnb.r(sb, this.c, ')');
    }
}
