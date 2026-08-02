package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f6i {
    public final boolean a;
    public final gv9 b;
    public final c6i c;
    public final old d;
    public final gv9 e;
    public final w5i f;
    public final vmd g;
    public final boolean h;

    public f6i(boolean z, gv9 gv9Var, c6i c6iVar, old oldVar, gv9 gv9Var2, w5i w5iVar, vmd vmdVar, boolean z2) {
        w5iVar.getClass();
        vmdVar.getClass();
        this.a = z;
        this.b = gv9Var;
        this.c = c6iVar;
        this.d = oldVar;
        this.e = gv9Var2;
        this.f = w5iVar;
        this.g = vmdVar;
        this.h = z2;
    }

    public static f6i a(f6i f6iVar, boolean z, gv9 gv9Var, c6i c6iVar, gv9 gv9Var2, vmd vmdVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = f6iVar.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            gv9Var = f6iVar.b;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 4) != 0) {
            c6iVar = f6iVar.c;
        }
        c6i c6iVar2 = c6iVar;
        old oldVar = f6iVar.d;
        if ((i & 16) != 0) {
            gv9Var2 = f6iVar.e;
        }
        gv9 gv9Var4 = gv9Var2;
        w5i w5iVar = f6iVar.f;
        vmd vmdVar2 = (i & 64) != 0 ? f6iVar.g : vmdVar;
        boolean z4 = (i & 128) != 0 ? f6iVar.h : z2;
        f6iVar.getClass();
        w5iVar.getClass();
        vmdVar2.getClass();
        return new f6i(z3, gv9Var3, c6iVar2, oldVar, gv9Var4, w5iVar, vmdVar2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6i)) {
            return false;
        }
        f6i f6iVar = (f6i) obj;
        return this.a == f6iVar.a && Intrinsics.c(this.b, f6iVar.b) && this.c == f6iVar.c && this.d.equals(f6iVar.d) && Intrinsics.c(this.e, f6iVar.e) && this.f == f6iVar.f && this.g == f6iVar.g && this.h == f6iVar.h;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        gv9 gv9Var = this.b;
        int hashCode2 = (hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        c6i c6iVar = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (c6iVar == null ? 0 : c6iVar.hashCode())) * 31)) * 31;
        gv9 gv9Var2 = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode3 + (gv9Var2 != null ? gv9Var2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StageOddsScreenState(isLoading=" + this.a + ", pageTypes=" + this.b + ", selectedPage=" + this.c + ", provider=" + this.d + ", odds=" + this.e + ", customization=" + this.f + ", analyticsLocation=" + this.g + ", useRiderLabels=" + this.h + ")";
    }
}
