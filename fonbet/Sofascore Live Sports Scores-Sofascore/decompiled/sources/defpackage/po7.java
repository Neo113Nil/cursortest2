package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class po7 extends ro7 implements qo7 {
    public final do7 a;
    public final ho7 b;
    public final gv9 c;
    public final gv9 d;
    public final gv9 e;
    public final gv9 f;
    public final gv9 g;
    public final boolean h;

    public po7(do7 do7Var, ho7 ho7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, boolean z) {
        do7Var.getClass();
        ho7Var.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var5.getClass();
        this.a = do7Var;
        this.b = ho7Var;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = gv9Var3;
        this.f = gv9Var4;
        this.g = gv9Var5;
        this.h = z;
    }

    @Override // defpackage.qo7
    public final do7 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po7)) {
            return false;
        }
        po7 po7Var = (po7) obj;
        return Intrinsics.c(this.a, po7Var.a) && Intrinsics.c(this.b, po7Var.b) && Intrinsics.c(this.c, po7Var.c) && Intrinsics.c(this.d, po7Var.d) && Intrinsics.c(this.e, po7Var.e) && Intrinsics.c(this.f, po7Var.f) && Intrinsics.c(this.g, po7Var.g) && this.h == po7Var.h;
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(ljg.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        gv9 gv9Var = this.f;
        return Boolean.hashCode(this.h) + ljg.d((d + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(userCompetition=");
        sb.append(this.a);
        sb.append(", selectedRound=");
        sb.append(this.b);
        sb.append(", userRounds=");
        vxd.u(sb, this.c, ", rounds=", this.d, ", squad=");
        vxd.u(sb, this.e, ", transfers=", this.f, ", fixtures=");
        sb.append(this.g);
        sb.append(", loadingSquad=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
