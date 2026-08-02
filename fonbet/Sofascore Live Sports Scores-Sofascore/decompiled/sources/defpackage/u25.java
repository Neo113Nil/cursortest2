package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u25 extends s02 {
    public final int j;

    public u25(int i) {
        this.j = i;
        if (i > 0) {
            return;
        }
        a70.p("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u25) {
            return this.j == ((u25) obj).j;
        }
        return false;
    }

    public final int hashCode() {
        return this.j;
    }

    public final String toString() {
        return String.valueOf(this.j);
    }
}
