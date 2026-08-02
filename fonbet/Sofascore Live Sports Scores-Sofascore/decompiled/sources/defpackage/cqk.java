package defpackage;

import com.sofascore.model.newNetwork.Highlight;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cqk extends w31 implements uak, v31 {
    public final int g;
    public final String h;
    public final long i;
    public final iy7 j;
    public final bx7 k;
    public final String l;
    public final String m;
    public final Highlight n;
    public final x43 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqk(int i, String str, long j, iy7 iy7Var, bx7 bx7Var, String str2, String str3, Highlight highlight, x43 x43Var) {
        super(str2, str3, str, bx7Var, true, x43Var);
        str.getClass();
        bx7Var.getClass();
        this.g = i;
        this.h = str;
        this.i = j;
        this.j = iy7Var;
        this.k = bx7Var;
        this.l = str2;
        this.m = str3;
        this.n = highlight;
        this.o = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.h;
        str.getClass();
        bx7 bx7Var = this.k;
        bx7Var.getClass();
        return new cqk(this.g, str, this.i, this.j, bx7Var, this.l, this.m, this.n, x43Var);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqk)) {
            return false;
        }
        cqk cqkVar = (cqk) obj;
        return this.g == cqkVar.g && Intrinsics.c(this.h, cqkVar.h) && this.i == cqkVar.i && Intrinsics.c(this.j, cqkVar.j) && Intrinsics.c(this.k, cqkVar.k) && Intrinsics.c(this.l, cqkVar.l) && Intrinsics.c(this.m, cqkVar.m) && this.n.equals(cqkVar.n) && this.o.equals(cqkVar.o);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.m;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.k;
    }

    public final int hashCode() {
        int c = ljg.c(dmi.c(Integer.hashCode(this.g) * 31, 31, this.h), 31, this.i);
        iy7 iy7Var = this.j;
        int d = fn0.d(this.k, (c + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31, 31);
        String str = this.l;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.h;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.l;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "VideoHighlightFeedCardModel(id=", ", sport=", this.h, ", createdAtTimestamp=");
        t.append(this.i);
        t.append(", uniqueTournament=");
        t.append(this.j);
        t.append(", event=");
        t.append(this.k);
        t.append(", title=");
        t.append(this.l);
        t.append(", body=");
        t.append(this.m);
        t.append(", highlight=");
        t.append(this.n);
        t.append(", additionalData=");
        t.append(this.o);
        t.append(")");
        return t.toString();
    }
}
