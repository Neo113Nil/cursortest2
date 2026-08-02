package defpackage;

import com.sofascore.model.Country;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v3k {
    public final Country a;
    public final gv9 b;

    public v3k(Country country, gv9 gv9Var) {
        country.getClass();
        gv9Var.getClass();
        this.a = country;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3k)) {
            return false;
        }
        v3k v3kVar = (v3k) obj;
        return Intrinsics.c(this.a, v3kVar.a) && Intrinsics.c(this.b, v3kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TvChannelsListData(selectedCountry=" + this.a + ", tvChannels=" + this.b + ")";
    }
}
