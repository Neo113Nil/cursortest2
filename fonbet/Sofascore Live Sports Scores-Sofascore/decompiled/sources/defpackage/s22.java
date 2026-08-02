package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s22 implements m12 {
    public final kx4 a;
    public final long b;

    public s22(yji yjiVar, long j) {
        this.a = yjiVar;
        this.b = j;
    }

    @Override // defpackage.m12
    public final xtc a(xtc xtcVar, io ioVar) {
        return xtcVar.z(new a12(ioVar, false));
    }

    public final float b() {
        long j = this.b;
        if (!an3.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.C0(an3.g(j));
    }

    public final float c() {
        long j = this.b;
        if (!an3.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.C0(an3.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s22)) {
            return false;
        }
        s22 s22Var = (s22) obj;
        return Intrinsics.c(this.a, s22Var.a) && an3.b(this.b, s22Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) an3.l(this.b)) + ')';
    }
}
