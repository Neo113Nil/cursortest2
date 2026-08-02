package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dhe {
    public boolean a;
    public boolean b = false;
    public final int c;

    public dhe(boolean z, int i) {
        this.a = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return this.a == dheVar.a && this.b == dheVar.b && this.c == dheVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", w1l.k("RecommendedSection(expanded=", this.a, ", downloading=", this.b, ", eventsCount="));
    }
}
