package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kn5 {
    public final String a;

    public kn5(String str) {
        if (str != null) {
            this.a = str;
        } else {
            yhk.s("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        return this.a.equals(((kn5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return mz1.o(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
