package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.TrafficStats;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.vxd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҷ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0416 {

    /* renamed from: ゥ, reason: contains not printable characters */
    public static JSONObject f1180;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1206 = StringFog.decrypt("kRLFQ6rYsh68G8A=\n", "1XezKsm952o=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1205 = StringFog.decrypt("nmBjbg==\n", "8BcQHseqKjk=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1204 = StringFog.decrypt("zaDnGA==\n", "o9eVYB95rOc=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1203 = StringFog.decrypt("RNcNWA==\n", "KbpsLhYNPqo=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1202 = StringFog.decrypt("410rHA==\n", "jjBfdLX+N4s=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1201 = StringFog.decrypt("+YF/rA==\n", "lOwT2wzb8YE=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1200 = StringFog.decrypt("CH9yOw==\n", "ZRIGT2Zw/TM=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1199 = StringFog.decrypt("9Q==\n", "goMAXLINRZI=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1198 = StringFog.decrypt("sA==\n", "2Fzw9DQlcxs=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1197 = StringFog.decrypt("Dm7p2w==\n", "fQeTvswnXBE=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1196 = StringFog.decrypt("gMSWng==\n", "96Ll6qMnVeE=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1195 = StringFog.decrypt("Zp7tqw==\n", "Efif2N/ZDqw=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1194 = StringFog.decrypt("0z3DDA==\n", "pFuwfIfUqBo=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1193 = StringFog.decrypt("bAUABg==\n", "AWdzcqJsCvE=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1192 = StringFog.decrypt("SeI63YI=\n", "JIBOresWDcg=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1191 = StringFog.decrypt("vRxquQ==\n", "0H4eyYDiAng=\n");

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1190 = StringFog.decrypt("BjESkWs=\n", "a1Nh4QK5z0U=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1189 = StringFog.decrypt("Du8WnQ==\n", "Y41l7cjxohw=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1188 = StringFog.decrypt("ss5p+g==\n", "36wHlcMCf30=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1187 = StringFog.decrypt("9JweMA==\n", "mf5xXjPBauI=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1186 = StringFog.decrypt("Oc+Bhg==\n", "VK3i5YVCbR8=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1185 = StringFog.decrypt("m+5/ZQ==\n", "9owMChp7r24=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1184 = StringFog.decrypt("Zq9fcA==\n", "C80sHiCZDso=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1183 = StringFog.decrypt("5Ri91w==\n", "h2zNu1pSdkk=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1182 = StringFog.decrypt("on4sUg==\n", "wApAJMDvW9c=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static JSONObject f1181 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m236(JSONObject jSONObject) {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(f1205, vxd.b(1000.0f, currentTimeMillis2 - currentTimeMillis, totalRxBytes2 - totalRxBytes));
                jSONObject.put(f1204, totalRxBytes2);
            }
        } catch (Throwable th) {
            String str = f1206;
            AbstractC0420.m252(str, str, StringFog.decrypt("CjNV0Wkn8107NU7QfCf3SDphRtB/J/pdOzZIzHAn4UsuJkI=\n", "T0EnvhsHlDg=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m240(Context context) {
        DisplayMetrics displayMetrics;
        synchronized (AbstractC0416.class) {
            if (context != null) {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService(StringFog.decrypt("oeH45kHn\n", "1oiWgi6Qe5o=\n"));
                    if (windowManager != null && Build.VERSION.SDK_INT >= 30) {
                        try {
                            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            if (bounds != null) {
                                m238(bounds.height(), bounds.width());
                                return;
                            }
                        } catch (Throwable th) {
                            String str = f1206;
                            AbstractC0420.m252(str, str, StringFog.decrypt("stuP/Y6Jra/XzpjmiMCqptfelPyYxrOMkt2P+5/a5KeFxpCyi8CqpZjesPOSzqGz\n", "96n9kvypxME=\n"), th, null, false);
                        }
                    }
                    Resources resources = context.getResources();
                    if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        m238(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    }
                } finally {
                    String str2 = f1206;
                    AbstractC0420.m252(str2, str2, StringFog.decrypt("5FqSZWllOgWBT4V+byw9DIFsiXlrKTIS7E2UeHImIEvHWo9nOyY8BdVNmH4=\n", "oSjgChtFU2s=\n"), th, null, false);
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m239(Activity activity) {
        synchronized (AbstractC0416.class) {
            if (activity != null) {
                m240(activity.getApplicationContext());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized JSONObject m237() {
        JSONObject jSONObject;
        synchronized (AbstractC0416.class) {
            if (f1181 == null) {
                JSONObject jSONObject2 = new JSONObject();
                f1181 = jSONObject2;
                try {
                    jSONObject2.put(f1199, -1);
                    f1181.put(f1198, -1);
                } catch (JSONException unused) {
                }
            }
            jSONObject = f1181;
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m238(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            JSONObject m237 = m237();
            m237.put(f1199, i2);
            m237.put(f1198, i);
        } catch (Throwable th) {
            String str = f1206;
            AbstractC0420.m252(str, str, StringFog.decrypt("ajJYUAXaXeZbNENRENpd4F0lT1FXiUf5Sg==\n", "L0AqP3f6LoM=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m241(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(StringFog.decrypt("Ty0f+zStFzE=\n", "Lk5rkkLEY0g=\n"));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(f1203, memoryInfo.availMem / 1048576);
            jSONObject.put(f1202, memoryInfo.threshold / 1048576);
            boolean z = memoryInfo.lowMemory;
            if (z) {
                jSONObject.put(f1201, z);
            }
            jSONObject.put(f1200, memoryInfo.totalMem / 1048576);
        } catch (Throwable th) {
            AbstractC0420.m243(f1206, StringFog.decrypt("jWYTvfPcKiy8YAi85twgLKV7E6uhiT4or3Fb8g==\n", "yBRh0oH8TUk=\n") + th.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m242(JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (AbstractC0416.class) {
            jSONObject2 = f1180;
        }
        AbstractC0523.m348(jSONObject, AbstractC0523.m346(jSONObject2, false), false);
    }
}
