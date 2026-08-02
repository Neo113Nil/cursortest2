package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hwi {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public hwi(int i, String str, boolean z, boolean z2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwi)) {
            return false;
        }
        hwi hwiVar = (hwi) obj;
        return this.a == hwiVar.a && Intrinsics.c(this.b, hwiVar.b) && this.c == hwiVar.c && this.d == hwiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return w1l.i(", isSelected=", ")", dmi.t(this.a, "TeamEventsCalendarMonthPickerMonthModel(month=", ", label=", this.b, ", isEnabled="), this.c, this.d);
    }
}
