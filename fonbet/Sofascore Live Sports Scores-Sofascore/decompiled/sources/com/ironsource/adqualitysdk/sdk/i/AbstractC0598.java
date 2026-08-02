package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⴡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0598 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1969 = StringFog.decrypt("Ue67Zu9TvrI=\n", "EJ7LM5s60sE=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1968 = StringFog.decrypt("tKc=\n", "xMllzTf2QXY=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1967 = StringFog.decrypt("09c=\n", "sLEbRNDpPhk=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1966 = StringFog.decrypt("K8Y=\n", "XaXrB+fFBTo=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1965 = StringFog.decrypt("pTw=\n", "01LvwO9dcPE=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1964 = StringFog.decrypt("QcE=\n", "Ja9XGVtwd84=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1963 = StringFog.decrypt("ew==\n", "Djt5mREE4AY=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1962 = StringFog.decrypt("8g==\n", "k6Nb8qwagT8=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1961 = StringFog.decrypt("+A==\n", "lk7bx+CG2ps=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m378(Context context, JSONObject jSONObject) {
        String packageName = context.getPackageName();
        try {
            jSONObject.put(f1968, packageName);
        } catch (JSONException e) {
            String str = f1969;
            AbstractC0420.m252(str, str, StringFog.decrypt("XBExYzF/bQY/HyBrdXM/HHsSIUYxMSMceRFkezoxIAFwEA==\n", "H35ED1URSnI=\n"), e, null, false);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(f1967, packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e2) {
            AbstractC0420.m244(f1969, StringFog.decrypt("iHpWyr0qvlvrdEfC+S33XL90T8q8NrlfqnZIx74huUGqeEaGrSu5Rbh6TYj5IetdpGcZhg==\n", "yxUjptlEmS8=\n") + e2.getLocalizedMessage());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(f1966, Integer.toString(packageInfo.versionCode));
            jSONObject.put(f1965, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e3) {
            String str2 = f1969;
            StringBuilder m642 = AbstractC1072.m642("joBQ42SudBjtiED7ILAyD6aOQuogrTICrIhA/SCmPB7t\n", "ze8ljwDAU2w=\n", new StringBuilder(), packageName);
            m642.append(StringFog.decrypt("m2masNht04uBZA==\n", "u0S61aofvPk=\n"));
            m642.append(e3.getLocalizedMessage());
            AbstractC0420.m244(str2, m642.toString());
        } catch (JSONException e4) {
            AbstractC0420.m244(f1969, StringFog.decrypt("vmS4HN7p533daqkUmuawed19qALJ7q9n3WKjFtWntGbdYb4f1KngbI95ogKApw==\n", "/QvNcLqHwAk=\n") + e4.getLocalizedMessage());
        }
        try {
            jSONObject.put(f1964, packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (PackageManager.NameNotFoundException e5) {
            String str3 = f1969;
            StringBuilder m6422 = AbstractC1072.m642("xjgzPVnG5ZSlMCMlHdijg+42ITQdxaOO5DAjIx3OrZKl\n", "hVdGUT2owuA=\n", new StringBuilder(), packageName);
            m6422.append(StringFog.decrypt("Yrw30b2Vqe54sQ==\n", "QpEXtM/nxpw=\n"));
            m6422.append(e5.getLocalizedMessage());
            AbstractC0420.m244(str3, m6422.toString());
        } catch (JSONException e6) {
            AbstractC0420.m244(f1969, StringFog.decrypt("f8XCeH0jsmccy9NwOSzlYxzE1nl8bfx9WsWXYHZt/2BTxJk0fD/nfE6Qlw==\n", "PKq3FBlNlRM=\n") + e6.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m377(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f1969;
            StringBuilder m642 = AbstractC1072.m642("Z6W9ghbaHxwEra2aUsRZC0+rr4tS2VkGRa2tnFLSVxoE\n", "JMrI7nK0OGg=\n", new StringBuilder(), packageName);
            m642.append(StringFog.decrypt("E5+SHxHU56sJkg==\n", "M7KyemOmiNk=\n"));
            m642.append(e.getLocalizedMessage());
            AbstractC0420.m244(str, m642.toString());
            return null;
        }
    }
}
