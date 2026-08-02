package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.C4095gd;
import com.ironsource.J7;
import com.ironsource.K3;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Te {
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
    private Hd a;
    private Kd b;
    private K3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private J7.a i;
    private boolean j;
    private K5 k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    public Te(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = Ib.R().x();
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
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
        return new H1(bool.booleanValue(), optBoolean, optBoolean2, optInt, optString, optString2, optInt2, optInt3, optInt4, iArr, iArr2, iArr3, iArr4);
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

    private C4013c3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4095gd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C4013c3 c4013c3 = new C4013c3(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c4013c3, IronSource.a.BANNER);
        }
        return c4013c3;
    }

    private H9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4095gd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        H9 h9 = new H9(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, h9, IronSource.a.INTERSTITIAL);
        }
        return h9;
    }

    private C3961ac f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        C4095gd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        C3961ac c3961ac = new C3961ac(optInt, optString, optBoolean, a3);
        if (a3 != null) {
            this.i.b(this.g, c3961ac, IronSource.a.NATIVE_AD);
        }
        return c3961ac;
    }

    private C4077fd g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(h1, false);
        String optString2 = jSONObject.optString("virtualItemName", "");
        int optInt2 = jSONObject.optInt("virtualItemCount", -1);
        C4095gd a3 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt2 <= 0) {
            return null;
        }
        C4077fd c4077fd = new C4077fd(optInt, optString, optBoolean, optString2, optInt2, a3);
        if (a3 != null) {
            this.i.b(this.g, c4077fd, IronSource.a.REWARDED_VIDEO);
        }
        return c4077fd;
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0710 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x072c A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x077a A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07d2 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0808 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0827 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08b9 A[Catch: Exception -> 0x08d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07f9 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e3 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x042e A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05b9 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06d9 A[Catch: Exception -> 0x08d7, TryCatch #0 {Exception -> 0x08d7, blocks: (B:3:0x000e, B:5:0x007d, B:7:0x008d, B:9:0x0099, B:10:0x00b7, B:14:0x0132, B:16:0x0192, B:19:0x0268, B:21:0x026e, B:24:0x029c, B:27:0x02a6, B:29:0x02ac, B:31:0x02b8, B:33:0x02bb, B:38:0x02e3, B:40:0x0339, B:42:0x03e7, B:45:0x03f3, B:47:0x03f9, B:49:0x0403, B:51:0x0406, B:56:0x042e, B:58:0x04a8, B:60:0x04b2, B:62:0x0572, B:65:0x0580, B:67:0x0586, B:69:0x0592, B:71:0x0595, B:76:0x05b9, B:78:0x0623, B:80:0x062b, B:82:0x06a5, B:85:0x06b5, B:87:0x06bb, B:89:0x06c5, B:91:0x06c8, B:94:0x06d2, B:96:0x06d9, B:99:0x06e4, B:101:0x06ea, B:103:0x06f4, B:105:0x06fc, B:106:0x06ff, B:107:0x0709, B:109:0x0710, B:110:0x0727, B:112:0x072c, B:113:0x0752, B:115:0x077a, B:118:0x07c0, B:120:0x07c6, B:123:0x07d2, B:124:0x07f2, B:127:0x07fe, B:129:0x0808, B:131:0x0817, B:132:0x081b, B:133:0x0820, B:135:0x0827, B:136:0x0830, B:138:0x088f, B:140:0x0897, B:142:0x08b9, B:147:0x07f9, B:150:0x0695, B:151:0x069d, B:153:0x0554, B:154:0x0562, B:156:0x03cb, B:158:0x027b), top: B:2:0x000e }] */
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
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        C4042de c4042de;
        JSONObject jSONObject3;
        C4042de c4042de2;
        String str16;
        String str17;
        String str18;
        String str19;
        JSONObject jSONObject4;
        String str20;
        String str21;
        String str22;
        JSONObject jSONObject5;
        String str23;
        String str24;
        String str25;
        String str26;
        D9 d9;
        String str27;
        String str28;
        String str29;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        String str30;
        String str31;
        String str32;
        String str33;
        D9 d92;
        String str34;
        String str35;
        String str36;
        S2 s2;
        JSONObject jSONObject8;
        String str37;
        S2 s22;
        Pb pb;
        boolean z2;
        JSONObject c;
        String str38;
        JSONObject c3;
        C4263q2 c4263q2;
        C4263q2 c4263q22;
        String str39;
        C4263q2 c4263q23;
        C4263q2 c4263q24;
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
                    Ib.a0().q().a(optString);
                    F9.i().a(optString);
                    C4078fe.i().a(optString);
                    str = optString;
                    H1 a3 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
                    String str40 = S1;
                    String str41 = R1;
                    String str42 = W1;
                    String str43 = V1;
                    String str44 = U1;
                    JSONObject jSONObject9 = c11;
                    String str45 = F1;
                    String str46 = G1;
                    String str47 = E1;
                    if (c7 == null) {
                        str2 = "";
                        JSONArray optJSONArray = c7.optJSONArray("placements");
                        str5 = "placements";
                        JSONObject c20 = c(c7, "events");
                        str4 = "events";
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
                        JSONObject b = IronSourceUtils.b(c20, jSONObject9);
                        H1 a10 = a(b, Boolean.valueOf(b.optBoolean("sendUltraEvents", false)));
                        if (c15 != null) {
                            JSONObject c21 = c(c15, m());
                            jSONObject9 = jSONObject9;
                            String optString2 = c15.optString(str47, str2);
                            str47 = str47;
                            String optString3 = c15.optString(str45, str2);
                            str45 = str45;
                            String optString4 = c15.optString(str46, str2);
                            str2 = str2;
                            str46 = str46;
                            int optInt = c15.optInt("auctionTrials", 2);
                            str3 = s1;
                            str15 = "bidderExclusive";
                            long optLong2 = c15.optLong(O1, 10000L);
                            int optInt2 = c15.optInt(P1, 15);
                            str14 = O1;
                            boolean optBoolean4 = c15.optBoolean(str44, false);
                            str44 = str44;
                            boolean optBoolean5 = c15.optBoolean(str43, false);
                            str43 = str43;
                            int optInt3 = c15.optInt(str42, 1);
                            str42 = str42;
                            boolean optBoolean6 = c15.optBoolean(str41, true);
                            str41 = str41;
                            boolean optBoolean7 = c21.optBoolean(str40, true);
                            str40 = str40;
                            str13 = P1;
                            int optInt4 = c21.optInt(I1, 2000);
                            str12 = I1;
                            str10 = "auctionTrials";
                            int optInt5 = c21.optInt(L1, 30000);
                            str9 = L1;
                            jSONObject2 = c15;
                            int optInt6 = c21.optInt(J1, 5000);
                            str8 = J1;
                            int optInt7 = c21.optInt(K1, 50);
                            str11 = "isOneFlow";
                            boolean optBoolean8 = c21.optBoolean(H1, false);
                            str7 = H1;
                            str6 = "isLoadWhileShow";
                            C4263q2 c4263q25 = new C4263q2(optString2, optString3, optString4, optInt, optInt2, optLong2, optInt4, optInt5, optInt6, optInt7, c21.optBoolean("isLoadWhileShow", true), c21.optInt(T1, 30000), optBoolean4, optBoolean5, optBoolean8, optInt3, false, optBoolean6, optBoolean7);
                            JSONArray optJSONArray2 = c21.optJSONArray(Q1);
                            if (optJSONArray2 != null) {
                                for (int i = 0; i < optJSONArray2.length(); i++) {
                                    c4263q25.a(optJSONArray2.optString(i));
                                }
                            }
                            c4263q24 = c4263q25;
                        } else {
                            str3 = s1;
                            jSONObject9 = jSONObject9;
                            str6 = "isLoadWhileShow";
                            str7 = H1;
                            str8 = J1;
                            str9 = L1;
                            str10 = "auctionTrials";
                            jSONObject2 = c15;
                            str11 = "isOneFlow";
                            str12 = I1;
                            str13 = P1;
                            str14 = O1;
                            str15 = "bidderExclusive";
                            c4263q24 = new C4263q2();
                        }
                        C4042de c4042de3 = new C4042de(a4, a5, a6, a7, a10, c4263q24, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                        if (jSONArray != null) {
                            int i3 = 0;
                            while (i3 < jSONArray.length()) {
                                JSONArray jSONArray2 = jSONArray;
                                C4077fd g = g(jSONArray2.optJSONObject(i3));
                                if (g != null) {
                                    c4042de3.a(g);
                                }
                                i3++;
                                jSONArray = jSONArray2;
                            }
                        }
                        c4042de = c4042de3;
                    } else {
                        str2 = "";
                        str3 = s1;
                        str4 = "events";
                        str5 = "placements";
                        str6 = "isLoadWhileShow";
                        str7 = H1;
                        str8 = J1;
                        str9 = L1;
                        str10 = "auctionTrials";
                        jSONObject2 = c15;
                        str11 = "isOneFlow";
                        str12 = I1;
                        str13 = P1;
                        str14 = O1;
                        str15 = "bidderExclusive";
                        c4042de = null;
                    }
                    if (c8 == null) {
                        String str48 = str5;
                        JSONArray optJSONArray3 = c8.optJSONArray(str48);
                        str22 = str4;
                        JSONObject c22 = c(c8, str22);
                        JSONObject d3 = d(c8, y0);
                        c4042de2 = c4042de;
                        str5 = str48;
                        long optLong3 = c8.optLong(x0, 3000L);
                        boolean optBoolean9 = d3.optBoolean(z0, false);
                        boolean optBoolean10 = d3.optBoolean(A0, false);
                        boolean optBoolean11 = c8.optBoolean(B0, true);
                        int a11 = a(c8, c6, "parallelLoad", 2);
                        boolean a12 = a(c8, c6, str15, false);
                        int a13 = a(c8, c6, E0, 60);
                        str17 = str3;
                        int a14 = a(c8, c6, str17, 3);
                        str16 = str11;
                        boolean a15 = a(c8, c6, str16, false);
                        jSONObject4 = jSONObject9;
                        H1 a16 = a(IronSourceUtils.b(c22, jSONObject4), Boolean.FALSE);
                        if (jSONObject2 != null) {
                            jSONObject5 = jSONObject2;
                            JSONObject c23 = c(jSONObject5, "interstitial");
                            str20 = str47;
                            str21 = str2;
                            String optString5 = jSONObject5.optString(str20, str21);
                            jSONObject3 = c6;
                            String str49 = str45;
                            String optString6 = jSONObject5.optString(str49, str21);
                            str45 = str49;
                            String str50 = str46;
                            String optString7 = jSONObject5.optString(str50, str21);
                            str23 = A0;
                            String str51 = str10;
                            str26 = z0;
                            int optInt8 = jSONObject5.optInt(str51, 2);
                            String str52 = str13;
                            str25 = str51;
                            int optInt9 = jSONObject5.optInt(str52, 15);
                            String str53 = str14;
                            str24 = str52;
                            str46 = str50;
                            String str54 = str44;
                            String str55 = str43;
                            str18 = str53;
                            String str56 = str42;
                            str44 = str54;
                            String str57 = str41;
                            str42 = str56;
                            str43 = str55;
                            str39 = str40;
                            str41 = str57;
                            str19 = str12;
                            c4263q23 = new C4263q2(optString5, optString6, optString7, optInt8, optInt9, jSONObject5.optLong(str53, 10000L), c23.optInt(str19, 2000), 0L, 0L, 0L, true, 0, jSONObject5.optBoolean(str54, false), jSONObject5.optBoolean(str55, false), true, jSONObject5.optInt(str56, 1), false, jSONObject5.optBoolean(str57, true), c23.optBoolean(str39, true));
                        } else {
                            str23 = A0;
                            jSONObject3 = c6;
                            str39 = str40;
                            str18 = str14;
                            str19 = str12;
                            str20 = str47;
                            str21 = str2;
                            jSONObject5 = jSONObject2;
                            str24 = str13;
                            str25 = str10;
                            str26 = z0;
                            c4263q23 = new C4263q2();
                        }
                        D9 d93 = new D9(a11, a12, a13, a16, c4263q23, a14, a15, optLong3, optBoolean9, optBoolean10, optBoolean11);
                        str40 = str39;
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                H9 e = e(optJSONArray3.optJSONObject(i4));
                                if (e != null) {
                                    d93.a(e);
                                }
                            }
                        }
                        d9 = d93;
                    } else {
                        jSONObject3 = c6;
                        c4042de2 = c4042de;
                        str16 = str11;
                        str17 = str3;
                        str18 = str14;
                        str19 = str12;
                        jSONObject4 = jSONObject9;
                        str20 = str47;
                        str21 = str2;
                        str22 = str4;
                        jSONObject5 = jSONObject2;
                        str23 = A0;
                        str24 = str13;
                        str25 = str10;
                        str26 = z0;
                        d9 = null;
                    }
                    if (c9 == null) {
                        String str58 = str5;
                        JSONArray optJSONArray4 = c9.optJSONArray(str58);
                        JSONObject c24 = c(c9, str22);
                        JSONObject d4 = d(c9, y0);
                        JSONArray jSONArray3 = optJSONArray4;
                        str33 = str58;
                        str27 = str22;
                        JSONObject jSONObject10 = jSONObject5;
                        String str59 = str21;
                        String str60 = str20;
                        JSONObject jSONObject11 = jSONObject3;
                        str30 = str26;
                        String str61 = str18;
                        str35 = y0;
                        jSONObject6 = c13;
                        str36 = str23;
                        str31 = str25;
                        str34 = str19;
                        d92 = d9;
                        long a17 = a(c9, jSONObject11, F0, 10000L);
                        int a18 = a(c9, jSONObject11, str17, 3);
                        int optInt10 = c9.optInt(G0, 60);
                        long optLong4 = c9.optLong(Y1, 15000L);
                        boolean a19 = a(c9, jSONObject11, str16, false);
                        long optLong5 = c9.optLong(x0, 3000L);
                        boolean optBoolean12 = d4.optBoolean(str30, false);
                        boolean optBoolean13 = d4.optBoolean(str36, false);
                        boolean optBoolean14 = c9.optBoolean(B0, true);
                        H1 a20 = a(IronSourceUtils.b(c24, jSONObject4), Boolean.FALSE);
                        if (jSONObject10 != null) {
                            jSONObject5 = jSONObject10;
                            JSONObject c25 = c(jSONObject5, "banner");
                            if (c25 != null) {
                                str29 = str60;
                                str28 = str59;
                                String optString8 = jSONObject5.optString(str29, str28);
                                String str62 = str45;
                                String optString9 = jSONObject5.optString(str62, str28);
                                String str63 = str46;
                                String optString10 = jSONObject5.optString(str63, str28);
                                int optInt11 = jSONObject5.optInt(str31, 2);
                                str46 = str63;
                                String str64 = str24;
                                int optInt12 = jSONObject5.optInt(str64, 15);
                                str24 = str64;
                                str31 = str31;
                                str32 = str61;
                                long optLong6 = jSONObject5.optLong(str32, 10000L);
                                String str65 = str44;
                                boolean optBoolean15 = jSONObject5.optBoolean(str65, false);
                                str44 = str65;
                                String str66 = str43;
                                boolean optBoolean16 = jSONObject5.optBoolean(str66, false);
                                jSONObject7 = jSONObject11;
                                String str67 = str42;
                                int optInt13 = jSONObject5.optInt(str67, 1);
                                str43 = str66;
                                String str68 = str41;
                                boolean optBoolean17 = jSONObject5.optBoolean(str68, true);
                                str41 = str68;
                                String str69 = str40;
                                boolean optBoolean18 = c25.optBoolean(str69, true);
                                str45 = str62;
                                boolean optBoolean19 = c25.optBoolean(str7, true);
                                str40 = str69;
                                int optInt14 = c25.optInt(str34, 2000);
                                str34 = str34;
                                str42 = str67;
                                c4263q22 = new C4263q2(optString8, optString9, optString10, optInt11, optInt12, optLong6, optInt14, c25.optInt(str9, 15000), c25.optInt(str8, 50), 0L, c25.optBoolean(str6, false), 0, optBoolean15, optBoolean16, optBoolean19, optInt13, c25.optBoolean(X1, true), optBoolean17, optBoolean18);
                            } else {
                                jSONObject7 = jSONObject11;
                                str32 = str61;
                                str29 = str60;
                                str28 = str59;
                                c4263q22 = new C4263q2();
                            }
                        } else {
                            jSONObject7 = jSONObject11;
                            jSONObject5 = jSONObject10;
                            str32 = str61;
                            str29 = str60;
                            str28 = str59;
                            c4263q22 = new C4263q2();
                        }
                        S2 s23 = new S2(1, a17, false, a20, optInt10, c4263q22, a18, a19, optLong5, optBoolean12, optBoolean13, optBoolean14, optLong4);
                        if (jSONArray3 != null) {
                            int i5 = 0;
                            while (i5 < jSONArray3.length()) {
                                JSONArray jSONArray4 = jSONArray3;
                                C4013c3 d5 = d(jSONArray4.optJSONObject(i5));
                                if (d5 != null) {
                                    s23.a(d5);
                                }
                                i5++;
                                jSONArray3 = jSONArray4;
                            }
                        }
                        s2 = s23;
                    } else {
                        str27 = str22;
                        str28 = str21;
                        str29 = str20;
                        jSONObject6 = c13;
                        jSONObject7 = jSONObject3;
                        str30 = str26;
                        str31 = str25;
                        str32 = str18;
                        str33 = str5;
                        d92 = d9;
                        str34 = str19;
                        str35 = y0;
                        str36 = str23;
                        s2 = null;
                    }
                    if (c10 == null) {
                        JSONArray optJSONArray5 = c10.optJSONArray(str33);
                        String str70 = str27;
                        JSONObject c26 = c(c10, str70);
                        JSONObject d6 = d(c10, str35);
                        String str71 = str28;
                        String str72 = str32;
                        jSONObject8 = jSONObject7;
                        String str73 = str34;
                        String str74 = str40;
                        String str75 = str24;
                        String str76 = str41;
                        String str77 = str42;
                        String str78 = str43;
                        String str79 = str44;
                        String str80 = str31;
                        String str81 = str45;
                        String str82 = str46;
                        str37 = str70;
                        s22 = s2;
                        long a21 = a(c10, jSONObject8, F0, 10000L);
                        int a22 = a(c10, jSONObject8, str17, 0);
                        long optLong7 = c10.optLong(x0, 3000L);
                        boolean optBoolean20 = d6.optBoolean(str30, false);
                        boolean optBoolean21 = d6.optBoolean(str36, false);
                        boolean optBoolean22 = c10.optBoolean(B0, true);
                        H1 a23 = a(IronSourceUtils.b(c26, jSONObject4), Boolean.FALSE);
                        if (jSONObject5 != null) {
                            JSONObject c27 = c(jSONObject5, "nativeAd");
                            if (c27 != null) {
                                str28 = str71;
                                c4263q2 = new C4263q2(jSONObject5.optString(str29, str28), jSONObject5.optString(str81, str28), jSONObject5.optString(str82, str28), jSONObject5.optInt(str80, 2), jSONObject5.optInt(str75, 15), jSONObject5.optLong(str72, 10000L), c27.optInt(str73, 2000), 0L, 0L, 0L, true, 0, jSONObject5.optBoolean(str79, false), jSONObject5.optBoolean(str78, false), true, jSONObject5.optInt(str77, 1), false, jSONObject5.optBoolean(str76, true), c27.optBoolean(str74, true));
                            } else {
                                str28 = str71;
                                c4263q2 = new C4263q2();
                            }
                        } else {
                            str28 = str71;
                            c4263q2 = new C4263q2();
                        }
                        pb = new Pb(1, a21, false, a23, c4263q2, a22, optLong7, optBoolean20, optBoolean21, optBoolean22);
                        if (optJSONArray5 != null) {
                            for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                C3961ac f = f(optJSONArray5.optJSONObject(i6));
                                if (f != null) {
                                    pb.a(f);
                                }
                            }
                        }
                    } else {
                        jSONObject8 = jSONObject7;
                        str37 = str27;
                        s22 = s2;
                        pb = null;
                    }
                    C4205mg c4205mg = new C4205mg();
                    if (jSONObject6 != null) {
                        JSONObject jSONObject12 = jSONObject6;
                        JSONArray optJSONArray6 = jSONObject12.optJSONArray(Z1);
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                c4205mg.a(optJSONArray6.optString(i7));
                            }
                        }
                        JSONObject optJSONObject = jSONObject12.optJSONObject(a2);
                        if (optJSONObject != null) {
                            c4205mg.a(optJSONObject);
                        }
                        c4205mg.a(jSONObject12.optBoolean(b2, true));
                    }
                    C4041dd c4041dd = new C4041dd();
                    if (jSONObject == null) {
                        JSONObject jSONObject13 = jSONObject;
                        String optString11 = jSONObject13.optString(b1, C4059ed.a);
                        z2 = jSONObject13.optBoolean(c1, true);
                        c4041dd.a(optString11);
                    } else {
                        z2 = true;
                    }
                    c4041dd.b(z2);
                    if (z2) {
                        c4041dd.b(a(jSONObject4, "optOut"));
                        c4041dd.a(a(jSONObject4, "optIn"));
                        c4041dd.a(jSONObject4.optBoolean("eventsCompression", false));
                        c4041dd.a(jSONObject4.optInt("eventsCompressionLevel", -1));
                    }
                    O1 o12 = new O1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    E1 e12 = new E1();
                    if (c16 != null) {
                        e12.a(c16.optBoolean("enabled", false));
                        e12.c(c16.optString("reporterURL", str28));
                        e12.b(c16.optString("reporterKeyword", str28));
                        e12.c(c16.optBoolean("includeANR", false));
                        e12.a(c16.optInt("timeout", 5000));
                        e12.b(c16.optBoolean("setIgnoreDebugger", false));
                        JSONArray optJSONArray7 = c16.optJSONArray("keysToInclude");
                        if (optJSONArray7 != null) {
                            for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                                e12.a(optJSONArray7.optString(i8));
                            }
                        }
                    }
                    Ue ue = c14 == null ? new Ue(c14.optString("name", str28), c14.optString("id", Y1.f), c14.optJSONObject(Payload.CUSTOM)) : null;
                    K1 k12 = new K1(c17 == null ? c17 : new JSONObject());
                    J1 j12 = new J1();
                    if (c18 != null) {
                        JSONObject optJSONObject2 = c18.optJSONObject(p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.b(optJSONObject2);
                        }
                        j12 = new J1(hashMap);
                    }
                    C4405y1 c4405y1 = new C4405y1();
                    if (jSONObject5 != null) {
                        c4405y1 = new C4405y1(jSONObject5.optString(str29));
                    }
                    A1 a110 = new A1(o12, ue, c4205mg, jSONObject8.optBoolean("integration", false), e12, k12, j12, c4041dd, c4405y1, str, a3);
                    Yf h = h(c4);
                    com.ironsource.mediationsdk.adquality.a c28 = c(c4);
                    K3.a aVar = new K3.a();
                    aVar.a(c4042de2);
                    aVar.a(d92);
                    aVar.a(s22);
                    aVar.a(pb);
                    aVar.a(a110);
                    aVar.b(h);
                    aVar.a(c28);
                    K3 a24 = aVar.a();
                    this.c = a24;
                    IronLog.INTERNAL.verbose(a24.toString());
                    c = c(jSONObject4, "genericParams");
                    if (c != null && (c3 = c(c, (str38 = str37))) != null) {
                        c.remove(str38);
                        Map<String, String> b3 = IronSourceUtils.b(c3);
                        Ib.a0().q().b(b3);
                        C4078fe.i().b(b3);
                        F9.i().b(b3);
                    }
                    if (c == null) {
                        Map<String, String> b4 = IronSourceUtils.b(c);
                        Ib.a0().q().a(b4);
                        C4078fe.i().a(b4);
                        F9.i().a(b4);
                        return;
                    }
                    return;
                }
            }
            str = null;
            H1 a32 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
            String str402 = S1;
            String str412 = R1;
            String str422 = W1;
            String str432 = V1;
            String str442 = U1;
            JSONObject jSONObject92 = c11;
            String str452 = F1;
            String str462 = G1;
            String str472 = E1;
            if (c7 == null) {
            }
            if (c8 == null) {
            }
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            C4205mg c4205mg2 = new C4205mg();
            if (jSONObject6 != null) {
            }
            C4041dd c4041dd2 = new C4041dd();
            if (jSONObject == null) {
            }
            c4041dd2.b(z2);
            if (z2) {
            }
            O1 o122 = new O1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            E1 e122 = new E1();
            if (c16 != null) {
            }
            if (c14 == null) {
            }
            K1 k122 = new K1(c17 == null ? c17 : new JSONObject());
            J1 j122 = new J1();
            if (c18 != null) {
            }
            C4405y1 c4405y12 = new C4405y1();
            if (jSONObject5 != null) {
            }
            A1 a1102 = new A1(o122, ue, c4205mg2, jSONObject8.optBoolean("integration", false), e122, k122, j122, c4041dd2, c4405y12, str, a32);
            Yf h3 = h(c4);
            com.ironsource.mediationsdk.adquality.a c282 = c(c4);
            K3.a aVar2 = new K3.a();
            aVar2.a(c4042de2);
            aVar2.a(d92);
            aVar2.a(s22);
            aVar2.a(pb);
            aVar2.a(a1102);
            aVar2.b(h3);
            aVar2.a(c282);
            K3 a242 = aVar2.a();
            this.c = a242;
            IronLog.INTERNAL.verbose(a242.toString());
            c = c(jSONObject4, "genericParams");
            if (c != null) {
                c.remove(str38);
                Map<String, String> b32 = IronSourceUtils.b(c3);
                Ib.a0().q().b(b32);
                C4078fe.i().b(b32);
                F9.i().b(b32);
            }
            if (c == null) {
            }
        } catch (Exception e3) {
            C4157k4.d().a(e3);
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
            this.a = new Hd();
            if (b != null && c() != null && c().f() != null) {
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    this.a.d(optString);
                    NetworkSettings b6 = Kd.c().b(optString);
                    if (b6 != null) {
                        b6.setRewardedVideoPriority(i);
                    }
                }
            }
            if (b3 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < b3.length(); i3++) {
                    String optString2 = b3.optString(i3);
                    this.a.b(optString2);
                    NetworkSettings b7 = Kd.c().b(optString2);
                    if (b7 != null) {
                        b7.setInterstitialPriority(i3);
                    }
                }
            }
            if (b4 != null) {
                for (int i4 = 0; i4 < b4.length(); i4++) {
                    String optString3 = b4.optString(i4);
                    this.a.a(optString3);
                    NetworkSettings b8 = Kd.c().b(optString3);
                    if (b8 != null) {
                        b8.setBannerPriority(i4);
                    }
                }
            }
            if (b5 != null) {
                for (int i5 = 0; i5 < b5.length(); i5++) {
                    String optString4 = b5.optString(i5);
                    this.a.c(optString4);
                    NetworkSettings b9 = Kd.c().b(optString4);
                    if (b9 != null) {
                        b9.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        try {
            this.b = Kd.c();
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
                        Ib.a0().q().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public List<IronSource.a> h() {
        Hd hd;
        Hd hd2;
        Hd hd3;
        Hd hd4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (hd4 = this.a) != null && !hd4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (hd3 = this.a) != null && !hd3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.c.c() != null && (hd2 = this.a) != null && !hd2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.c.e() != null && (hd = this.a) != null && !hd.c().isEmpty()) {
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

    public Hd k() {
        return this.a;
    }

    public Kd l() {
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.j ? "adFormats" : Y0.c;
    }

    private void b(@NotNull JSONObject jSONObject) {
        this.k = new K5(jSONObject.optJSONObject(C4364ve.d));
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    @NotNull
    public static C4205mg b(@Nullable Te te) {
        if (te != null && te.q()) {
            return te.c().b().k();
        }
        return C4205mg.a();
    }

    public K3 c() {
        return this.c;
    }

    @Nullable
    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @NotNull
    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c = c(jSONObject, str);
        return c != null ? c : new JSONObject();
    }

    @Nullable
    public String e() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f.optString("error");
    }

    public K5 f() {
        return this.k;
    }

    private Context d() {
        return this.g;
    }

    public Y8 g() {
        return new Y8(this.d, this.e);
    }

    public Te(Te te) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = te.d();
            this.f = new JSONObject(te.f.toString());
            this.d = te.d;
            this.e = te.e;
            this.j = te.j;
            this.a = te.k();
            this.b = te.l();
            this.c = te.c();
            this.h = te.i();
            this.i = Ib.R().x();
            b(this.f);
        } catch (Exception e) {
            C4157k4.d().a(e);
            a();
        }
    }

    private Yf h(JSONObject jSONObject) {
        Yf yf = new Yf();
        JSONObject c = c(jSONObject, "testSuite");
        if (c != null) {
            yf.b(c.optString("controllerUrl"));
        }
        return yf;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = new JSONObject();
        this.d = "";
        this.e = "";
        this.a = new Hd();
        this.b = Kd.c();
        this.c = new K3.a().a();
        this.i = Ib.R().x();
        b(this.f);
    }

    private String a(String str) {
        try {
            JSONObject c = c(c(c(c(this.f, "configurations"), "adFormats"), str), Y0.c);
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static a a(Te te) {
        if (te != null) {
            return te.i();
        }
        return a.NOT_SET;
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
    
        if (r6.toString().equals(r5) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C4095gd a(JSONObject jSONObject) {
        EnumC4166kd enumC4166kd = null;
        if (jSONObject == null) {
            return null;
        }
        C4095gd.a aVar = new C4095gd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(n1);
            if (!TextUtils.isEmpty(optString)) {
                EnumC4166kd enumC4166kd2 = EnumC4166kd.PER_DAY;
                if (!enumC4166kd2.toString().equals(optString)) {
                    enumC4166kd2 = EnumC4166kd.PER_HOUR;
                }
                enumC4166kd = enumC4166kd2;
            }
            int optInt = optJSONObject.optInt(l1, 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, enumC4166kd, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(m1, 0);
            aVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }
}
