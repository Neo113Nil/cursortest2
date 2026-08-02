package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ysd {
    public final int a;
    public final boolean b;
    public final gv9 c;
    public final gv9 d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ysd(int i, boolean z, gv9 gv9Var, int i2) {
        this(r1, r2, r3, (i2 & 8) != 0 ? r3 : gv9Var, "");
        int i3 = (i2 & 1) != 0 ? 1 : i;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        rlh rlhVar = rlh.b;
    }

    public static ysd a(ysd ysdVar, int i, gv9 gv9Var, gv9 gv9Var2, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = ysdVar.a;
        }
        int i3 = i;
        boolean z = (i2 & 2) != 0 ? ysdVar.b : true;
        if ((i2 & 4) != 0) {
            gv9Var = ysdVar.c;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i2 & 8) != 0) {
            gv9Var2 = ysdVar.d;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i2 & 16) != 0) {
            str = ysdVar.e;
        }
        String str2 = str;
        ysdVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        str2.getClass();
        return new ysd(i3, z, gv9Var3, gv9Var4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysd)) {
            return false;
        }
        ysd ysdVar = (ysd) obj;
        return this.a == ysdVar.a && this.b == ysdVar.b && Intrinsics.c(this.c, ysdVar.c) && Intrinsics.c(this.d, ysdVar.d) && Intrinsics.c(this.e, ysdVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ljg.d(ljg.d(dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingState(currentStep=");
        sb.append(this.a);
        sb.append(", showSteps=");
        sb.append(this.b);
        sb.append(", recommendedItems=");
        vxd.u(sb, this.c, ", selectedItems=", this.d, ", query=");
        return mz1.o(sb, this.e, ")");
    }

    public ysd(int i, boolean z, gv9 gv9Var, gv9 gv9Var2, String str) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = z;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = str;
    }
}
