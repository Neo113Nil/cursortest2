package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ij0 {
    public final apf a;
    public final nt9 b;
    public final hj0 c;

    public ij0(apf apfVar, nt9 nt9Var, hj0 hj0Var) {
        this.a = apfVar;
        this.b = nt9Var;
        this.c = hj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        if (this.a != ij0Var.a) {
            return false;
        }
        hj0 hj0Var = ij0Var.c;
        hj0 hj0Var2 = this.c;
        return Intrinsics.c(hj0Var2, hj0Var) && hj0Var2.a(this.b, ij0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hj0 hj0Var = this.c;
        return hj0Var.b(this.b) + ((hj0Var.hashCode() + hashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
