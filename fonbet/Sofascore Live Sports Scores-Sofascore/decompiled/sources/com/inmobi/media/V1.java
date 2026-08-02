package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class V1 extends PublisherCallbacks {

    @NotNull
    private WeakReference<InMobiAudio> a;

    public V1(InMobiAudio inMobiAudio) {
        inMobiAudio.getClass();
        this.a = new WeakReference<>(inMobiAudio);
    }

    public final void a(@NotNull WeakReference<InMobiAudio> weakReference) {
        weakReference.getClass();
        this.a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener;
        map.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdClicked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener;
        adMetaInfo.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener;
        adMetaInfo.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdFetchSuccessful(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable Fk fk) {
        InMobiAudio inMobiAudio = this.a.get();
        AudioAdEventListener mPubListener = inMobiAudio != null ? inMobiAudio.getMPubListener() : null;
        if (mPubListener == null) {
            if (fk != null) {
                fk.b();
            }
        } else {
            mPubListener.onAdImpression(inMobiAudio);
            if (fk != null) {
                fk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener;
        inMobiAdRequestStatus.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadFailed(inMobiAudio, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener;
        adMetaInfo.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadSucceeded(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull Z1 z1) {
        AudioAdEventListener mPubListener;
        z1.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        Z1.b.getClass();
        z1.getClass();
        int ordinal = z1.ordinal();
        mPubListener.onAudioStatusChanged(inMobiAudio, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        AudioAdEventListener mPubListener;
        bArr.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener;
        inMobiAdRequestStatus.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener;
        map.getClass();
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRewardsUnlocked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onUserLeftApplication(inMobiAudio);
    }

    @NotNull
    public final WeakReference<InMobiAudio> a() {
        return this.a;
    }
}
