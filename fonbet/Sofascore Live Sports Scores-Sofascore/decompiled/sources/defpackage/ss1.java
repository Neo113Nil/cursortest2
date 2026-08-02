package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ss1 extends w31 implements axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final fy7 m;
    public final zve n;
    public final se5 o;
    public final x43 p;

    public ss1(int i, String str, String str2, long j, bx7 bx7Var, String str3, fy7 fy7Var, zve zveVar, se5 se5Var, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = fy7Var;
        this.n = zveVar;
        this.o = se5Var;
        this.p = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        return new ss1(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ss1) {
            ss1 ss1Var = (ss1) obj;
            if (this.g == ss1Var.g && Intrinsics.c(this.h, ss1Var.h) && Intrinsics.c(this.i, ss1Var.i) && this.j == ss1Var.j && this.k.equals(ss1Var.k) && this.l.equals(ss1Var.l) && this.m.equals(ss1Var.m) && this.n == ss1Var.n && this.o == ss1Var.o && this.p.equals(ss1Var.p)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.p;
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
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31), 31, this.l)) * 31)) * 31)) * 31);
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
        StringBuilder t = dmi.t(this.g, "BasketballTeamShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", team=");
        t.append(this.m);
        t.append(", teamShotmapWrapper=");
        t.append(this.n);
        t.append(", seasonShotActionAreaWrapper=");
        t.append(this.o);
        t.append(", additionalData=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
