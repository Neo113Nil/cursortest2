package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hz1 {
    public a10 a = null;
    public wx b = null;
    public wj2 c = null;
    public b20 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz1)) {
            return false;
        }
        hz1 hz1Var = (hz1) obj;
        return Intrinsics.c(this.a, hz1Var.a) && Intrinsics.c(this.b, hz1Var.b) && Intrinsics.c(this.c, hz1Var.c) && Intrinsics.c(this.d, hz1Var.d);
    }

    public final int hashCode() {
        a10 a10Var = this.a;
        int hashCode = (a10Var == null ? 0 : a10Var.hashCode()) * 31;
        wx wxVar = this.b;
        int hashCode2 = (hashCode + (wxVar == null ? 0 : wxVar.hashCode())) * 31;
        wj2 wj2Var = this.c;
        int hashCode3 = (hashCode2 + (wj2Var == null ? 0 : wj2Var.hashCode())) * 31;
        b20 b20Var = this.d;
        return hashCode3 + (b20Var != null ? b20Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
