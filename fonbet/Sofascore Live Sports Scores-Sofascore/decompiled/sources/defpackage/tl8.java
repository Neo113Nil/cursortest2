package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tl8 extends w31 implements axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final fy7 m;
    public final gv9 n;
    public final String o;
    public final String p;
    public final String q;
    public final vk8 r;
    public final Double s;
    public final x43 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl8(int i, String str, String str2, long j, bx7 bx7Var, String str3, fy7 fy7Var, gv9 gv9Var, String str4, String str5, String str6, vk8 vk8Var, Double d, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = fy7Var;
        this.n = gv9Var;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = vk8Var;
        this.s = d;
        this.t = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.n;
        gv9Var.getClass();
        return new tl8(this.g, this.h, this.i, this.j, this.k, this.l, this.m, gv9Var, this.o, this.p, this.q, this.r, this.s, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl8)) {
            return false;
        }
        tl8 tl8Var = (tl8) obj;
        return this.g == tl8Var.g && Intrinsics.c(this.h, tl8Var.h) && Intrinsics.c(this.i, tl8Var.i) && this.j == tl8Var.j && this.k.equals(tl8Var.k) && this.l.equals(tl8Var.l) && this.m.equals(tl8Var.m) && Intrinsics.c(this.n, tl8Var.n) && Intrinsics.c(this.o, tl8Var.o) && Intrinsics.c(this.p, tl8Var.p) && Intrinsics.c(this.q, tl8Var.q) && this.r == tl8Var.r && Intrinsics.c(this.s, tl8Var.s) && this.t.equals(tl8Var.t);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.t;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
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
        int d = ljg.d((this.m.hashCode() + dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31), 31, this.l)) * 31, 31, this.n);
        String str3 = this.o;
        int hashCode3 = (d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int hashCode5 = (this.r.hashCode() + ((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        Double d2 = this.s;
        return this.t.hashCode() + ((hashCode5 + (d2 != null ? d2.hashCode() : 0)) * 31);
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
        StringBuilder t = dmi.t(this.g, "FootballTeamShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", team=");
        t.append(this.m);
        t.append(", shotmap=");
        t.append(this.n);
        bf3.v(t, ", shotsOnTarget=", this.o, ", shotsOffTarget=", this.p);
        t.append(", blockedShots=");
        t.append(this.q);
        t.append(", teamType=");
        t.append(this.r);
        t.append(", rating=");
        t.append(this.s);
        t.append(", additionalData=");
        t.append(this.t);
        t.append(")");
        return t.toString();
    }
}
