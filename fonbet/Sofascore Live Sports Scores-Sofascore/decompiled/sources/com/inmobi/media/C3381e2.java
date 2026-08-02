package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.iol;
import defpackage.n6m;
import defpackage.ndk;
import defpackage.uu1;
import defpackage.wv8;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3381e2 extends AbstractC3587m1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C3407f2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3381e2(Context context, C3845w0 c3845w0, AbstractC3349cl abstractC3349cl) {
        super(context, c3845w0, abstractC3349cl);
        context.getClass();
        c3845w0.getClass();
        this.F = "e2";
        this.G = "InMobi";
        this.J = new C3407f2();
        long j = c3845w0.a;
        a(context, c3845w0, abstractC3349cl);
    }

    public static final void c(C3381e2 c3381e2) {
        try {
            if (c3381e2.b != 6) {
                if (c3381e2.b == 7) {
                    c3381e2.I++;
                    return;
                }
                return;
            }
            c3381e2.I++;
            c3381e2.c((byte) 7);
            C3906y9 c3906y9 = c3381e2.i;
            if (c3906y9 != null) {
                String str = c3381e2.F;
                str.getClass();
                c3906y9.d(str, "AdUnit " + c3381e2 + " state - ACTIVE");
            }
            C3906y9 c3906y92 = c3381e2.i;
            if (c3906y92 != null) {
                c3906y92.c(c3381e2.G, "Successfully displayed banner ad for placement Id : " + c3381e2.l);
            }
            AbstractC3458h1 n = c3381e2.n();
            if (n != null) {
                c3381e2.a(n);
            }
        } catch (Exception e) {
            C3906y9 c3906y93 = c3381e2.i;
            if (c3906y93 != null) {
                String str2 = c3381e2.F;
                str2.getClass();
                wv8.x("BannerAdUnit.onAdScreenDisplayed threw unexpected error: ", e.getMessage(), c3906y93, str2);
            }
        }
    }

    public static final void d(C3381e2 c3381e2) {
        try {
            if (c3381e2.b == 4) {
                c3381e2.c((byte) 6);
                C3906y9 c3906y9 = c3381e2.i;
                if (c3906y9 != null) {
                    String str = c3381e2.F;
                    str.getClass();
                    c3906y9.d(str, "AdUnit " + c3381e2 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            C3906y9 c3906y92 = c3381e2.i;
            if (c3906y92 != null) {
                String str2 = c3381e2.F;
                str2.getClass();
                wv8.x("BannerAdUnit.onRenderViewVisible threw unexpected error: ", e.getMessage(), c3906y92, str2);
            }
        }
    }

    public static final void f(C3381e2 c3381e2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c3381e2.s) {
            c3381e2.q = System.currentTimeMillis();
            AdSet s = c3381e2.s();
            if (s != null && (ads = s.getAds()) != null) {
                int i = 0;
                for (Object obj : ads) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    c3381e2.r.add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        c3381e2.O();
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void D() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "load " + this);
        }
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final boolean F() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 == null) {
            return false;
        }
        String str = this.F;
        str.getClass();
        c3906y9.c(str, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void G() {
        AbstractC3458h1 n;
        super.G();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c(this.G, "Banner ad fetch successful for placement id: " + this.l);
        }
        if (!Intrinsics.c(t(), "html") && !Intrinsics.c(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.b != 2 || (n = n()) == null) {
            return;
        }
        c(n);
    }

    public boolean W() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "canProceedToLoad " + this);
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Xb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                String str2 = this.F;
                str2.getClass();
                c3906y92.b(str2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != this.b) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.c(this.G, "Fetching a Banner ad for placement id: " + this.l);
            }
            E();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            String str3 = this.F;
            str3.getClass();
            c3906y94.b(str3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.a);
        }
        return false;
    }

    public final void X() {
        AbstractC3429fo viewableAd;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "onPause " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC3889xi j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 1);
        }
    }

    public final void Y() {
        AbstractC3429fo viewableAd;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "onResume " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC3889xi j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 0);
        }
    }

    public final void Z() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "registerLifeCycleCallbacks " + this);
        }
        Context o = o();
        if (o != null) {
            AbstractC3424fj.a(o, this);
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.InterfaceC3871x0
    public final void a(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Context context) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!this.s) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                String str2 = this.F;
                str2.getClass();
                c3906y92.b(str2, "Cannot show an pod ad as isPod is not set.");
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.h;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(gestureDetectorOnGestureListenerC3889xi));
            if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                gestureDetectorOnGestureListenerC3889xi2.b(false);
                return;
            }
            return;
        }
        if (!b(i, gestureDetectorOnGestureListenerC3889xi)) {
            super.a(i, gestureDetectorOnGestureListenerC3889xi, context);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new uu1(this, gestureDetectorOnGestureListenerC3889xi, i, 11));
                return;
            }
            return;
        }
        C3906y9 c3906y93 = this.i;
        if (c3906y93 != null) {
            String str3 = this.F;
            str3.getClass();
            c3906y93.b(str3, "Cannot show an pod ad with invalid index passed");
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.h;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi3 = (GestureDetectorOnGestureListenerC3889xi) copyOnWriteArrayList2.get(copyOnWriteArrayList2.indexOf(gestureDetectorOnGestureListenerC3889xi));
        if (gestureDetectorOnGestureListenerC3889xi3 != null) {
            gestureDetectorOnGestureListenerC3889xi3.b(false);
        }
    }

    public final void a0() {
        AdConfig adConfig;
        if (Intrinsics.c(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                String str = this.F;
                str.getClass();
                c3906y9.a(str, "renderAd without internet check");
            }
            b0();
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            String str2 = this.F;
            str2.getClass();
            c3906y92.a(str2, "renderAd");
        }
        a(new ndk(this, 18), new iol(this, 7));
    }

    public final boolean b(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "isInValidShowPodIndex " + i + " " + this.r + " " + this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) + " " + this + " ");
        }
        if (!this.r.contains(Integer.valueOf(i)) || i <= this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) || this.h.get(i) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i);
        return (gestureDetectorOnGestureListenerC3889xi2 == null || gestureDetectorOnGestureListenerC3889xi2.C0) ? false : true;
    }

    public final void b0() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "renderAdPostInternetCheck");
        }
        try {
            if (N()) {
                return;
            }
            C3742s1 c3742s1 = this.z;
            c3742s1.getClass();
            c3742s1.g = SystemClock.elapsedRealtime();
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new n6m(this, 4));
            }
        } catch (IllegalStateException e) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                String str2 = this.F;
                str2.getClass();
                c3906y92.a(str2, "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void c0() {
        Application application;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        Context o = o();
        Activity activity = o instanceof Activity ? (Activity) o : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final synchronized void e(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        try {
            gestureDetectorOnGestureListenerC3889xi.getClass();
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                String str = this.F;
                str.getClass();
                c3906y9.a(str, "onAdScreenDismissed " + this);
            }
            super.e(gestureDetectorOnGestureListenerC3889xi);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new n6m(this, 1));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        if (this.s) {
            Integer num = (Integer) CollectionsKt.Z(this.r);
            if (num != null) {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) CollectionsKt.a0(num.intValue(), this.h);
                if (Intrinsics.c(gestureDetectorOnGestureListenerC3889xi != null ? gestureDetectorOnGestureListenerC3889xi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3889xi, AbstractC3587m1.p(gestureDetectorOnGestureListenerC3889xi));
                    gestureDetectorOnGestureListenerC3889xi.g();
                    return;
                }
                return;
            }
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i);
                if (Intrinsics.c(gestureDetectorOnGestureListenerC3889xi2 != null ? gestureDetectorOnGestureListenerC3889xi2.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3889xi2, AbstractC3587m1.p(gestureDetectorOnGestureListenerC3889xi2));
                    gestureDetectorOnGestureListenerC3889xi2.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final HashMap l() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "adSpecificRequestParams getter " + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("u-rt", this.H ? "1" : "0");
        hashMap.put("mk-ad-slot", this.l.h);
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void m(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "handleRenderViewSignaledAdReady " + this);
        }
        super.m(gestureDetectorOnGestureListenerC3889xi);
        if (this.s && this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) > 0 && this.b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.p);
            if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                gestureDetectorOnGestureListenerC3889xi2.a(true);
                return;
            }
            return;
        }
        if (this.b != 2) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                String str2 = this.F;
                str2.getClass();
                c3906y92.a(str2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3906y9 c3906y93 = this.i;
        if (c3906y93 != null) {
            String str3 = this.F;
            str3.getClass();
            c3906y93.d(str3, "AdUnit " + this + " state - READY");
        }
        C3742s1 c3742s1 = this.z;
        c3742s1.getClass();
        c3742s1.i = SystemClock.elapsedRealtime();
        Q();
        T();
        C3906y9 c3906y94 = this.i;
        if (c3906y94 != null) {
            c3906y94.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.l);
        }
        AbstractC3458h1 n = n();
        if (n != null) {
            d(n);
        } else {
            C3906y9 c3906y95 = this.i;
            if (c3906y95 != null) {
                String str4 = this.F;
                str4.getClass();
                c3906y95.b(str4, "AdUnit listener is null");
            }
        }
        h();
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void o(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        int indexOf;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (this.s && (indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi)) > this.p && gestureDetectorOnGestureListenerC3889xi.J != EnumC3481ho.VISIBLE) {
            this.r.remove(Integer.valueOf(indexOf));
        } else {
            V();
            super.o(gestureDetectorOnGestureListenerC3889xi);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityDestroyed " + this);
        }
        Context o = o();
        if (Intrinsics.c(o, activity)) {
            o.getClass();
            ((Activity) o).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityStarted " + this);
        }
        if (Intrinsics.c(o(), activity)) {
            Y();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onActivityStopped " + this);
        }
        if (Intrinsics.c(o(), activity)) {
            X();
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final GestureDetectorOnGestureListenerC3889xi r() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.p);
        if (this.l.l && gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.l();
        }
        return gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final byte u() {
        return (byte) 0;
    }

    public static final Unit e(C3381e2 c3381e2) {
        C3906y9 c3906y9 = c3381e2.i;
        if (c3906y9 != null) {
            String str = c3381e2.F;
            str.getClass();
            c3906y9.a(str, "loadWithRetry success");
        }
        c3381e2.b0();
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void d() {
        this.J.a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final synchronized void f(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        try {
            gestureDetectorOnGestureListenerC3889xi.getClass();
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                String str = this.F;
                str.getClass();
                c3906y9.a(str, "onAdScreenDisplayed " + this);
            }
            super.f(gestureDetectorOnGestureListenerC3889xi);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new n6m(this, 3));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(String str) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str2 = this.F;
            str2.getClass();
            c3906y9.c(str2, "setAdSize " + this);
        }
        C3845w0 c3845w0 = this.l;
        str.getClass();
        c3845w0.getClass();
        str.getClass();
        c3845w0.h = str;
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public final void b() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "closeAll " + this);
        }
    }

    public static final void b(C3381e2 c3381e2) {
        try {
            if (c3381e2.b == 7) {
                int i = c3381e2.I - 1;
                c3381e2.I = i;
                if (i == 0) {
                    c3381e2.c((byte) 6);
                    AbstractC3458h1 n = c3381e2.n();
                    if (n != null) {
                        n.a();
                    }
                }
            }
        } catch (Exception e) {
            C3906y9 c3906y9 = c3381e2.i;
            if (c3906y9 != null) {
                String str = c3381e2.F;
                str.getClass();
                wv8.x("BannerAdUnit.onAdScreenDismissed threw unexpected error: ", e.getMessage(), c3906y9, str);
            }
        }
    }

    public final void b(boolean z) {
        C3906y9 c3906y9;
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            String str = this.F;
            str.getClass();
            c3906y92.a(str, "load " + this);
        }
        if (z && (c3906y9 = this.i) != null) {
            c3906y9.c(this.G, "Initiating Banner refresh for placement id: " + this.l);
        }
        this.H = z;
        D();
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.AbstractC3941zi
    public void i(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.c(str, "onRenderViewVisible " + this);
        }
        super.i(gestureDetectorOnGestureListenerC3889xi);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new n6m(this, 0));
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, short s, String str) {
        str.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str2 = this.F;
            str2.getClass();
            c3906y9.a(str2, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC3889xi, s, str);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
            a(indexOf, true);
            if (indexOf > 0 && this.b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.p);
                if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                    gestureDetectorOnGestureListenerC3889xi2.a(false);
                }
            }
        }
        if (this.b == 2) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public final void a(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            String str = this.F;
            str.getClass();
            c3906y9.a(str, "loadPodAd " + this);
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(gestureDetectorOnGestureListenerC3889xi)) {
            this.o = i;
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new n6m(this, 2));
                return;
            }
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            String str2 = this.F;
            str2.getClass();
            c3906y92.a(str2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(gestureDetectorOnGestureListenerC3889xi));
        if (gestureDetectorOnGestureListenerC3889xi2 != null) {
            gestureDetectorOnGestureListenerC3889xi2.a(false);
        }
    }

    public static final void a(C3381e2 c3381e2) {
        C3906y9 c3906y9 = c3381e2.i;
        if (c3906y9 != null) {
            String str = c3381e2.F;
            str.getClass();
            c3906y9.a(str, "start loading html ad");
        }
        c3381e2.O();
    }

    public static final Unit a(C3381e2 c3381e2, EnumC3489i6 enumC3489i6) {
        short s;
        enumC3489i6.getClass();
        C3906y9 c3906y9 = c3381e2.i;
        if (c3906y9 != null) {
            String str = c3381e2.F;
            str.getClass();
            c3906y9.b(str, "loadWithRetry error - " + enumC3489i6);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        enumC3489i6.getClass();
        int ordinal = enumC3489i6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2123;
                        break;
                    case 13:
                        s = 2124;
                        break;
                    case 14:
                        s = 2125;
                        break;
                    case 15:
                        s = 2126;
                        break;
                    case 16:
                        s = 2127;
                        break;
                }
            } else {
                s = 2229;
            }
            c3381e2.a(inMobiAdRequestStatus, true, s);
            return Unit.a;
        }
        s = 2122;
        c3381e2.a(inMobiAdRequestStatus, true, s);
        return Unit.a;
    }

    public static final void a(C3381e2 c3381e2, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, int i) {
        int indexOf = c3381e2.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        try {
            AbstractC3458h1 n = c3381e2.n();
            C3906y9 c3906y9 = c3381e2.i;
            if (c3906y9 != null) {
                String str = c3381e2.F;
                str.getClass();
                c3906y9.c(str, "callback onShowNextPodAd");
            }
            if (n != null) {
                n.a(i, indexOf, gestureDetectorOnGestureListenerC3889xi);
            }
        } catch (Exception unused) {
            c3381e2.b(indexOf, false);
            c3381e2.e(indexOf);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public void a(Z1 z1) {
        z1.getClass();
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(z1);
        }
        C3407f2 c3407f2 = this.J;
        c3407f2.getClass();
        z1.getClass();
        if (!c3407f2.a && z1 == Z1.e) {
            c3407f2.a = true;
            C3440g9 c3440g9 = C3440g9.c;
            c3440g9.a = System.currentTimeMillis();
            c3440g9.b++;
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public void a(boolean z) {
        C3440g9 c3440g9 = C3440g9.c;
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "banner_audio_pref_file");
        int i = a.a.getInt("user_mute_count", 0);
        a.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        super.a(gestureDetectorOnGestureListenerC3889xi, z);
        byte b = this.b;
        if (b != 4 && b != 6) {
            if (b == 7) {
                gestureDetectorOnGestureListenerC3889xi.a(z, this.b == 7 ? z ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte b2 = this.b;
        if (b2 == 4) {
            r1 = z ? (short) 2220 : (short) 2219;
        } else if (b2 == 6) {
            r1 = z ? (short) 2222 : (short) 2221;
        }
        K();
        gestureDetectorOnGestureListenerC3889xi.a(z, r1);
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public String m() {
        return "banner";
    }
}
