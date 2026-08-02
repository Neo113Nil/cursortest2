package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zuh extends w31 implements kre, axi, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final ux7 m;
    public final fy7 n;
    public final gv9 o;
    public final Double p;
    public final x43 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuh(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, Double d, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = gv9Var;
        this.p = d;
        this.q = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.o;
        gv9Var.getClass();
        return new zuh(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, gv9Var, this.p, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuh)) {
            return false;
        }
        zuh zuhVar = (zuh) obj;
        return this.g == zuhVar.g && Intrinsics.c(this.h, zuhVar.h) && Intrinsics.c(this.i, zuhVar.i) && this.j == zuhVar.j && this.k.equals(zuhVar.k) && Intrinsics.c(this.l, zuhVar.l) && this.m.equals(zuhVar.m) && this.n.equals(zuhVar.n) && Intrinsics.c(this.o, zuhVar.o) && Intrinsics.c(this.p, zuhVar.p) && this.q.equals(zuhVar.q);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.q;
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
        int c = dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k);
        bx7 bx7Var = this.l;
        int d = ljg.d((this.n.hashCode() + ((this.m.hashCode() + ((c + (bx7Var == null ? 0 : bx7Var.hashCode())) * 31)) * 31)) * 31, 31, this.o);
        Double d2 = this.p;
        return this.q.hashCode() + ((d + (d2 != null ? d2.hashCode() : 0)) * 31);
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
        StringBuilder t = dmi.t(this.g, "SofascoreRatingFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", summary=");
        t.append(this.o);
        t.append(", averageRating=");
        t.append(this.p);
        t.append(", additionalData=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }
}
