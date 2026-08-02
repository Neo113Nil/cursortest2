package defpackage;

import com.ironsource.U3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q33 implements xtc {
    public final xtc a;
    public final xtc b;

    public q33(xtc xtcVar, xtc xtcVar2) {
        this.a = xtcVar;
        this.b = xtcVar2;
    }

    @Override // defpackage.xtc
    public final Object a(Object obj, Function2 function2) {
        return this.b.a(this.a.a(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        return this.a.equals(q33Var.a) && Intrinsics.c(this.b, q33Var.b);
    }

    @Override // defpackage.xtc
    public final boolean f(Function1 function1) {
        return this.a.f(function1) && this.b.f(function1);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder(U3.j.d), (String) a("", f50.D), ']');
    }
}
