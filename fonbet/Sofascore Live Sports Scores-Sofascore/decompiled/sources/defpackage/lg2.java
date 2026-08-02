package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lg2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public lg2(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg2)) {
            return false;
        }
        lg2 lg2Var = (lg2) obj;
        return this.a == lg2Var.a && this.b == lg2Var.b && this.c == lg2Var.c && this.d == lg2Var.d && this.e == lg2Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return fn0.n(sb, this.e, ')');
    }
}
