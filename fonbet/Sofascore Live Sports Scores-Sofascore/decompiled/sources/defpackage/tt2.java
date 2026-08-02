package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tt2 {
    public final gv9 a;
    public final String b;
    public final Function1 c;

    public tt2(gv9 gv9Var, String str, Function1 function1) {
        gv9Var.getClass();
        function1.getClass();
        this.a = gv9Var;
        this.b = str;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2)) {
            return false;
        }
        tt2 tt2Var = (tt2) obj;
        return Intrinsics.c(this.a, tt2Var.a) && Intrinsics.c(this.b, tt2Var.b) && Intrinsics.c(this.c, tt2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ChipDropdown(items=" + this.a + ", selectedItem=" + this.b + ", onItemSelected=" + this.c + ")";
    }
}
