package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ґ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0407 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0213 f1169;

    public C0407(C0213 c0213) {
        this.f1169 = c0213;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0213 c0213 = this.f1169;
        InneractiveContentController inneractiveContentController = (InneractiveContentController) arrayList.get(0);
        VideoContentListener videoContentListener = (VideoContentListener) arrayList.get(1);
        c0213.getClass();
        inneractiveContentController.setEventsListener(videoContentListener);
        return null;
    }
}
