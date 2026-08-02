package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qtg {
    public final c14 a;
    public final int b;
    public final int c;

    public qtg(c14 c14Var, int i, int i2) {
        this.a = c14Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtg)) {
            return false;
        }
        qtg qtgVar = (qtg) obj;
        return this.a.equals(qtgVar.a) && this.b == qtgVar.b && this.c == qtgVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScorecardFloatingHeaderData(sectionItem=");
        sb.append(this.a);
        sb.append(", indexFrom=");
        sb.append(this.b);
        sb.append(", indexTo=");
        return fc6.h(this.c, ")", sb);
    }
}
