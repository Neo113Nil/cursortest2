package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements j {
    public final com.moloco.sdk.internal.services.o a;
    public com.facebook.appevents.j b;

    public c(com.moloco.sdk.internal.services.o oVar) {
        oVar.getClass();
        this.a = oVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean z = !Intrinsics.c(this.b, d());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", com.appsflyer.internal.i.j("[CBT][ASP]: needsRefresh: ", z), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AdvertisingSignalProvider";
    }

    public final com.facebook.appevents.j d() {
        com.facebook.appevents.j a = ((com.moloco.sdk.internal.services.p) this.a).a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + a, false, 4, null);
        return a;
    }
}
