package defpackage;

import com.sofascore.model.mvvm.model.Round;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e49 extends f41 implements uak, v31 {
    public final int m;
    public final gv9 n;
    public final bx7 o;
    public final String p;
    public final String q;
    public final String r;
    public final x43 s;
    public final iy7 t;
    public final Round u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e49(int i, gv9 gv9Var, bx7 bx7Var, String str, String str2, String str3, x43 x43Var, iy7 iy7Var, Round round) {
        super(gv9Var, str2, str3, str, bx7Var, x43Var, 16);
        gv9Var.getClass();
        this.m = i;
        this.n = gv9Var;
        this.o = bx7Var;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = x43Var;
        this.t = iy7Var;
        this.u = round;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.n;
        gv9Var.getClass();
        return new e49(this.m, gv9Var, this.o, this.p, this.q, this.r, x43Var, this.t, this.u);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e49)) {
            return false;
        }
        e49 e49Var = (e49) obj;
        return this.m == e49Var.m && Intrinsics.c(this.n, e49Var.n) && Intrinsics.c(this.o, e49Var.o) && this.p.equals(e49Var.p) && Intrinsics.c(this.q, e49Var.q) && Intrinsics.c(this.r, e49Var.r) && this.s.equals(e49Var.s) && this.t.equals(e49Var.t) && Intrinsics.c(this.u, e49Var.u);
    }

    @Override // defpackage.f41, defpackage.w31
    public final x43 f() {
        return this.s;
    }

    @Override // defpackage.f41, defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.r;
    }

    @Override // defpackage.f41, defpackage.w31
    public final bx7 h() {
        return this.o;
    }

    public final int hashCode() {
        int d = ljg.d(Integer.hashCode(this.m) * 31, 31, this.n);
        bx7 bx7Var = this.o;
        int c = dmi.c((d + (bx7Var == null ? 0 : bx7Var.hashCode())) * 31, 31, this.p);
        String str = this.q;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.r;
        int hashCode2 = (this.t.hashCode() + ((this.s.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        Round round = this.u;
        return hashCode2 + (round != null ? round.hashCode() : 0);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.m;
    }

    @Override // defpackage.f41, defpackage.w31
    public final String j() {
        return this.p;
    }

    @Override // defpackage.f41, defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedRoundAnnouncementFeedCardModel(id=");
        sb.append(this.m);
        sb.append(", posts=");
        sb.append(this.n);
        sb.append(", event=");
        sb.append(this.o);
        sb.append(", sport=");
        sb.append(this.p);
        sb.append(", title=");
        bf3.v(sb, this.q, ", body=", this.r, ", additionalData=");
        sb.append(this.s);
        sb.append(", uniqueTournament=");
        sb.append(this.t);
        sb.append(", round=");
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }
}
