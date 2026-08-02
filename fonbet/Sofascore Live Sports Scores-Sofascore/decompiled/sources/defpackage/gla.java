package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gla extends w31 implements kre, axi, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final ux7 m;
    public final fy7 n;
    public final syg o;
    public final x43 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gla(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, syg sygVar, x43 x43Var) {
        super(str, str2, str3, null, true, x43Var);
        str3.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = sygVar;
        this.p = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.k;
        str.getClass();
        return new gla(this.g, this.h, this.i, this.j, str, this.l, this.m, this.n, this.o, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla)) {
            return false;
        }
        gla glaVar = (gla) obj;
        return this.g == glaVar.g && Intrinsics.c(this.h, glaVar.h) && Intrinsics.c(this.i, glaVar.i) && this.j == glaVar.j && Intrinsics.c(this.k, glaVar.k) && this.l.equals(glaVar.l) && this.m.equals(glaVar.m) && this.n.equals(glaVar.n) && this.o.equals(glaVar.o) && this.p.equals(glaVar.p);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.p;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
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
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.k;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "LastMatchesRatingFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", seasonLastRatingsData=");
        t.append(this.o);
        t.append(", additionalData=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
