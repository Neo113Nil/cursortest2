package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vk1 {
    public final boolean a;
    public final gv9 b;
    public final gv9 c;
    public final gv9 d;

    public vk1(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = z;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = gv9Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk1)) {
            return false;
        }
        vk1 vk1Var = (vk1) obj;
        return this.a == vk1Var.a && Intrinsics.c(this.b, vk1Var.b) && Intrinsics.c(this.c, vk1Var.c) && Intrinsics.c(this.d, vk1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ljg.d(ljg.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "BaseballPrematchLineupsUiData(confirmed=" + this.a + ", batters=" + this.b + ", pitchers=" + this.c + ", injuries=" + this.d + ")";
    }
}
