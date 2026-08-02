package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dh8 extends w31 implements uak, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final iy7 m;
    public final gv9 n;
    public final gv9 o;
    public final gv9 p;
    public final Event q;
    public final x43 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh8(int i, String str, String str2, long j, bx7 bx7Var, String str3, iy7 iy7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, Event event, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        bx7Var.getClass();
        event.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = iy7Var;
        this.n = gv9Var;
        this.o = gv9Var2;
        this.p = gv9Var3;
        this.q = event;
        this.r = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        bx7 bx7Var = this.k;
        bx7Var.getClass();
        Event event = this.q;
        event.getClass();
        return new dh8(this.g, this.h, this.i, this.j, bx7Var, this.l, this.m, this.n, this.o, this.p, event, x43Var);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh8)) {
            return false;
        }
        dh8 dh8Var = (dh8) obj;
        return this.g == dh8Var.g && Intrinsics.c(this.h, dh8Var.h) && Intrinsics.c(this.i, dh8Var.i) && this.j == dh8Var.j && Intrinsics.c(this.k, dh8Var.k) && this.l.equals(dh8Var.l) && Intrinsics.c(this.m, dh8Var.m) && Intrinsics.c(this.n, dh8Var.n) && Intrinsics.c(this.o, dh8Var.o) && Intrinsics.c(this.p, dh8Var.p) && Intrinsics.c(this.q, dh8Var.q) && this.r.equals(dh8Var.r);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.r;
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
        int c = dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31), 31, this.l);
        iy7 iy7Var = this.m;
        int hashCode3 = (c + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31;
        gv9 gv9Var = this.n;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.o;
        int hashCode5 = (hashCode4 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31;
        gv9 gv9Var3 = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((hashCode5 + (gv9Var3 != null ? gv9Var3.hashCode() : 0)) * 31)) * 31);
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
        StringBuilder t = dmi.t(this.g, "FootballAttackMomentumFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", uniqueTournament=");
        t.append(this.m);
        t.append(", incidents=");
        t.append(this.n);
        t.append(", graphPoints=");
        t.append(this.o);
        t.append(", statistics=");
        t.append(this.p);
        t.append(", stableEvent=");
        t.append(this.q);
        t.append(", additionalData=");
        t.append(this.r);
        t.append(")");
        return t.toString();
    }
}
