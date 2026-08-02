package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class utj {
    public final boolean a;
    public final boolean b;
    public final int c;

    public utj(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utj)) {
            return false;
        }
        utj utjVar = (utj) obj;
        return this.a == utjVar.a && this.b == utjVar.b && this.c == utjVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", w1l.k("TrackerConfig(hasEliminationSupport=", this.a, ", hasDateRange=", this.b, ", yAxisStep="));
    }
}
