package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ltj implements mtj {
    public final huj a;
    public final int b;

    public ltj(huj hujVar, int i) {
        this.a = hujVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltj)) {
            return false;
        }
        ltj ltjVar = (ltj) obj;
        return this.a.equals(ltjVar.a) && this.b == ltjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamSelected(team=" + this.a + ", index=" + this.b + ")";
    }
}
