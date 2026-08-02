package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.joa;
import defpackage.s5l;
import defpackage.t4f;
import defpackage.tql;
import defpackage.wv8;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3278a2 extends AbstractC3349cl {
    public R1 h;
    public R1 i;
    public R1 j;
    public R1 k;

    public C3278a2(InMobiAudio.a aVar) {
        aVar.getClass();
        this.c = aVar;
    }

    public final boolean a(long j) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "checkForRefreshRate " + this);
        }
        if (this.k == null) {
            return false;
        }
        int minRefreshInterval = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = AbstractC3304b2.a;
        str2.getClass();
        R1 r1 = this.k;
        Xb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (r1 != null ? r1.l : null) + ")");
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            str2.getClass();
            R1 r12 = this.k;
            c3906y92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (r12 != null ? r12.l : null) + ")");
        }
        return false;
    }

    public final void b(RelativeLayout relativeLayout) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "showAudioAd");
        }
        R1 r1 = this.j;
        if (r1 != null && r1.b == 7) {
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            Xb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                str2.getClass();
                c3906y92.b(str2, "ad is active");
            }
            R1 r12 = this.k;
            if (r12 != null) {
                r12.f((short) 15);
                return;
            }
            return;
        }
        R1 r13 = this.k;
        if (r13 != null) {
            C3906y9 c3906y93 = r13.i;
            if (c3906y93 != null) {
                c3906y93.c("m1", "canProceedToShow");
            }
            if (r13.A()) {
                Xb.a((byte) 1, "m1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3906y9 c3906y94 = r13.i;
                if (c3906y94 != null) {
                    c3906y94.b("m1", "ad is expired");
                }
                r13.d0();
                return;
            }
            byte b = r13.b;
            if (b == 1 || b == 2) {
                Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3906y9 c3906y95 = r13.i;
                if (c3906y95 != null) {
                    c3906y95.b("m1", "ad is not ready");
                }
                C3906y9 c3906y96 = r13.i;
                if (c3906y96 != null) {
                    c3906y96.a("m1", "callback - onShowFailure");
                }
                r13.f((short) 2152);
                return;
            }
            if (b == 3) {
                Xb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                r13.f((short) 0);
                C3906y9 c3906y97 = r13.i;
                if (c3906y97 != null) {
                    c3906y97.a("m1", "callback - onShowFailure");
                }
                C3906y9 c3906y98 = r13.i;
                if (c3906y98 != null) {
                    c3906y98.b("m1", "ad is failed");
                    return;
                }
                return;
            }
            if (b == 8) {
                Xb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                r13.f((short) 0);
                C3906y9 c3906y99 = r13.i;
                if (c3906y99 != null) {
                    c3906y99.a("m1", "callback - onShowFailure");
                }
                C3906y9 c3906y910 = r13.i;
                if (c3906y910 != null) {
                    c3906y910.b("m1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b != 0) {
                o();
                a(relativeLayout);
                return;
            }
            Xb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
            r13.f((short) 0);
            C3906y9 c3906y911 = r13.i;
            if (c3906y911 != null) {
                c3906y911.a("m1", "callback - onShowFailure");
            }
            C3906y9 c3906y912 = r13.i;
            if (c3906y912 != null) {
                c3906y912.b("m1", "show called before load");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void c(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.a = (byte) 0;
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            c3906y92.d(str2, "AdManager state - CREATED");
        }
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            String str3 = AbstractC3304b2.a;
            str3.getClass();
            c3906y93.a(str3, "Ad load successful, providing callback");
        }
        this.d.post(new tql(this, adMetaInfo, 0));
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final AbstractC3587m1 f() {
        return m() ? this.j : this.k;
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final void g() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "submitAdLoadCalled " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.P();
        }
    }

    public final void h() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "clear " + this);
        }
        p();
        R1 r1 = this.h;
        if (r1 != null) {
            r1.d();
        }
        this.h = null;
        R1 r12 = this.i;
        if (r12 != null) {
            r12.d();
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.b = null;
    }

    public final void i() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "pause " + this);
        }
        R1 r1 = this.j;
        if (r1 != null) {
            r1.X();
        }
    }

    public final void j() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "registerLifeCycleCallbacks " + this);
        }
        R1 r1 = this.h;
        if (r1 != null) {
            r1.Z();
        }
        R1 r12 = this.i;
        if (r12 != null) {
            r12.Z();
        }
    }

    public final void k() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "loadIntoView " + this);
        }
        R1 r1 = this.k;
        if (r1 == null) {
            a70.r("Please make an ad request first in order to start loading the ad.");
            return;
        }
        if (a("InMobi", String.valueOf(r1.l.a))) {
            this.a = (byte) 8;
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str2 = AbstractC3304b2.a;
                str2.getClass();
                c3906y92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            r1.a0();
        }
    }

    public final void l() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "resume " + this);
        }
        R1 r1 = this.j;
        if (r1 != null) {
            r1.Y();
        }
    }

    public final boolean m() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "shouldUseForegroundUnit " + this);
        }
        R1 r1 = this.j;
        Byte valueOf = r1 != null ? Byte.valueOf(r1.b) : null;
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            c3906y92.d(str2, "State - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "submitAdShowCalled " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.R();
        }
    }

    public final void o() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "swapAdUnits " + this);
        }
        R1 r1 = this.j;
        boolean c = Intrinsics.c(r1, this.h);
        R1 r12 = this.i;
        if (c) {
            this.j = r12;
            this.k = this.h;
        } else if (Intrinsics.c(r1, r12) || r1 == null) {
            this.j = this.h;
            this.k = this.i;
        }
    }

    public final void p() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        R1 r1 = this.h;
        if (r1 != null) {
            r1.c0();
        }
        R1 r12 = this.i;
        if (r12 != null) {
            r12.c0();
        }
    }

    public static final void a(C3278a2 c3278a2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3278a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC3889xi j;
        C3845w0 c3845w0;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "displayAd " + this);
        }
        R1 r1 = this.j;
        if (r1 == null || (j = r1.j()) == null) {
            return;
        }
        AbstractC3429fo viewableAd = j.getViewableAd();
        R1 r12 = this.j;
        if (r12 != null && (c3845w0 = r12.l) != null && c3845w0.l) {
            j.l();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a((Map) null);
        R1 r13 = this.k;
        if (r13 != null) {
            r13.X();
        }
        if (viewGroup == null) {
            relativeLayout.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        R1 r14 = this.k;
        if (r14 != null) {
            r14.d();
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "onAdDismissed " + this);
        }
        this.a = (byte) 0;
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            c3906y92.d(str2, "AdManager state - CREATED");
        }
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            c3906y93.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "onAdDisplayed");
        }
        super.a(adMetaInfo);
        AbstractC3587m1 f = f();
        if (f != null) {
            f.S();
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a(AbstractC3587m1 abstractC3587m1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        inMobiAdRequestStatus.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.b(str, com.ironsource.Wf.b);
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    public static final void a(C3278a2 c3278a2) {
        C3906y9 c3906y9 = c3278a2.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3278a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3906y9 c3906y92 = c3278a2.f;
        if (c3906y92 != null) {
            c3906y92.a();
        }
    }

    public final void b(String str) {
        str.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            c3906y9.a(str2, "load 1 " + this);
        }
        R1 r1 = this.k;
        if (r1 != null && a("InMobi", String.valueOf(r1.l.a), this.c) && r1.d((byte) 1)) {
            this.a = (byte) 1;
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str3 = AbstractC3304b2.a;
                str3.getClass();
                c3906y92.d(str3, "AdManager state - LOADING");
            }
            this.e = null;
            r1.d(str);
            r1.b(false);
        }
    }

    public final void a(InMobiAudio inMobiAudio) {
        inMobiAudio.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(inMobiAudio);
            } else {
                this.d.post(new s5l(14, this, inMobiAudio));
            }
        } catch (Exception e) {
            R1 r1 = this.k;
            if (r1 != null) {
                r1.f((short) 26);
            }
            String str2 = AbstractC3304b2.a;
            str2.getClass();
            Xb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                wv8.x("Show failed with unexpected error: ", e.getMessage(), c3906y92, str2);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final void a(short s) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.b(s);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void b(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.c(str, "onAdFetchSuccess " + this);
        }
        R1 r1 = this.k;
        com.inmobi.media.ads.network.common.model.Ad b = r1 != null ? r1.b(0) : null;
        C3906y9 c3906y92 = this.f;
        if (b == null) {
            if (c3906y92 != null) {
                String str2 = AbstractC3304b2.a;
                str2.getClass();
                c3906y92.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3587m1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        if (c3906y92 != null) {
            String str3 = AbstractC3304b2.a;
            str3.getClass();
            c3906y92.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(adMetaInfo);
        this.d.post(new tql(this, adMetaInfo, 1));
    }

    public final void a(Context context, C3293ah c3293ah, String str) {
        String str2;
        context.getClass();
        c3293ah.getClass();
        str.getClass();
        String str3 = AbstractC3304b2.a;
        str3.getClass();
        C3793u0 c3793u0 = new C3793u0("audio");
        context.getClass();
        if (context instanceof Activity) {
            str2 = "activity";
        } else {
            str2 = "others";
        }
        c3793u0.j = str2;
        c3793u0.b = c3293ah.a;
        c3793u0.d = c3293ah.c;
        c3793u0.c = c3293ah.d;
        str.getClass();
        c3793u0.g = str;
        c3793u0.i = c3293ah.e;
        c3793u0.e = c3293ah.h;
        c3793u0.k = c3293ah.f;
        C3845w0 a = c3793u0.a();
        R1 r1 = this.h;
        if (r1 != null && this.i != null) {
            r1.a(context, a, this);
            R1 r12 = this.i;
            if (r12 != null) {
                r12.a(context, a, this);
            }
        } else {
            this.h = new R1(context, a, this);
            this.i = new R1(context, a, this);
            this.k = this.h;
        }
        String str4 = c3293ah.h;
        if (str4 != null) {
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.a();
            }
            C3906y9 a2 = AbstractC3294ai.a("audio", str4);
            this.f = a2;
            if (a2 != null) {
                str3.getClass();
                a2.a(str3, "adding audioAdUnit1 to reference tracker");
            }
            R1 r13 = this.h;
            r13.getClass();
            AbstractC3294ai.a(r13, this.f);
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                str3.getClass();
                c3906y92.a(str3, "adding audioAdUnit2 to reference tracker");
            }
            R1 r14 = this.i;
            r14.getClass();
            AbstractC3294ai.a(r14, this.f);
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void b() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.a(str, "onAdShowFailed " + this);
        }
        this.d.post(new t4f(this, 27));
    }

    public static final void b(C3278a2 c3278a2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3278a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    public final void b(short s) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = AbstractC3304b2.a;
            str.getClass();
            c3906y9.b(str, "submitAdLoadFailed " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.c((short) 15);
        }
    }

    public static final void a(C3278a2 c3278a2, RelativeLayout relativeLayout) {
        c3278a2.b(relativeLayout);
    }
}
