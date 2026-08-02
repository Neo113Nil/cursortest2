package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zbi implements nmk {
    public final nmk a;
    public final long b;

    public zbi(nmk nmkVar, long j) {
        this.a = nmkVar;
        this.b = j;
    }

    @Override // defpackage.nmk
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.nmk
    public final long d(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return this.a.d(j80Var, j80Var2, j80Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbi)) {
            return false;
        }
        zbi zbiVar = (zbi) obj;
        return zbiVar.b == this.b && Intrinsics.c(zbiVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.nmk
    public final j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        long j2 = this.b;
        return j < j2 ? j80Var3 : this.a.u(j - j2, j80Var, j80Var2, j80Var3);
    }

    @Override // defpackage.nmk
    public final j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        long j2 = this.b;
        return j < j2 ? j80Var : this.a.z(j - j2, j80Var, j80Var2, j80Var3);
    }
}
