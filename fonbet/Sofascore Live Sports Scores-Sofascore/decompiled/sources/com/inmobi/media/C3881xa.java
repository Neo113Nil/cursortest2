package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.ironsource.C4435zd;
import defpackage.a70;
import defpackage.p0n;
import defpackage.q0n;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3881xa extends AbstractC3349cl {
    public static final /* synthetic */ int j = 0;
    public C3829va h;
    public boolean i;

    public final void a(C3293ah c3293ah, Context context, boolean z, String str) {
        C3829va c3829va;
        GestureDetectorOnGestureListenerC3889xi j2;
        C3829va c3829va2;
        c3293ah.getClass();
        context.getClass();
        str.getClass();
        if (this.h == null) {
            C3793u0 c3793u0 = new C3793u0("int");
            c3793u0.b = c3293ah.a;
            c3793u0.d = c3293ah.c;
            c3793u0.c = c3293ah.d;
            c3793u0.e = c3293ah.h;
            c3793u0.k = c3293ah.f;
            this.h = new C3829va(context, c3793u0.a(), this);
        }
        if (z) {
            g();
        }
        String str2 = c3293ah.h;
        if (str2 != null) {
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.a();
            }
            C3906y9 a = AbstractC3294ai.a(str, str2);
            this.f = a;
            if (a != null) {
                a.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null && (c3829va2 = this.h) != null) {
                c3829va2.i = c3906y92;
                C3302b0 c3302b0 = c3829va2.u;
                c3302b0.getClass();
                c3302b0.f = c3906y92;
            }
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                c3906y93.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3829va c3829va3 = this.h;
            c3829va3.getClass();
            AbstractC3294ai.a(c3829va3, this.f);
        }
        C3829va c3829va4 = this.h;
        if (c3829va4 != null) {
            c3829va4.a(context);
        }
        C3829va c3829va5 = this.h;
        if (c3829va5 != null) {
            c3829va5.a(c3293ah.d);
        }
        C3829va c3829va6 = this.h;
        if (c3829va6 != null) {
            c3829va6.L();
        }
        if (c3293ah.e && (c3829va = this.h) != null && (j2 = c3829va.j()) != null) {
            c3829va.G = true;
            j2.l();
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C3829va c3829va7 = this.h;
            if (c3829va7 != null) {
                c3829va7.A = watermarkData;
                GestureDetectorOnGestureListenerC3889xi r = c3829va7.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                c3906y94.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        C3829va c3829va;
        publisherCallbacks.getClass();
        if (this.c == null) {
            this.c = publisherCallbacks;
        }
        if (Intrinsics.c(this.b, Boolean.FALSE)) {
            C3829va c3829va2 = this.h;
            if (c3829va2 != null) {
                c3829va2.b((short) 2006);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Xb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.i) {
            C3829va c3829va3 = this.h;
            if (c3829va3 != null) {
                c3829va3.b((short) 2004);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.b = Boolean.TRUE;
        C3829va c3829va4 = this.h;
        if (c3829va4 == null || !a("InMobi", String.valueOf(c3829va4.l), publisherCallbacks) || (c3829va = this.h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (c3829va.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.a = (byte) 1;
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                C3829va c3829va5 = this.h;
                c3906y93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3829va5 != null ? c3829va5.l : null));
            }
            C3829va c3829va6 = this.h;
            Xb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3829va6 != null ? c3829va6.l : null));
            C3829va c3829va7 = this.h;
            if (c3829va7 != null) {
                c3829va7.e(this);
            }
            C3829va c3829va8 = this.h;
            if (c3829va8 != null) {
                c3829va8.D();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void c(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.h != null) {
            d(adMetaInfo);
            return;
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b = this.a;
        if (b == 8 || b == 1) {
            b((AbstractC3587m1) null, inMobiAdRequestStatus);
            return;
        }
        if (b == 2) {
            Xb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                c3906y93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b != 5) {
            Xb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                c3906y94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Xb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3906y9 c3906y95 = this.f;
        if (c3906y95 != null) {
            c3906y95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C3829va c3829va = this.h;
        if (c3829va != null) {
            c3829va.b((byte) 4);
        }
        a();
    }

    public final void d(AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("InterstitialUnifiedAdManager", C4435zd.f);
        }
        super.c(adMetaInfo);
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.a = (byte) 2;
        this.d.post(new q0n(this, adMetaInfo, 0));
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final AbstractC3587m1 f() {
        return this.h;
    }

    public final boolean h() {
        byte b = this.a;
        if (b == 1) {
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b == 7) {
            Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b != 5) {
            if (!this.i) {
                return true;
            }
            C3829va c3829va = this.h;
            if (c3829va != null) {
                c3829va.d((short) 2149);
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                c3906y93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C3829va c3829va2 = this.h;
        if (c3829va2 != null) {
            Xb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c3829va2.l);
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                C3829va c3829va3 = this.h;
                c3906y94.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c3829va3 != null ? c3829va3.l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() {
        C3829va c3829va;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "render");
        }
        C3829va c3829va2 = this.h;
        if (c3829va2 == null) {
            a70.r("Please make an ad request first in order to start loading the ad.");
            return;
        }
        if (c3829va2.b == 4 && this.e != null) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.e;
            adMetaInfo.getClass();
            d(adMetaInfo);
            return;
        }
        if (this.i) {
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                c3906y93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3829va c3829va3 = this.h;
            if (c3829va3 != null) {
                c3829va3.c((short) 2128);
                return;
            }
            return;
        }
        C3829va c3829va4 = this.h;
        com.inmobi.media.ads.network.common.model.Ad b = c3829va4 != null ? c3829va4.b(0) : null;
        C3829va c3829va5 = this.h;
        boolean a = a("InMobi", String.valueOf(c3829va5 != null ? c3829va5.l : null));
        if (b == null) {
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                c3906y94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3829va c3829va6 = this.h;
            if (c3829va6 != null) {
                c3829va6.b((short) 2166);
            }
        }
        if (this.e == null) {
            C3906y9 c3906y95 = this.f;
            if (c3906y95 != null) {
                c3906y95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3829va c3829va7 = this.h;
            if (c3829va7 != null) {
                c3829va7.b((short) 2167);
            }
        }
        if (b == null || !a) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3829va = this.h) != null) {
            c3829va.d((byte) 1);
        }
        C3906y9 c3906y96 = this.f;
        if (c3906y96 != null) {
            c3906y96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.a = (byte) 8;
        C3829va c3829va8 = this.h;
        if (c3829va8 != null) {
            c3829va8.Y();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void d() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C3829va c3829va = this.h;
        if (c3829va != null) {
            if (c3829va.b != 6 && c3829va.b != 7) {
                a(true, (short) 2159);
            } else {
                c3829va.f(this);
            }
        }
    }

    public static final void c(C3881xa c3881xa) {
        C3906y9 c3906y9 = c3881xa.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3881xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3906y9 c3906y92 = c3881xa.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
        C3829va c3829va = c3881xa.h;
        if (c3829va != null) {
            c3829va.b((byte) 4);
        }
    }

    public static final void a(C3881xa c3881xa) {
        C3906y9 c3906y9 = c3881xa.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3881xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3881xa c3881xa, AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = c3881xa.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3881xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z, short s) {
        C3829va c3829va;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s != 0 && (c3829va = this.h) != null) {
            c3829va.d(s);
        }
        this.d.post(new p0n(this, 1));
        if (z) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.a = (byte) 6;
            C3829va c3829va2 = this.h;
            if (c3829va2 != null) {
                c3829va2.d();
            }
        }
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            c3906y93.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void b() {
        this.d.post(new p0n(this, 0));
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.a = (byte) 6;
        C3829va c3829va = this.h;
        if (c3829va != null) {
            c3829va.d();
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    public final void a(Activity activity) {
        C3658ok c3658ok;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "show");
        }
        C3829va c3829va = this.h;
        if (c3829va != null && (c3658ok = c3829va.H) != null) {
            c3658ok.b = true;
        }
        if (c3829va != null) {
            c3829va.R();
        }
        if (h()) {
            boolean a = AbstractC3386e7.a();
            C3829va c3829va2 = this.h;
            if (!a) {
                if (c3829va2 != null) {
                    a(true, (short) 2141);
                }
            } else {
                if (c3829va2 == null || !c3829va2.d((byte) 4)) {
                    return;
                }
                this.i = true;
                C3829va c3829va3 = this.h;
                if (c3829va3 != null) {
                    c3829va3.a(this, activity);
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void b(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.e = adMetaInfo;
        if (this.h == null) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC3587m1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(adMetaInfo);
        this.d.post(new q0n(this, adMetaInfo, 1));
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a() {
        this.d.post(new p0n(this, 2));
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.a = (byte) 0;
        this.b = null;
        C3829va c3829va = this.h;
        if (c3829va != null) {
            c3829va.d();
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    public static final void b(C3881xa c3881xa) {
        C3906y9 c3906y9 = c3881xa.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3881xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3829va c3829va = c3881xa.h;
        if (c3829va != null) {
            c3829va.b((byte) 4);
        }
    }

    public static final void b(C3881xa c3881xa, AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = c3881xa.f;
        if (c3906y9 != null) {
            c3906y9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3881xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        super.a(adMetaInfo);
        C3829va c3829va = this.h;
        if (c3829va != null) {
            c3829va.S();
        }
        this.i = false;
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final void a(WatermarkData watermarkData) {
        watermarkData.getClass();
        super.a(watermarkData);
        C3829va c3829va = this.h;
        if (c3829va != null) {
            watermarkData.getClass();
            c3829va.A = watermarkData;
            GestureDetectorOnGestureListenerC3889xi r = c3829va.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
    }
}
