package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3433g2 extends PublisherCallbacks {

    @NotNull
    private WeakReference<InMobiBanner> a;

    public C3433g2(InMobiBanner inMobiBanner) {
        inMobiBanner.getClass();
        this.a = new WeakReference<>(inMobiBanner);
    }

    public final void a(@NotNull WeakReference<InMobiBanner> weakReference) {
        weakReference.getClass();
        this.a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3330c2 mPubListener;
        map.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        AbstractC3330c2 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            ((C3356d2) mPubListener).a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        AbstractC3330c2 mPubListener;
        adMetaInfo.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((C3356d2) mPubListener).a.onAdDisplayed(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3330c2 mPubListener;
        inMobiAdRequestStatus.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        inMobiAdRequestStatus.getClass();
        ((C3356d2) mPubListener).a.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AbstractC3330c2 mPubListener;
        adMetaInfo.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable Fk fk) {
        InMobiBanner inMobiBanner = this.a.get();
        AbstractC3330c2 mPubListener = inMobiBanner != null ? inMobiBanner.getMPubListener() : null;
        if (mPubListener == null) {
            if (fk != null) {
                fk.b();
            }
        } else {
            inMobiBanner.getClass();
            ((C3356d2) mPubListener).a.onAdImpression(inMobiBanner);
            if (fk != null) {
                fk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        AbstractC3330c2 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, inMobiAdRequestStatus);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        C3485i2 mAdManager;
        adMetaInfo.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            AbstractC3330c2 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, adMetaInfo);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            AbstractC3587m1 f = mAdManager.f();
            if (f != null) {
                f.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC3587m1 f2 = mAdManager.f();
        if (f2 != null) {
            f2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull Z1 z1) {
        z1.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(z1);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            Z1.b.getClass();
            z1.getClass();
            int ordinal = z1.ordinal();
            mAudioListener.onAudioStatusChanged(inMobiBanner, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String str) {
        AbstractC3330c2 mPubListener;
        str.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        AbstractC3330c2 mPubListener;
        bArr.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((C3356d2) mPubListener).a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3330c2 mPubListener;
        inMobiAdRequestStatus.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        inMobiAdRequestStatus.getClass();
        ((C3356d2) mPubListener).a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3330c2 mPubListener;
        map.getClass();
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        map.getClass();
        ((C3356d2) mPubListener).a.onRewardsUnlocked(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3330c2 mPubListener;
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((C3356d2) mPubListener).a.onUserLeftApplication(inMobiBanner);
    }

    @NotNull
    public final WeakReference<InMobiBanner> a() {
        return this.a;
    }
}
