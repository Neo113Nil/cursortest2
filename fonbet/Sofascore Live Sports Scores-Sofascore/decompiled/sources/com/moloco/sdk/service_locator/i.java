package com.moloco.sdk.service_locator;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class i {
    public static final mqi a = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(26));
    public static final mqi b = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(27));
    public static final mqi c = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(28));
    public static final mqi d = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(29));
    public static final mqi e = ypa.b(new h(0));

    public static t0 a() {
        return new t0(f1.e(null));
    }

    public static com.moloco.sdk.internal.services.i b() {
        return (com.moloco.sdk.internal.services.i) a.getValue();
    }

    public static com.moloco.sdk.internal.d c() {
        return (com.moloco.sdk.internal.d) d.getValue();
    }
}
