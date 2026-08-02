package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qu8 extends w31 implements kre, axi, a1i, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final ux7 m;
    public final fy7 n;
    public final x43 o;
    public final gv9 p;
    public final String q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu8(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, x43 x43Var, gv9 gv9Var, String str4, String str5) {
        super(str, str2, str3, bx7Var, true, x43Var);
        str3.getClass();
        bx7Var.getClass();
        ux7Var.getClass();
        fy7Var.getClass();
        gv9Var.getClass();
        str4.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = x43Var;
        this.p = gv9Var;
        this.q = str4;
        this.r = str5;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.k;
        str.getClass();
        bx7 bx7Var = this.l;
        bx7Var.getClass();
        ux7 ux7Var = this.m;
        ux7Var.getClass();
        fy7 fy7Var = this.n;
        fy7Var.getClass();
        gv9 gv9Var = this.p;
        gv9Var.getClass();
        String str2 = this.q;
        str2.getClass();
        return new qu8(this.g, this.h, this.i, this.j, str, bx7Var, ux7Var, fy7Var, x43Var, gv9Var, str2, this.r);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu8)) {
            return false;
        }
        qu8 qu8Var = (qu8) obj;
        return this.g == qu8Var.g && Intrinsics.c(this.h, qu8Var.h) && Intrinsics.c(this.i, qu8Var.i) && this.j == qu8Var.j && Intrinsics.c(this.k, qu8Var.k) && Intrinsics.c(this.l, qu8Var.l) && Intrinsics.c(this.m, qu8Var.m) && Intrinsics.c(this.n, qu8Var.n) && this.o.equals(qu8Var.o) && Intrinsics.c(this.p, qu8Var.p) && Intrinsics.c(this.q, qu8Var.q) && this.r.equals(qu8Var.r);
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
        return this.r.hashCode() + dmi.c(ljg.d((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31)) * 31)) * 31)) * 31, 31, this.p), 31, this.q);
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
        StringBuilder t = dmi.t(this.g, "GameLeaderFeedCardModel(id=", ", title=", this.h, ", body=");
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
        t.append(", statistics=");
        t.append(this.p);
        bf3.v(t, ", playerPosition=", this.q, ", jerseyNumber=", this.r);
        t.append(")");
        return t.toString();
    }
}
