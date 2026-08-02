package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ho7 implements Serializable {
    public final mj7 a;
    public final Integer b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    static {
        yaa.w();
        wd5 wd5Var = xd5.b;
        xd5.k(wkn.R(2, be5.HOURS), be5.SECONDS);
        jj7 jj7Var = jj7.d;
    }

    public /* synthetic */ ho7(mj7 mj7Var, Integer num, int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        this(mj7Var, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, false);
    }

    public static ho7 a(ho7 ho7Var, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        mj7 mj7Var = ho7Var.a;
        if ((i2 & 2) != 0) {
            num = ho7Var.b;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            i = ho7Var.c;
        }
        int i3 = i;
        int i4 = ho7Var.d;
        if ((i2 & 16) != 0) {
            z = ho7Var.e;
        }
        boolean z5 = z;
        if ((i2 & 32) != 0) {
            z2 = ho7Var.f;
        }
        boolean z6 = z2;
        if ((i2 & 64) != 0) {
            z3 = ho7Var.g;
        }
        boolean z7 = z3;
        boolean z8 = (i2 & 128) != 0 ? ho7Var.h : z4;
        ho7Var.getClass();
        mj7Var.getClass();
        return new ho7(mj7Var, num2, i3, i4, z5, z6, z7, z8);
    }

    public final boolean d() {
        return this.e || this.g || this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho7)) {
            return false;
        }
        ho7 ho7Var = (ho7) obj;
        return Intrinsics.c(this.a, ho7Var.a) && Intrinsics.c(this.b, ho7Var.b) && this.c == ho7Var.c && this.d == ho7Var.d && this.e == ho7Var.e && this.f == ho7Var.f && this.g == ho7Var.g && this.h == ho7Var.h;
    }

    public final boolean g() {
        return this.e || this.f || this.a.p;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.h) + dmi.e(dmi.e(dmi.e(wv8.a(this.d, wv8.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyUserRoundUiModel(round=");
        sb.append(this.a);
        sb.append(", userPoints=");
        sb.append(this.b);
        sb.append(", freeTransfers=");
        me4.q(sb, this.c, ", transferPenalty=", this.d, ", wildcardActive=");
        vxd.t(", freeHitActive=", ", tripleCaptainActive=", sb, this.e, this.f);
        return w1l.i(", isLive=", ")", sb, this.g, this.h);
    }

    public ho7(mj7 mj7Var, Integer num, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = mj7Var;
        this.b = num;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }
}
