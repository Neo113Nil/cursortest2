package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u implements j {
    public final com.moloco.sdk.internal.services.bidtoken.t a;
    public MolocoPrivacy.PrivacySettings b;

    public u(com.moloco.sdk.internal.services.bidtoken.t tVar) {
        this.a = tVar;
        this.b = tVar.a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = this.a.a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean c = Intrinsics.c(this.b, this.a.a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings()));
        boolean z = !c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "PrivacyStateSignalProvider", !c ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "PrivacyStateSignalProvider";
    }
}
