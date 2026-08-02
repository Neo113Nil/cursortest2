package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MolocoCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends d {
    private static final String V = "title";
    private static final String W = "text";
    private static final String X = "data";
    private static final String Y = "value";
    private static final String Z = "img";
    private static final String aa = "url";
    private static final String ab = "video";
    private static final String ac = "vasttag";
    private static final String ad = "impression_id";
    private static final String ae = "imp_id";
    private static final String b = "MolocoDiscovery";
    private static final String c = "moloco.com";
    private static final String d = "adjust.com";
    private static final String e = "androidx.compose.ui.platform.ComposeView";
    private static final String f = "androidx.compose.ui.platform.AndroidComposeView";
    private static final String g = "seatbid";
    private static final String h = "bid";
    private static final String i = "crid";
    private static final String j = "bundle";
    private static final String k = "iurl";
    private static final String l = "adomain";
    private static final String m = "adid";
    private static final String n = "adm";
    private static final String o = "native";
    private static final String p = "assets";
    private static final String q = "id";

    public n() {
        super(com.safedk.android.utils.h.D, b);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, "MOLOCO_NETWORK");
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        JSONObject jSONObject;
        BrandSafetyUtils.AdType adType;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        JSONObject jSONObject3;
        String str5;
        ArrayList<String> arrayList;
        boolean z;
        String str6;
        String str7;
        boolean z2;
        Logger.d(b, "generate info - started, url= ", str);
        try {
            jSONObject = new JSONObject(com.safedk.android.utils.c.a(Base64.decode(str2, 0)));
        } catch (JSONException e2) {
            Logger.d(b, "generate info - not a valid JSON string: ", e2.getMessage());
            jSONObject = null;
            if (jSONObject == null) {
            }
        } catch (Throwable th) {
            Logger.d(b, "generate info - not a valid JSON string: ", th.getMessage(), th);
            jSONObject = null;
            if (jSONObject == null) {
            }
        }
        if (jSONObject == null) {
            Logger.d(b, "generate info - obj is null, skipping.");
            return null;
        }
        Logger.printFullVerboseLog(b, "generate info - obj= ", jSONObject);
        BrandSafetyUtils.AdType adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
        if (aVar == null) {
            adType = adType2;
            str3 = null;
            str4 = null;
        } else {
            String str8 = aVar.c;
            String str9 = aVar.a;
            if (aVar.b.name().equals("BANNER") || aVar.b.name().equals(BrandSafetyUtils.n)) {
                adType = BrandSafetyUtils.AdType.BANNER;
                str3 = str8;
                str4 = str9;
            } else if (!aVar.b.name().equals("NATIVE")) {
                adType = adType2;
                str3 = str8;
                str4 = str9;
            } else {
                adType = BrandSafetyUtils.AdType.NATIVE;
                str3 = str8;
                str4 = str9;
            }
        }
        try {
            JSONArray optJSONArray2 = jSONObject.optJSONArray(g);
            if (optJSONArray2 != null && optJSONArray2.length() > 0 && (jSONObject2 = optJSONArray2.getJSONObject(0)) != null && (optJSONArray = jSONObject2.optJSONArray("bid")) != null && optJSONArray.length() > 0) {
                JSONObject jSONObject4 = optJSONArray.getJSONObject(0);
                Logger.printFullVerboseLog(b, "generate info - bid= ", jSONObject4);
                if (jSONObject4 != null) {
                    String optString = jSONObject4.optString(i);
                    Logger.d(b, "generate info - creativeId= ", optString);
                    String optString2 = jSONObject4.optString(j);
                    Logger.d(b, "generate info - bundle= ", optString2);
                    String optString3 = jSONObject4.optString(k);
                    Logger.d(b, "generate info - iurl= ", optString3);
                    JSONArray optJSONArray3 = jSONObject4.optJSONArray(l);
                    Logger.d(b, "generate info - adomainArray= ", optJSONArray3);
                    String optString4 = jSONObject4.optString(m);
                    Logger.d(b, "generate info - adId= ", optString4);
                    String optString5 = jSONObject4.optString("adm");
                    ArrayList<String> f2 = com.safedk.android.utils.n.f(optString5);
                    Logger.printFullVerboseLog(b, "generate info - adm resource list is : ", f2);
                    try {
                        jSONObject3 = new JSONObject(optString5);
                    } catch (JSONException e3) {
                        Logger.d(b, "generate info - adm is not json obj");
                        jSONObject3 = null;
                    }
                    Logger.d(b, "generate info - adm obj= ", jSONObject3);
                    if (!TextUtils.isEmpty(optString5) && jSONObject3 == null) {
                        ArrayList<String> f3 = com.safedk.android.utils.n.f(optString5);
                        if (com.safedk.android.utils.n.a(com.safedk.android.analytics.brandsafety.creatives.h.j(), optString5, 1) != null) {
                            str7 = CreativeInfo.r;
                            z2 = true;
                        } else {
                            str7 = CreativeInfo.w;
                            z2 = false;
                        }
                        str5 = a(f3);
                        if (str5 != null) {
                            Logger.d(b, "generate info - adId from getAdIdFromResourceList = ", str5, ", resourcesList : ", f3);
                            str6 = str7;
                            arrayList = f3;
                            z = z2;
                        } else {
                            Logger.d(b, "generate info - getAdIdFromResourceList produced a null adId, keeping the original one : ", optString4);
                            str6 = str7;
                            str5 = optString4;
                            arrayList = f3;
                            z = z2;
                        }
                    } else {
                        str5 = optString4;
                        arrayList = f2;
                        z = false;
                        str6 = null;
                    }
                    Logger.d(b, "generate info - adId= ", str5);
                    MolocoCreativeInfo molocoCreativeInfo = new MolocoCreativeInfo(adType, com.safedk.android.utils.h.D, str5, optString, str6, this.I, str3, optString2, (optJSONArray3 == null || optJSONArray3.length() <= 0) ? null : optJSONArray3.getString(0), str4);
                    if (z) {
                        a((CreativeInfo) molocoCreativeInfo, (String) null, optString5, true);
                        Logger.d(b, "generate info - vast video url = ", molocoCreativeInfo.H());
                    } else if (jSONObject3 == null) {
                        molocoCreativeInfo.b((List<String>) arrayList);
                    }
                    if (jSONObject3 != null && aVar != null) {
                        boolean z3 = aVar.b == BrandSafetyEvent.AdFormatType.NATIVE;
                        if (!a(molocoCreativeInfo, jSONObject3, z3) && !TextUtils.isEmpty(optString3)) {
                            c(molocoCreativeInfo, CreativeInfo.aL, optString3, z3);
                        }
                        if (z3) {
                            molocoCreativeInfo.r(k.o(str2));
                        } else {
                            molocoCreativeInfo.r(aVar.c + "_" + aVar.a + "_" + com.safedk.android.utils.h.D);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(molocoCreativeInfo);
                    Logger.d(b, "generate info - creativeInfo= ", molocoCreativeInfo);
                    return arrayList2;
                }
                return null;
            }
            return null;
        } catch (Exception e4) {
            Logger.d(b, "generate info - exception while parsing prefetch: ", e4);
            return null;
        }
    }

    private boolean a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("native");
        char c2 = 0;
        Logger.d(b, "handle native prefetch - native obj= ", optJSONObject);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(p)) != null) {
            int i2 = 0;
            boolean z4 = false;
            boolean z5 = false;
            str = null;
            while (i2 < optJSONArray.length()) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("id", -1);
                    Object[] objArr = new Object[4];
                    objArr[c2] = "handle native prefetch - asset id= ";
                    objArr[1] = Integer.valueOf(optInt);
                    objArr[2] = ",    asset obj= ";
                    objArr[3] = optJSONObject2;
                    Logger.d(b, objArr);
                    if (optInt == 0) {
                        c(creativeInfo, CreativeInfo.aM, c(optJSONObject2), z);
                    } else if (optInt == 1) {
                        String c3 = c(optJSONObject2);
                        c(creativeInfo, CreativeInfo.aL, c3, z);
                        if (!TextUtils.isEmpty(c3)) {
                            z4 = true;
                        }
                    } else if (optInt == 2) {
                        String d2 = d(optJSONObject2);
                        if (!TextUtils.isEmpty(d2)) {
                            str = d2;
                            z5 = true;
                        }
                    } else if (optInt == 3) {
                        b(creativeInfo, CreativeInfo.aK, a(optJSONObject2), z);
                    } else if (optInt != 4) {
                        if (optInt == 5) {
                            b(creativeInfo, CreativeInfo.aN, b(optJSONObject2), z);
                        } else if (optInt == 7 && z) {
                            b(creativeInfo, CreativeInfo.aO, b(optJSONObject2), z);
                        }
                    } else if (z) {
                        b(creativeInfo, CreativeInfo.aQ, b(optJSONObject2), z);
                    }
                }
                i2++;
                c2 = 0;
            }
            z3 = z4;
            z2 = z5;
        } else {
            z2 = false;
            str = null;
            z3 = false;
        }
        if (z) {
            creativeInfo.a("native", "/");
        }
        if (z2) {
            a(creativeInfo, (String) null, str, true);
            creativeInfo.a(CreativeInfo.r, "/");
        }
        return z3;
    }

    private void b(CreativeInfo creativeInfo, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            if (!z) {
                creativeInfo.z(str2);
                return;
            }
            creativeInfo.A(str + str2);
        }
    }

    private void c(CreativeInfo creativeInfo, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            if (!z) {
                creativeInfo.y(str2);
                return;
            }
            creativeInfo.A(str + str2);
        }
    }

    private String a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("title")) != null) {
            String optString = optJSONObject.optString("text");
            Logger.d(b, "get title text from native asset - text= ", optString);
            return optString;
        }
        return null;
    }

    private String b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            String optString = optJSONObject.optString("value");
            Logger.d(b, "get data value from native asset - value= ", optString);
            return optString;
        }
        return null;
    }

    private String c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("img")) != null) {
            String optString = optJSONObject.optString("url");
            Logger.d(b, "get image url from native asset - url= ", optString);
            return optString;
        }
        return null;
    }

    private String d(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("video")) != null) {
            String optString = optJSONObject.optString(ac);
            Logger.d(b, "get vast tag video from native asset - vast= ", optString);
            return optString;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return str.contains(c) || str.contains(d);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return C(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        Set<String> keySet;
        Logger.d(b, "matchInfo started, type of adInstance is ", obj.getClass().getName(), ", adInstance : ", obj);
        CreativeInfo creativeInfo = this.J.get(obj.toString());
        if (creativeInfo == null) {
            creativeInfo = this.J.get(k.o(obj.toString()));
        }
        if (creativeInfo == null) {
            Logger.d(b, "matchInfo by ", obj.getClass().getName(), " failed");
            if (obj instanceof Uri) {
                Uri uri = (Uri) obj;
                String uri2 = uri.toString();
                String B = com.safedk.android.utils.n.B(uri.toString());
                Logger.d(b, "matchInfo uri is ", uri2, ", uri w/o q is ", B);
                synchronized (this.J) {
                    keySet = this.J.keySet();
                    Logger.d(b, "matchInfo keySet ", keySet);
                }
                for (String str : keySet) {
                    CreativeInfo creativeInfo2 = this.J.get(str);
                    Logger.d(b, "matchInfo key : ", str);
                    if (creativeInfo2 != null && creativeInfo2.H() != null) {
                        Logger.d(b, "matchInfo creativeInfo video url is  ", creativeInfo2.H(), ", urls : ", creativeInfo2.r());
                        Logger.d(b, "matchInfo creativeInfo match uriWithoutQueryString matches video url ? ", Boolean.valueOf(creativeInfo2.H().equals(B)), ", prefetch urls contain uriWithoutQueryString ? ", Boolean.valueOf(creativeInfo2.r().contains(B)));
                        Logger.d(b, "matchInfo creativeInfo match uri matches video url ? ", Boolean.valueOf(creativeInfo2.H().equals(uri2)), ", prefetch urls contain uri ? ", Boolean.valueOf(creativeInfo2.r().contains(uri2)));
                        if (creativeInfo2.H().equals(B) || creativeInfo2.H().equals(uri2)) {
                            Logger.d(b, Logger.FeatureTag.CI_MATCHING, "matchInfo match found by video url : ", creativeInfo2.H());
                            return creativeInfo2;
                        }
                    }
                }
            }
        }
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        return super.e(view) || e.equals(view.getClass().getName()) || f.equals(view.getClass().getName());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(com.safedk.android.utils.h.D);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                return a(com.safedk.android.utils.n.f(str2));
            }
            return null;
        }
        return null;
    }

    private static String a(ArrayList<String> arrayList) {
        String str = null;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains(c) || next.contains(d)) {
                    str = C(next);
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        }
        return str;
    }

    private static String C(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (com.safedk.android.utils.n.a((Object) str)) {
            arrayList.add(str);
        } else {
            arrayList = com.safedk.android.utils.n.f(str);
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String z = com.safedk.android.utils.n.z(it.next());
            String d2 = k.d(z, "impression_id");
            if (TextUtils.isEmpty(d2)) {
                d2 = k.d(z, ae);
            }
            if (!TextUtils.isEmpty(d2)) {
                Logger.d(b, "get ad id from resource - found adId= ", d2, ", in url ", z);
                return d2;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return h(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return i(view);
    }
}
