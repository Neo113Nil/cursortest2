package defpackage;

import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fg2 {
    public final int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fg2(Calendar calendar) {
        this(calendar.get(1), calendar.get(2), calendar.get(5));
        calendar.getClass();
    }

    public static fg2 a(fg2 fg2Var, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        fg2Var.b(calendar);
        calendar.add(5, i);
        calendar.add(2, 0);
        calendar.add(1, 0);
        return new fg2(calendar);
    }

    public final void b(Calendar calendar) {
        calendar.getClass();
        calendar.set(this.a, this.b, this.c);
    }

    public final Calendar c() {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        b(calendar);
        return calendar;
    }

    public final int d() {
        return this.c | (this.a << 9) | (this.b << 5);
    }

    public final int e(fg2 fg2Var) {
        return (((this.a - fg2Var.a) * 12) + this.b) - fg2Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg2)) {
            return false;
        }
        fg2 fg2Var = (fg2) obj;
        return this.a == fg2Var.a && this.b == fg2Var.b && this.c == fg2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return fc6.h(this.c, ")", lnb.s(this.a, this.b, "CalendarDay(year=", ", month=", ", day="));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fg2() {
        this(r0);
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
    }

    public fg2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fg2(long j) {
        this(r0);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
    }
}
