package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w22 {
    public final int a;
    public final String b;
    public final long c;
    public final String d;

    public w22(int i, String str, long j, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w22)) {
            return false;
        }
        w22 w22Var = (w22) obj;
        if (this.a != w22Var.a || !Intrinsics.c(this.b, w22Var.b)) {
            return false;
        }
        long j = w22Var.c;
        int i = r13.j;
        return e8k.a(this.c, j) && Intrinsics.c(this.d, w22Var.d);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        int c2 = ljg.c(c, 31, this.c);
        String str = this.d;
        return c2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return fc6.o(dmi.t(this.a, "BrandHeaderUiModel(id=", ", slug=", this.b, ", backgroundColor="), r13.i(this.c), ", url=", this.d, ")");
    }
}
