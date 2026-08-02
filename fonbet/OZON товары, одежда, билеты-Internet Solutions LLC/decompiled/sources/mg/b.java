package mg;

/* loaded from: classes10.dex */
public enum b implements k {
    NANOS("Nanos", ig.d.d(1)),
    MICROS("Micros", ig.d.d(1000)),
    MILLIS("Millis", ig.d.d(1000000)),
    SECONDS("Seconds", ig.d.e(1)),
    MINUTES("Minutes", ig.d.e(60)),
    HOURS("Hours", ig.d.e(3600)),
    HALF_DAYS("HalfDays", ig.d.e(43200)),
    DAYS("Days", ig.d.e(86400)),
    WEEKS("Weeks", ig.d.e(604800)),
    MONTHS("Months", ig.d.e(2629746)),
    YEARS("Years", ig.d.e(31556952)),
    DECADES("Decades", ig.d.e(315569520)),
    CENTURIES("Centuries", ig.d.e(3155695200L)),
    MILLENNIA("Millennia", ig.d.e(31556952000L)),
    ERAS("Eras", ig.d.e(31556952000000000L)),
    FOREVER("Forever", ig.d.f(Long.MAX_VALUE, 999999999));

    private final ig.d duration;
    private final String name;

    b(String str, ig.d dVar) {
        this.name = str;
        this.duration = dVar;
    }

    @Override // mg.k
    public final <R extends d> R a(R r11, long j11) {
        return (R) r11.W0(j11, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }
}
