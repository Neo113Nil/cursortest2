package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3855wa extends PublisherCallbacks {

    @NotNull
    public WeakReference<InMobiInterstitial> a;

    public C3855wa(InMobiInterstitial inMobiInterstitial) {
        inMobiInterstitial.getClass();
        this.a = new WeakReference<>(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3777ta mPubListener$media_release;
        map.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3777ta mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3803ua) mPubListener$media_release).a.onAdDismissed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3777ta mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3803ua) mPubListener$media_release).a.onAdDisplayFailed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        AbstractC3777ta mPubListener$media_release;
        adMetaInfo.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        adMetaInfo.getClass();
        ((C3803ua) mPubListener$media_release).a.onAdDisplayed(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3777ta mPubListener$media_release;
        inMobiAdRequestStatus.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        inMobiAdRequestStatus.getClass();
        ((C3803ua) mPubListener$media_release).a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AbstractC3777ta mPubListener$media_release;
        adMetaInfo.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable Fk fk) {
        InMobiInterstitial inMobiInterstitial = this.a.get();
        AbstractC3777ta mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (fk != null) {
                fk.b();
            }
        } else {
            inMobiInterstitial.getClass();
            ((C3803ua) mPubListener$media_release).a.onAdImpression(inMobiInterstitial);
            if (fk != null) {
                fk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3777ta mPubListener$media_release;
        inMobiAdRequestStatus.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        AbstractC3777ta mPubListener$media_release;
        adMetaInfo.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3777ta mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3803ua) mPubListener$media_release).a.onAdWillDisplay(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String str) {
        AbstractC3777ta mPubListener$media_release;
        str.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        AbstractC3777ta mPubListener$media_release;
        bArr.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3803ua) mPubListener$media_release).a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3777ta mPubListener$media_release;
        inMobiAdRequestStatus.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        inMobiAdRequestStatus.getClass();
        ((C3803ua) mPubListener$media_release).a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3777ta mPubListener$media_release;
        map.getClass();
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        map.getClass();
        ((C3803ua) mPubListener$media_release).a.onRewardsUnlocked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3777ta mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3803ua) mPubListener$media_release).a.onUserLeftApplication(inMobiInterstitial);
    }
}
