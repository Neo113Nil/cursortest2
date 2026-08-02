package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zr1 extends w31 implements kre, axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final ux7 m;
    public final fy7 n;
    public final gv9 o;
    public final gv9 p;
    public final Double q;
    public final x43 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(int i, String str, String str2, long j, bx7 bx7Var, String str3, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, gv9 gv9Var2, Double d, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        bx7Var.getClass();
        ux7Var.getClass();
        fy7Var.getClass();
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = gv9Var;
        this.p = gv9Var2;
        this.q = d;
        this.r = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        bx7 bx7Var = this.k;
        bx7Var.getClass();
        ux7 ux7Var = this.m;
        ux7Var.getClass();
        fy7 fy7Var = this.n;
        fy7Var.getClass();
        gv9 gv9Var = this.o;
        gv9Var.getClass();
        return new zr1(this.g, this.h, this.i, this.j, bx7Var, this.l, ux7Var, fy7Var, gv9Var, this.p, this.q, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr1)) {
            return false;
        }
        zr1 zr1Var = (zr1) obj;
        return this.g == zr1Var.g && Intrinsics.c(this.h, zr1Var.h) && Intrinsics.c(this.i, zr1Var.i) && this.j == zr1Var.j && Intrinsics.c(this.k, zr1Var.k) && this.l.equals(zr1Var.l) && Intrinsics.c(this.m, zr1Var.m) && Intrinsics.c(this.n, zr1Var.n) && Intrinsics.c(this.o, zr1Var.o) && Intrinsics.c(this.p, zr1Var.p) && Intrinsics.c(this.q, zr1Var.q) && this.r.equals(zr1Var.r);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.r;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
    }

    @Override // defpackage.kre
    public final ux7 getPlayer() {
        return this.m;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int d = ljg.d((this.n.hashCode() + ((this.m.hashCode() + dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31), 31, this.l)) * 31)) * 31, 31, this.o);
        gv9 gv9Var = this.p;
        int hashCode3 = (d + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        Double d2 = this.q;
        return this.r.hashCode() + ((hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.l;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "BasketballPlayerShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", shotmap=");
        t.append(this.o);
        t.append(", periods=");
        t.append(this.p);
        t.append(", rating=");
        t.append(this.q);
        t.append(", additionalData=");
        t.append(this.r);
        t.append(")");
        return t.toString();
    }
}
