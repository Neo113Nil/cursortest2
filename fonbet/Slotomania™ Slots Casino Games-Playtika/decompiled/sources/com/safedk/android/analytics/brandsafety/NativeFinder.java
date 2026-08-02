package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public class NativeFinder extends b {
    public static final int I = 5;
    protected static final long J = 1000;
    protected static final long K = 500;
    private static final String L = "NativeFinder";
    private static final long M = 10;
    private static final Map<String, WeakReference<MaxNativeAdView>> Q = new HashMap();
    private static final Map<String, WeakReference<MaxNativeAdView>> R = new HashMap();
    private static final Map<String, String> S = new HashMap();
    private final LinkedHashSetWithItemLimit<String> N;
    private final Map<d, t> O;
    private final Map<String, p> P;

    public NativeFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.NATIVE, Collections.singletonList("NATIVE"), L, maxAttemptsToCaptureImage);
        this.N = new LinkedHashSetWithItemLimit<>(M);
        this.O = new HashMap();
        this.P = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new t(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String str;
        String str2;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p() || SafeDK.getInstance() == null || !SafeDK.getInstance().r()) {
            return;
        }
        try {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.b.contains(messageData.getString("ad_format"))) {
                Logger.d(L, "Revenue event detected : ", messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string2 = messageData.getString("ad_format");
            String string3 = messageData.getString(BrandSafetyEvent.k);
            String string4 = messageData.getString(BrandSafetyEvent.l);
            String n = BrandSafetyUtils.n(messageData.getString("ad_view"));
            String string5 = messageData.getString("id", null);
            if (string5 == null) {
                Logger.d(L, "No eventId in data bundle, cannot match");
            }
            String string6 = messageData.getString(BrandSafetyEvent.ad);
            String c = CreativeInfoManager.c(string6);
            long currentTimeMillis = System.currentTimeMillis();
            long b = com.safedk.android.utils.n.b(currentTimeMillis);
            if (!messageData.containsKey("creative_id")) {
                str = null;
            } else {
                str = messageData.getString("creative_id");
            }
            if (this.b.contains(string2)) {
                Logger.d(L, "Max message received, package: ", c, ", ts (seconds): ", Long.valueOf(b), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                d dVar = new d(string4, string3, string5, c, string6, BrandSafetyUtils.AdType.NATIVE);
                if ("WILL_DISPLAY".equals(string)) {
                    if (c != null) {
                        str2 = string6;
                        if (f(str2, c)) {
                            Logger.d(L, "WILL_DISPLAY event for package=", c, ", key=", dVar, ", view address=", n, ", slot count=", Integer.valueOf(this.d));
                            CreativeInfoManager.a(c, string3, str, string5, string2);
                            a(string5, m.f, new m.a(m.L, BrandSafetyUtils.n(messageData.getString("ad_view"))));
                        }
                    } else {
                        str2 = string6;
                    }
                    a(str2, c, str, dVar, n, messageData, currentTimeMillis);
                    return;
                }
                String str3 = string6;
                if ("revenue_event".equals(string)) {
                    if (c != null && f(str3, c)) {
                        Logger.d(L, "REVENUE_EVENT event for package=", c, ", key=", dVar, ", view address=", n, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.k, new m.a(m.K, messageData.getString("revenue_event")));
                    }
                    a(str3, c, str, dVar, n, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (f(str3, c)) {
                        a(string5, m.h, new m.a[0]);
                        if (this.O.get(dVar) != null) {
                            Object[] objArr = new Object[4];
                            objArr[0] = "DID_CLICKED event for package=";
                            if (c != null) {
                                str3 = c;
                            }
                            objArr[1] = str3;
                            objArr[2] = ", slot count=";
                            objArr[3] = Integer.valueOf(this.d);
                            Logger.d(L, objArr);
                            c(dVar);
                        }
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (c != null && f(str3, c)) {
                        Logger.d(L, "WILL_LOAD event for package=", c, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.d, new m.a(m.N, str3));
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (c != null && f(str3, c)) {
                        Logger.d(L, "DID_HIDE event for package=", c, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.i, new m.a[0]);
                        a(dVar);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (c != null && f(str3, c)) {
                        Logger.d(L, "DID_LOAD event for package=", c, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.e, new m.a(m.N, str3));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (c != null && f(str3, c)) {
                        Logger.d(L, "DID_DISPLAY event for package=", c, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.g, new m.a[0]);
                        a(c, dVar, str, messageData, currentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && c != null && f(str3, c)) {
                    Logger.d(L, "DID_FAIL_DISPLAY event for package=", c, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                    a(string5, m.j, new m.a[0]);
                    b(dVar);
                }
            }
        } catch (Throwable th) {
            Logger.e(L, "on message received exception", th);
        }
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle, long j) {
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle WILL_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring.");
            return;
        }
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        int b = BrandSafetyUtils.b(this.c);
        synchronized (this.C) {
            Logger.d(L, "handle WILL_DISPLAY - image count for ", this.c.name(), " is ", Integer.valueOf(b), ", impressions to report(", Integer.valueOf(this.C.keySet().size()), ") = ", this.C.keySet());
        }
        if (!f(str, str2)) {
            this.d++;
            return;
        }
        t tVar = this.O.get(dVar);
        if (tVar == null) {
            tVar = a(foregroundActivity, str2, dVar.c, bundle);
            synchronized (this.O) {
                this.O.put(dVar, tVar);
            }
            Logger.d(L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity native size is ", Integer.valueOf(this.O.size()));
        } else {
            if (tVar.A == null) {
                tVar.A = bundle;
            }
            if (tVar.B == null || tVar.C == null) {
                tVar.a(a(foregroundActivity));
            }
        }
        tVar.K = TextUtils.isEmpty(str4) ? null : str4;
        tVar.W = true;
        tVar.ad = true;
        tVar.ae = j;
        a(tVar, false, "handleWillDisplay");
        a aVar = new a(tVar, dVar, this.e);
        tVar.aa = this.E.scheduleWithFixedDelay(aVar, 500L, SafeDK.getInstance().Z() * 1000, TimeUnit.MILLISECONDS);
        tVar.ac = aVar;
        a(tVar, dVar);
        a(tVar, dVar, (WeakReference<MaxNativeAdView>) a(dVar, str4, false).first);
    }

    private p a(t tVar, d dVar, WeakReference<MaxNativeAdView> weakReference) {
        p remove;
        if (weakReference != null && weakReference.get() != null) {
            tVar.ai = true;
            synchronized (this.P) {
                remove = this.P.remove(tVar.K);
                Logger.d(L, "try setting pending info - view address: ", tVar.K, " matching info: ", remove);
                if (remove != null) {
                    a(dVar.a, dVar.e, remove);
                }
            }
            return remove;
        }
        Logger.d(L, "try setting pending info - ad view reference not valid: ref=", weakReference);
        return null;
    }

    private Pair<WeakReference<MaxNativeAdView>, String> a(d dVar, String str, boolean z) {
        WeakReference<MaxNativeAdView> weakReference;
        synchronized (NativeFinder.class) {
            weakReference = Q.get(dVar.c);
            if (TextUtils.isEmpty(str) && weakReference != null && weakReference.get() != null) {
                str = BrandSafetyUtils.a(weakReference.get());
            }
            if (!TextUtils.isEmpty(str) && (weakReference == null || weakReference.get() == null)) {
                weakReference = z ? R.remove(str) : R.get(str);
                if (weakReference != null && weakReference.get() != null) {
                    Logger.d(L, "get ad view ref - native ad view found: ", weakReference.get(), " for event ID: ", dVar.c);
                    a(dVar.c, dVar.d, weakReference.get());
                }
            } else if (z) {
                R.remove(str);
            }
        }
        return new Pair<>(weakReference, str);
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle) {
        AdNetworkDiscovery j;
        CreativeInfo a2;
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle REVENUE_EVENT - impression with id ", dVar.c, " has already been reported, ignoring.");
            return;
        }
        Pair<WeakReference<MaxNativeAdView>, String> a3 = a(dVar, str4, true);
        WeakReference<MaxNativeAdView> weakReference = (WeakReference) a3.first;
        String str5 = (String) a3.second;
        a(str5, dVar);
        if (f(str, str2)) {
            t tVar = this.O.get(dVar);
            if (tVar == null) {
                tVar = a(foregroundActivity, str2, dVar.c, bundle);
                synchronized (this.O) {
                    this.O.put(dVar, tVar);
                }
                Logger.d(L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity natives size is ", Integer.valueOf(this.O.size()));
            } else {
                if (tVar.A == null) {
                    tVar.A = bundle;
                }
                if (tVar.B == null || tVar.C == null) {
                    tVar.a(a(foregroundActivity));
                }
            }
            if (bundle.getString("revenue_event") != null) {
                tVar.P = bundle.getString("revenue_event");
            } else {
                tVar.P = "unknown";
            }
            if (tVar.K == null) {
                tVar.K = TextUtils.isEmpty(str5) ? null : str5;
                synchronized (NativeFinder.class) {
                    S.put(str5, str2);
                }
            }
            tVar.M = str3;
            p a4 = a(tVar, dVar, weakReference);
            if (a4 == null && (j = CreativeInfoManager.j(dVar.d)) != null && (a2 = j.a((Object) dVar.c)) != null && a2.X() == null) {
                a4 = new p(a2, CreativeInfo.y);
                Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - try to match by event ID: ", dVar.c, " matching info: ", a4);
                a(dVar.a, dVar.e, a4);
            }
            if (a4 == null) {
                a(tVar, false, "handleRevenueEvent");
            }
            Logger.d(L, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId ", dVar.c);
            tVar.W = true;
            return;
        }
        this.d++;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j) {
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle DID_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring. ");
            return;
        }
        Logger.d(L, "handle DID_DISPLAY package=", str, " key=", dVar);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        t tVar = this.O.get(dVar);
        if (tVar != null) {
            Logger.d(L, "Native info already exists, package=", str, " activity native=", tVar);
            tVar.z = this.d;
            if (tVar.B == null || tVar.C == null) {
                tVar.a(a(foregroundActivity));
            }
        } else {
            tVar = a(foregroundActivity, str, dVar.c, bundle);
            synchronized (this.O) {
                this.O.put(dVar, tVar);
            }
            Logger.d(L, "New activity native created for ", str, ", key=", dVar, ", current activity ads size=", Integer.valueOf(this.O.size()));
        }
        tVar.M = str2;
        tVar.af = j;
        a(tVar, false, "handleDidDisplay");
    }

    private void a(d dVar) {
        synchronized (this.O) {
            t remove = this.O.remove(dVar);
            if (remove != null) {
                Logger.d(L, "handle DID_HIDE, placementId=", dVar.b);
                remove.Y = true;
            }
        }
    }

    private void b(d dVar) {
        t tVar = this.O.get(dVar);
        if (tVar != null) {
            tVar.N = true;
        }
    }

    private void c(d dVar) {
        Logger.d(L, "handle DID_CLICKED started");
        t tVar = this.O.get(dVar);
        if (tVar != null) {
            tVar.a(true);
            a(tVar, false, "handleDidClicked");
        }
    }

    private t a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.d++;
        Logger.d(L, "slot number incremented to ", Integer.valueOf(this.d), ", eventId is ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        t tVar = new t(a(activity), str, this.d, lowerCase, bundle, str2);
        tVar.ab = new WeakReference<>(activity);
        return tVar;
    }

    protected boolean f(String str, String str2) {
        boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        String a3 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(L, "sdk ", str2, ": config item SUPPORTS_NATIVE_IMPRESSION_TRACKING is ", Boolean.valueOf(a2), ", config item AD_NETWORK_TO_IGNORE is ", a3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (a2 && !str.equals(a3)) {
            return true;
        }
        Logger.d(L, "Native ads tracking is not supported for this ad network (", str, ")");
        return false;
    }

    public void a(final String str, final String str2, final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.b(str, str2, maxNativeAdView);
                }
            });
        } else {
            b(str, str2, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, MaxNativeAdView maxNativeAdView) {
        if (str != null && str2 != null && maxNativeAdView != null) {
            String a2 = BrandSafetyUtils.a(maxNativeAdView);
            synchronized (NativeFinder.class) {
                if (!Q.containsKey(str)) {
                    a(str, m.l, new m.a(m.L, a2));
                }
                Q.put(str, new WeakReference<>(maxNativeAdView));
                S.put(a2, str2);
            }
            Logger.d(L, "add native ad view: ", maxNativeAdView, ", eventId: ", str, ", adViewAddress: ", a2, ", sdk: ", str2, ", list size: ", Integer.valueOf(Q.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }
    }

    public void a(final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.c(maxNativeAdView);
                }
            });
        } else {
            c(maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MaxNativeAdView maxNativeAdView) {
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            R.put(a2, new WeakReference<>(maxNativeAdView));
        }
        Logger.d(L, "add native ad view: ", maxNativeAdView, ", list size: ", Integer.valueOf(R.size()));
    }

    private void a(String str, d dVar) {
        ArrayList<d> arrayList;
        t tVar;
        boolean z;
        Logger.d(L, "report completed event started, view address: ", str, ", key: ", dVar);
        synchronized (this.O) {
            arrayList = new ArrayList(this.O.keySet());
        }
        for (d dVar2 : arrayList) {
            if (dVar2.a.equals(dVar.a) && !dVar2.c.equals(dVar.c) && (tVar = this.O.get(dVar2)) != null) {
                if (tVar.K != null && tVar.K.equals(str)) {
                    Logger.d(L, "report completed event, same view address: ", tVar.K, ", event id: ", dVar2.c);
                    z = true;
                } else {
                    synchronized (NativeFinder.class) {
                        WeakReference<MaxNativeAdView> weakReference = Q.get(dVar2.c);
                        z = weakReference == null || weakReference.get() == null || weakReference.get().getParent() == null;
                        Logger.d(L, "report completed event, closed view address: ", tVar.K, ", event id: ", dVar2.c);
                    }
                }
                if (z) {
                    tVar.a(m.C, new m.a[0]);
                    a(tVar, true, "reportCompletedEvents");
                    tVar.U = true;
                    a(tVar);
                    synchronized (this.O) {
                        this.O.remove(dVar2);
                    }
                } else {
                    Logger.d(L, "report completed event skipped, view address: ", tVar.K, ", event id: ", dVar2.c);
                }
            }
        }
    }

    private void a(final t tVar, final d dVar) {
        tVar.Z = this.E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NativeFinder.this.O) {
                    NativeFinder.this.a(tVar, true, "handleWillDisplay:reportTimeout");
                    NativeFinder.this.O.remove(dVar);
                    NativeFinder.this.a(tVar);
                }
            }
        }, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t tVar) {
        try {
            Logger.d(L, "clean started, currentActivityAds size is ", Integer.valueOf(this.O.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (tVar != null) {
                Logger.d(L, "clean, adding to reported impressions map. id =  ", tVar.L);
                this.N.add(tVar.L);
                tVar.Y = true;
                if (tVar.Z != null) {
                    tVar.Z.cancel(false);
                }
                if (tVar.aa != null) {
                    tVar.aa.cancel(false);
                }
                for (l lVar : tVar.g()) {
                    if (lVar.c != null && lVar.c.b != null) {
                        lVar.d = lVar.c.b;
                        Logger.d(L, "clean, set last impression screenshot filename to ", lVar.c.b);
                    }
                }
                synchronized (NativeFinder.class) {
                    Q.remove(tVar.L);
                }
                b(tVar);
            }
        } catch (Throwable th) {
            Logger.e(L, "Error in clean ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t tVar, boolean z, String str) {
        long j;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        String str5;
        boolean z2;
        int i3 = 1;
        boolean z3 = !tVar.E;
        boolean z4 = !tVar.F && tVar.d();
        if (tVar.ae > 0 && tVar.af > 0) {
            j = tVar.ae - tVar.af;
        } else {
            j = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (tVar.k().isEmpty()) {
            Logger.d(L, "reporting event started, root=", str, ", isMature=", Boolean.valueOf(z), ", adInfo=", tVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            arrayList.add(a(tVar, tVar.i(), z, z4, j, (String) null));
            str2 = L;
            i = 2;
        } else {
            String str6 = L;
            for (l lVar : tVar.g()) {
                if (lVar.j() == null || lVar.j().X() != null) {
                    str3 = str6;
                } else {
                    Object[] objArr = new Object[i3];
                    objArr[0] = "reporting event - don't report CI as it was matched only by eventId and not by webview resources";
                    str3 = str6;
                    Logger.d(str3, objArr);
                    lVar.a((CreativeInfo) null);
                }
                if (!z || lVar.c == null || lVar.c.a == null) {
                    i2 = 2;
                    str4 = null;
                } else {
                    String str7 = lVar.c.a + "_" + lVar.a;
                    i2 = 2;
                    Logger.d(str3, "reporting event - imageFileIsValid filename = ", BrandSafetyUtils.a(tVar.p, lVar.c.a, tVar.c(), lVar.a, lVar.c.f));
                    str4 = str7;
                }
                float a2 = lVar.c != null ? lVar.c.a(500) : 0.0f;
                Object[] objArr2 = new Object[8];
                objArr2[0] = "reporting event started, root=";
                objArr2[1] = str;
                objArr2[i2] = ", isMature=";
                objArr2[3] = Boolean.valueOf(z);
                objArr2[4] = ", info=";
                objArr2[5] = tVar;
                objArr2[6] = ", uniformity=";
                objArr2[7] = Float.valueOf(a2);
                Logger.d(str3, objArr2);
                String str8 = str3;
                arrayList.add(a(tVar, lVar, z, z4, j, str4));
                if (!z || lVar.j() == null || lVar.c == null) {
                    str5 = str8;
                } else if (this.C.size() <= SafeDK.getInstance().J()) {
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = "reporting event waiting to report file ";
                    objArr3[1] = lVar.c.b;
                    str5 = str8;
                    Logger.d(str5, objArr3);
                    a(tVar, lVar);
                } else {
                    str5 = str8;
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = "reporting event no open slot for ";
                    objArr4[1] = this.c;
                    objArr4[i2] = ", ";
                    objArr4[3] = lVar.c.a;
                    Logger.d(str5, objArr4);
                    BrandSafetyUtils.d(lVar.c.b);
                }
                str6 = str5;
                i3 = 1;
            }
            str2 = str6;
            i = 2;
        }
        if (!z && tVar.U) {
            Object[] objArr5 = new Object[i];
            objArr5[0] = "reporting event - ad finished, should discard brand safety event: ";
            z2 = true;
            objArr5[1] = arrayList;
            Logger.w(str2, objArr5);
        } else {
            z2 = true;
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(arrayList);
            } else {
                Logger.w(str2, "reporting event - stats collector instance is null, cannot report brand safety event");
            }
        }
        if (z3) {
            tVar.c(z2);
        }
        if (z4) {
            tVar.d(z2);
        }
    }

    private static BrandSafetyEvent a(t tVar, l lVar, boolean z, boolean z2, long j, String str) {
        return new BrandSafetyEvent(tVar.c(), tVar.q(), str, z2, tVar.d() ? tVar.e() : null, lVar.j(), tVar.a(), tVar.p(), lVar.a != null ? lVar.a : "", tVar.D, z, tVar.r(), lVar.c != null ? lVar.c.f : null, lVar.c != null ? lVar.c.c : 0L, lVar.c != null ? lVar.c.a(500) : 0.0f, lVar.c != null ? lVar.c.e : 0, tVar.ad, tVar.ai, j, tVar.ag, tVar.ah, SafeDK.getInstance().e(), tVar.w(), tVar.M, tVar.N, tVar.P, tVar.Q, b(tVar, lVar).toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        Iterator<t> it = this.O.values().iterator();
        while (it.hasNext()) {
            it.next().Y = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(p pVar) {
        try {
            Logger.printFullVerboseLog(L, "set CI details started. matchingInfo = ", pVar.toString());
            CreativeInfo creativeInfo = pVar.a;
            if (creativeInfo != null) {
                Logger.d(L, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                Logger.d(L, "set CI details - starting to iterate over current activity ads");
                ArrayList<d> arrayList = new ArrayList();
                synchronized (this.O) {
                    arrayList.addAll(this.O.keySet());
                }
                for (d dVar : arrayList) {
                    if (a(creativeInfo, this.O.get(dVar))) {
                        Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                        if (a(dVar.a, dVar.e, pVar)) {
                            return true;
                        }
                    }
                }
                Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - adding as pending, view address: ", creativeInfo.ak(), " matching info: ", pVar);
                synchronized (this.P) {
                    this.P.put(creativeInfo.ak(), pVar);
                }
                return true;
            }
        } catch (Throwable th) {
            Logger.e(L, "set CI details exception: ", th.getMessage(), th);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, t tVar) {
        if (tVar == null || creativeInfo == null) {
            Logger.d(L, "verify matching - object is null, nativeInfo: ", tVar, ", creativeInfo: ", creativeInfo);
            return false;
        }
        String Q2 = creativeInfo.Q();
        if (tVar.v == null || !tVar.v.equals(Q2)) {
            Logger.d(L, "verify matching - sdks does not match, ci sdk is: ", Q2, " and native sdk is: ", tVar.v);
            return false;
        }
        Logger.d(L, "verify matching - ci sdk is: ", Q2, ", native info: ", tVar);
        if (tVar.L != null && creativeInfo.n() != null && !tVar.L.equals(creativeInfo.n())) {
            Logger.d(L, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", tVar.L);
            return false;
        }
        String ak = creativeInfo.ak();
        if (tVar.K != null && tVar.K.equals(ak)) {
            Logger.d(L, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", tVar.L, ", object address: ", ak, ", view address: ", tVar.K);
            return true;
        }
        Logger.d(L, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", tVar.L, ", matching object address: ", ak, ", ad info view address: ", tVar.K);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, p pVar) {
        Logger.printFullVerboseLog(L, Logger.FeatureTag.CI_MATCHING, "set CI started, adUnitId=", str, " matchingInfo=", pVar);
        if (pVar == null) {
            Logger.d(L, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = pVar.a;
        if (creativeInfo != null) {
            d dVar = new d(str, creativeInfo.F(), creativeInfo.n(), creativeInfo.Q(), str2, BrandSafetyUtils.AdType.NATIVE);
            Logger.d(L, "set CI - activity key: ", dVar);
            t tVar = this.O.get(dVar);
            synchronized (this.O) {
                Object[] objArr = new Object[4];
                objArr[0] = "set CI - current activity ad: ";
                objArr[1] = tVar == null ? AbstractJsonLexerKt.NULL : tVar;
                objArr[2] = ", current activity ad keys: ";
                objArr[3] = this.O.keySet();
                Logger.printFullVerboseLog(L, objArr);
            }
            if (tVar != null) {
                if (!tVar.X && StatsReporter.b().a(creativeInfo, tVar)) {
                    tVar.X = true;
                }
                CreativeInfo j = tVar.j();
                if (j != null) {
                    Logger.d(L, "set CI - previous CI id: ", j.L());
                    if (j.L().equals(creativeInfo.L())) {
                        AdNetworkDiscovery j2 = CreativeInfoManager.j(creativeInfo.Q());
                        if (j2 != null) {
                            j2.d(j);
                        }
                        Logger.printFullVerboseLog(L, "set CI - already matched, same ad ID. current match: ", creativeInfo.aa(), ", previous match: ", j.aa());
                    }
                }
                creativeInfo.a(pVar.b, pVar.c, pVar.d);
                tVar.a(creativeInfo);
                Logger.d(L, "set CI - CI is set for activity native ", dVar, ". CI : ", creativeInfo);
                b(tVar, creativeInfo);
                a(tVar, false, "setCreativeInfo");
                return true;
            }
            Logger.printFullVerboseLog(L, "set CI - no activity ad, cannot set CI. current activity ads: ", this.O);
        } else {
            Logger.d(L, "set CI - no CI");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z, String str4) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, n nVar, boolean z, boolean z2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, z zVar) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z, String str3) {
        return false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
    }

    private boolean a(int i) {
        boolean c = BrandSafetyUtils.c(i);
        Logger.d(L, "should stop sampling, max uniformed pixels count=", Integer.valueOf(i), ", return value=", Boolean.valueOf(c));
        return c;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Map<d, t> map = this.O;
        if (map != null) {
            for (t tVar : map.values()) {
                if (tVar.W) {
                    tVar.a(m.z, new m.a[0]);
                    a(tVar, false, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Map<d, t> map = this.O;
        if (map != null) {
            for (t tVar : map.values()) {
                if (tVar.W) {
                    tVar.a(m.A, new m.a[0]);
                    a(tVar, false, "onForeground");
                }
            }
        }
    }

    protected class a implements Runnable {
        t a;
        d b;
        int d;
        int c = 0;
        boolean e = false;

        public a(t tVar, d dVar, int i) {
            this.b = dVar;
            this.a = tVar;
            this.d = i;
        }

        private void a(View view) {
            if (view == null) {
                return;
            }
            Logger.d(NativeFinder.L, "handle native ad reflection - root= ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            AdNetworkDiscovery j = CreativeInfoManager.j(this.b.d);
            if (j != null) {
                View g = j.g(view);
                Logger.d(NativeFinder.L, "handle native ad reflection - native view= ", g);
                if (g != null) {
                    List<CreativeInfo> a = j.a(new WeakReference<>(g), this.a.M, BrandSafetyUtils.AdType.NATIVE);
                    Logger.d(NativeFinder.L, "handle native ad reflection - CIs generated: ", a);
                    if (a != null) {
                        for (CreativeInfo creativeInfo : a) {
                            creativeInfo.a((Object) view);
                            creativeInfo.a(NativeFinder.this.c);
                            creativeInfo.h(this.b.c);
                            creativeInfo.j(this.b.b);
                            Logger.d(NativeFinder.L, "handle native ad reflection - setting ci: ", creativeInfo.aa());
                            NativeFinder.this.a(this.b.a, this.b.e, new p(creativeInfo, CreativeInfo.y));
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference;
            try {
                this.c++;
                if (this.a != null) {
                    synchronized (NativeFinder.class) {
                        weakReference = (WeakReference) NativeFinder.Q.get(this.b.c);
                    }
                    if (weakReference != null && weakReference.get() != null) {
                        MaxNativeAdView maxNativeAdView = (MaxNativeAdView) weakReference.get();
                        if (CreativeInfoManager.a(this.b.d, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false) && !this.e) {
                            a(maxNativeAdView);
                            this.e = true;
                        }
                        if (maxNativeAdView.getWidth() > 0 && maxNativeAdView.getHeight() > 0) {
                            this.a.ag = maxNativeAdView.getWidth() / maxNativeAdView.getHeight();
                            Logger.d(NativeFinder.L, "native impression task - view size: ", Integer.valueOf(maxNativeAdView.getWidth()), "x", Integer.valueOf(maxNativeAdView.getHeight()), ", proportion: ", Float.valueOf(this.a.ag));
                        }
                        if (this.c < this.d && !this.a.Y) {
                            if (this.a.ab != null && this.a.ab.get() != null) {
                                a(this.a, (View) weakReference.get());
                                return;
                            }
                            return;
                        }
                        Logger.d(NativeFinder.L, "Going to report native ad, eventId=", this.a.L, ", stop timer? ", Boolean.valueOf(this.a.Y), ", image counter=", Integer.valueOf(this.c), ", max attempts=", Integer.valueOf(this.d), ", isImpressionReported=", Boolean.valueOf(this.a.E), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        if (!this.a.E) {
                            NativeFinder.this.a(this.a, false, "NativeImpressionTask");
                        }
                        this.a.aa.cancel(false);
                    }
                }
            } catch (Throwable th) {
                Logger.e(NativeFinder.L, "Error in NativeImpressionTask: ", th);
            }
        }

        private void a(final t tVar, final View view) {
            if (tVar != null && view != null) {
                try {
                    if (!com.safedk.android.utils.e.a((c) tVar)) {
                        Logger.d(NativeFinder.L, Logger.FeatureTag.AD_CAPTURE, "Taking screenshot, view=", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        tVar.ab.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Logger.d(NativeFinder.L, "Taking screenshot - using old method");
                                final Bitmap a = ScreenshotHelper.a(view, SafeDK.getInstance().aa(), tVar);
                                NativeFinder.this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        NativeFinder.this.a(tVar, a, a.this.c);
                                    }
                                });
                            }
                        });
                        return;
                    }
                } catch (Throwable th) {
                    Logger.e(NativeFinder.L, "Error while taking screenshot", th);
                    return;
                }
            }
            Logger.d(NativeFinder.L, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", tVar, ", low memory");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    t tVar = (t) cVar;
                    NativeFinder.this.a(tVar, bitmap, tVar.ac.c);
                } catch (Throwable th) {
                    Logger.d(NativeFinder.L, "handleScreenshotCompleted exception : ", th.getMessage(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t tVar, Bitmap bitmap, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        if (bitmap != null) {
            Logger.d(L, "process screenshot - currentActivityAd  = ", tVar);
            String c = tVar.c();
            BrandSafetyUtils.a b = BrandSafetyUtils.b(c, bitmap);
            int a2 = b.a();
            BrandSafetyUtils.ScreenshotValidity c2 = BrandSafetyUtils.c(c, b);
            if (c2 == BrandSafetyUtils.ScreenshotValidity.VALID) {
                Logger.d(L, "process screenshot - VALID ");
                String a3 = BrandSafetyUtils.a(bitmap);
                BrandSafetyUtils.ScreenShotOrientation b2 = BrandSafetyUtils.b(bitmap);
                l i4 = tVar.i();
                String a4 = BrandSafetyUtils.a(bitmap, this.c, a3, c, i4.a, b2);
                Logger.d(L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot file created, filename = ", a4, ", hash = ", a3);
                long c3 = BrandSafetyUtils.c(a4);
                Logger.d(L, "process screenshot - hash ", a3, ", stored file size is ", Long.valueOf(c3), " bytes, counter is ", Integer.valueOf(i), ", uniform pixel count is ", Integer.valueOf(a2), " (", Float.valueOf((a2 / 500.0f) * 100.0f), "%)");
                int size = this.C.size();
                if (!d(a3, i4.a)) {
                    if (size <= SafeDK.getInstance().J()) {
                        if (i4.c != null && i4.c.a != null && !i4.c.a.equals(a3)) {
                            Logger.d(L, "process screenshot - removing ad file ", i4.c.b);
                            BrandSafetyUtils.d(i4.c.b);
                        }
                        i4.b(m.t, new m.a(m.K, m.X));
                        Logger.d(L, "process screenshot - setting data hash = ", a3, ", file name = ", a4, ", file size = ", Long.valueOf(c3));
                        str = a3;
                        str2 = m.K;
                        i4.c = new k(str, a4, c3, a2, i, b2, false);
                        a(tVar, false, "processScreenshot");
                        i2 = a2;
                        str3 = "processScreenshot";
                    } else {
                        str = a3;
                        str2 = m.K;
                        str3 = "processScreenshot";
                        i2 = a2;
                        if (!c(str, i4.a)) {
                            Logger.d(L, "process screenshot - No open slot for ", str, "_", i4.a, ", # : ", Integer.valueOf(this.C.size()));
                            BrandSafetyUtils.d(a4);
                        } else {
                            Logger.d(L, "process screenshot - Image ", str, "_", i4.a, " is already scheduled for upload");
                        }
                    }
                } else {
                    str = a3;
                    str2 = m.K;
                    str3 = "processScreenshot";
                    i2 = a2;
                    Logger.d(L, "process screenshot - not saving file for ", str, "_", i4.a);
                    BrandSafetyUtils.d(a4);
                }
                if (a(i2)) {
                    if (TextUtils.isEmpty(str)) {
                        i3 = 1;
                    } else {
                        i3 = 1;
                        tVar.e(true);
                        tVar.Y = true;
                    }
                    m.a[] aVarArr = new m.a[i3];
                    aVarArr[0] = new m.a(str2, m.Y);
                    i4.a(m.t, aVarArr);
                    a(tVar, false, str3);
                    return;
                }
                return;
            }
            Logger.d(L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot is not valid: ", c2.name(), ", pixel count: ", Integer.valueOf(a2), ", counter = ", Integer.valueOf(i), ", try again...");
        }
    }

    public static String b(MaxNativeAdView maxNativeAdView) {
        String str;
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            str = S.get(a2);
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void b() {
        for (t tVar : this.O.values()) {
            if (tVar.W) {
                tVar.a(m.D, new m.a[0]);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c() {
        for (t tVar : this.O.values()) {
            if (tVar.W) {
                tVar.a(m.E, new m.a[0]);
            }
        }
    }

    public int f() {
        Iterator<t> it = this.O.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().W) {
                i++;
            }
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        synchronized (this.O) {
            for (t tVar : this.O.values()) {
                if (tVar != null && tVar.W && tVar.c() != null && tVar.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
