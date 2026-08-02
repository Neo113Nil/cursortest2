package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pr5 implements sr5 {
    public final cu a;

    public pr5(cu cuVar) {
        this.a = cuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr5) && this.a == ((pr5) obj).a;
    }

    public final int hashCode() {
        cu cuVar = this.a;
        if (cuVar == null) {
            return 0;
        }
        return cuVar.hashCode();
    }

    public final String toString() {
        return "GetSubscription(subscriptionOffer=" + this.a + ")";
    }
}
