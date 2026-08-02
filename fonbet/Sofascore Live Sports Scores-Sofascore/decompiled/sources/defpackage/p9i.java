package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p9i implements r9i {
    public final t52 a;

    public p9i(t52 t52Var) {
        t52Var.getClass();
        this.a = t52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9i) && this.a == ((p9i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bucket(type=" + this.a + ")";
    }
}
