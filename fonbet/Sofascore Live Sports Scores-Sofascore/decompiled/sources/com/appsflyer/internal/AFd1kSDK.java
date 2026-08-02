package com.appsflyer.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFd1kSDK {
    public final long registerClient;

    public AFd1kSDK(long j) {
        this.registerClient = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.registerClient == ((AFd1kSDK) obj).registerClient;
    }

    public int hashCode() {
        long j = this.registerClient;
        return (int) (j ^ (j >>> 32));
    }
}
