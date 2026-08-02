package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dch {
    public final n7g a;
    public final n7g b;
    public final n7g c;

    public dch(n7g n7gVar, n7g n7gVar2, n7g n7gVar3) {
        this.a = n7gVar;
        this.b = n7gVar2;
        this.c = n7gVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dch)) {
            return false;
        }
        dch dchVar = (dch) obj;
        return this.a.equals(dchVar.a) && this.b.equals(dchVar.b) && this.c.equals(dchVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
