package defpackage;

import com.sofascore.model.odds.FeaturedOddsWithProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fy6 {
    public final y21 a;
    public final FeaturedOddsWithProvider b;

    public fy6(y21 y21Var, FeaturedOddsWithProvider featuredOddsWithProvider) {
        this.a = y21Var;
        this.b = featuredOddsWithProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy6)) {
            return false;
        }
        fy6 fy6Var = (fy6) obj;
        return this.a.equals(fy6Var.a) && Intrinsics.c(this.b, fy6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FeaturedOddsWithProvider featuredOddsWithProvider = this.b;
        return hashCode + (featuredOddsWithProvider == null ? 0 : featuredOddsWithProvider.hashCode());
    }

    public final String toString() {
        return "EventWithOdds(eventListItem=" + this.a + ", featuredOdds=" + this.b + ")";
    }
}
