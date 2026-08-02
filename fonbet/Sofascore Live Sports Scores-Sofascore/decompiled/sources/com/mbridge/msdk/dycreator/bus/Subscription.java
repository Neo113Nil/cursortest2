package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class Subscription {
    final Object a;
    final SubscriberMethod b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.a = obj;
        this.b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.a == subscription.a && this.b.equals(subscription.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.d.hashCode() + this.a.hashCode();
    }
}
