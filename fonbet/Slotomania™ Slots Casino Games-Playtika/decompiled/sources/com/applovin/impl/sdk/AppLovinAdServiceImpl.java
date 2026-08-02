package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a6;
import com.applovin.impl.b5;
import com.applovin.impl.c6;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g6;
import com.applovin.impl.g8;
import com.applovin.impl.k;
import com.applovin.impl.k5;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u;
import com.applovin.impl.u1;
import com.applovin.impl.v2;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0108a {
    private final l a;
    private final p b;
    private final Map c;
    private final Object d = new Object();
    private final Map e = Collections.synchronizedMap(new HashMap());
    private final AtomicReference f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    class b implements o2 {
        private final c a;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.a.j().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.a);
            }
            Collection emptySet = Collections.emptySet();
            synchronized (this.a.a) {
                if (!this.a.c) {
                    emptySet = new HashSet(this.a.d);
                    this.a.d.clear();
                }
                c cVar = this.a;
                cVar.b = false;
                cVar.c = false;
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.o2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection emptySet = Collections.emptySet();
            synchronized (this.a.a) {
                if (!this.a.c) {
                    emptySet = new HashSet(this.a.d);
                    this.a.d.clear();
                }
                c cVar = this.a;
                cVar.b = false;
                cVar.c = false;
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.a = cVar;
        }
    }

    private static class c {
        final Object a;
        boolean b;
        boolean c;
        final Collection d;

        private c() {
            this.a = new Object();
            this.d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", isReloadingExpiredAd=" + this.c + ", pendingAdListeners=" + this.d + AbstractJsonLexerKt.END_OBJ;
        }
    }

    AppLovinAdServiceImpl(l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        HashMap hashMap = new HashMap(6);
        this.c = hashMap;
        hashMap.put(u.c(), new c());
        hashMap.put(u.k(), new c());
        hashMap.put(u.j(), new c());
        hashMap.put(u.m(), new c());
        hashMap.put(u.b(), new c());
        hashMap.put(u.h(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinAdServiceImpl.this.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof o2) {
            ((o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.a.B().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(u uVar) {
        AppLovinAdImpl a2 = this.a.j().a(uVar);
        if (p.a()) {
            this.b.a("AppLovinAdService", "Dequeued ad: " + a2 + " for zone: " + uVar + "...");
        }
        return a2;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.e);
            this.e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (p.a()) {
            this.b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String I = this.a.B().I();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(I) && p.a()) {
            this.b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return I;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            p.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(trim, this.a);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (kVar.c() == k.a.REGULAR) {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new c6(kVar, elapsedRealtime, appLovinAdLoadListener, this.a));
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            p.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject a2 = kVar.a();
        if (a2 == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            p.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        s0.c(a2, this.a);
        s0.b(a2, this.a);
        s0.a(a2, this.a);
        this.a.n().a();
        if (JsonUtils.getJSONArray(a2, com.safedk.android.analytics.brandsafety.m.S, new JSONArray()).length() <= 0) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (p.a()) {
            this.b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        final u a3 = q7.a(a2, this.a);
        MaxAdFormat d = a3.d();
        if (((Boolean) this.a.a(z4.b1)).booleanValue() && d != null && d.isFullscreenAd()) {
            this.a.i().a(a3, new e.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    AppLovinAdServiceImpl.this.a(appLovinAdLoadListener, a2, a3, elapsedRealtime, bVar);
                }
            });
        } else {
            a(new g6(a2, a3, elapsedRealtime, appLovinAdLoadListener, this.a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (p.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.a.a(z4.B2)).booleanValue() && (l = (Long) this.a.b(b5.N)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.a.a(z4.F2)).longValue()) {
            if (((Boolean) this.a.a(z4.E2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0108a
    public void onAdExpired(u1 u1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) u1Var;
        u adZone = appLovinAdImpl.getAdZone();
        if (p.a()) {
            this.b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.a.j().b(appLovinAdImpl);
        if (this.a.I0() || !((Boolean) this.a.a(z4.h1)).booleanValue()) {
            return;
        }
        c a2 = a(adZone);
        synchronized (a2.a) {
            if (!a2.b) {
                this.a.Q();
                if (p.a()) {
                    this.a.Q().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                a2.b = true;
                a2.c = true;
                a(adZone, new b(a2));
            } else if (p.a()) {
                this.b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent) {
        if (bVar == null) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (p.a()) {
            this.b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, y1 y1Var, Context context) {
        if (bVar == null) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(y1Var.b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j, List<Long> list, long j2, boolean z, int i) {
        if (bVar == null) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> e = bVar.e();
        if (e == null || e.isEmpty()) {
            if (p.a()) {
                this.b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : e) {
            String a2 = a(eVar.c(), j, j2, list, bVar.w(), z, i);
            String a3 = a(eVar.a(), j, j2, list, bVar.w(), z, i);
            if (StringUtils.isValidString(a2)) {
                a(new com.applovin.impl.e(a2, a3));
            } else if (p.a()) {
                this.b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.B());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j, int i, boolean z) {
        if (bVar == null) {
            if (p.a()) {
                this.b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> i0 = bVar.i0();
        if (i0 == null || i0.isEmpty()) {
            if (p.a()) {
                this.b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : i0) {
            if (StringUtils.isValidString(eVar.c())) {
                String a2 = a(eVar.c(), j, i, l, z);
                String a3 = a(eVar.a(), j, i, l, z);
                if (a2 != null) {
                    a(new com.applovin.impl.e(a2, a3));
                } else if (p.a()) {
                    this.b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (p.a()) {
                this.b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, u uVar, long j, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinAdLoadListener.this.adReceived(bVar);
                }
            });
        } else {
            a(new g6(jSONObject, uVar, j, appLovinAdLoadListener, this.a));
        }
    }

    private boolean b() {
        if (!p0.b()) {
            return true;
        }
        Context p = l.p();
        ApplicationExitInfo applicationExitInfo = ((ActivityManager) p.getSystemService("activity")).getHistoricalProcessExitReasons(p.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    private void a(u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            c a2 = a(uVar);
            synchronized (a2.a) {
                a2.d.add(appLovinAdLoadListener);
                if (!a2.b) {
                    a2.b = true;
                    a(uVar, new b(a2));
                } else if (p.a()) {
                    this.b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(k5 k5Var) {
        if (!this.a.D0()) {
            p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.c();
        this.a.s0().a(k5Var, f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinAdServiceImpl.this.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            p.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            p.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.a.E().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof o2 ? "V2" : ""), th);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b g = aVar.g();
        if (n7.a(uri)) {
            a(uri, g, aVar.i(), aVar, context, this.a);
        } else if (g != null && g.isCustomTabsEnabled()) {
            this.a.A().a(uri, aVar, this.a.w0());
        } else {
            n7.b(uri, g, context, this.a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.a.a(z4.w)).booleanValue()) {
            context = g8.b(appLovinAdView, this.a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (n7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.a.A().a(uri, aVar, this.a.w0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.a.E().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (n7.b(uri, bVar, context, this.a)) {
            v2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.v();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b2 = b(uri, "primaryUrl");
            List a2 = a(uri, "primaryTrackingUrl");
            Uri b3 = b(uri, "fallbackUrl");
            List a3 = a(uri, "fallbackTrackingUrl");
            if (b2 == null && b3 == null) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b2, "primary", a2, bVar, appLovinAdView, aVar, context, lVar)) {
                a(b3, "backup", a3, bVar, appLovinAdView, aVar, context, lVar);
            }
            if (aVar != null) {
                aVar.v();
                return;
            }
            return;
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean b2 = n7.b(uri, bVar, context, lVar);
        if (b2) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lVar.i0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                v2.b(aVar.e(), bVar, appLovinAdView);
                return b2;
            }
        } else {
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("AppLovinAdService", "URL failed to open");
            }
        }
        return b2;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.a.Q();
                if (p.a()) {
                    this.a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j, long j2, List list, String str2, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            appendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i != j.h) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(j.a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> tryToStringMap;
        if (p.a()) {
            this.b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.a.b(b5.Q);
        if (TextUtils.isEmpty(str)) {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            tryToStringMap = null;
        } else {
            tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.a.E().d(f2.Q0, tryToStringMap);
        String str2 = (String) this.a.b(b5.P);
        if (str2 != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l = (Long) this.a.b(b5.O);
            if (l != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (p.a()) {
            this.b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.a.h0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (p.a()) {
            this.b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final u uVar, final b bVar) {
        AppLovinAdImpl e = this.a.j().e(uVar);
        if (e != null && !e.isExpired()) {
            if (p.a()) {
                this.b.a("AppLovinAdService", "Using pre-loaded ad: " + e + " for " + uVar);
            }
            bVar.adReceived(e);
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        MaxAdFormat d = uVar.d();
        if (((Boolean) this.a.a(z4.b1)).booleanValue() && d != null && d.isFullscreenAd()) {
            this.a.i().a(uVar, new e.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda4
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    AppLovinAdServiceImpl.this.a(bVar, uVar, elapsedRealtime, bVar2);
                }
            });
        } else {
            a(new a6(uVar, elapsedRealtime, bVar, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final b bVar, u uVar, long j, final com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinAdServiceImpl.b.this.adReceived(bVar2);
                }
            });
        } else {
            a(new a6(uVar, j, bVar, this.a));
        }
    }

    private c a(u uVar) {
        c cVar;
        synchronized (this.d) {
            cVar = (c) this.c.get(uVar);
            if (cVar == null) {
                cVar = new c();
                this.c.put(uVar, cVar);
            }
        }
        return cVar;
    }
}
