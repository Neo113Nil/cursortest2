package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vn7 {
    public final ho7 a;
    public final gv9 b;
    public final double c;
    public final int d;
    public final vl7 e;
    public final vl7 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final gv9 m;
    public final vl7 n;

    public vn7(ho7 ho7Var, gv9 gv9Var, double d, int i, vl7 vl7Var, vl7 vl7Var2, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, gv9 gv9Var2, vl7 vl7Var3) {
        ho7Var.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = ho7Var;
        this.b = gv9Var;
        this.c = d;
        this.d = i;
        this.e = vl7Var;
        this.f = vl7Var2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = i2;
        this.l = i3;
        this.m = gv9Var2;
        this.n = vl7Var3;
    }

    public static vn7 a(vn7 vn7Var, ho7 ho7Var, gv9 gv9Var, double d, int i, vl7 vl7Var, vl7 vl7Var2, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, gv9 gv9Var2, vl7 vl7Var3, int i4) {
        ho7 ho7Var2 = (i4 & 1) != 0 ? vn7Var.a : ho7Var;
        gv9 gv9Var3 = (i4 & 2) != 0 ? vn7Var.b : gv9Var;
        double d2 = (i4 & 4) != 0 ? vn7Var.c : d;
        int i5 = (i4 & 8) != 0 ? vn7Var.d : i;
        vl7 vl7Var4 = (i4 & 16) != 0 ? vn7Var.e : vl7Var;
        vl7 vl7Var5 = (i4 & 32) != 0 ? vn7Var.f : vl7Var2;
        boolean z5 = (i4 & 64) != 0 ? vn7Var.g : z;
        boolean z6 = (i4 & 128) != 0 ? vn7Var.h : z2;
        boolean z7 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? vn7Var.i : z3;
        boolean z8 = (i4 & 512) != 0 ? vn7Var.j : z4;
        int i6 = (i4 & 1024) != 0 ? vn7Var.k : i2;
        int i7 = (i4 & a.o) != 0 ? vn7Var.l : i3;
        gv9 gv9Var4 = (i4 & 4096) != 0 ? vn7Var.m : gv9Var2;
        vl7 vl7Var6 = (i4 & 8192) != 0 ? vn7Var.n : vl7Var3;
        vn7Var.getClass();
        ho7Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new vn7(ho7Var2, gv9Var3, d2, i5, vl7Var4, vl7Var5, z5, z6, z7, z8, i6, i7, gv9Var4, vl7Var6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn7)) {
            return false;
        }
        vn7 vn7Var = (vn7) obj;
        return Intrinsics.c(this.a, vn7Var.a) && Intrinsics.c(this.b, vn7Var.b) && Double.compare(this.c, vn7Var.c) == 0 && this.d == vn7Var.d && Intrinsics.c(this.e, vn7Var.e) && Intrinsics.c(this.f, vn7Var.f) && this.g == vn7Var.g && this.h == vn7Var.h && this.i == vn7Var.i && this.j == vn7Var.j && this.k == vn7Var.k && this.l == vn7Var.l && Intrinsics.c(this.m, vn7Var.m) && Intrinsics.c(this.n, vn7Var.n);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, dmi.b(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        vl7 vl7Var = this.e;
        int hashCode = (a + (vl7Var == null ? 0 : vl7Var.hashCode())) * 31;
        vl7 vl7Var2 = this.f;
        int d = ljg.d(wv8.a(this.l, wv8.a(this.k, dmi.e(dmi.e(dmi.e(dmi.e((hashCode + (vl7Var2 == null ? 0 : vl7Var2.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m);
        vl7 vl7Var3 = this.n;
        return d + (vl7Var3 != null ? vl7Var3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(userRound=");
        sb.append(this.a);
        sb.append(", squad=");
        sb.append(this.b);
        sb.append(", bankBalance=");
        sb.append(this.c);
        sb.append(", freeTransfersLeft=");
        sb.append(this.d);
        sb.append(", freeHit=");
        sb.append(this.e);
        sb.append(", wildCard=");
        sb.append(this.f);
        fn0.y(", unlimitedFreeTransfers=", ", pendingTransferIn=", sb, this.g, this.h);
        fn0.y(", reviewEnabled=", ", hasChanges=", sb, this.i, this.j);
        me4.r(sb, ", transferCount=", this.k, ", totalTransferFee=", this.l);
        sb.append(", validationErrors=");
        sb.append(this.m);
        sb.append(", selectedTokenDataDialog=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
