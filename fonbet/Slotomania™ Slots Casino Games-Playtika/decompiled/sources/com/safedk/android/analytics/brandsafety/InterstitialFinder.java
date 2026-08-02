package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes6.dex */
public class InterstitialFinder extends com.safedk.android.analytics.brandsafety.b {
    private static final String J = "InterstitialFinder";
    private static final long K = 500;
    private static final long L = 1000;
    private static final int M = 2;
    private static final int N = 3;
    public final InterstitialInfoCollection I;
    private final Map<String, List<p>> O;
    private final FullScreenActivitiesCollection P;
    private boolean Q;
    private String R;
    private final Object S;
    private final Set<String> T;

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        List<o> a2 = this.I.a(str);
        return a2 != null && a2.size() > 0;
    }

    public InterstitialFinder() {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, Arrays.asList(BrandSafetyUtils.j, BrandSafetyUtils.k, BrandSafetyUtils.l), J, 120);
        this.I = new InterstitialInfoCollection();
        this.O = new HashMap();
        this.P = new FullScreenActivitiesCollection();
        this.Q = false;
        this.S = new Object();
        this.T = new HashSet(Arrays.asList(CreativeInfo.j, CreativeInfo.i));
        this.H = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new o(str, str2, str3, screenShotOrientation, str4, str5);
    }

    public void m(String str) {
        for (o oVar : this.I.a(str)) {
            CreativeInfo j = oVar.j();
            if (j != null) {
                if (j.x()) {
                    Logger.d(J, "set on endcard displayed - setting ci endcard detected. ci= ", j.aa());
                    oVar.i().s = true;
                    oVar.at = true;
                } else if (j.H() != null || oVar.i().l) {
                    Logger.d(J, "set on endcard displayed - ci is video ad, setting video complete. ci= ", j.aa());
                    oVar.i().s = true;
                    a(oVar, true, "endcard");
                }
            }
        }
    }

    public void n(String str) {
        for (o oVar : this.I.a(str)) {
            if (oVar.i() != null && oVar.i().c()) {
                oVar.i().t = true;
            }
        }
    }

    public void o(String str) {
        for (o oVar : this.I.a(str)) {
            if (oVar.i() != null && oVar.i().d()) {
                oVar.i().u = true;
                a((c) oVar);
            }
        }
    }

    public void f(String str, String str2) {
        List<o> a2;
        Logger.d(J, "on video completed - sdk = ", str, ", originatedBy = ", str2);
        if (str != null && (a2 = this.I.a(str)) != null && !a2.isEmpty()) {
            Iterator<o> it = a2.iterator();
            if (it.hasNext()) {
                o next = it.next();
                Logger.d(J, "on video completed - sdk = ", str, ", found interstitialInfo by sdkPackage : ", next);
                a(next, true, str2);
                return;
            }
        }
        ArrayList<o> arrayList = new ArrayList();
        synchronized (this.I) {
            for (o oVar : this.I.values()) {
                if (oVar != null && oVar.v.equals(str)) {
                    arrayList.add(oVar);
                }
            }
        }
        for (o oVar2 : arrayList) {
            Logger.d(J, "on video completed - sdk = ", str, ", found interstitialInfo by eventId : ", oVar2);
            a(oVar2, true, str2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z, String str3) {
        o a2;
        Logger.d(J, "on video completed triggered started - for view address  : ", str2, ", sdkPackageName : ", str, ", completed: ", Boolean.valueOf(z));
        if (str2 != null && (a2 = this.I.a(str2, !z)) != null) {
            a(a2, z, str3);
            l i = a2.i();
            if (i != null) {
                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "on interstitial video event triggered - setting impression as video ad.");
                i.l = true;
            }
            return true;
        }
        for (o oVar : this.I.a(str)) {
            Logger.d(J, "on video completed triggered - sdkPackageName : ", str, ", view address: ", str2, ", completed: ", Boolean.valueOf(z));
            a(oVar, z, str3);
        }
        return !r6.isEmpty();
    }

    private void a(o oVar, boolean z, String str) {
        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "set on video completed started, eventId: ", oVar.L, ", completed = ", Boolean.valueOf(z));
        synchronized (oVar.au) {
            l i = oVar.i();
            if (i != null) {
                if (!i.k && z) {
                    if (i.l) {
                        a((c) oVar);
                    } else {
                        i.l = true;
                    }
                    Logger.d(J, "set on video completed started, onVideoCompletedEventHasBeenTriggered set to true ");
                    oVar.e(str);
                } else if (!z) {
                    a((c) oVar);
                    if (!i.l || i.k) {
                        oVar.b(m.o, new m.a(m.P, str));
                    }
                    if (!i.l) {
                        i.l = true;
                        Logger.d(J, "set on video completed - impression is set to be a video impression");
                    }
                    Logger.d(J, "set on video completed - eovEventTriggered set to false");
                    i.k = false;
                    oVar.ab = false;
                    oVar.an = false;
                }
            }
        }
    }

    public void a(String str, String str2, boolean z) {
        if (str2 != null && this.I.a(str2, false) != null) {
            a(this.I.a(str2, false), z);
            return;
        }
        List<o> a2 = this.I.a(str);
        if (a2 != null) {
            Iterator<o> it = a2.iterator();
            while (it.hasNext()) {
                a(it.next(), z);
            }
        }
    }

    public void a(o oVar, boolean z) {
        if (oVar == null || oVar.af) {
            Logger.d(J, "stop taking screenshots for impression. info is null or already handled");
            return;
        }
        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots for impression. starting. address = ", oVar.K);
        if (z || this.Q) {
            oVar.af = true;
            a(oVar.i());
            Logger.d(J, "stop taking screenshots for impression. attempting to clear image hash and files");
            k m = oVar.m();
            if (m != null && m.b != null) {
                a(oVar, m);
            } else {
                Logger.d(J, "stop taking screenshots for impression. no active ci or no image taken.");
            }
            c(oVar, "stopTakingScreenshotsForImpression");
            return;
        }
        Logger.d(J, "stop taking screenshots for impression. no max ad is active. ignoring");
    }

    private void a(o oVar, k kVar) {
        Logger.d(J, "remove file and report event, file: ", kVar.b);
        BrandSafetyUtils.d(kVar.b);
        kVar.a = null;
        kVar.b = null;
        BrandSafetyUtils.d(oVar.b());
        kVar.c = 0L;
        oVar.s = null;
        kVar.d = 0;
        c(oVar, "removeFileAndReportEvent");
    }

    private void a(o oVar, String str, ViewGroup viewGroup, List<WeakReference<WebView>> list, List<String> list2, List<String> list3, int i) {
        String str2;
        int i2;
        char c;
        String str3;
        char c2 = 1;
        int i3 = i + 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i4);
            list2.add(BrandSafetyUtils.a(childAt));
            StringBuilder sb = new StringBuilder();
            sb.append("h");
            sb.append(i3);
            sb.append("c");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append(":");
            sb.append(childAt);
            list3.add(sb.toString());
            if (childAt instanceof WebView) {
                list.add(new WeakReference<>((WebView) childAt));
                Object[] objArr = new Object[4];
                objArr[c3] = "find WebViews in view group - found view: ";
                objArr[c2] = childAt;
                objArr[2] = " , parent: ";
                objArr[3] = childAt.getParent() != null ? childAt.getParent().toString() : AbstractJsonLexerKt.NULL;
                Logger.d(J, objArr);
                str2 = J;
                i2 = i5;
                c = 4;
            } else if (!(childAt instanceof ViewGroup)) {
                str2 = J;
                i2 = i5;
                c = 4;
            } else {
                str2 = J;
                c = 4;
                i2 = i5;
                a(oVar, str, (ViewGroup) childAt, list, list2, list3, i3);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(str);
            if (j != null) {
                if (!a(str, childAt) || oVar.m == null) {
                    str3 = str2;
                } else if (oVar.j() != null) {
                    str3 = str2;
                } else {
                    String a2 = j.a(childAt, BrandSafetyUtils.AdType.INTERSTITIAL);
                    if (a2 == null) {
                        str3 = str2;
                    } else {
                        CreativeInfo a3 = j.a((Object) a2);
                        if (a3 == null) {
                            str3 = str2;
                        } else {
                            List<CreativeInfo> t = j.t(a3.L());
                            Logger.FeatureTag featureTag = Logger.FeatureTag.CI_MATCHING;
                            Object[] objArr2 = new Object[6];
                            objArr2[c3] = "find WebViews in view group - found CI for adId ";
                            objArr2[c2] = a2;
                            int i6 = 2;
                            objArr2[2] = ", size : ";
                            objArr2[3] = Integer.valueOf(t.size());
                            objArr2[c] = " : ";
                            objArr2[5] = t;
                            str3 = str2;
                            Logger.d(str3, featureTag, objArr2);
                            for (CreativeInfo creativeInfo : t) {
                                creativeInfo.a((Object) childAt);
                                if (oVar.A != null) {
                                    BrandSafetyEvent.AdFormatType a4 = BrandSafetyUtils.a(oVar.A);
                                    Object[] objArr3 = new Object[i6];
                                    objArr3[c3] = "find WebViews in view group - setting ad format type to ";
                                    objArr3[1] = a4;
                                    Logger.d(str3, objArr3);
                                    creativeInfo.a(a4);
                                    oVar.d("ad_type_upd(fndWVUndrVGroup):" + a4);
                                }
                                a(new p(creativeInfo, CreativeInfo.n, a3.Y(), BrandSafetyUtils.a(childAt)));
                                i6 = 2;
                                c3 = 0;
                            }
                        }
                    }
                }
                if (!oVar.W && j.a(childAt)) {
                    Logger.d(str3, Logger.FeatureTag.AD_CAPTURE, "find WebViews in view group - native player identified : ", childAt);
                    oVar.i().l = true;
                    oVar.b(m.o, new m.a(m.P, "native"));
                }
                oVar.W = oVar.W || j.a(childAt);
            }
            i4 = i2;
            c2 = 1;
            c3 = 0;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String str;
        String str2;
        o d;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.b.contains(messageData.getString("ad_format"))) {
            Logger.d(J, "Revenue event detected : ", messageData);
            string = "revenue_event";
        } else {
            string = messageData.getString("type");
        }
        String string2 = messageData.getString("ad_format");
        String string3 = messageData.getString(BrandSafetyEvent.k);
        String string4 = messageData.getString(BrandSafetyEvent.ad);
        String string5 = messageData.getString("dsp_name");
        String c = CreativeInfoManager.c(string4);
        long b2 = com.safedk.android.utils.n.b(System.currentTimeMillis());
        if (!messageData.containsKey("creative_id")) {
            str = null;
        } else {
            str = messageData.getString("creative_id");
        }
        String str3 = str;
        com.safedk.android.analytics.events.a aVar = new com.safedk.android.analytics.events.a(string, b2, string2, string4, str3, string5);
        q.a().a(aVar);
        boolean contains = this.b.contains(string2);
        String a2 = CreativeInfoManager.a(c, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        if (contains) {
            str2 = string4;
            if (str2 != null && str2.equals(a2)) {
                Logger.d(J, "full screen type but ad network not supported (", a2, ")");
                return;
            }
        } else {
            str2 = string4;
        }
        String string6 = messageData.getString("id", null);
        if (string6 == null) {
            Logger.d(J, "No eventId in data bundle.");
        }
        if (!contains) {
            return;
        }
        Logger.d(J, "Max message received, package: ", c, ", ts (seconds): ", Long.valueOf(b2), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (!"WILL_DISPLAY".equals(string)) {
            if ("revenue_event".equals(string)) {
                Logger.d(J, "REVENUE_EVENT event for package: ", c, " placement: ", string3, " ad type: ", string2, ", event id: ", string6);
                a(string6, m.k, new m.a(m.K, messageData.getString("revenue_event")));
                a(string6, messageData);
                return;
            }
            if ("DID_CLICKED".equals(string)) {
                o d2 = this.I.d(string6);
                if (d2 != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "DID_CLICKED event for package: ";
                    objArr[1] = c == null ? str2 : c;
                    Logger.d(J, objArr);
                    a(string6, m.h, new m.a[0]);
                    b(d2);
                    if (!TextUtils.isEmpty(d2.e())) {
                        c(d2, "onMessageReceived");
                        return;
                    }
                    return;
                }
                return;
            }
            if ("WILL_LOAD".equals(string)) {
                if (c != null) {
                    Logger.d(J, "WILL_LOAD event for package: ", c, " placement: ", string3);
                    a(string6, m.d, new m.a(m.N, str2));
                    CreativeInfoManager.a(c, string3, str3, (String) null, string2);
                    return;
                }
                return;
            }
            if ("DID_HIDE".equals(string)) {
                if (c != null) {
                    BrandSafetyUtils.p(c);
                    Logger.d(J, "DID_HIDE event for package: ", c, " placement: ", string3, ", event id: ", string6);
                    o d3 = this.I.d(string6);
                    if (d3 != null) {
                        a(string6, m.i, new m.a[0]);
                        a(d3, (String) null);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DID_LOAD".equals(string)) {
                if (c != null) {
                    Logger.d(J, "DID_LOAD event for package: ", c, " placement: ", string3);
                    a(string6, m.e, new m.a(m.N, str2));
                    return;
                }
                return;
            }
            if ("DID_DISPLAY".equals(string)) {
                if (c != null) {
                    Logger.d(J, "DID_DISPLAY event for package: ", c, " placement: ", string3);
                    a(string6, m.g, new m.a[0]);
                    if (str3 != null && (d = this.I.d(string6)) != null) {
                        if (d.A != null && d.A.containsKey("id") && d.A.getString("id") != null && d.A.getString("id").equals(string6)) {
                            Logger.d(J, "setting Max creative id to: ", str3, " for event id: ", string6);
                            d.M = str3;
                            return;
                        } else {
                            Logger.d(J, "cannot update Max creative id. event id check failed.");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if ("DID_FAIL_DISPLAY".equals(string)) {
                Logger.d(J, "DID_FAIL_DISPLAY event for package: ", c, " placement: ", string3);
                a(string6, m.j, new m.a[0]);
                h(c, string6);
                return;
            }
            return;
        }
        Logger.d(J, "Number of InterstitialInfo objects : ", Integer.valueOf(this.I.size()));
        Logger.d(J, "adInfoCollectionForUpload count: ", Integer.valueOf(this.C.size()));
        j();
        this.d++;
        if (c != null) {
            q.a().b(aVar);
            this.Q = true;
            a(string6, m.f, new m.a[0]);
            BrandSafetyUtils.o(c);
            a(c, new AtomicReference<>(messageData));
            CreativeInfoManager.a(c, string3, str3, (String) null, string2);
            a aVar2 = new a(string3, string6);
            Logger.d(J, "WILL_DISPLAY event for package: ", c, " placement: ", string3, " ad type: ", string2, ", event id: ", string6);
            a(c, aVar2);
        }
    }

    private void h(String str, String str2) {
        List<p> remove;
        o d = this.I.d(str2);
        if (d != null) {
            d.N = true;
            if (d.B == null && StatsCollector.c() != null) {
                Logger.d(J, "DID_FAIL_DISPLAY received for an impression that was not displayed, removing event from repository. impression id: ", d.i().a);
                StatsCollector.c().a(d.n());
                if (CreativeInfoManager.a(str, AdNetworkConfiguration.CLEAR_FULLSCREEN_PENDING_CANDIDATES_ON_DID_FAIL_DISPLAY, false) && (remove = this.O.remove(str)) != null) {
                    synchronized (remove) {
                        Iterator<p> it = remove.iterator();
                        while (it.hasNext()) {
                            Logger.d(J, "DID_FAIL_DISPLAY event, removed pending CI: ", it.next().a);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        ArrayList<o> arrayList = new ArrayList();
        synchronized (this.I) {
            for (o oVar : this.I.values()) {
                if (oVar.N && oVar.B == null) {
                    arrayList.add(oVar);
                }
            }
        }
        for (o oVar2 : arrayList) {
            Logger.d(J, "report previous failed impression, event ID: ", oVar2.L);
            c(oVar2, "reportPreviousFailedImpressions");
            b((c) oVar2);
            a(oVar2.L);
            w(oVar2.L);
        }
    }

    private void a(String str, a aVar) {
        Logger.d(J, "match CI started, sdk = ", str, ", interstitial key = ", aVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (aVar.b != null) {
            Logger.d(J, "match CI - interstitial key: ", aVar);
            AdNetworkDiscovery j = CreativeInfoManager.j(str);
            if (j != null && j.d() != null && j.d().a(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false)) {
                Logger.d(J, "match CI - discovery configuration: ", j.d());
                String str2 = aVar.a + "_" + aVar.b + "_" + str;
                CreativeInfo a2 = j.a((Object) str2);
                if (a2 != null) {
                    Logger.d(J, Logger.FeatureTag.CI_MATCHING, "match CI - discovery class returned a ci: ", a2.aa());
                    if (a2.n() == null) {
                        a2.h(aVar.b);
                    }
                    a2.a(BrandSafetyEvent.AdFormatType.INTER);
                    a2.u("ad_type_upd(matchCI):" + BrandSafetyEvent.AdFormatType.INTER);
                    a(new p(a2, CreativeInfo.n, null, str2));
                    return;
                }
                Logger.d(J, "match CI - ci not found");
                return;
            }
            Logger.d(J, "match CI - sdk not configured to allow max events based matching");
        }
    }

    public void a(String str, AtomicReference<Bundle> atomicReference) {
        if (atomicReference != null && atomicReference.get() != null) {
            Logger.d(J, "start ad monitoring - slot = ", Integer.valueOf(this.d), ", max package name = ", str, ", AppLovin data bundle is ", atomicReference.get(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (CreativeInfoManager.j(str) != null) {
                o oVar = new o(str, this.d, atomicReference.get());
                oVar.L = atomicReference.get().getString("id");
                synchronized (this.I) {
                    this.I.put(oVar.L, oVar);
                }
                Logger.d(J, "start ad monitoring - new interstitial info created : ", oVar);
                c(oVar);
                return;
            }
            Logger.d(J, "start ad monitoring - slot = ", Integer.valueOf(this.d), ", max package name = ", str, ", ad network is not supported");
        }
    }

    public void c(final Activity activity) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.d(InterstitialFinder.J, "start ad monitoring - activity : ", activity, ", current interstitial infos :", InterstitialFinder.this.I.toString());
                    if (activity == null) {
                        return;
                    }
                    if (!InterstitialFinder.this.I.c(activity.toString())) {
                        synchronized (InterstitialFinder.this.P) {
                            InterstitialFinder.this.P.put(activity.toString(), new WeakReference<>(activity));
                        }
                        if (!InterstitialFinder.this.Q) {
                            InterstitialFinder.this.Q = true;
                        }
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity added : ", activity.toString());
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity null or already registered.");
                    }
                    if (InterstitialFinder.this.t(activity.toString())) {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - sdk: ", InterstitialFinder.this.I.b(), ", activity ", activity, " started but this is not the start of impression. not starting ad monitoring");
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring calling 'start', activity is ", activity);
                        InterstitialFinder.this.f(activity);
                    }
                } catch (Exception e) {
                    Logger.d(InterstitialFinder.J, "start ad monitoring failed: ", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(String str) {
        o b2 = this.I.b(str);
        if (str != null && b2 != null && b2.c() != null) {
            Logger.d(J, "instances of same activity - current activity class name = ", b2.p(), ",  current activity address = ", b2.o());
            AdNetworkDiscovery j = CreativeInfoManager.j(b2.c());
            if (j != null && j.d() != null && j.d().a(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false)) {
                Logger.d(J, "instances of same activity - discovery configuration = ", j.d());
                String str2 = b2.p() + "@" + b2.o();
                Logger.d(J, "instances of same activity - current activity = ", str2);
                if (!str.equals(str2)) {
                    Logger.d(J, "instances of same activity - activityClass ", str2, " is a different instance of the same activity");
                    return true;
                }
            }
        }
        return false;
    }

    private void b(o oVar) {
        Logger.d(J, "handle DID_CLICKED started ", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (oVar == null) {
            Logger.d(J, "current activity interstitial is null");
            return;
        }
        oVar.a(true);
        Logger.d(J, "current activity interstitial setIsClicked true");
        if (oVar.e() != null) {
            Logger.d(J, "current activity interstitial already have click url");
            return;
        }
        if (oVar.aj == null) {
            Logger.d(J, "current activity interstitial doesn't have click url candidate");
            return;
        }
        if (oVar.aj.a == 0) {
            Logger.d(J, "current click url candidate has zero timestamp");
            return;
        }
        Logger.d(J, "handle DID_CLICKED checking click url candidate");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - oVar.aj.a < SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) {
            Logger.d(J, "handle DID_CLICKED setting click url");
            Logger.d(J, "handle DID_CLICKED setting click url returned ", Boolean.valueOf(oVar.c(oVar.aj.b)));
        } else {
            Logger.d(J, "handle DID_CLICKED click url candidate's timestamp is not within the time range, currentTime :", Long.valueOf(currentTimeMillis), " , currentClickUrlCandidate.ts : ", Long.valueOf(oVar.aj.a), " , diff : ", Long.valueOf(currentTimeMillis - oVar.aj.a));
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.a;
    }

    public o d(Activity activity) {
        if (activity == null) {
            Logger.d(J, "get activity interstitial by activity, activity is null");
            return null;
        }
        return this.I.b(activity.toString());
    }

    public o p(String str) {
        return this.I.d(str);
    }

    public o f() {
        synchronized (this.I) {
            for (o oVar : this.I.values()) {
                if (oVar != null && !oVar.U) {
                    return oVar;
                }
            }
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public c l(String str) {
        return p(str);
    }

    public o q(String str) {
        return this.I.a(str, true);
    }

    public o r(String str) {
        if (str == null) {
            Logger.d(J, "get activity interstitial by package, package is null");
            return null;
        }
        List<o> a2 = this.I.a(str);
        if (a2.size() == 1) {
            Logger.d(J, "get activity interstitial by package, ci found : ", a2.get(0));
            return a2.get(0);
        }
        Logger.d(J, "there are ", Integer.valueOf(a2.size()), " interstitial infos, exiting");
        return null;
    }

    private void c(o oVar) {
        WeakReference<Activity> b2;
        if (oVar == null) {
            return;
        }
        Activity activity = null;
        FullScreenActivitiesCollection fullScreenActivitiesCollection = this.P;
        if (fullScreenActivitiesCollection != null && (b2 = fullScreenActivitiesCollection.b(oVar.v)) != null && b2.get() != null) {
            activity = b2.get();
            Logger.d(J, "start - activity set to ", activity);
        }
        a(oVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        if (activity == null) {
            return;
        }
        String b2 = BrandSafetyUtils.b(activity.getClass());
        Logger.d(J, "start - activity name = ", activity, ", sdk = ", b2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        o b3 = this.I.b(BrandSafetyUtils.a((Object) activity));
        Logger.d(J, "start - attempt to find by activity address, currentActivityInterstitial = ", b3);
        if (b3 == null) {
            Iterator<o> it = this.I.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o next = it.next();
                Logger.d(J, "start - activity : ", activity, ", activitySdk : ", b2, ", InterstitialInfo sdk : ", next.v);
                if (b2 != null && b2.equals(next.v)) {
                    b3 = next;
                    break;
                }
            }
        }
        if (b3 == null) {
            Iterator<o> it2 = this.I.c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                o next2 = it2.next();
                if (com.safedk.android.utils.h.h.equals(b2) && B.contains(next2.v)) {
                    Logger.d(J, "start - activity SDK is not compatible with interstitial SDK, may be scar-admob");
                    b3 = next2;
                    break;
                }
            }
        }
        if (b3 != null) {
            a(b3, activity);
        } else {
            Logger.d(J, "start - failed to find interstitial info for activity : ", activity);
        }
    }

    private void a(o oVar, Activity activity) {
        String str;
        String str2;
        String str3;
        if (oVar == null) {
            return;
        }
        Set<String> set = null;
        if (activity == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str = BrandSafetyUtils.a(activity.toString(), true);
            str2 = BrandSafetyUtils.a(activity.toString(), false);
            str3 = BrandSafetyUtils.b(activity.getClass());
        }
        Logger.d(J, "start - activity address: ", str, ", interstitial info activity address: ", oVar.B);
        if (str != null && str.equals(oVar.B)) {
            boolean a2 = CreativeInfoManager.a(str3, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            k m = oVar.m();
            if (!a2 && m != null && !TextUtils.isEmpty(m.a) && a(m.d, m.c)) {
                Logger.d(J, "start - Not starting timer on activity ", oVar.ad, " -- impression already logged");
                return;
            } else {
                Logger.d(J, "start - Starting counter from previous value ", Integer.valueOf(oVar.s()));
                oVar.I();
            }
        } else {
            Logger.d(J, "start - activity class: ", str2, ", interstitial info activity address: ", oVar.C);
            if (str2 != null && str2.equals(oVar.C)) {
                Logger.d(J, "start - current activity interstitial class name = ", oVar.C, ", activity class name = ", str2);
            } else {
                set = oVar.X;
                if (set.contains(str)) {
                    Logger.d(J, "start - Ignoring restart of suspected mediation ", oVar.ad);
                    return;
                } else if (oVar.B != null) {
                    set.add(oVar.B);
                }
            }
            List<p> arrayList = new ArrayList<>();
            Logger.d(J, "interstitial finder start - current activity interstitial is ", oVar);
            if (!oVar.E && !oVar.k().isEmpty()) {
                Logger.d(J, "interstitial finder start - current activity interstitial != null : ", oVar);
                List<CreativeInfo> k = oVar.k();
                if (!k.isEmpty()) {
                    for (CreativeInfo creativeInfo : k) {
                        if (creativeInfo != null) {
                            Logger.d(J, "interstitial finder start - setting current activity interstitials CI: ", creativeInfo);
                            arrayList.add(new p(creativeInfo, creativeInfo.X(), creativeInfo.Y(), creativeInfo.W()));
                        } else {
                            Logger.d(J, "interstitial finder start - current CI matching method not equal, current CI: ", creativeInfo);
                        }
                    }
                } else {
                    Logger.d(J, "interstitial finder start - current CI is null");
                }
                Logger.d(J, "interstitial finder start - current activity interstitial impression reported? ", Boolean.valueOf(oVar.E));
                a(oVar, true);
            }
            if (activity != null) {
                oVar.ae = SystemClock.elapsedRealtime();
                a(activity, oVar);
                b(oVar, activity);
            }
            if (oVar.v != null) {
                Logger.d(J, "start - current Max package name: ", oVar.v);
                if (!CreativeInfoManager.a(oVar.v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false) && activity != null) {
                    if (!BrandSafetyUtils.d(activity.getClass())) {
                        Logger.d(J, "start - current foreground activity is not a supported ad activity");
                        return;
                    }
                    Logger.d(J, "start - checking pending ci for no activity sdk ", oVar.v);
                    arrayList = a(oVar.v, oVar);
                    for (p pVar : arrayList) {
                        Logger.d(J, "start - found pending ci(s) for no activity sdk, mi : ", pVar);
                        b(pVar, oVar);
                    }
                }
            }
            oVar.L();
            Logger.d(J, "start - no CI so adding the noCIDebug to CIDebugInfo");
            if (oVar.aq != null && oVar.aq.get() != null) {
                g(oVar);
                if (arrayList.isEmpty()) {
                    arrayList = a(str3, oVar);
                }
                oVar.aa = 0L;
            }
            if (CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                oVar.ae = SystemClock.elapsedRealtime();
                Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. sdk = ", oVar.c());
                arrayList = a(oVar.c(), oVar);
                Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. found ", Integer.valueOf(arrayList.size()), " items");
            }
            for (p pVar2 : arrayList) {
                if (pVar2 != null && pVar2.a != null) {
                    b(pVar2, oVar);
                }
            }
            if (set != null) {
                oVar.X = set;
            }
        }
        Logger.d(J, "start - before timer, time interstitial info event id is: ", oVar.L);
        synchronized (oVar.av) {
            if (d(oVar)) {
                Logger.d(J, "start - starting timer for interstitial info with eventId ", oVar.L);
                oVar.al = this.E.scheduleWithFixedDelay(new b(oVar.L, oVar.v), 500L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private boolean d(o oVar) {
        ScheduledFuture<?> scheduledFuture = oVar != null ? oVar.al : null;
        Object[] objArr = new Object[4];
        objArr[0] = "should start timer started, task future = ";
        objArr[1] = scheduledFuture;
        objArr[2] = ", is cancelled = ";
        objArr[3] = scheduledFuture != null ? Boolean.valueOf(scheduledFuture.isCancelled()) : null;
        Logger.d(J, objArr);
        if (oVar != null && oVar.aq != null) {
            Logger.d(J, "should start timer - inter activity is: ", oVar.aq.get());
            Logger.d(J, "should start timer - inter activity CI is: ", oVar.j());
        }
        boolean z = oVar != null && (scheduledFuture == null || scheduledFuture.isCancelled()) && !((oVar.aq == null || oVar.aq.get() == null) && (oVar.j() == null || oVar.j().f() == null));
        Logger.d(J, "should start timer returned: ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, o oVar) {
        if (activity != null) {
            String[] strArr = {BrandSafetyUtils.a(activity.toString(), false), BrandSafetyUtils.a(activity.toString(), true)};
            String obj = activity.toString();
            oVar.ad = obj;
            oVar.aq = new WeakReference<>(activity);
            oVar.a(strArr);
            synchronized (this.P) {
                this.P.remove((Object) activity.toString());
            }
            Logger.d(J, "interstitial info activity details set : ", activity.getClass(), ", sdk = ", oVar.v, ", activity name = ", obj, ", activities = ", this.P.a(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            return;
        }
        Logger.d(J, "cannot set interstitial info activity details, activity is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<p> a(String str, o oVar) {
        ArrayList arrayList = new ArrayList();
        List<p> list = this.O.get(str);
        Object[] objArr = new Object[4];
        objArr[0] = "pending ci check, number of pending CIs: ";
        objArr[1] = Integer.valueOf(list != null ? list.size() : 0);
        objArr[2] = ", isOnUiThread = ";
        objArr[3] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.printFullVerboseLog(J, objArr);
        Logger.d(J, "pending ci check, pending object addresses are: ", a(list));
        if (list != null) {
            synchronized (list) {
                Iterator<p> it = list.iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    Logger.d(J, "pending ci check, matching method: ", next.b, ", ci: ", next.a.aa());
                    if (a(next.a, oVar) && next.a != null) {
                        oVar.d("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + next.b + "|o=" + next.a.aj() + ";" + next.a.ak());
                        it.remove();
                        Logger.d(J, "pending ci check, creative info is the pending creative info: ", next);
                        arrayList.add(next);
                    }
                }
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(str);
            if (j != null && j.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                list.clear();
            }
        }
        return arrayList;
    }

    private boolean a(CreativeInfo creativeInfo, o oVar) {
        if (creativeInfo == null || oVar == null) {
            return false;
        }
        Logger.d(J, "verify matching - current activity interstitial: ", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (oVar.L != null && !TextUtils.isEmpty(creativeInfo.n()) && !oVar.L.equals(creativeInfo.n())) {
            Logger.d(J, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", oVar.L);
            if (!CreativeInfoManager.a(oVar.v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("cim-iei=" + creativeInfo.n());
        }
        AdNetworkDiscovery j = CreativeInfoManager.j(creativeInfo.R() == null ? creativeInfo.Q() : creativeInfo.R());
        if (j != null) {
            if (j.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                if (oVar.r() != null) {
                    String string = oVar.r().getString(BrandSafetyEvent.k);
                    String string2 = oVar.r().getString("ad_format");
                    if (creativeInfo.F() == null || (string != null && string.equals(creativeInfo.F()))) {
                        Logger.d(J, Logger.FeatureTag.CI_MATCHING, "verify matching DIRECT_CREATIVE_INFO, CI placement: ", creativeInfo.F(), ", CI format: ", creativeInfo.I());
                        return true;
                    }
                    Logger.d(J, Logger.FeatureTag.CI_MATCHING, "verify matching DIRECT_CREATIVE_INFO, verification failed for CI placement: ", creativeInfo.F(), ", CI format: ", creativeInfo.I());
                    oVar.d("verifyMatchingFailed|placement=(" + string + "," + creativeInfo.F() + ")|format=(" + string2 + "," + creativeInfo.F() + ")");
                    return false;
                }
            } else {
                return a(creativeInfo.aj(), creativeInfo.ak(), oVar);
            }
        }
        Logger.d(J, "verify matching, no InterstitialInfo or no discovery for ", creativeInfo.Q());
        return false;
    }

    private boolean a(String str, String str2, o oVar) {
        if (oVar == null) {
            return false;
        }
        Logger.d(J, "verify matching object started, event ID: ", oVar.L, ", object address: ", str2, ", webview address: ", oVar.K, ", object type: ", str, ", currentActivityInterstitial = ", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean a2 = CreativeInfoManager.a(oVar.v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str) || a2) {
            Logger.d(J, Logger.FeatureTag.CI_MATCHING, "verify matching object skipped, event ID: ", oVar.L, ", object address: ", str2, ", object type: ", str, ", sdkInterstitialsRunOnAppActivity: ", Boolean.valueOf(a2));
            return true;
        }
        if (oVar.x() == null || !oVar.x().contains(str2)) {
            Logger.d(J, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", oVar.L, ", object address: ", str2, ", views hierarchy: ", oVar.x());
            return false;
        }
        Logger.d(J, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", oVar.L, ", object address: ", str2, ", views hierarchy: ", oVar.x());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(final String str) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.3
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.u(str);
                }
            });
        } else {
            u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str) {
        Logger.d(J, "stop timers - canceling timer for interstitials, eventId = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        o d = this.I.d(str);
        if (d != null) {
            if (d.s() == 0) {
                d.ac = null;
            }
            if (d.al != null) {
                Logger.d(J, "stop timers - calling timer cancel");
                if (!d.al.cancel(true)) {
                    Logger.d(J, "stop timers - failed to call timer cancel");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> list = null;
        for (o oVar : this.I.values()) {
            if (oVar != null && !oVar.U) {
                boolean z = oVar.K != null && oVar.K.equals(str2);
                boolean z2 = oVar.m != null && oVar.m.contains(str2);
                if (z || z2) {
                    list = oVar.l();
                }
            }
        }
        return list;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        List<CreativeInfo> list = null;
        for (o oVar : this.I.values()) {
            if (oVar != null && !oVar.U && oVar.c().equals(str)) {
                list = oVar.l();
                Logger.d(J, "get CreativeInfo By Sdk Package Name returned ", list);
            }
        }
        return list;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        ArrayList arrayList;
        List<CreativeInfo> k;
        synchronized (this.I) {
            for (o oVar : this.I.values()) {
                if (oVar != null && (k = oVar.k()) != null && !k.isEmpty() && k.get(0) != null && k.get(0).L() != null && k.get(0).L().equals(str2)) {
                    return k;
                }
            }
            List<p> list = this.O.get(str);
            if (list != null) {
                synchronized (list) {
                    arrayList = new ArrayList();
                    for (p pVar : list) {
                        if (pVar.a != null && pVar.a.L() != null && pVar.a.L().equals(str2)) {
                            arrayList.add(pVar.a);
                        }
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        synchronized (this.I) {
            for (o oVar : this.I.values()) {
                if (oVar != null && oVar.m != null && oVar.m.contains(str)) {
                    return oVar;
                }
            }
            return null;
        }
    }

    public void e(final Activity activity) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.g(activity);
                }
            });
        } else {
            g(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Activity activity) {
        try {
            Logger.d(J, "interstitial finder stop, activity = ", activity.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            o b2 = this.I.b(activity.toString());
            if (b2 != null) {
                if (b2.ad == null || activity.toString().equals(b2.ad)) {
                    Logger.d(J, "Stopping interstitial finder for activity ", b2.ad);
                    a(b2.L);
                    Logger.d(J, "interstitial finder, viewing time (ms) = ", Long.valueOf(b2.aa));
                }
            }
        } catch (Throwable th) {
            Logger.e(J, th.getMessage(), th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(final String str) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.v(str);
                }
            });
        } else {
            v(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        if (str != null) {
            synchronized (this.P) {
                Logger.d(J, "Activity destroyed activity class: ", str, ", activities: ", this.P.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                this.P.remove((Object) str);
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
            o b2 = this.I.b(str);
            if (b2 != null) {
                if (sdkPackageByClass != null && b2.v != null && !sdkPackageByClass.equals(b2.v)) {
                    Logger.d(J, "Activity destroyed, activity SDK does not fit the WILL_DISPLAY msg: ", sdkPackageByClass);
                } else if (b2.ad != null && !b2.ad.equals(str)) {
                    Logger.d(J, "Activity destroyed, activity address (", str, " ) does not match the address of the ad's activity (", b2.ad, ")");
                } else {
                    b2.a(m.C, new m.a[0]);
                    a(b2, str);
                }
            }
        }
    }

    public void a(String str, Bundle bundle) {
        o oVar;
        if (this.I.containsKey(str) && (oVar = this.I.get(str)) != null) {
            if (bundle.getString("revenue_event") != null) {
                oVar.P = bundle.getString("revenue_event");
            } else {
                oVar.P = "unknown";
            }
            c(oVar, "handleRevenueEvent");
            Logger.d(J, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId: ", str);
            return;
        }
        Logger.d(J, "Revenue event - no interstitial info found for event ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
    }

    public void a(final o oVar, final String str) {
        Object[] objArr = new Object[6];
        objArr[0] = "Ad hidden started, activityClass=";
        objArr[1] = str == null ? AbstractJsonLexerKt.NULL : str;
        objArr[2] = ", interstitial infos=";
        objArr[3] = this.I.toString();
        objArr[4] = ", isOnUiThread = ";
        objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.d(J, objArr);
        if (oVar != null) {
            if (t(str)) {
                Logger.d(J, "Ad hidden ", oVar.c(), " activity ", str, " unloaded but this is not the end of impression. not calling cleanAndReport");
                return;
            }
            c(oVar, "onAdHidden");
            oVar.U = true;
            this.E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.6
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.b(oVar, str);
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(o oVar, String str) {
        String str2;
        if (oVar == null) {
            Logger.d(J, "clean and report - current interstitial info is NULL, SKIPPING");
            return;
        }
        if (oVar.H()) {
            Logger.d(J, "clean and report - already run, SKIPPING");
            return;
        }
        oVar.g(true);
        try {
            char c = 6;
            Logger.d(J, "clean and report started, activity class=", str, ", eventId = ", oVar.L, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str != null) {
                str2 = str;
            } else {
                String str3 = oVar.ad;
                Logger.d(J, "clean and report - activity class set to (curr intractname) ", oVar.ad);
                str2 = str3;
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str2);
            for (l lVar : oVar.g()) {
                if (lVar.j() != null) {
                    Logger.d(J, "clean and report - activity SDK = ", sdkPackageByClass, ", CI SDK = ", lVar.j().Q(), ", interstitial activity name=", oVar.ad);
                    Logger.d(J, "clean and report - currentMaxPackageName = ", oVar.v, ", activitySdk = ", sdkPackageByClass);
                    if (oVar.v != null && !oVar.v.equals(sdkPackageByClass) && !oVar.v.equals(lVar.j().Q()) && !oVar.ak) {
                        Logger.d(J, "clean and report - skip reporting as no related WILL_DISPLAY message received, current Max package name: ", oVar.v, ", activity SDK: ", sdkPackageByClass, ", CI SDK: ", lVar.j().Q());
                        lVar.a((CreativeInfo) null);
                    }
                }
                if (lVar.c != null && lVar.c.b != null) {
                    lVar.d = lVar.c.b;
                } else if (oVar.b() != null) {
                    lVar.d = oVar.b();
                }
                Logger.d(J, "clean and report - last impression screenshot filename set to ", lVar.d);
            }
            com.safedk.android.analytics.brandsafety.creatives.g.a(f(oVar));
            if ((oVar.B != null && oVar.B.equals(BrandSafetyUtils.a(str2, true))) || CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                for (l lVar2 : oVar.g()) {
                    if (lVar2 != null) {
                        if (lVar2.c != null && lVar2.c.b != null && oVar.b() != null) {
                            if (this.C.size() >= SafeDK.getInstance().J()) {
                                if (!c(oVar.s, lVar2.a)) {
                                    BrandSafetyUtils.d(oVar.t);
                                    oVar.ac = null;
                                    oVar.t = null;
                                }
                            } else {
                                Object[] objArr = new Object[8];
                                objArr[0] = "clean and report - image files: ";
                                objArr[1] = lVar2.c.b;
                                objArr[2] = ", ";
                                objArr[3] = oVar.t;
                                objArr[4] = ", impression ID: ";
                                objArr[5] = lVar2.a;
                                objArr[c] = ", count = ";
                                objArr[7] = Integer.valueOf(this.C.size());
                                Logger.d(J, objArr);
                                a(oVar, lVar2);
                            }
                            Logger.d(J, "clean and report - hash value: ", lVar2.c.a, " orientation: ", lVar2.c.f);
                            if (lVar2.c.a == null && !oVar.af) {
                                Logger.d(J, "clean and report - assigning last captured hash to interstitial: ", oVar.ac);
                                lVar2.c.a = oVar.ac;
                                lVar2.c.f = oVar.u;
                            }
                            this.R = lVar2.c.a;
                        }
                        if (!lVar2.e().isEmpty()) {
                            for (String str4 : lVar2.e()) {
                                Logger.d(J, "clean and report - attach resources to CI for webview/adId: ", str4);
                                com.safedk.android.analytics.brandsafety.creatives.g.a(oVar.c(), str4, lVar2);
                                if (CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true)) {
                                    try {
                                        if (lVar2.w > 0) {
                                            oVar.d("aiw" + lVar2.w);
                                        }
                                    } catch (Exception e) {
                                        Logger.e(J, "caught exception: ", e);
                                    }
                                }
                            }
                            com.safedk.android.analytics.brandsafety.creatives.g.b(lVar2.e());
                        }
                        c = 6;
                    }
                }
                oVar.ag = SystemClock.elapsedRealtime();
                oVar.aa += oVar.ag - oVar.ae;
                Logger.d(J, "clean and report - Viewing time (ms) = ", Long.valueOf(oVar.aa));
                if (CreativeInfoManager.j(oVar.v) == null) {
                    return;
                }
                Logger.d(J, "clean and report - number of CIs to report: ", Integer.valueOf(oVar.k().size()));
                c(oVar, "onAdHiddenTask");
                for (l lVar3 : oVar.g()) {
                    if (lVar3 != null && lVar3.j() != null && lVar3.j().X() != null) {
                        Logger.d(J, "clean and report - resetting CI matching method for ci ", lVar3.j());
                        lVar3.j().U();
                    }
                }
            } else {
                Logger.d(J, "clean and report - DID NOT enter unload logic, current interstitial info=", oVar);
            }
            if (str2 != null) {
                Logger.d(J, "clean and report - removing from activities : ", str2);
                synchronized (this.P) {
                    this.P.remove((Object) str2);
                }
            }
            b((c) oVar);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void w(String str) {
        Logger.d(J, "clearing AppLovin bundle, eventId = ", str);
        boolean z = this.I.size() != 0;
        this.Q = z;
        Logger.d(J, "clear variables, maxAdIsActive set to ", Boolean.valueOf(z));
        if (str != null) {
            synchronized (this.I) {
                this.I.remove(str);
            }
            Logger.d(J, "clear variables, removing ", str, " from currentInterstitialInfos");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(o oVar, String str) {
        String str2;
        ArrayList arrayList;
        String str3;
        ArrayList arrayList2;
        CreativeInfo creativeInfo;
        if (oVar == null || !oVar.Z) {
            Logger.d(J, "reporting event - info is not interstitial, don't report info");
            return;
        }
        int i = 6;
        Logger.printFullVerboseLog(J, "reporting event started, root=", str, ", info event id =", oVar.L, " , isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean z = !oVar.E;
        boolean z2 = !oVar.F && oVar.d();
        CreativeInfo creativeInfo2 = null;
        if (oVar.A != null && oVar.A.containsKey("id")) {
            String string = oVar.A.getString("id");
            Logger.d(J, "reporting event - event ID: ", string);
            str2 = string;
        } else {
            Logger.d(J, "reporting event - no event ID");
            str2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (oVar.k().isEmpty()) {
            arrayList3.add(a(oVar, oVar.i(), z2, str2, (String) null));
            arrayList = arrayList3;
        } else {
            Logger.d(J, "reporting event - number of CIs: ", Integer.valueOf(oVar.k().size()));
            for (l lVar : new ArrayList(oVar.g())) {
                if (lVar.j() != null && !oVar.c().equals(lVar.j().Q())) {
                    Object[] objArr = new Object[i];
                    objArr[0] = "reporting event without CI - sdk: ";
                    objArr[1] = oVar.c();
                    objArr[2] = ", CI sdk: ";
                    objArr[3] = lVar.j().Q();
                    objArr[4] = ", CI actual sdk: ";
                    objArr[5] = lVar.j().R();
                    Logger.d(J, objArr);
                    lVar.a(creativeInfo2);
                }
                Logger.d(J, "reporting event (Check) root = ", str, ", debug info = ", oVar.B());
                List asList = Arrays.asList(com.safedk.android.utils.h.i, com.safedk.android.utils.h.b, "com.unity3d.ads");
                if (!TextUtils.isEmpty(oVar.B()) && str.equals("onAdHidden") && lVar.j() != null && asList.contains(lVar.j().Q()) && oVar.A != null && oVar.A.containsKey("ad_format") && oVar.A.getString("ad_format") != null && oVar.A.getString("ad_format").equals(BrandSafetyUtils.l)) {
                    lVar.j().u(oVar.B());
                    String maxEvents = q.a().c().toString();
                    Logger.printFullVerboseLog(J, "reporting event Invalid AppOpen impression detected ciDebugInfo = ", oVar.B(), " , lastMaxEvents = ", maxEvents);
                    lVar.j().u(maxEvents);
                }
                if (lVar.c != null) {
                    Logger.d(J, "reporting event - image uniformity: ", Float.valueOf(lVar.c.a(1000)));
                    String str4 = (lVar.c.a != null && !oVar.af) ? lVar.c.a + "_" + lVar.a : creativeInfo2;
                    d(oVar, str4);
                    str3 = str4;
                } else {
                    str3 = creativeInfo2;
                }
                if (!oVar.f()) {
                    arrayList2 = arrayList3;
                    creativeInfo = creativeInfo2;
                } else if (!CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)) {
                    arrayList2 = arrayList3;
                    creativeInfo = creativeInfo2;
                } else {
                    arrayList2 = arrayList3;
                    creativeInfo = creativeInfo2;
                    arrayList2.add(a(oVar, lVar, lVar.a(), str2, str3));
                    arrayList3 = arrayList2;
                    creativeInfo2 = creativeInfo;
                    i = 6;
                }
                arrayList2.add(a(oVar, lVar, z2, str2, str3));
                arrayList3 = arrayList2;
                creativeInfo2 = creativeInfo;
                i = 6;
            }
            arrayList = arrayList3;
        }
        Logger.d(J, "reporting event ", str2, ", viewingTime = ", Long.valueOf(oVar.aa));
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(J, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z) {
            oVar.c(true);
        }
        if (z2) {
            oVar.d(true);
        }
    }

    private BrandSafetyEvent a(o oVar, l lVar, boolean z, String str, String str2) {
        Bundle bundle;
        long j;
        m b2 = b(oVar, lVar);
        String c = oVar.c();
        int i = oVar.z;
        String e = oVar.d() ? oVar.e() : null;
        CreativeInfo j2 = lVar.j();
        long a2 = oVar.a();
        String str3 = oVar.C;
        String str4 = lVar.a != null ? lVar.a : "";
        String str5 = oVar.D;
        long j3 = oVar.aa;
        boolean z2 = oVar.aa > 0;
        Bundle bundle2 = oVar.A;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = lVar.c != null ? lVar.c.f : null;
        boolean z3 = lVar.c != null ? lVar.c.g : false;
        if (lVar.c != null) {
            bundle = bundle2;
            j = lVar.c.c;
        } else {
            bundle = bundle2;
            j = 0;
        }
        return new BrandSafetyEvent(c, i, str2, z, e, j2, a2, str3, str4, str5, j3, z2, bundle, screenShotOrientation, z3, j, lVar.c != null ? lVar.c.a(1000) : 0.0f, oVar.y, oVar.T, SafeDK.getInstance().e(), str, oVar.M, oVar.N, oVar.P, oVar.Q, b2.toString(), lVar.e, lVar.f, lVar.g, lVar.m, lVar.n, lVar.o, lVar.p, lVar.q, lVar.x, lVar.r);
    }

    private void d(o oVar, String str) {
        Logger.d(J, "add CI debug info started, hashValue ", str, ", info=", oVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        for (l lVar : oVar.g()) {
            if (lVar.j() != null && lVar.c != null && str != null && lVar.c.a != null && lVar.c.f != null && oVar.n() != null) {
                String a2 = BrandSafetyUtils.a(BrandSafetyUtils.AdType.INTERSTITIAL, lVar.c.a, oVar.c(), oVar.n(), lVar.c.f);
                if (new File(a2).exists()) {
                    if (lVar.j().W() == null || !lVar.j().W().contains("screenshot_datetime")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        lVar.j().u("screenshot_datetime=" + currentTimeMillis);
                        Logger.d(J, "add CI debug info: ", Long.valueOf(currentTimeMillis));
                    } else {
                        Logger.d(J, "add CI debug info - stats repo is null or already contains this event");
                    }
                } else {
                    Logger.d(J, "add CI debug info - screenshot file path doesn't exist: ", a2);
                }
            } else {
                Logger.d(J, "add CI debug info - no creative info or hash is null");
            }
        }
    }

    public void a(o oVar) {
        if (oVar == null || com.safedk.android.utils.e.a((c) oVar)) {
            Logger.d(J, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", oVar, ", low memory");
            return;
        }
        Logger.d(J, "take screenshot - currentActivityInterstitial = ", oVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (oVar.aq == null || oVar.aq.get() == null) {
            Logger.d(J, "take screenshot - activity instance is null");
            return;
        }
        Activity activity = oVar.aq.get();
        if (oVar.J()) {
            Logger.d(J, "take screenshot - sdk Interstitials Run On App Activity = ", Boolean.valueOf(oVar.ak));
            if (oVar.aq != null && oVar.aq.get() != null && !BrandSafetyUtils.d(activity.getClass()) && !oVar.ak) {
                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - The activity is not supported : ", activity.getClass());
                return;
            }
            String str = oVar.v;
            Activity e = e(oVar);
            Logger.d(J, "take screenshot - activity = ", e);
            AdNetworkDiscovery j = CreativeInfoManager.j(oVar.v);
            try {
                Logger.d(J, "take screenshot - Run on UI thread in ", oVar.ad);
                View K2 = oVar.K();
                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - screenshot view: ", K2);
                if (!ScreenshotHelper.a()) {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - OS version is not compatible with PC");
                    int E = oVar.E();
                    if (E > 0 && (K2 instanceof ViewGroup)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new WeakReference(K2));
                        c((ViewGroup) K2, arrayList);
                        Logger.d(J, "take screenshot (for screenshots) - views hierarchy : ", arrayList);
                        if (E < arrayList.size()) {
                            K2 = (View) ((WeakReference) arrayList.get(E)).get();
                            Logger.d(J, "take screenshot - get screenshot view, index: ", Integer.valueOf(E), ", view: ", K2);
                        } else {
                            oVar.G();
                            Logger.d(J, "take screenshot - reset screenshot view: ", K2);
                        }
                    }
                }
                CreativeInfo j2 = oVar.j();
                boolean equals = com.safedk.android.utils.h.h.equals((j2 == null || j2.R() == null) ? oVar.c() : j2.R());
                if (j2 != null) {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - is video ad ? ", Boolean.valueOf(oVar.i().l), ", is multi ad ? ", Boolean.valueOf(j2.an()));
                }
                boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (!SafeDK.getInstance().I() && !equals) {
                    if (!oVar.i().l && j != null && j.a((c) oVar)) {
                        oVar.i().l = true;
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - found a media player");
                    }
                    if (j2 == null) {
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - no creative info yet");
                        return;
                    }
                    if (j2.an() && !a2) {
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - multi ad, sdk: ", str);
                        return;
                    }
                    if (oVar.i().l) {
                        if (oVar.i().c()) {
                            if (oVar.i().t) {
                                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ecommerce collage end card is displayed");
                                a(oVar, K2, e);
                                return;
                            } else {
                                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ecommerce collage end card is not displayed yet, don't take screenshot");
                                return;
                            }
                        }
                        if (!a(oVar, K2) && !oVar.i().k) {
                            Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - video is currently playing, isNativeVideoPlayerCompleted ? ", Boolean.valueOf(a(oVar, K2)), ", eovEventTriggered ? ", Boolean.valueOf(oVar.i().k));
                            return;
                        }
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - video finished playing, isNativeVideoPlayerCompleted ? ", Boolean.valueOf(a(oVar, K2)), ", eovEventTriggered ? ", Boolean.valueOf(oVar.i().k));
                        a(oVar, K2, e);
                        return;
                    }
                    if (oVar.i().d() && !oVar.i().u) {
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - ad has video loading screen being displayed now, don't take screenshot");
                        return;
                    } else {
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - this is not a video ad - take screenshot");
                        a(oVar, K2, e);
                        return;
                    }
                }
                if (SafeDK.getInstance().I()) {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - SafeDK Config item 'AlwaysTakeScreenshot' is true");
                    a(oVar, K2, e);
                } else if (j2 == null) {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - Admob SDK but no ci yet");
                } else if (j2.an() && !a2) {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - multi ad, sdk: ", str);
                } else {
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "take screenshot - Admob SDK");
                    a(oVar, K2, e);
                }
            } catch (Throwable th) {
                Logger.e(J, Logger.FeatureTag.AD_CAPTURE, "Failed while taking screenshot", th);
                new CrashReporter().caughtException(th);
            }
        }
    }

    private boolean a(o oVar, View view) {
        AdNetworkDiscovery j = CreativeInfoManager.j(oVar.c());
        if (j == null || !oVar.W || !j.b(view)) {
            return false;
        }
        if (!oVar.i().k) {
            Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "is native video player completed - native video end, info:", oVar);
            oVar.e("native");
        }
        return true;
    }

    private Activity e(o oVar) {
        if (oVar.ak) {
            return com.safedk.android.internal.b.getInstance().getForegroundActivity();
        }
        if (oVar.aq != null && oVar.aq.get() != null) {
            return oVar.aq.get();
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(p pVar) {
        Logger.d(J, "set CI details started, matchingInfo = ", pVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        CreativeInfo creativeInfo = pVar.a;
        if (creativeInfo == null) {
            return false;
        }
        creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
        o oVar = null;
        if (creativeInfo.n() != null) {
            oVar = this.I.d(creativeInfo.n());
            Object[] objArr = new Object[4];
            objArr[0] = "set CI details, attempt to locate interstitial info by eventId ";
            objArr[1] = creativeInfo.n();
            objArr[2] = ", success? ";
            objArr[3] = Boolean.valueOf(oVar != null);
            Logger.d(J, objArr);
        }
        if (oVar == null && creativeInfo.ak() != null) {
            oVar = this.I.a(creativeInfo.ak(), true);
            Object[] objArr2 = new Object[4];
            objArr2[0] = "set CI details, attempt to locate interstitial info by matching object address ";
            objArr2[1] = creativeInfo.ak();
            objArr2[2] = ", success ? ";
            objArr2[3] = Boolean.valueOf(oVar != null);
            Logger.d(J, objArr2);
        }
        if (oVar != null) {
            return a(pVar, oVar);
        }
        List<o> a2 = this.I.a(creativeInfo.Q());
        if (a2.size() > 0) {
            Logger.d(J, "set CI details, attempt to locate interstitial info, list size: ", Integer.valueOf(a2.size()));
            Iterator<o> it = this.I.a(creativeInfo.Q()).iterator();
            while (it.hasNext()) {
                if (a(pVar, it.next())) {
                    List<p> list = this.O.get(creativeInfo.Q());
                    if (list != null) {
                        synchronized (this.O) {
                            list.remove(pVar);
                        }
                    }
                    return true;
                }
            }
        } else {
            Logger.d(J, "set CI details, failed to locate interstitial info");
            a(pVar, creativeInfo.Q());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(p pVar, o oVar) {
        if (oVar == null) {
            return false;
        }
        CreativeInfo creativeInfo = pVar.a;
        Logger.d(J, Logger.FeatureTag.CI_MATCHING, "set CI details - ad info sdk: ", oVar.c(), ", CI sdk: ", creativeInfo.Q(), " ad info webview address: ", oVar.K, ", ci matching object address: ", creativeInfo.ak());
        if (oVar.v != null && (oVar.v.equals(creativeInfo.Q()) || oVar.v.equals(creativeInfo.R()))) {
            if (oVar.U) {
                Logger.d(J, "set CI details - ad is already finished, cannot set creative info");
                return false;
            }
            Logger.d(J, "set CI details - currentMaxPackageName: ", oVar.v);
            if (a(creativeInfo, oVar)) {
                Logger.d(J, "set CI details - setting as current CI for SDK: ", creativeInfo.Q());
                if (oVar.A != null) {
                    Logger.d(J, "set CI details - CI ad format: ", creativeInfo.I(), ", max ad type: ", oVar.A.getString("ad_format"));
                    BrandSafetyEvent.AdFormatType a2 = BrandSafetyUtils.a(oVar.A);
                    if ((creativeInfo.I() == null || !creativeInfo.I().equals(a2.name())) && a2 != null) {
                        Logger.d(J, "set CI details - updating ad format value to ", a2);
                        creativeInfo.a(a2);
                        oVar.d("ad_type_upd(sCrInfoDtls):" + a2);
                    }
                }
                b(creativeInfo, oVar);
                if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false) && creativeInfo.F() != null && oVar.y() != null && creativeInfo.F().contains(oVar.y())) {
                    Logger.d(J, "set CI details - replacing ci placement ", creativeInfo.F(), " with Max placement ", oVar.y());
                    creativeInfo.j(oVar.y());
                }
                try {
                    boolean a3 = CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    Object[] objArr = new Object[10];
                    objArr[0] = "set CI details - Multi ad detectMultipleAdsByWebview =  ";
                    objArr[1] = Boolean.valueOf(a3);
                    objArr[2] = ", currentActivityInterstitial.isMultiAd() = ";
                    objArr[3] = Boolean.valueOf(oVar.f());
                    objArr[4] = ", currentActivityInterstitial.getImpression() != null ?";
                    objArr[5] = Boolean.valueOf(oVar.i() != null);
                    objArr[6] = ", currentActivityInterstitial.getImpression().getCreativeInfo() != null ? ";
                    objArr[7] = Boolean.valueOf(oVar.i().j() != null);
                    objArr[8] = ", getImpressionList = ";
                    objArr[9] = oVar.g();
                    Logger.printFullVerboseLog(J, objArr);
                    if (a3 && oVar.f() && oVar.i() != null && oVar.i().j() != null) {
                        Logger.d(J, "set CI details - Multi ad, current impression already has a CI. not calling setCreativeInfo.");
                        return false;
                    }
                } catch (Throwable th) {
                    Logger.d(J, "Exception in set CI details - Multi ad : ", th.getMessage(), th);
                }
                return b(pVar, oVar);
            }
        }
        a(pVar, creativeInfo.Q());
        creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + pVar.b + "|o=" + pVar.a.aj() + ";" + pVar.a.ak());
        b(creativeInfo, oVar);
        return false;
    }

    private void b(CreativeInfo creativeInfo, o oVar) {
        if (oVar != null) {
            synchronized (oVar.av) {
                if (oVar.al == null || oVar.al.isCancelled()) {
                    Logger.d(J, "start late scanning - task future is: ", oVar.al, ", is scanning? ", Boolean.valueOf(oVar.am), " is ad finished? ", Boolean.valueOf(oVar.U));
                    if (!oVar.am) {
                        Logger.d(J, "start late scanning - starting timer for InterstitialInfo with event id: ", oVar.w());
                        g(oVar);
                        oVar.aa = 0L;
                        oVar.al = this.E.scheduleWithFixedDelay(new b(oVar.L, oVar.v), 500L, 1000L, TimeUnit.MILLISECONDS);
                    } else {
                        Logger.d(J, "start late scanning - avoid recursive call to web view scanning");
                        creativeInfo.u("avoidRecWebScan");
                    }
                }
            }
        }
    }

    private void a(p pVar, String str) {
        if (pVar != null && pVar.a != null) {
            List<p> list = this.O.get(str);
            if (list == null) {
                list = new ArrayList<>();
                synchronized (this.O) {
                    this.O.put(str, list);
                }
            } else {
                synchronized (list) {
                    for (p pVar2 : list) {
                        if (pVar2.a != null && pVar2.a.equals(pVar.a)) {
                            Logger.d(J, "add CI as pending match - already in pending list: ", pVar);
                            return;
                        }
                    }
                    Logger.d(J, "add CI as pending match - number of pending candidates: ", Integer.valueOf(list.size()));
                }
            }
            if (!CreativeInfoManager.a(str, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                Logger.d(J, Logger.FeatureTag.CI_MATCHING, "adding as pending for SDK: ", pVar.a.Q(), " matching info: ", pVar);
                synchronized (list) {
                    list.add(pVar);
                }
                return;
            }
            Logger.d(J, "NOT adding as pending (config based), sdk: ", str, " matching info: ", pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(p pVar, o oVar) {
        Logger.printFullVerboseLog(J, Logger.FeatureTag.CI_MATCHING, "set CI started, matching info=", pVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (pVar == null) {
            Logger.d(J, "set CI, matching info is null");
            return false;
        }
        synchronized (this.S) {
            CreativeInfo creativeInfo = pVar.a;
            AdNetworkDiscovery j = CreativeInfoManager.j(creativeInfo.Q());
            if (j != null) {
                Logger.d(J, "set CI, matching info is ", pVar);
                if (oVar != null) {
                    if (oVar.j() != null && !oVar.j().an()) {
                        j.d(creativeInfo);
                        Logger.printFullVerboseLog(J, "set CI, already matched! ignore matching attempt CI: ", creativeInfo);
                        return false;
                    }
                    creativeInfo.a(pVar.b, pVar.c, pVar.d);
                    Logger.d(J, "set CI: ", creativeInfo);
                    oVar.a(creativeInfo);
                    a(creativeInfo);
                    j.s(creativeInfo.L());
                    if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false)) {
                        j.b(creativeInfo);
                    }
                    if (oVar.K != null) {
                        com.safedk.android.analytics.brandsafety.creatives.g.a(oVar.c(), oVar.i().b(), oVar.i());
                    }
                    if (pVar.b.startsWith(CreativeInfo.h)) {
                        oVar.u();
                    }
                    b(oVar, creativeInfo);
                    c(oVar, "setCreativeInfo");
                    l i = oVar.i();
                    if (i != null && i.l) {
                        i.k = false;
                    }
                    if (!oVar.ai && StatsReporter.b().a(creativeInfo, oVar)) {
                        oVar.ai = true;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void a(CreativeInfo creativeInfo) {
        List<p> list;
        if (creativeInfo != null && (list = this.O.get(creativeInfo.Q())) != null) {
            synchronized (list) {
                Iterator<p> it = list.iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    if (next.a != null && next.a.n() != null && next.a.n().equals(creativeInfo.n())) {
                        Logger.d(J, "remove pending creative info - removing creative info from pending list: ", creativeInfo);
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z, String str4) {
        Logger.d(J, "set ad click URL started, sdk: ", str2, ", url: ", str, ", view address: ", str3, ", viewTag: ", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str2);
        o a2 = this.I.a(str3, false);
        if (a2 == null && this.I.a(mainSdkPackage).size() == 1) {
            Logger.d(J, "InterstitialInfo not found by address, trying by SdkPackageName ", mainSdkPackage);
            a2 = this.I.a(mainSdkPackage).get(0);
        }
        if (a2 != null && a2.c() != null && SdksMapping.isSameSdkByPackages(a2.c(), mainSdkPackage)) {
            if (z) {
                a2.ao = true;
            }
            Logger.d(J, "set ad click URL - applying clickUrl candidate logic. url: ", str);
            if (!a2.d() && ((z || a2.aj == null) && !CreativeInfoManager.a(a2.c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false))) {
                Logger.d(J, "set ad click URL - current Activity Interstitial is not marked as clicked, setting click URL: ", str);
                a(a2, str, str4);
                return true;
            }
            if ((a2.aj == null && str != null) || CreativeInfoManager.a(a2.c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)) {
                a(a2, str, str4);
            }
            Logger.d(J, "set ad click URL - diag currentClickUrlCandidate: ", a2.aj);
            if (a2.aj != null && str4 != null) {
                a2.aj.d = str4;
                Logger.d(J, "set ad click URL - no click URL yet, setting click url candidate tag : ", str4);
            }
            if (a2.e() == null) {
                Logger.d(J, "set ad click URL - no click URL yet, setting clickUrl: ", str);
                a2.c(str);
                return true;
            }
            Logger.d(J, "set ad click URL - click URL already set: ", a2.e());
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "set ad click URL skipped, SDK: ";
        objArr[1] = a2 != null ? a2.c() : AbstractJsonLexerKt.NULL;
        Logger.d(J, objArr);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
        o a2 = this.I.a(str3, false);
        if (a2 != null && a2.d() && str2 != null && str2.equals(a2.c()) && a2.aq != null && a2.aq.get() != null) {
            String obj = a2.aq.get().toString();
            Logger.d(J, "set previous activity click url, click activity: ", obj, ", ad activity: ", a2.ad);
            String a3 = BrandSafetyUtils.a(obj, true);
            if (a3 != null && !a3.equals(a2.B)) {
                Logger.d(J, "set previous activity click url - detected URL for click in previous activity (not yet destroyed), url: ", str);
                if (a2.c(str)) {
                    c(a2, "setPreviousActivityClickUrl");
                }
            }
        }
    }

    private void a(final o oVar, final View view, final Activity activity) {
        try {
            if (oVar == null || activity == null) {
                Logger.d(J, "taking screenshot, currentActivityInterstitial or activity are null");
                return;
            }
            CreativeInfo j = oVar.j();
            if (j != null && j.aq()) {
                Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "taking screenshot, skip website endcard");
                return;
            }
            oVar.y++;
            Logger.d(J, "taking screenshot on UIThread, view=", view, ", isOnUiThread : ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (ScreenshotHelper.a()) {
                Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ScreenshotHelper.a(activity, oVar, view, SafeDK.getInstance().F());
                    }
                };
                Logger.d(J, "Taking screenshot - network supports copying bitmap using PC");
                com.safedk.android.utils.l.a(this.E, runnable);
            } else {
                activity.runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(InterstitialFinder.J, "taking screenshot - using old method");
                        Bitmap a2 = ScreenshotHelper.a(view, SafeDK.getInstance().E(), oVar);
                        if (a2 == null) {
                            oVar.F();
                            Logger.d(InterstitialFinder.J, "taking screenshot, black screenshot detected index = ", Integer.valueOf(oVar.E()));
                        } else {
                            InterstitialFinder.this.a(a2, oVar);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(J, "taking screenshot taking screenshot exception:", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.9
            @Override // java.lang.Runnable
            public void run() {
                InterstitialFinder interstitialFinder = InterstitialFinder.this;
                c cVar2 = cVar;
                interstitialFinder.a((o) cVar2, cVar2.c(), bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    public void a(o oVar, String str, Bitmap bitmap) {
        String str2;
        long j;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2;
        String str9;
        int i;
        l lVar;
        int i2;
        char c;
        boolean z3;
        boolean z4;
        int i3;
        String str10;
        boolean z5;
        if (bitmap != null) {
            BrandSafetyUtils.a a2 = BrandSafetyUtils.a(str, bitmap);
            int a3 = a2.a();
            BrandSafetyUtils.ScreenshotValidity a4 = BrandSafetyUtils.a(str, a2);
            Logger.d(J, "process screenshot, screenshot validity = ", a4.name());
            if (a4 == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK) {
                str2 = J;
            } else {
                if (a4 != BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                    if (a4 == BrandSafetyUtils.ScreenshotValidity.VALID) {
                        String a5 = BrandSafetyUtils.a(bitmap);
                        Logger.d(J, "process screenshot found interstitial, hash = ", a5);
                        AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
                        if (j2 != null && !j2.a(a5, this.R)) {
                            Logger.d(J, "process screenshot skipping file, not valid for ", str);
                            oVar.d("SkippedImageHash=" + a5);
                            return;
                        }
                        oVar.ah = BrandSafetyUtils.b(bitmap);
                        String n = oVar.n();
                        Logger.d(J, "process screenshot impressionId is ", n);
                        String a6 = BrandSafetyUtils.a(bitmap, BrandSafetyUtils.AdType.INTERSTITIAL, a5, str, n, oVar.ah);
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "process screenshot screenshot file created, filename = ", a6);
                        long c2 = BrandSafetyUtils.c(a6);
                        float f = (a3 / 1000.0f) * 100.0f;
                        if (j2 != null && c2 < j2.a(oVar.j())) {
                            Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "process screenshot file size too small ", Long.valueOf(c2), " (bytes). This image will not be used");
                            BrandSafetyUtils.d(a6);
                            return;
                        }
                        Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "process screenshot stored file size is ", Long.valueOf(c2), " bytes, counter is ", Integer.valueOf(oVar.y), ", uniform pixel count is ", Integer.valueOf(a3), " (", Float.valueOf(f), "%)");
                        int size = this.C.size();
                        if (!d(a5, n)) {
                            if (size >= SafeDK.getInstance().J()) {
                                j = c2;
                                str3 = a6;
                                if (!c(a5, n)) {
                                    Logger.d(J, "process screenshot no open slot for interstitial ", a5);
                                    BrandSafetyUtils.d(str3);
                                    str10 = null;
                                    str4 = str10;
                                } else {
                                    Logger.d(J, "process screenshot image ", a5, "_", n, " is already scheduled for upload");
                                }
                            } else {
                                Logger.d(J, "process screenshot impressions to report size=", Integer.valueOf(size), ", max images to store=", Integer.valueOf(SafeDK.getInstance().J()));
                                if (oVar.ac == null) {
                                    z5 = true;
                                } else if (oVar.ac.equals(a5)) {
                                    z5 = false;
                                } else {
                                    Logger.d(J, "process screenshot removing previous file : ", oVar.t);
                                    BrandSafetyUtils.d(oVar.t);
                                    z5 = true;
                                }
                                if (!z5) {
                                    j = c2;
                                    str3 = a6;
                                } else {
                                    Logger.d(J, "process screenshot keeping file of interstitial ", a5, ". file size is ", Long.valueOf(c2), " (bytes), orientation: ", oVar.ah);
                                    j = c2;
                                    str3 = a6;
                                    BrandSafetyUtils.a(oVar.t(), BrandSafetyUtils.AdType.INTERSTITIAL, a5, str, n, oVar.ah);
                                }
                            }
                            str10 = a5;
                            str4 = str10;
                        } else {
                            j = c2;
                            str3 = a6;
                            Logger.d(J, "process screenshot not saving file for interstitial ", a5, "_", n);
                            BrandSafetyUtils.d(str3);
                            if (d(a5, n)) {
                                Logger.d(J, "process screenshot interstitial ", a5, "_", n, " was already reported");
                            } else {
                                Logger.d(J, "process screenshot waiting to report stored interstitial ", oVar.ac);
                            }
                            if (oVar.ac != null) {
                                if (c(oVar.ac, oVar.n())) {
                                    BrandSafetyUtils.d(oVar.t);
                                } else {
                                    Logger.d(J, "process screenshot not deleting not best image ", oVar.t);
                                }
                            }
                            str4 = a5;
                        }
                        if (str4 == null) {
                            z = false;
                        } else {
                            Logger.d(J, "process screenshot setting interstitial info data (previous hash = ", oVar.ac, ", current hash = ", str4, ")");
                            z = (oVar.ac == null || str4.equals(oVar.ac)) ? false : true;
                        }
                        if (oVar.ah.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED)) {
                            oVar.ah = BrandSafetyUtils.b(bitmap);
                        }
                        l i4 = oVar.i();
                        if (i4 == null) {
                            str5 = m.t;
                            str6 = "processScreenshot";
                            str7 = m.K;
                            str8 = str3;
                            z2 = z;
                            str9 = J;
                            i = a3;
                            lVar = i4;
                        } else {
                            i4.b(m.t, new m.a(m.K, m.X));
                            Logger.d(J, "process screenshot setting image details: ", i4.c);
                            int i5 = oVar.y;
                            BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = oVar.ah;
                            str6 = "processScreenshot";
                            str5 = m.t;
                            str7 = m.K;
                            i = a3;
                            lVar = i4;
                            z2 = z;
                            str8 = str3;
                            str9 = J;
                            lVar.c = new k(str4, str3, j, a3, i5, screenShotOrientation, z2);
                            c(oVar, str6);
                        }
                        if (!oVar.ap) {
                            i2 = 1;
                            c = 0;
                        } else {
                            i2 = 1;
                            oVar.at = true;
                            c = 0;
                            oVar.ap = false;
                            Logger.d(str9, "first candidate image sample, resetting resources collection cycle");
                        }
                        if (oVar.ac == null) {
                            Object[] objArr = new Object[i2];
                            objArr[c] = "process screenshot no previous hash to detect animation, keep sampling";
                            Logger.d(str9, objArr);
                            oVar.ac = str4;
                            oVar.t = str8;
                            oVar.u = oVar.ah;
                            return;
                        }
                        String str11 = str8;
                        CreativeInfo j3 = oVar.j();
                        if (j3 == null || !j3.D()) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                            if (z3) {
                                z4 = false;
                                Logger.d(str9, "process screenshot, shopping collage didn't finished loading");
                                if (!a(i, j) && z4) {
                                    if (lVar != null) {
                                        lVar.a(str5, new m.a(str7, m.Y));
                                    }
                                    k m = oVar.m();
                                    if (m != null) {
                                        m.g = z3;
                                        Logger.d(str9, "process screenshot setting interstitial is_animated field to ", Boolean.valueOf(z3));
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        i3 = 1;
                                    } else {
                                        if (oVar.ah.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) && m != null) {
                                            m.f = BrandSafetyUtils.b(bitmap);
                                        }
                                        i3 = 1;
                                        Logger.d(str9, "process screenshot - before reporting, debug info is: ", oVar.B());
                                        c(oVar, str6);
                                        oVar.e(true);
                                    }
                                    oVar.an = i3;
                                    Object[] objArr2 = new Object[i3];
                                    objArr2[0] = "final image sampled twice, not forcing resources collection";
                                    Logger.d(str9, objArr2);
                                    return;
                                }
                                oVar.ac = str4;
                                oVar.t = str11;
                                oVar.u = oVar.ah;
                                return;
                            }
                            Logger.d(str9, "process screenshot, shopping collage finished loading");
                        }
                        z4 = true;
                        if (!a(i, j)) {
                        }
                        oVar.ac = str4;
                        oVar.t = str11;
                        oVar.u = oVar.ah;
                        return;
                    }
                    Logger.d(J, Logger.FeatureTag.AD_CAPTURE, "process screenshot is not valid: ", a4.name(), ", pixel count: ", Integer.valueOf(a3), ", try again...");
                    if (oVar.ab && oVar.i().k) {
                        Logger.d(J, "process screenshot back from background - reset video completed indication to false");
                        oVar.ab = false;
                        oVar.i().k = false;
                        return;
                    }
                    return;
                }
                str2 = J;
            }
            oVar.F();
            Logger.d(str2, "process screenshot, black/uniform screenshot detected, index = ", Integer.valueOf(oVar.E()));
        }
    }

    private boolean a(int i, int i2) {
        return i == BrandSafetyUtils.a() && i2 == BrandSafetyUtils.b();
    }

    private boolean a(int i, long j) {
        Logger.d(J, "should stop sampling started, maxUniformedPixelsCount=", Integer.valueOf(i), ", fileSize=", Long.valueOf(j), " (bytes), stopSamplingFileSize=", Long.valueOf(SafeDK.getInstance().K()));
        boolean z = BrandSafetyUtils.a(i) && j > SafeDK.getInstance().K();
        Logger.d(J, "should stop sampling returned ", Boolean.valueOf(z));
        return z;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        InterstitialInfoCollection interstitialInfoCollection = this.I;
        if (interstitialInfoCollection != null) {
            for (o oVar : interstitialInfoCollection.values()) {
                if (oVar != null && oVar.Z) {
                    oVar.a(m.z, new m.a[0]);
                    c(oVar, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        ArrayList<o> arrayList;
        InterstitialInfoCollection interstitialInfoCollection = this.I;
        if (interstitialInfoCollection != null) {
            synchronized (interstitialInfoCollection) {
                arrayList = new ArrayList(this.I.values());
            }
            for (o oVar : arrayList) {
                if (oVar != null) {
                    oVar.a(m.A, new m.a[0]);
                    c(oVar, "onForeground");
                    if (!oVar.i().k) {
                        oVar.ab = true;
                    }
                }
            }
        }
    }

    private void a(List<WeakReference<WebView>> list, o oVar) {
        Iterator<WeakReference<WebView>> it = list.iterator();
        while (it.hasNext()) {
            WebView webView = it.next().get();
            if (webView != null) {
                String a2 = BrandSafetyUtils.a((Class) webView.getClass());
                if (!TextUtils.isEmpty(a2) && !a2.equals(oVar.c()) && a2.equals(com.safedk.android.utils.h.h)) {
                    Logger.d(J, "identify scar-admob - webView is Admob: ", webView, ", current interstitial info: ", oVar);
                    oVar.T = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<WeakReference<WebView>> f(o oVar) {
        if (oVar == null || oVar.aq == null || oVar.aq.get() == null || oVar.am) {
            Logger.d(J, "scan for webViews activity is null, skipping");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Activity activity = oVar.aq.get();
        if (activity != null && BrandSafetyUtils.h(activity.getClass().getName())) {
            try {
                oVar.am = true;
                View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                if (findViewById != null) {
                    b((ViewGroup) findViewById, arrayList);
                }
                oVar.am = false;
            } catch (Throwable th) {
                Logger.d(J, "caught exception: ", th);
            }
        }
        return arrayList;
    }

    public void a(String str, View view, long j) {
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)) {
            int hashCode = view.hashCode();
            Logger.d(J, "handle Ad Stage Switch Signal started, ", str, ",", view, ", hashCode : ", Integer.valueOf(hashCode));
            o q = q(BrandSafetyUtils.a(view));
            if (q != null) {
                if (!q.aw.containsKey(Integer.valueOf(hashCode)) && q.aw.size() <= q.g().size() + 1) {
                    q.aw.put(Integer.valueOf(hashCode), Long.valueOf(j));
                    Logger.d(J, "handle Ad Stage Switch Signal added to set, ts : ", Long.valueOf(j));
                }
                Logger.d(J, "handle Ad Stage Switch Signal, current stage : ", Integer.valueOf(q.aw.size()), ", keys : ", q.aw);
                if (q.aw.size() >= q.g().size() && !q.i().k) {
                    Logger.d(J, "handle Ad Stage Switch Signal, end card detected, eov ? ", Boolean.valueOf(q.i().k));
                    if (!q.i().k) {
                        m(str);
                        return;
                    }
                    return;
                }
                return;
            }
            Logger.d(J, "handle Ad Stage Switch Signal interstitialInfo not found ");
            return;
        }
        Logger.d(J, "handle Ad Stage Switch Signal, config does not allow this feature for this sdk. skipping.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public void g(final o oVar) {
        String c;
        String str;
        String str2;
        String str3;
        String str4;
        View view;
        Object obj;
        int i;
        AdNetworkDiscovery adNetworkDiscovery;
        int i2 = "scan for webViews - exit scanning";
        if (oVar == null || oVar.aq == null || oVar.aq.get() == null || oVar.am) {
            Logger.d(J, "scan for webViews activity is null, skipping");
            return;
        }
        Activity activity = oVar.aq.get();
        Object[] objArr = new Object[6];
        objArr[0] = "scan for webViews started, activity: ";
        objArr[1] = activity == null ? AbstractJsonLexerKt.NULL : activity.toString();
        objArr[2] = ", currentActivityInterstitial.resourceMatching: ";
        objArr[3] = oVar.J;
        objArr[4] = ", isOnUiThread = ";
        objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
        Logger.d(J, objArr);
        if (activity == null || !BrandSafetyUtils.h(activity.getClass().getName())) {
            if (oVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                try {
                    Logger.d(J, "scan for webViews : resourceMatching DEFAULT");
                    if (oVar.j() != null) {
                        View f = oVar.j().f();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList2.add(BrandSafetyUtils.a(f));
                        arrayList3.add("h1c1:" + f);
                        c = oVar.c() != null ? oVar.c() : "";
                        String str5 = c;
                        a(oVar, c, (ViewGroup) f, arrayList, arrayList2, arrayList3, 1);
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT found viewHierarchy ", arrayList3);
                        if (oVar.x() != null) {
                            Logger.d(J, "scan for webViews resourceMatching DEFAULT previous ViewsHierarchy size :  ", Integer.valueOf(oVar.x().size()), " , current : ", Integer.valueOf(arrayList2.size()));
                            long a2 = CreativeInfoManager.a(str5, AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
                            if (a2 > 0 && oVar.x().size() >= arrayList2.size() + a2) {
                                Logger.d(J, "scan for webViews resourceMatching DEFAULT End of video detected");
                                a(str5, BrandSafetyUtils.a(f), true, "native");
                            }
                        } else {
                            oVar.a(m.l, new m.a(m.L, "none"));
                        }
                        oVar.a(arrayList2);
                    }
                    Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                    oVar.am = false;
                    return;
                } catch (Throwable th) {
                    try {
                        Logger.e(J, "scan for webViews resourceMatching DEFAULT exception : ", th);
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                        oVar.am = false;
                        return;
                    } catch (Throwable th2) {
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                        oVar.am = false;
                        throw th2;
                    }
                }
            }
            return;
        }
        try {
            oVar.am = true;
            try {
                try {
                    View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                    AdNetworkDiscovery j = CreativeInfoManager.j(oVar.c());
                    c = oVar.c() != null ? oVar.c() : "";
                    if (j == null) {
                        Logger.d(J, "scan for webViews - exit scanning");
                        oVar.am = false;
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (findViewById != null) {
                        arrayList5.add(BrandSafetyUtils.a(findViewById));
                        arrayList6.add("h1c1:" + findViewById);
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        view = findViewById;
                        adNetworkDiscovery = j;
                        str = "ad_format";
                        str2 = m.l;
                        str4 = "none";
                        obj = "scan for webViews - exit scanning";
                        str3 = m.L;
                        i = 2;
                        a(oVar, c, viewGroup, arrayList4, arrayList5, arrayList6, 1);
                        a(arrayList4, oVar);
                        Logger.printFullVerboseLog(J, "scan for webViews found views hierarchy : ", arrayList6);
                    } else {
                        str = "ad_format";
                        str2 = m.l;
                        str3 = m.L;
                        str4 = "none";
                        view = findViewById;
                        obj = "scan for webViews - exit scanning";
                        i = 2;
                        adNetworkDiscovery = j;
                    }
                    if (oVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP) {
                        String L2 = oVar.j() != null ? oVar.j().L() : null;
                        Iterator<String> it = arrayList5.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (CreativeInfoManager.d.remove(next)) {
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = "scan for webViews - video start received for ";
                                objArr2[1] = next;
                                Logger.d(J, objArr2);
                                oVar.i().l = true;
                                break;
                            }
                        }
                        final WeakReference<WebView> a3 = adNetworkDiscovery.a((List<WeakReference<WebView>>) arrayList4, L2);
                        if (a3 == null || a3.get() == null) {
                            String str6 = str3;
                            Logger.d(J, "scan for webViews - WebView not found");
                            if (oVar.m == null) {
                                oVar.a(str2, new m.a(str6, str4));
                            }
                            oVar.a(arrayList5);
                        } else {
                            oVar.a(arrayList5);
                            oVar.b(arrayList4);
                            final String a4 = BrandSafetyUtils.a((Object) a3.get());
                            if (oVar.K == null) {
                                a(a4, str2, new m.a(str3, a4));
                            }
                            SafeDKWebAppInterface.a(a4);
                            if (oVar.K != null && oVar.K.equals(a4)) {
                                Logger.d(J, obj);
                                oVar.am = false;
                                return;
                            }
                            Object[] objArr3 = new Object[i];
                            objArr3[0] = "scan for webViews found ";
                            objArr3[1] = a3.get();
                            Logger.d(J, objArr3);
                            if (this.G != null) {
                                Iterator<v> it2 = this.G.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(a3);
                                }
                            }
                            boolean a5 = CreativeInfoManager.a(oVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                            Object[] objArr4 = new Object[i];
                            objArr4[0] = "scan for webViews, should detect multiple ads by web view change? ";
                            objArr4[1] = Boolean.valueOf(a5);
                            Logger.d(J, objArr4);
                            if (a5 && oVar.K != null && !oVar.K.equals(a4)) {
                                e(oVar, a4);
                            }
                            oVar.K = a4;
                            oVar.i().a(a4);
                            Object[] objArr5 = new Object[i];
                            objArr5[0] = "scan for webViews address set to ";
                            objArr5[1] = a4;
                            Logger.d(J, objArr5);
                            for (l lVar : oVar.g()) {
                                CreativeInfo j2 = lVar.j();
                                if (j2 != null) {
                                    Object[] objArr6 = new Object[i];
                                    objArr6[0] = "scan for webViews - current ci is: ";
                                    objArr6[1] = j2.aa();
                                    Logger.d(J, objArr6);
                                }
                                if (arrayList5.contains(lVar.b())) {
                                    Object[] objArr7 = new Object[i];
                                    objArr7[0] = "scan for webViews attempting to collect resources for ";
                                    objArr7[1] = a4;
                                    Logger.d(J, objArr7);
                                    com.safedk.android.analytics.brandsafety.creatives.g.a(oVar.c(), a4, lVar);
                                } else if (j2 != null) {
                                    Object[] objArr8 = new Object[4];
                                    objArr8[0] = "scan for webViews skip resources collection for address: ";
                                    objArr8[1] = a4;
                                    objArr8[i] = ", CI: ";
                                    objArr8[3] = j2.aa();
                                    Logger.d(J, objArr8);
                                }
                                if (j2 == null) {
                                    Object[] objArr9 = new Object[i];
                                    objArr9[0] = "scan for webViews will check for pending CIs for package ";
                                    objArr9[1] = oVar.c();
                                    Logger.d(J, objArr9);
                                    Iterator<p> it3 = a(oVar.c(), oVar).iterator();
                                    while (it3.hasNext()) {
                                        b(it3.next(), oVar);
                                    }
                                }
                            }
                            if (adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false) && oVar.A != null) {
                                String str7 = str;
                                if (oVar.A.containsKey(str7) && oVar.A.getString(str7).equals(BrandSafetyUtils.l)) {
                                    final AdNetworkDiscovery adNetworkDiscovery2 = adNetworkDiscovery;
                                    this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.10
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            WeakReference weakReference = a3;
                                            if (weakReference != null && weakReference.get() != null) {
                                                List<CreativeInfo> a6 = adNetworkDiscovery2.a(new WeakReference<>((View) a3.get()), (String) null, BrandSafetyUtils.AdType.INTERSTITIAL);
                                                if (a6 != null) {
                                                    for (CreativeInfo creativeInfo : a6) {
                                                        Logger.printFullVerboseLog(InterstitialFinder.J, "scan for webViews ci returned : ", creativeInfo.aa());
                                                        if (creativeInfo.n() == null) {
                                                            creativeInfo.h(oVar.L);
                                                        }
                                                        if (oVar.A != null && oVar.A.containsKey("ad_format")) {
                                                            BrandSafetyEvent.AdFormatType a7 = BrandSafetyUtils.a(oVar.A);
                                                            creativeInfo.a(a7);
                                                            oVar.d("ad_type_upd(scnFrWVs):" + a7);
                                                            Logger.d(InterstitialFinder.J, "scan for webViews ad_format set to  : ", a7);
                                                        }
                                                        InterstitialFinder.this.a(new p(creativeInfo, CreativeInfo.n, null, a4));
                                                    }
                                                    return;
                                                }
                                                Logger.d(InterstitialFinder.J, "scan for webViews ci not found by View");
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    } else {
                        String str8 = str4;
                        String str9 = str3;
                        if (view != null && oVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                            WeakReference<WebView> a6 = adNetworkDiscovery.a((List<WeakReference<WebView>>) arrayList4, (String) null);
                            if (a6 == null || a6.get() == null) {
                                Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) - WebView not found");
                            } else {
                                String a7 = BrandSafetyUtils.a((Object) a6.get());
                                if (oVar.K == null) {
                                    a(a7, str2, new m.a(str9, a7));
                                }
                                Object[] objArr10 = new Object[i];
                                objArr10[0] = "scan for webViews found (DIRECT_CREATIVE_INFO) ";
                                objArr10[1] = a7;
                                Logger.d(J, objArr10);
                                oVar.K = a7;
                                oVar.i().a(a7);
                                l i3 = oVar.i();
                                if (i3 != null) {
                                    Object[] objArr11 = new Object[i];
                                    objArr11[0] = "scan for webViews (DIRECT_CREATIVE_INFO) attempting to collect resources for ";
                                    objArr11[1] = a7;
                                    Logger.d(J, objArr11);
                                    com.safedk.android.analytics.brandsafety.creatives.g.a(oVar.c(), a7, i3);
                                }
                                oVar.a(arrayList5);
                            }
                        } else if (oVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                            if (oVar.m == null) {
                                oVar.a(str2, new m.a(str9, str8));
                            }
                            oVar.a(arrayList5);
                        }
                    }
                    Logger.d(J, obj);
                    oVar.am = false;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Object[] objArr12 = new Object[i2];
                        objArr12[0] = "scan for webViews execution: ";
                        objArr12[1] = th;
                        Logger.e(J, objArr12);
                        Logger.d(J, "scan for webViews - exit scanning");
                        oVar.am = false;
                    } catch (Throwable th4) {
                        Logger.d(J, "scan for webViews - exit scanning");
                        oVar.am = false;
                        throw th4;
                    }
                }
            } catch (RuntimeException e) {
                Logger.d(J, "Window/layout not ready yet, skipping.", e.getMessage());
                Logger.d(J, "scan for webViews - exit scanning");
                oVar.am = false;
            }
        } catch (Throwable th5) {
            th = th5;
            i2 = 2;
        }
    }

    private void e(o oVar, String str) {
        Logger.d(J, "handle web view change, web view change detected from: ", oVar.K, ", to: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        l i = oVar.i();
        if (i != null && i.j() != null && !i.j().an()) {
            i.j().ao();
            String h = i.j().h();
            if (h != null) {
                i.j().e(h + CreativeInfo.aI);
            }
        }
        oVar.g().add(new l(UUID.randomUUID().toString(), str));
        Logger.d(J, "handle WebView Change - new Impression info object created. number of impressions in ad : ", Integer.valueOf(oVar.g().size()));
        if (oVar.D == null) {
            oVar.D = UUID.randomUUID().toString();
        }
        oVar.af = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final o oVar, final Activity activity) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.2
            @Override // java.lang.Runnable
            public void run() {
                BrandSafetyUtils.AdType b2;
                BrandSafetyUtils.AdType a2;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
                String b3 = BrandSafetyUtils.b(activity.getClass());
                try {
                    if (oVar != null && oVar.k().isEmpty() && CreativeInfoManager.b(b3) == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && oVar.A != null && oVar.A.containsKey("ad_format") && oVar.A.get("ad_format") != null && CreativeInfoManager.a(b3, AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                        String y = oVar.y();
                        BrandSafetyEvent.AdFormatType a3 = BrandSafetyUtils.a(oVar.A);
                        Logger.d(InterstitialFinder.J, "try to find CI, ad format = ", a3, ", placement = ", y, ", activity sdk = ", b3);
                        List<CreativeInfo> b4 = InterstitialFinder.this.b(viewGroup, b3);
                        if (b4 != null) {
                            Logger.d(InterstitialFinder.J, "try to find CI, updating ad format value to ", a3);
                            InterstitialFinder.this.a(activity, oVar);
                            for (CreativeInfo creativeInfo : b4) {
                                if (creativeInfo.I() != null && a3 != null && (b2 = BrandSafetyUtils.b(creativeInfo.I())) != (a2 = BrandSafetyUtils.a(a3))) {
                                    Logger.d(InterstitialFinder.J, "try to find CI, skipping CI due to incompatible ad type - CI:", b2, ", max: ", a2);
                                } else {
                                    creativeInfo.a(a3);
                                    oVar.d("ad_type_upd(tryTFndCI):" + a3);
                                    creativeInfo.h(oVar.A.getString("id"));
                                    creativeInfo.j(oVar.A.getString(BrandSafetyEvent.k));
                                    Logger.d(InterstitialFinder.J, "try to find CI - ci event id : ", creativeInfo.n(), ", placement id : ", creativeInfo.F());
                                    InterstitialFinder.this.a(new p(creativeInfo, CreativeInfo.n));
                                }
                            }
                            return;
                        }
                        Logger.d(InterstitialFinder.J, "try to find CI - did not find CIs for event id: ", oVar.L);
                    }
                } catch (Throwable th) {
                    Logger.d(InterstitialFinder.J, "Exception while attempting to find CI : ", th.getMessage(), th);
                }
            }
        });
    }

    public void a(o oVar, String str, String str2) {
        oVar.aj = new h(System.currentTimeMillis(), str, null, str2);
    }

    public void g(String str, String str2) {
        Logger.d(J, "set current interstitial downstream struct started");
        List<o> a2 = this.I.a(str);
        if (a2.size() == 1) {
            o oVar = a2.get(0);
            if (oVar != null) {
                List<CreativeInfo> k = oVar.k();
                if (!k.isEmpty() && str2 != null) {
                    for (CreativeInfo creativeInfo : k) {
                        String h = creativeInfo.h();
                        if (h != null && !h.endsWith(str2)) {
                            creativeInfo.e(h + "/" + str2);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(J, "set current interstitial downstream struct, number of Infos for ", str, " is ", Integer.valueOf(a2.size()), ", cannot set downstream struct");
    }

    public void s(String str) {
        List<CreativeInfo> k;
        Logger.d(J, "stop collecting resources started");
        List<o> a2 = this.I.a(str);
        if (a2.size() == 1) {
            o oVar = a2.get(0);
            if (oVar != null && (k = oVar.k()) != null && !k.isEmpty()) {
                for (CreativeInfo creativeInfo : k) {
                    String h = creativeInfo.h();
                    if (h != null && h.contains(PangleCreativeInfo.E)) {
                        creativeInfo.a(true);
                    }
                }
                return;
            }
            return;
        }
        Logger.d(J, "stop collecting resources, number of Infos for ", str, " is ", Integer.valueOf(a2.size()), ", cannot stop collecting resources");
    }

    private class b implements Runnable {
        private final String b;
        private boolean c;
        private boolean d = true;
        private int e = 0;
        private boolean f = true;

        public b(String str, String str2) {
            boolean z = true;
            this.b = str;
            if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, false) && !CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false)) {
                z = false;
            }
            this.c = z;
        }

        private void a(o oVar) {
            Object[] objArr = new Object[8];
            objArr[0] = "scan for screenshots, info ";
            objArr[1] = oVar.L;
            objArr[2] = ", isCancelled = ";
            objArr[3] = oVar.al != null ? Boolean.valueOf(oVar.al.isCancelled()) : "?";
            objArr[4] = ", isDone = ";
            objArr[5] = oVar.al != null ? Boolean.valueOf(oVar.al.isDone()) : "?";
            objArr[6] = ", isOnUiThread = ";
            objArr[7] = Boolean.valueOf(com.safedk.android.utils.n.c());
            Logger.d(InterstitialFinder.J, objArr);
            if (oVar.j() == null && oVar.aq != null && oVar.aq.get() != null && CreativeInfoManager.a(BrandSafetyUtils.b(oVar.aq.get().getClass()), AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, info ", oVar.L, " calling tryToFindCI");
                InterstitialFinder.this.b(oVar, oVar.aq.get());
            }
            if (oVar.aq != null && oVar.aq.get() != null) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, activity sdk is ", BrandSafetyUtils.b(oVar.aq.get().getClass()));
            }
            if (!oVar.E && oVar.y == 2) {
                InterstitialFinder.this.c(oVar, "scanForScreenshots");
            }
            if (oVar.af) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, request to stop taking screenshots has been received, skipping.");
            } else {
                InterstitialFinder.this.a(oVar);
            }
            CreativeInfo j = oVar.j();
            if (oVar.y != 120 && (j == null || !j.aq())) {
                InterstitialFinder.this.g(oVar);
                if (oVar.k().isEmpty()) {
                    Logger.d(InterstitialFinder.J, "scan for screenshots, checking for pending CIs");
                    for (p pVar : InterstitialFinder.this.a(oVar.v, oVar)) {
                        if (pVar != null && pVar.a != null) {
                            Logger.d(InterstitialFinder.J, "scan for screenshots, calling set CI");
                            InterstitialFinder.this.b(pVar, oVar);
                        }
                    }
                    return;
                }
                return;
            }
            if (j == null || !j.aq()) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, max number of screenshots threshold reached, stop taking screenshots for event id ", this.b);
            } else {
                Logger.d(InterstitialFinder.J, "scan for screenshots, website end card detected, stop taking screenshots for event id ", this.b);
            }
            this.d = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: all -> 0x016f, TryCatch #0 {all -> 0x016f, blocks: (B:3:0x000a, B:5:0x0014, B:10:0x0026, B:16:0x0169, B:20:0x003a, B:22:0x0042, B:24:0x007e, B:26:0x008b, B:27:0x0092, B:29:0x009d, B:33:0x00ba, B:35:0x00d2, B:38:0x00dc, B:41:0x00e4, B:43:0x00ea, B:44:0x00f0, B:46:0x0103, B:48:0x010b, B:50:0x0122, B:53:0x012b, B:55:0x013e, B:57:0x0151), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013e A[Catch: all -> 0x016f, TryCatch #0 {all -> 0x016f, blocks: (B:3:0x000a, B:5:0x0014, B:10:0x0026, B:16:0x0169, B:20:0x003a, B:22:0x0042, B:24:0x007e, B:26:0x008b, B:27:0x0092, B:29:0x009d, B:33:0x00ba, B:35:0x00d2, B:38:0x00dc, B:41:0x00e4, B:43:0x00ea, B:44:0x00f0, B:46:0x0103, B:48:0x010b, B:50:0x0122, B:53:0x012b, B:55:0x013e, B:57:0x0151), top: B:2:0x000a }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(o oVar, boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            AdNetworkDiscovery j;
            try {
                List<Integer> B = com.safedk.android.internal.d.B();
                List<Integer> D = com.safedk.android.internal.d.D();
                if (!z && !B.contains(Integer.valueOf(this.e))) {
                    z3 = false;
                    if (!z2 && !D.contains(Integer.valueOf(this.e))) {
                        z4 = false;
                        if ((!z3 || z4) && com.safedk.android.utils.n.a((Reference<?>) oVar.aq)) {
                            Logger.d(InterstitialFinder.J, "inject periodic script, cycle: ", Integer.valueOf(this.e));
                            String str = oVar.v;
                            List<WeakReference<WebView>> b = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) oVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                            j = CreativeInfoManager.j(str);
                            if (j != null) {
                                WeakReference<WebView> a = j.a(b, (String) null);
                                Object[] objArr = new Object[2];
                                objArr[0] = "inject periodic script, webView: ";
                                objArr[1] = a != null ? a.get() : AbstractJsonLexerKt.NULL;
                                Logger.d(InterstitialFinder.J, objArr);
                                if (com.safedk.android.utils.n.a((Reference<?>) a)) {
                                    com.safedk.android.analytics.brandsafety.creatives.b k = CreativeInfoManager.k(str);
                                    String a2 = BrandSafetyUtils.a((Object) a.get());
                                    boolean z5 = a.get().getVisibility() == 0;
                                    if (!z5) {
                                        Logger.d(InterstitialFinder.J, "webView: ", a.get(), " is not visible - will not collect resources in this cycle");
                                    }
                                    if (z3 && k.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN) && z5) {
                                        List<String> x = oVar.x();
                                        if (a2 != null && x != null && !x.contains(a2)) {
                                            x.add(a2);
                                            oVar.a(x);
                                        }
                                        SafeDKWebAppInterface.a(str, a.get(), SafeDKWebAppInterface.b(str, a2, oVar.w()));
                                    }
                                    if (z4 && k.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
                                        String str2 = "javascript:" + SafeDKWebAppInterface.c(str, a2);
                                        if (str2 != null) {
                                            SafeDKWebAppInterface.a(str, a.get(), str2);
                                        }
                                    }
                                }
                            }
                            if (this.e >= B.get(B.size() - 1).intValue() && this.e >= D.get(D.size() - 1).intValue()) {
                                Logger.d(InterstitialFinder.J, "inject periodic script, reached or surpassed last interval: ", Integer.valueOf(this.e), " for wither eresources collection intervals or video observer intervals");
                                this.c = false;
                            }
                        }
                        this.e++;
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    Logger.d(InterstitialFinder.J, "inject periodic script, cycle: ", Integer.valueOf(this.e));
                    String str3 = oVar.v;
                    List<WeakReference<WebView>> b2 = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) oVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                    j = CreativeInfoManager.j(str3);
                    if (j != null) {
                    }
                    if (this.e >= B.get(B.size() - 1).intValue()) {
                        Logger.d(InterstitialFinder.J, "inject periodic script, reached or surpassed last interval: ", Integer.valueOf(this.e), " for wither eresources collection intervals or video observer intervals");
                        this.c = false;
                    }
                    this.e++;
                }
                z3 = true;
                if (!z2) {
                    z4 = false;
                    if (!z3) {
                    }
                    Logger.d(InterstitialFinder.J, "inject periodic script, cycle: ", Integer.valueOf(this.e));
                    String str32 = oVar.v;
                    List<WeakReference<WebView>> b22 = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) oVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                    j = CreativeInfoManager.j(str32);
                    if (j != null) {
                    }
                    if (this.e >= B.get(B.size() - 1).intValue()) {
                    }
                    this.e++;
                }
                z4 = true;
                if (!z3) {
                }
                Logger.d(InterstitialFinder.J, "inject periodic script, cycle: ", Integer.valueOf(this.e));
                String str322 = oVar.v;
                List<WeakReference<WebView>> b222 = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) oVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                j = CreativeInfoManager.j(str322);
                if (j != null) {
                }
                if (this.e >= B.get(B.size() - 1).intValue()) {
                }
                this.e++;
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.J, "interstitial finder task execution: ", th.getMessage(), th);
            }
        }

        private void b(o oVar) {
            try {
                if (com.safedk.android.utils.n.a((Reference<?>) oVar.aq)) {
                    String str = oVar.v;
                    List<WeakReference<WebView>> b = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) oVar.aq.get().getWindow().getDecorView().findViewById(R.id.content)));
                    AdNetworkDiscovery j = CreativeInfoManager.j(str);
                    if (j != null) {
                        WeakReference<WebView> a = j.a(b, (String) null);
                        Object[] objArr = new Object[2];
                        objArr[0] = "inject dsp pp click detection script, webView: ";
                        objArr[1] = a != null ? a.get() : AbstractJsonLexerKt.NULL;
                        Logger.d(InterstitialFinder.J, objArr);
                        if (com.safedk.android.utils.n.a((Reference<?>) a)) {
                            String a2 = BrandSafetyUtils.a((Object) a.get());
                            if (!(a.get().getVisibility() == 0)) {
                                Logger.d(InterstitialFinder.J, "inject dsp pp click detection script webView: ", a.get(), " is not visible - will not inject");
                                return;
                            }
                            SafeDKWebAppInterface.a(str, a.get(), SafeDKWebAppInterface.b(str, a2));
                            this.f = false;
                            Logger.d(InterstitialFinder.J, "inject dsp pp click detection script webView: ", a.get(), " injected");
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.J, "nject dsp pp click detection interstitial finder task execution: ", th.getMessage(), th);
            }
        }

        private CreativeInfo c(o oVar) {
            Object th;
            CreativeInfo creativeInfo;
            AdNetworkDiscovery j;
            l i;
            try {
                String str = oVar.v;
                Logger.d(InterstitialFinder.J, Logger.FeatureTag.CI_MATCHING, "try periodic ci matching, sdk: ", str, ", event id: ", oVar.L);
                if (str == null || (j = CreativeInfoManager.j(str)) == null || (i = oVar.i()) == null || i.n == null || i.n.isEmpty()) {
                    return null;
                }
                creativeInfo = j.a(i.n);
                if (creativeInfo != null) {
                    try {
                        creativeInfo.a(CreativeInfo.l, null, null);
                    } catch (Throwable th2) {
                        th = th2;
                        Logger.e(InterstitialFinder.J, "interstitial finder task execution: ", th);
                        return creativeInfo;
                    }
                }
                return creativeInfo;
            } catch (Throwable th3) {
                th = th3;
                creativeInfo = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CreativeInfo c;
            boolean z;
            try {
                if (this.b == null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, event id is null, skipping.");
                    return;
                }
                o oVar = InterstitialFinder.this.I.get(this.b);
                if (oVar == null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, did not find interstitial info for event id: ", this.b);
                    return;
                }
                if (oVar.at) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, restart periodic script injection");
                    this.e = 0;
                    if (!CreativeInfoManager.a(oVar.v, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true) && !CreativeInfoManager.a(oVar.v, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false)) {
                        z = false;
                        this.c = z;
                        oVar.at = false;
                    }
                    z = true;
                    this.c = z;
                    oVar.at = false;
                }
                if (this.d && !oVar.an) {
                    a(oVar);
                }
                if (this.c) {
                    a(oVar, false, false);
                }
                if (this.f) {
                    b(oVar);
                }
                com.safedk.android.analytics.brandsafety.creatives.g.a((List<WeakReference<WebView>>) InterstitialFinder.this.f(oVar), oVar);
                if (oVar.j() == null && (c = c(oVar)) != null) {
                    c.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                    c.b(oVar.K, WebView.class.getCanonicalName());
                    InterstitialFinder.this.a(new p(c, c.X()), oVar);
                }
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.J, "interstitial finder task execution: ", th);
            }
        }
    }

    private class a {
        String a;
        String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            a aVar = (a) o;
            boolean equals = this.a.equals(aVar.a);
            String str = this.b;
            if (str != null) {
                return equals && str.equals(aVar.b);
            }
            return equals;
        }

        public int hashCode() {
            if (this.b != null) {
                return this.a.hashCode() * this.b.hashCode();
            }
            return this.a.hashCode();
        }

        public String toString() {
            return "{placementId=" + this.a + ", eventId=" + this.b + "}";
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("_");
            String str2 = this.b;
            sb.append(str2 != null ? str2 : "");
            return sb.toString();
        }
    }

    private static View a(ViewGroup viewGroup, String str) {
        Logger.d(J, "find views ", viewGroup.toString());
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Logger.d(J, "find views child ", childAt.toString());
            if (str != null && childAt.getClass().getName().equals(str)) {
                Logger.d(J, "find views found ", str, " : ", childAt.toString());
                return childAt;
            }
            if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CreativeInfo> b(ViewGroup viewGroup, String str) {
        List<CreativeInfo> a2;
        Logger.d(J, "get creative info from ad view started : ", viewGroup.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Logger.d(J, "get creative info from ad view - child ", childAt.toString());
            AdNetworkDiscovery j = CreativeInfoManager.j(str);
            if (j != null && (a2 = j.a(new WeakReference<>(childAt), (String) null, BrandSafetyUtils.AdType.INTERSTITIAL)) != null) {
                for (CreativeInfo creativeInfo : a2) {
                    creativeInfo.a((Object) childAt);
                    creativeInfo.u("ci_source_sdk_class=" + childAt.getClass().getName());
                    Logger.d(J, Logger.FeatureTag.CI_MATCHING, "get creative info from ad view - ci found, object : ", childAt.toString());
                }
                return a2;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    public static void a(View view, int i) {
        Logger.d(J, "find views view : ", new String(new char[i * 2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "-"), view.getClass().toString(), new StringBuilder().toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
        synchronized (this.C) {
            Logger.printFullVerboseLog(J, "adInfoCollectionForUpload count = ", Integer.valueOf(this.C.size()), " : ", this.C);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, z zVar) {
        c b2 = b(str, zVar);
        if (b2 instanceof o) {
            c((o) b2, "handleWebsiteOpened");
            return true;
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c(String str, String str2, String str3) {
        o a2 = this.I.a(str, false);
        if (a2 == null) {
            Logger.d(J, "pass message to ad info - info is null");
            return;
        }
        if (com.safedk.android.analytics.brandsafety.b.y.equals(str3)) {
            a2.a(str2, true);
        } else {
            a2.d(str2);
        }
        Logger.d(J, "pass message to ad info - message: ", str2, " has passed to info: ", a2);
    }

    public boolean i() {
        synchronized (this.I) {
            Iterator<o> it = this.I.values().iterator();
            while (it.hasNext()) {
                if (!it.next().U) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z) {
        if (cVar instanceof o) {
            c((o) cVar, str);
        }
    }
}
