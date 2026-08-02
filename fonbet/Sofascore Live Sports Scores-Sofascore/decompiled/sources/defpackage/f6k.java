package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f6k {
    public final tf8 a;
    public final wg8 b;
    public final int c;
    public final int d;
    public final Object e;

    public f6k(tf8 tf8Var, wg8 wg8Var, int i, int i2, Object obj) {
        this.a = tf8Var;
        this.b = wg8Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6k)) {
            return false;
        }
        f6k f6kVar = (f6k) obj;
        return Intrinsics.c(this.a, f6kVar.a) && Intrinsics.c(this.b, f6kVar.b) && this.c == f6kVar.c && this.d == f6kVar.d && Intrinsics.c(this.e, f6kVar.e);
    }

    public final int hashCode() {
        tf8 tf8Var = this.a;
        int a = wv8.a(this.d, wv8.a(this.c, (((tf8Var == null ? 0 : tf8Var.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return a + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return lnb.p(sb, this.e, ')');
    }
}
