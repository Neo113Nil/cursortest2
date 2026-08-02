package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d49 extends f41 {
    public final gv9 m;
    public final int n;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d49(int i, int i2, gv9 gv9Var) {
        super(gv9Var, null, null, null, null, null, 252);
        gv9Var.getClass();
        this.m = gv9Var;
        this.n = i;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d49)) {
            return false;
        }
        d49 d49Var = (d49) obj;
        return Intrinsics.c(this.m, d49Var.m) && this.n == d49Var.n && this.o == d49Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + wv8.a(this.n, this.m.hashCode() * 31, 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedNewsFeedCardModel(posts=");
        sb.append(this.m);
        sb.append(", id=");
        sb.append(this.n);
        sb.append(", groupNumber=");
        return fc6.h(this.o, ")", sb);
    }
}
