package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3356d2 extends AbstractC3330c2 {
    public final BannerAdEventListener a;

    public C3356d2(BannerAdEventListener bannerAdEventListener) {
        bannerAdEventListener.getClass();
        this.a = bannerAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        inMobiBanner.getClass();
        str.getClass();
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            declaredMethod.getClass();
            declaredMethod.invoke(cls.newInstance(), this.a, inMobiBanner, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        inMobiBanner.getClass();
        adMetaInfo.getClass();
        this.a.onAdLoadSucceeded(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        inMobiBanner.getClass();
        adMetaInfo.getClass();
        this.a.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        inMobiBanner.getClass();
        inMobiAdRequestStatus.getClass();
        this.a.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        inMobiBanner.getClass();
        map.getClass();
        this.a.onAdClicked(inMobiBanner, map);
    }
}
