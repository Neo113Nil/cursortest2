package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ҭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C0412 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1174 = StringFog.decrypt("rVs48Yo1X5iVbQz1njxFmKtaB+GZOEKDng==\n", "7D9phOtZNuw=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long f1175;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0931 f1176;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1177;

    public C0412(Context context, C0931 c0931, long j) {
        this.f1177 = context;
        this.f1176 = c0931;
        this.f1175 = j;
        new C0682(context);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public JSONObject mo234(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject m346 = AbstractC0523.m346(jSONObject, false);
        if (!TextUtils.isEmpty(this.f1176.f3119)) {
            m346.put(StringFog.decrypt("lOmoU/QD\n", "9ZnYGJF6u+c=\n"), this.f1176.f3119);
        } else if (!TextUtils.isEmpty(this.f1176.f3118)) {
            m346.put(StringFog.decrypt("DCv7\n", "a2KfIpowzWw=\n"), this.f1176.f3118);
        }
        String str3 = this.f1176.f3115;
        if (!TextUtils.isEmpty(str3)) {
            m346.put(StringFog.decrypt("QEk60Q==\n", "KTpIsttblL4=\n"), str3);
        }
        if (z2) {
            if (this.f1175 > 0) {
                m346.put(StringFog.decrypt("/inVtg==\n", "kkqhxbOSb/0=\n"), this.f1175);
            }
            m346.put(StringFog.decrypt("R7t1P3Q=\n", "JNQFTxUHYFs=\n"), this.f1176.f3114);
            m346.put(StringFog.decrypt("7DC9\n", "iFnJBtHYV2g=\n"), this.f1176.f3113);
            String decrypt = StringFog.decrypt("Hx2B\n", "anTlaVuquNw=\n");
            C0931 c0931 = this.f1176;
            synchronized (c0931) {
                str = c0931.f3117;
            }
            m346.put(decrypt, str);
            m346.put(StringFog.decrypt("qXc=\n", "3BRiLQMWgrg=\n"), this.f1176.f3116);
            m346.put(StringFog.decrypt("nXQ=\n", "6Q4BKVCFiDE=\n"), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            m346.put(StringFog.decrypt("j0fabc4=\n", "+zeMCLwUEU4=\n"), IronSourceAdQuality.getSDKVersion());
            String decrypt2 = StringFog.decrypt("Tg==\n", "Oj0oHrwKF2A=\n");
            String str4 = AbstractC0598.f1969;
            try {
                try {
                    Class.forName(StringFog.decrypt("yJypY0nxZ2XSwKBjTPNvaM6B6hhS9npo+5+lNFnt\n", "q/PETTyfDhE=\n"));
                    str2 = AbstractC0598.f1963;
                } catch (ClassNotFoundException unused) {
                    Class.forName(StringFog.decrypt("NFgBxjnoQdgkWBmaM/8A1zNGGYk881rPJFMHxiP+RZg2Xh7GA/VB2ztWOJox+UvUNlQHrSjuS9gk\nXgOG\n", "Vzds6FCaLrY=\n"));
                    str2 = AbstractC0598.f1962;
                }
            } catch (ClassNotFoundException unused2) {
                str2 = AbstractC0598.f1961;
            }
            m346.put(decrypt2, str2);
            m346.put(StringFog.decrypt("Hoba6f4=\n", "c+m+jJLxGvE=\n"), Build.MODEL);
            m346.put(StringFog.decrypt("6RCv3HlVbL3xA6Tb\n", "hHHBqR80D8k=\n"), Build.MANUFACTURER);
            m346.put(StringFog.decrypt("G5xptLkWVaA=\n", "a/AIwN95J80=\n"), StringFog.decrypt("psTlX5km+g==\n", "x6qBLfZPnpc=\n"));
            String decrypt3 = StringFog.decrypt("Ptjp\n", "UaufZXA9ZB0=\n");
            String str5 = AbstractC0416.f1206;
            m346.put(decrypt3, Build.VERSION.RELEASE);
            AbstractC0598.m378(this.f1177, m346);
            Context context = this.f1177;
            try {
                if (context.checkCallingOrSelfPermission(StringFog.decrypt("xxGMXfdfNc3WGppC8UUiiskRxm7bdRSw9SC/Zt5/DrDyPrxq\n", "pn/oL5g2UeM=\n")) == 0) {
                    WifiInfo connectionInfo = ((WifiManager) context.getSystemService(StringFog.decrypt("L6RAxw==\n", "WM0mrq+Nrc8=\n"))).getConnectionInfo();
                    m346.put(AbstractC0416.f1196, connectionInfo.getSupplicantState());
                    if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                        m346.put(AbstractC0416.f1195, connectionInfo.getRssi());
                        m346.put(AbstractC0416.f1194, connectionInfo.getLinkSpeed());
                    }
                }
            } catch (Throwable th) {
                String str6 = AbstractC0416.f1206;
                AbstractC0420.m252(str6, str6, StringFog.decrypt("GOoPuUZiUEg58ROxFDVYSjS4FLhSLRFYMrgYoFEsRQ==\n", "XZh91jRCMSw=\n"), th, null, false);
            }
            Context context2 = this.f1177;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(StringFog.decrypt("iIhWgIEx7RGdjkyX\n", "6+c47uRSmXg=\n"));
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService(StringFog.decrypt("yNs+Z/4=\n", "uLNRCZuD8Ew=\n"));
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null) {
                    m346.put(AbstractC0416.f1193, networkInfo.getState());
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        m346.put(AbstractC0416.f1192, networkInfo.getType());
                        m346.put(AbstractC0416.f1191, networkInfo.getTypeName());
                        m346.put(AbstractC0416.f1190, networkInfo.getSubtype());
                        m346.put(AbstractC0416.f1189, networkInfo.getSubtypeName());
                        m346.put(AbstractC0416.f1188, telephonyManager.getNetworkOperator());
                        m346.put(AbstractC0416.f1187, telephonyManager.getNetworkOperatorName());
                        m346.put(AbstractC0416.f1186, telephonyManager.getNetworkCountryIso());
                        if (z3) {
                            m346.put(AbstractC0416.f1185, telephonyManager.getSimOperator());
                            m346.put(AbstractC0416.f1184, telephonyManager.getSimOperatorName());
                        }
                    }
                }
            } catch (Throwable th2) {
                String str7 = AbstractC0416.f1206;
                AbstractC0420.m252(str7, str7, StringFog.decrypt("XIs+R2pb6Gh9kCJPOBbmbnCVKQhxFe9jOY0jCH0N7GJt\n", "GflMKBh7iQw=\n"), th2, null, false);
            }
            AbstractC0416.m242(m346);
            AbstractC0416.m236(m346);
            m346.put(StringFog.decrypt("3PGwWg==\n", "sobRLG3l65U=\n"), z);
            AbstractC0416.m241(this.f1177, m346);
            try {
                m346.put(AbstractC0416.f1197, AbstractC0523.m346(AbstractC0416.m237(), false));
            } catch (JSONException unused3) {
            }
            try {
                JSONObject jSONObject2 = new JSONObject(this.f1176.f3112);
                jSONObject2.remove(StringFog.decrypt("gayp24B6rKO/qrTriw==\n", "4MjYhOkUxdc=\n"));
                jSONObject2.remove(StringFog.decrypt("Fse8UnTQxwIQz7dPdNfNGgbI\n", "Y6bYISujonE=\n"));
                if (jSONObject2.length() > 0) {
                    m346.putOpt(StringFog.decrypt("lWxPLw==\n", "+BgrWxd5H5Q=\n"), jSONObject2);
                }
            } catch (Exception e) {
                String str8 = f1174;
                AbstractC0420.m252(str8, str8, StringFog.decrypt("z863vDXntsvu1au0Z6qy2+ucobIzpvfF+dOr8zOo98r82aun\n", "irzF00fH168=\n"), e, null, false);
            }
        }
        return m346;
    }
}
