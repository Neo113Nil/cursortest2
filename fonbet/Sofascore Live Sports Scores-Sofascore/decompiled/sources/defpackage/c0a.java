package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c0a {
    public final boolean a;
    public final int b;
    public final Integer c;
    public final gv9 d;
    public final int e;

    public c0a(boolean z, int i, Integer num, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = z;
        this.b = i;
        this.c = num;
        this.d = gv9Var;
        this.e = gv9Var.indexOf(b());
    }

    public static c0a a(c0a c0aVar, boolean z, int i, Integer num, gv9 gv9Var, int i2) {
        if ((i2 & 1) != 0) {
            z = c0aVar.a;
        }
        if ((i2 & 2) != 0) {
            i = c0aVar.b;
        }
        if ((i2 & 4) != 0) {
            num = c0aVar.c;
        }
        if ((i2 & 8) != 0) {
            gv9Var = c0aVar.d;
        }
        c0aVar.getClass();
        gv9Var.getClass();
        return new c0a(z, i, num, gv9Var);
    }

    public final String b() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer num = this.c;
        String j = num != null ? ljg.j(num.intValue(), "+") : null;
        if (j == null) {
            j = "";
        }
        return valueOf + "'" + j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0a)) {
            return false;
        }
        c0a c0aVar = (c0a) obj;
        return this.a == c0aVar.a && this.b == c0aVar.b && Intrinsics.c(this.c, c0aVar.c) && Intrinsics.c(this.d, c0aVar.d);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return this.d.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "IncidentTimePickerUiModel(isChecked=" + this.a + ", selectedTime=" + this.b + ", selectedAdditionalTime=" + this.c + ", timeOptions=" + this.d + ")";
    }
}
