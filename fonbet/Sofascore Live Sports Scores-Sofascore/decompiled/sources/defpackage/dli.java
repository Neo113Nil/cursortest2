package defpackage;

import com.sofascore.results.subscription.SubscriptionPriceBundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dli {
    public final SubscriptionPriceBundle a;
    public final SubscriptionPriceBundle b;
    public final boolean c;

    public dli(SubscriptionPriceBundle subscriptionPriceBundle, SubscriptionPriceBundle subscriptionPriceBundle2, int i) {
        subscriptionPriceBundle = (i & 1) != 0 ? null : subscriptionPriceBundle;
        subscriptionPriceBundle2 = (i & 2) != 0 ? null : subscriptionPriceBundle2;
        boolean z = (i & 4) == 0;
        this.a = subscriptionPriceBundle;
        this.b = subscriptionPriceBundle2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dli)) {
            return false;
        }
        dli dliVar = (dli) obj;
        return Intrinsics.c(this.a, dliVar.a) && Intrinsics.c(this.b, dliVar.b) && this.c == dliVar.c;
    }

    public final int hashCode() {
        SubscriptionPriceBundle subscriptionPriceBundle = this.a;
        int hashCode = (subscriptionPriceBundle == null ? 0 : subscriptionPriceBundle.hashCode()) * 31;
        SubscriptionPriceBundle subscriptionPriceBundle2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (subscriptionPriceBundle2 != null ? subscriptionPriceBundle2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionPriceState(adsPriceBundle=");
        sb.append(this.a);
        sb.append(", aiPriceBundle=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return wt3.p(sb, this.c, ")");
    }
}
