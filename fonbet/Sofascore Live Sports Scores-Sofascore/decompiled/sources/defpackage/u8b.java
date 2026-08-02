package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u8b extends w31 implements uak, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final x43 m;
    public final iy7 n;
    public final j6c o;
    public final fy7 p;
    public final fy7 q;
    public final boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8b(int i, String str, String str2, long j, String str3, bx7 bx7Var, x43 x43Var, iy7 iy7Var, j6c j6cVar, fy7 fy7Var, fy7 fy7Var2, boolean z) {
        super(str, str2, str3, bx7Var, true, x43Var);
        str3.getClass();
        bx7Var.getClass();
        j6cVar.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = x43Var;
        this.n = iy7Var;
        this.o = j6cVar;
        this.p = fy7Var;
        this.q = fy7Var2;
        this.r = z;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.k;
        str.getClass();
        bx7 bx7Var = this.l;
        bx7Var.getClass();
        j6c j6cVar = this.o;
        j6cVar.getClass();
        return new u8b(this.g, this.h, this.i, this.j, str, bx7Var, x43Var, this.n, j6cVar, this.p, this.q, this.r);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8b)) {
            return false;
        }
        u8b u8bVar = (u8b) obj;
        return this.g == u8bVar.g && Intrinsics.c(this.h, u8bVar.h) && Intrinsics.c(this.i, u8bVar.i) && this.j == u8bVar.j && Intrinsics.c(this.k, u8bVar.k) && Intrinsics.c(this.l, u8bVar.l) && this.m.equals(u8bVar.m) && Intrinsics.c(this.n, u8bVar.n) && Intrinsics.c(this.o, u8bVar.o) && this.p.equals(u8bVar.p) && this.q.equals(u8bVar.q) && this.r == u8bVar.r;
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.m;
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
        int hashCode3 = (this.m.hashCode() + fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31)) * 31;
        iy7 iy7Var = this.n;
        return Boolean.hashCode(this.r) + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((hashCode3 + (iy7Var != null ? iy7Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
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
        StringBuilder t = dmi.t(this.g, "LineupsFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", additionalData=");
        t.append(this.m);
        t.append(", uniqueTournament=");
        t.append(this.n);
        t.append(", lineupsFieldData=");
        t.append(this.o);
        t.append(", homeTeam=");
        t.append(this.p);
        t.append(", awayTeam=");
        t.append(this.q);
        t.append(", showRating=");
        t.append(this.r);
        t.append(")");
        return t.toString();
    }
}
