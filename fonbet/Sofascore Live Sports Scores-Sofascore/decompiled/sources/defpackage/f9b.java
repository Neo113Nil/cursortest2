package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f9b {
    public final int a;
    public final int b;
    public final Integer c;

    public f9b(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9b)) {
            return false;
        }
        f9b f9bVar = (f9b) obj;
        return this.a == f9bVar.a && this.b == f9bVar.b && Intrinsics.c(this.c, f9bVar.c);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return vxd.n(lnb.s(this.a, this.b, "LineupsListIncidentIconData(iconRes=", ", number=", ", tint="), this.c, ")");
    }

    public /* synthetic */ f9b(int i) {
        this(i, 0, null);
    }
}
