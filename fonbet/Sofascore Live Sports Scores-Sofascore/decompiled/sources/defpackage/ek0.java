package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ek0 {
    public final Object a;
    public final hj0 b;
    public final apf c;

    public ek0(Object obj, hj0 hj0Var, apf apfVar) {
        this.a = obj;
        this.b = hj0Var;
        this.c = apfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj;
        hj0 hj0Var = ek0Var.b;
        hj0 hj0Var2 = this.b;
        return Intrinsics.c(hj0Var2, hj0Var) && hj0Var2.a(this.a, ek0Var.a) && this.c == ek0Var.c;
    }

    public final int hashCode() {
        hj0 hj0Var = this.b;
        return this.c.hashCode() + ((hj0Var.b(this.a) + (hj0Var.hashCode() * 31)) * 31);
    }
}
