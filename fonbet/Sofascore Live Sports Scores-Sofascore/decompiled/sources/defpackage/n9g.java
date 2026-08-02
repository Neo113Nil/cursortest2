package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n9g {
    public final int a;
    public final boolean b;
    public final o9g c;
    public final o9g d;

    public n9g(int i, boolean z, o9g o9gVar, o9g o9gVar2) {
        this.a = i;
        this.b = z;
        this.c = o9gVar;
        this.d = o9gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9g)) {
            return false;
        }
        n9g n9gVar = (n9g) obj;
        return this.a == n9gVar.a && this.b == n9gVar.b && this.c.equals(n9gVar.c) && this.d.equals(n9gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dmi.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "RugbyFieldLineupsData(eventId=" + this.a + ", isRugbySevens=" + this.b + ", homeTeamData=" + this.c + ", awayTeamData=" + this.d + ")";
    }
}
