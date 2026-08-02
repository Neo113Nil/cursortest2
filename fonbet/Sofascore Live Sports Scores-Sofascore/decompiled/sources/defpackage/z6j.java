package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z6j extends w31 implements axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final fy7 m;
    public final x43 n;

    public z6j(int i, String str, String str2, long j, String str3, bx7 bx7Var, fy7 fy7Var, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = fy7Var;
        this.n = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        return new z6j(this.g, this.h, this.i, this.j, this.k, this.l, this.m, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6j)) {
            return false;
        }
        z6j z6jVar = (z6j) obj;
        return this.g == z6jVar.g && Intrinsics.c(this.h, z6jVar.h) && Intrinsics.c(this.i, z6jVar.i) && this.j == z6jVar.j && this.k.equals(z6jVar.k) && Intrinsics.c(this.l, z6jVar.l) && this.m.equals(z6jVar.m) && this.n.equals(z6jVar.n);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.n;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
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
        int c = dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k);
        bx7 bx7Var = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((c + (bx7Var != null ? bx7Var.hashCode() : 0)) * 31)) * 31);
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
        StringBuilder t = dmi.t(this.g, "TennisTournamentWinnerFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", team=");
        t.append(this.m);
        t.append(", additionalData=");
        t.append(this.n);
        t.append(")");
        return t.toString();
    }
}
