package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y7h {
    public final e8h a;
    public final kf0 b;

    public y7h(e8h e8hVar, kf0 kf0Var) {
        pc6 pc6Var = pc6.SESSION_START;
        this.a = e8hVar;
        this.b = kf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7h)) {
            return false;
        }
        y7h y7hVar = (y7h) obj;
        pc6 pc6Var = pc6.SESSION_START;
        return this.a.equals(y7hVar.a) && this.b.equals(y7hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (pc6.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + pc6.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
