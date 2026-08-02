package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C2458hd;
import com.ironsource.L7;
import com.ironsource.N3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
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
    private L7.a i;
    private boolean j;
    private L5 k;

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
        this.i = Jb.Q().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f = IronSourceNetworkBridge.jsonObjectInit();
            } else {
                this.f = IronSourceNetworkBridge.jsonObjectInit(str3);
            }
            this.j = o();
            t();
            r();
            s();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public static a a(Ve ve) {
        return ve != null ? ve.i() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.k = new L5(jSONObject.optJSONObject(C2745xe.d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C2394e3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C2458hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C2394e3 c2394e3 = new C2394e3(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c2394e3, IronSource.a.BANNER);
        }
        return c2394e3;
    }

    private C2331ac f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C2458hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C2331ac c2331ac = new C2331ac(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c2331ac, IronSource.a.NATIVE_AD);
        }
        return c2331ac;
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
            i = this.f.optInt(j2, 0);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0661 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x067d A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06ce A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x072a A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x075f A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0780 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0810 A[Catch: Exception -> 0x082e, TRY_LEAVE, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0751 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026f A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0390 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0512 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0629 A[Catch: Exception -> 0x082e, TryCatch #0 {Exception -> 0x082e, blocks: (B:3:0x0004, B:5:0x0072, B:7:0x008c, B:9:0x0098, B:10:0x00b6, B:14:0x00fe, B:16:0x0163, B:19:0x021c, B:21:0x0222, B:24:0x023c, B:27:0x0246, B:29:0x024c, B:31:0x0258, B:33:0x025b, B:37:0x026f, B:39:0x02c5, B:40:0x0353, B:43:0x035f, B:45:0x0365, B:47:0x0373, B:49:0x0376, B:54:0x0390, B:56:0x040e, B:58:0x0416, B:59:0x04cd, B:62:0x04dd, B:64:0x04e3, B:66:0x04ef, B:68:0x04f2, B:73:0x0512, B:75:0x0570, B:77:0x0578, B:78:0x05f1, B:81:0x0601, B:83:0x0607, B:85:0x0613, B:87:0x0616, B:90:0x0622, B:92:0x0629, B:95:0x0634, B:97:0x063a, B:99:0x0644, B:101:0x064d, B:102:0x0650, B:103:0x065a, B:105:0x0661, B:106:0x0678, B:108:0x067d, B:109:0x06a3, B:111:0x06ce, B:114:0x0718, B:116:0x071e, B:119:0x072a, B:120:0x074a, B:123:0x0755, B:125:0x075f, B:127:0x076e, B:128:0x0772, B:129:0x0777, B:131:0x0780, B:132:0x0789, B:134:0x07e6, B:136:0x07ee, B:138:0x0810, B:143:0x0751, B:146:0x05e2, B:147:0x05ea, B:149:0x04ae, B:150:0x04be, B:152:0x0344, B:154:0x022f), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject3;
        C2405ee c2405ee;
        String str7;
        String str8;
        JSONObject jSONObject4;
        String str9;
        JSONObject jSONObject5;
        D9 d9;
        String str10;
        String str11;
        String str12;
        C2405ee c2405ee2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        D9 d92;
        U2 u2;
        JSONObject jSONObject6;
        String str18;
        U2 u22;
        Pb pb;
        boolean z2;
        JSONObject c;
        String str19;
        JSONObject c3;
        C2643s2 c2643s2;
        C2643s2 c2643s22;
        String str20;
        C2643s2 c2643s23;
        C2643s2 c2643s24;
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
                jSONObject2 = c4;
                IronSourceUtils.b(this.g, "uuidEnabled", c6.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = c19;
                jSONObject2 = c4;
            }
            if (c11 != null) {
                String optString = c11.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    Jb.Y().q().a(optString);
                    F9.i().a(optString);
                    C2441ge.i().a(optString);
                    str = optString;
                    J1 a3 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
                    String str21 = F1;
                    String str22 = "auctionTrials";
                    String str23 = P1;
                    String str24 = O1;
                    if (c7 == null) {
                        str6 = G1;
                        JSONArray optJSONArray = c7.optJSONArray("placements");
                        str4 = "placements";
                        JSONObject c20 = c(c7, "events");
                        str2 = "events";
                        JSONObject d = d(c7, y0);
                        JSONArray jSONArray = optJSONArray;
                        long optLong = c7.optLong(x0, 3000L);
                        boolean optBoolean = d.optBoolean(z0, false);
                        boolean optBoolean2 = d.optBoolean(A0, false);
                        boolean optBoolean3 = c7.optBoolean(B0, true);
                        int a4 = a(c7, c6, "parallelLoad", 2);
                        boolean a5 = a(c7, c6, "bidderExclusive", true);
                        int a6 = a(c7, c6, E0, 60);
                        int a7 = a(c7, c6, "expiredDurationInMinutes", -1);
                        int a8 = a(c7, c6, s1, 3);
                        boolean a9 = a(c7, c6, "isOneFlow", false);
                        JSONObject b = IronSourceUtils.b(c20, c11);
                        J1 a10 = a(b, Boolean.valueOf(b.optBoolean("sendUltraEvents", false)));
                        if (c15 != null) {
                            JSONObject c21 = c(c15, m());
                            String optString2 = c15.optString(E1, "");
                            String optString3 = c15.optString(str21, "");
                            String optString4 = c15.optString(str6, "");
                            str6 = str6;
                            int optInt = c15.optInt(str22, 2);
                            str22 = str22;
                            str21 = str21;
                            long optLong2 = c15.optLong(str24, 10000L);
                            int optInt2 = c15.optInt(str23, 15);
                            str24 = str24;
                            boolean optBoolean4 = c15.optBoolean(U1, false);
                            boolean optBoolean5 = c15.optBoolean(V1, false);
                            int optInt3 = c15.optInt(W1, 1);
                            boolean optBoolean6 = c15.optBoolean(R1, true);
                            boolean optBoolean7 = c21.optBoolean(S1, true);
                            int optInt4 = c21.optInt(I1, 2000);
                            str23 = str23;
                            int optInt5 = c21.optInt(L1, 30000);
                            str3 = "";
                            int optInt6 = c21.optInt(J1, 5000);
                            str5 = E1;
                            jSONObject3 = c15;
                            C2643s2 c2643s25 = new C2643s2(optString2, optString3, optString4, optInt, optInt2, optLong2, optInt4, optInt5, optInt6, c21.optInt(K1, 50), c21.optBoolean("isLoadWhileShow", true), c21.optInt(T1, 30000), optBoolean4, optBoolean5, c21.optBoolean(H1, false), optInt3, false, optBoolean6, optBoolean7);
                            JSONArray optJSONArray2 = c21.optJSONArray(Q1);
                            if (optJSONArray2 != null) {
                                for (int i = 0; i < optJSONArray2.length(); i++) {
                                    c2643s25.a(optJSONArray2.optString(i));
                                }
                            }
                            c2643s24 = c2643s25;
                        } else {
                            str5 = E1;
                            jSONObject3 = c15;
                            str3 = "";
                            c2643s24 = new C2643s2();
                        }
                        c2405ee = new C2405ee(a4, a5, a6, a7, a10, c2643s24, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                        if (jSONArray != null) {
                            int i3 = 0;
                            while (i3 < jSONArray.length()) {
                                JSONArray jSONArray2 = jSONArray;
                                C2440gd g = g(jSONArray2.optJSONObject(i3));
                                if (g != null) {
                                    c2405ee.a(g);
                                }
                                i3++;
                                jSONArray = jSONArray2;
                            }
                        }
                    } else {
                        str2 = "events";
                        str3 = "";
                        str4 = "placements";
                        str5 = E1;
                        str6 = G1;
                        jSONObject3 = c15;
                        c2405ee = null;
                    }
                    if (c8 == null) {
                        String str25 = str4;
                        JSONArray optJSONArray3 = c8.optJSONArray(str25);
                        str7 = str2;
                        JSONObject c22 = c(c8, str7);
                        JSONObject d3 = d(c8, y0);
                        str4 = str25;
                        JSONArray jSONArray3 = optJSONArray3;
                        long optLong3 = c8.optLong(x0, 3000L);
                        boolean optBoolean8 = d3.optBoolean(z0, false);
                        boolean optBoolean9 = d3.optBoolean(A0, false);
                        boolean optBoolean10 = c8.optBoolean(B0, true);
                        int a11 = a(c8, c6, "parallelLoad", 2);
                        boolean a12 = a(c8, c6, "bidderExclusive", false);
                        int a13 = a(c8, c6, E0, 60);
                        int a14 = a(c8, c6, s1, 3);
                        boolean a15 = a(c8, c6, "isOneFlow", false);
                        J1 a16 = a(IronSourceUtils.b(c22, c11), Boolean.FALSE);
                        if (jSONObject3 != null) {
                            jSONObject4 = jSONObject3;
                            JSONObject c23 = c(jSONObject4, "interstitial");
                            String str26 = str3;
                            str8 = str5;
                            String optString5 = jSONObject4.optString(str8, str26);
                            String str27 = str21;
                            String optString6 = jSONObject4.optString(str27, str26);
                            jSONObject5 = c6;
                            String str28 = str6;
                            String optString7 = jSONObject4.optString(str28, str26);
                            str6 = str28;
                            str3 = str26;
                            String str29 = str22;
                            int optInt7 = jSONObject4.optInt(str29, 2);
                            str22 = str29;
                            String str30 = str23;
                            str23 = str30;
                            str9 = str27;
                            str20 = str24;
                            c2643s23 = new C2643s2(optString5, optString6, optString7, optInt7, jSONObject4.optInt(str30, 15), jSONObject4.optLong(str20, 10000L), c23.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject4.optBoolean(U1, false), jSONObject4.optBoolean(V1, false), true, jSONObject4.optInt(W1, 1), false, jSONObject4.optBoolean(R1, true), c23.optBoolean(S1, true));
                        } else {
                            str9 = str21;
                            str20 = str24;
                            str8 = str5;
                            jSONObject4 = jSONObject3;
                            jSONObject5 = c6;
                            c2643s23 = new C2643s2();
                        }
                        D9 d93 = new D9(a11, a12, a13, a16, c2643s23, a14, a15, optLong3, optBoolean8, optBoolean9, optBoolean10);
                        if (jSONArray3 != null) {
                            int i4 = 0;
                            while (i4 < jSONArray3.length()) {
                                String str31 = str20;
                                JSONArray jSONArray4 = jSONArray3;
                                H9 e = e(jSONArray4.optJSONObject(i4));
                                if (e != null) {
                                    d93.a(e);
                                }
                                i4++;
                                jSONArray3 = jSONArray4;
                                str20 = str31;
                            }
                        }
                        str24 = str20;
                        d9 = d93;
                    } else {
                        str7 = str2;
                        str8 = str5;
                        jSONObject4 = jSONObject3;
                        str9 = str21;
                        jSONObject5 = c6;
                        d9 = null;
                    }
                    if (c9 == null) {
                        String str32 = str4;
                        JSONArray optJSONArray4 = c9.optJSONArray(str32);
                        JSONObject c24 = c(c9, str7);
                        JSONObject d4 = d(c9, y0);
                        String str33 = str22;
                        JSONArray jSONArray5 = optJSONArray4;
                        JSONObject jSONObject7 = jSONObject5;
                        String str34 = str9;
                        str10 = str7;
                        str14 = y0;
                        c2405ee2 = c2405ee;
                        String str35 = str8;
                        str16 = str32;
                        String str36 = str3;
                        d92 = d9;
                        str13 = z0;
                        long a17 = a(c9, jSONObject7, F0, 10000L);
                        int a18 = a(c9, jSONObject7, s1, 3);
                        int optInt8 = c9.optInt(G0, 60);
                        long optLong4 = c9.optLong(Y1, 15000L);
                        boolean a19 = a(c9, jSONObject7, "isOneFlow", false);
                        long optLong5 = c9.optLong(x0, 3000L);
                        boolean optBoolean11 = d4.optBoolean(str13, false);
                        boolean optBoolean12 = d4.optBoolean(A0, false);
                        boolean optBoolean13 = c9.optBoolean(B0, true);
                        J1 a20 = a(IronSourceUtils.b(c24, c11), Boolean.FALSE);
                        if (jSONObject4 != null) {
                            JSONObject c25 = c(jSONObject4, "banner");
                            if (c25 != null) {
                                str11 = str35;
                                str17 = str36;
                                String optString8 = jSONObject4.optString(str11, str17);
                                String optString9 = jSONObject4.optString(str34, str17);
                                String str37 = str6;
                                String optString10 = jSONObject4.optString(str37, str17);
                                int optInt9 = jSONObject4.optInt(str33, 2);
                                str6 = str37;
                                String str38 = str23;
                                int optInt10 = jSONObject4.optInt(str38, 15);
                                jSONObject5 = jSONObject7;
                                str12 = str34;
                                str23 = str38;
                                String str39 = str24;
                                str24 = str39;
                                str15 = str33;
                                c2643s22 = new C2643s2(optString8, optString9, optString10, optInt9, optInt10, jSONObject4.optLong(str39, 10000L), c25.optInt(I1, 2000), c25.optInt(L1, Wa.u), c25.optInt(J1, 50), 0L, c25.optBoolean("isLoadWhileShow", false), 0, jSONObject4.optBoolean(U1, false), jSONObject4.optBoolean(V1, false), c25.optBoolean(H1, true), jSONObject4.optInt(W1, 1), c25.optBoolean(X1, true), jSONObject4.optBoolean(R1, true), c25.optBoolean(S1, true));
                            } else {
                                str12 = str34;
                                str11 = str35;
                                str17 = str36;
                                str15 = str33;
                                jSONObject5 = jSONObject7;
                                c2643s22 = new C2643s2();
                            }
                        } else {
                            str12 = str34;
                            str11 = str35;
                            str17 = str36;
                            str15 = str33;
                            jSONObject5 = jSONObject7;
                            c2643s22 = new C2643s2();
                        }
                        U2 u23 = new U2(1, a17, false, a20, optInt8, c2643s22, a18, a19, optLong5, optBoolean11, optBoolean12, optBoolean13, optLong4);
                        if (jSONArray5 != null) {
                            int i5 = 0;
                            while (i5 < jSONArray5.length()) {
                                JSONArray jSONArray6 = jSONArray5;
                                C2394e3 d5 = d(jSONArray6.optJSONObject(i5));
                                if (d5 != null) {
                                    u23.a(d5);
                                }
                                i5++;
                                jSONArray5 = jSONArray6;
                            }
                        }
                        u2 = u23;
                    } else {
                        String str40 = str9;
                        str10 = str7;
                        str11 = str8;
                        str12 = str40;
                        c2405ee2 = c2405ee;
                        str13 = z0;
                        str14 = y0;
                        str15 = str22;
                        str16 = str4;
                        str17 = str3;
                        d92 = d9;
                        u2 = null;
                    }
                    if (c10 == null) {
                        JSONArray optJSONArray5 = c10.optJSONArray(str16);
                        String str41 = str10;
                        JSONObject c26 = c(c10, str41);
                        JSONObject d6 = d(c10, str14);
                        String str42 = str11;
                        String str43 = str12;
                        String str44 = str15;
                        String str45 = str23;
                        String str46 = str24;
                        String str47 = str6;
                        str18 = str41;
                        u22 = u2;
                        JSONArray jSONArray7 = optJSONArray5;
                        jSONObject6 = jSONObject5;
                        long a21 = a(c10, jSONObject6, F0, 10000L);
                        int a22 = a(c10, jSONObject6, s1, 0);
                        long optLong6 = c10.optLong(x0, 3000L);
                        boolean optBoolean14 = d6.optBoolean(str13, false);
                        boolean optBoolean15 = d6.optBoolean(A0, false);
                        boolean optBoolean16 = c10.optBoolean(B0, true);
                        J1 a23 = a(IronSourceUtils.b(c26, c11), Boolean.FALSE);
                        if (jSONObject4 != null) {
                            JSONObject c27 = c(jSONObject4, "nativeAd");
                            if (c27 != null) {
                                str11 = str42;
                                c2643s2 = new C2643s2(jSONObject4.optString(str11, str17), jSONObject4.optString(str43, str17), jSONObject4.optString(str47, str17), jSONObject4.optInt(str44, 2), jSONObject4.optInt(str45, 15), jSONObject4.optLong(str46, 10000L), c27.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject4.optBoolean(U1, false), jSONObject4.optBoolean(V1, false), true, jSONObject4.optInt(W1, 1), false, jSONObject4.optBoolean(R1, true), c27.optBoolean(S1, true));
                            } else {
                                str11 = str42;
                                c2643s2 = new C2643s2();
                            }
                        } else {
                            str11 = str42;
                            c2643s2 = new C2643s2();
                        }
                        pb = new Pb(1, a21, false, a23, c2643s2, a22, optLong6, optBoolean14, optBoolean15, optBoolean16);
                        if (jSONArray7 != null) {
                            int i6 = 0;
                            while (i6 < jSONArray7.length()) {
                                JSONArray jSONArray8 = jSONArray7;
                                C2331ac f = f(jSONArray8.optJSONObject(i6));
                                if (f != null) {
                                    pb.a(f);
                                }
                                i6++;
                                jSONArray7 = jSONArray8;
                            }
                        }
                    } else {
                        jSONObject6 = jSONObject5;
                        str18 = str10;
                        u22 = u2;
                        pb = null;
                    }
                    C2496jg c2496jg = new C2496jg();
                    if (c13 != null) {
                        JSONArray optJSONArray6 = c13.optJSONArray(Z1);
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                c2496jg.a(optJSONArray6.optString(i7));
                            }
                        }
                        JSONObject optJSONObject = c13.optJSONObject(a2);
                        if (optJSONObject != null) {
                            c2496jg.a(optJSONObject);
                        }
                        c2496jg.a(c13.optBoolean(b2, true));
                    }
                    C2404ed c2404ed = new C2404ed();
                    if (jSONObject == null) {
                        JSONObject jSONObject8 = jSONObject;
                        String optString11 = jSONObject8.optString(b1, C2422fd.a);
                        z2 = jSONObject8.optBoolean(c1, true);
                        c2404ed.a(optString11);
                    } else {
                        z2 = true;
                    }
                    c2404ed.b(z2);
                    if (z2) {
                        c2404ed.b(a(c11, "optOut"));
                        c2404ed.a(a(c11, "optIn"));
                        c2404ed.a(c11.optBoolean("eventsCompression", false));
                        c2404ed.a(c11.optInt("eventsCompressionLevel", -1));
                    }
                    Q1 q12 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    G1 g12 = new G1();
                    if (c16 != null) {
                        g12.a(c16.optBoolean("enabled", false));
                        g12.c(c16.optString("reporterURL", str17));
                        g12.b(c16.optString("reporterKeyword", str17));
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
                    We we = c14 == null ? new We(c14.optString("name", str17), c14.optString("id", "-1"), c14.optJSONObject("custom")) : null;
                    M1 m12 = new M1(c17 == null ? c17 : IronSourceNetworkBridge.jsonObjectInit());
                    L1 l12 = new L1();
                    if (c18 != null) {
                        JSONObject optJSONObject2 = c18.optJSONObject(p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.b(optJSONObject2);
                        }
                        l12 = new L1(hashMap);
                    }
                    L1 l13 = l12;
                    A1 a110 = new A1();
                    if (jSONObject4 != null) {
                        a110 = new A1(jSONObject4.optString(str11));
                    }
                    C1 c110 = new C1(q12, we, c2496jg, jSONObject6.optBoolean("integration", false), g12, m12, l13, c2404ed, a110, str, a3);
                    JSONObject jSONObject9 = jSONObject2;
                    Xf h = h(jSONObject9);
                    com.ironsource.mediationsdk.adquality.a c28 = c(jSONObject9);
                    N3.a aVar = new N3.a();
                    aVar.a(c2405ee2);
                    aVar.a(d92);
                    aVar.a(u22);
                    aVar.a(pb);
                    aVar.a(c110);
                    aVar.b(h);
                    aVar.a(c28);
                    N3 a24 = aVar.a();
                    this.c = a24;
                    IronLog.INTERNAL.verbose(a24.toString());
                    c = c(c11, "genericParams");
                    if (c != null && (c3 = c(c, (str19 = str18))) != null) {
                        c.remove(str19);
                        Map<String, String> b3 = IronSourceUtils.b(c3);
                        Jb.Y().q().b(b3);
                        C2441ge.i().b(b3);
                        F9.i().b(b3);
                    }
                    if (c == null) {
                        Map<String, String> b4 = IronSourceUtils.b(c);
                        Jb.Y().q().a(b4);
                        C2441ge.i().a(b4);
                        F9.i().a(b4);
                        return;
                    }
                    return;
                }
            }
            str = null;
            J1 a32 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
            String str212 = F1;
            String str222 = "auctionTrials";
            String str232 = P1;
            String str242 = O1;
            if (c7 == null) {
            }
            if (c8 == null) {
            }
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            C2496jg c2496jg2 = new C2496jg();
            if (c13 != null) {
            }
            C2404ed c2404ed2 = new C2404ed();
            if (jSONObject == null) {
            }
            c2404ed2.b(z2);
            if (z2) {
            }
            Q1 q122 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            G1 g122 = new G1();
            if (c16 != null) {
            }
            if (c14 == null) {
            }
            M1 m122 = new M1(c17 == null ? c17 : IronSourceNetworkBridge.jsonObjectInit());
            L1 l122 = new L1();
            if (c18 != null) {
            }
            L1 l132 = l122;
            A1 a1102 = new A1();
            if (jSONObject4 != null) {
            }
            C1 c1102 = new C1(q122, we, c2496jg2, jSONObject6.optBoolean("integration", false), g122, m122, l132, c2404ed2, a1102, str, a32);
            JSONObject jSONObject92 = jSONObject2;
            Xf h3 = h(jSONObject92);
            com.ironsource.mediationsdk.adquality.a c282 = c(jSONObject92);
            N3.a aVar2 = new N3.a();
            aVar2.a(c2405ee2);
            aVar2.a(d92);
            aVar2.a(u22);
            aVar2.a(pb);
            aVar2.a(c1102);
            aVar2.b(h3);
            aVar2.a(c282);
            N3 a242 = aVar2.a();
            this.c = a242;
            IronLog.INTERNAL.verbose(a242.toString());
            c = c(c11, "genericParams");
            if (c != null) {
                c.remove(str19);
                Map<String, String> b32 = IronSourceUtils.b(c3);
                Jb.Y().q().b(b32);
                C2441ge.i().b(b32);
                F9.i().b(b32);
            }
            if (c == null) {
            }
        } catch (Exception e3) {
            C2556n4.d().a(e3);
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
            C2556n4.d().a(e);
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
                        Jb.Y().q().a(new C2736x5(EnumC2754y5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
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
                            NetworkSettings networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c4, IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(rewardedVideoSettings2.toString()), b), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(interstitialSettings2.toString()), b3), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(bannerSettings2.toString()), b4), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(nativeAdSettings2.toString()), b5));
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
            C2556n4.d().a(e);
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

    public X8 g() {
        return new X8(this.d, this.e);
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
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("appKey", this.d);
            jsonObjectInit.put("userId", this.e);
            jsonObjectInit.put("response", this.f);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jsonObjectInit.toString();
    }

    private String b() {
        return this.j ? "adFormats" : C2320a1.c;
    }

    private C2440gd g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        String optString2 = jSONObject.optString("virtualItemName", "");
        int optInt2 = jSONObject.optInt("virtualItemCount", -1);
        C2458hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt2 <= 0) {
            return null;
        }
        C2440gd c2440gd = new C2440gd(optInt, optString, optBoolean, optString2, optInt2, a3);
        if (a3 != null) {
            this.i.b(this.g, c2440gd, IronSource.a.REWARDED_VIDEO);
        }
        return c2440gd;
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
            new T9().b(c.optString("adq_init_blob"));
        }
        return aVar;
    }

    private H9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C2458hd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        H9 h9 = new H9(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, h9, IronSource.a.INTERSTITIAL);
        }
        return h9;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = IronSourceNetworkBridge.jsonObjectInit();
        this.d = "";
        this.e = "";
        this.a = new Id();
        this.b = Ld.c();
        this.c = new N3.a().a();
        this.i = Jb.Q().x();
        b(this.f);
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c = c(jSONObject, str);
        return c != null ? c : IronSourceNetworkBridge.jsonObjectInit();
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    public L5 f() {
        return this.k;
    }

    private Context d() {
        return this.g;
    }

    private String a(String str) {
        try {
            JSONObject c = c(c(c(c(this.f, "configurations"), "adFormats"), str), C2320a1.c);
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
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static C2496jg b(Ve ve) {
        if (ve != null && ve.q()) {
            return ve.c().b().k();
        }
        return C2496jg.a();
    }

    private Xf h(JSONObject jSONObject) {
        Xf xf = new Xf();
        JSONObject c = c(jSONObject, "testSuite");
        if (c != null) {
            xf.b(c.optString("controllerUrl"));
        }
        return xf;
    }

    public Ve(Ve ve) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = ve.d();
            this.f = IronSourceNetworkBridge.jsonObjectInit(ve.f.toString());
            this.d = ve.d;
            this.e = ve.e;
            this.j = ve.j;
            this.a = ve.k();
            this.b = ve.l();
            this.c = ve.c();
            this.h = ve.i();
            this.i = Jb.Q().x();
            b(this.f);
        } catch (Exception e) {
            C2556n4.d().a(e);
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C2458hd a(JSONObject jSONObject) {
        EnumC2529ld enumC2529ld = null;
        if (jSONObject == null) {
            return null;
        }
        C2458hd.a aVar = new C2458hd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                EnumC2529ld enumC2529ld2 = EnumC2529ld.PER_DAY;
                if (!enumC2529ld2.toString().equals(optString)) {
                    enumC2529ld2 = EnumC2529ld.PER_HOUR;
                }
                enumC2529ld = enumC2529ld2;
            }
            int optInt = optJSONObject.optInt(l1, 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, enumC2529ld, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(m1, 0);
            aVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }
}
