package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i0 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ p0 f183;

    public i0(p0 p0Var) {
        this.f183 = p0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        p0 p0Var = this.f183;
        VideoController videoController = (VideoController) arrayList.get(0);
        VideoEventListener videoEventListener = (VideoEventListener) arrayList.get(1);
        p0Var.getClass();
        videoController.setVideoEventListener(videoEventListener);
        return null;
    }
}
