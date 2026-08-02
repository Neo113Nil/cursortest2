package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k38 {
    public final String a;

    public /* synthetic */ k38(String str) {
        this.a = str;
    }

    public static Object a(String str, ct8 ct8Var, xjd xjdVar, Function1 function1, hoi hoiVar, int i) {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        if ((i & 2) != 0 && (ct8Var = v14.b) == null) {
            ct8Var = ztj.a;
        }
        ct8 ct8Var2 = ct8Var;
        if ((i & 4) != 0) {
            xjdVar = null;
        }
        return uxf.w.B(str, lm5Var, ct8Var2, xjdVar, function1, hoiVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k38) {
            return Intrinsics.c(this.a, ((k38) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dmi.j(')', "Fireable(url=", this.a);
    }
}
