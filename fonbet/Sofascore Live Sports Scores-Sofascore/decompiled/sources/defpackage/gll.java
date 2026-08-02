package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gll {
    public final gv9 a;
    public final uv3 b;
    public final skl c;
    public final Bitmap d;

    public gll(gv9 gv9Var, uv3 uv3Var, skl sklVar, Bitmap bitmap) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = uv3Var;
        this.c = sklVar;
        this.d = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gll)) {
            return false;
        }
        gll gllVar = (gll) obj;
        return Intrinsics.c(this.a, gllVar.a) && Intrinsics.c(this.b, gllVar.b) && Intrinsics.c(this.c, gllVar.c) && Intrinsics.c(this.d, gllVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uv3 uv3Var = this.b;
        int hashCode2 = (hashCode + (uv3Var == null ? 0 : uv3Var.hashCode())) * 31;
        skl sklVar = this.c;
        int hashCode3 = (hashCode2 + (sklVar == null ? 0 : sklVar.hashCode())) * 31;
        Bitmap bitmap = this.d;
        return hashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "WorldCupWidgetConfigState(countries=" + this.a + ", selectedCountry=" + this.b + ", widgetCards=" + this.c + ", selectedTeamLogo=" + this.d + ")";
    }
}
