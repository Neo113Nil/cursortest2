package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v39 extends f41 implements v31 {
    public final int m;
    public final gv9 n;
    public final bx7 o;
    public final String p;
    public final x43 q;
    public final boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v39(int i, gv9 gv9Var, bx7 bx7Var, String str, x43 x43Var, boolean z) {
        super(gv9Var, null, null, str, bx7Var, x43Var, 28);
        gv9Var.getClass();
        str.getClass();
        this.m = i;
        this.n = gv9Var;
        this.o = bx7Var;
        this.p = str;
        this.q = x43Var;
        this.r = z;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.n;
        gv9Var.getClass();
        String str = this.p;
        str.getClass();
        return new v39(this.m, gv9Var, this.o, str, x43Var, this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v39)) {
            return false;
        }
        v39 v39Var = (v39) obj;
        return this.m == v39Var.m && Intrinsics.c(this.n, v39Var.n) && Intrinsics.c(this.o, v39Var.o) && Intrinsics.c(this.p, v39Var.p) && this.q.equals(v39Var.q) && this.r == v39Var.r;
    }

    @Override // defpackage.f41, defpackage.w31
    public final x43 f() {
        return this.q;
    }

    @Override // defpackage.f41, defpackage.w31
    public final bx7 h() {
        return this.o;
    }

    public final int hashCode() {
        int d = ljg.d(Integer.hashCode(this.m) * 31, 31, this.n);
        bx7 bx7Var = this.o;
        return Boolean.hashCode(this.r) + ((this.q.hashCode() + dmi.c((d + (bx7Var == null ? 0 : bx7Var.hashCode())) * 31, 31, this.p)) * 31);
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

    public final String toString() {
        return "GroupFeedCardModel(id=" + this.m + ", posts=" + this.n + ", event=" + this.o + ", sport=" + this.p + ", additionalData=" + this.q + ", hideSocialComponent=" + this.r + ")";
    }
}
