package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f49 extends f41 {
    public final gv9 m;
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f49(int i, gv9 gv9Var) {
        super(gv9Var, null, null, null, null, null, 252);
        gv9Var.getClass();
        this.m = gv9Var;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f49)) {
            return false;
        }
        f49 f49Var = (f49) obj;
        return Intrinsics.c(this.m, f49Var.m) && this.n == f49Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + (this.m.hashCode() * 31);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.n;
    }

    public final String toString() {
        return "GroupedShortVideoFeedCardModel(posts=" + this.m + ", id=" + this.n + ")";
    }
}
