package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iwi {
    public final int a;
    public final gv9 b;
    public final gv9 c;
    public final boolean d;

    public iwi(int i, gv9 gv9Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwi)) {
            return false;
        }
        iwi iwiVar = (iwi) obj;
        return this.a == iwiVar.a && Intrinsics.c(this.b, iwiVar.b) && Intrinsics.c(this.c, iwiVar.c) && this.d == iwiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ljg.d(ljg.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TeamEventsCalendarMonthPickerState(selectedYear=" + this.a + ", years=" + this.b + ", months=" + this.c + ", showTodayButton=" + this.d + ")";
    }
}
