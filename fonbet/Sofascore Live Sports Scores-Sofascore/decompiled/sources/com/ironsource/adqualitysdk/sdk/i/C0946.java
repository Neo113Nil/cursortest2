package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.‿, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0946 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0933 f3155;

    public C0946(C0933 c0933) {
        this.f3155 = c0933;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0933 c0933 = this.f3155;
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) arrayList.get(0);
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) arrayList.get(1);
        c0933.getClass();
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        return null;
    }
}
