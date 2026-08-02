package defpackage;

import com.sofascore.model.database.MediaReactionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b49 extends f41 implements uak {
    public final int m;
    public final gv9 n;
    public final x43 o;
    public final iy7 p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b49(int i, gv9 gv9Var, iy7 iy7Var) {
        super(gv9Var, null, null, "", null, r0, 16);
        x43 x43Var = new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31);
        gv9Var.getClass();
        this.m = i;
        this.n = gv9Var;
        this.o = x43Var;
        this.p = iy7Var;
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b49)) {
            return false;
        }
        b49 b49Var = (b49) obj;
        return this.m == b49Var.m && Intrinsics.c(this.n, b49Var.n) && this.o.equals(b49Var.o) && this.p.equals(b49Var.p);
    }

    @Override // defpackage.f41, defpackage.w31
    public final x43 f() {
        return this.o;
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.o.hashCode() + ljg.d(Integer.hashCode(this.m) * 31, 31, this.n)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.m;
    }

    public final String toString() {
        return "GroupedHighlightsFeedCardModel(id=" + this.m + ", posts=" + this.n + ", additionalData=" + this.o + ", uniqueTournament=" + this.p + ")";
    }
}
