package defpackage;

import com.sofascore.model.database.MediaReactionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nte extends w31 implements kre, axi, a1i {
    public final int g;
    public final long h;
    public final String i;
    public final bx7 j;
    public final fy7 k;
    public final ux7 l;
    public final Double m;
    public final gv9 n;
    public final x43 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nte(int i, long j, String str, bx7 bx7Var, fy7 fy7Var, ux7 ux7Var, Double d, gv9 gv9Var) {
        super(null, null, str, bx7Var, true, r6);
        x43 x43Var = new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31);
        gv9Var.getClass();
        this.g = i;
        this.h = j;
        this.i = str;
        this.j = bx7Var;
        this.k = fy7Var;
        this.l = ux7Var;
        this.m = d;
        this.n = gv9Var;
        this.o = x43Var;
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nte)) {
            return false;
        }
        nte nteVar = (nte) obj;
        return this.g == nteVar.g && this.h == nteVar.h && this.i.equals(nteVar.i) && this.j.equals(nteVar.j) && this.k.equals(nteVar.k) && this.l.equals(nteVar.l) && Intrinsics.c(this.m, nteVar.m) && Intrinsics.c(this.n, nteVar.n) && this.o.equals(nteVar.o);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
    }

    @Override // defpackage.kre
    public final ux7 getPlayer() {
        return this.l;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (this.l.hashCode() + ((this.k.hashCode() + fn0.d(this.j, dmi.c(ljg.c(Integer.hashCode(this.g) * 31, 31, this.h), 31, this.i), 31)) * 31)) * 31;
        Double d = this.m;
        return this.o.hashCode() + ljg.d((hashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.n);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.i;
    }

    public final String toString() {
        return "PlayerOfTheMatchFeedCardModel(id=" + this.g + ", createdAtTimestamp=" + this.h + ", sport=" + this.i + ", event=" + this.j + ", team=" + this.k + ", player=" + this.l + ", rating=" + this.m + ", statistics=" + this.n + ", additionalData=" + this.o + ")";
    }
}
