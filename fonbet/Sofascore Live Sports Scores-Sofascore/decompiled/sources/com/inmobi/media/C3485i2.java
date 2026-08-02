package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.pn0;
import defpackage.whm;
import defpackage.wv8;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3485i2 extends AbstractC3349cl {
    public final String h = "InMobi";
    public final String i = "i2";
    public final String j = "x";
    public C3381e2 k;
    public C3381e2 l;
    public C3381e2 m;
    public C3381e2 n;

    public final void a(Context context, C3293ah c3293ah, String str) {
        context.getClass();
        c3293ah.getClass();
        str.getClass();
        this.i.getClass();
        C3793u0 c3793u0 = new C3793u0("banner");
        context.getClass();
        c3793u0.j = context instanceof Activity ? "activity" : "others";
        c3793u0.b = c3293ah.a;
        c3793u0.d = c3293ah.c;
        c3793u0.c = c3293ah.d;
        str.getClass();
        c3793u0.g = str;
        String str2 = c3293ah.b;
        if (str2 == null) {
            str2 = "";
        }
        c3793u0.h = str2;
        c3793u0.i = c3293ah.e;
        c3793u0.e = c3293ah.h;
        c3793u0.k = c3293ah.f;
        C3845w0 a = c3793u0.a();
        String str3 = c3293ah.h;
        if (str3 != null) {
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.a();
            }
            this.f = AbstractC3294ai.a("banner", str3);
        }
        C3381e2 c3381e2 = this.k;
        if (c3381e2 == null || this.l == null) {
            this.k = new C3381e2(context, a, this);
            C3381e2 c3381e22 = new C3381e2(context, a, this);
            this.l = c3381e22;
            this.n = this.k;
            this.m = c3381e22;
        } else {
            c3381e2.a(context, a, this);
            C3381e2 c3381e23 = this.l;
            if (c3381e23 != null) {
                c3381e23.a(context, a, this);
            }
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            C3381e2 c3381e24 = this.k;
            if (c3381e24 != null) {
                c3381e24.i = c3906y92;
                C3302b0 c3302b0 = c3381e24.u;
                c3302b0.getClass();
                c3302b0.f = c3906y92;
            }
            C3381e2 c3381e25 = this.l;
            if (c3381e25 != null) {
                c3381e25.i = c3906y92;
                C3302b0 c3302b02 = c3381e25.u;
                c3302b02.getClass();
                c3302b02.f = c3906y92;
            }
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                String str4 = this.i;
                str4.getClass();
                c3906y93.a(str4, "adding mBannerAdUnit1 to reference tracker");
            }
            Nb nb = AbstractC3294ai.a;
            C3381e2 c3381e26 = this.k;
            c3381e26.getClass();
            AbstractC3294ai.a(c3381e26, this.f);
            C3906y9 c3906y94 = this.f;
            if (c3906y94 != null) {
                String str5 = this.i;
                str5.getClass();
                c3906y94.a(str5, "adding mBannerAdUnit2 to reference tracker");
            }
            C3381e2 c3381e27 = this.l;
            c3381e27.getClass();
            AbstractC3294ai.a(c3381e27, this.f);
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C3381e2 c3381e28 = this.k;
            if (c3381e28 != null) {
                c3381e28.A = watermarkData;
                GestureDetectorOnGestureListenerC3889xi r = c3381e28.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            C3381e2 c3381e29 = this.l;
            if (c3381e29 != null) {
                c3381e29.A = watermarkData;
                GestureDetectorOnGestureListenerC3889xi r2 = c3381e29.r();
                if (r2 != null) {
                    r2.setWatermark(watermarkData);
                }
            }
        }
    }

    public final void b(InMobiBanner inMobiBanner) {
        C3845w0 c3845w0;
        inMobiBanner.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "displayAd " + this);
        }
        C3381e2 c3381e2 = this.m;
        GestureDetectorOnGestureListenerC3889xi j = c3381e2 != null ? c3381e2.j() : null;
        if (j == null) {
            j = null;
        }
        if (j == null) {
            return;
        }
        AbstractC3429fo viewableAd = j.getViewableAd();
        C3381e2 c3381e22 = this.m;
        if (c3381e22 != null && (c3845w0 = c3381e22.l) != null && c3845w0.l) {
            j.l();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        C3381e2 c3381e23 = this.n;
        if (c3381e23 != null) {
            c3381e23.X();
        }
        C3381e2 c3381e24 = this.m;
        if (c3381e24 != null && c3381e24.b == 8) {
            View view = new View(inMobiBanner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            if (viewGroup == null) {
                inMobiBanner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            inMobiBanner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        C3381e2 c3381e25 = this.n;
        if (c3381e25 != null) {
            c3381e25.d();
        }
    }

    public final void c(InMobiBanner inMobiBanner) {
        C3845w0 c3845w0;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "displayInternal " + this);
        }
        C3381e2 c3381e2 = this.m;
        if (c3381e2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi j = c3381e2.j();
        if (j == null) {
            j = null;
        }
        if (j == null) {
            return;
        }
        AbstractC3429fo viewableAd = j.getViewableAd();
        C3381e2 c3381e22 = this.m;
        if (c3381e22 != null && (c3845w0 = c3381e22.l) != null && c3845w0.l) {
            j.l();
        }
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final AbstractC3587m1 f() {
        return q() ? this.m : this.n;
    }

    public final void h() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C3381e2 c3381e2;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "canScheduleRefresh " + this);
        }
        C3381e2 c3381e22 = this.n;
        if (c3381e22 == null) {
            return false;
        }
        byte b = c3381e22.b;
        if (b != 4 && b != 1 && b != 2 && ((c3381e2 = this.m) == null || c3381e2.b != 7)) {
            return true;
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y92.a(str2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "clear " + this);
        }
        t();
        C3381e2 c3381e2 = this.k;
        if (c3381e2 != null) {
            c3381e2.d();
        }
        this.k = null;
        C3381e2 c3381e22 = this.l;
        if (c3381e22 != null) {
            c3381e22.d();
        }
        this.l = null;
        this.f = null;
        this.m = null;
        this.n = null;
        this.b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "defaultRefreshInterval " + this);
        }
        AbstractC3587m1 f = f();
        if (f == null || (adConfig = f.c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        this.i.getClass();
        Intrinsics.c(this.m, this.k);
        this.i.getClass();
        Intrinsics.c(this.n, this.k);
        this.i.getClass();
        Intrinsics.c(this.m, this.l);
        this.i.getClass();
        Intrinsics.c(this.n, this.l);
        this.i.getClass();
        Objects.toString(this.k);
        this.i.getClass();
        Objects.toString(this.l);
        C3381e2 c3381e2 = this.m;
        return c3381e2 != null && c3381e2.b == 7;
    }

    public final void m() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "pause " + this);
        }
        C3381e2 c3381e2 = this.m;
        if (c3381e2 != null) {
            c3381e2.X();
        }
    }

    public final void n() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "registerLifeCycleCallbacks " + this);
        }
        C3381e2 c3381e2 = this.k;
        if (c3381e2 != null) {
            c3381e2.Z();
        }
        C3381e2 c3381e22 = this.l;
        if (c3381e22 != null) {
            c3381e22.Z();
        }
    }

    public final void o() {
        C3381e2 c3381e2;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "render " + this);
        }
        C3381e2 c3381e22 = this.n;
        if (c3381e22 == null) {
            a70.r("Please make an ad request first in order to start loading the ad.");
            return;
        }
        if (a(this.h, String.valueOf(c3381e22.l.a))) {
            PublisherCallbacks publisherCallbacks = this.c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3381e2 = this.n) != null) {
                c3381e2.d((byte) 1);
            }
            this.a = (byte) 8;
            c3381e22.a0();
        }
    }

    public final void p() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "resume " + this);
        }
        C3381e2 c3381e2 = this.m;
        if (c3381e2 != null) {
            c3381e2.Y();
        }
    }

    public final boolean q() {
        C3381e2 c3381e2 = this.m;
        Byte valueOf = c3381e2 != null ? Byte.valueOf(c3381e2.b) : null;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "shouldUseForegroundUnit " + this + " state - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "submitAdShowFail " + this);
        }
        AbstractC3587m1 f = f();
        if (f != null) {
            f.d((short) 2239);
        }
    }

    public final void s() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "swapAdUnits " + this);
        }
        C3381e2 c3381e2 = this.m;
        C3381e2 c3381e22 = this.k;
        if (c3381e2 == null) {
            this.m = c3381e22;
            this.n = this.l;
            return;
        }
        boolean equals = c3381e2.equals(c3381e22);
        C3381e2 c3381e23 = this.l;
        if (equals) {
            this.m = c3381e23;
            this.n = this.k;
        } else if (c3381e2.equals(c3381e23)) {
            this.m = this.k;
            this.n = this.l;
        }
    }

    public final void t() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        C3381e2 c3381e2 = this.k;
        if (c3381e2 != null) {
            c3381e2.c0();
        }
        C3381e2 c3381e22 = this.l;
        if (c3381e22 != null) {
            c3381e22.c0();
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void c(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.a = (byte) 0;
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y92.a(str2, "Ad load successful, providing callback");
        }
        this.d.post(new whm(this, adMetaInfo, 0));
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void b(AdMetaInfo adMetaInfo) {
        adMetaInfo.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "onAdFetchSuccess " + this);
        }
        this.e = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C3381e2 c3381e2 = this.n;
        com.inmobi.media.ads.network.common.model.Ad b = c3381e2 != null ? c3381e2.b(0) : null;
        C3906y9 c3906y92 = this.f;
        if (b == null) {
            if (c3906y92 != null) {
                String str2 = this.i;
                str2.getClass();
                c3906y92.b(str2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3587m1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        if (c3906y92 != null) {
            String str3 = this.i;
            str3.getClass();
            c3906y92.a(str3, "Ad fetch successful, calling loadAd()");
        }
        super.b(adMetaInfo);
        this.d.post(new whm(this, adMetaInfo, 1));
    }

    public static final void b(C3485i2 c3485i2, AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = c3485i2.f;
        if (c3906y9 != null) {
            String str = c3485i2.i;
            str.getClass();
            c3906y9.a(str, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3485i2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c3485i2.b((short) 2184);
        }
    }

    public final void b(short s) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "submitAdLoadFailed " + this);
        }
        AbstractC3587m1 f = f();
        if (f != null) {
            f.c(s);
        }
    }

    public final boolean a(long j) {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "checkForRefreshRate " + this);
        }
        C3381e2 c3381e2 = this.n;
        if (c3381e2 == null) {
            return false;
        }
        AdConfig adConfig = c3381e2.c;
        adConfig.getClass();
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y92.b(str2, "Early refresh request");
        }
        b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String str3 = this.i;
        str3.getClass();
        C3381e2 c3381e22 = this.n;
        Xb.a((byte) 1, str3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3381e22 != null ? c3381e22.l : null) + ")");
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            String str4 = this.i;
            str4.getClass();
            C3381e2 c3381e23 = this.n;
            c3906y93.b(str4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3381e23 != null ? c3381e23.l : null) + ")");
        }
        return false;
    }

    public final int a(int i, int i2) {
        AdConfig adConfig;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "getRefreshInterval " + this);
        }
        C3381e2 c3381e2 = this.n;
        return (c3381e2 == null || (adConfig = c3381e2.c) == null) ? i2 : i < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i;
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        C3381e2 c3381e2;
        publisherCallbacks.getClass();
        str.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y9.c(str2, "load 1 " + this);
        }
        if (Intrinsics.c(this.b, Boolean.FALSE)) {
            b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3381e2 c3381e22 = this.n;
            if (c3381e22 != null) {
                c3381e22.b((short) 2006);
            }
            Xb.a((byte) 1, this.h, "Cannot call load() API after calling load(byte[])");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str3 = this.i;
                str3.getClass();
                c3906y92.b(str3, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.b = Boolean.TRUE;
        if (this.c == null) {
            this.c = publisherCallbacks;
        }
        C3381e2 c3381e23 = this.n;
        if (c3381e23 == null || !a(this.h, String.valueOf(c3381e23.l), publisherCallbacks) || (c3381e2 = this.n) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (c3381e2.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3906y9 c3906y93 = this.f;
            if (c3906y93 != null) {
                String str4 = this.i;
                str4.getClass();
                c3906y93.d(str4, "AdManager state - LOADING");
            }
            this.a = (byte) 1;
            this.e = null;
            C3381e2 c3381e24 = this.n;
            c3381e24.getClass();
            c3381e24.d(str);
            C3381e2 c3381e25 = this.n;
            c3381e25.getClass();
            c3381e25.b(z);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C3381e2 c3381e2;
        publisherCallbacks.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "load 2 " + this);
        }
        if (Intrinsics.c(this.b, Boolean.TRUE)) {
            Xb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str2 = this.i;
                str2.getClass();
                c3906y92.b(str2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        this.c = publisherCallbacks;
        if (this.n != null) {
            C3381e2 c3381e22 = this.m;
            if ((c3381e22 == null || !c3381e22.C()) && (c3381e2 = this.n) != null && c3381e2.d((byte) 1)) {
                C3906y9 c3906y93 = this.f;
                if (c3906y93 != null) {
                    String str3 = this.i;
                    str3.getClass();
                    c3906y93.a(str3, "timer started - load banner");
                }
                C3381e2 c3381e23 = this.n;
                if (c3381e23 != null) {
                    c3381e23.E();
                }
                C3381e2 c3381e24 = this.n;
                if (c3381e24 != null) {
                    c3381e24.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl, com.inmobi.media.AbstractC3458h1
    public final void a() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "onAdDismissed " + this);
        }
        this.a = (byte) 0;
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y92.d(str2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C3485i2 c3485i2, AdMetaInfo adMetaInfo) {
        C3906y9 c3906y9 = c3485i2.f;
        if (c3906y9 != null) {
            String str = c3485i2.i;
            str.getClass();
            c3906y9.a(str, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3485i2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3906y9 c3906y92 = c3485i2.f;
        if (c3906y92 != null) {
            String str2 = c3485i2.i;
            str2.getClass();
            c3906y92.b(str2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC3458h1
    public final void a(int i, int i2, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        ViewParent parent;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.c(str, "onShowNextPodAd " + this);
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.i;
            str2.getClass();
            c3906y92.a(str2, "on Show next pod ad index: " + i);
        }
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3889xi.getParent();
            } catch (Exception unused) {
                C3381e2 c3381e2 = this.m;
                if (c3381e2 != null) {
                    c3381e2.e(i2);
                }
                C3381e2 c3381e22 = this.m;
                if (c3381e22 != null) {
                    c3381e22.b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        C3381e2 c3381e23 = this.m;
        if (inMobiBanner != null) {
            if (c3381e23 != null) {
                c3381e23.b(i2, true);
            }
            c(inMobiBanner);
            this.d.post(new pn0(this, i2, 20));
            return;
        }
        if (c3381e23 != null) {
            c3381e23.e(i2);
        }
        C3381e2 c3381e24 = this.m;
        if (c3381e24 != null) {
            c3381e24.b(i2, false);
        }
    }

    public final void a(InMobiBanner inMobiBanner) {
        C3845w0 c3845w0;
        List split$default;
        inMobiBanner.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.i;
            str.getClass();
            c3906y9.a(str, "applyInlineAdaptiveSizeIfNeeded " + this);
        }
        C3381e2 c3381e2 = this.n;
        if (c3381e2 == null || (c3845w0 = c3381e2.l) == null || !c3845w0.j || c3845w0.i.length() == 0) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(c3845w0.i, new String[]{this.j}, false, 0, 6, null);
        if (split$default.size() != 2) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str2 = this.i;
                str2.getClass();
                wv8.x("Invalid adaptive ad size: ", c3845w0.i, c3906y92, str2);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
        Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
        Integer num = null;
        if (((intOrNull == null || intOrNull.intValue() <= 0) ? null : intOrNull) != null) {
            if (intOrNull2 != null && intOrNull2.intValue() > 0) {
                num = intOrNull2;
            }
            if (num != null) {
                inMobiBanner.updateLayoutParamsForResolvedSize$media_release(intOrNull.intValue(), intOrNull2.intValue());
                return;
            }
        }
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            String str3 = this.i;
            str3.getClass();
            wv8.x("Invalid adaptive ad size: ", c3845w0.i, c3906y93, str3);
        }
    }

    public static final void a(C3485i2 c3485i2, int i) {
        C3381e2 c3381e2 = c3485i2.m;
        if (c3381e2 != null) {
            c3381e2.a(i, false);
        }
    }

    @Override // com.inmobi.media.AbstractC3349cl
    public final void a(WatermarkData watermarkData) {
        watermarkData.getClass();
        super.a(watermarkData);
        C3381e2 c3381e2 = this.k;
        if (c3381e2 != null) {
            watermarkData.getClass();
            c3381e2.A = watermarkData;
            GestureDetectorOnGestureListenerC3889xi r = c3381e2.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
        C3381e2 c3381e22 = this.l;
        if (c3381e22 != null) {
            watermarkData.getClass();
            c3381e22.A = watermarkData;
            GestureDetectorOnGestureListenerC3889xi r2 = c3381e22.r();
            if (r2 != null) {
                r2.setWatermark(watermarkData);
            }
        }
    }
}
