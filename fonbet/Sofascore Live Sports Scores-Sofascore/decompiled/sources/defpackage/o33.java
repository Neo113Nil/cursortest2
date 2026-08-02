package defpackage;

import com.ironsource.U3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o33 implements vy8 {
    public final vy8 a;
    public final vy8 b;

    public o33(vy8 vy8Var, vy8 vy8Var2) {
        this.a = vy8Var;
        this.b = vy8Var2;
    }

    @Override // defpackage.vy8
    public final Object a(Object obj, Function2 function2) {
        return this.b.a(this.a.a(obj, function2), function2);
    }

    @Override // defpackage.vy8
    public final boolean b() {
        return this.a.b() && this.b.b();
    }

    @Override // defpackage.vy8
    public final boolean c(Function1 function1) {
        return this.a.c(function1) || this.b.c(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o33)) {
            return false;
        }
        o33 o33Var = (o33) obj;
        return this.a.equals(o33Var.a) && Intrinsics.c(this.b, o33Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder(U3.j.d), (String) a("", f50.C), ']');
    }
}
