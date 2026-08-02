package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jii extends ja5 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final c20 e;

    public jii(float f, float f2, int i, int i2, c20 c20Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        c20Var = (i3 & 16) != 0 ? null : c20Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = c20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jii)) {
            return false;
        }
        jii jiiVar = (jii) obj;
        return this.a == jiiVar.a && this.b == jiiVar.b && this.c == jiiVar.c && this.d == jiiVar.d && Intrinsics.c(this.e, jiiVar.e);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, wv8.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        c20 c20Var = this.e;
        return a + (c20Var != null ? c20Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
