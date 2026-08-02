package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cli {
    public final s5k a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Context e;

    public cli(s5k s5kVar, boolean z, boolean z2, boolean z3, Context context) {
        s5kVar.getClass();
        this.a = s5kVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cli)) {
            return false;
        }
        cli cliVar = (cli) obj;
        return this.a == cliVar.a && this.b == cliVar.b && this.c == cliVar.c && this.d == cliVar.d && this.e.equals(cliVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.e(dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionOfferConditions(screen=");
        sb.append(this.a);
        sb.append(", isReferral=");
        sb.append(this.b);
        sb.append(", getFeaturedOffer=");
        vxd.t(", hasFreeTrialAvailable=", ", context=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
