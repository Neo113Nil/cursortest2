package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mvc extends w31 implements a1i {
    public final String g;
    public final String h;
    public final bx7 i;
    public final long j;
    public final String k;
    public final int l;

    public mvc(String str, String str2, bx7 bx7Var, long j, String str3, int i) {
        super(str, str2, str3, bx7Var, false);
        this.g = str;
        this.h = str2;
        this.i = bx7Var;
        this.j = j;
        this.k = str3;
        this.l = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvc)) {
            return false;
        }
        mvc mvcVar = (mvc) obj;
        return Intrinsics.c(this.g, mvcVar.g) && Intrinsics.c(this.h, mvcVar.h) && this.i.equals(mvcVar.i) && this.j == mvcVar.j && Intrinsics.c(this.k, mvcVar.k) && this.l == mvcVar.l;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.h;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(0) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int c = ljg.c(fn0.d(this.i, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.j);
        String str3 = this.k;
        return Integer.hashCode(this.l) + ((c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return 0;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.k;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.g;
    }

    public final String toString() {
        StringBuilder s = mz1.s("MoreInsightsCardModel(id=0, title=", this.g, ", body=", this.h, ", event=");
        s.append(this.i);
        s.append(", createdAtTimestamp=");
        s.append(this.j);
        wt3.t(this.l, ", sport=", this.k, ", ctaTextRes=", s);
        s.append(")");
        return s.toString();
    }
}
