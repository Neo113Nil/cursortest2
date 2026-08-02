package defpackage;

import com.sofascore.local_persistance.BrandColors;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pv5 {
    public final BrandColors a;
    public final BrandColors b;

    public pv5(BrandColors brandColors, BrandColors brandColors2) {
        this.a = brandColors;
        this.b = brandColors2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv5)) {
            return false;
        }
        pv5 pv5Var = (pv5) obj;
        return Intrinsics.c(this.a, pv5Var.a) && Intrinsics.c(this.b, pv5Var.b);
    }

    public final int hashCode() {
        BrandColors brandColors = this.a;
        int hashCode = (brandColors == null ? 0 : brandColors.hashCode()) * 31;
        BrandColors brandColors2 = this.b;
        return hashCode + (brandColors2 != null ? brandColors2.hashCode() : 0);
    }

    public final String toString() {
        return "EventBrandColors(backgroundColor=" + this.a + ", strokeColor=" + this.b + ")";
    }
}
