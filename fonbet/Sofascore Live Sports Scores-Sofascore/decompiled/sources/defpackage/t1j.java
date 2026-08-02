package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t1j implements z1j {
    public final a2j a;
    public final bfe b;

    public t1j(a2j a2jVar, bfe bfeVar) {
        this.a = a2jVar;
        this.b = bfeVar;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1j)) {
            return false;
        }
        t1j t1jVar = (t1j) obj;
        return this.a.equals(t1jVar.a) && this.b.equals(t1jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Manager(data=" + this.a + ", visibleForChips=" + this.b + ")";
    }
}
