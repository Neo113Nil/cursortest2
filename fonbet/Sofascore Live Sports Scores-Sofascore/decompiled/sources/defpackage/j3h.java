package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j3h {
    public final l2l a;
    public final l2l b;

    public j3h(l2l l2lVar, l2l l2lVar2) {
        this.a = l2lVar;
        this.b = l2lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3h)) {
            return false;
        }
        j3h j3hVar = (j3h) obj;
        return this.a == j3hVar.a && this.b == j3hVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ')';
    }
}
