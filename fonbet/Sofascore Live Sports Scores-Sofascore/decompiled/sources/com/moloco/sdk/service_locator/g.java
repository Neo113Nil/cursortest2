package com.moloco.sdk.service_locator;

import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class g {
    public static final mqi a = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(24));
    public static final mqi b = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(25));

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j a() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) b.getValue();
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k b() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k) a.getValue();
    }
}
