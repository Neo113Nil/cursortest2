package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tn5 {
    public final nr9 a;
    public final boolean b;
    public final pe4 c;
    public final String d;

    public tn5(nr9 nr9Var, boolean z, pe4 pe4Var, String str) {
        this.a = nr9Var;
        this.b = z;
        this.c = pe4Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn5)) {
            return false;
        }
        tn5 tn5Var = (tn5) obj;
        return Intrinsics.c(this.a, tn5Var.a) && this.b == tn5Var.b && this.c == tn5Var.c && Intrinsics.c(this.d, tn5Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
