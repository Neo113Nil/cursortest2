package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vj2 {
    public kx4 a;
    public ema b;
    public uj2 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj2)) {
            return false;
        }
        vj2 vj2Var = (vj2) obj;
        return Intrinsics.c(this.a, vj2Var.a) && this.b == vj2Var.b && Intrinsics.c(this.c, vj2Var.c) && njh.c(this.d, vj2Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) njh.i(this.d)) + ')';
    }
}
