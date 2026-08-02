package com.moloco.sdk.internal.services;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g {
    public final Context a;

    public g(Context context) {
        this.a = context;
    }

    public final f a() {
        Context context = this.a;
        com.moloco.sdk.common_adapter_internal.a a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q(context).a();
        float f = a.c;
        return new f(a.a, f, a.b, a.d, a.f, a.e, context.getResources().getDisplayMetrics().xdpi, context.getResources().getDisplayMetrics().ydpi);
    }
}
