package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4354hd;
import com.ironsource.M7;
import com.ironsource.N3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class Ve {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";
    protected static final String d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    public static final String n2 = "preload";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";
    protected static final int w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";
    protected static final boolean z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";
    private Id a;
    private Ld b;
    private N3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private M7.a i;
    private boolean j;
    private N5 k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public Ve(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = Kb.Q().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f = new JSONObject();
            } else {
                this.f = new JSONObject(str3);
            }
            this.j = o();
            t();
            r();
            s();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public static a a(Ve ve) {
        return ve != null ? ve.i() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.k = new N5(jSONObject.optJSONObject(C4641xe.d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C4290e3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4354hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C4290e3 c4290e3 = new C4290e3(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c4290e3, IronSource.a.BANNER);
        }
        return c4290e3;
    }

    private C4245bc f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4354hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C4245bc c4245bc = new C4245bc(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c4245bc, IronSource.a.NATIVE_AD);
        }
        return c4245bc;
    }

    private String m() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject c;
        JSONArray optJSONArray;
        JSONObject c3 = c(this.f, "providerOrder");
        JSONArray names = c3.names();
        if (names == null) {
            return true;
        }
        JSONObject c4 = c(c(this.f, "configurations"), b());
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i);
            JSONArray optJSONArray2 = c3.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (c = c(c4, optString)) != null && ((optJSONArray = c.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int i;
        try {
            i = this.f.optInt("protocolVersion", 0);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x06eb A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0707 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0755 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07ad A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07e3 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0802 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0894 A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07d4 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c1 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03f7 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0596 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06b4 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x0090, B:9:0x009c, B:10:0x00ba, B:14:0x012d, B:16:0x0191, B:19:0x0262, B:21:0x0268, B:24:0x0289, B:27:0x0293, B:29:0x0299, B:31:0x02a3, B:33:0x02a6, B:38:0x02c1, B:40:0x0318, B:42:0x03be, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03db, B:56:0x03f7, B:58:0x047d, B:60:0x0487, B:62:0x054a, B:65:0x0558, B:67:0x055e, B:69:0x056a, B:71:0x056d, B:76:0x0596, B:78:0x05fd, B:80:0x0605, B:82:0x067f, B:85:0x068d, B:87:0x0693, B:89:0x069f, B:91:0x06a2, B:94:0x06ad, B:96:0x06b4, B:99:0x06bf, B:101:0x06c5, B:103:0x06cf, B:105:0x06d7, B:106:0x06da, B:107:0x06e4, B:109:0x06eb, B:110:0x0702, B:112:0x0707, B:113:0x072d, B:115:0x0755, B:118:0x079b, B:120:0x07a1, B:123:0x07ad, B:124:0x07cd, B:127:0x07d9, B:129:0x07e3, B:131:0x07f2, B:132:0x07f6, B:133:0x07fb, B:135:0x0802, B:136:0x080b, B:138:0x086a, B:140:0x0872, B:142:0x0894, B:147:0x07d4, B:150:0x066f, B:151:0x0677, B:153:0x052a, B:154:0x0539, B:156:0x03a8, B:158:0x0275), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r() {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2;
        String str6;
        String str7;
        JSONObject jSONObject3;
        String str8;
        String str9;
        C4301ee c4301ee;
        String str10;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        E9 e9;
        String str18;
        String str19;
        String str20;
        String str21;
        JSONObject jSONObject6;
        String str22;
        String str23;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        String str24;
        JSONObject jSONObject9;
        C4301ee c4301ee2;
        JSONObject jSONObject10;
        String str25;
        E9 e92;
        String str26;
        U2 u2;
        JSONObject jSONObject11;
        String str27;
        U2 u22;
        Qb qb;
        boolean z2;
        We we;
        JSONObject c;
        String str28;
        JSONObject c3;
        C4539s2 c4539s2;
        C4539s2 c4539s22;
        C4539s2 c4539s23;
        C4539s2 c4539s24;
        try {
            JSONObject c4 = c(this.f, "configurations");
            JSONObject c5 = c(c4, b());
            JSONObject c6 = c(c4, "application");
            JSONObject c7 = c(c5, m());
            JSONObject c8 = c(c5, "interstitial");
            JSONObject c9 = c(c5, "banner");
            JSONObject c10 = c(c5, "nativeAd");
            JSONObject c11 = c(c6, "events");
            JSONObject c12 = c(c6, "loggers");
            JSONObject c13 = c(c6, "token");
            JSONObject c14 = c(c6, "segment");
            JSONObject c15 = c(c6, "auction");
            JSONObject c16 = c(c6, "crashReporter");
            JSONObject c17 = c(c6, "settings");
            JSONObject c18 = c(c6, "external");
            JSONObject c19 = c(c11, a1);
            if (c6 != null) {
                jSONObject = c19;
                IronSourceUtils.b(this.g, "uuidEnabled", c6.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = c19;
            }
            if (c11 != null) {
                String optString = c11.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    Kb.Y().q().a(optString);
                    G9.i().a(optString);
                    C4337ge.i().a(optString);
                    str = optString;
                    J1 a3 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
                    String str29 = I1;
                    String str30 = S1;
                    String str31 = V1;
                    String str32 = R1;
                    String str33 = W1;
                    String str34 = U1;
                    String str35 = P1;
                    String str36 = O1;
                    String str37 = "auctionTrials";
                    String str38 = G1;
                    String str39 = s1;
                    String str40 = F1;
                    String str41 = E1;
                    if (c7 == null) {
                        str2 = "";
                        JSONArray optJSONArray = c7.optJSONArray("placements");
                        str5 = "placements";
                        JSONObject c20 = c(c7, "events");
                        str4 = "events";
                        JSONObject d = d(c7, y0);
                        long optLong = c7.optLong(x0, 3000L);
                        boolean optBoolean = d.optBoolean(z0, false);
                        boolean optBoolean2 = d.optBoolean(A0, false);
                        boolean optBoolean3 = c7.optBoolean(B0, true);
                        int a4 = a(c7, c6, "parallelLoad", 2);
                        boolean a5 = a(c7, c6, "bidderExclusive", true);
                        int a6 = a(c7, c6, E0, 60);
                        int a7 = a(c7, c6, "expiredDurationInMinutes", -1);
                        int a8 = a(c7, c6, str39, 3);
                        boolean a9 = a(c7, c6, "isOneFlow", false);
                        JSONObject b = IronSourceUtils.b(c20, c11);
                        jSONObject2 = c11;
                        J1 a10 = a(b, Boolean.valueOf(b.optBoolean("sendUltraEvents", false)));
                        if (c15 != null) {
                            JSONObject c21 = c(c15, m());
                            str8 = "isOneFlow";
                            String optString2 = c15.optString(str41, str2);
                            str41 = str41;
                            String optString3 = c15.optString(str40, str2);
                            str40 = str40;
                            String optString4 = c15.optString(str38, str2);
                            str2 = str2;
                            str38 = str38;
                            int optInt = c15.optInt(str37, 2);
                            str39 = str39;
                            str37 = str37;
                            long optLong2 = c15.optLong(str36, 10000L);
                            int optInt2 = c15.optInt(str35, 15);
                            str36 = str36;
                            boolean optBoolean4 = c15.optBoolean(str34, false);
                            str34 = str34;
                            boolean optBoolean5 = c15.optBoolean(str31, false);
                            str31 = str31;
                            int optInt3 = c15.optInt(str33, 1);
                            str33 = str33;
                            boolean optBoolean6 = c15.optBoolean(str32, true);
                            str32 = str32;
                            boolean optBoolean7 = c21.optBoolean(str30, true);
                            str30 = str30;
                            str35 = str35;
                            int optInt4 = c21.optInt(str29, 2000);
                            str29 = str29;
                            jSONObject3 = c15;
                            int optInt5 = c21.optInt(L1, 30000);
                            str7 = L1;
                            int optInt6 = c21.optInt(J1, 5000);
                            str6 = E0;
                            int optInt7 = c21.optInt(K1, 50);
                            str3 = "bidderExclusive";
                            boolean optBoolean8 = c21.optBoolean(H1, false);
                            boolean optBoolean9 = c21.optBoolean("isLoadWhileShow", true);
                            int optInt8 = c21.optInt(T1, 30000);
                            str9 = B0;
                            C4539s2 c4539s25 = new C4539s2(optString2, optString3, optString4, optInt, optInt2, optLong2, optInt4, optInt5, optInt6, optInt7, optBoolean9, optInt8, optBoolean4, optBoolean5, optBoolean8, optInt3, false, optBoolean6, optBoolean7);
                            JSONArray optJSONArray2 = c21.optJSONArray(Q1);
                            if (optJSONArray2 != null) {
                                for (int i = 0; i < optJSONArray2.length(); i++) {
                                    c4539s25.a(optJSONArray2.optString(i));
                                }
                            }
                            c4539s24 = c4539s25;
                        } else {
                            str3 = "bidderExclusive";
                            str6 = E0;
                            str9 = B0;
                            str39 = str39;
                            str7 = L1;
                            jSONObject3 = c15;
                            str8 = "isOneFlow";
                            c4539s24 = new C4539s2();
                        }
                        C4301ee c4301ee3 = new C4301ee(a4, a5, a6, a7, a10, c4539s24, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                        if (optJSONArray != null) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                C4336gd g = g(optJSONArray.optJSONObject(i3));
                                if (g != null) {
                                    c4301ee3.a(g);
                                }
                            }
                        }
                        c4301ee = c4301ee3;
                    } else {
                        str2 = "";
                        str3 = "bidderExclusive";
                        str4 = "events";
                        str5 = "placements";
                        jSONObject2 = c11;
                        str6 = E0;
                        str7 = L1;
                        jSONObject3 = c15;
                        str8 = "isOneFlow";
                        str9 = B0;
                        c4301ee = null;
                    }
                    if (c8 == null) {
                        String str42 = str5;
                        JSONArray optJSONArray3 = c8.optJSONArray(str42);
                        str16 = str4;
                        JSONObject c22 = c(c8, str16);
                        JSONObject d3 = d(c8, y0);
                        str5 = str42;
                        long optLong3 = c8.optLong(x0, 3000L);
                        boolean optBoolean10 = d3.optBoolean(z0, false);
                        boolean optBoolean11 = d3.optBoolean(A0, false);
                        boolean optBoolean12 = c8.optBoolean(str9, true);
                        int a11 = a(c8, c6, "parallelLoad", 2);
                        boolean a12 = a(c8, c6, str3, false);
                        int a13 = a(c8, c6, str6, 60);
                        str13 = str39;
                        int a14 = a(c8, c6, str13, 3);
                        str12 = str8;
                        boolean a15 = a(c8, c6, str12, false);
                        JSONObject jSONObject12 = jSONObject2;
                        J1 a16 = a(IronSourceUtils.b(c22, jSONObject12), Boolean.FALSE);
                        if (jSONObject3 != null) {
                            jSONObject5 = jSONObject3;
                            JSONObject c23 = c(jSONObject5, "interstitial");
                            jSONObject4 = c6;
                            str15 = str41;
                            String str43 = str2;
                            String optString5 = jSONObject5.optString(str15, str43);
                            jSONObject2 = jSONObject12;
                            str14 = str40;
                            String optString6 = jSONObject5.optString(str14, str43);
                            str10 = z0;
                            String str44 = str38;
                            String optString7 = jSONObject5.optString(str44, str43);
                            str38 = str44;
                            str2 = str43;
                            String str45 = str37;
                            int optInt9 = jSONObject5.optInt(str45, 2);
                            str17 = x0;
                            String str46 = str35;
                            str35 = str46;
                            str37 = str45;
                            String str47 = str36;
                            String str48 = str34;
                            str36 = str47;
                            String str49 = str31;
                            str34 = str48;
                            String str50 = str33;
                            str31 = str49;
                            String str51 = str32;
                            str33 = str50;
                            String str52 = str30;
                            str32 = str51;
                            str11 = str29;
                            str30 = str52;
                            c4539s23 = new C4539s2(optString5, optString6, optString7, optInt9, jSONObject5.optInt(str46, 15), jSONObject5.optLong(str47, 10000L), c23.optInt(str11, 2000), 0L, 0L, 0L, true, 0, jSONObject5.optBoolean(str48, false), jSONObject5.optBoolean(str49, false), true, jSONObject5.optInt(str50, 1), false, jSONObject5.optBoolean(str51, true), c23.optBoolean(str52, true));
                        } else {
                            str10 = z0;
                            jSONObject4 = c6;
                            jSONObject2 = jSONObject12;
                            jSONObject5 = jSONObject3;
                            str11 = str29;
                            str14 = str40;
                            str15 = str41;
                            str17 = x0;
                            c4539s23 = new C4539s2();
                        }
                        E9 e93 = new E9(a11, a12, a13, a16, c4539s23, a14, a15, optLong3, optBoolean10, optBoolean11, optBoolean12);
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                I9 e = e(optJSONArray3.optJSONObject(i4));
                                if (e != null) {
                                    e93.a(e);
                                }
                            }
                        }
                        e9 = e93;
                    } else {
                        str10 = z0;
                        jSONObject4 = c6;
                        jSONObject5 = jSONObject3;
                        str11 = str29;
                        str12 = str8;
                        str13 = str39;
                        str14 = str40;
                        str15 = str41;
                        str16 = str4;
                        str17 = x0;
                        e9 = null;
                    }
                    if (c9 == null) {
                        String str53 = str5;
                        JSONArray optJSONArray4 = c9.optJSONArray(str53);
                        str19 = str11;
                        JSONObject c24 = c(c9, str16);
                        JSONObject d4 = d(c9, y0);
                        str20 = str14;
                        c4301ee2 = c4301ee;
                        str25 = str17;
                        jSONObject7 = c14;
                        String str54 = str10;
                        JSONArray jSONArray = optJSONArray4;
                        JSONObject jSONObject13 = jSONObject4;
                        jSONObject10 = c13;
                        e92 = e9;
                        str26 = str54;
                        str21 = str16;
                        String str55 = str15;
                        str5 = str53;
                        String str56 = str36;
                        str18 = y0;
                        String str57 = str2;
                        JSONObject jSONObject14 = jSONObject5;
                        str23 = str13;
                        jSONObject9 = jSONObject2;
                        long a17 = a(c9, jSONObject13, F0, 10000L);
                        int a18 = a(c9, jSONObject13, str23, 3);
                        int optInt10 = c9.optInt(G0, 60);
                        long optLong4 = c9.optLong(Y1, 15000L);
                        boolean a19 = a(c9, jSONObject13, str12, false);
                        long optLong5 = c9.optLong(str25, 3000L);
                        boolean optBoolean13 = d4.optBoolean(str26, false);
                        boolean optBoolean14 = d4.optBoolean(A0, false);
                        boolean optBoolean15 = c9.optBoolean(str9, true);
                        J1 a20 = a(IronSourceUtils.b(c24, jSONObject9), Boolean.FALSE);
                        if (jSONObject14 != null) {
                            jSONObject6 = jSONObject14;
                            JSONObject c25 = c(jSONObject6, "banner");
                            if (c25 != null) {
                                str22 = str55;
                                String optString8 = jSONObject6.optString(str22, str57);
                                String optString9 = jSONObject6.optString(str20, str57);
                                String str58 = str38;
                                String optString10 = jSONObject6.optString(str58, str57);
                                str24 = str37;
                                int optInt11 = jSONObject6.optInt(str24, 2);
                                str20 = str20;
                                String str59 = str35;
                                int optInt12 = jSONObject6.optInt(str59, 15);
                                jSONObject8 = jSONObject13;
                                str2 = str57;
                                str35 = str59;
                                long optLong6 = jSONObject6.optLong(str56, 10000L);
                                String str60 = str34;
                                boolean optBoolean16 = jSONObject6.optBoolean(str60, false);
                                str36 = str56;
                                String str61 = str31;
                                boolean optBoolean17 = jSONObject6.optBoolean(str61, false);
                                str34 = str60;
                                String str62 = str33;
                                int optInt13 = jSONObject6.optInt(str62, 1);
                                str31 = str61;
                                String str63 = str32;
                                boolean optBoolean18 = jSONObject6.optBoolean(str63, true);
                                str32 = str63;
                                String str64 = str30;
                                boolean optBoolean19 = c25.optBoolean(str64, true);
                                str33 = str62;
                                boolean optBoolean20 = c25.optBoolean(H1, true);
                                str30 = str64;
                                int optInt14 = c25.optInt(str19, 2000);
                                str19 = str19;
                                str38 = str58;
                                c4539s22 = new C4539s2(optString8, optString9, optString10, optInt11, optInt12, optLong6, optInt14, c25.optInt(str7, 15000), c25.optInt(J1, 50), 0L, c25.optBoolean("isLoadWhileShow", false), 0, optBoolean16, optBoolean17, optBoolean20, optInt13, c25.optBoolean(X1, true), optBoolean18, optBoolean19);
                            } else {
                                jSONObject8 = jSONObject13;
                                str24 = str37;
                                str22 = str55;
                                str36 = str56;
                                str2 = str57;
                                c4539s22 = new C4539s2();
                            }
                        } else {
                            jSONObject8 = jSONObject13;
                            str24 = str37;
                            jSONObject6 = jSONObject14;
                            str22 = str55;
                            str36 = str56;
                            str2 = str57;
                            c4539s22 = new C4539s2();
                        }
                        U2 u23 = new U2(1, a17, false, a20, optInt10, c4539s22, a18, a19, optLong5, optBoolean13, optBoolean14, optBoolean15, optLong4);
                        if (jSONArray != null) {
                            int i5 = 0;
                            while (i5 < jSONArray.length()) {
                                JSONArray jSONArray2 = jSONArray;
                                C4290e3 d5 = d(jSONArray2.optJSONObject(i5));
                                if (d5 != null) {
                                    u23.a(d5);
                                }
                                i5++;
                                jSONArray = jSONArray2;
                            }
                        }
                        u2 = u23;
                    } else {
                        str18 = y0;
                        str19 = str11;
                        str20 = str14;
                        str21 = str16;
                        jSONObject6 = jSONObject5;
                        str22 = str15;
                        str23 = str13;
                        jSONObject7 = c14;
                        jSONObject8 = jSONObject4;
                        str24 = str37;
                        jSONObject9 = jSONObject2;
                        c4301ee2 = c4301ee;
                        jSONObject10 = c13;
                        str25 = str17;
                        e92 = e9;
                        str26 = str10;
                        u2 = null;
                    }
                    if (c10 == null) {
                        JSONArray optJSONArray5 = c10.optJSONArray(str5);
                        String str65 = str21;
                        JSONObject c26 = c(c10, str65);
                        JSONObject d6 = d(c10, str18);
                        str21 = str65;
                        String str66 = str24;
                        String str67 = str19;
                        String str68 = str30;
                        String str69 = str32;
                        String str70 = str31;
                        String str71 = str33;
                        String str72 = str34;
                        String str73 = str35;
                        String str74 = str36;
                        String str75 = str38;
                        String str76 = str20;
                        String str77 = str2;
                        JSONArray jSONArray3 = optJSONArray5;
                        jSONObject11 = jSONObject8;
                        u22 = u2;
                        long a21 = a(c10, jSONObject11, F0, 10000L);
                        int a22 = a(c10, jSONObject11, str23, 0);
                        long optLong7 = c10.optLong(str25, 3000L);
                        boolean optBoolean21 = d6.optBoolean(str26, false);
                        boolean optBoolean22 = d6.optBoolean(A0, false);
                        boolean optBoolean23 = c10.optBoolean(str9, true);
                        J1 a23 = a(IronSourceUtils.b(c26, jSONObject9), Boolean.FALSE);
                        if (jSONObject6 != null) {
                            JSONObject c27 = c(jSONObject6, "nativeAd");
                            if (c27 != null) {
                                str27 = str77;
                                c4539s2 = new C4539s2(jSONObject6.optString(str22, str27), jSONObject6.optString(str76, str27), jSONObject6.optString(str75, str27), jSONObject6.optInt(str66, 2), jSONObject6.optInt(str73, 15), jSONObject6.optLong(str74, 10000L), c27.optInt(str67, 2000), 0L, 0L, 0L, true, 0, jSONObject6.optBoolean(str72, false), jSONObject6.optBoolean(str70, false), true, jSONObject6.optInt(str71, 1), false, jSONObject6.optBoolean(str69, true), c27.optBoolean(str68, true));
                            } else {
                                str27 = str77;
                                c4539s2 = new C4539s2();
                            }
                        } else {
                            str27 = str77;
                            c4539s2 = new C4539s2();
                        }
                        qb = new Qb(1, a21, false, a23, c4539s2, a22, optLong7, optBoolean21, optBoolean22, optBoolean23);
                        if (jSONArray3 != null) {
                            int i6 = 0;
                            while (i6 < jSONArray3.length()) {
                                JSONArray jSONArray4 = jSONArray3;
                                C4245bc f = f(jSONArray4.optJSONObject(i6));
                                if (f != null) {
                                    qb.a(f);
                                }
                                i6++;
                                jSONArray3 = jSONArray4;
                            }
                        }
                    } else {
                        jSONObject11 = jSONObject8;
                        str27 = str2;
                        u22 = u2;
                        qb = null;
                    }
                    C4500pg c4500pg = new C4500pg();
                    if (jSONObject10 != null) {
                        JSONObject jSONObject15 = jSONObject10;
                        JSONArray optJSONArray6 = jSONObject15.optJSONArray(Z1);
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                c4500pg.a(optJSONArray6.optString(i7));
                            }
                        }
                        JSONObject optJSONObject = jSONObject15.optJSONObject(a2);
                        if (optJSONObject != null) {
                            c4500pg.a(optJSONObject);
                        }
                        c4500pg.a(jSONObject15.optBoolean(b2, true));
                    }
                    C4300ed c4300ed = new C4300ed();
                    if (jSONObject == null) {
                        JSONObject jSONObject16 = jSONObject;
                        String optString11 = jSONObject16.optString(b1, C4318fd.a);
                        z2 = jSONObject16.optBoolean(c1, true);
                        c4300ed.a(optString11);
                    } else {
                        z2 = true;
                    }
                    c4300ed.b(z2);
                    if (z2) {
                        c4300ed.b(a(jSONObject9, "optOut"));
                        c4300ed.a(a(jSONObject9, "optIn"));
                        c4300ed.a(jSONObject9.optBoolean("eventsCompression", false));
                        c4300ed.a(jSONObject9.optInt("eventsCompressionLevel", -1));
                    }
                    Q1 q12 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    G1 g12 = new G1();
                    if (c16 != null) {
                        g12.a(c16.optBoolean("enabled", false));
                        g12.c(c16.optString("reporterURL", str27));
                        g12.b(c16.optString("reporterKeyword", str27));
                        g12.c(c16.optBoolean("includeANR", false));
                        g12.a(c16.optInt("timeout", 5000));
                        g12.b(c16.optBoolean("setIgnoreDebugger", false));
                        JSONArray optJSONArray7 = c16.optJSONArray("keysToInclude");
                        if (optJSONArray7 != null) {
                            for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                                g12.a(optJSONArray7.optString(i8));
                            }
                        }
                    }
                    if (jSONObject7 == null) {
                        JSONObject jSONObject17 = jSONObject7;
                        we = new We(jSONObject17.optString("name", str27), jSONObject17.optString("id", C4217a2.f), jSONObject17.optJSONObject("custom"));
                    } else {
                        we = null;
                    }
                    M1 m12 = new M1(c17 == null ? c17 : new JSONObject());
                    L1 l12 = new L1();
                    if (c18 != null) {
                        JSONObject optJSONObject2 = c18.optJSONObject(p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.b(optJSONObject2);
                        }
                        l12 = new L1(hashMap);
                    }
                    A1 a110 = new A1();
                    if (jSONObject6 != null) {
                        a110 = new A1(jSONObject6.optString(str22));
                    }
                    C1 c110 = new C1(q12, we, c4500pg, jSONObject11.optBoolean("integration", false), g12, m12, l12, c4300ed, a110, str, a3);
                    C4231ag h = h(c4);
                    com.ironsource.mediationsdk.adquality.a c28 = c(c4);
                    N3.a aVar = new N3.a();
                    aVar.a(c4301ee2);
                    aVar.a(e92);
                    aVar.a(u22);
                    aVar.a(qb);
                    aVar.a(c110);
                    aVar.b(h);
                    aVar.a(c28);
                    N3 a24 = aVar.a();
                    this.c = a24;
                    IronLog.INTERNAL.verbose(a24.toString());
                    c = c(jSONObject9, "genericParams");
                    if (c != null && (c3 = c(c, (str28 = str21))) != null) {
                        c.remove(str28);
                        Map<String, String> b3 = IronSourceUtils.b(c3);
                        Kb.Y().q().b(b3);
                        C4337ge.i().b(b3);
                        G9.i().b(b3);
                    }
                    if (c == null) {
                        Map<String, String> b4 = IronSourceUtils.b(c);
                        Kb.Y().q().a(b4);
                        C4337ge.i().a(b4);
                        G9.i().a(b4);
                        return;
                    }
                    return;
                }
            }
            str = null;
            J1 a32 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
            String str292 = I1;
            String str302 = S1;
            String str312 = V1;
            String str322 = R1;
            String str332 = W1;
            String str342 = U1;
            String str352 = P1;
            String str362 = O1;
            String str372 = "auctionTrials";
            String str382 = G1;
            String str392 = s1;
            String str402 = F1;
            String str412 = E1;
            if (c7 == null) {
            }
            if (c8 == null) {
            }
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            C4500pg c4500pg2 = new C4500pg();
            if (jSONObject10 != null) {
            }
            C4300ed c4300ed2 = new C4300ed();
            if (jSONObject == null) {
            }
            c4300ed2.b(z2);
            if (z2) {
            }
            Q1 q122 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            G1 g122 = new G1();
            if (c16 != null) {
            }
            if (jSONObject7 == null) {
            }
            M1 m122 = new M1(c17 == null ? c17 : new JSONObject());
            L1 l122 = new L1();
            if (c18 != null) {
            }
            A1 a1102 = new A1();
            if (jSONObject6 != null) {
            }
            C1 c1102 = new C1(q122, we, c4500pg2, jSONObject11.optBoolean("integration", false), g122, m122, l122, c4300ed2, a1102, str, a32);
            C4231ag h3 = h(c4);
            com.ironsource.mediationsdk.adquality.a c282 = c(c4);
            N3.a aVar2 = new N3.a();
            aVar2.a(c4301ee2);
            aVar2.a(e92);
            aVar2.a(u22);
            aVar2.a(qb);
            aVar2.a(c1102);
            aVar2.b(h3);
            aVar2.a(c282);
            N3 a242 = aVar2.a();
            this.c = a242;
            IronLog.INTERNAL.verbose(a242.toString());
            c = c(jSONObject9, "genericParams");
            if (c != null) {
                c.remove(str28);
                Map<String, String> b32 = IronSourceUtils.b(c3);
                Kb.Y().q().b(b32);
                C4337ge.i().b(b32);
                G9.i().b(b32);
            }
            if (c == null) {
            }
        } catch (Exception e3) {
            C4452n4.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
        }
    }

    private void s() {
        try {
            JSONObject c = c(this.f, "providerOrder");
            JSONArray b = b(c, m());
            JSONArray b3 = b(c, "interstitial");
            JSONArray b4 = b(c, "banner");
            JSONArray b5 = b(c, "nativeAd");
            this.a = new Id();
            if (b != null && c() != null && c().f() != null) {
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    this.a.d(optString);
                    NetworkSettings b6 = Ld.c().b(optString);
                    if (b6 != null) {
                        b6.setRewardedVideoPriority(i);
                    }
                }
            }
            if (b3 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < b3.length(); i3++) {
                    String optString2 = b3.optString(i3);
                    this.a.b(optString2);
                    NetworkSettings b7 = Ld.c().b(optString2);
                    if (b7 != null) {
                        b7.setInterstitialPriority(i3);
                    }
                }
            }
            if (b4 != null) {
                for (int i4 = 0; i4 < b4.length(); i4++) {
                    String optString3 = b4.optString(i4);
                    this.a.a(optString3);
                    NetworkSettings b8 = Ld.c().b(optString3);
                    if (b8 != null) {
                        b8.setBannerPriority(i4);
                    }
                }
            }
            if (b5 != null) {
                for (int i5 = 0; i5 < b5.length(); i5++) {
                    String optString4 = b5.optString(i5);
                    this.a.c(optString4);
                    NetworkSettings b9 = Ld.c().b(optString4);
                    if (b9 != null) {
                        b9.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        try {
            this.b = Ld.c();
            JSONObject c = c(this.f, "providerSettings");
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = c.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject c3 = c(optJSONObject, b());
                    JSONObject c4 = c(optJSONObject, "application");
                    JSONObject c5 = c(c3, m());
                    JSONObject c6 = c(c3, "interstitial");
                    JSONObject c7 = c(c3, "banner");
                    JSONObject c8 = c(c3, "nativeAd");
                    JSONObject b = IronSourceUtils.b(c5, c4);
                    JSONObject b3 = IronSourceUtils.b(c6, c4);
                    JSONObject b4 = IronSourceUtils.b(c7, c4);
                    JSONObject b5 = IronSourceUtils.b(c8, c4);
                    if (this.b.a(next)) {
                        Kb.Y().q().a(new C4632x5(EnumC4650y5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings b6 = this.b.b(next);
                        JSONObject rewardedVideoSettings = b6.getRewardedVideoSettings();
                        JSONObject interstitialSettings = b6.getInterstitialSettings();
                        JSONObject bannerSettings = b6.getBannerSettings();
                        JSONObject nativeAdSettings = b6.getNativeAdSettings();
                        b6.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, b));
                        b6.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, b3));
                        b6.setBannerSettings(IronSourceUtils.b(bannerSettings, b4));
                        b6.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, b5));
                        b6.setIsMultipleInstances(optBoolean);
                        b6.setSubProviderId(optString);
                        b6.setAdSourceNameForEvents(optString2);
                        b6.setProviderNetworkKey(optString3);
                    } else {
                        if (b(optString4)) {
                            jSONObject = c;
                            NetworkSettings b7 = this.b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = b7.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = b7.getInterstitialSettings();
                            JSONObject bannerSettings2 = b7.getBannerSettings();
                            JSONObject nativeAdSettings2 = b7.getNativeAdSettings();
                            it = keys;
                            NetworkSettings networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c4, IronSourceUtils.b(new JSONObject(rewardedVideoSettings2.toString()), b), IronSourceUtils.b(new JSONObject(interstitialSettings2.toString()), b3), IronSourceUtils.b(new JSONObject(bannerSettings2.toString()), b4), IronSourceUtils.b(new JSONObject(nativeAdSettings2.toString()), b5));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            this.b.a(networkSettings);
                        } else {
                            jSONObject = c;
                            it = keys;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, optString4, optString5, optString3, c4, b, b3, b4, b5);
                            networkSettings2.setIsMultipleInstances(optBoolean);
                            networkSettings2.setSubProviderId(optString);
                            networkSettings2.setAdSourceNameForEvents(optString2);
                            this.b.a(networkSettings2);
                        }
                        c = jSONObject;
                        keys = it;
                    }
                }
            }
            this.b.b();
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public String e() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f.optString("error");
    }

    public Y8 g() {
        return new Y8(this.d, this.e);
    }

    public List<IronSource.a> h() {
        Id id;
        Id id2;
        Id id3;
        Id id4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (id4 = this.a) != null && !id4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (id3 = this.a) != null && !id3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.c.c() != null && (id2 = this.a) != null && !id2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.c.e() != null && (id = this.a) != null && !id.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.h;
    }

    public JSONObject j() {
        return this.f;
    }

    public Id k() {
        return this.a;
    }

    public Ld l() {
        return this.b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f;
        return (jSONObject == null || jSONObject.has("error") || this.a == null || this.b == null || this.c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.d);
            jSONObject.put("userId", this.e);
            jSONObject.put("response", this.f);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.j ? "adFormats" : C4216a1.c;
    }

    private C4336gd g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        String optString2 = jSONObject.optString("virtualItemName", "");
        int optInt2 = jSONObject.optInt("virtualItemCount", -1);
        C4354hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt2 <= 0) {
            return null;
        }
        C4336gd c4336gd = new C4336gd(optInt, optString, optBoolean, optString2, optInt2, a3);
        if (a3 != null) {
            this.i.b(this.g, c4336gd, IronSource.a.REWARDED_VIDEO);
        }
        return c4336gd;
    }

    public N3 c() {
        return this.c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject c = c(jSONObject, str);
        String a3 = a(str);
        if (c == null || a3 == null) {
            return null;
        }
        return c.optJSONArray(a3);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject c = c(jSONObject, "AdQuality");
        if (c != null) {
            aVar.a(c.optInt("initMode", 0));
            new U9().b(c.optString("adq_init_blob"));
        }
        return aVar;
    }

    private I9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4354hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        I9 i9 = new I9(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, i9, IronSource.a.INTERSTITIAL);
        }
        return i9;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = new JSONObject();
        this.d = "";
        this.e = "";
        this.a = new Id();
        this.b = Ld.c();
        this.c = new N3.a().a();
        this.i = Kb.Q().x();
        b(this.f);
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c = c(jSONObject, str);
        return c != null ? c : new JSONObject();
    }

    public N5 f() {
        return this.k;
    }

    private Context d() {
        return this.g;
    }

    private String a(String str) {
        try {
            JSONObject c = c(c(c(c(this.f, "configurations"), "adFormats"), str), C4216a1.c);
            if (c == null) {
                return null;
            }
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject c3 = c(c, next);
                if (c3 != null && c3.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static C4500pg b(Ve ve) {
        if (ve != null && ve.q()) {
            return ve.c().b().k();
        }
        return C4500pg.a();
    }

    private C4231ag h(JSONObject jSONObject) {
        C4231ag c4231ag = new C4231ag();
        JSONObject c = c(jSONObject, "testSuite");
        if (c != null) {
            c4231ag.b(c.optString("controllerUrl"));
        }
        return c4231ag;
    }

    public Ve(Ve ve) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = ve.d();
            this.f = new JSONObject(ve.f.toString());
            this.d = ve.d;
            this.e = ve.e;
            this.j = ve.j;
            this.a = ve.k();
            this.b = ve.l();
            this.c = ve.c();
            this.h = ve.i();
            this.i = Kb.Q().x();
            b(this.f);
        } catch (Exception e) {
            C4452n4.d().a(e);
            a();
        }
    }

    private J1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean optBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean optBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int optInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String optString = jSONObject.optString("serverEventsURL", "");
        String optString2 = jSONObject.optString("serverEventsType", "");
        int optInt2 = jSONObject.optInt("backupThreshold", -1);
        int optInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int optInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray optJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (optJSONArray != null) {
            int[] iArr5 = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr5[i] = optJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("optIn");
        if (optJSONArray2 != null) {
            int[] iArr6 = new int[optJSONArray2.length()];
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                iArr6[i3] = optJSONArray2.optInt(i3);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (optJSONArray3 != null) {
            int[] iArr7 = new int[optJSONArray3.length()];
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                iArr7[i4] = optJSONArray3.optInt(i4);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (optJSONArray4 != null) {
            iArr4 = new int[optJSONArray4.length()];
            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                iArr4[i5] = optJSONArray4.optInt(i5);
            }
        }
        return new J1(bool.booleanValue(), optBoolean, optBoolean2, optInt, optString, optString2, optInt2, optInt3, optInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z2) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i3 = 0;
        if (jSONObject.has(str)) {
            i3 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i3 = jSONObject2.optInt(str, 0);
        }
        return i3 == 0 ? i : i3;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long optLong;
        if (jSONObject.has(str)) {
            optLong = jSONObject.optLong(str, 0L);
        } else {
            optLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return optLong == 0 ? j : optLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C4354hd a(JSONObject jSONObject) {
        EnumC4425ld enumC4425ld = null;
        if (jSONObject == null) {
            return null;
        }
        C4354hd.a aVar = new C4354hd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(n1);
            if (!TextUtils.isEmpty(optString)) {
                EnumC4425ld enumC4425ld2 = EnumC4425ld.PER_DAY;
                if (!enumC4425ld2.toString().equals(optString)) {
                    enumC4425ld2 = EnumC4425ld.PER_HOUR;
                }
                enumC4425ld = enumC4425ld2;
            }
            int optInt = optJSONObject.optInt(l1, 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, enumC4425ld, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(m1, 0);
            aVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }
}
