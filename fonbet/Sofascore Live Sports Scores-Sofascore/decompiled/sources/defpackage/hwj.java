package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hwj {
    public final m9j a;
    public final e7a b;

    public hwj(m9j m9jVar, e7a e7aVar) {
        this.a = m9jVar;
        this.b = e7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hwj) {
            hwj hwjVar = (hwj) obj;
            return this.a.equals(hwjVar.a) && this.b == hwjVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
