package defpackage;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lwi {
    public final YearMonth a;
    public final String b;
    public final gv9 c;
    public final gv9 d;
    public final boolean e;
    public final YearMonth f;
    public final YearMonth g;

    public lwi(YearMonth yearMonth, String str, gv9 gv9Var, gv9 gv9Var2, boolean z, YearMonth yearMonth2, YearMonth yearMonth3) {
        yearMonth.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = yearMonth;
        this.b = str;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = z;
        this.f = yearMonth2;
        this.g = yearMonth3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwi)) {
            return false;
        }
        lwi lwiVar = (lwi) obj;
        return Intrinsics.c(this.a, lwiVar.a) && this.b.equals(lwiVar.b) && Intrinsics.c(this.c, lwiVar.c) && Intrinsics.c(this.d, lwiVar.d) && this.e == lwiVar.e && Intrinsics.c(this.f, lwiVar.f) && Intrinsics.c(this.g, lwiVar.g);
    }

    public final int hashCode() {
        int e = dmi.e(ljg.d(ljg.d(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        YearMonth yearMonth = this.f;
        int hashCode = (e + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        YearMonth yearMonth2 = this.g;
        return hashCode + (yearMonth2 != null ? yearMonth2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamEventsCalendarState(selectedMonth=");
        sb.append(this.a);
        sb.append(", displayMonthLabel=");
        sb.append(this.b);
        sb.append(", weekdayHeaders=");
        vxd.u(sb, this.c, ", calendarItems=", this.d, ", isLoading=");
        sb.append(this.e);
        sb.append(", firstAvailableMonth=");
        sb.append(this.f);
        sb.append(", lastAvailableMonth=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
