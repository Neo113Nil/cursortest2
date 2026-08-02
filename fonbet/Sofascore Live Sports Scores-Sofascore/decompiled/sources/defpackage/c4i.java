package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c4i {
    public final OddsCountryProvider a;
    public final e5i b;

    public c4i(OddsCountryProvider oddsCountryProvider, e5i e5iVar) {
        this.a = oddsCountryProvider;
        this.b = e5iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4i)) {
            return false;
        }
        c4i c4iVar = (c4i) obj;
        return this.a.equals(c4iVar.a) && this.b.equals(c4iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StageFeaturedOddsWrapper(provider=" + this.a + ", odds=" + this.b + ")";
    }
}
