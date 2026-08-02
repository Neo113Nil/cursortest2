package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import defpackage.mwj;
import defpackage.ncj;
import defpackage.sx0;
import defpackage.v8k;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Uc extends PublisherCallbacks {
    public final C3499ih a;
    public final C3677pd b;
    public final WeakReference c;

    public Uc(InMobiNative inMobiNative, C3499ih c3499ih, C3677pd c3677pd) {
        inMobiNative.getClass();
        c3499ih.getClass();
        c3677pd.getClass();
        this.a = c3499ih;
        this.b = c3677pd;
        this.c = new WeakReference(inMobiNative);
    }

    public static final Unit a(Uc uc, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        Nc nc = uc.b.a.d.b;
        nc.getClass();
        Bj bj = nc.c;
        W6 w6 = bj instanceof W6 ? (W6) bj : null;
        if (w6 != null) {
            InterfaceC3880x9 l = w6.l();
            if (l != null) {
                ((C3906y9) l).a("AUM-FetchedState", "Inflate Called");
            }
            C3573ld c3573ld = (C3573ld) w6;
            InterfaceC3880x9 l2 = c3573ld.l();
            if (l2 != null) {
                ((C3906y9) l2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            c3573ld.j.a(new Pd(c3573ld.f, c3573ld.g, c3573ld.h, c3573ld.i, c3573ld.j), c3573ld);
        }
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return Unit.a;
    }

    public static final Unit b(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit c(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit d(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit e(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit f(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit g(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit h(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return Unit.a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map map) {
        map.getClass();
        a(new v8k(this, 7));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new v8k(this, 6));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        a(new v8k(this, 2));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        onAdLoadFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        a(new mwj(11, this, adMetaInfo));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(Fk fk) {
        a(new mwj(12, this, fk));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        a(new mwj(13, this, inMobiAdRequestStatus));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(boolean z) {
        a(new sx0(z, this, 8));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new v8k(this, 1));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new v8k(this, 0));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new v8k(this, 3));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new v8k(this, 4));
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new v8k(this, 5));
    }

    public final void a(Function1 function1) {
        InMobiNative inMobiNative = (InMobiNative) this.c.get();
        if (inMobiNative == null) {
            Xb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    public final void a(C3678pe c3678pe, AdMetaInfo adMetaInfo) {
        c3678pe.getClass();
        adMetaInfo.getClass();
        a(new ncj(6, this, c3678pe, adMetaInfo));
    }

    public static final Unit a(Uc uc, C3678pe c3678pe, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        C3677pd c3677pd = uc.b;
        c3677pd.getClass();
        c3678pe.getClass();
        c3677pd.a.e = c3678pe;
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return Unit.a;
    }

    public static final Unit a(Uc uc, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return Unit.a;
    }

    public static final Unit a(Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = uc.a.c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return Unit.a;
    }

    public static final Unit a(boolean z, Uc uc, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z);
        }
        return Unit.a;
    }

    public static final Unit a(Uc uc, Fk fk, InMobiNative inMobiNative) {
        inMobiNative.getClass();
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (fk != null) {
            fk.c();
        }
        return Unit.a;
    }
}
