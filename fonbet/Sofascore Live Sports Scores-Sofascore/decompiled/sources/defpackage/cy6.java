package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cy6 implements dy6 {
    public final Event a;
    public final FeaturedOddsWithProvider b;

    public cy6(Event event, FeaturedOddsWithProvider featuredOddsWithProvider) {
        event.getClass();
        this.a = event;
        this.b = featuredOddsWithProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy6)) {
            return false;
        }
        cy6 cy6Var = (cy6) obj;
        return Intrinsics.c(this.a, cy6Var.a) && Intrinsics.c(this.b, cy6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FeaturedOddsWithProvider featuredOddsWithProvider = this.b;
        return hashCode + (featuredOddsWithProvider == null ? 0 : featuredOddsWithProvider.hashCode());
    }

    public final String toString() {
        return "EventWithOdds(event=" + this.a + ", featuredOdds=" + this.b + ")";
    }
}
