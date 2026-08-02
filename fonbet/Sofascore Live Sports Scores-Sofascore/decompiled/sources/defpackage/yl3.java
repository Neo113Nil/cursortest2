package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yl3 implements jma {
    public final ll3 a;
    public final Function1 b;
    public final Object c;

    public yl3(ll3 ll3Var, Function1 function1) {
        this.a = ll3Var;
        this.b = function1;
        this.c = ll3Var.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yl3)) {
            return false;
        }
        yl3 yl3Var = (yl3) obj;
        return Intrinsics.c(this.a.c, yl3Var.a.c) && this.b == yl3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c.hashCode() * 31);
    }

    @Override // defpackage.jma
    public final Object t0() {
        return this.c;
    }
}
