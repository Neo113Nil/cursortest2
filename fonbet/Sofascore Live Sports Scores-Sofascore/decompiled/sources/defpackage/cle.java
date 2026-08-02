package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cle {
    public final q9k a;
    public final r9k b;

    public cle(q9k q9kVar, r9k r9kVar) {
        this.a = q9kVar;
        this.b = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cle)) {
            return false;
        }
        cle cleVar = (cle) obj;
        return this.a.equals(cleVar.a) && this.b.equals(cleVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerAbsenceDetail(label=" + this.a + ", value=" + this.b + ")";
    }
}
