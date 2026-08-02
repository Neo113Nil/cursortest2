package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3829va;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dmi;
import defpackage.iol;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ndk;
import defpackage.uu1;
import defpackage.xym;
import defpackage.zol;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3829va extends AbstractC3587m1 {
    public int F;
    public boolean G;
    public final C3658ok H;
    public Function0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3829va(Context context, C3845w0 c3845w0, C3881xa c3881xa) {
        super(context, c3845w0, c3881xa);
        context.getClass();
        c3845w0.getClass();
        this.H = new C3658ok();
        long j = c3845w0.a;
        a(context, c3845w0, c3881xa);
        super.L();
    }

    public static final void c(C3829va c3829va) {
        c3829va.g(c3829va.n());
    }

    public static final void e(C3829va c3829va) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c3829va.O();
        if (c3829va.s) {
            AdSet s = c3829va.s();
            int size = (s == null || (ads = s.getAds()) == null) ? 0 : ads.size();
            for (int i = 1; i < size; i++) {
                c3829va.o++;
                c3829va.O();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void D() {
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void G() {
        super.G();
        if (!Intrinsics.c(t(), "html") && !Intrinsics.c(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.b == 2) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.l);
            }
            AbstractC3458h1 n = n();
            if (n != null) {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.a("va", "callback - onFetchSuccess");
                }
                c(n);
                return;
            }
            c((short) 2188);
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("va", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void J() {
        super.J();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void L() {
        super.L();
    }

    public final boolean W() {
        if (F()) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC3458h1 n = n();
        if (n == null || h(n)) {
            return false;
        }
        if (4 == this.b) {
            if (!A()) {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.a("va", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3458h1 n2 = n();
                if (n2 == null) {
                    C3906y9 c3906y93 = this.i;
                    if (c3906y93 != null) {
                        c3906y93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(n2);
                    d(n2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        E();
        return true;
    }

    public final int X() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        if (s != null) {
            int podSuccessCount = s.getPodSuccessCount();
            Integer valueOf = Integer.valueOf(podSuccessCount);
            if (podSuccessCount < 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        AdSet s2 = s();
        if (s2 != null && (ads = s2.getAds()) != null) {
            int size = ads.size();
            Integer valueOf2 = size > 0 ? Integer.valueOf(size) : null;
            if (valueOf2 != null) {
                return valueOf2.intValue();
            }
        }
        return 1;
    }

    public final void Y() {
        AdConfig adConfig;
        if (Intrinsics.c(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", "renderAd without internet check");
            }
            Z();
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("va", "renderAd");
        }
        a(new ndk(this, 24), new iol(this, 17));
    }

    public final void Z() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("va", "renderAdPostInternetCheck");
        }
        super.J();
        this.F = 0;
        try {
            if (N()) {
                return;
            }
            C3742s1 c3742s1 = this.z;
            c3742s1.getClass();
            c3742s1.g = SystemClock.elapsedRealtime();
            String t = t();
            if (!Intrinsics.c(t, "html") && !Intrinsics.c(t, "htmlUrl")) {
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.a("va", "Cannot handle markupType: " + t());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new xym(this, 3));
            }
        } catch (IllegalStateException e) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.a("va", "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void a(AbstractC3458h1 abstractC3458h1, Context context) {
        if (abstractC3458h1 == null) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        Function0 function0 = this.I;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (this.b == 8) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("va", "unload has been called on this ad. Dont show. ");
            }
            Xb.a((byte) 2, "va", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (this.b != 4) {
            Xb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("va", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Xb.a((byte) 1, "va", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a((short) 2152);
            return;
        }
        e(abstractC3458h1);
        c((byte) 6);
        if (A()) {
            a((short) 2153);
            c((byte) 0);
            GestureDetectorOnGestureListenerC3889xi j = j();
            if (j != null) {
                j.b();
                return;
            }
            return;
        }
        if (context == null) {
            context = o();
        }
        short b = b(context);
        if (b != 0) {
            a(b);
        } else {
            abstractC3458h1.c();
        }
    }

    public final void a0() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.d("va", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3742s1 c3742s1 = this.z;
        c3742s1.getClass();
        c3742s1.i = SystemClock.elapsedRealtime();
        Q();
        T();
        this.H.a = true;
        AbstractC3458h1 n = n();
        if (n != null) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("va", "signaling Success");
            }
            d(n);
        }
    }

    public final short b(Context context) {
        try {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC3889xi j = j();
            if (j == null) {
                return (short) 2155;
            }
            if ("unknown".equals(j.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            int hashCode = j.hashCode();
            InMobiAdActivity.t.put(hashCode, j);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                HashMap hashMap = Y8.a;
                String str = uuid.toString();
                str.getClass();
                Y8.a.put(str, new WeakReference(c3906y92));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String t = t();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", Intrinsics.c(t, "html") ? 200 : Intrinsics.c(t, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.s) {
                if (this.q == -1) {
                    this.q = System.currentTimeMillis();
                }
                if (this.o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = AbstractC3424fj.a;
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (Exception e) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
            return (short) 2154;
        }
    }

    public final void b0() {
        MetaInfo metaInfo;
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "submitAdNotReady " + this);
        }
        C3658ok c3658ok = this.H;
        C3742s1 c3742s1 = this.z;
        com.inmobi.media.ads.network.common.model.Ad q = q();
        String creativeType = (q == null || (metaInfo = q.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet s = s();
        Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
        String t = t();
        String str = null;
        Boolean bool = valueOf;
        byte b = this.b;
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null) {
            str = q2.getImpressionId();
        }
        new C3767t0(c3742s1, creativeType, bool, t, b, str);
        String str2 = str;
        c3658ok.getClass();
        HashMap hashMap = new HashMap();
        long j = c3742s1.c;
        ku3 ku3Var = Hl.a;
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(b == 0 ? (short) 2204 : b == 1 ? (short) 2282 : b == 2 ? (short) 2283 : b == 3 ? (short) 2284 : b == 6 ? (short) 2285 : b == 7 ? (short) 2209 : b == 8 ? (short) 2242 : (short) 2210));
        hashMap.put("markupType", t);
        if (creativeType != null) {
            hashMap.put("creativeType", creativeType);
        }
        if (str2 != null) {
            hashMap.put("impressionId", str2);
        }
        if (bool != null) {
            hashMap.put("isRewarded", bool);
        }
        String a = c3742s1.a();
        if (a.length() > 0) {
            hashMap.put("metadataBlob", a);
        }
        hashMap.put("adType", c3742s1.a.m());
        hashMap.put("networkType", F5.o());
        hashMap.put("plId", Long.valueOf(c3742s1.a.l.a));
        hashMap.put("isAdLoaded", Boolean.valueOf(c3658ok.a));
        String str3 = c3742s1.a.l.f;
        if (str3 != null) {
            hashMap.put("plType", str3);
        }
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdNotReady", hashMap, EnumC3943zk.SDK);
    }

    public final void c0() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.l);
        }
        h();
        a0();
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void d() {
        super.d();
        this.I = null;
    }

    public final void f(AbstractC3458h1 abstractC3458h1) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("va", "handleAdScreenDismissed " + ((int) this.b));
        }
        if (this.b == 7) {
            int i = this.F - 1;
            this.F = i;
            if (i == 1) {
                c((byte) 6);
                C3906y9 c3906y92 = this.i;
                if (c3906y92 != null) {
                    c3906y92.d("va", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (this.b == 6 || this.b == 8) {
            this.F--;
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.l);
            }
            if (abstractC3458h1 != null) {
                abstractC3458h1.a();
                return;
            }
            C3906y9 c3906y94 = this.i;
            if (c3906y94 != null) {
                c3906y94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public final void g(AbstractC3458h1 abstractC3458h1) {
        if (this.b != 6) {
            if (this.b == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i = this.F + 1;
        this.F = i;
        if (i != 1) {
            c((byte) 7);
            return;
        }
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.l);
        }
        if (abstractC3458h1 != null) {
            b((byte) 4);
            a(abstractC3458h1);
        }
    }

    public final boolean h(AbstractC3458h1 abstractC3458h1) {
        byte b = this.b;
        if (b == 1) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b == 7 || b == 6) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b != 2) {
            return false;
        }
        if ("html".equals(t()) || "htmlUrl".equals(t())) {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC3458h1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i);
                if (Intrinsics.c(gestureDetectorOnGestureListenerC3889xi != null ? gestureDetectorOnGestureListenerC3889xi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3889xi, AbstractC3587m1.p(gestureDetectorOnGestureListenerC3889xi));
                    gestureDetectorOnGestureListenerC3889xi.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void m(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        super.m(gestureDetectorOnGestureListenerC3889xi);
        if (!this.s) {
            if (this.b == 2) {
                b((byte) 1);
                c0();
                return;
            }
            return;
        }
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        int i = this.p;
        if (indexOf < i) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", dmi.k(indexOf, i, "Ignoring loaded ad with index ", " as current rendering index is "));
                return;
            }
            return;
        }
        this.r.add(Integer.valueOf(indexOf));
        if (this.b == 2) {
            int X = X();
            for (int i2 = 0; i2 < X && i2 < this.h.size(); i2++) {
                if (this.h.get(i2) == null || !this.r.contains(Integer.valueOf(i2))) {
                    return;
                }
            }
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("va", "Providing success based on index " + indexOf);
            }
            b((byte) 1);
            this.p = 0;
            c0();
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void n(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (!this.s) {
            V();
        } else if (!a(gestureDetectorOnGestureListenerC3889xi)) {
            V();
        }
        super.n(gestureDetectorOnGestureListenerC3889xi);
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final GestureDetectorOnGestureListenerC3889xi r() {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC3889xi) this.h.get(this.p);
        if (this.G && gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.l();
        }
        return gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final byte u() {
        return (byte) 1;
    }

    public static final Unit d(C3829va c3829va) {
        c3829va.Z();
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final synchronized void e(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        super.e(gestureDetectorOnGestureListenerC3889xi);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new xym(this, 1));
        }
    }

    public final void f(short s) {
        if (this.b == 2) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final String m() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final synchronized void f(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        super.f(gestureDetectorOnGestureListenerC3889xi);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new xym(this, 2));
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void a(byte[] bArr) {
        if (W()) {
            super.a(bArr);
        }
    }

    public final void a(C3881xa c3881xa, Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC3458h1) c3881xa, (Context) activity);
        } else {
            ((ExecutorC3520jc) AbstractC3851w6.e.getValue()).a.post(new zol(this, c3881xa, activity, false, 15));
        }
    }

    public static final void a(C3829va c3829va, AbstractC3458h1 abstractC3458h1, Context context) {
        c3829va.a(abstractC3458h1, context);
    }

    public static final void a(C3829va c3829va, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Context context) {
        int indexOf = c3829va.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
        CopyOnWriteArrayList copyOnWriteArrayList = c3829va.h;
        copyOnWriteArrayList.getClass();
        if (indexOf < 0 || indexOf >= copyOnWriteArrayList.size()) {
            return;
        }
        short b = c3829va.b(context);
        if (b != 0) {
            c3829va.e(indexOf);
        }
        c3829va.b(indexOf, b == 0);
        Handler handler = c3829va.j;
        if (handler != null) {
            handler.post(new uu1(gestureDetectorOnGestureListenerC3889xi, c3829va, indexOf, 14));
        }
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.InterfaceC3871x0
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Activity activity) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "closeCurrentPodAd " + this);
        }
        if (this.s) {
            Integer num = (Integer) this.r.higher(Integer.valueOf(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi)));
            if (num != null) {
                a(num.intValue(), gestureDetectorOnGestureListenerC3889xi, activity);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public final void a(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.InterfaceC3871x0
    public final boolean a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (this.s) {
            if (((Integer) this.r.higher(Integer.valueOf(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.Lk
    public final void a(byte b) {
        if (b == 1) {
            if (this.s) {
                if (this.b == 2) {
                    C3906y9 c3906y9 = this.i;
                    if (c3906y9 != null) {
                        c3906y9.b("va", "RenderView time out");
                    }
                    int X = X();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= X) {
                            break;
                        }
                        if (!this.r.contains(Integer.valueOf(i2))) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    a((GestureDetectorOnGestureListenerC3889xi) null, Integer.valueOf(i), 2);
                    i();
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.InterfaceC3871x0
    public final void a(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Context context) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (!this.s) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(gestureDetectorOnGestureListenerC3889xi) && i < this.h.size() && this.h.get(i) != null && ((gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) this.h.get(i)) == null || gestureDetectorOnGestureListenerC3889xi2.C0)) {
            if (context == null) {
                context = o();
            }
            Context context2 = context;
            super.a(i, gestureDetectorOnGestureListenerC3889xi, context2);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new zol(this, gestureDetectorOnGestureListenerC3889xi, context2, false, 14));
                return;
            }
            return;
        }
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.a("va", "Cannot show an pod ad with invalid index passed");
        }
        b(this.h.indexOf(gestureDetectorOnGestureListenerC3889xi), false);
    }

    public static final Unit a(C3829va c3829va, EnumC3489i6 enumC3489i6) {
        short s;
        enumC3489i6.getClass();
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
            c3829va.a(inMobiAdRequestStatus, true, s);
            return Unit.a;
        }
        s = 2122;
        c3829va.a(inMobiAdRequestStatus, true, s);
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3587m1
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, short s, String str) {
        str.getClass();
        super.a(gestureDetectorOnGestureListenerC3889xi, s, str);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC3889xi);
            if (indexOf < X()) {
                a(gestureDetectorOnGestureListenerC3889xi, (Integer) null, s == 2137 ? 1 : 3);
                f(s);
            }
            a(indexOf, true);
            return;
        }
        f(s);
    }

    @Override // com.inmobi.media.InterfaceC3871x0
    public final void b() {
        if (this.s) {
            C3906y9 c3906y9 = this.i;
            if (c3906y9 != null) {
                c3906y9.a("va", "Closing the ad as closeAll is called");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new xym(this, 0));
            }
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, C3829va c3829va, int i) {
        gestureDetectorOnGestureListenerC3889xi.m();
        c3829va.a(i, false);
    }

    public static final void a(C3829va c3829va) {
        c3829va.e();
        C3906y9 c3906y9 = c3829va.i;
        if (c3906y9 != null) {
            c3906y9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c3829va.l);
        }
        if (c3829va.n() != null) {
            AbstractC3458h1 n = c3829va.n();
            if (n != null) {
                n.a();
                return;
            }
            return;
        }
        C3906y9 c3906y92 = c3829va.i;
        if (c3906y92 != null) {
            c3906y92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    public static final void b(C3829va c3829va) {
        c3829va.f(c3829va.n());
    }

    @Override // com.inmobi.media.AbstractC3587m1, com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        super.a(gestureDetectorOnGestureListenerC3889xi, z);
        byte b = this.b;
        if (b == 4) {
            final short s = z ? (short) 2220 : (short) 2219;
            this.I = new Function0() { // from class: yym
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3829va.a(C3829va.this, s);
                }
            };
            return;
        }
        if (b != 6) {
            if (b == 7) {
                short s2 = z ? (short) 2224 : (short) 2223;
                Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3906y9 c3906y9 = this.i;
                if (c3906y9 != null) {
                    c3906y9.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                gestureDetectorOnGestureListenerC3889xi.a(z, s2);
                gestureDetectorOnGestureListenerC3889xi.x();
                f(n());
                return;
            }
            return;
        }
        short s3 = z ? (short) 2222 : (short) 2221;
        Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3906y9 c3906y92 = this.i;
        if (c3906y92 != null) {
            c3906y92.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        gestureDetectorOnGestureListenerC3889xi.x();
        if (this.F == 0) {
            a(s3);
        } else {
            gestureDetectorOnGestureListenerC3889xi.a(z, s3);
            f(n());
        }
    }

    public static final Unit a(C3829va c3829va, short s) {
        Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3906y9 c3906y9 = c3829va.i;
        if (c3906y9 != null) {
            c3906y9.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c3829va.a(s);
        c3829va.I = null;
        return Unit.a;
    }
}
