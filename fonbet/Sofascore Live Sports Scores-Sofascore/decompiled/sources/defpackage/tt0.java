package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tt0 extends jx3 {
    public final String a;

    public tt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jx3)) {
            return false;
        }
        return this.a.equals(((tt0) ((jx3) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return mz1.o(new StringBuilder("Log{content="), this.a, "}");
    }
}
