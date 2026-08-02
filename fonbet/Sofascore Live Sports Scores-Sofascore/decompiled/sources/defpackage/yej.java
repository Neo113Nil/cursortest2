package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyej;", "Lbuc;", "Lbfj;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class yej extends buc {
    public final String a;
    public final dfj b;
    public final sf8 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final c23 h;

    public yej(String str, dfj dfjVar, sf8 sf8Var, int i, boolean z, int i2, int i3, c23 c23Var) {
        this.a = str;
        this.b = dfjVar;
        this.c = sf8Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = c23Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        bfj bfjVar = new bfj();
        bfjVar.o = this.a;
        bfjVar.p = this.b;
        bfjVar.q = this.c;
        bfjVar.r = this.d;
        bfjVar.s = this.e;
        bfjVar.t = this.f;
        bfjVar.u = this.g;
        bfjVar.v = this.h;
        return bfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yej)) {
            return false;
        }
        yej yejVar = (yej) obj;
        return Intrinsics.c(this.h, yejVar.h) && Intrinsics.c(this.a, yejVar.a) && Intrinsics.c(this.b, yejVar.b) && Intrinsics.c(this.c, yejVar.c) && this.d == yejVar.d && this.e == yejVar.e && this.f == yejVar.f && this.g == yejVar.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.a.c(r0.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // defpackage.buc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(wtc wtcVar) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        sf8 sf8Var;
        sf8 sf8Var2;
        int i5;
        int i6;
        bfj bfjVar = (bfj) wtcVar;
        c23 c23Var = bfjVar.v;
        c23 c23Var2 = this.h;
        boolean c = Intrinsics.c(c23Var2, c23Var);
        bfjVar.v = c23Var2;
        boolean z4 = false;
        boolean z5 = true;
        dfj dfjVar = this.b;
        if (c) {
            dfj dfjVar2 = bfjVar.p;
            if (dfjVar == dfjVar2) {
                dfjVar.getClass();
            }
            z = false;
            str = bfjVar.o;
            str2 = this.a;
            if (!Intrinsics.c(str, str2)) {
                bfjVar.o = str2;
                bfjVar.z = null;
                z4 = true;
            }
            boolean z6 = !bfjVar.p.d(dfjVar);
            bfjVar.p = dfjVar;
            i = bfjVar.u;
            i2 = this.g;
            if (i != i2) {
                bfjVar.u = i2;
                z6 = true;
            }
            i3 = bfjVar.t;
            i4 = this.f;
            if (i3 != i4) {
                bfjVar.t = i4;
                z6 = true;
            }
            z2 = bfjVar.s;
            z3 = this.e;
            if (z2 != z3) {
                bfjVar.s = z3;
                z6 = true;
            }
            sf8Var = bfjVar.q;
            sf8Var2 = this.c;
            if (!Intrinsics.c(sf8Var, sf8Var2)) {
                bfjVar.q = sf8Var2;
                z6 = true;
            }
            i5 = bfjVar.r;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                bfjVar.r = i6;
            }
            if (!z4 || z5) {
                f8e k1 = bfjVar.k1();
                String str3 = bfjVar.o;
                dfj dfjVar3 = bfjVar.p;
                sf8 sf8Var3 = bfjVar.q;
                int i7 = bfjVar.r;
                boolean z7 = bfjVar.s;
                int i8 = bfjVar.t;
                int i9 = bfjVar.u;
                k1.a = str3;
                k1.b = dfjVar3;
                k1.c = sf8Var3;
                k1.d = i7;
                k1.e = z7;
                k1.f = i8;
                k1.g = i9;
                k1.s = (k1.s << 2) | 2;
                k1.c();
            }
            if (bfjVar.n) {
                return;
            }
            if (z4 || (z && bfjVar.y != null)) {
                sea.p(bfjVar);
            }
            if (z4 || z5) {
                y6a.E(bfjVar);
                n9e.E(bfjVar);
            }
            if (z) {
                n9e.E(bfjVar);
                return;
            }
            return;
        }
        z = true;
        str = bfjVar.o;
        str2 = this.a;
        if (!Intrinsics.c(str, str2)) {
        }
        boolean z62 = !bfjVar.p.d(dfjVar);
        bfjVar.p = dfjVar;
        i = bfjVar.u;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = bfjVar.t;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = bfjVar.s;
        z3 = this.e;
        if (z2 != z3) {
        }
        sf8Var = bfjVar.q;
        sf8Var2 = this.c;
        if (!Intrinsics.c(sf8Var, sf8Var2)) {
        }
        i5 = bfjVar.r;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
        }
        f8e k12 = bfjVar.k1();
        String str32 = bfjVar.o;
        dfj dfjVar32 = bfjVar.p;
        sf8 sf8Var32 = bfjVar.q;
        int i72 = bfjVar.r;
        boolean z72 = bfjVar.s;
        int i82 = bfjVar.t;
        int i92 = bfjVar.u;
        k12.a = str32;
        k12.b = dfjVar32;
        k12.c = sf8Var32;
        k12.d = i72;
        k12.e = z72;
        k12.f = i82;
        k12.g = i92;
        k12.s = (k12.s << 2) | 2;
        k12.c();
        if (bfjVar.n) {
        }
    }

    public final int hashCode() {
        int e = (((dmi.e(wv8.a(this.d, (this.c.hashCode() + dmi.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
        c23 c23Var = this.h;
        return e + (c23Var != null ? c23Var.hashCode() : 0);
    }
}
