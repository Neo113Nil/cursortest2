package defpackage;

import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m32 {
    public final Brand a;
    public final Integer b;
    public final BrandLocation c;
    public final boolean d;

    public m32(Brand brand, Integer num, BrandLocation brandLocation, boolean z) {
        brandLocation.getClass();
        this.a = brand;
        this.b = num;
        this.c = brandLocation;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m32)) {
            return false;
        }
        m32 m32Var = (m32) obj;
        return this.a.equals(m32Var.a) && Intrinsics.c(this.b, m32Var.b) && this.c == m32Var.c && this.d == m32Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 961);
    }

    public final String toString() {
        return "BrandingListItem(brand=" + this.a + ", uniqueTournamentId=" + this.b + ", location=" + this.c + ", brandText=null, topDivider=" + this.d + ")";
    }
}
