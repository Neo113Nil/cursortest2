package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jsh extends w31 implements kre, axi, uak, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final ux7 m;
    public final fy7 n;
    public final x43 o;
    public final iy7 p;

    public jsh(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, x43 x43Var, iy7 iy7Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = x43Var;
        this.p = iy7Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        return new jsh(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, x43Var, this.p);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.p;
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsh)) {
            return false;
        }
        jsh jshVar = (jsh) obj;
        return this.g == jshVar.g && Intrinsics.c(this.h, jshVar.h) && Intrinsics.c(this.i, jshVar.i) && this.j == jshVar.j && this.k.equals(jshVar.k) && this.l.equals(jshVar.l) && this.m.equals(jshVar.m) && this.n.equals(jshVar.n) && this.o.equals(jshVar.o) && Intrinsics.c(this.p, jshVar.p);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
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
        return this.l;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31)) * 31)) * 31)) * 31;
        iy7 iy7Var = this.p;
        return hashCode3 + (iy7Var != null ? iy7Var.hashCode() : 0);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.k;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "SofaRating10FeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", additionalData=");
        t.append(this.o);
        t.append(", uniqueTournament=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
