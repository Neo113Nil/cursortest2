package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.braze.Constants;
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.X3;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.IronSourceCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends d {
    public static final String V = "data";
    public static final String W = "eventname";
    public static final String X = "requestid";
    public static final String Y = "bannerid";
    public static final String Z = "auctionid";
    private static final String aA = "dspName";
    private static final String aB = "requestID";
    private static final String aC = "callbacks";
    private static final String aD = "layoutData";
    private static final String aE = "impressions";
    private static final String aF = "url";
    private static final String aG = "clickTags";
    private static final String aH = "clickURL";
    private static final String aI = "videoData";
    private static final String aJ = "videoSource";
    private static final String aK = "videoformat_mp4";
    private static final String aL = "html";
    private static final String aM = "htmlURL";
    private static final String aN = "vast";
    private static final String aO = "mraid";
    private static final String aP = "customEndCard";
    private static final String aQ = "rv-gateway";
    private static final String aR = "gw-rv";
    private static final String aS = "_SupersonicAds";
    private static final String aT = "_IronSource_";
    private static final String aW = "external_url";
    private static final String aX = "IRONSOURCE_NETWORK";
    private static final String aY = "adMarkup";
    private static final String aZ = "sid";
    public static final String aa = "producttype";
    public static final String ab = "adsizelabel";
    public static final String ac = "campaigntype";
    public static final String ad = "adId";
    public static final String ae = "adLoaded";
    public static final String af = "storePromoOpened";
    public static final String ag = "frameDisplayed";
    public static final String ah = "adClosed";
    public static final String ai = "loadAdSuccess";
    public static final String aj = "showAd";
    public static final String ak = "showAdSuccess";
    public static final String al = "videoCompleted";
    public static final String am = "videoStarted";
    public static final String an = "bannerID";
    public static final int ao = 200;
    private static final String ap = "IronSourceDiscovery";
    private static final String aq = "crid";
    private static final String ar = "type";
    private static final String as = "appData";
    private static final String at = "appId";
    private static final String au = "bid";
    private static final String av = "id";
    private static final String aw = "auction";
    private static final String ax = "seatbid";
    private static final String ay = "cid";
    private static final String az = "ext";
    public static final String b = "Interstitial";
    private static final String ba = "adViewId";
    private static final int bb = 20;
    private static final int bd = 10;
    private static final int bi = 20;
    private static final String br = "jQuery";
    public static final String c = "Banner";
    public static final String d = "MEDIUM_RECTANGLE";
    public static final String e = "instanceID";
    public static final String f = "iid";
    public static final String g = "gateway.supersonicads.com/gateway/sdk/request";
    public static final String h = "iads.unity3d.com/gateway/sdk/request";
    public static final String i = "gw-ext.mediation.unity3d.com/auction";
    public static final String j = "init.supersonicads.com";
    public static final String k = "logs.supersonic.com";
    public static final String l = "logs.ironsrc.mobi";
    public static final String m = "unity3d.com/logs";
    public static final String n = "unity3d.com/d";
    public static final String o = "iads.unity3d.com";
    public static final String p = "isprog.com/d";
    public static final String q = "data=";
    private final HashSet<String> bh;
    private static final List<String> aU = Collections.synchronizedList(new ArrayList());
    private static final Set<String> aV = new HashSet();
    private static final LimitedConcurrentHashMap<String, String> bc = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, Long> be = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, Long> bf = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, List<String>> bg = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> bj = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> bk = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, CreativeInfo> bl = new LimitedConcurrentHashMap<>(20);
    private static final Map<String, c.a> bm = new LimitedConcurrentHashMap(20);
    private static final Map<String, BrandSafetyUtils.AdType> bn = new LimitedConcurrentHashMap(20);

    /* renamed from: bo, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, BrandSafetyUtils.AdType> f3349bo = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> bp = new LimitedConcurrentHashMap<>(20);
    private static final Map<Integer, Long> bq = new LimitedConcurrentHashMap(20);

    public h() {
        super(com.safedk.android.utils.h.f, ap);
        this.bh = new HashSet<>();
        this.E.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, aX);
        this.E.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.VAST_URL_QUERY_PARAMS_TO_IGNORE, "_vast,blkntf");
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return str + "/" + str3;
        }
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("/");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return str.contains(g) || str.contains(h);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return aU.remove(str) || str.contains(k) || str.contains(l) || str.contains(aS) || str.contains(aT) || str.contains(n) || str.contains(o) || str.contains(p) || str.contains("&adViewId=") || str.contains(m);
    }

    public static boolean b(int i2) {
        Long l2;
        long currentTimeMillis = System.currentTimeMillis();
        if (bq.get(Integer.valueOf(i2)) != null && (l2 = bq.get(Integer.valueOf(i2))) != null && currentTimeMillis - l2.longValue() < 200) {
            Logger.d(ap, "check if prefetch should be parsed - same prefetch that was seen earlier");
            return false;
        }
        bq.put(Integer.valueOf(i2), Long.valueOf(currentTimeMillis));
        return true;
    }

    public static String C(String str) {
        if (!com.safedk.android.utils.n.l(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("adMarkup")) {
                return URLDecoder.decode(jSONObject.getString("adMarkup"), C.UTF8_NAME);
            }
            return null;
        } catch (Throwable th) {
            Logger.d(ap, "Exception decoding prefetch: \n", th.getMessage(), " encoded prefetch is: \n", str);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:48|(11:49|50|51|52|53|54|55|56|(2:184|185)|58|59)|(4:61|62|63|(26:65|66|67|(1:173)(1:71)|72|73|74|75|76|77|78|79|80|81|(4:144|145|(5:147|148|149|150|(1:152))(1:158)|153)(1:83)|84|85|86|87|(1:140)|91|(1:93)|(1:95)|96|(5:98|(5:100|101|102|(1:106)|107)(4:115|(1:119)|120|(3:122|(1:124)|125))|108|109|110)(5:126|(3:128|369|133)|108|109|110)|111))(1:183)|179|66|67|(1:69)|173|72|73|74|75|76|77|78|79|80|81|(0)(0)|84|85|86|87|(1:89)|140|91|(0)|(0)|96|(0)(0)|111|46) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:48|49|50|51|52|53|54|55|56|(2:184|185)|58|59|(4:61|62|63|(26:65|66|67|(1:173)(1:71)|72|73|74|75|76|77|78|79|80|81|(4:144|145|(5:147|148|149|150|(1:152))(1:158)|153)(1:83)|84|85|86|87|(1:140)|91|(1:93)|(1:95)|96|(5:98|(5:100|101|102|(1:106)|107)(4:115|(1:119)|120|(3:122|(1:124)|125))|108|109|110)(5:126|(3:128|369|133)|108|109|110)|111))(1:183)|179|66|67|(1:69)|173|72|73|74|75|76|77|78|79|80|81|(0)(0)|84|85|86|87|(1:89)|140|91|(0)|(0)|96|(0)(0)|111|46) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b1, code lost:
    
        r36 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03b7, code lost:
    
        r36 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03bd, code lost:
    
        r36 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035f A[Catch: all -> 0x03a6, TryCatch #2 {all -> 0x03a6, blocks: (B:102:0x0322, B:104:0x032b, B:106:0x0331, B:107:0x0334, B:108:0x037b, B:115:0x033d, B:117:0x0345, B:119:0x034b, B:120:0x034f, B:122:0x0355, B:124:0x035b, B:126:0x035f, B:128:0x0367, B:129:0x0369, B:137:0x037a, B:131:0x036a, B:132:0x0376), top: B:101:0x0322, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ae A[Catch: all -> 0x03ac, TryCatch #7 {all -> 0x03ac, blocks: (B:150:0x0271, B:152:0x028f, B:84:0x02c0, B:83:0x02ae), top: B:149:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fe A[Catch: all -> 0x03a8, TryCatch #4 {all -> 0x03a8, blocks: (B:87:0x02d7, B:89:0x02e8, B:91:0x02f7, B:93:0x02fe, B:95:0x0303, B:96:0x0306, B:98:0x030c, B:140:0x02f0), top: B:86:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0303 A[Catch: all -> 0x03a8, TryCatch #4 {all -> 0x03a8, blocks: (B:87:0x02d7, B:89:0x02e8, B:91:0x02f7, B:93:0x02fe, B:95:0x0303, B:96:0x0306, B:98:0x030c, B:140:0x02f0), top: B:86:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030c A[Catch: all -> 0x03a8, TRY_LEAVE, TryCatch #4 {all -> 0x03a8, blocks: (B:87:0x02d7, B:89:0x02e8, B:91:0x02f7, B:93:0x02fe, B:95:0x0303, B:96:0x0306, B:98:0x030c, B:140:0x02f0), top: B:86:0x02d7 }] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        String str3;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str4;
        String str5;
        JSONArray jSONArray;
        int i2;
        int i3;
        String str6;
        JSONArray jSONArray2;
        ArrayList arrayList;
        String string;
        String string2;
        JSONObject jSONObject;
        JSONArray jSONArray3;
        JSONObject jSONObject2;
        String string3;
        String optString;
        String optString2;
        String optString3;
        String d2;
        String str7;
        String optString4;
        IronSourceCreativeInfo ironSourceCreativeInfo;
        String F;
        String as2;
        JSONObject optJSONObject;
        String str8 = str2;
        if (aVar != null) {
            bm.put(aVar.a, aVar);
            Logger.d(ap, "generate info received bidding prefetch with max params: ", aVar);
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            Logger.d(ap, "generate info buffer value is empty, skipping. url = ", str, ", headers = ", map);
            return null;
        }
        Logger.printFullVerboseLog(ap, Logger.FeatureTag.PREFETCH, "generate info started, url = ", str, " , content size=", Integer.valueOf(str2.length()), ", content : ", str8);
        ArrayList arrayList2 = new ArrayList();
        if (str8.startsWith(br)) {
            int indexOf = str8.indexOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            if (indexOf > -1) {
                str8 = str8.substring(indexOf, str2.length() - 1);
            }
            Logger.printFullVerboseLog(ap, "after removal, json response: ", str8);
        }
        if (!com.safedk.android.utils.n.n(str8)) {
            Logger.d(ap, "Not a valid JSON string, skipping");
            return null;
        }
        JSONObject jSONObject3 = new JSONObject(str8);
        if (!jSONObject3.has(ax)) {
            Logger.d(ap, "generate info - no seat bid, exiting!");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject(ax);
        JSONObject jSONObject5 = jSONObject4.getJSONObject(az);
        String string4 = jSONObject5.has("requestID") ? jSONObject5.getString("requestID") : null;
        if (jSONObject5.has("auction")) {
            JSONObject optJSONObject2 = jSONObject5.optJSONObject("auction");
            if (optJSONObject2.has("id")) {
                str3 = optJSONObject2.getString("id");
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(string4)) {
                    Logger.d(ap, "generate info - no request id or auction id");
                    return null;
                }
                String a = a(jSONObject5);
                if (str3 == null && bm.containsKey(str3)) {
                    c.a aVar2 = bm.get(str3);
                    if (aVar2 != null) {
                        adFormatType = aVar2.b;
                        Logger.d(ap, "generate info, ad format: ", adFormatType);
                        str4 = aVar2.c;
                        str5 = aVar2.a;
                    } else {
                        Logger.d(ap, "generate info could not get the ad format and placement id!");
                        adFormatType = null;
                        str4 = null;
                        str5 = null;
                    }
                } else {
                    adFormatType = (!str.contains(aQ) || str.contains(aR)) ? BrandSafetyEvent.AdFormatType.REWARD : BrandSafetyEvent.AdFormatType.INTER;
                    str4 = null;
                    str5 = null;
                }
                jSONArray = jSONObject4.getJSONArray("bid");
                i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject6 = jSONArray.getJSONObject(i2);
                    try {
                        arrayList = new ArrayList();
                        string = jSONObject6.getString("cid");
                        string2 = jSONObject6.getString(aq);
                        jSONObject = jSONObject6.getJSONObject(az);
                        jSONArray3 = jSONArray;
                        try {
                            jSONObject2 = jSONObject.getJSONObject(aI).getJSONObject(aJ);
                            string3 = jSONObject.getString("type");
                            i3 = i2;
                            try {
                                optString = jSONObject2.optString("vast");
                                optString2 = jSONObject2.optString("mraid");
                                if (TextUtils.isEmpty(optString2)) {
                                    try {
                                        optString2 = jSONObject2.optString("html");
                                    } catch (Throwable th) {
                                        th = th;
                                        str6 = string4;
                                        jSONArray2 = jSONArray3;
                                        Logger.d(ap, "generate info error parsing ", th.getMessage(), th);
                                        i2 = i3 + 1;
                                        jSONArray = jSONArray2;
                                        string4 = str6;
                                    }
                                }
                                optString3 = jSONObject2.optString(aK);
                                d2 = d(jSONObject);
                            } catch (Throwable th2) {
                                th = th2;
                                str6 = string4;
                                jSONArray2 = jSONArray3;
                                Logger.d(ap, "generate info error parsing ", th.getMessage(), th);
                                i2 = i3 + 1;
                                jSONArray = jSONArray2;
                                string4 = str6;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i3 = i2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i3 = i2;
                        str6 = string4;
                        jSONArray2 = jSONArray;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str7 = str4;
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            str6 = string4;
                            str4 = str7;
                            jSONArray2 = jSONArray3;
                            Logger.d(ap, "generate info error parsing ", th.getMessage(), th);
                            i2 = i3 + 1;
                            jSONArray = jSONArray2;
                            string4 = str6;
                        }
                        if (jSONObject.has(aC)) {
                            str4 = b(jSONObject.getJSONObject(aC));
                            String optString5 = (string3.equals(aP) || (optJSONObject = jSONObject.optJSONObject(aD)) == null) ? null : optJSONObject.optString("html");
                            String a2 = a(string4, str3, string2);
                            Object[] objArr = new Object[10];
                            objArr[0] = "generate info - ad id is: ";
                            objArr[1] = a2;
                            objArr[2] = " request id is: ";
                            objArr[3] = string4;
                            objArr[4] = " auction id is: ";
                            objArr[5] = str3;
                            objArr[6] = " and crid is: ";
                            objArr[7] = string2;
                            objArr[8] = " event id is: ";
                            objArr[9] = str5;
                            Logger.d(ap, objArr);
                            optString4 = jSONObject2.optString(aM);
                            if (TextUtils.isEmpty(optString4)) {
                                str6 = string4;
                                Logger.d(ap, "content playable html, playable url: ", optString4);
                            } else {
                                try {
                                    String optString6 = jSONObject2.optString("html");
                                    if (TextUtils.isEmpty(optString6)) {
                                        str6 = string4;
                                    } else {
                                        str6 = string4;
                                        try {
                                            Logger.d(ap, "htmlSource: ", optString6);
                                            Matcher matcher = g.a("src=\\\\?\"([^\\\\\"]+)").matcher(optString6);
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                Logger.d(ap, "content playable, playable url: ", group);
                                                optString4 = group;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            jSONArray2 = jSONArray3;
                                            Logger.d(ap, "generate info error parsing ", th.getMessage(), th);
                                            i2 = i3 + 1;
                                            jSONArray = jSONArray2;
                                            string4 = str6;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    str6 = string4;
                                }
                            }
                            jSONArray2 = jSONArray3;
                            ironSourceCreativeInfo = new IronSourceCreativeInfo(a2, string, d2, optString3, string3, optString4, adFormatType, str4, optString5, this.I, a);
                            ironSourceCreativeInfo.h(str5);
                            arrayList2.add(ironSourceCreativeInfo);
                            if (!"BANNER".equals(adFormatType) || BrandSafetyUtils.o.equals(adFormatType)) {
                                ironSourceCreativeInfo.a(BrandSafetyUtils.a(adFormatType));
                            }
                            aV.add(a2);
                            if (optString3 != null) {
                                arrayList.add(optString3);
                            }
                            if (optString4 != null) {
                                arrayList.add(optString4);
                            }
                            if (TextUtils.isEmpty(optString2)) {
                                Logger.d(ap, "content mraid html");
                                if (com.safedk.android.analytics.brandsafety.creatives.h.b(optString2)) {
                                    try {
                                        a((CreativeInfo) ironSourceCreativeInfo, str, optString2, true);
                                        if (ironSourceCreativeInfo.g() && (as2 = ironSourceCreativeInfo.as()) != null) {
                                            arrayList.add(as2);
                                        }
                                        ironSourceCreativeInfo.a("vast", "/");
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Logger.d(ap, "generate info error parsing ", th.getMessage(), th);
                                        i2 = i3 + 1;
                                        jSONArray = jSONArray2;
                                        string4 = str6;
                                    }
                                } else {
                                    if (ironSourceCreativeInfo.M() == null && (F = F(optString2)) != null) {
                                        ironSourceCreativeInfo.a(F, true);
                                    }
                                    if (ironSourceCreativeInfo.p() == null) {
                                        String G = G(optString2);
                                        if (G != null) {
                                            ironSourceCreativeInfo.q(G);
                                        }
                                    }
                                }
                                ironSourceCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(jSONObject6.toString().replace("\\/", "/")));
                                ironSourceCreativeInfo.c(arrayList);
                                Logger.d(ap, "generate info CI: ", ironSourceCreativeInfo);
                            } else {
                                if (!TextUtils.isEmpty(optString)) {
                                    synchronized (this.F) {
                                        this.F.put(new f(optString), ironSourceCreativeInfo);
                                    }
                                }
                                ironSourceCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(jSONObject6.toString().replace("\\/", "/")));
                                ironSourceCreativeInfo.c(arrayList);
                                Logger.d(ap, "generate info CI: ", ironSourceCreativeInfo);
                            }
                            i2 = i3 + 1;
                            jSONArray = jSONArray2;
                            string4 = str6;
                        }
                    } else {
                        str7 = str4;
                    }
                    str4 = str7;
                    if (string3.equals(aP)) {
                    }
                    String a22 = a(string4, str3, string2);
                    Object[] objArr2 = new Object[10];
                    objArr2[0] = "generate info - ad id is: ";
                    objArr2[1] = a22;
                    objArr2[2] = " request id is: ";
                    objArr2[3] = string4;
                    objArr2[4] = " auction id is: ";
                    objArr2[5] = str3;
                    objArr2[6] = " and crid is: ";
                    objArr2[7] = string2;
                    objArr2[8] = " event id is: ";
                    objArr2[9] = str5;
                    Logger.d(ap, objArr2);
                    optString4 = jSONObject2.optString(aM);
                    if (TextUtils.isEmpty(optString4)) {
                    }
                    jSONArray2 = jSONArray3;
                    ironSourceCreativeInfo = new IronSourceCreativeInfo(a22, string, d2, optString3, string3, optString4, adFormatType, str4, optString5, this.I, a);
                    ironSourceCreativeInfo.h(str5);
                    arrayList2.add(ironSourceCreativeInfo);
                    if (!"BANNER".equals(adFormatType)) {
                    }
                    ironSourceCreativeInfo.a(BrandSafetyUtils.a(adFormatType));
                    aV.add(a22);
                    if (optString3 != null) {
                    }
                    if (optString4 != null) {
                    }
                    if (TextUtils.isEmpty(optString2)) {
                    }
                    i2 = i3 + 1;
                    jSONArray = jSONArray2;
                    string4 = str6;
                }
                return arrayList2;
            }
        }
        str3 = null;
        if (!TextUtils.isEmpty(str3)) {
        }
        String a3 = a(jSONObject5);
        if (str3 == null) {
        }
        if (str.contains(aQ)) {
        }
        str4 = null;
        str5 = null;
        jSONArray = jSONObject4.getJSONArray("bid");
        i2 = 0;
        while (i2 < jSONArray.length()) {
        }
        return arrayList2;
    }

    private static String a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(aA)) {
            return jSONObject.getString(aA);
        }
        if (jSONObject.has(as) && jSONObject.getJSONObject(as).has(aA)) {
            return jSONObject.getString(aA);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r10 = r7.getString("url");
        r3 = i(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.e, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r3 = i(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.ap, "instance ID: ", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(JSONObject jSONObject) {
        String str = null;
        if (!jSONObject.has("impressions")) {
            Logger.d(ap, "extract placement Id - no impressions, can't parse");
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("impressions");
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("url")) {
                    break;
                }
                i2++;
            }
        } catch (JSONException e2) {
            Logger.d(ap, "exception occurred while extracting placement id:\n", e2);
        }
        return str;
    }

    private String i(String str, String str2) {
        int indexOf = str2.indexOf(str + B5.U);
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str2.indexOf(X3.j.c, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str2.length();
        }
        return str2.substring(indexOf + str.length() + 1, indexOf2);
    }

    private String c(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(as);
        if (optJSONObject != null) {
            return optJSONObject.optString(at);
        }
        return null;
    }

    private String d(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(aG);
        if (optJSONObject == null || !optJSONObject.has(aH)) {
            return null;
        }
        return optJSONObject.getString(aH);
    }

    private i a(String str, WeakReference<WebView> weakReference) {
        if (str.contains(k) || str.contains(l) || str.contains(m)) {
            String[] split = str.split(q);
            if (split.length == 2) {
                String str2 = new String(Base64.decode(split[1], 0));
                Logger.v(ap, "message is ", str2);
                try {
                    JSONObject jSONObject = new JSONObject(str2).getJSONObject("data");
                    String string = jSONObject.getString(W);
                    String a = com.safedk.android.utils.n.a((Reference<?>) weakReference) ? BrandSafetyUtils.a((Object) weakReference.get()) : null;
                    String a2 = a(jSONObject.optString(X), jSONObject.optString(Z), jSONObject.optString(Y));
                    Logger.d(ap, "event: ", string, " and webview is: ", a, " ad id: ", a2);
                    String optString = jSONObject.optString(ab);
                    String optString2 = jSONObject.optString("producttype");
                    if (this.J.get(a2) != null) {
                        Logger.d(ap, "get ad id from resource - ad type: ", optString2, ", ad size: ", optString);
                        a(this.J.get(a2), optString2, optString);
                    }
                    i iVar = new i(string, a2);
                    String optString3 = jSONObject.optString(ac);
                    if (!optString3.isEmpty()) {
                        iVar.a(ac, optString3);
                    }
                    return iVar;
                } catch (JSONException e2) {
                    Logger.d(ap, "error in json parse: ", e2);
                }
            }
        }
        return null;
    }

    private void b(String str, String str2, WeakReference<WebView> weakReference) {
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            String a = BrandSafetyUtils.a((Object) weakReference.get());
            bc.put(str2, a);
            Logger.d(ap, str, "adding ad id: ", str2, " with webview address: ", a);
            return;
        }
        Logger.d(ap, str, "webView's ref not alive, not adding ad id: ", str2, " to adIdToWebviewAddressMap");
    }

    private void a(LimitedConcurrentHashMap<String, String> limitedConcurrentHashMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : limitedConcurrentHashMap.keySet()) {
            if (str.equals(limitedConcurrentHashMap.get(str2))) {
                sb.append(str2);
                sb.append(", ");
                limitedConcurrentHashMap.remove(str2);
            }
        }
        if (sb.length() > 0) {
            Logger.printFullVerboseLog(ap, "a cwv occurred with webview address: ", str, " and adIds: [", sb, X3.j.e);
        } else {
            Logger.d(ap, "possibly cwv but with no ad ids");
        }
    }

    private void a(i iVar, WeakReference<WebView> weakReference) {
        char c2 = 2;
        char c3 = 1;
        if (iVar != null && iVar.a() != null && af.equals(iVar.a())) {
            Logger.d(ap, af, " received for ad id - ", iVar.b());
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f, "IronSourceDiscoveryLogMessageMap");
        }
        if (iVar != null && iVar.a() != null && iVar.b() != null && ag.equals(iVar.a())) {
            if (this.bh.contains(iVar.b())) {
                Logger.d(ap, "second ", ag, " event received for ad id - ", iVar.b());
            } else {
                this.bh.add(iVar.b());
            }
        }
        if (iVar != null && iVar.a() != null && iVar.b() != null && ah.equals(iVar.a())) {
            this.bh.remove(iVar.b());
        }
        if (Arrays.asList(ai, ae).contains(iVar.a())) {
            b("extract adId from IronSource log message - ", iVar.b(), weakReference);
        }
        if (ak.equals(iVar.a()) || aj.equals(iVar.a())) {
            bc.remove(iVar.b());
            Logger.d(ap, "extract adId from IronSource log message - ", "received show ad message for ad id - ", iVar.b());
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : be.keySet()) {
            if (be.get(str) != null) {
                long longValue = be.get(str).longValue();
                Object[] objArr = new Object[5];
                objArr[0] = "extract adId from IronSource log message - ";
                objArr[c3] = "handling webview address: ";
                objArr[c2] = str;
                objArr[3] = " and unseen period: ";
                long j2 = currentTimeMillis - longValue;
                objArr[4] = Long.valueOf(j2);
                Logger.d(ap, objArr);
                if (j2 > TimeUnit.SECONDS.toMillis(60L) || bf.containsKey(str)) {
                    bf.put(str, 0L);
                    String str2 = "cwv_issue=" + str;
                    a(bc, str);
                    if (CreativeInfoManager.l(str)) {
                        Logger.d(ap, "extract adId from IronSource log message - ", "inter info exists for webview ", str);
                    } else {
                        Logger.d(ap, "extract adId from IronSource log message - ", "inter info does NOT exist for webview ", str);
                    }
                }
            }
            c2 = 2;
            c3 = 1;
        }
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            String a = BrandSafetyUtils.a((Object) weakReference.get());
            be.put(a, Long.valueOf(System.currentTimeMillis()));
            Logger.d(ap, "extract adId from IronSource log message - ", "adding webview: ", a, " to map");
        } else {
            Logger.d(ap, "extract adId from IronSource log message - ", "webview is not alive, not adding");
        }
        for (String str3 : bg.keySet()) {
            if (str3 != null && CreativeInfoManager.l(str3)) {
                Logger.d(ap, "extract adId from IronSource log message - ", "iterating addressToMessages: inter info exists for webview ", str3);
                Iterator<String> it = bg.get(str3).iterator();
                while (it.hasNext()) {
                    CreativeInfoManager.a(str3, it.next(), BrandSafetyUtils.AdType.INTERSTITIAL, b.y);
                }
                bg.remove(str3);
            } else {
                Logger.d(ap, "extract adId from IronSource log message - ", "iterating addressToMessages: inter info does NOT exist for webview ", str3);
            }
        }
    }

    private static String D(String str) {
        if (str != null && str.contains(".")) {
            try {
                String[] split = str.split("\\.");
                if (split.length > 2) {
                    String str2 = split[2];
                    if (str2.endsWith("_0")) {
                        return str2.substring(0, str2.length() - 2);
                    }
                    return str2;
                }
                return str;
            } catch (Throwable th) {
                Logger.d(ap, "exception when trying to extract ad id from adViewId: ", th.getMessage());
                return null;
            }
        }
        return str;
    }

    private String O(String str) {
        String b2 = k.b(str);
        if (b2 != null && !b2.contains("unity3d")) {
            Logger.d(ap, "extract Ad Id From IronSource Resource - received url with different domain, not extracting the ad id from it");
            return null;
        }
        Map<String, String> a = k.a(str, false);
        if (a == null) {
            return null;
        }
        String str2 = a.get("sid");
        if (str2 == null && a.containsKey("adViewId")) {
            str2 = D(a.get("adViewId"));
        }
        if (str2 == null && a.containsKey(an)) {
            str2 = a.get(an);
            Logger.d(ap, "extract Ad Id From IronSource Resource - found value in banner id! value: ", str2);
        }
        if (str2 != null) {
            Logger.d(ap, "extract Ad Id From IronSource Resource - value: ", str2);
            String P = P(str2);
            if (P != null) {
                return P;
            }
            Logger.d(ap, "extract Ad Id From IronSource Resource - did not find ad id, storing value: /", str2, " ad ids are: ", bq);
        }
        Logger.d(ap, "extract Ad Id From IronSource Resource - did not find ad id");
        return null;
    }

    private String P(String str) {
        for (String str2 : aV) {
            if (!str2.endsWith("/" + str)) {
                if (str2.startsWith(str + "/")) {
                }
            }
            return str2;
        }
        return null;
    }

    private String a(String str, List<String> list, WeakReference<WebView> weakReference) {
        i a = a(str, weakReference);
        if (a != null) {
            if (a.b() != null) {
                try {
                    a(a, weakReference);
                } catch (Throwable th) {
                    Logger.e(ap, "IS log message - error occurred while calling handle webview change: ", th.getMessage());
                }
                if (list.contains(a.a())) {
                    return a.b();
                }
            }
            String a2 = a.a(ac);
            if (a2 != null && (a2.equals("PL") || a2.equals("MR"))) {
                Logger.d(ap, "IS log message - skipping message of campaignType = ", a2);
                return null;
            }
            String a3 = BrandSafetyUtils.a((Object) weakReference.get());
            String a4 = a.a();
            if (a4 != null && a4.equals(al)) {
                Logger.d(ap, "IS log message - video completed");
                CreativeInfoManager.a(com.safedk.android.utils.h.f, a3, true, "log-event");
            }
            if (a4 != null && a4.equals(am)) {
                Logger.d(ap, "IS log message - video started");
                CreativeInfoManager.a(com.safedk.android.utils.h.f, a3, false, "log-event");
            }
        }
        return null;
    }

    private boolean j(String str, String str2) {
        if (str.contains("data=eyJ")) {
            return false;
        }
        if (bn.containsKey(str2)) {
            BrandSafetyUtils.AdType adType = bn.get(str2);
            return adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC;
        }
        Map<String, String> a = k.a(str, false);
        Logger.d(ap, "is banner message, url: ", str, " map: ", a);
        if (a != null) {
            for (String str3 : a.values()) {
                if (str3 != null && str3.equalsIgnoreCase("Banner")) {
                    Logger.d(ap, "is banner message, added webview address: ", str2, " to map");
                    bn.put(str2, BrandSafetyUtils.AdType.BANNER);
                    return true;
                }
            }
        }
        return false;
    }

    private void a(CreativeInfo creativeInfo, String str, String str2) {
        Logger.d(ap, "update CI Ad Format - product type: ", str, ", ad size: ", str2);
        if (creativeInfo == null) {
            Logger.d(ap, "update CI Ad Format - ci is null, cannot update ad format");
            return;
        }
        if ("Banner".equals(str)) {
            boolean equals = "MEDIUM_RECTANGLE".equals(str2);
            creativeInfo.a(equals ? BrandSafetyEvent.AdFormatType.MREC : BrandSafetyEvent.AdFormatType.BANNER);
            creativeInfo.a(equals ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER);
            Logger.d(ap, "update CI Ad Format - setting to banner format, now ci ad format is: ", creativeInfo.I(), " and type: ", creativeInfo.K());
            return;
        }
        creativeInfo.a("Interstitial".equals(str) ? BrandSafetyEvent.AdFormatType.INTER : BrandSafetyEvent.AdFormatType.REWARD);
        creativeInfo.a(BrandSafetyUtils.AdType.INTERSTITIAL);
        Logger.d(ap, "update CI Ad Format - setting to fullscreen format, now ci ad format is: ", creativeInfo.I(), " and type: ", creativeInfo.K());
    }

    private void b(String str, WeakReference<WebView> weakReference) {
        if (!com.safedk.android.utils.n.a((Reference<?>) weakReference) || TextUtils.isEmpty(str) || !str.contains("?")) {
            return;
        }
        String b2 = k.b(str);
        Map<String, String> a = k.a(str, false);
        Logger.d(ap, "extract auction id started with domain: ", b2, " map is: ", a);
        if (a != null) {
            String str2 = a.get(a.containsKey("sid") ? "sid" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            if (str2 != null) {
                Logger.d(ap, "extract auction id - found auction id: ", str2);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String str3;
        CreativeInfo creativeInfo;
        String a = com.safedk.android.utils.n.a((Reference<?>) weakReference) ? BrandSafetyUtils.a((Object) weakReference.get()) : null;
        boolean j2 = j(str, a);
        BrandSafetyUtils.AdType a2 = weakReference.get().getWidth() > 0 ? b.a(com.safedk.android.utils.h.f, weakReference.get()) : null;
        if (a2 != null) {
            bn.put(a, a2);
        }
        if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            str3 = null;
        } else {
            Logger.d(ap, "get ad id from resource - is banner: ", Boolean.valueOf(j2), " width: ", Integer.valueOf(weakReference.get().getWidth()), " height: ", Integer.valueOf(weakReference.get().getHeight()), " ad type: ", a2, " webview address: ", a);
            if (a2 == BrandSafetyUtils.AdType.BANNER || a2 == BrandSafetyUtils.AdType.MREC) {
                b(str, weakReference);
            }
            BannerFinder bannerFinder = SafeDK.getInstance() != null ? (BannerFinder) SafeDK.getInstance().a(a2) : null;
            if ((a2 != BrandSafetyUtils.AdType.BANNER && a2 != BrandSafetyUtils.AdType.MREC) || (!j2 && (bannerFinder == null || !bannerFinder.m(a)))) {
                str3 = a(str, Arrays.asList(aj, ak), weakReference);
                if (str3 != null) {
                    Logger.d(ap, "get ad id from resource - found ad id by interstitial log message - ad id: ", str3);
                } else if (a2 == BrandSafetyUtils.AdType.INTERSTITIAL && (str3 = O(str)) != null) {
                    Logger.d(ap, "get ad id from resource - found ad id by interstitial URL resource - ad id: ", str3);
                }
            } else {
                str3 = O(str);
            }
        }
        if (str3 != null) {
            if (aV.contains(str3) && this.J.get(str3) != null && ((a2 == BrandSafetyUtils.AdType.BANNER || a2 == BrandSafetyUtils.AdType.MREC) && (creativeInfo = this.J.get(str3)) != null)) {
                if (creativeInfo.h() != null && creativeInfo.h().contains("mraid")) {
                    creativeInfo.T();
                }
                creativeInfo.a(a2);
                creativeInfo.a(BrandSafetyUtils.a(a2));
                Logger.d(ap, "get ad id from resource - updated ad format: ", creativeInfo.I(), " and type: ", creativeInfo.K());
            }
            if (a2 != null) {
                f3349bo.put(str3, a2);
            }
            if (str2 != null) {
                bk.put(str3, str2);
            }
            Logger.d(ap, "get ad id from resource - added ad id: ", str3, " to adIdToSource map");
        } else {
            Logger.d(ap, "get ad id from resource - ad id is null");
        }
        if (str2 != null && com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            bj.put(str2, weakReference);
            Logger.d(ap, "get ad id from resource - webview is alive, adding source: ", str2);
        } else {
            Logger.d(ap, "get ad id from resource - webview is not alive or source is null, not adding to map, source=", str2);
        }
        if (str3 != null && aV.remove(str3)) {
            Logger.d(ap, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - found ad id - ", str3);
            return str3;
        }
        Logger.d(ap, "get ad id from resource - match not found for ", str3);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        if (str == null || !str.equals(str2)) {
            return true;
        }
        Logger.d(ap, "screenshot validity failed for hash: ", str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add(aW);
        return e2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("/") || str.startsWith("/")) {
            for (String str2 : bk.keySet()) {
                if (str2.startsWith(str) || str2.endsWith(str)) {
                    Logger.d(ap, "tryReverseMatching - extended ad id from: ", str, " to: ", str2);
                    str = str2;
                    break;
                }
            }
        }
        if (!bk.containsKey(str)) {
            Logger.d(ap, "tryReverseMatching with ad id - ad id ", str, " is not in the adIdToSource keys: ", bk.keySet());
            return false;
        }
        if (!this.J.containsKey(str)) {
            Logger.d(ap, "tryReverseMatching with ad id - ad id ", str, " is not in the adIdToCI keys: ", this.J.keySet());
            return false;
        }
        CreativeInfo creativeInfo = this.J.get(str);
        BrandSafetyUtils.AdType adType = f3349bo.get(str);
        if (creativeInfo != null && (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC)) {
            creativeInfo.a(f3349bo.get(str));
        }
        String str3 = bk.get(str);
        synchronized (bl) {
            bl.put(str3, creativeInfo);
        }
        return a(str3, com.safedk.android.utils.h.f, bj, bl, d.t);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        String remove = bk.remove(str);
        Logger.d(ap, "clean resources started with ad id: ", str, ", and source is: ", remove);
        if (remove != null) {
            bj.remove(remove);
            synchronized (bl) {
                bl.remove(remove);
            }
        }
        f3349bo.remove(str);
        synchronized (this.J) {
            this.J.remove(str);
        }
        aV.remove(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        Logger.d(ap, "match ci started for ironsource banner: with object: ", obj);
        try {
            if (obj instanceof HashSet) {
                Iterator it = ((HashSet) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        Logger.d(ap, "match ci resource is: ", next);
                        String O = O((String) next);
                        if (O != null && this.J.containsKey(O)) {
                            if (bj.containsKey(next)) {
                                WeakReference<WebView> weakReference = bj.get(next);
                                if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                                    Logger.d(ap, "match ci - added webview address: ", BrandSafetyUtils.a((Object) weakReference.get()), " to webview to ad id map with ad id: ", O);
                                }
                            }
                            Logger.d(ap, Logger.FeatureTag.CI_MATCHING, "match ci, resource: ", next, ", ad ID: ", O);
                            return this.J.get(O);
                        }
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Logger.d(ap, "error while matching info: ", th.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        e.a(bl, "IronSourceDiscovery:sourceToCI");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
        String a = BrandSafetyUtils.a((Object) webView);
        this.R.put(BrandSafetyUtils.a(obj), new WeakReference<>(webView));
        Logger.d(ap, "add webview to object on interface: ", a, " object ", obj);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
        if (str != null && str.startsWith("{\"id\":")) {
            if (str.contains("openUrl")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("arguments")) {
                        Logger.d(ap, "find webview from open url message - there is no arguments key for json: ", str);
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("arguments");
                    if (!jSONObject2.has("url")) {
                        Logger.d(ap, "find webview from open url message - there is no url key for json: ", str);
                        return;
                    }
                    Logger.d(ap, "find webview from open url message started with json: ", jSONObject);
                    try {
                        if (jSONObject2.has("type") && jSONObject2.getString("type").equals("openUrl")) {
                            String g2 = k.g(jSONObject2.getString("url"));
                            Logger.d(ap, "find webview from open url message - redirect message: ", str, ", url: ", g2);
                            WebView K = K(BrandSafetyUtils.a(obj));
                            Logger.d(ap, "find webview from open url message - webview address: ", BrandSafetyUtils.a((Object) K), " object: ", obj, " ad type: ", b.a(com.safedk.android.utils.h.f, K), " ad view id: ", jSONObject.optString("adViewId"));
                            BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.h.f, null, g2, K, "mraid.open");
                            return;
                        }
                        Object[] objArr = new Object[2];
                        objArr[0] = "find webview from open url message - there is no type or it's not equal to openUrl: ";
                        objArr[1] = jSONObject2.has("type") ? jSONObject2.getString("type") : null;
                        Logger.d(ap, objArr);
                    } catch (Throwable th) {
                        th = th;
                        Logger.d(ap, "find webview from open url message - exception occurred: ", th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
        try {
            if (str.startsWith("{\"adMarkup\"") && b(str.hashCode())) {
                CreativeInfoManager.a(this.U, "@!1:ad_fetch@!", C(str), (Map<String, List<String>>) null);
            }
        } catch (Throwable th) {
            Logger.e(ap, "Exception in json object detected", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String w(String str) {
        try {
        } catch (Throwable th) {
            Logger.d(ap, "Exception occurred - ", th.getMessage(), th);
        }
        if (str.contains("loadInterstitial?parameters=")) {
            String a = k.a(str, "\"instanceId\":\"", "\"");
            String a2 = k.a(str, "%22crid%22%3A%22", "%22");
            String a3 = k.a(str, "auction%22%3A%7B%22id%22%3A%22", "%22%7D%2C%22");
            String a4 = k.a(str, "requestID%22%3A%22", "%22");
            String a5 = a(a4, a3, a2);
            Logger.d(ap, "evaluate JS - load interstitial - instance id: ", a, ", creative id: ", a2, ", auction id: ", a3, ", request id: ", a4, ", ad id: ", a5);
            if (a != null && a2 != null && (a3 != null || a4 != null)) {
                if (bp.containsKey(a)) {
                    Logger.d(ap, "evaluate JS - load interstitial - found instance Id that already exists in map: ", a);
                }
                bp.put(a, a5);
            }
            return null;
        }
        if (str.contains("showInterstitial?parameters=")) {
            String a6 = k.a(str, "\"instanceId\":\"", "\"");
            if (a6 != null && bp.containsKey(a6)) {
                String remove = bp.remove(a6);
                Logger.d(ap, "evaluate JS - show interstitial - found ad id: ", remove);
                return remove;
            }
            Logger.d(ap, "evaluate JS - show interstitial - did not find ad id, for instance: ", a6, " keys are: ", bp.keySet());
        }
        return null;
    }
}
