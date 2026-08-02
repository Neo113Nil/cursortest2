package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import defpackage.a70;
import defpackage.k2m;
import defpackage.l2m;
import defpackage.s5l;
import defpackage.wv8;
import defpackage.zol;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3349cl extends AbstractC3458h1 {
    public byte a;
    public Boolean b;
    public PublisherCallbacks c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public AdMetaInfo e;
    public C3906y9 f;
    public WatermarkData g;

    public final boolean a(String str, String str2) {
        str.getClass();
        str2.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "canRender " + this);
        }
        byte b = this.a;
        if (b == 1) {
            Xb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.b("cl", "adload in progress");
            }
            AbstractC3587m1 f = f();
            if (f != null) {
                f.c((short) 2129);
            }
            return false;
        }
        if (b == 8) {
            Xb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                c3906y93.b("cl", "ad loading into view is in progress");
            }
            AbstractC3587m1 f2 = f();
            if (f2 != null) {
                f2.c((short) 2164);
            }
            return false;
        }
        if (b == 5) {
            Xb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                c3906y94.b("cl", "ad active before renderAd");
            }
            AbstractC3587m1 f3 = f();
            if (f3 != null) {
                f3.c((short) 2130);
            }
            AbstractC3587m1 f4 = f();
            if (f4 != null) {
                f4.K();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            return false;
        }
        if (b == 7) {
            return true;
        }
        C3906y9 c3906y95 = this.f;
        if (c3906y95 != null) {
            c3906y95.b("cl", "ad in illegal state");
        }
        AbstractC3587m1 f5 = f();
        if (f5 != null) {
            f5.c((short) 2165);
        }
        AbstractC3587m1 f6 = f();
        if (f6 != null) {
            f6.K();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        a70.r("Please make an ad request first in order to start loading the ad.");
        return false;
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public void b(AdMetaInfo adMetaInfo) {
        AbstractC3587m1 f;
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdFetchSuccess " + this);
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.d("cl", "AdManager state - FETCHED");
        }
        this.a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (f = f()) == null) {
            return;
        }
        f.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void c() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdWillShow " + this);
        }
        byte b = this.a;
        if (b == 4 || b == 5) {
            return;
        }
        this.d.post(new k2m(this, 0));
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.d("cl", "AdManager state - WILL_DISPLAY");
        }
        this.a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void e() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onUserLeftApplication " + this);
        }
        this.d.post(new k2m(this, 1));
    }

    public abstract AbstractC3587m1 f();

    public void g() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "submitAdLoadCalled " + this);
        }
        AbstractC3587m1 f = f();
        if (f != null) {
            f.P();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public void c(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdLoadSucceeded " + this);
        }
        this.e = adMetaInfo;
        AbstractC3587m1 f = f();
        if (f != null) {
            f.b((byte) 1);
        }
    }

    public static final void c(AbstractC3349cl abstractC3349cl) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public final void b(AbstractC3587m1 abstractC3587m1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onLoadFailure " + this);
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.d("cl", "AdManager state - LOAD_FAILED");
        }
        this.a = (byte) 3;
        this.d.post(new zol(3, abstractC3587m1, this, inMobiAdRequestStatus));
    }

    public static final void b(AbstractC3349cl abstractC3349cl) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void b(HashMap hashMap) {
        hashMap.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdRewardActionCompleted " + this);
        }
        this.d.post(new l2m(this, hashMap, 0));
    }

    public static final void b(AbstractC3349cl abstractC3349cl, Map map) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdFetchFailed " + this);
        }
        this.a = (byte) 3;
        this.d.post(new s5l(24, this, inMobiAdRequestStatus));
    }

    public static final void a(AbstractC3349cl abstractC3349cl, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3906y9 c3906y92 = abstractC3349cl.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public void a(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdDisplayed " + this);
        }
        if (this.a != 5) {
            this.e = adMetaInfo;
            this.d.post(new s5l(27, this, adMetaInfo));
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.d("cl", "AdManager state - DISPLAYED");
            }
            this.a = (byte) 5;
        }
    }

    public static final void a(AbstractC3349cl abstractC3349cl, AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public void a(AbstractC3587m1 abstractC3587m1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdLoadFailed " + this);
        }
        b(abstractC3587m1, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdInteraction " + this);
        }
        this.d.post(new l2m(this, hashMap, 1));
    }

    public static final void a(AbstractC3349cl abstractC3349cl, Map map) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks) {
        publisherCallbacks.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "getSignals " + this);
        }
        if (f() != null) {
            this.c = publisherCallbacks;
            publisherCallbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C3829va c3829va;
        publisherCallbacks.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "load " + this);
        }
        if (Intrinsics.c(this.b, Boolean.TRUE)) {
            Xb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.a("cl", "Cannot call load(byte[]) API after load() API is called");
            }
            C3881xa c3881xa = (C3881xa) this;
            b(c3881xa.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3829va c3829va2 = c3881xa.h;
            if (c3829va2 != null) {
                c3829va2.b((short) 2140);
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null && (c3829va = ((C3881xa) this).h) != null) {
            c3829va.i = c3906y93;
            C3302b0 c3302b0 = c3829va.u;
            c3302b0.getClass();
            c3302b0.f = c3906y93;
        }
        C3881xa c3881xa2 = (C3881xa) this;
        C3829va c3829va3 = c3881xa2.h;
        if (c3829va3 == null || !c3829va3.d((byte) 1)) {
            return;
        }
        C3906y9 c3906y94 = this.f;
        if (c3906y94 != null) {
            c3906y94.a("cl", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = publisherCallbacks;
        C3829va c3829va4 = c3881xa2.h;
        if (c3829va4 != null) {
            c3829va4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        watermarkData.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.g = watermarkData;
    }

    public final boolean a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        str.getClass();
        str2.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c(str, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            Xb.a((byte) 1, "cl", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                c3906y92.b(str, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3587m1 f = f();
            if (f != null) {
                f.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b = this.a;
        if (b == 8) {
            Xb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                wv8.x("An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ", str2, c3906y93, str);
            }
            AbstractC3587m1 f2 = f();
            if (f2 != null) {
                f2.b((short) 2002);
            }
            return false;
        }
        if (b == 1) {
            Xb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                wv8.x("An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ", str2, c3906y94, str);
            }
            AbstractC3587m1 f3 = f();
            if (f3 != null) {
                f3.b((short) 2001);
            }
            return false;
        }
        if (b != 5) {
            return true;
        }
        Xb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        C3906y9 c3906y95 = this.f;
        if (c3906y95 != null) {
            wv8.x("An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ", str2, c3906y95, str);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3587m1 f4 = f();
        if (f4 != null) {
            f4.c((short) 2003);
        }
        return false;
    }

    public static final void a(AbstractC3587m1 abstractC3587m1, AbstractC3349cl abstractC3349cl, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3587m1 != null) {
            abstractC3587m1.b((byte) 1);
        }
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3906y9 c3906y92 = abstractC3349cl.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public void a() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdDismissed " + this);
        }
        this.d.post(new k2m(this, 2));
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    public static final void a(AbstractC3349cl abstractC3349cl) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3906y9 c3906y92 = abstractC3349cl.f;
        if (c3906y92 != null) {
            c3906y92.b("cl", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(Fk fk) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "onAdImpression " + this);
        }
        this.d.post(new s5l(23, this, fk));
    }

    public static final void a(AbstractC3349cl abstractC3349cl, Fk fk) {
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (publisherCallbacks == null) {
            if (c3906y9 != null) {
                c3906y9.b("cl", "callback is null");
            }
            if (fk != null) {
                fk.b();
                return;
            }
            return;
        }
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks2 = abstractC3349cl.c;
        if (publisherCallbacks2 != null) {
            publisherCallbacks2.onAdImpression(fk);
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(Z1 z1) {
        z1.getClass();
        this.d.post(new s5l(26, this, z1));
    }

    public static final void a(AbstractC3349cl abstractC3349cl, Z1 z1) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onAudioStatusChanged - " + z1.a);
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(z1);
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(String str) {
        str.getClass();
        this.d.post(new s5l(25, this, str));
    }

    public static final void a(AbstractC3349cl abstractC3349cl, String str) {
        C3906y9 c3906y9 = abstractC3349cl.f;
        if (c3906y9 != null) {
            c3906y9.a("cl", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = abstractC3349cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("cl", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3587m1 f = f();
        if (f != null) {
            f.b(s);
        }
    }
}
