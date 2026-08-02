package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wj7 {
    public final int a;
    public final q9k b;
    public final q9k c;

    public wj7(int i, q9k q9kVar, q9k q9kVar2) {
        this.a = i;
        this.b = q9kVar;
        this.c = q9kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj7)) {
            return false;
        }
        wj7 wj7Var = (wj7) obj;
        return this.a == wj7Var.a && this.b.equals(wj7Var.b) && this.c.equals(wj7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + lnb.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Section(icon=" + this.a + ", title=" + this.b + ", text=" + this.c + ")";
    }
}
