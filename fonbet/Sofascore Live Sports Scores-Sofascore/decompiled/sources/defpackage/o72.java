package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o72 {
    public final n7j a;
    public final String b;

    public o72(n7j n7jVar, String str) {
        this.a = n7jVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o72)) {
            return false;
        }
        o72 o72Var = (o72) obj;
        return hashCode() == o72Var.hashCode() && this.a.equals(o72Var.a) && this.b.equals(o72Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }
}
