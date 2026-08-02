package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uj4 {
    public static final wib b;
    public static final /* synthetic */ KProperty[] c;
    public final vj4 a;

    static {
        t0d t0dVar = new t0d(uj4.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        fuf fufVar = duf.a;
        c = new KProperty[]{fufVar.mutableProperty1(t0dVar), bf3.q(uj4.class, "day", "getDay()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "hour", "getHour()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "minute", "getMinute()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "second", "getSecond()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0, fufVar), bf3.q(uj4.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0, fufVar)};
        b = new wib(20);
    }

    public uj4(vj4 vj4Var) {
        this.a = vj4Var;
    }

    public static o5a a(uj4 uj4Var) {
        uj4Var.getClass();
        vj4 vj4Var = uj4Var.a;
        p0a p0aVar = vj4Var.c;
        l0a l0aVar = vj4Var.a;
        n0a n0aVar = vj4Var.b;
        nhk d = p0aVar.d();
        whb b2 = n0aVar.b();
        l0a copy = l0aVar.copy();
        q0a q0aVar = copy.a;
        Integer num = q0aVar.a;
        nnl.a(num, "year");
        q0aVar.a = Integer.valueOf(num.intValue() % 10000);
        try {
            l0aVar.a.a.getClass();
            long addExact = Math.addExact(Math.multiplyExact(r2.intValue() / 10000, 315569520000L), ((copy.b().a.toEpochDay() * 86400) + b2.a.toSecondOfDay()) - d.a.getTotalSeconds());
            o5a o5aVar = o5a.c;
            Integer num2 = n0aVar.f;
            o5a l = uic.l(num2 != null ? num2.intValue() : 0, addExact);
            if (l.a == addExact) {
                return l;
            }
            throw new gk4("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e) {
            throw new gk4("The parsed date is outside the range representable by Instant", e);
        }
    }
}
