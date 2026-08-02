package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z39 extends f41 {
    public final gv9 m;
    public final boolean n;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z39(gv9 gv9Var, boolean z, int i) {
        super(gv9Var, null, null, null, null, null, 252);
        gv9Var.getClass();
        this.m = gv9Var;
        this.n = z;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z39)) {
            return false;
        }
        z39 z39Var = (z39) obj;
        return Intrinsics.c(this.m, z39Var.m) && this.n == z39Var.n && this.o == z39Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + dmi.e(this.m.hashCode() * 31, 31, this.n);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedExternalVideoFeedCardModel(posts=");
        sb.append(this.m);
        sb.append(", isInfluencerVideoPost=");
        sb.append(this.n);
        sb.append(", id=");
        return fc6.h(this.o, ")", sb);
    }
}
