package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vmj {
    public final int a;
    public final znj b;
    public final znj c;

    public vmj(int i, znj znjVar, znj znjVar2) {
        this.a = i;
        this.b = znjVar;
        this.c = znjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmj)) {
            return false;
        }
        vmj vmjVar = (vmj) obj;
        return this.a == vmjVar.a && this.b.equals(vmjVar.b) && this.c.equals(vmjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TopStatsEventData(id=" + this.a + ", homeTeam=" + this.b + ", awayTeam=" + this.c + ")";
    }
}
