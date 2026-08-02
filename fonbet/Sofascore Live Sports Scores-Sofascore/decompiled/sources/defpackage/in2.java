package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class in2 {
    public final io a;
    public final Function1 b;
    public final j38 c;

    public in2(io ioVar, j38 j38Var, Function1 function1) {
        this.a = ioVar;
        this.b = function1;
        this.c = j38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in2)) {
            return false;
        }
        in2 in2Var = (in2) obj;
        return Intrinsics.c(this.a, in2Var.a) && Intrinsics.c(this.b, in2Var.b) && Intrinsics.c(this.c, in2Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
