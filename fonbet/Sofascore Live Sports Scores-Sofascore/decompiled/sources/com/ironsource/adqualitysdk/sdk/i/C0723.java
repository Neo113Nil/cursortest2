package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0723 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0317 f2431;

    public C0723(C0317 c0317) {
        this.f2431 = c0317;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0317 c0317 = this.f2431;
        EventListenerNotificationsInterface eventListenerNotificationsInterface = (EventListenerNotificationsInterface) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0317.getClass();
        eventListenerNotificationsInterface.setEventListener(eventListener);
        return null;
    }
}
