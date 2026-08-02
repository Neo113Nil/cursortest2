package defpackage;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class l0a implements inl, jg4, bt3 {
    public final q0a a;
    public Integer b;
    public Integer c;
    public Integer d;

    public l0a(q0a q0aVar, Integer num, Integer num2, Integer num3) {
        this.a = q0aVar;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.inl
    public final void A(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.inl
    public final Integer C() {
        return this.a.b;
    }

    @Override // defpackage.bt3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l0a copy() {
        q0a q0aVar = this.a;
        return new l0a(new q0a(q0aVar.a, q0aVar.b), this.b, this.c, this.d);
    }

    public final wgb b() {
        wgb wgbVar;
        q0a q0aVar = this.a;
        Integer num = q0aVar.a;
        nnl.a(num, "year");
        int intValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = q0aVar.b;
            nnl.a(num3, "monthNumber");
            int intValue2 = num3.intValue();
            Integer num4 = this.b;
            nnl.a(num4, "day");
            wgbVar = new wgb(intValue, intValue2, num4.intValue());
        } else {
            wgb wgbVar2 = new wgb(intValue, 1, 1);
            int intValue3 = num2.intValue() - 1;
            rk4.Companion.getClass();
            mk4 mk4Var = rk4.a;
            mk4Var.getClass();
            long j = intValue3;
            int i = ahb.c;
            try {
                long addExact = Math.addExact(wgbVar2.a.toEpochDay(), Math.multiplyExact(j, mk4Var.b));
                long j2 = ahb.a;
                if (addExact > ahb.b || j2 > addExact) {
                    throw new DateTimeException("The resulting day " + addExact + " is out of supported LocalDate range.");
                }
                LocalDate ofEpochDay = LocalDate.ofEpochDay(addExact);
                ofEpochDay.getClass();
                wgb wgbVar3 = new wgb(ofEpochDay);
                if (ofEpochDay.getYear() != intValue) {
                    throw new gk4("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue);
                }
                if (q0aVar.b != null) {
                    yuc d = wgbVar3.d();
                    d.getClass();
                    int ordinal = d.ordinal() + 1;
                    Integer num5 = q0aVar.b;
                    if (num5 == null || ordinal != num5.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        sb.append(wgbVar3.d());
                        sb.append(", but ");
                        throw new gk4(vxd.n(sb, q0aVar.b, " was specified as the month number"));
                    }
                }
                if (this.b != null) {
                    int dayOfMonth = ofEpochDay.getDayOfMonth();
                    Integer num6 = this.b;
                    if (num6 == null || dayOfMonth != num6.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(ofEpochDay.getDayOfMonth());
                        sb2.append(" of ");
                        sb2.append(wgbVar3.d());
                        sb2.append(", but ");
                        throw new gk4(vxd.n(sb2, this.b, " was specified as the day of month"));
                    }
                }
                wgbVar = wgbVar3;
            } catch (Exception e) {
                if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                    throw e;
                }
                throw new fb3(2, "The result of adding " + j + " of " + mk4Var + " to " + wgbVar2 + " is out of LocalDate range.", (Throwable) e);
            }
        }
        Integer num7 = this.c;
        if (num7 != null) {
            int intValue4 = num7.intValue();
            LocalDate localDate = wgbVar.a;
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            dayOfWeek.getClass();
            kp5 kp5Var = bl4.b;
            bl4 bl4Var = (bl4) kp5Var.get(dayOfWeek.getValue() - 1);
            bl4Var.getClass();
            if (intValue4 != bl4Var.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > intValue4 || intValue4 >= 8) {
                    ogj.h(ljg.j(intValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((bl4) kp5Var.get(intValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(wgbVar);
                sb3.append(", which is a ");
                DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
                dayOfWeek2.getClass();
                sb3.append((bl4) kp5Var.get(dayOfWeek2.getValue() - 1));
                throw new gk4(sb3.toString());
            }
        }
        return wgbVar;
    }

    @Override // defpackage.jg4
    public final Integer d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0a)) {
            return false;
        }
        l0a l0aVar = (l0a) obj;
        return Intrinsics.c(this.a, l0aVar.a) && Intrinsics.c(this.b, l0aVar.b) && Intrinsics.c(this.c, l0aVar.c) && Intrinsics.c(this.d, l0aVar.d);
    }

    @Override // defpackage.jg4
    public final void g(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int hashCode2 = ((num != null ? num.hashCode() : 0) * 961) + hashCode;
        Integer num2 = this.c;
        int hashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + hashCode2;
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.jg4
    public final void i(Integer num) {
        this.c = num;
    }

    @Override // defpackage.jg4
    public final void l(Integer num) {
        this.d = num;
    }

    @Override // defpackage.inl
    public final void r(Integer num) {
        this.a.b = num;
    }

    public final String toString() {
        Integer num = this.d;
        q0a q0aVar = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(q0aVar);
            sb.append('-');
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Object obj2 = this.c;
            return lnb.p(sb, obj2 != null ? obj2 : "??", ')');
        }
        if (this.b == null && q0aVar.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj3 = q0aVar.a;
            if (obj3 == null) {
                obj3 = "??";
            }
            sb2.append(obj3);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Object obj4 = this.c;
            return lnb.p(sb2, obj4 != null ? obj4 : "??", ')');
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(q0aVar);
        sb3.append('-');
        Object obj5 = this.b;
        if (obj5 == null) {
            obj5 = "??";
        }
        sb3.append(obj5);
        sb3.append(" (day of week is ");
        Object obj6 = this.c;
        sb3.append(obj6 != null ? obj6 : "??");
        sb3.append(", day of year is ");
        return bf3.n(sb3, this.d, ')');
    }

    @Override // defpackage.inl
    public final Integer u() {
        return this.a.a;
    }

    @Override // defpackage.jg4
    public final Integer x() {
        return this.b;
    }

    @Override // defpackage.jg4
    public final Integer z() {
        return this.d;
    }

    public /* synthetic */ l0a() {
        this(new q0a(null, null), null, null, null);
    }
}
