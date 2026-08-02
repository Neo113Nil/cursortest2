package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
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
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class BannerFinder extends com.safedk.android.analytics.brandsafety.b {
    protected static final int I = 5;
    protected static final long J = 1000;
    protected static final long K = 500;
    protected static final long N = 10;
    protected final LinkedHashSetWithItemLimit<String> O;
    private final HashSet<d> T;
    private final Set<String> U;
    protected static final Map<d, e> L = new ConcurrentHashMap();
    protected static final Map<String, List<p>> M = new ConcurrentHashMap();
    private static h P = null;
    private static final Map<String, List<WeakReference<MaxAdView>>> Q = new ConcurrentHashMap();
    private static final Map<String, BrandSafetyUtils.AdType> R = new ConcurrentHashMap();
    private static final Map<String, d> S = new ConcurrentHashMap();

    public static Map<String, BrandSafetyUtils.AdType> f() {
        return R;
    }

    public Set<String> i() {
        return this.U;
    }

    public BannerFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.BANNER, Arrays.asList("BANNER", BrandSafetyUtils.n), "BannerFinder", maxAttemptsToCaptureImage);
        this.T = new HashSet<>();
        this.U = new HashSet();
        this.O = new LinkedHashSetWithItemLimit<>(N);
        l();
    }

    protected BannerFinder(BrandSafetyUtils.AdType adType, List<String> supportedAdFormats, String logTag, int maxAttemptsToCaptureImage) {
        super(adType, supportedAdFormats, logTag, maxAttemptsToCaptureImage);
        this.T = new HashSet<>();
        this.U = new HashSet();
        this.O = new LinkedHashSetWithItemLimit<>(N);
        l();
    }

    private void l() {
        e eVar;
        this.H = new PersistentConcurrentHashMap("SafeDKRedirects." + com.safedk.android.utils.n.a(SafeDK.getInstance().m()));
        Logger.d("BannerFinder", "handle saved redirects from previous session, found ", Integer.valueOf(this.H.size()), " redirects", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.H.keySet()) {
            RedirectData redirectData = this.H.get(str);
            if (redirectData != null && (redirectData.i || redirectData.j)) {
                redirectData.a("UnmatchedRedirectWebview=" + str);
                if (redirectData.t == BrandSafetyEvent.AdFormatType.MREC) {
                    eVar = new s(redirectData.r, redirectData.s);
                } else {
                    if (redirectData.t == null) {
                        redirectData.t = BrandSafetyEvent.AdFormatType.BANNER;
                        redirectData.a("UnmatchedRedirectFallback=BANNER");
                    }
                    eVar = new e(redirectData.r, redirectData.s);
                }
                e eVar2 = eVar;
                eVar2.a(F.get(str));
                BrandSafetyEvent a2 = a(eVar2, new l(redirectData), true, false, Long.MAX_VALUE, (String) null);
                a2.c(true);
                a2.a(SafeDK.getInstance().e());
                arrayList.add(a2);
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
            this.H.clear();
        } else {
            Logger.w("BannerFinder", "handle saved redirects from previous session, cannot report brand safety event");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new e(str, str2, str3, screenShotOrientation, str4, str5);
    }

    protected e a(Activity activity, String str, int i, String str2, Bundle bundle, String str3) {
        e eVar = new e(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i, str2, bundle, str3);
        eVar.ag = new WeakReference<>(activity);
        return eVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String str;
        d dVar;
        String str2;
        String str3;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p() || SafeDK.getInstance() == null || !SafeDK.getInstance().q()) {
            return;
        }
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.b.contains(messageData.getString("ad_format"))) {
            Logger.d(this.a, "Revenue event detected : ", messageData);
            string = "revenue_event";
        } else {
            string = messageData.getString("type");
        }
        String string2 = messageData.getString("ad_format");
        String string3 = messageData.getString(BrandSafetyEvent.k);
        String string4 = messageData.getString(BrandSafetyEvent.l);
        String string5 = messageData.getString("id", null);
        if (string5 == null) {
            Logger.d(this.a, "No eventId in data bundle, cannot match");
        }
        String string6 = messageData.getString(BrandSafetyEvent.ad);
        String c = CreativeInfoManager.c(string6);
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = com.safedk.android.utils.n.b(currentTimeMillis);
        if (!messageData.containsKey("creative_id")) {
            str = null;
        } else {
            str = messageData.getString("creative_id");
        }
        if (this.b.contains(string2)) {
            Logger.d(this.a, "Max message received, package: ", c, ", ts (seconds): ", Long.valueOf(b2), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            String str4 = str;
            d dVar2 = new d(string4, string3, string5, c, string6, BrandSafetyUtils.b(string2));
            if (!"WILL_DISPLAY".equals(string)) {
                if ("revenue_event".equals(string)) {
                    if (c != null && f(string6, c)) {
                        Logger.d(this.a, "REVENUE_EVENT event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.k, new m.a(m.K, messageData.getString("revenue_event")));
                    }
                    a(string6, c, str4, dVar2, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (f(string6, c)) {
                        e eVar = L.get(dVar2);
                        Logger.d(this.a, "DID_CLICKED event currentActivityBanner = ", eVar);
                        a(string5, m.h, new m.a[0]);
                        if (eVar != null) {
                            String str5 = this.a;
                            Object[] objArr = new Object[4];
                            objArr[0] = "DID_CLICKED event for package=";
                            objArr[1] = c == null ? string6 : c;
                            objArr[2] = ", slot count=";
                            objArr[3] = Integer.valueOf(this.d);
                            Logger.d(str5, objArr);
                            d(dVar2);
                            return;
                        }
                        Logger.d(this.a, "DID_CLICKED event cannot find banner key ", dVar2);
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (c != null && f(string6, c)) {
                        Logger.d(this.a, "WILL_LOAD event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.d, new m.a(m.N, string6));
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (c != null && f(string6, c)) {
                        Logger.d(this.a, "DID_HIDE event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.i, new m.a[0]);
                        c(dVar2);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (c != null && f(string6, c)) {
                        Logger.d(this.a, "DID_LOAD event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.e, new m.a(m.N, string6));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (c != null && f(string6, c)) {
                        Logger.d(this.a, "DID_DISPLAY event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                        a(string5, m.g, new m.a[0]);
                        a(c, dVar2, str4, messageData, currentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && c != null && f(string6, c)) {
                    Logger.d(this.a, "DID_FAIL_DISPLAY event for package=", c, " banner key=", dVar2, ", slot count=", Integer.valueOf(this.d));
                    a(string5, m.j, new m.a[0]);
                    a(dVar2);
                    return;
                }
                return;
            }
            if (c != null) {
                str3 = string6;
                if (!f(str3, c)) {
                    dVar = dVar2;
                    str2 = str4;
                } else {
                    dVar = dVar2;
                    Logger.d(this.a, "WILL_DISPLAY event for package=", c, " banner key=", dVar, ", slot count=", Integer.valueOf(this.d));
                    str2 = str4;
                    CreativeInfoManager.a(c, string3, str2, string5, string2);
                    a(string5, m.f, new m.a(m.L, BrandSafetyUtils.n(messageData.getString("ad_view"))));
                }
            } else {
                dVar = dVar2;
                str2 = str4;
                str3 = string6;
            }
            a(str3, c, str2, dVar, messageData, currentTimeMillis);
        }
    }

    private void a(d dVar) {
        e eVar = L.get(dVar);
        if (eVar != null) {
            eVar.N = true;
        }
    }

    public boolean m(String str) {
        Set<d> keySet;
        if (str != null) {
            synchronized (L) {
                keySet = L.keySet();
            }
            if (!keySet.isEmpty()) {
                Iterator<d> it = keySet.iterator();
                while (it.hasNext()) {
                    e eVar = L.get(it.next());
                    Logger.d(this.a, "is banner web view address: banner view: ", eVar.K, " given address: ", str, " view hierarchy: ", eVar.m);
                    if ((eVar.K != null && str.equals(eVar.K)) || (eVar.m != null && eVar.m.contains(str))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private class b implements Runnable {
        String a;
        String b;
        String c;
        d d;
        Bundle e;
        int f = 0;
        int g = 0;
        ScheduledFuture<?> h;

        public b(String str, String str2, d dVar, Bundle bundle) {
            this.a = dVar.e;
            this.b = str;
            this.c = str2;
            this.d = dVar;
            this.e = bundle;
            Logger.d(BannerFinder.this.a, "web view scanner created, networkName = ", this.a, ", packageName = ", str, ", maxCreativeId = ", str2, ", adInfoKey = ", dVar, ", applovinData = ", bundle, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x031b A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x038f A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x03cf A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x044d A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0436 A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x03b2 A[Catch: Exception -> 0x04c0, TryCatch #0 {Exception -> 0x04c0, blocks: (B:18:0x0059, B:20:0x0062, B:22:0x008d, B:24:0x00bf, B:25:0x00c5, B:27:0x00cb, B:31:0x00d9, B:32:0x00f1, B:35:0x00fa, B:37:0x00fe, B:40:0x038f, B:41:0x03c1, B:43:0x03cf, B:45:0x03e3, B:47:0x03ea, B:49:0x03f0, B:51:0x0447, B:53:0x044d, B:54:0x03f6, B:57:0x0416, B:59:0x041c, B:61:0x0420, B:62:0x040c, B:66:0x0436, B:67:0x03b2, B:68:0x0123, B:70:0x0129, B:72:0x015f, B:73:0x0169, B:76:0x01a8, B:78:0x0232, B:82:0x0244, B:83:0x0247, B:85:0x0256, B:88:0x0262, B:90:0x0268, B:91:0x0270, B:93:0x0276, B:95:0x0286, B:97:0x028f, B:100:0x02c8, B:102:0x02cc, B:104:0x02d4, B:105:0x02fd, B:107:0x031b, B:109:0x0335, B:111:0x033b, B:114:0x035d, B:116:0x0361, B:117:0x01ae, B:119:0x01b4, B:121:0x01d6, B:125:0x01ef, B:127:0x01f7, B:129:0x020f, B:131:0x0213, B:133:0x0223, B:135:0x022f, B:139:0x045a, B:141:0x045f, B:143:0x0465, B:146:0x046e, B:149:0x04b9, B:151:0x0474, B:153:0x0478), top: B:17:0x0059 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            e eVar;
            ArrayList arrayList;
            boolean z;
            ArrayList arrayList2;
            int i;
            try {
                boolean a = CreativeInfoManager.a(this.b, AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
                boolean z2 = (SafeDK.getInstance() == null || SafeDK.getInstance().z() == null || !SafeDK.getInstance().z().i()) ? false : true;
                if (a && z2) {
                    Logger.d(BannerFinder.this.a, "web view scanner - fullscreen ad is displaying, postpone scanning. sdk= ", this.b);
                    return;
                }
                String string = this.e.getString("ad_view");
                e eVar2 = BannerFinder.L.get(this.d);
                if (eVar2 != null) {
                    try {
                        if (eVar2.ab) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            if (!BannerFinder.this.a(this.b, this.c, this.d, string, arrayList3, arrayList4, arrayList5).booleanValue()) {
                                Logger.d(BannerFinder.this.a, "web view scanner - wvscanner - cancel task, eventId:", this.d.c, ", scanCounter: ", Integer.valueOf(this.f), ", banner impression not found for adNetworkView: ", string);
                                BannerFinder.this.a(this.d, this.h);
                                return;
                            }
                            Iterator<String> it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (CreativeInfoManager.d.remove(next)) {
                                    Logger.d(BannerFinder.this.a, "web view scanner - video start received for ", next);
                                    eVar2.i().l = true;
                                    break;
                                }
                            }
                            if (arrayList3.isEmpty() && eVar2.K == null) {
                                this.f++;
                                Logger.d(BannerFinder.this.a, "web view scanner - failed to find view, scan counter: ", Integer.valueOf(this.f), " view address:", eVar2.K);
                                arrayList = arrayList3;
                            } else if (!arrayList3.isEmpty()) {
                                this.f++;
                                Logger.d(BannerFinder.this.a, "web view scanner - found view, scan counter: ", Integer.valueOf(this.f), " view address:", eVar2.K);
                                arrayList = arrayList3;
                                BannerFinder.this.a(this.d, arrayList);
                                WeakReference d = BannerFinder.this.d(arrayList);
                                String a2 = com.safedk.android.utils.n.a((Reference<?>) d) ? BrandSafetyUtils.a(d.get()) : null;
                                Logger.d(BannerFinder.this.a, "web view scanner - adInfoKey.webviewAddress: ", this.d.g, ", adInfoKey.isWebviewReplaced: ", Boolean.valueOf(this.d.i));
                                AdNetworkDiscovery j = CreativeInfoManager.j(eVar2.v);
                                com.safedk.android.analytics.brandsafety.creatives.b k = CreativeInfoManager.k(this.b);
                                boolean z3 = d.get() instanceof WebView;
                                if ((this.d.g == null || this.d.i) && com.safedk.android.utils.n.a((Reference<?>) d)) {
                                    this.d.g = BrandSafetyUtils.a(d.get());
                                    Logger.d(BannerFinder.this.a, "web view scanner - info: ", eVar2);
                                    if (eVar2.K == null) {
                                        com.safedk.android.analytics.brandsafety.b.a(this.d.g, m.l, new m.a(m.L, a2));
                                        eVar2.K = a2;
                                    }
                                    if (z3 && j != null && k != null && k.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION)) {
                                        BrandSafetyUtils.AdType a3 = com.safedk.android.analytics.brandsafety.b.a(this.b, (WebView) d.get());
                                        CreativeInfo a4 = j.a((Object) eVar2.i().o);
                                        if (a4 != null && a3 == BrandSafetyUtils.AdType.BANNER) {
                                            a4.a(BrandSafetyEvent.AdFormatType.BANNER);
                                            a4.a(BrandSafetyUtils.AdType.BANNER);
                                            if (a4.h() != null && a4.h().contains(CreativeInfo.w)) {
                                                a4.T();
                                            }
                                        }
                                    }
                                }
                                boolean f = BannerFinder.this.f(this.a, this.b);
                                if (this.b != null && f) {
                                    if (j != null) {
                                        j.a(eVar2, arrayList4, string);
                                    }
                                    eVar2.a(arrayList4);
                                    List<WeakReference<WebView>> b = BannerFinder.this.b(arrayList);
                                    if (BannerFinder.this.G != null && BannerFinder.this.G.size() > 0 && b != null && b.size() > 0) {
                                        Iterator<v> it2 = BannerFinder.this.G.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().a(b.get(0));
                                        }
                                    }
                                    eVar2.b(b);
                                    if (com.safedk.android.utils.n.a((Reference<?>) d)) {
                                        boolean a5 = CreativeInfoManager.a(this.b, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                                        boolean H = eVar2.H();
                                        Logger.d(BannerFinder.this.a, "web view scanner - should detect multiple ads by web view change? ", Boolean.valueOf(a5), ", isNativeAd = ", Boolean.valueOf(H));
                                        String a6 = BrandSafetyUtils.a(d.get());
                                        if (!H && a5 && eVar2.K != null && !eVar2.K.equals(a6)) {
                                            Logger.d(BannerFinder.this.a, "web view scanner - webview change starts for maxCreativeId: ", this.c);
                                            com.safedk.android.analytics.brandsafety.b.a(a6, m.l, new m.a(m.L, a2));
                                            BannerFinder.this.a(eVar2, a6);
                                            z = true;
                                            Logger.d(BannerFinder.this.a, "web view scanner - setting taskFuture for adInfoKey: ", this.d);
                                            eVar2.af = this.h;
                                            if (com.safedk.android.utils.n.a((Reference<?>) d)) {
                                                BannerFinder.this.a(eVar2, (WeakReference<View>) d);
                                                BannerFinder.this.a(this.b, this.c, this.d, (WeakReference<View>) d);
                                                if (CreativeInfoManager.a(this.b, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false) && eVar2.j() == null) {
                                                    Logger.d(BannerFinder.this.a, "web view scanner - keep scanning until we have a match. scan counter: ", Integer.valueOf(this.f), ", activity banner key: ", this.d);
                                                }
                                            }
                                            if (!z) {
                                                Logger.d(BannerFinder.this.a, "web view scanner - calling reportCompletedBanners");
                                                BannerFinder.this.a(arrayList, arrayList5, this.d, eVar2.aj);
                                            } else {
                                                Logger.d(BannerFinder.this.a, "web view scanner - not calling reportCompletedBanners");
                                            }
                                            if (BannerFinder.this.a(eVar2, arrayList4, this.d).booleanValue()) {
                                                List list = (List) BannerFinder.Q.get(this.d.a);
                                                String n = BrandSafetyUtils.n(string);
                                                if (list == null || list.size() != 1 || TextUtils.isEmpty(n)) {
                                                    arrayList2 = arrayList5;
                                                    Logger.d(BannerFinder.this.a, "web view scanner - shouldn't be here, adding debug info...");
                                                    if (list == null) {
                                                        i = 1;
                                                    } else if (list.size() == 1) {
                                                        i = 0;
                                                    } else {
                                                        i = 2;
                                                    }
                                                    if (TextUtils.isEmpty(n)) {
                                                        i += 4;
                                                    }
                                                    if (i > 0) {
                                                        eVar2.d("rpr" + i);
                                                    }
                                                } else {
                                                    arrayList2 = arrayList5;
                                                    com.safedk.android.analytics.brandsafety.creatives.g.a(arrayList2, eVar2);
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                                Logger.d(BannerFinder.this.a, "web view scanner - matching webview not in current hierarchy - skipping resources propagation");
                                            }
                                            if (arrayList2.size() > 0) {
                                                BannerFinder.this.a(eVar2, (WeakReference<WebView>) arrayList2.get(0), this.g);
                                            }
                                        }
                                    }
                                    z = false;
                                    Logger.d(BannerFinder.this.a, "web view scanner - setting taskFuture for adInfoKey: ", this.d);
                                    eVar2.af = this.h;
                                    if (com.safedk.android.utils.n.a((Reference<?>) d)) {
                                    }
                                    if (!z) {
                                    }
                                    if (BannerFinder.this.a(eVar2, arrayList4, this.d).booleanValue()) {
                                    }
                                    if (arrayList2.size() > 0) {
                                    }
                                } else if (this.h != null) {
                                    Logger.d(BannerFinder.this.a, "web view scanner - cancel task, packageName: ", this.b, ", shouldHandleMaxMsg: ", Boolean.valueOf(f));
                                    BannerFinder.this.a(this.d, this.h);
                                }
                            } else {
                                arrayList = arrayList3;
                            }
                            z = false;
                            if (!z) {
                            }
                            if (BannerFinder.this.a(eVar2, arrayList4, this.d).booleanValue()) {
                            }
                            if (arrayList2.size() > 0) {
                            }
                        }
                        boolean z4 = this.f >= 5 && a() && b();
                        if ((!eVar2.ab || z4) && this.h != null) {
                            Logger.d(BannerFinder.this.a, "web view scanner - cancel task, is active: ", Boolean.valueOf(eVar2.ab), ", scan counter: ", Integer.valueOf(this.f), ", event ID: ", eVar2.w());
                            BannerFinder.this.a(eVar2, false, "WebviewScannerTask");
                            BannerFinder.this.a(this.d, this.h);
                        }
                        this.g++;
                    } catch (Exception e) {
                        e = e;
                        eVar = eVar2;
                        Logger.e(BannerFinder.this.a, "web view scanner - exception", e);
                        if (eVar != null) {
                            eVar.d("wvste=" + e.getMessage());
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                eVar = null;
            }
        }

        private boolean a() {
            List<Integer> C = com.safedk.android.internal.d.C();
            return C == null || C.isEmpty() || this.g >= C.get(C.size() - 1).intValue();
        }

        private boolean b() {
            List<Integer> E = com.safedk.android.internal.d.E();
            return E == null || E.isEmpty() || this.g >= E.get(E.size() - 1).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<WebView> weakReference, int i) {
        boolean contains = com.safedk.android.internal.d.C().contains(Integer.valueOf(i));
        boolean contains2 = com.safedk.android.internal.d.E().contains(Integer.valueOf(i));
        if (contains || contains2) {
            Logger.d(this.a, "inject periodic script, cycle: ", Integer.valueOf(i));
            String str = eVar.v;
            if (CreativeInfoManager.j(str) != null && com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                com.safedk.android.analytics.brandsafety.creatives.b k = CreativeInfoManager.k(str);
                String a2 = BrandSafetyUtils.a((Object) weakReference.get());
                if (!(weakReference.get().getVisibility() == 0)) {
                    String str2 = this.a;
                    Object[] objArr = new Object[3];
                    objArr[0] = "webView: ";
                    objArr[1] = weakReference != null ? weakReference.get() : AbstractJsonLexerKt.NULL;
                    objArr[2] = " is not visible - will not collect resources in this cycle";
                    Logger.d(str2, objArr);
                    return;
                }
                if (contains && k != null && k.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_BANNERS)) {
                    List<String> x = eVar.x();
                    if (a2 != null && x != null && !x.contains(a2)) {
                        x.add(a2);
                        eVar.a(x);
                    }
                    SafeDKWebAppInterface.a(str, weakReference.get(), SafeDKWebAppInterface.b(str, a2, eVar.w()));
                }
                if (contains2 && k != null && k.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
                    String str3 = "javascript:" + SafeDKWebAppInterface.c(str, a2);
                    if (str3 != null) {
                        SafeDKWebAppInterface.a(str, weakReference.get(), str3);
                    }
                }
            }
        }
    }

    public void a(CreativeInfo creativeInfo) {
        Set<d> keySet;
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            for (d dVar : keySet) {
                e eVar = L.get(new d(dVar.a, creativeInfo.F(), creativeInfo.n(), creativeInfo.Q(), dVar.e, creativeInfo.K()));
                if (eVar != null) {
                    if (eVar.m() != null && eVar.m().b != null) {
                        BrandSafetyUtils.d(eVar.m().b);
                        eVar.i().l();
                    }
                    if (eVar.D == null) {
                        eVar.D = UUID.randomUUID().toString();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<View> weakReference) {
        String a2 = BrandSafetyUtils.a(weakReference.get());
        RedirectData redirectData = this.H.get(a2);
        Logger.d(this.a, "web view scanner - check for pending redirect: ", redirectData, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (redirectData != null) {
            redirectData.a("LateMatchedRedirectWebview=" + a2);
            if (redirectData.t == null) {
                redirectData.t = BrandSafetyUtils.a(this.c);
            }
            if (redirectData.j) {
                eVar.V = true;
            }
            l i = eVar.i();
            if (i != null) {
                i.a(redirectData);
                this.H.remove(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, String str) {
        Logger.d(this.a, "handle web view change - web view change detected from: ", eVar.K, ", to: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        l i = eVar.i();
        if (i != null && i.j() != null && !i.j().an()) {
            i.j().ao();
            String h = i.j().h();
            if (h != null) {
                i.j().e(h + CreativeInfo.aI);
            }
        }
        eVar.K = str;
        eVar.g().add(new l(UUID.randomUUID().toString(), str));
        if (eVar.D == null) {
            eVar.D = UUID.randomUUID().toString();
        }
        eVar.ad = false;
    }

    private void a(String str, String str2, d dVar, Bundle bundle) {
        if (this.T.contains(dVar)) {
            Logger.d(this.a, "webview scanner already created for: ", dVar.c);
            return;
        }
        Logger.d(this.a, "creating webview scanner task for: ", dVar);
        synchronized (this.T) {
            this.T.add(dVar);
        }
        b bVar = new b(str, str2, dVar, bundle);
        bVar.h = this.E.scheduleWithFixedDelay(bVar, 0L, 1000L, TimeUnit.MILLISECONDS);
        Logger.d(this.a, "wvscanner - create task, eventId:", dVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, ScheduledFuture<?> scheduledFuture) {
        synchronized (this.T) {
            this.T.remove(dVar);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        Logger.d(this.a, "wvscanner - cancel task, eventId:", dVar.c, ", taskFuture: ", scheduledFuture);
    }

    private void a(String str, String str2, String str3, d dVar, Bundle bundle, long j) {
        S.put(dVar.a, dVar);
        this.U.add(dVar.c);
        Logger.d(this.a, "handle WILL_DISPLAY - eventIds added ", dVar.c);
        if (this.O.contains(dVar.c)) {
            Logger.d(this.a, "handle WILL_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring. ");
            return;
        }
        Activity a2 = a(bundle);
        Logger.d(this.a, "handle WILL_DISPLAY - adActivity = ", a2);
        Logger.d(this.a, "handle WILL_DISPLAY - image count for ", this.c.name(), " is ", Integer.valueOf(BrandSafetyUtils.b(this.c)), ", # impressions to report: ", Integer.valueOf(this.C.keySet().size()));
        if (!f(str, str2)) {
            this.d++;
        } else {
            e eVar = L.get(dVar);
            if (eVar == null) {
                eVar = a(a2, str2, dVar.c, bundle);
                synchronized (L) {
                    L.put(dVar, eVar);
                }
                Logger.d(this.a, "handle WILL_DISPLAY New activity banner created for ", str2, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(L.size()));
            } else {
                if (eVar.A == null) {
                    eVar.A = bundle;
                }
                if (eVar.B == null || eVar.C == null) {
                    eVar.a(a(a2));
                }
            }
            eVar.ab = true;
            eVar.ah = true;
            eVar.aj = j;
            a(eVar, false, "handleWillDisplay");
        }
        a(str2, str3, dVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, List<WeakReference<View>> list) {
        Logger.d(this.a, "save screenshot view for ", dVar.d);
        AdNetworkDiscovery j = CreativeInfoManager.j(dVar.d);
        if (j != null) {
            j.a(dVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeakReference<View> d(List<WeakReference<View>> list) {
        WeakReference<View> weakReference = null;
        for (WeakReference<View> weakReference2 : list) {
            Logger.d(this.a, "select monitor view: iterating view is ", weakReference2.get());
            if (weakReference == null) {
                Logger.d(this.a, "select monitor view: setting view ", weakReference2.get());
            } else if (weakReference2.get() instanceof WebView) {
                Logger.d(this.a, "select monitor view: re-setting view ", weakReference2.get());
                weakReference.clear();
            } else {
                Logger.d(this.a, "select monitor view: clearing view ", weakReference2.get());
                weakReference2.clear();
            }
            weakReference = weakReference2;
        }
        return weakReference;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j) {
        e eVar;
        this.U.add(dVar.c);
        Logger.d(this.a, "handle DID_DISPLAY - eventIds added ", dVar.c);
        if (this.O.contains(dVar.c)) {
            Logger.d(this.a, "handle DID_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring. ");
            return;
        }
        Logger.d(this.a, "handle DID_DISPLAY package=", str, " banner key=", dVar);
        Activity a2 = a(bundle);
        synchronized (L) {
            eVar = L.get(dVar);
            if (eVar != null) {
                Logger.d(this.a, "Banner info already exists, package=", str, " activity banner=", eVar);
                eVar.z = this.d;
                if (eVar.B == null || eVar.C == null) {
                    eVar.a(a(a2));
                }
            } else {
                b(dVar);
                eVar = a(a2, str, dVar.c, bundle);
                L.put(dVar, eVar);
                Logger.d(this.a, "New activity banner created for ", str, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(L.size()));
            }
        }
        eVar.M = str2;
        eVar.ak = j;
        a(eVar, false, "handleDidDisplay");
        a(str, str2, dVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, d dVar, WeakReference<View> weakReference) {
        Logger.d(this.a, "monitor impression started for ", str, ", adInfoKey = ", dVar, ", creativeId = ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            e eVar = L.get(dVar);
            if (eVar != null) {
                a(str, dVar);
                eVar.M = str2;
                eVar.ai = true;
                eVar.al = 0.0f;
                if (weakReference.get().getWidth() > 0 && weakReference.get().getHeight() > 0) {
                    eVar.al = weakReference.get().getWidth() / weakReference.get().getHeight();
                }
                a(weakReference, eVar, dVar);
                return;
            }
            Logger.d(this.a, "monitor impression, banner info is null for ", str, ", adInfoKey = ", dVar);
            return;
        }
        Logger.d(this.a, "monitor impression, view is null for ", str, ", adInfoKey = ", dVar);
    }

    private void a(WeakReference<View> weakReference, e eVar, d dVar) {
        if (eVar.an != null) {
            Logger.d(this.a, "set impression handler task if needed - already exist for event id: ", dVar.c, ", exiting");
            return;
        }
        eVar.an = new a(eVar, weakReference, this.e, dVar);
        eVar.av = dVar;
        l i = eVar.i();
        if (i != null && i.l && n(eVar.c())) {
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "set impression handler task if needed : task set but not started since the ad is a video ad and the video hasn't finished yet. ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            return;
        }
        int Z = SafeDK.getInstance().Z() * 1000;
        Logger.d(this.a, "start taking screenshots for view: ", weakReference.get().toString(), ", sampling interval = ", Integer.valueOf(Z), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        eVar.an.d = this.E.scheduleWithFixedDelay(eVar.an, 500L, Z, TimeUnit.MILLISECONDS);
        Logger.d(this.a, "set impression handler task if needed : task created and started : ", eVar);
    }

    protected boolean n(String str) {
        return false;
    }

    private boolean s(String str) {
        Set<d> keySet;
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            Iterator<d> it = keySet.iterator();
            while (it.hasNext()) {
                e eVar = L.get(it.next());
                if (eVar != null && eVar.m != null && eVar.m.contains(str) && eVar.j() != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void o(String str) {
        Set<d> keySet;
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            Iterator<d> it = keySet.iterator();
            while (it.hasNext()) {
                e eVar = L.get(it.next());
                if (eVar != null && eVar.K != null && eVar.K.equals(str) && eVar.j() == null) {
                    Logger.d(this.a, "handle multiple impressions - reset webview data in: ", eVar);
                    eVar.K = null;
                    eVar.ai = false;
                }
            }
        }
    }

    private void b(d dVar) {
        synchronized (L) {
            Iterator<Map.Entry<d, e>> it = L.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, e> next = it.next();
                d key = next.getKey();
                e value = next.getValue();
                if (key.a.equals(dVar.a) && key.b.equals(dVar.b) && !key.c.equals(dVar.c) && !value.ah) {
                    Logger.d(this.a, "report undetected banner started for AdInfoKey=", key);
                    a(value, true, "reportUndetectedBannerIfNeeded");
                    it.remove();
                    a(value);
                }
            }
        }
    }

    protected boolean f(String str, String str2) {
        boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        String a3 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.a, "sdk ", str2, ": config item SUPPORTS_BANNER_IMPRESSION_TRACKING is ", Boolean.valueOf(a2), ", config item AD_NETWORK_TO_IGNORE is ", a3);
        if (a2 && !str.equals(a3)) {
            return true;
        }
        Logger.d(this.a, "Banners tracking is not supported for this ad network (", str, ")");
        return false;
    }

    private e a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.d++;
        Logger.d(this.a, "slot number incremented to ", Integer.valueOf(this.d), ", eventId is ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        return a(activity, str, this.d, lowerCase, bundle, str2);
    }

    private void a(String str, d dVar) {
        ArrayList<p> arrayList;
        Logger.d(this.a, "pending ci check started, sdkPackageName = ", str, ", adInfoKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (dVar == null) {
            Logger.d(this.a, "pending ci check - no activity key");
            return;
        }
        e eVar = L.get(dVar);
        if (eVar == null) {
            Logger.d(this.a, "pending ci check - no banner info");
            return;
        }
        CreativeInfo j = eVar.j();
        if (j != null && !j.an()) {
            Logger.d(this.a, "pending ci check - CI already exist");
            return;
        }
        AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
        if (j2 == null) {
            Logger.d(this.a, "pending ci check - no ad discovery found, exit. activity key : ", dVar);
            return;
        }
        if (dVar.c != null) {
            Logger.d(this.a, "pending ci check - activity key : ", dVar);
            if (!CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false)) {
                CreativeInfo a2 = j2.a((Object) (dVar.b + "_" + dVar.c + "_" + str));
                if (a2 != null) {
                    Logger.d(this.a, "pending ci check - discovery class returned a ci: ", a2.aa());
                    if (a2.I() == null) {
                        BrandSafetyEvent.AdFormatType a3 = BrandSafetyUtils.a(eVar.A);
                        Logger.d(this.a, "pending ci check - set ad format: ", a3);
                        a2.a(a3);
                    }
                    if (a2.n() == null) {
                        a2.h(dVar.c);
                    }
                    Logger.d(this.a, "pending ci check - CI event ID set");
                }
            }
        }
        List<p> list = M.get(str);
        if (list != null) {
            Logger.d(this.a, "pending ci check - sdk: ", str, ", no. of pending candidates: ", Integer.valueOf(list.size()));
            synchronized (list) {
                arrayList = new ArrayList(list);
            }
            for (p pVar : arrayList) {
                Logger.d(this.a, "pending ci check - pending candidate: ", pVar);
                CreativeInfo creativeInfo = pVar.a;
                if (a(creativeInfo, eVar)) {
                    Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "pending ci check - creative info found by WebView/eventID, CI: ", creativeInfo);
                    List<CreativeInfo> v = j2.v(creativeInfo.L());
                    String str2 = this.a;
                    Object[] objArr = new Object[2];
                    objArr[0] = "pending ci check - number of multi ad creative infos: ";
                    objArr[1] = Integer.valueOf(v != null ? v.size() : 0);
                    Logger.d(str2, objArr);
                    if (v == null) {
                        v = new ArrayList<>();
                        v.add(creativeInfo);
                    }
                    boolean z = false;
                    for (CreativeInfo creativeInfo2 : v) {
                        b(creativeInfo2, eVar);
                        if (creativeInfo2.n() == null) {
                            creativeInfo2.h(dVar.c);
                            creativeInfo2.f(true);
                        }
                        z = a(dVar.a, dVar.e, new p(creativeInfo2, pVar.b, pVar.c, pVar.d));
                        if (!z) {
                            break;
                        }
                    }
                    if (z) {
                        synchronized (list) {
                            list.remove(pVar);
                        }
                        eVar.d("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + pVar.b + "|o=" + pVar.a.aj() + ";" + pVar.a.ak());
                        return;
                    }
                    if (creativeInfo.B()) {
                        Logger.d(this.a, "pending ci check - unreal match and event id set happened, setting ci event id back to null");
                        creativeInfo.h((String) null);
                        creativeInfo.f(false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Logger.d(this.a, "pending ci check - there are no pending candidates");
    }

    private void c(d dVar) {
        e eVar = L.get(dVar);
        if (eVar != null) {
            Logger.d(this.a, "handle DID_HIDE, placementId=", dVar.b);
            eVar.ad = true;
        }
    }

    private void d(d dVar) {
        e eVar = L.get(dVar);
        if (eVar == null) {
            Logger.d(this.a, "handle DID_CLICKED current activity banner is null");
            return;
        }
        if (eVar.D != null && CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false)) {
            Logger.d(this.a, "handle DID_CLICKED current activity banner multi ad");
            return;
        }
        eVar.a(true);
        if (eVar.e() != null) {
            Logger.d(this.a, "handle DID_CLICKED current activity banner already have click url");
        } else {
            h hVar = P;
            if (hVar == null) {
                Logger.d(this.a, "handle DID_CLICKED current click url candidate is null");
            } else if (hVar.a == 0) {
                Logger.d(this.a, "handle DID_CLICKED current click url candidate has zero timestamp");
            } else if (!a(eVar, P.b, P.c)) {
                Logger.d(this.a, "handle DID_CLICKED ad click url is not valid");
            } else if (System.currentTimeMillis() - P.a >= 5000) {
                Logger.d(this.a, "handle DID_CLICKED click url candidate's timestamp is not within the time range");
            } else {
                Logger.d(this.a, "handle DID_CLICKED setting click URL to ", P.b);
                eVar.c(P.b);
                P = null;
            }
        }
        a(eVar, false, "handleDidClicked");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.a;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        synchronized (L) {
            Iterator<e> it = L.values().iterator();
            while (it.hasNext()) {
                it.next().ad = true;
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, z zVar) {
        c b2 = b(str, zVar);
        if (!(b2 instanceof e)) {
            return false;
        }
        a((e) b2, false, "handleWebsiteOpened");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> list;
        Logger.d(this.a, "getCreativeInfoByWebViewAddress started webViewAddress: ", str2, ", sdkPackageName: ", str);
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.m != null && eVar.m.contains(str2) && eVar.ab && !eVar.U) {
                    List<CreativeInfo> list2 = null;
                    if (eVar.v != null && eVar.v.equals(str)) {
                        list = eVar.l();
                    } else {
                        Logger.d(this.a, "getCreativeInfoByWebViewAddress checking scar-admob, #cis : ", Integer.valueOf(eVar.k().size()));
                        for (CreativeInfo creativeInfo : eVar.k()) {
                            Logger.d(this.a, "getCreativeInfoByWebViewAddress found cis by actual sdk. sdkPackageName : ", str, ", webViewAddress : ", str2, ", creativeInfo = ", creativeInfo);
                            if (creativeInfo.R() != null && creativeInfo.R().equals(str)) {
                                list2 = eVar.l();
                                Logger.d(this.a, "getCreativeInfoByWebViewAddress found cis by actual sdk. webViewAddress : ", str2, ", found ", Integer.valueOf(list2.size()));
                            }
                        }
                        list = list2;
                    }
                    return list;
                }
            }
            List<p> list3 = M.get(str);
            ArrayList arrayList = new ArrayList();
            if (list3 != null) {
                synchronized (list3) {
                    for (p pVar : list3) {
                        if (pVar.a != null && pVar.a.ak() != null && pVar.a.ak().equals(str2)) {
                            arrayList.add(pVar.a);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Logger.d(this.a, "get current CIs for webview address: ", str2, ", found ", Integer.valueOf(arrayList.size()), " pending CIs");
            }
            return arrayList;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        List<CreativeInfo> list;
        Logger.d(this.a, "getCreativeInfoByWebViewAddress started, sdkPackageName: ", str);
        synchronized (L) {
            list = null;
            for (e eVar : L.values()) {
                if (eVar.m != null && eVar.v != null && eVar.c().equals(str) && eVar.ab && !eVar.U) {
                    list = eVar.l();
                    if (!list.isEmpty()) {
                        Logger.d(this.a, "get CreativeInfo By Sdk Package Name returned ", list);
                    } else {
                        Logger.d(this.a, "get CreativeInfo By Sdk Package Name no ci found ");
                    }
                }
            }
        }
        return list;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        List<CreativeInfo> k;
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar != null && (k = eVar.k()) != null && !k.isEmpty() && k.get(0) != null && k.get(0).L().equals(str2)) {
                    return k;
                }
            }
            List<p> list = M.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                synchronized (list) {
                    for (p pVar : list) {
                        if (pVar.a != null && pVar.a.L().equals(str2)) {
                            arrayList.add(pVar.a);
                        }
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public c l(String str) {
        Set<d> keySet;
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            Iterator<d> it = keySet.iterator();
            while (it.hasNext()) {
                e eVar = L.get(it.next());
                if (eVar != null && eVar.L != null && eVar.L.equals(str)) {
                    return eVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.m != null && eVar.m.contains(str) && eVar.ab && !eVar.U) {
                    return eVar;
                }
            }
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c d(String str) {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.ao != null && eVar.ao.equals(str) && eVar.ab && !eVar.U) {
                    return eVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        try {
            Logger.d(this.a, "clean started, currentActivityBanners size is ", Integer.valueOf(L.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (eVar != null) {
                Logger.d(this.a, "clean, adding to reported impressions map. id =  ", eVar.L);
                synchronized (this.O) {
                    this.O.add(eVar.L);
                }
                eVar.ad = true;
                if (eVar.af != null) {
                    Logger.d(this.a, "clean, cancel WebView scanner task. id =  ", eVar.L);
                    if (eVar.af != null) {
                        eVar.af.cancel(false);
                    }
                }
                for (l lVar : eVar.g()) {
                    if (lVar.c != null && lVar.c.b != null) {
                        lVar.d = lVar.c.b;
                        Logger.d(this.a, "clean, set last impression screenshot filename to ", lVar.c.b);
                    }
                    String b2 = lVar.b();
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.v, b2, lVar);
                    SafeDKWebAppInterface.a(b2);
                }
                if (eVar.k().isEmpty()) {
                    com.safedk.android.analytics.brandsafety.creatives.g.b(eVar.n);
                    SafeDKWebAppInterface.a(eVar.K);
                } else {
                    for (CreativeInfo creativeInfo : eVar.k()) {
                        if (creativeInfo != null) {
                            com.safedk.android.analytics.brandsafety.creatives.g.b(eVar.n);
                            AdNetworkDiscovery j = CreativeInfoManager.j(creativeInfo.Q());
                            if (j != null) {
                                j.p(creativeInfo.L());
                            }
                            if (creativeInfo.X() != null) {
                                Logger.d(this.a, "clean and report - resetting CI matching method for ci ", creativeInfo);
                                creativeInfo.U();
                            }
                        }
                    }
                }
                b(eVar);
            }
        } catch (Throwable th) {
            Logger.e(this.a, "Error in clean ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, boolean z, String str) {
        long j;
        ArrayList arrayList;
        String str2;
        if (eVar == null) {
            Logger.d(this.a, "reporting event - info is null, cannot report brand safety event");
            return;
        }
        boolean z2 = !eVar.E;
        int i = 8;
        Logger.d(this.a, "reporting event started, root=", str, ", info.isClickReported=", Boolean.valueOf(eVar.F), ", info.isClicked()=", Boolean.valueOf(eVar.d()), ", shouldReportImpression=", Boolean.valueOf(z2), ", eventId=", eVar.L, ", isMature=", Boolean.valueOf(z), ", isOnUiThread=", Boolean.valueOf(com.safedk.android.utils.n.c()));
        boolean z3 = !eVar.F && eVar.d();
        if (eVar.aj > 0 && eVar.ak > 0) {
            j = eVar.aj - eVar.ak;
        } else {
            j = Long.MAX_VALUE;
        }
        ArrayList arrayList2 = new ArrayList();
        if (eVar != null && eVar.k().isEmpty() && eVar.i() != null) {
            Logger.d(this.a, "reporting event, root=", str, ", isMature=", Boolean.valueOf(z), ", info=", eVar);
            arrayList2.add(a(eVar, eVar.i(), z, eVar.F || z3, j, (String) null));
            arrayList = arrayList2;
        } else {
            for (l lVar : eVar.g()) {
                if (lVar.j() != null && !lVar.j().an() && lVar.j().X() == null) {
                    Logger.d(this.a, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    lVar.a((CreativeInfo) null);
                }
                if (z && lVar.c != null && lVar.c.a != null) {
                    String str3 = lVar.c.a + "_" + lVar.a;
                    Logger.d(this.a, "reporting event - imageFileIsValid filename = ", BrandSafetyUtils.a(eVar.p, lVar.c.a, eVar.c(), lVar.a, lVar.c.f));
                    str2 = str3;
                } else {
                    str2 = null;
                }
                float a2 = lVar.c != null ? lVar.c.a(500) : 0.0f;
                String str4 = this.a;
                Object[] objArr = new Object[i];
                objArr[0] = "reporting event, root=";
                objArr[1] = str;
                objArr[2] = ", isMature=";
                objArr[3] = Boolean.valueOf(z);
                objArr[4] = ", info=";
                objArr[5] = eVar;
                objArr[6] = ", uniformity=";
                objArr[7] = Float.valueOf(a2);
                Logger.d(str4, objArr);
                if (z) {
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.v, eVar.j().ak(), eVar.i());
                }
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a(eVar, lVar, z, eVar.F || z3, j, str2));
                if (z && lVar.j() != null && lVar.c != null) {
                    if (this.C.size() <= SafeDK.getInstance().J()) {
                        Logger.d(this.a, "reporting event waiting to report file ", lVar.c.b);
                        a(eVar, lVar);
                    } else {
                        Logger.d(this.a, "reporting event no open slot for ", this.c, ", ", lVar.c.a);
                        BrandSafetyUtils.d(lVar.c.b);
                    }
                    lVar.i();
                }
                arrayList2 = arrayList3;
                i = 8;
            }
            arrayList = arrayList2;
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.d(this.a, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z2) {
            eVar.c(true);
        }
        if (z3) {
            eVar.d(true);
            Logger.d(this.a, "reporting event - setIsClickReported set to true");
        }
    }

    private static BrandSafetyEvent a(e eVar, l lVar, boolean z, boolean z2, long j, String str) {
        return new BrandSafetyEvent(eVar.c(), eVar.q(), str, z2, eVar.d() ? eVar.e() : null, lVar.j(), eVar.a(), eVar.p(), lVar.a != null ? lVar.a : "", eVar.D, z, eVar.r(), lVar.c != null ? lVar.c.f : null, lVar.c != null ? lVar.c.c : 0L, lVar.c != null ? lVar.c.a(500) : 0.0f, lVar.c != null ? lVar.c.e : 0, eVar.ah, eVar.ai, j, eVar.al, eVar.am, eVar.T, SafeDK.getInstance().e(), eVar.w(), eVar.M, eVar.N, eVar.P, eVar.Q, b(eVar, lVar).toString(), lVar.e, lVar.f, lVar.g, lVar.m, lVar.n, lVar.o, lVar.p, lVar.q, lVar.x, lVar.r);
    }

    protected void a(CreativeInfo creativeInfo, p pVar) {
        String Q2 = creativeInfo.Q();
        Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "set CI details - adding as pending, sdk: ", Q2, " matching info: ", pVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        List<p> list = M.get(Q2);
        if (list == null) {
            list = new ArrayList<>();
            synchronized (M) {
                M.put(Q2, list);
            }
        }
        if (!CreativeInfoManager.a(Q2, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
            for (p pVar2 : list) {
                if (pVar2.a != null && pVar2.a.equals(creativeInfo)) {
                    Logger.d(this.a, "set CI details - CI already exists in pending list, sdk: ", Q2, " matching info: ", pVar);
                    return;
                }
            }
            list.add(pVar);
            creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + pVar.b + "|o=" + pVar.a.aj() + ";" + pVar.a.ak());
            return;
        }
        Logger.d(this.a, "set CI details - NOT adding as pending (config based), sdk: ", Q2, " matching info: ", pVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(p pVar) {
        Set<d> keySet;
        try {
            Logger.printFullVerboseLog(this.a, "set CI details started. matchingInfo = ", pVar.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo creativeInfo = pVar.a;
            if (creativeInfo != null) {
                Logger.d(this.a, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                synchronized (L) {
                    keySet = L.keySet();
                    Logger.d(this.a, "set CI details - starting to iterate over current activity banners: ", L.keySet());
                }
                if (!keySet.isEmpty()) {
                    for (d dVar : keySet) {
                        e eVar = L.get(dVar);
                        if (a(creativeInfo, eVar)) {
                            Logger.d(this.a, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                            if (creativeInfo.n() == null) {
                                Logger.d(this.a, "set CI details - updated creative info eventId to ", dVar.c, ", banner key = ", dVar);
                                creativeInfo.h(dVar.c);
                                creativeInfo.f(true);
                            }
                            if (creativeInfo.I() == null) {
                                BrandSafetyEvent.AdFormatType a2 = BrandSafetyUtils.a(eVar.A);
                                Logger.d(this.a, "set CI details - set ad format: ", a2);
                                creativeInfo.a(a2);
                            }
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                                Logger.d(this.a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                                if (!creativeInfo.F().equals(dVar.b)) {
                                    Logger.d(this.a, "set CI details - updated creative info placementId to ", dVar.b, ", banner key = ", dVar);
                                    creativeInfo.j(dVar.b);
                                }
                            }
                            if (a(dVar.a, dVar.e, pVar)) {
                                return true;
                            }
                            if (creativeInfo.B()) {
                                Logger.d(this.a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                                creativeInfo.f(false);
                                creativeInfo.h((String) null);
                            }
                        }
                    }
                }
                a(creativeInfo, pVar);
                return true;
            }
        } catch (Throwable th) {
            Logger.e(this.a, "set CI details exception: ", th.getMessage(), th);
        }
        return false;
    }

    public void a(p pVar, d dVar) {
        try {
            Logger.printFullVerboseLog(this.a, "set CI details started. matchingInfo = ", pVar.toString(), ", bannerKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo creativeInfo = pVar.a;
            if (creativeInfo != null) {
                Logger.d(this.a, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                e eVar = L.get(dVar);
                if (a(creativeInfo, eVar)) {
                    Logger.d(this.a, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                    if (creativeInfo.n() == null) {
                        Logger.d(this.a, "set CI details - updated creative info eventId to ", dVar.c, ", banner key = ", dVar);
                        creativeInfo.h(dVar.c);
                        creativeInfo.f(true);
                    }
                    if (creativeInfo.I() == null) {
                        BrandSafetyEvent.AdFormatType a2 = BrandSafetyUtils.a(eVar.A);
                        Logger.d(this.a, "set CI details - set ad format: ", a2);
                        creativeInfo.a(a2);
                    }
                    if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                        Logger.d(this.a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                        if (!creativeInfo.F().equals(dVar.b)) {
                            Logger.d(this.a, "set CI details - updated creative info placementId to ", dVar.b, ", banner key = ", dVar);
                            creativeInfo.j(dVar.b);
                        }
                    }
                    if (a(dVar.a, dVar.e, pVar)) {
                        return;
                    }
                    if (creativeInfo.B()) {
                        Logger.d(this.a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                        creativeInfo.f(false);
                        creativeInfo.h((String) null);
                    }
                }
                a(creativeInfo, pVar);
            }
        } catch (Throwable th) {
            Logger.e(this.a, "set CI details exception: ", th.getMessage(), th);
        }
    }

    private boolean a(CreativeInfo creativeInfo, e eVar) {
        if (eVar == null) {
            Logger.d(this.a, "verify matching - banner info is null");
            return false;
        }
        if (eVar.v == null) {
            Logger.d(this.a, "verify matching - banner info maxSdk is null");
            return false;
        }
        if (creativeInfo == null) {
            Logger.d(this.a, "verify matching - creative info is null");
            return false;
        }
        String Q2 = creativeInfo.Q();
        if (!eVar.v.equals(Q2)) {
            Logger.d(this.a, "verify matching  - sdks does not match, ci sdk is: ", Q2, " and banner sdk is: ", eVar.v);
            return false;
        }
        Logger.d(this.a, "verify matching - ci sdk is: ", Q2, ", banner info: ", eVar);
        if (eVar.L != null && creativeInfo.n() != null && !eVar.L.equals(creativeInfo.n())) {
            Logger.d(this.a, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", eVar.L);
            if (!CreativeInfoManager.a(eVar.v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.n());
        }
        return a(creativeInfo.aj(), creativeInfo.ak(), eVar);
    }

    private boolean a(String str, String str2, e eVar) {
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str)) {
            Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "verify matching object skipped, event ID: ", eVar.L, ", object address: ", str2, ", object type: ", str);
            return true;
        }
        if (eVar.x() != null && eVar.x().contains(str2)) {
            Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", eVar.L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
            return true;
        }
        AdNetworkDiscovery j = CreativeInfoManager.j(eVar.v);
        if (j != null && j.a(str2, eVar)) {
            Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "verify matching object done, multiple webviews detected for banner. event ID: ", eVar.L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
            return true;
        }
        Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", eVar.L, ", object address: ", str2, ", views hierarchy: ", eVar.x());
        return false;
    }

    private boolean a(String str, String str2, p pVar) {
        String str3;
        e eVar;
        Logger.printFullVerboseLog(this.a, Logger.FeatureTag.CI_MATCHING, "set CI started, adUnitId=", str, " matchingInfo=", pVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (pVar == null) {
            Logger.d(this.a, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = pVar.a;
        if (creativeInfo != null) {
            if (creativeInfo.j() == null) {
                str3 = str;
            } else {
                str3 = creativeInfo.j();
            }
            d dVar = new d(str3, creativeInfo.F(), creativeInfo.n(), creativeInfo.Q(), str2, creativeInfo.K());
            Logger.d(this.a, "set CI - activity key: ", dVar);
            synchronized (L) {
                Iterator<d> it = L.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    }
                    d next = it.next();
                    if (dVar.a(next, creativeInfo)) {
                        eVar = L.get(next);
                        break;
                    }
                }
                Logger.printFullVerboseLog(this.a, "set CI - current activity banner: ", eVar);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(creativeInfo.Q());
            if (j == null) {
                Logger.d(this.a, "set CI - no ad network discovery for sdk: ", creativeInfo.Q());
                return false;
            }
            if (eVar != null) {
                if (!eVar.ae && StatsReporter.b().a(creativeInfo, eVar)) {
                    eVar.ae = true;
                }
                CreativeInfo j2 = eVar.j();
                if (j2 != null) {
                    Logger.d(this.a, "set CI - previous CI id: ", j2.L());
                    if (j2.L() != null && j2.L().equals(creativeInfo.L())) {
                        j.d(j2);
                        Logger.printFullVerboseLog(this.a, "set CI - already matched, same ad ID. current match: ", creativeInfo.aa(), ", previous match: ", j2.aa());
                    }
                }
                boolean z = creativeInfo.X() != null;
                creativeInfo.a(pVar.b, pVar.c, pVar.d);
                Logger.d(this.a, "set CI - current banner webview address: ", eVar.K, " is CI set earlier: ", Boolean.valueOf(z));
                Logger.d(this.a, "set CI - current banner: ", eVar);
                Logger.d(this.a, "set CI - current debug info: ", creativeInfo.W());
                eVar.a(creativeInfo);
                j.s(creativeInfo.L());
                l i = eVar.i();
                if (!z) {
                    a(i);
                    i.l();
                }
                Logger.d(this.a, "set CI - CI is set for activity banner ", dVar, ". CI : ", creativeInfo);
                if (n(eVar.c()) && i.l && eVar.an != null && !i.k && eVar.an.d != null) {
                    eVar.an.d.cancel(false);
                    eVar.an = null;
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "set CI - canceling running impression handler task (ad is a video ad) ", eVar);
                }
                o(creativeInfo.ak());
                if (eVar.K != null && (eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO)) {
                    Logger.printFullVerboseLog(this.a, "set CI - attach resources to CI, webview address: ", eVar.K, " , ci: ", creativeInfo);
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.v, eVar.K, i);
                }
                b(eVar, creativeInfo);
                a(eVar, false, "setCreativeInfo");
                return true;
            }
            j.d(creativeInfo);
        } else {
            Logger.d(this.a, "set CI - no CI");
        }
        return false;
    }

    private boolean a(c cVar, String str, String str2) {
        if (cVar != null) {
            String d = com.safedk.android.utils.k.d(str, "clcode");
            Logger.d(this.a, "check ad click URL validity - clcode: ", d, ", view address: ", str2, ", views hierarchy: ", cVar.x());
            CreativeInfo j = cVar.j();
            if ((d != null && j != null && !j.L().equals(d)) || cVar.x() == null || str2 == null || !cVar.x().contains(str2)) {
                Logger.d(this.a, "check ad click URL validity - ad ID or view address does not match. clcode: ", d, ", view address: ", str2, ", views hierarchy: ", cVar.x());
                return false;
            }
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z, String str4) {
        boolean z2;
        Set<d> keySet;
        Logger.printFullVerboseLog(this.a, "set ad click URL started, sdkPackageName: ", str2, ", url: ", str, ", view address: ", str3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        List<CreativeInfo> a2 = a(str2, str3);
        if (a2 == null) {
            z2 = false;
        } else {
            z2 = false;
            for (CreativeInfo creativeInfo : a2) {
                Logger.printFullVerboseLog(this.a, "set ad click URL , ci : ", creativeInfo);
                if (!creativeInfo.an() && (z || TextUtils.isEmpty(creativeInfo.M()) || creativeInfo.ap())) {
                    Logger.d(this.a, "set ad click URL check ad click URL validity - view address: ", str3, ", updating click_url in pending CIs list. url = ", str, ", adId = ", creativeInfo.L());
                    creativeInfo.a(str, false);
                    z2 = true;
                }
            }
        }
        if (str != null) {
            synchronized (L) {
                keySet = L.keySet();
            }
            if (!keySet.isEmpty()) {
                Iterator<d> it = keySet.iterator();
                while (it.hasNext()) {
                    e eVar = L.get(it.next());
                    if (eVar != null && eVar.c() != null && SdksMapping.isSameSdkByPackages(eVar.c(), str2) && a(eVar, str, str3)) {
                        if (!eVar.d() && (z || P == null)) {
                            Logger.d(this.a, "set ad click URL - current activity banner is not marked as clicked, setting candidate: ", str);
                            h(str, str3);
                        } else if (eVar.e() == null) {
                            Logger.printFullVerboseLog(this.a, "set ad click URL - no click URL yet, setting click URL: ", str, ", CI: ", eVar.j());
                            if (eVar.c(str)) {
                                a(eVar, false, "setCurrentAdClickURL");
                            }
                        } else {
                            Logger.printFullVerboseLog(this.a, "set ad click URL - click URL already set: ", eVar.e(), ", CI: ", eVar.j());
                        }
                        z2 = true;
                    }
                }
            }
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
    }

    public void p(String str) {
        Set<d> keySet;
        Logger.d(this.a, "stop taking screenshots started, address = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            Iterator<d> it = keySet.iterator();
            while (it.hasNext()) {
                e eVar = L.get(it.next());
                Logger.d(this.a, "stop taking screenshots - checking banner info address = ", eVar.K);
                if (eVar.K != null && eVar.K.equals(str)) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = ", eVar.K);
                    eVar.O = true;
                    for (l lVar : eVar.g()) {
                        if (lVar.j() != null && str != null && str.equals(lVar.j().ak())) {
                            c(lVar);
                        }
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    private void c(l lVar) {
        Logger.d(this.a, "stop taking screenshots impl started , impression = ", lVar);
        a(lVar);
        if (lVar.c != null && lVar.c.b != null) {
            Logger.d(this.a, "stop taking screenshots impl - removing hash and file ", lVar.c.b);
            BrandSafetyUtils.d(lVar.c.b);
            lVar.c.a = null;
        }
    }

    public void q(String str) {
        Set<d> keySet;
        Logger.d(this.a, "stop taking screenshots started, sdkPackageName = ", str);
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            Iterator<d> it = keySet.iterator();
            while (it.hasNext()) {
                e eVar = L.get(it.next());
                Logger.d(this.a, "stop taking screenshots - checking banner info address = ", eVar.K);
                if (eVar.c() != null && eVar.c().equals(str)) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = ", eVar.K);
                    eVar.O = true;
                    Iterator<l> it2 = eVar.g().iterator();
                    while (it2.hasNext()) {
                        c(it2.next());
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    private boolean a(int i) {
        boolean b2 = BrandSafetyUtils.b(i);
        Logger.d(this.a, "should stop sampling, max uniformed pixels count=", Integer.valueOf(i), ", return value=", Boolean.valueOf(b2));
        return b2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Set<d> keySet;
        Logger.d(this.a, "on background started");
        synchronized (L) {
            keySet = L.keySet();
        }
        Iterator<d> it = keySet.iterator();
        while (it.hasNext()) {
            e eVar = L.get(it.next());
            if (eVar != null && eVar.ab && eVar.p == this.c) {
                eVar.a(m.z, new m.a[0]);
                a(eVar, false, "onBackground");
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Set<d> keySet;
        Logger.d(this.a, "on foreground started");
        synchronized (L) {
            keySet = L.keySet();
        }
        Iterator<d> it = keySet.iterator();
        while (it.hasNext()) {
            e eVar = L.get(it.next());
            if (eVar != null && eVar.ab && eVar.p == this.c) {
                eVar.a(m.A, new m.a[0]);
                a(eVar, false, "onForeground");
            }
        }
    }

    private void h(String str, String str2) {
        P = new h(System.currentTimeMillis(), str, str2, null);
    }

    public static void a(String str, MaxAdView maxAdView, BrandSafetyUtils.AdType adType) {
        if (str != null && maxAdView != null) {
            String a2 = BrandSafetyUtils.a(maxAdView);
            synchronized (R) {
                R.put(a2, adType);
            }
            List<WeakReference<MaxAdView>> list = Q.get(str);
            if (list == null) {
                list = new ArrayList<>();
                synchronized (Q) {
                    Q.put(str, list);
                }
                Logger.d("BannerFinder", "add Max ad view: added adUnitId: ", str, " to maxAdViews map", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            } else if (list.get(0).get() == maxAdView) {
                return;
            }
            list.add(0, new WeakReference<>(maxAdView));
            Logger.d("BannerFinder", "add Max ad view: ", maxAdView, ", address: ", BrandSafetyUtils.a(maxAdView), ", list size: ", Integer.valueOf(list.size()));
        }
    }

    public static void a(MaxAdView maxAdView) {
        String a2 = BrandSafetyUtils.a(maxAdView);
        synchronized (R) {
            R.remove(a2);
        }
        synchronized (Q) {
            Iterator<String> it = Q.keySet().iterator();
            while (it.hasNext()) {
                if (a(it.next(), maxAdView)) {
                    return;
                }
            }
        }
    }

    public static boolean a(String str, MaxAdView maxAdView) {
        List<WeakReference<MaxAdView>> list = Q.get(str);
        if (maxAdView != null && list != null) {
            for (WeakReference<MaxAdView> weakReference : list) {
                if (weakReference != null && maxAdView == weakReference.get()) {
                    weakReference.clear();
                    list.remove(weakReference);
                    Logger.d("BannerFinder", "remove Max ad view: ", maxAdView, ", address: ", BrandSafetyUtils.a(maxAdView), ", list size: ", Integer.valueOf(list.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    if (list.isEmpty()) {
                        synchronized (Q) {
                            Q.remove(str);
                        }
                        Logger.d("BannerFinder", "remove Max ad view: removing adUnitId: ", str, " from maxAdViews");
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
    }

    public class a implements Runnable {
        e a;
        WeakReference<View> b;
        ScheduledFuture<?> d;
        int e;
        int f;
        int c = 0;
        int g = 0;
        boolean h = false;

        public a(e eVar, WeakReference<View> weakReference, int i, d dVar) {
            WeakReference<View> a;
            this.f = 0;
            this.f = 0;
            this.b = weakReference;
            this.a = eVar;
            this.e = i;
            String a2 = BrandSafetyUtils.a(weakReference.get());
            if (eVar != null) {
                eVar.av = dVar;
                eVar.K = a2;
                l i2 = eVar.i();
                String str = BannerFinder.this.a;
                Object[] objArr = new Object[8];
                objArr[0] = "impression handler task, webviewAddress: ";
                objArr[1] = a2;
                objArr[2] = ", impression is: ";
                objArr[3] = i2;
                objArr[4] = " CI is: ";
                objArr[5] = i2 != null ? i2.j() : null;
                objArr[6] = ", isOnUiThread = ";
                objArr[7] = Boolean.valueOf(com.safedk.android.utils.n.c());
                Logger.d(str, objArr);
                if (i2 != null && i2.j() != null) {
                    com.safedk.android.analytics.brandsafety.creatives.g.a(eVar.v, a2, i2);
                }
            } else {
                Logger.d(BannerFinder.this.a, "impression handler task, currentActivityBanner is null with webview address: ", a2);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(eVar.c());
            if (j != null && (a = j.a(dVar)) != null && a.get() != null) {
                this.b = a;
                Logger.d(BannerFinder.this.a, "Impression handler task, view to take screenshot updated to: ", this.b.get());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f++;
                Logger.d(BannerFinder.this.a, "impression handler task start, timerIterationCounter: ", Integer.valueOf(this.f), ", impression is: ", this.a);
                if (this.a != null) {
                    this.c++;
                    if (com.safedk.android.utils.n.a((Reference<?>) this.a.ag)) {
                        if (this.c <= this.e && !this.a.ad) {
                            int E = this.a.E();
                            if (E > 0 && (this.b.get() instanceof ViewGroup)) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(this.b);
                                com.safedk.android.analytics.brandsafety.b.c((ViewGroup) this.b.get(), arrayList);
                                Logger.d(BannerFinder.this.a, "take screenshot (for screenshots) - views hierarchy : ", arrayList);
                                if (E < arrayList.size()) {
                                    this.b = (WeakReference) arrayList.get(E);
                                    Logger.d(BannerFinder.this.a, "take screenshot - get screenshot view, index: ", Integer.valueOf(E), ", view: ", this.b.get());
                                } else {
                                    this.a.G();
                                    Logger.d(BannerFinder.this.a, "take screenshot - reset screenshot view: ", this.b.get());
                                }
                            }
                            if (this.a.O) {
                                Logger.d(BannerFinder.this.a, "no creative info yet or request no sampling received, current activity banner = ", this.a);
                            } else if (BannerFinder.this.a(this.a, this.f)) {
                                if (com.safedk.android.utils.n.a((Reference<?>) this.b)) {
                                    a(this.a, this.b.get());
                                    if ((this.b.get() instanceof ViewGroup) && CreativeInfoManager.a(this.a.c(), AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false)) {
                                        BannerFinder.this.a((ViewGroup) this.b.get(), this.a);
                                    }
                                } else {
                                    Logger.d(BannerFinder.this.a, "Impression handler task - view is not alive, can't taking screenshot");
                                }
                            }
                            return;
                        }
                        Logger.d(BannerFinder.this.a, "Impression handler task - Going to report banner, eventId=", this.a.L, ", stopTimerAndReport=", Boolean.valueOf(this.a.ad), ", image counter=", Integer.valueOf(this.c), ", max attempts=", Integer.valueOf(this.e), ", isImpressionReported=", Boolean.valueOf(this.a.E));
                        if (!this.a.E) {
                            BannerFinder.this.a(this.a, false, "ImpressionHandlerTask");
                        }
                        BannerFinder.this.a(this.a.av, this.d);
                        return;
                    }
                    String str = BannerFinder.this.a;
                    Object[] objArr = new Object[4];
                    objArr[0] = "Impression handler task - timer task cannot be started: banner activity=";
                    objArr[1] = !com.safedk.android.utils.n.a((Reference<?>) this.a.ag) ? "" : this.a.ag.get().getClass().getName();
                    objArr[2] = ", current activity banner=";
                    objArr[3] = this.a;
                    Logger.d(str, objArr);
                }
            } catch (Throwable th) {
                Logger.e(BannerFinder.this.a, "Impression handler task - exception: ", th);
            }
        }

        private void a(final e eVar, final View view) {
            try {
                if (eVar == null || view == null) {
                    Logger.d(BannerFinder.this.a, "taking screenshot, view=", view, ", currentActivityBanner=", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    return;
                }
                Logger.d(BannerFinder.this.a, "taking screenshot, view=", view, ", event id=", eVar.L, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                eVar.c();
                WeakReference<Activity> weakReference = eVar.ag;
                if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                    weakReference.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(BannerFinder.this.a, "taking screenshot, using old method");
                            final Bitmap a = ScreenshotHelper.a(view, SafeDK.getInstance().aa(), eVar);
                            if (a == null) {
                                eVar.F();
                                Logger.d(BannerFinder.this.a, "taking screenshot, black screenshot detected index = ", Integer.valueOf(eVar.E()));
                            }
                            BannerFinder.this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    BannerFinder.this.a(eVar, a, a.this.c);
                                }
                            });
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.e(BannerFinder.this.a, "error while taking screenshot", th);
                Logger.printStackTrace();
                new CrashReporter().caughtException(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void a(e eVar, Bitmap bitmap, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        char c;
        if (bitmap == null) {
            return;
        }
        String c2 = eVar.c();
        BrandSafetyUtils.a b2 = BrandSafetyUtils.b(c2, bitmap);
        int a2 = b2.a();
        BrandSafetyUtils.ScreenshotValidity b3 = BrandSafetyUtils.b(c2, b2);
        if (b3 != BrandSafetyUtils.ScreenshotValidity.VALID) {
            if (b3 == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || b3 == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                eVar.F();
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot, black/uniform screenshot detected, index = ", Integer.valueOf(eVar.E()));
                return;
            } else {
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot is not valid: ", b3.name(), ", pixel count: ", Integer.valueOf(a2), ", counter = ", Integer.valueOf(i), ", try again...");
                return;
            }
        }
        String a3 = BrandSafetyUtils.a(bitmap);
        BrandSafetyUtils.ScreenShotOrientation b4 = BrandSafetyUtils.b(bitmap);
        l i4 = eVar.i();
        String a4 = BrandSafetyUtils.a(bitmap, this.c, a3, c2, i4.a, b4);
        if (!d(a4, c2, a3)) {
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - image is not valid : ", a4);
        }
        Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot file created, counter = ", Integer.valueOf(i), " filename = ", a4, ", hash = ", a3);
        long c3 = BrandSafetyUtils.c(a4);
        Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - hash ", a3, ", stored file size is ", Long.valueOf(c3), " bytes, counter is ", Integer.valueOf(i), ", uniform pixel count is ", Integer.valueOf(a2), " (", Float.valueOf((a2 / 500.0f) * 100.0f), "%)");
        int size = this.C.size();
        if (!d(a3, i4.a)) {
            if (size <= SafeDK.getInstance().J()) {
                if (i4.c != null && i4.c.a != null && !i4.c.a.equals(a3)) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - removing ad file ", i4.c.b);
                    BrandSafetyUtils.d(i4.c.b);
                }
                i4.b(m.t, new m.a(m.K, m.X));
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - setting data hash = ", a3, ", file name = ", a4, ", file size = ", Long.valueOf(c3), ", max uniformed pixel count = ", Integer.valueOf(a2), ", image counter = ", Integer.valueOf(i));
                str2 = a3;
                str = m.K;
                c = 0;
                i3 = 1;
                i2 = a2;
                i4.c = new k(str2, a4, c3, a2, i, b4, false);
                a(eVar, false, "processScreenshot");
                str3 = m.t;
            } else {
                str = m.K;
                str2 = a3;
                str3 = m.t;
                i2 = a2;
                i3 = 1;
                i3 = 1;
                c = 0;
                if (!c(str2, i4.a)) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - No open slot for ", str2, "_", i4.a);
                    BrandSafetyUtils.d(a4);
                } else {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - Image ", str2, "_", i4.a, " is already scheduled for upload");
                }
            }
        } else {
            str = m.K;
            str2 = a3;
            str3 = m.t;
            i2 = a2;
            i3 = 1;
            c = 0;
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "process screenshot - Not saving file for ", str2, "_", i4.a);
            BrandSafetyUtils.d(a4);
        }
        if (a(i2)) {
            if (!TextUtils.isEmpty(str2)) {
                eVar.e(i3);
                eVar.ad = i3;
            }
            m.a[] aVarArr = new m.a[i3];
            aVarArr[c] = new m.a(str, m.Y);
            i4.a(str3, aVarArr);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.1
            @Override // java.lang.Runnable
            public void run() {
                e eVar = (e) cVar;
                BannerFinder.this.a(eVar, bitmap, eVar.an.c);
            }
        });
    }

    protected boolean a(e eVar, long j) {
        if (eVar == null || com.safedk.android.utils.e.a((c) eVar)) {
            Logger.d(this.a, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", eVar, ", low memory");
            return false;
        }
        if (!SafeDK.getInstance().I()) {
            CreativeInfo j2 = eVar.j();
            if (j2 == null) {
                Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, no creative info yet");
            } else {
                boolean a2 = CreativeInfoManager.a(eVar.v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (j2.an() && !a2) {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, multi ad, sdk: ", eVar.v);
                } else {
                    Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, banner ad");
                    return true;
                }
            }
            return false;
        }
        Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar, Bundle bundle, String str) {
        e eVar = L.get(dVar);
        if (eVar == null || dVar.g == null) {
            return false;
        }
        d dVar2 = S.get(dVar.a);
        if (dVar2 != null && !dVar2.equals(dVar)) {
            Logger.d(this.a, "clear CI from banner info - a new banner has loaded instead, not deleting it");
            return false;
        }
        Logger.d(this.a, "clear CI from banner info started with maxCreativeId: ", str, " and webview address: ", dVar.g, " and adInfoKey: ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        Logger.d(this.a, "clear CI from banner info started with impressions size: ", Integer.valueOf(eVar.g().size()), " banner info: ", eVar);
        List<l> g = eVar.g();
        for (l lVar : g) {
            a(lVar);
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(lVar.a);
            }
        }
        g.clear();
        long j = eVar.aj;
        long j2 = eVar.ak;
        e a2 = a(eVar.ag.get(), eVar.v, dVar.c, bundle);
        a2.ab = true;
        a2.ah = true;
        a2.aj = j;
        a2.ak = j2;
        a2.ai = true;
        synchronized (L) {
            L.put(dVar, a2);
        }
        Logger.d(this.a, "handle WILL_DISPLAY New activity banner created for ", a2.v, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(L.size()));
        dVar.h = null;
        return true;
    }

    private boolean a(String str, WeakReference<MaxAdView> weakReference, d dVar) {
        if (!CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false) || dVar.g == null) {
            return false;
        }
        List<WeakReference<View>> a2 = a((ViewGroup) weakReference.get());
        List<String> c = c(a2);
        List<WeakReference<WebView>> b2 = b(a2);
        Logger.d(this.a, "find banner impression - webview is: ", dVar.g, " there are ", Integer.valueOf(b2.size()), " webViews and the views addresses list is: ", c, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (c.contains(dVar.g) || b2.size() <= 0) {
            return false;
        }
        Logger.d(this.a, "find banner impression - did not find webview address ", dVar.g, " inside the views list, first webview address is: ", BrandSafetyUtils.a((Object) b2.get(0).get()));
        return true;
    }

    protected Boolean a(String str, String str2, d dVar, String str3, List<WeakReference<View>> list, List<String> list2, List<WeakReference<WebView>> list3) {
        int i;
        boolean z;
        int i2;
        List<String> list4 = list2;
        char c = 2;
        int i3 = 1;
        try {
            List<WeakReference<MaxAdView>> list5 = Q.get(dVar.a);
            if (list5 == null) {
                z = true;
            } else {
                try {
                    synchronized (list5) {
                        try {
                            for (WeakReference<MaxAdView> weakReference : list5) {
                                if (weakReference.get() != null) {
                                    String str4 = this.a;
                                    Object[] objArr = new Object[10];
                                    objArr[0] = "find banner impression - sdk: ";
                                    objArr[i3] = str;
                                    objArr[c] = ", ad unit id: ";
                                    objArr[3] = dVar.a;
                                    objArr[4] = ", max ad view: ";
                                    objArr[5] = weakReference.get().toString();
                                    objArr[6] = ", address: ";
                                    objArr[7] = BrandSafetyUtils.a(weakReference.get());
                                    objArr[8] = ", isOnUiThread = ";
                                    objArr[9] = Boolean.valueOf(com.safedk.android.utils.n.c());
                                    Logger.d(str4, objArr);
                                    if (list5.size() > i3 && (!weakReference.get().isShown() || weakReference.get().getWindowVisibility() != 0)) {
                                        String str5 = this.a;
                                        Object[] objArr2 = new Object[i3];
                                        objArr2[0] = "find banner impression - window is not visible, continue to next max ad view";
                                        Logger.d(str5, objArr2);
                                    } else {
                                        b(weakReference.get(), list3);
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        list4.add(BrandSafetyUtils.a(weakReference.get()));
                                        arrayList2.add("h1c1:" + weakReference.get().toString());
                                        String n = BrandSafetyUtils.n(str3);
                                        dVar.i = a(str, weakReference, dVar);
                                        z = true;
                                        try {
                                            a(weakReference.get(), str, n, str2, dVar, list, arrayList, list2, arrayList2, 1, false, false);
                                            Logger.printFullVerboseLog(this.a, "find banner impression - views hierarchy: ", arrayList2);
                                            if (!list.isEmpty()) {
                                                Logger.d(this.a, "find banner impression - found views: ", arrayList);
                                                return true;
                                            }
                                            if (TextUtils.isEmpty(n)) {
                                                i2 = 2;
                                            } else {
                                                i2 = 2;
                                                if (!list2.contains(n)) {
                                                    list2.clear();
                                                    list.clear();
                                                    return false;
                                                }
                                            }
                                            String str6 = this.a;
                                            Object[] objArr3 = new Object[i2];
                                            objArr3[0] = "find banner impression - no new views found for top view: ";
                                            objArr3[1] = weakReference.get().toString();
                                            Logger.d(str6, objArr3);
                                            return true;
                                        } catch (Throwable th) {
                                            th = th;
                                            i = 2;
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                String str7 = this.a;
                                                Object[] objArr4 = new Object[i];
                                                objArr4[0] = "Failed while scanning the screen for banners";
                                                objArr4[z ? 1 : 0] = th;
                                                Logger.e(str7, objArr4);
                                                new CrashReporter().caughtException(th);
                                                return Boolean.valueOf(z);
                                            }
                                        }
                                    }
                                } else {
                                    Logger.d(this.a, "find banner impression - sdk: ", str, ", ad unit id: ", dVar.a, ", max ad view not valid");
                                    list4 = list4;
                                    i3 = 1;
                                    c = 2;
                                }
                            }
                            z = true;
                        } catch (Throwable th3) {
                            th = th3;
                            i = 2;
                            z = true;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            i = 2;
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<WeakReference<View>> list, final List<WeakReference<WebView>> list2, d dVar, long j) {
        boolean z;
        Logger.d(this.a, "report completed banners started, views = ", list, ", adInfoKey = ", dVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        final ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (Map.Entry<d, e> entry : L.entrySet()) {
                d key = entry.getKey();
                if (key.equals(dVar)) {
                    Logger.d(this.a, "report completed banners, skipping banner info of new impression, key=", key);
                } else if (!key.a.equals(dVar.a)) {
                    Logger.d(this.a, "report completed banners, skipping banner info of another adUnitId, key=", key);
                } else if (j <= entry.getValue().aj) {
                    Logger.d(this.a, "report completed banners, skipping banner info of later impression, key=", key);
                } else if (!entry.getValue().ah) {
                    Logger.d(this.a, "report completed banners, skipping banner info still not displayed impression, key=", key);
                } else {
                    Logger.d(this.a, "report completed banners, check to report banner info, adInfoKey=", key);
                    e value = entry.getValue();
                    if (value.K != null) {
                        Logger.d(this.a, "report completed banners, looking for completed banners to report, WebView=", value.K);
                        if (list != null) {
                            Iterator<WeakReference<View>> it = list.iterator();
                            while (it.hasNext()) {
                                String a2 = BrandSafetyUtils.a(it.next().get());
                                if (value.K.equals(a2)) {
                                    Logger.d(this.a, "report completed banners, WebView address still active, WebView=", a2);
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z && value.ab) {
                        Logger.d(this.a, "report completed banners, executing postponed banner reporting for eventId ", value.L);
                        value.a(m.C, new m.a[0]);
                        a(entry.getValue(), false, "reportCompletedBanners");
                        value.ab = false;
                        value.U = true;
                        arrayList.add(entry);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry2 : arrayList) {
                        Logger.d(BannerFinder.this.a, "report completed banners starting reporting for eventId ", ((e) entry2.getValue()).L);
                        if (!BannerFinder.this.O.contains(((d) entry2.getKey()).c)) {
                            BannerFinder.this.a((e) entry2.getValue(), true, "reportCompletedBannersTask");
                            synchronized (BannerFinder.class) {
                                BannerFinder.L.remove(entry2.getKey());
                            }
                            BannerFinder.this.a((e) entry2.getValue());
                            com.safedk.android.analytics.brandsafety.creatives.g.a((List<WeakReference<WebView>>) list2);
                        }
                    }
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    protected void a(ViewGroup viewGroup, String str, String str2, String str3, d dVar, List<WeakReference<View>> list, List<y> list2, List<String> list3, List<String> list4, int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        e eVar;
        e eVar2;
        int i2;
        boolean z5;
        int i3;
        String str4 = str2;
        String str5 = str3;
        d dVar2 = dVar;
        if (viewGroup == null) {
            return;
        }
        int i4 = i + 1;
        boolean z6 = z;
        boolean z7 = z2;
        int i5 = 0;
        while (i5 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i5);
            String a2 = BrandSafetyUtils.a(childAt);
            list3.add(a2);
            StringBuilder sb = new StringBuilder();
            sb.append("h");
            sb.append(i4);
            sb.append("c");
            int i6 = i5 + 1;
            sb.append(i6);
            sb.append(":");
            sb.append(childAt);
            list4.add(sb.toString());
            if (TextUtils.isEmpty(str2)) {
                z3 = true;
            } else if (!str4.equals(a2)) {
                z3 = z6;
            } else {
                Logger.d(this.a, "scan for banner views - verified by ad network view address received from Max: ", str4, ", view: ", childAt, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                z3 = true;
            }
            e eVar3 = L.get(dVar2);
            if (!z3) {
                z4 = z7;
                eVar = eVar3;
            } else {
                boolean a3 = a(viewGroup, str, dVar2);
                if (!((eVar3 != null && eVar3.j() == null && eVar3.m != null && !eVar3.m.isEmpty()) || !CreativeInfoManager.a(str, AdNetworkConfiguration.AVOID_MATCHING_CI_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false))) {
                    z4 = z7;
                    eVar = eVar3;
                } else {
                    boolean a4 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
                    z4 = z7;
                    boolean a5 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
                    eVar = eVar3;
                    boolean a6 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
                    if (a4) {
                        if (a(childAt, str, str5, dVar2)) {
                            return;
                        }
                    } else if (a5) {
                        b(childAt, str, str5, dVar2);
                    } else if (a3) {
                        String b2 = BrandSafetyUtils.b(childAt.getClass());
                        if (CreativeInfoManager.a(b2, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false)) {
                            b(childAt, b2, str5, dVar2);
                        }
                    } else if (a6) {
                        a(childAt, str, dVar2);
                    }
                }
            }
            if (z3 && (childAt instanceof WebView)) {
                a(childAt, str, list, list2, dVar);
                return;
            }
            if (!z3 || !a(str, childAt)) {
                eVar2 = eVar;
                i2 = i6;
                z5 = z4;
            } else {
                eVar2 = eVar;
                i2 = i6;
                a(childAt, str, list, list2, dVar);
                z5 = true;
            }
            if ((childAt instanceof TextView) && z5) {
                if (eVar2 == null || eVar2.j() == null || eVar2.H()) {
                    i3 = i4;
                } else {
                    TextView textView = (TextView) childAt;
                    eVar2.i().b("text:" + textView.getText().toString());
                    Logger.d(this.a, "scan for banner views - added text ", textView.getText().toString());
                    i3 = i4;
                }
            } else if (!(childAt instanceof ViewGroup)) {
                i3 = i4;
            } else {
                i3 = i4;
                a((ViewGroup) childAt, str, str2, str3, dVar, list, list2, list3, list4, i3, z3, z5);
            }
            str4 = str2;
            str5 = str3;
            dVar2 = dVar;
            z6 = z3;
            i5 = i2;
            z7 = z5;
            i4 = i3;
        }
    }

    protected void b(ViewGroup viewGroup, List<y> list, List<String> list2, int i) {
        if (viewGroup == null) {
            return;
        }
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i3);
            StringBuilder sb = new StringBuilder();
            sb.append("h");
            sb.append(i2);
            sb.append("c");
            i3++;
            sb.append(i3);
            sb.append(":");
            sb.append(childAt);
            list2.add(sb.toString());
            if (childAt instanceof WebView) {
                list.add(new y(BrandSafetyUtils.a(childAt), childAt.getClass().getName(), childAt.getWidth(), childAt.getHeight()));
                Logger.d(this.a, "found expanded view: ", childAt, ": width: ", Integer.valueOf(childAt.getWidth()), " height: ", Integer.valueOf(childAt.getHeight()), " sdk: ", childAt.getClass().getName());
            } else if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, list, list2, i2);
            }
        }
    }

    protected void a(ViewGroup viewGroup, e eVar) {
        Logger.d(this.a, "collect banner text started. view : ", viewGroup, ", bannerInfo : ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (viewGroup == null) {
            return;
        }
        if (eVar.H()) {
            Logger.d(this.a, "collect banner text - ad is a native ad: ", viewGroup, ", child count is: ", Integer.valueOf(viewGroup.getChildCount()));
            return;
        }
        Logger.d(this.a, "collect banner text - view is: ", viewGroup, ", child count is: ", Integer.valueOf(viewGroup.getChildCount()));
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            Logger.d(this.a, "collect banner text - child view ", Integer.valueOf(i), " is: ", childAt);
            if (childAt instanceof TextView) {
                Logger.d(this.a, "collect banner text - text box found. view ", childAt);
                if (eVar != null && eVar.j() != null) {
                    TextView textView = (TextView) childAt;
                    eVar.i().b("text:" + textView.getText().toString());
                    Logger.d(this.a, "collect banner text - added text ", textView.getText().toString());
                }
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, eVar);
            }
        }
    }

    protected void a(View view, String str, List<WeakReference<View>> list, List<y> list2, d dVar) {
        String a2 = BrandSafetyUtils.a(view);
        Logger.d(this.a, "handle ad view - view is an instance of ", view.getClass().getName(), " : ", a2, ", class : ", view.getClass().getCanonicalName(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String sdkPackageByClass = SdksMapping.getSdkPackageByClass(view.getClass().getName());
        e eVar = L.get(dVar);
        Logger.d(this.a, "handle ad view - sdk of view: ", sdkPackageByClass, ", sdk: ", str, " and event id: ", dVar.c);
        boolean z = eVar != null && eVar.T;
        if ((c(view) || z || sdkPackageByClass == null || sdkPackageByClass.equals(str)) && !s(a2)) {
            list2.add(new y(a2, view.getClass().getName(), view.getWidth(), view.getHeight()));
            list.add(new WeakReference<>(view));
            Logger.d(this.a, "found view: ", view, ": width: ", Integer.valueOf(view.getWidth()), " height: ", Integer.valueOf(view.getHeight()), " sdk: ", view.getClass().getName());
        }
        Logger.d(this.a, "view is not a valid instance of web view, or web view already matched, view: ", view);
    }

    public static boolean c(View view) {
        return view != null && view.getClass().getName().equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.r);
    }

    private boolean a(View view, String str, String str2, d dVar) {
        e eVar;
        String a2;
        AdNetworkDiscovery j = CreativeInfoManager.j(str);
        if (j != null && (eVar = L.get(dVar)) != null && eVar.j() == null && eVar.m != null && (a2 = j.a(view, dVar.f)) != null) {
            char c = 3;
            if (CreativeInfoManager.a(str, AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false) && str2 != null && !str2.equals(a2)) {
                Logger.d(this.a, "extract ad ID from view - value extracted (", a2, ") from widget is not equal to creative ID (", str2, ")");
                return true;
            }
            Logger.d(this.a, "extract ad ID from view - attempting to locate ci by ad ID value ", a2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            CreativeInfo a3 = j.a((Object) a2);
            if (a3 != null) {
                List<CreativeInfo> t = j.t(a3.L());
                Logger.d(this.a, Logger.FeatureTag.CI_MATCHING, "extract ad ID from view - found CI for adId ", a2, ", size : ", Integer.valueOf(t.size()), " : ", t);
                for (CreativeInfo creativeInfo : t) {
                    creativeInfo.a((Object) view);
                    creativeInfo.h(dVar.c);
                    creativeInfo.j(dVar.b);
                    b(creativeInfo, eVar);
                    String str3 = this.a;
                    Object[] objArr = new Object[6];
                    objArr[0] = "extract ad ID from view - ci placementId set to ";
                    objArr[1] = dVar.b;
                    objArr[2] = ", event ID : ";
                    objArr[c] = dVar.c;
                    objArr[4] = " , ad type  = ";
                    objArr[5] = a3.K();
                    Logger.d(str3, objArr);
                    a(new p(creativeInfo, CreativeInfo.n, a3.Y(), BrandSafetyUtils.a(view)));
                    c = 3;
                }
            } else {
                Logger.d(this.a, "extract ad ID from view - CI not found, adId = ", a2);
            }
        }
        return false;
    }

    private void b(final View view, final String str, final String str2, final d dVar) {
        final e eVar = L.get(dVar);
        final boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        final String a3 = BrandSafetyUtils.a(view);
        d dVar2 = S.get(dVar.a);
        final boolean z = dVar.i && !dVar.g.equals(a3) && (dVar2 == null || dVar2.equals(dVar));
        Logger.d(this.a, "try to match using reflection, sdk:", str, ", view: ", view, ", isWebviewChange: ", Boolean.valueOf(z), ", info: ", eVar);
        if (eVar != null) {
            if (eVar.k().isEmpty() || z) {
                this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.3
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
                    
                        if (r8.h.contains("##" + r8) == false) goto L42;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
                    
                        if (r8.h.contains("**" + r9) == false) goto L45;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x01f7 A[Catch: all -> 0x02cd, TryCatch #0 {all -> 0x02cd, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0016, B:9:0x001a, B:11:0x0020, B:14:0x002f, B:16:0x0037, B:18:0x004b, B:21:0x0053, B:22:0x00c6, B:24:0x00cc, B:26:0x00f6, B:27:0x00fd, B:29:0x013f, B:30:0x0149, B:33:0x0162, B:35:0x0169, B:37:0x016f, B:40:0x018e, B:43:0x01a9, B:45:0x01c2, B:47:0x01d4, B:49:0x01da, B:51:0x01f7, B:53:0x0210, B:56:0x0229, B:61:0x023d, B:63:0x0265, B:66:0x0294, B:67:0x026f, B:70:0x0292, B:72:0x0278, B:76:0x02a6), top: B:2:0x0006 }] */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0229 A[SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        boolean z2;
                        try {
                            if (a2 && !eVar.k().isEmpty() && (!z || !(view instanceof WebView))) {
                                Logger.d(BannerFinder.this.a, "try to match using reflection, exit");
                                return;
                            }
                            AdNetworkDiscovery j = CreativeInfoManager.j(str);
                            if (j != null) {
                                List<CreativeInfo> a4 = j.a(new WeakReference<>(view), str2, dVar.f);
                                if (a4 != null && !a4.isEmpty()) {
                                    char c = 5;
                                    int i = 6;
                                    Logger.d(BannerFinder.this.a, "extract ad ID from view - ad info's webview is: ", dVar.g, " and view address is: ", a3, " and max creative id: ", str2, " and banner info CI list size is: ", Integer.valueOf(eVar.k().size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                                    Logger.d(BannerFinder.this.a, "extract ad ID from view - is the view webView? ", Boolean.valueOf(view instanceof WebView), " and event id is: ", dVar.c);
                                    for (CreativeInfo creativeInfo : a4) {
                                        creativeInfo.a((Object) view);
                                        creativeInfo.a(BannerFinder.this.c);
                                        creativeInfo.h(dVar.c);
                                        String F = creativeInfo.F();
                                        creativeInfo.j(dVar.b);
                                        if (creativeInfo.L() == null) {
                                            creativeInfo.r(creativeInfo.N());
                                        }
                                        String str3 = BannerFinder.this.a;
                                        Logger.FeatureTag featureTag = Logger.FeatureTag.CI_MATCHING;
                                        Object[] objArr = new Object[i];
                                        objArr[0] = "extract ad ID from view - reflect CI found, view : ";
                                        objArr[1] = view;
                                        objArr[2] = " did webview replaced? ";
                                        objArr[3] = Boolean.valueOf(z);
                                        objArr[4] = ", ci : ";
                                        objArr[c] = creativeInfo.aa();
                                        Logger.d(str3, featureTag, objArr);
                                        Logger.d(BannerFinder.this.a, "extract ad ID from view - current adInfoKey's MatchedCIId is: ", dVar.h);
                                        String c2 = creativeInfo.M() != null ? com.safedk.android.utils.k.c(creativeInfo.M()) : null;
                                        Logger.d(BannerFinder.this.a, "extract ad ID from view - click url is: ", c2);
                                        if (dVar.h != null && creativeInfo.L() != null) {
                                            if (dVar.i) {
                                                if (!dVar.h.contains(creativeInfo.L() + "##")) {
                                                    if (F != null) {
                                                    }
                                                    if (c2 != null) {
                                                    }
                                                    z2 = BannerFinder.this.a(dVar, eVar.A, str2);
                                                    if (!z2 && dVar.h != null) {
                                                        if (dVar.h.contains(creativeInfo.L() + "##")) {
                                                            if (!dVar.h.contains("##" + F)) {
                                                                if (dVar.h.contains("**" + c2)) {
                                                                }
                                                            }
                                                        }
                                                        Logger.d(BannerFinder.this.a, "extract ad ID from view - redundant CI, exiting with event id - ", dVar.c);
                                                        return;
                                                    }
                                                }
                                            }
                                            z2 = false;
                                            if (!z2) {
                                                if (dVar.h.contains(creativeInfo.L() + "##")) {
                                                }
                                                Logger.d(BannerFinder.this.a, "extract ad ID from view - redundant CI, exiting with event id - ", dVar.c);
                                                return;
                                            }
                                        }
                                        dVar.g = a3;
                                        String str4 = creativeInfo.L() + "##" + F + "**" + c2;
                                        if (dVar.h == null || !dVar.h.contains(str4)) {
                                            d dVar3 = dVar;
                                            if (dVar.h != null) {
                                                str4 = dVar.h + m.ac + str4;
                                            }
                                            dVar3.h = str4;
                                        }
                                        BannerFinder.this.a(new p(creativeInfo, CreativeInfo.n), dVar);
                                        c = 5;
                                        i = 6;
                                    }
                                    return;
                                }
                                Logger.d(BannerFinder.this.a, "extract ad ID from view - reflect CI not found for max creative Id: ", str2, " and creative info size is: ", Integer.valueOf(eVar.k().size()));
                            }
                        } catch (Throwable th) {
                            Logger.e(BannerFinder.this.a, "extract ad ID from view - exception occurred: ", th.getMessage(), th);
                        }
                    }
                });
            }
        }
    }

    private void a(final View view, final String str, final d dVar) {
        e eVar = L.get(dVar);
        if (eVar != null && eVar.k().isEmpty() && a(str, view) && eVar.H()) {
            Logger.printFullVerboseLog(this.a, "extract ad ID from view - info :", eVar, ", ci : ", eVar.k());
            Logger.d(this.a, "extract ad ID from view - attempting to find CI by adInfoKey ", dVar);
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    AdNetworkDiscovery j = CreativeInfoManager.j(str);
                    if (j != null) {
                        CreativeInfo a2 = j.a((Object) (dVar.b + "_" + dVar.c + "_" + dVar.d));
                        if (a2 != null) {
                            Logger.d(BannerFinder.this.a, Logger.FeatureTag.CI_MATCHING, "extract ad ID from view - find CI by key found, adInfoKey : ", dVar, ", creativeInfo : ", a2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            a2.a((Object) view);
                            a2.a(BannerFinder.this.c);
                            a2.h(dVar.c);
                            a2.j(dVar.b);
                            if (a2.L() == null) {
                                a2.r(a2.N());
                            }
                            Logger.d(BannerFinder.this.a, "extract ad ID from view - reflect ci placement ID set to ", dVar.b, ", event ID : ", dVar.c);
                            BannerFinder.this.a(new p(a2, CreativeInfo.n));
                            return;
                        }
                        Logger.d(BannerFinder.this.a, "extract ad ID from view - reflect CI not found");
                    }
                }
            });
        }
    }

    private void b(CreativeInfo creativeInfo, e eVar) {
        BrandSafetyEvent.AdFormatType adFormatType;
        Logger.d(this.a, "update ad format : started, sdk = ", creativeInfo.Q(), ", initial ad type = ", creativeInfo.I(), " , bannerInfo = ", eVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false)) {
            if (eVar.I()) {
                adFormatType = BrandSafetyEvent.AdFormatType.MREC;
            } else {
                adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            }
            creativeInfo.a(adFormatType);
            Logger.d(this.a, "update ad type. ad type set to ", adFormatType);
        }
    }

    private boolean a(ViewGroup viewGroup, String str, d dVar) {
        e eVar;
        String a2 = BrandSafetyUtils.a((Class) viewGroup.getClass());
        if (!TextUtils.isEmpty(a2) && !a2.equals(str) && a2.equals(com.safedk.android.utils.h.h) && (eVar = L.get(dVar)) != null) {
            eVar.T = true;
            return true;
        }
        return false;
    }

    private String a(View view, String str) {
        String a2 = BrandSafetyUtils.a((Class) view.getClass());
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        if (TextUtils.isEmpty(str)) {
            return view.getClass().getName();
        }
        return str;
    }

    public void c(final Activity activity) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    BannerFinder.this.d(activity);
                }
            });
        } else {
            d(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        e eVar;
        Logger.d(this.a, Logger.FeatureTag.REDIRECTS, "start monitoring of redirect/expand, activity: ", activity, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        c a2 = BrandSafetyUtils.a(activity);
        if ((a2 instanceof e) && (eVar = (e) a2) != null) {
            eVar.ap = activity.toString();
            l i = eVar.i();
            if (i != null && i.e != null) {
                i.e.a("redirectActivityName=" + eVar.ap);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(String str) {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.V && eVar.ap != null && eVar.ap.equals(str)) {
                    a(eVar, false, "onActivityDestroyed");
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, String str3, d dVar, Bundle bundle) {
        e eVar;
        Activity a2 = a(bundle);
        if (this.O.contains(dVar.c)) {
            Logger.d(this.a, "handle REVENUE_EVENT - impression with id ", dVar.c, " has already been reported, ignoring. ");
            return;
        }
        if (f(str, str2)) {
            synchronized (L) {
                eVar = L.get(dVar);
                if (eVar == null) {
                    eVar = a(a2, str2, dVar.c, bundle);
                    L.put(dVar, eVar);
                    Logger.d(this.a, "New activity banner created for ", str2, ", banner key is ", dVar, ", current activity banners size is ", Integer.valueOf(L.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                } else {
                    if (eVar.A == null) {
                        eVar.A = bundle;
                    }
                    if (eVar.B == null || eVar.C == null) {
                        eVar.a(a(a2));
                    }
                }
            }
            if (eVar != null) {
                if (bundle.getString("revenue_event") != null) {
                    eVar.P = bundle.getString("revenue_event");
                } else {
                    eVar.P = "unknown";
                }
                eVar.M = str3;
                a(eVar, false, "handleRevenueEvent");
                Logger.d(this.a, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId ", dVar.c);
                eVar.ab = true;
            }
        } else {
            this.d++;
        }
        a(str2, str3, dVar, bundle);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        Set<d> keySet;
        l i;
        String d = BrandSafetyUtils.d();
        synchronized (L) {
            keySet = L.keySet();
        }
        Iterator<d> it = keySet.iterator();
        while (it.hasNext()) {
            e eVar = L.get(it.next());
            if (eVar != null && str2 != null && str2.equals(eVar.K) && (i = eVar.i()) != null && i.e != null && str3 != null && (str3.equals(i.e.m) || str3.equals(d))) {
                Logger.d(this.a, "redirect url was loaded to the ad web view: ", str2, " url: ", str3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                i.j().a(true);
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z, String str3) {
        return false;
    }

    public static String a(MaxNativeAdView maxNativeAdView) {
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.m != null && eVar.m.contains(a2)) {
                    return eVar.v;
                }
            }
            return null;
        }
    }

    public void g(String str, String str2) {
        Set<d> keySet;
        CreativeInfo j;
        a aVar;
        AdNetworkDiscovery j2;
        WeakReference<View> a2;
        Logger.d(this.a, "set on video completed event has been triggered - started for sdk= ", str, ",   adId= ", str2);
        synchronized (L) {
            keySet = L.keySet();
        }
        for (d dVar : keySet) {
            e eVar = L.get(dVar);
            if (eVar != null && (j = eVar.j()) != null && !TextUtils.isEmpty(j.L()) && j.L().equals(str2)) {
                Logger.d(this.a, "set on video completed event has been triggered - found ci= ", j.aa());
                eVar.i().k = true;
                eVar.A();
                a aVar2 = eVar.an;
                if (aVar2 == null && (j2 = CreativeInfoManager.j(str)) != null && (a2 = j2.a(dVar)) != null && a2.get() != null) {
                    a aVar3 = new a(eVar, a2, this.e, dVar);
                    eVar.an = aVar3;
                    Logger.d(this.a, "set on video completed event has been triggered - new task created= ", aVar3);
                    aVar = aVar3;
                } else {
                    aVar = aVar2;
                }
                if (aVar != null) {
                    if (eVar.an.d != null) {
                        Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "on video completed - cancelling existing taskFuture ", eVar.an.d);
                        eVar.an.d.cancel(false);
                        eVar.an.d = null;
                    }
                    eVar.an.d = this.E.scheduleWithFixedDelay(aVar, 500L, SafeDK.getInstance().Z() * 1000, TimeUnit.MILLISECONDS);
                } else {
                    Logger.d(this.a, "set on video completed event has been triggered - impression handler is null, could not start future task.");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void b() {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.ab) {
                    Logger.d(this.a, "report fullscreen ad detected, stop taking screenshots, event ID: ", eVar.w(), ", type: ", eVar.p.name());
                    eVar.O = true;
                    eVar.a(m.D, new m.a[0]);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c() {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar.ab) {
                    eVar.a(m.E, new m.a[0]);
                }
            }
        }
    }

    public int j() {
        int i;
        synchronized (L) {
            Iterator<e> it = L.values().iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().ab) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(e eVar, List<String> list, d dVar) {
        boolean z;
        boolean z2;
        String str;
        String aj;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (eVar.K != null && !list.contains(eVar.K)) {
                        Logger.d(this.a, "web view scanner - ad info view address not found in views hierarchy: ", eVar.K, " adUnitId: ", dVar.a, " no res propagation");
                        z = false;
                    } else {
                        z = true;
                    }
                    CreativeInfo j = eVar.j();
                    if (j == null || (aj = j.aj()) == null || !WebView.class.isAssignableFrom(Class.forName(aj))) {
                        z2 = true;
                        str = null;
                    } else {
                        str = j.ak();
                        if (str != null && !list.contains(str)) {
                            Logger.d(this.a, "web view scanner - matching object address not found in views hierarchy: ", str, " adUnitId: ", dVar.a, " no res propagation");
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (!z || !z2) {
                        Logger.d(this.a, "web view scanner - not all ad views are found in hierarchy - no propagation, adUnitId: ", dVar.a, "viewAddress: ", eVar.K, " matchingObjectAddress: ", str);
                        return false;
                    }
                    Logger.d(this.a, "web view scanner - found adInfo view in hierarchy. adUnitId: ", dVar.a, " viewAddress: ", eVar.K, " matchingObjectAddress: ", str);
                    return true;
                }
            } catch (Exception e) {
                Logger.e(this.a, "caught exception", e.getMessage());
                return false;
            }
        }
        Logger.d(this.a, "web view scanner - no views in hierarchy for info view: ", eVar.K, " adUnitId: ", dVar.a, " no res propagation");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        synchronized (L) {
            for (e eVar : L.values()) {
                if (eVar != null && eVar.ab && eVar.c() != null && eVar.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean r(String str) {
        Set<d> keySet;
        e eVar;
        if (str == null) {
            return false;
        }
        Logger.d(this.a, "bannerInfoExists started, creativeId = ", str);
        synchronized (L) {
            keySet = L.keySet();
        }
        if (!keySet.isEmpty()) {
            for (d dVar : keySet) {
                if (dVar != null && (eVar = L.get(dVar)) != null && eVar.z() != null && eVar.z().equals(str)) {
                    Logger.d(this.a, "bannerInfoExists banner info exists : ", eVar);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z) {
        if (cVar instanceof e) {
            a((e) cVar, z, str);
        }
    }

    public static void a(n nVar) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (L) {
                    for (e eVar : L.values()) {
                        if (eVar != null && eVar.ab && eVar.c() != null && eVar.c().equals(com.safedk.android.utils.h.o)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + m.ad + nVar);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("BannerFinder", "handleMintegralIntentReport exception", e);
        }
    }

    public static void a(RedirectDetails redirectDetails) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (L) {
                    for (e eVar : L.values()) {
                        if (eVar != null && eVar.ab && eVar.m != null && eVar.m.contains(redirectDetails.f)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + m.ad + redirectDetails);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("BannerFinder", "handleMintegralRedirectReport exception", e);
        }
    }

    public static void a(w wVar) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (L) {
                    for (e eVar : L.values()) {
                        if (eVar != null && eVar.ab && eVar.m != null && eVar.m.contains(wVar.c)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + m.ad + wVar);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("BannerFinder", "handleMintegralTouchReport exception", e);
        }
    }

    public static void a(String str, StackTraceElement[] stackTraceElementArr) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (L) {
                    for (e eVar : L.values()) {
                        if (eVar != null && eVar.ab && eVar.m != null && eVar.m.contains(str)) {
                            eVar.d("MUR:" + System.currentTimeMillis() + m.ad + Arrays.asList(stackTraceElementArr));
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("BannerFinder", "handleMintegralCallStackTrace exception", e);
        }
    }

    public static void a(String str, List<String> list) {
        try {
            if (SafeDK.getInstance().Q()) {
                synchronized (L) {
                    for (e eVar : L.values()) {
                        if (eVar != null && eVar.ab && eVar.m != null && eVar.m.contains(str)) {
                            eVar.d("MUR:byAddr:" + System.currentTimeMillis() + m.ad + list);
                            return;
                        }
                    }
                    for (e eVar2 : L.values()) {
                        if (eVar2 != null && eVar2.ab && eVar2.c() != null && eVar2.c().equals(com.safedk.android.utils.h.o)) {
                            eVar2.d("MUR:bySdk:" + System.currentTimeMillis() + m.ad + list);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("BannerFinder", "handleMintegralReflectionCall exception", e);
        }
    }
}
