package com.moloco.sdk.service_locator;

import defpackage.mqi;
import defpackage.vh9;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class j {
    public static final mqi a = ypa.b(new h(1));
    public static final mqi b = ypa.b(new h(2));
    public static final mqi c = ypa.b(new h(3));
    public static final mqi d = ypa.b(new h(4));

    public static vh9 a() {
        return (vh9) a.getValue();
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k b() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) d.getValue();
    }
}
