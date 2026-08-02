package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3803ua extends AbstractC3777ta {
    public final InterstitialAdEventListener a;

    public C3803ua(InterstitialAdEventListener interstitialAdEventListener) {
        interstitialAdEventListener.getClass();
        this.a = interstitialAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        inMobiInterstitial.getClass();
        str.getClass();
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            declaredMethod.getClass();
            declaredMethod.invoke(cls.newInstance(), this.a, inMobiInterstitial, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        inMobiInterstitial.getClass();
        adMetaInfo.getClass();
        this.a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        inMobiInterstitial.getClass();
        adMetaInfo.getClass();
        this.a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        inMobiInterstitial.getClass();
        inMobiAdRequestStatus.getClass();
        this.a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        inMobiInterstitial.getClass();
        map.getClass();
        this.a.onAdClicked(inMobiInterstitial, map);
    }
}
