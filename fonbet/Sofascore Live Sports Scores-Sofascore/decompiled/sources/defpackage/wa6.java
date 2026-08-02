package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wa6 extends w31 implements v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final gv9 m;
    public final x43 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa6(int i, String str, String str2, long j, String str3, bx7 bx7Var, gv9 gv9Var, x43 x43Var) {
        super(str, str2, str3, bx7Var, true);
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = gv9Var;
        this.n = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.m;
        gv9Var.getClass();
        return new wa6(this.g, this.h, this.i, this.j, this.k, this.l, gv9Var, x43Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa6)) {
            return false;
        }
        wa6 wa6Var = (wa6) obj;
        return this.g == wa6Var.g && Intrinsics.c(this.h, wa6Var.h) && Intrinsics.c(this.i, wa6Var.i) && this.j == wa6Var.j && this.k.equals(wa6Var.k) && this.l.equals(wa6Var.l) && Intrinsics.c(this.m, wa6Var.m) && this.n.equals(wa6Var.n);
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
        return this.n.hashCode() + ljg.d(fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31), 31, this.m);
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
        StringBuilder t = dmi.t(this.g, "EventStandardFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", statistics=");
        t.append(this.m);
        t.append(", additionalData=");
        t.append(this.n);
        t.append(")");
        return t.toString();
    }
}
