package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.fw3;
import xsna.i5s;
import xsna.l6g;
import xsna.pzl;
import xsna.tdj;
import xsna.zy60;

/* loaded from: classes13.dex */
public class Xe {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    static String N = "";
    static String O = "";
    private static String a = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String b = "?request=";
    private static final String c = "platform";
    private static final String d = "applicationKey";
    private static final String e = "applicationUserId";
    private static final String f = "sdkVersion";
    private static final String g = "pluginType";
    private static final String h = "pluginVersion";
    private static final String i = "plugin_fw_v";
    private static final String j = "advId";
    private static final String k = "auid";
    private static final String l = "isDemandOnly";
    private static final String m = "serr";
    private static final String n = "appVer";
    private static final String o = "osVer";
    private static final String p = "devModel";
    private static final String q = "devMake";
    private static final String r = "connType";
    private static final String s = "rawConnType";
    private static final String t = "mt";
    private static final String u = "fs";
    private static final String v = "coppa";
    private static final String w = "dff";
    private static final String x = "browserUserAgent";
    private static final String y = "deviceLang";
    private static final String z = "bundleId";

    public static String a() {
        return N;
    }

    public static String b() {
        return O;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z2, List<Pair<String, String>> list, boolean z3) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC4652y7 a2 = Kb.Y().a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            zy60.f("applicationUserId", str2, arrayList);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z2) {
            zy60.f(G, "1", arrayList);
        }
        if (!IronSourceUtils.g()) {
            zy60.f(m, "0", arrayList);
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            zy60.f(j, str3, arrayList);
        }
        if (!TextUtils.isEmpty(str4)) {
            zy60.f("mt", str4, arrayList);
        }
        String b2 = E1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b2)) {
            zy60.f(n, b2, arrayList);
        }
        arrayList.add(new Pair(o, l6g.a(Build.VERSION.SDK_INT, "")));
        zy60.f(q, Build.MANUFACTURER, arrayList);
        arrayList.add(new Pair(p, Build.MODEL));
        arrayList.add(new Pair("fs", l6g.a(IronSourceUtils.c(context) ? 1 : 0, "")));
        ConcurrentHashMap<String, List<String>> c2 = C4440ma.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.b)) {
            arrayList.add(new Pair(v, c2.get(com.ironsource.mediationsdk.metadata.a.b).get(0)));
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            String str6 = c2.get(com.ironsource.mediationsdk.metadata.a.f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.j)) {
                zy60.f("ts", "1", arrayList);
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.d)) {
            String str7 = c2.get(com.ironsource.mediationsdk.metadata.a.d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                zy60.f(w, "1", arrayList);
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.e) && (list2 = c2.get(com.ironsource.mediationsdk.metadata.a.e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.e, list2.get(0)));
        }
        String a3 = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(a3)) {
            zy60.f(r, a3, arrayList);
        }
        String d2 = U3.d(context);
        if (!TextUtils.isEmpty(d2)) {
            zy60.f(s, d2, arrayList);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String s2 = a2.s();
        if (s2.length() != 0) {
            zy60.f(x, s2, arrayList);
        }
        try {
            str5 = a2.d(context) + "-" + a2.B(context);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            zy60.f(y, str5, arrayList);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + T3.b(context)));
        arrayList.add(new Pair("mnc", "" + T3.c(context)));
        String H2 = a2.H(context);
        if (!TextUtils.isEmpty(H2)) {
            zy60.f("icc", H2, arrayList);
        }
        String v2 = a2.v(context);
        if (!TextUtils.isEmpty(v2)) {
            zy60.f(D, v2, arrayList);
        }
        String d3 = a2.d();
        if (!TextUtils.isEmpty(d3)) {
            zy60.f("tz", d3, arrayList);
        }
        arrayList.add(new Pair(F, "" + a2.m()));
        String e3 = a2.e(context);
        if (!TextUtils.isEmpty(e3)) {
            zy60.f("auid", e3, arrayList);
        }
        if (z3) {
            zy60.f("isDemandOnly", "1", arrayList);
        }
        zy60.f(O6.j0, String.valueOf(C4412l0.a()), arrayList);
        String a4 = a(arrayList);
        N = a4;
        return i5s.a(new StringBuilder(), a(LevelPlay.getSdkVersion()), URLEncoder.encode(J9.e(C4399k5.b().c(), a4), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
    }

    private static void b(String str) {
        a = str;
    }

    public static String a(String str, boolean z2, int i2) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z2)));
        arrayList.add(new Pair("placementId", Integer.toString(i2)));
        return pzl.b(str, "&", a(arrayList));
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str.concat("&");
            }
            StringBuilder e2 = fw3.e(str);
            e2.append((String) pair.first);
            e2.append("=");
            e2.append(URLEncoder.encode((String) pair.second, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            str = e2.toString();
        }
        return str;
    }

    private static String a(String str) {
        return tdj.a(new StringBuilder(), a, str, b);
    }
}
