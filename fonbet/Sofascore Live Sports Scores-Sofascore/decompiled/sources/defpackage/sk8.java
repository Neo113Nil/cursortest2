package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sk8 extends w31 implements kre, axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final ux7 m;
    public final fy7 n;
    public final gv9 o;
    public final vk8 p;
    public final Boolean q;
    public final Double r;
    public final x43 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk8(int i, String str, String str2, long j, bx7 bx7Var, String str3, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, vk8 vk8Var, Boolean bool, Double d, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
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
        this.p = vk8Var;
        this.q = bool;
        this.r = d;
        this.s = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.o;
        gv9Var.getClass();
        return new sk8(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, gv9Var, this.p, this.q, this.r, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk8)) {
            return false;
        }
        sk8 sk8Var = (sk8) obj;
        return this.g == sk8Var.g && Intrinsics.c(this.h, sk8Var.h) && Intrinsics.c(this.i, sk8Var.i) && this.j == sk8Var.j && this.k.equals(sk8Var.k) && this.l.equals(sk8Var.l) && this.m.equals(sk8Var.m) && this.n.equals(sk8Var.n) && Intrinsics.c(this.o, sk8Var.o) && this.p == sk8Var.p && Intrinsics.c(this.q, sk8Var.q) && Intrinsics.c(this.r, sk8Var.r) && this.s.equals(sk8Var.s);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.s;
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
        int hashCode3 = (this.p.hashCode() + ljg.d((this.n.hashCode() + ((this.m.hashCode() + dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31), 31, this.l)) * 31)) * 31, 31, this.o)) * 31;
        Boolean bool = this.q;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.r;
        return this.s.hashCode() + ((hashCode4 + (d != null ? d.hashCode() : 0)) * 31);
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
        StringBuilder t = dmi.t(this.g, "FootballPlayerShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
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
        t.append(", teamType=");
        t.append(this.p);
        t.append(", hasXg=");
        t.append(this.q);
        t.append(", rating=");
        t.append(this.r);
        t.append(", additionalData=");
        t.append(this.s);
        t.append(")");
        return t.toString();
    }
}
