package defpackage;

import com.sofascore.model.fantasy.BasicTeam;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sj5 implements uj5 {
    public final int a;
    public final BasicTeam b;
    public final BasicTeam c;
    public final long d;

    public sj5(int i, BasicTeam basicTeam, BasicTeam basicTeam2, long j) {
        this.a = i;
        this.b = basicTeam;
        this.c = basicTeam2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj5)) {
            return false;
        }
        sj5 sj5Var = (sj5) obj;
        return this.a == sj5Var.a && this.b.equals(sj5Var.b) && this.c.equals(sj5Var.c) && this.d == sj5Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Event(eventId=" + this.a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + ", startTimestamp=" + this.d + ")";
    }
}
