package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kjh {
    public static final kjh c;
    public final a35 a;
    public final a35 b;

    static {
        v25 v25Var = v25.a;
        c = new kjh(v25Var, v25Var);
    }

    public kjh(a35 a35Var, a35 a35Var2) {
        this.a = a35Var;
        this.b = a35Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjh)) {
            return false;
        }
        kjh kjhVar = (kjh) obj;
        return this.a.equals(kjhVar.a) && this.b.equals(kjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
