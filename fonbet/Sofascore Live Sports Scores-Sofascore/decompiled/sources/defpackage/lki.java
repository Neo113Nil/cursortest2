package defpackage;

import com.sofascore.results.subscription.SubscriptionPriceBundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lki {
    public final eli a;
    public final int b;
    public final SubscriptionPriceBundle c;
    public final gv9 d;
    public final gv9 e;
    public final uv0 f;
    public final Function1 g;

    public lki(eli eliVar, int i, SubscriptionPriceBundle subscriptionPriceBundle, b7 b7Var, gv9 gv9Var, uv0 uv0Var, Function1 function1) {
        subscriptionPriceBundle.getClass();
        b7Var.getClass();
        gv9Var.getClass();
        function1.getClass();
        this.a = eliVar;
        this.b = i;
        this.c = subscriptionPriceBundle;
        this.d = b7Var;
        this.e = gv9Var;
        this.f = uv0Var;
        this.g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lki)) {
            return false;
        }
        lki lkiVar = (lki) obj;
        return this.a == lkiVar.a && this.b == lkiVar.b && Intrinsics.c(this.c, lkiVar.c) && Intrinsics.c(this.d, lkiVar.d) && Intrinsics.c(this.e, lkiVar.e) && this.f == lkiVar.f && Intrinsics.c(this.g, lkiVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ljg.d(ljg.d((this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        return "SubscriptionDetails(type=" + this.a + ", titleRes=" + this.b + ", priceBundle=" + this.c + ", benefits=" + this.d + ", worldCupOfferBenefits=" + this.e + ", subscriptionPeriod=" + this.f + ", onSubscribe=" + this.g + ")";
    }
}
