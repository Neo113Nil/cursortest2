package com.moloco.sdk.service_locator;

import com.moloco.sdk.internal.services.r;
import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b {
    public static final mqi a = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(7));
    public static final mqi b = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(8));
    public static final mqi c = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(9));
    public static final mqi d = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(10));
    public static final mqi e = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(11));

    public static r a() {
        return (r) c.getValue();
    }

    public static com.moloco.sdk.internal.error.b b() {
        return (com.moloco.sdk.internal.error.b) d.getValue();
    }
}
