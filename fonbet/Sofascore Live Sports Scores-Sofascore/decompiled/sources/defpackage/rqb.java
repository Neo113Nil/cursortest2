package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rqb {
    public final long a;
    public final long b;

    public rqb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqb)) {
            return false;
        }
        rqb rqbVar = (rqb) obj;
        return this.a == rqbVar.a && this.b == rqbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.l(this.b, ")", ljg.o("HighlightedCalendarPeriod(startPeriodTimestamp=", this.a, ", endPeriodTimestamp="));
    }
}
