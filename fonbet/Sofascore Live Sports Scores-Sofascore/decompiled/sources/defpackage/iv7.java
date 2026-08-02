package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iv7 {
    public final Event a;
    public final FeaturedOddsWithProvider b;

    public iv7(Event event, FeaturedOddsWithProvider featuredOddsWithProvider) {
        event.getClass();
        this.a = event;
        this.b = featuredOddsWithProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv7)) {
            return false;
        }
        iv7 iv7Var = (iv7) obj;
        return Intrinsics.c(this.a, iv7Var.a) && Intrinsics.c(this.b, iv7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FeaturedOddsWithProvider featuredOddsWithProvider = this.b;
        return hashCode + (featuredOddsWithProvider == null ? 0 : featuredOddsWithProvider.hashCode());
    }

    public final String toString() {
        return "EventOddsData(event=" + this.a + ", oddsWrapper=" + this.b + ")";
    }
}
