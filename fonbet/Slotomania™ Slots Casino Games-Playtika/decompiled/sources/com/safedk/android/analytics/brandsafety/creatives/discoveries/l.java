package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Fc;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class l {
    private static final String A = "ext_data";
    private static final String B = "par_dspid";
    private static final String C = "slot_id";
    private static final String D = "{";
    private static final String E = "}";
    private static final String F = "ad_type";
    private static final int G = -1;
    private static final String H = "mof_template_url";
    private static final String K = "choose_from_two";
    private static final String L = "multi_ad_mintegral_dsp";
    private static final String M = "rks";
    private static final String N = "a";
    private static final String O = "b";
    private static final String P = "c";
    private static final String Q = "aks";
    private static final String R = "k";
    private static final String S = "q";
    private static final String T = "r";
    private static final String U = "al";
    private static final String V = "csp";
    private static final String W = "mp";
    private static final String X = "drp";
    private static final String Y = "ap";
    private static final String Z = "srp";
    public static final String a = "status";
    private static final String aa = "sdkId";
    private static final String ab = "webviewAddress";
    private static final String ac = "direction";
    private static final String ad = "recommendation-images";
    private static final String ae = "recommendations";
    private static final String af = "url";
    private static final String ag = "responseText";
    private static final String ah = "image_url";
    private static final String ai = "title";
    private static final String aj = "icon_url";
    private static final String ak = "desc";
    private static final String al = "ctatext";
    private static final Map<String, String> am;
    public static final int b = 1;
    public static final String c = "data";
    public static final int d = 287;
    public static final int e = 94;
    public static final int f = 296;
    public static final int g = 42;
    public static final int h = 295;
    private static final String m = "MintegralDiscoveryHelper";
    private static final String n = "ads";
    private static final String o = "id";
    private static final String p = "video_url";
    private static final String q = "image_url";
    private static final String r = "end_screen_url";
    private static final String s = "unit_id";
    private static final String t = "package_name";
    private static final String u = "click_url";
    private static final String v = "cam_html";
    private static final String w = "ad_tracking";
    private static final String x = "impression";
    private static final String y = "impression_url";
    private static final String z = "adv_id";
    private static final String[] I = {"mbridge_same_choice_one_layout", "bigTplChoseFromTwo"};
    private static final String[] J = {"mbridge_order_layout_list", "big-template-501"};
    public static final String i = ".rayjump.com/openapi/moreoffer";
    public static final String j = "mtgglobals.com/openapi/moreoffer";
    public static final String k = ".rayjump.com//openapi/moreoffer";
    public static final List<String> l = Arrays.asList(i, j, k);

    public static class b {
        public String a;
        public HashSet<String> b = new HashSet<>();
    }

    static {
        HashMap hashMap = new HashMap();
        am = hashMap;
        hashMap.put(Marker.ANY_NON_NULL_MARKER, "X");
        am.put("/", "u");
        am.put("0", "i");
        am.put("1", "6");
        am.put("2", "1");
        am.put(ExifInterface.GPS_MEASUREMENT_3D, R);
        am.put("4", "e");
        am.put("5", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        am.put("6", "f");
        am.put(Fc.e, RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        am.put("8", "r");
        am.put("9", "4");
        am.put(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z");
        am.put("B", "y");
        am.put("C", "/");
        am.put("D", "Y");
        am.put(ExifInterface.LONGITUDE_EAST, "o");
        am.put("F", "2");
        am.put(RequestConfiguration.MAX_AD_CONTENT_RATING_G, "O");
        am.put("H", "Z");
        am.put("I", "8");
        am.put("J", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
        am.put("K", "9");
        am.put("L", "a");
        am.put("M", "w");
        am.put("N", "Q");
        am.put("O", Fc.e);
        am.put("P", "5");
        am.put("Q", "l");
        am.put("R", "I");
        am.put(ExifInterface.LATITUDE_SOUTH, "B");
        am.put("T", "0");
        am.put("U", "j");
        am.put(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "U");
        am.put(ExifInterface.LONGITUDE_WEST, "L");
        am.put("X", "v");
        am.put("Y", O);
        am.put("Z", ExifInterface.LATITUDE_SOUTH);
        am.put("a", "D");
        am.put(O, ExifInterface.GPS_MEASUREMENT_3D);
        am.put(P, "F");
        am.put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "H");
        am.put("e", "x");
        am.put("f", "N");
        am.put("g", "n");
        am.put("h", P);
        am.put("i", "M");
        am.put("j", ExifInterface.LONGITUDE_EAST);
        am.put(R, ExifInterface.LONGITUDE_WEST);
        am.put("l", "g");
        am.put("m", Marker.ANY_NON_NULL_MARKER);
        am.put("n", "T");
        am.put("o", "C");
        am.put("p", "K");
        am.put(S, S);
        am.put("r", "m");
        am.put(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        am.put(Constants.BRAZE_PUSH_TITLE_KEY, "h");
        am.put("u", "p");
        am.put("v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        am.put("w", Constants.BRAZE_PUSH_TITLE_KEY);
        am.put("x", "R");
        am.put("y", "P");
        am.put("z", "J");
        am.put("=", "=");
    }

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;

        public String toString() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            StringBuilder sb = new StringBuilder();
            String str9 = "";
            if (this.a != null) {
                str = this.a + ServerSentEventKt.SPACE;
            } else {
                str = "";
            }
            sb.append(str);
            if (this.b != null) {
                str2 = this.b + ServerSentEventKt.SPACE;
            } else {
                str2 = "";
            }
            sb.append(str2);
            if (this.c != null) {
                str3 = this.c + ServerSentEventKt.SPACE;
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (this.d != null) {
                str4 = this.d + ServerSentEventKt.SPACE;
            } else {
                str4 = "";
            }
            sb.append(str4);
            if (this.e != null) {
                str5 = this.e + ServerSentEventKt.SPACE;
            } else {
                str5 = "";
            }
            sb.append(str5);
            if (this.f != null) {
                str6 = this.f + ServerSentEventKt.SPACE;
            } else {
                str6 = "";
            }
            sb.append(str6);
            if (this.g != null) {
                str7 = this.g + ServerSentEventKt.SPACE;
            } else {
                str7 = "";
            }
            sb.append(str7);
            if (this.h != null) {
                str8 = this.h + ServerSentEventKt.SPACE;
            } else {
                str8 = "";
            }
            sb.append(str8);
            if (this.i != null) {
                str9 = this.i + ServerSentEventKt.SPACE;
            }
            sb.append(str9);
            return sb.toString();
        }
    }

    public static void a(String str, String str2, String str3) {
        if (!str.equals(com.safedk.android.utils.h.o) && b(str3)) {
            Logger.d(m, "add multiple ads downstream struct started, sdkPackageName= ", str, ", webViewAddress= ", str2, ", url= ", str3);
            BannerFinder A2 = SafeDK.getInstance().A();
            if (A2 != null) {
                List<CreativeInfo> a2 = A2.a(str, str2);
                if (a2 != null && !a2.isEmpty()) {
                    Logger.d(m, "add multiple ads downstream struct - found CIs by webView= ", a2);
                    for (CreativeInfo creativeInfo : a2) {
                        synchronized (creativeInfo) {
                            if (creativeInfo.an()) {
                                Logger.d(m, "add multiple ads downstream struct - CI is already multi, not adding ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                            } else if (creativeInfo.h() != null && creativeInfo.h().contains(CreativeInfo.aH)) {
                                Logger.d(m, "add multiple ads downstream struct - already added ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                            } else {
                                Logger.d(m, "add multiple ads downstream struct - adding ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                                creativeInfo.a(CreativeInfo.aH, "");
                            }
                        }
                    }
                    return;
                }
                Logger.d(m, "add multiple ads downstream struct - CI list is null or empty. sdkPackageName = ", str, ", webViewAddress = ", str2);
            }
        }
    }

    public static boolean a(String str) {
        return str != null && str.contains(".rayjump.com") && str.contains("openapi/ad");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2, String str3) {
        o r2;
        CreativeInfo j2;
        if (a(str2)) {
            Logger.d(m, "handle DSP recommendations prefetch, URL:", str2);
            InterstitialFinder z2 = SafeDK.getInstance().z();
            if (z2 != null && (r2 = z2.r(str)) != null && (j2 = r2.j()) != null) {
                Logger.d(m, "handle DSP recommendations prefetch, CI: ", j2.aa());
                a(j2, str2, str3);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, String str, String str2) {
        JSONObject optJSONObject;
        Logger.d(m, "handle dsp recommendations prefetch - started, url= ", str);
        Logger.d(m, "handle dsp recommendations prefetch - bufferValue= ", str2);
        if (creativeInfo != null && str != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.getInt("status") == 1 && (optJSONObject = jSONObject.optJSONObject("data")) != null && a(optJSONObject)) {
                    Logger.d(m, "handle dsp recommendations prefetch - buffer is recommendations prefetch, calling handleRecommendationsPrefetch");
                    a(creativeInfo, optJSONObject);
                }
            } catch (JSONException e2) {
                Logger.d(m, "handle dsp recommendations prefetch - not a valid JSON string, exception: ", e2);
            } catch (Throwable th) {
                Logger.d(m, "handle dsp recommendations prefetch - encountered exception: ", th);
            }
        }
    }

    public static CreativeInfo a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(m, "handle recommendations prefetch - started");
        if (creativeInfo.Q().equals(com.safedk.android.utils.h.o)) {
            creativeInfo = b(creativeInfo);
        }
        ArrayList<b> b2 = b(jSONObject);
        Iterator<b> it = b2.iterator();
        while (it.hasNext()) {
            b next = it.next();
            creativeInfo.a(next.a, next.b);
            Logger.printFullVerboseLog(m, "handle recommendations prefetch - added recommendation= ", next.a, ", resource list= ", next.b);
        }
        creativeInfo.d();
        creativeInfo.u("added_recs (" + com.safedk.android.utils.n.e() + "):" + b2.size());
        return creativeInfo;
    }

    public static CreativeInfo b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(m, "handle inter second prefetch - started");
        if (creativeInfo.Q().equals(com.safedk.android.utils.h.o)) {
            creativeInfo = b(creativeInfo);
        }
        Iterator<b> it = b(jSONObject).iterator();
        while (it.hasNext()) {
            b next = it.next();
            creativeInfo.a(next.a, new HashSet());
            Logger.printFullVerboseLog(m, "handle inter second prefetch - added recommendation= ", next.a);
        }
        creativeInfo.d();
        String h2 = creativeInfo.h() != null ? creativeInfo.h() : "";
        if (!h2.contains(CreativeInfo.aH)) {
            creativeInfo.e(h2 + CreativeInfo.aH);
        }
        return creativeInfo;
    }

    public static void c(String str) {
        Logger.d(m, "handle dsp complementary prefetch - started. message= ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Logger.d(m, "handle dsp complementary prefetch - jsonObject= ", jSONObject);
            String optString = jSONObject.optString("sdkId");
            Logger.d(m, "handle dsp complementary prefetch - sdk= ", optString);
            String optString2 = jSONObject.optString(ab);
            Logger.d(m, "handle dsp complementary prefetch - webViewAddress= ", optString2);
            if (!TextUtils.isEmpty(optString) && !optString.equals(com.safedk.android.utils.h.o) && !TextUtils.isEmpty(optString2)) {
                String string = jSONObject.getString(ac);
                Logger.d(m, "handle dsp complementary prefetch - direction= ", string);
                if (!TextUtils.isEmpty(string) && string.equals(ad)) {
                    Logger.d(m, "handle dsp complementary prefetch - full screen recommendations");
                    a(jSONObject, optString, optString2);
                } else {
                    Logger.d(m, "handle dsp complementary prefetch - banner complementary");
                    b(jSONObject, optString, optString2);
                }
            }
        } catch (JSONException e2) {
            Logger.d(m, "handle dsp complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(m, "handle dsp complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void a(CreativeInfo creativeInfo) {
        String h2 = creativeInfo.h();
        if (h2 != null) {
            creativeInfo.e(h2.replace(CreativeInfo.aH, ""));
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(ae);
            Logger.d(m, "handle dsp fullScreen recommendations - jsonArray= ", optJSONArray);
            if (optJSONArray != null) {
                List<CreativeInfo> a2 = a(str, str2);
                Logger.d(m, "handle dsp fullScreen recommendations - found CIs= ", a2);
                for (CreativeInfo creativeInfo : a2) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String str3 = (String) optJSONArray.get(i2);
                        Logger.d(m, "handle dsp fullScreen recommendations - removing image from webView resources: ", str3);
                        creativeInfo.G(str3);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(m, "handle dsp fullScreen recommendations - exception= ", e2);
        }
    }

    private static void b(JSONObject jSONObject, String str, String str2) {
        try {
            String optString = jSONObject.optString("url");
            Logger.d(m, "handle dsp banner complementary prefetch - url is dsp complementary url= ", optString);
            if (!b(optString)) {
                Logger.d(m, "handle dsp banner complementary prefetch - sdk field is empty or is Mintegral sdk, returning. sdk= ", str);
                return;
            }
            String optString2 = jSONObject.optString(ag);
            if (TextUtils.isEmpty(optString2)) {
                Logger.d(m, "handle dsp banner complementary prefetch - adsData field is null or empty, returning. adsDataString= ", optString2);
            } else {
                JSONObject jSONObject2 = new JSONObject(optString2);
                Logger.d(m, "handle dsp banner complementary prefetch - responsePrefetch= ", jSONObject2);
                JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                Logger.d(m, "handle dsp banner complementary prefetch - adsData= ", optJSONObject);
                if (optJSONObject != null) {
                    for (CreativeInfo creativeInfo : a(str, str2)) {
                        if (c(optJSONObject)) {
                            Logger.d(m, "handle dsp banner complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                            creativeInfo = a(creativeInfo, optJSONObject);
                        } else {
                            Logger.d(m, "handle dsp banner complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                            c(creativeInfo, optJSONObject);
                        }
                        a(creativeInfo);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(m, "handle dsp banner complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(m, "handle dsp banner complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void c(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(m, "handle second multi ad - started, firstCI= ", creativeInfo);
        List<CreativeInfo> a2 = a(jSONObject, creativeInfo, creativeInfo.Q, (c.a) null);
        if (!a2.isEmpty()) {
            Logger.d(m, "handle second multi ad - CIs generated= ", a2);
            creativeInfo.a(m.b, new m.a[0]);
            creativeInfo.ao();
            a(creativeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append(creativeInfo.h() != null ? creativeInfo.h() : "");
            sb.append(creativeInfo.Q().equals(com.safedk.android.utils.h.o) ? CreativeInfo.aI : L);
            String str = sb.toString() + CreativeInfo.aG + (a2.size() + 1);
            creativeInfo.e(str);
            Logger.d(m, "handle second multi ad - updating downstream struct of first CI to= ", str);
            SafeDK.getInstance().A().a(creativeInfo);
            for (CreativeInfo creativeInfo2 : a2) {
                creativeInfo2.h(creativeInfo.n());
                creativeInfo2.ao();
                creativeInfo2.e(creativeInfo.h());
                creativeInfo2.j(creativeInfo.F());
                if (creativeInfo.X() != null) {
                    creativeInfo2.b(creativeInfo.ak(), creativeInfo.aj());
                    Logger.printFullVerboseLog(m, "handle second multi ad - finished updating second CI, calling setCreativeInAdFinder. second CI= ", creativeInfo2);
                    CreativeInfoManager.a(creativeInfo2, creativeInfo.X(), creativeInfo.Y(), creativeInfo.W());
                } else {
                    Logger.d(m, "handle second multi ad - not matched yet, adding CI to multi ad list");
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(creativeInfo.Q());
                    if (j2 != null) {
                        j2.a(creativeInfo, creativeInfo.L());
                        j2.a(creativeInfo2, creativeInfo.L());
                    }
                }
            }
            return;
        }
        Logger.d(m, "handle second multi ad - could not generate second CI");
    }

    public static List<CreativeInfo> a(JSONObject jSONObject, CreativeInfo creativeInfo, String str, c.a aVar) {
        BrandSafetyEvent.AdFormatType valueOf;
        BrandSafetyUtils.AdType K2;
        int i2 = 1;
        Logger.d(m, "generate CI - started");
        ArrayList arrayList = new ArrayList();
        Map<String, String> g2 = g(jSONObject);
        int i3 = 2;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(m, "generate CI - ads size= ", Integer.valueOf(jSONArray.length()));
            int i4 = 0;
            while (i4 < jSONArray.length()) {
                Object[] objArr = new Object[i3];
                objArr[0] = "generate CI - Looping over ad index= ";
                objArr[i2] = Integer.valueOf(i4);
                Logger.d(m, objArr);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                Map<String, String> f2 = f(jSONObject2.optJSONObject(Q));
                a b2 = b(jSONObject2, g2, f2);
                String a2 = a(b2);
                if (a2 == null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = "generate CI - adId is null, skipping this ad";
                    Logger.d(m, objArr2);
                } else {
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = "generate CI - adId= ";
                    objArr3[i2] = a2;
                    Logger.d(m, objArr3);
                    if (creativeInfo == null) {
                        Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> e2 = e(jSONObject);
                        valueOf = (BrandSafetyEvent.AdFormatType) e2.first;
                        K2 = (BrandSafetyUtils.AdType) e2.second;
                    } else {
                        valueOf = BrandSafetyEvent.AdFormatType.valueOf(creativeInfo.I());
                        K2 = creativeInfo.K();
                    }
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = "generate CI - adFormat= ";
                    objArr4[i2] = valueOf;
                    objArr4[2] = " BrandSafety adType= ";
                    objArr4[3] = K2;
                    Logger.d(m, objArr4);
                    String string = jSONObject2.getString("id");
                    String a3 = a(jSONObject2, g2, f2);
                    String f3 = f(jSONObject2.getString("video_url"));
                    String string2 = jSONObject2.getString("image_url");
                    MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(a2, K2, string, a3, f3, string2, valueOf, k.d(jSONObject.getString(r), s), str, a(jSONObject, jSONArray, K2), false, jSONObject2.getString("package_name"));
                    Logger.d(m, "generate CI - creativeInfo created= ", mintegralCreativeInfo);
                    mintegralCreativeInfo.a(b2.a);
                    Logger.d(m, "generate CI - setting creativeInfo k field= ", b2.a);
                    if (K2 == BrandSafetyUtils.AdType.NATIVE && aVar != null) {
                        Logger.d(m, "generate CI - creativeInfo is native, updating its elements");
                        a(mintegralCreativeInfo, jSONObject2, aVar.b == BrandSafetyEvent.AdFormatType.NATIVE);
                    }
                    if (creativeInfo != null) {
                        Logger.d(m, "generate CI - Mintegral dsp, updating sdk to: ", creativeInfo.Q());
                        mintegralCreativeInfo.s(creativeInfo.Q());
                        mintegralCreativeInfo.n(com.safedk.android.utils.h.o);
                    }
                    a(mintegralCreativeInfo, jSONObject2, string2);
                    arrayList.add(mintegralCreativeInfo);
                    a(mintegralCreativeInfo, K2, jSONObject, jSONArray);
                    a(mintegralCreativeInfo, jSONObject, i4);
                    d(mintegralCreativeInfo, jSONObject2);
                    e(mintegralCreativeInfo, jSONObject2);
                    if (jSONObject2.has(z) && jSONObject2.getInt(z) == 0) {
                        mintegralCreativeInfo.e(mintegralCreativeInfo.h() + "/adv_id_0");
                        Logger.d(m, "downstream struct added programmatic indicator");
                    }
                }
                i4++;
                i2 = 1;
                i3 = 2;
            }
        } catch (JSONException e3) {
            Logger.d(m, "generate CI - could not extract ads array, exception= ", e3);
        }
        return arrayList;
    }

    private static void d(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            if (jSONObject.has(w)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(w);
                if (jSONObject2.has("impression")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("impression");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        creativeInfo.x(jSONArray.getString(i2));
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(m, "add impression tracking URLs - could not extract impression urls, exception= ", e2);
        }
    }

    private static void e(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            String str = "";
            if (jSONObject.has(A)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(A);
                if (jSONObject2.has(B)) {
                    str = "|par_dspid=" + jSONObject2.getInt(B);
                }
                if (jSONObject2.has(C)) {
                    str = str + "|slot_id=" + jSONObject2.getInt(C);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                creativeInfo.u(str);
            }
        } catch (JSONException e2) {
            Logger.d(m, "parsing exception= ", e2.getMessage());
        }
    }

    private static CreativeInfo b(CreativeInfo creativeInfo) {
        CreativeInfo j2;
        o r2 = SafeDK.getInstance().z().r(creativeInfo.Q());
        if (r2 != null && (j2 = r2.j()) != null && creativeInfo != j2 && creativeInfo.L().equals(j2.L())) {
            Logger.d(m, "get current displaying Ci - found currently displayed instance= ", creativeInfo.aa());
            return j2;
        }
        return creativeInfo;
    }

    public static boolean a(JSONObject jSONObject) {
        boolean z2 = d(jSONObject) == 295;
        Logger.d(m, "is complementary prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    public static ArrayList<b> b(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(m, "generate recommendations - number of recommendations= ", Integer.valueOf(jSONArray.length()));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                bVar.a = jSONObject2.getString("package_name");
                bVar.b.addAll(com.safedk.android.utils.n.f(jSONObject2.toString().replace("\\/", "/")));
                Logger.d(m, "generate recommendations - generating recommendation num ", Integer.valueOf(i2), ". packageName= ", bVar.a, ", resources= ", bVar.b);
                arrayList.add(bVar);
            }
        } catch (JSONException e2) {
            Logger.d(m, "generate recommendations - exception while generating recommendations. exception= ", e2);
        }
        return arrayList;
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z2;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.getJSONArray("ads").length() > 2;
            } catch (JSONException e2) {
            }
            Logger.d(m, "is recommendations prefetch - returning= ", Boolean.valueOf(z2));
            return z2;
        }
        z2 = false;
        Logger.d(m, "is recommendations prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    private static List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> a2;
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null && (a2 = bVar.a(str, str2)) != null && !a2.isEmpty()) {
                return a2;
            }
        }
        return new ArrayList();
    }

    private static void a(MintegralCreativeInfo mintegralCreativeInfo, JSONObject jSONObject, int i2) {
        ArrayList<b> b2;
        if (e(jSONObject.optString(H, null)) && (b2 = b(jSONObject)) != null && b2.size() == 2) {
            b bVar = b2.get(1 - i2);
            mintegralCreativeInfo.b(bVar.a, bVar.b);
            Logger.d(m, "add choose ad recommendations - updating creative info recommendations: ", bVar);
        }
    }

    private static void a(CreativeInfo creativeInfo, BrandSafetyUtils.AdType adType, JSONObject jSONObject, JSONArray jSONArray) {
        if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1) {
            String optString = jSONObject.optString(H);
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(m, "set mof template url - adding mofTemplateYrl to debug info= ", optString);
                creativeInfo.u("mofTemplateUrl:" + optString);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        Logger.d(m, "extract and classify urls - started");
        ArrayList<String> f2 = com.safedk.android.utils.n.f(jSONObject.toString().replace("\\/", "/"));
        f2.remove(d.I(str));
        Logger.d(m, "extract and classify urls - prefetchResourcesList= ", f2);
        creativeInfo.b((List<String>) f2);
    }

    private static String a(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        Logger.d(m, "get click url - started");
        String str = null;
        try {
            String string = jSONObject.getString("click_url");
            Logger.d(m, "get click url - click url from ad object= ", string);
            if (string.isEmpty() && jSONObject.has(v)) {
                String F2 = d.F(jSONObject.getString(v));
                if (F2 != null) {
                    string = F2;
                }
                Logger.d(m, "get click url - click url from dsp ad= ", string);
            }
            if (string.contains(D) && string.contains(E)) {
                str = a(map2, a(map, string));
                Logger.d(m, "get click url - click url after replacing place holders= ", str);
                return str;
            }
            return string;
        } catch (JSONException e2) {
            Logger.d(m, "get click url - exception while extracting click url. exception= ", e2);
            return str;
        }
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        Logger.d(m, "generate downstream struct - started");
        String optString = jSONObject.optString(H, null);
        String str = "";
        if (e(optString)) {
            String str2 = "" + K;
            Logger.d(m, "generate downstream struct - downstream struct added: ", K);
            str = str2;
        }
        if (a(optString, jSONArray, adType)) {
            str = str + CreativeInfo.aH;
            Logger.d(m, "generate downstream struct - downstream struct added: ", CreativeInfo.aH);
        }
        Logger.d(m, "generate downstream struct - final downstream struct: ", str);
        return str;
    }

    private static boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : I) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        if (adType != null && adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1 && !TextUtils.isEmpty(str)) {
            for (String str2 : J) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> e(JSONObject jSONObject) {
        BrandSafetyUtils.AdType adType;
        Logger.d(m, "generate brandSafety ad type and format - started");
        int d2 = d(jSONObject);
        BrandSafetyEvent.AdFormatType adFormatType = null;
        if (d2 != 287) {
            adType = null;
        } else {
            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (d2 == 94) {
            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (d2 == 296) {
            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        if (d2 == 42) {
            adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
            adType = BrandSafetyUtils.AdType.NATIVE;
        }
        return new Pair<>(adFormatType, adType);
    }

    private static String f(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            stringBuffer.append(am.get(str.substring(i2, i3)));
            i2 = i3;
        }
        return new String(Base64.decode(stringBuffer.toString(), 0));
    }

    public static String a(a aVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(aVar.a)) {
            i2 = 0;
        } else {
            sb.append(aVar.a);
            i2 = 1;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.c)) {
            sb.append(aVar.c);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.b)) {
            sb.append(aVar.b);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.d)) {
            sb.append(aVar.d);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.e)) {
            sb.append(aVar.e);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.f)) {
            sb.append(aVar.f);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.g)) {
            sb.append(aVar.g);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.h)) {
            sb.append(aVar.h);
            i2++;
        }
        sb.append(m.ad);
        if (!TextUtils.isEmpty(aVar.i)) {
            sb.append(aVar.i);
            i2++;
        }
        if (i2 < 2) {
            Logger.d(m, "generate ad id AKS - not enough params to generate a valid ID: ", sb);
            return null;
        }
        Logger.d(m, "generate ad id AKS - generated ad id = ", sb);
        return sb.toString();
    }

    private static a b(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        String str;
        a aVar = null;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(Q);
            if (!jSONObject.has(y)) {
                str = null;
            } else {
                str = jSONObject.getString(y);
            }
            Logger.d(m, "generate AKS from ad prefetch - impression url template: ", str);
            if (optJSONObject != null) {
                a aVar2 = new a();
                try {
                    aVar2.a = optJSONObject.optString(R);
                    aVar2.c = optJSONObject.optString(S);
                    aVar2.b = optJSONObject.optString("r");
                    aVar2.d = optJSONObject.optString(U);
                    aVar2.e = optJSONObject.optString(V);
                    aVar2.f = optJSONObject.optString(W);
                    aVar2.g = optJSONObject.optString(X);
                    aVar2.h = optJSONObject.optString("ap");
                    aVar2.i = optJSONObject.optString(Z);
                    aVar = aVar2;
                } catch (JSONException e2) {
                    e = e2;
                    aVar = aVar2;
                    Logger.d(m, "generate AKS from ad prefetch - exception while generating AKS from ad data. exception= ", e);
                    return aVar;
                }
            }
            if (aVar == null || a(aVar) == null) {
                if (str.contains(D) && str.contains(E)) {
                    str = a(map2, a(map, str));
                }
                return d(str);
            }
            return aVar;
        } catch (JSONException e3) {
            e = e3;
        }
    }

    private static Map<String, String> f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                if (jSONObject.has(R)) {
                    hashMap.put(R, jSONObject.getString(R));
                }
                if (jSONObject.has(S)) {
                    hashMap.put(S, jSONObject.getString(S));
                }
                if (jSONObject.has("r")) {
                    hashMap.put("r", jSONObject.getString("r"));
                }
                if (jSONObject.has(U)) {
                    hashMap.put(U, jSONObject.getString(U));
                }
                if (jSONObject.has(V)) {
                    hashMap.put(V, jSONObject.getString(V));
                }
                if (jSONObject.has(W)) {
                    hashMap.put(W, jSONObject.getString(W));
                }
                if (jSONObject.has(X)) {
                    hashMap.put(X, jSONObject.getString(X));
                }
                if (jSONObject.has("ap")) {
                    hashMap.put("ap", jSONObject.getString("ap"));
                }
                if (jSONObject.has(Z)) {
                    hashMap.put(Z, jSONObject.getString(Z));
                }
            } catch (JSONException e2) {
                Logger.d(m, "generate ad level place holders map - exception while generating adLevelPlaceHoldersMap. exception= ", e2);
            }
        }
        return hashMap;
    }

    private static Map<String, String> g(JSONObject jSONObject) {
        Map<String, String> hashMap = new HashMap<>();
        try {
            if (jSONObject.has(M)) {
                hashMap = com.safedk.android.utils.d.a(jSONObject.getJSONObject(M));
                if (jSONObject.has("a")) {
                    hashMap.put("a", jSONObject.getString("a"));
                }
                if (jSONObject.has(O)) {
                    hashMap.put(O, jSONObject.getString(O));
                }
                if (jSONObject.has(P)) {
                    hashMap.put(P, jSONObject.getString(P));
                }
            }
        } catch (JSONException e2) {
            Logger.d(m, "generate prefetch level place holders map - exception while generating prefetchLevelPlaceHoldersMap. exception= ", e2);
        }
        return hashMap;
    }

    public static a d(String str) {
        try {
            a aVar = new a();
            Map<String, String> a2 = k.a(str, false);
            aVar.a = a2.get(R);
            aVar.c = a2.get(S);
            aVar.b = a2.get("r");
            aVar.d = a2.get(U);
            aVar.e = a2.get(V);
            aVar.f = a2.get(W);
            aVar.g = a2.get(X);
            aVar.h = a2.get("ap");
            aVar.i = a2.get(Z);
            Logger.d(m, "generate AKS from impression url - generated AKS data= ", aVar);
            return aVar;
        } catch (Throwable th) {
            Logger.d(m, "generate AKS from impression url - exception while generating AKS from url ", str, ",  exception= ", th.getMessage());
            return null;
        }
    }

    public static int d(JSONObject jSONObject) {
        return jSONObject.optInt("ad_type", -1);
    }

    private static String a(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            str = str.replace(D + str2 + E, map.get(str2));
        }
        return str;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z2) {
        String optString = jSONObject.optString("image_url");
        if (z2) {
            creativeInfo.r().remove(optString);
            creativeInfo.A(CreativeInfo.aL + optString);
        } else {
            creativeInfo.y(optString);
        }
        Logger.d(m, "update native prefetch elements - adding main image element= ", optString);
        String optString2 = jSONObject.optString("title");
        if (z2) {
            creativeInfo.A(CreativeInfo.aK + optString2);
        } else {
            creativeInfo.z(optString2);
        }
        Logger.d(m, "update native prefetch elements - adding title element= ", optString2);
        String optString3 = jSONObject.optString(aj);
        if (z2) {
            creativeInfo.A(CreativeInfo.aM + optString3);
        } else {
            creativeInfo.y(optString3);
        }
        Logger.d(m, "update native prefetch elements - adding icon url element= ", optString3);
        String optString4 = jSONObject.optString(ak);
        if (z2) {
            creativeInfo.A(CreativeInfo.aN + optString4);
        } else {
            creativeInfo.z(optString4);
        }
        Logger.d(m, "update native prefetch elements - adding body element= ", optString4);
        String optString5 = jSONObject.optString(al);
        if (z2) {
            creativeInfo.A(CreativeInfo.aO + optString5);
        } else {
            creativeInfo.z(optString5);
        }
        Logger.d(m, "update native prefetch elements - adding cta element= ", optString5);
        if (!z2) {
            creativeInfo.f("/native");
        }
    }
}
