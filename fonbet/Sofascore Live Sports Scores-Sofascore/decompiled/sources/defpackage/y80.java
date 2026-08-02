package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y80 extends w31 implements uak, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final iy7 m;
    public final hy7 n;
    public final x43 o;
    public final String p;
    public final gv9 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(int i, String str, String str2, long j, String str3, bx7 bx7Var, iy7 iy7Var, hy7 hy7Var, x43 x43Var, String str4, gv9 gv9Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = iy7Var;
        this.n = hy7Var;
        this.o = x43Var;
        this.p = str4;
        this.q = gv9Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.q;
        gv9Var.getClass();
        return new y80(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, x43Var, this.p, gv9Var);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj;
        return this.g == y80Var.g && Intrinsics.c(this.h, y80Var.h) && Intrinsics.c(this.i, y80Var.i) && this.j == y80Var.j && this.k.equals(y80Var.k) && Intrinsics.c(this.l, y80Var.l) && Intrinsics.c(this.m, y80Var.m) && Intrinsics.c(this.n, y80Var.n) && this.o.equals(y80Var.o) && Intrinsics.c(this.p, y80Var.p) && Intrinsics.c(this.q, y80Var.q);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
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
        int hashCode3 = (c + (bx7Var == null ? 0 : bx7Var.hashCode())) * 31;
        iy7 iy7Var = this.m;
        int hashCode4 = (hashCode3 + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31;
        hy7 hy7Var = this.n;
        int hashCode5 = (this.o.hashCode() + ((hashCode4 + (hy7Var == null ? 0 : hy7Var.hashCode())) * 31)) * 31;
        String str3 = this.p;
        return this.q.hashCode() + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
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
        StringBuilder t = dmi.t(this.g, "AnnouncementCustomFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", uniqueTournament=");
        t.append(this.m);
        t.append(", uniqueStage=");
        t.append(this.n);
        t.append(", additionalData=");
        t.append(this.o);
        t.append(", type=");
        t.append(this.p);
        t.append(", images=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }
}
