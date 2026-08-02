package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b94 extends w31 implements v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final x43 m;
    public final String n;
    public final gv9 o;
    public final String p;
    public final boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b94(int i, String str, String str2, long j, String str3, bx7 bx7Var, x43 x43Var, String str4, gv9 gv9Var, String str5, boolean z) {
        super(str, str2, str3, bx7Var, true, x43Var);
        str3.getClass();
        gv9Var.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = x43Var;
        this.n = str4;
        this.o = gv9Var;
        this.p = str5;
        this.q = z;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.k;
        str.getClass();
        gv9 gv9Var = this.o;
        gv9Var.getClass();
        return new b94(this.g, this.h, this.i, this.j, str, this.l, x43Var, this.n, gv9Var, this.p, this.q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b94)) {
            return false;
        }
        b94 b94Var = (b94) obj;
        return this.g == b94Var.g && Intrinsics.c(this.h, b94Var.h) && Intrinsics.c(this.i, b94Var.i) && this.j == b94Var.j && Intrinsics.c(this.k, b94Var.k) && Intrinsics.c(this.l, b94Var.l) && this.m.equals(b94Var.m) && Intrinsics.c(this.n, b94Var.n) && Intrinsics.c(this.o, b94Var.o) && Intrinsics.c(this.p, b94Var.p) && this.q == b94Var.q;
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
        int c = dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k);
        bx7 bx7Var = this.l;
        int hashCode3 = (this.m.hashCode() + ((c + (bx7Var == null ? 0 : bx7Var.hashCode())) * 31)) * 31;
        String str3 = this.n;
        int d = ljg.d((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.o);
        String str4 = this.p;
        return Boolean.hashCode(this.q) + ((d + (str4 != null ? str4.hashCode() : 0)) * 31);
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
        StringBuilder t = dmi.t(this.g, "CustomFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", additionalData=");
        t.append(this.m);
        t.append(", type=");
        t.append(this.n);
        t.append(", images=");
        t.append(this.o);
        t.append(", externalUrl=");
        t.append(this.p);
        t.append(", isFeaturedTournamentPost=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }
}
