package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pjh {
    public final q50 a;
    public long b;

    public pjh(q50 q50Var, long j) {
        this.a = q50Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjh) {
            pjh pjhVar = (pjh) obj;
            if (this.a == pjhVar.a && c7a.a(this.b, pjhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) c7a.b(this.b)) + ')';
    }
}
