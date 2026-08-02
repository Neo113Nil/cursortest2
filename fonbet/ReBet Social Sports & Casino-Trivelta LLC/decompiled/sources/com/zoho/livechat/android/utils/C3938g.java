package com.zoho.livechat.android.utils;

import android.content.SharedPreferences;
import com.facebook.hermes.intl.Constants;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import rd.C6218a;

/* renamed from: com.zoho.livechat.android.utils.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3938g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f44540a;

    /* renamed from: b, reason: collision with root package name */
    public String f44541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44542c;

    public C3938g(String str, String str2, boolean z10) {
        this.f44540a = str;
        this.f44541b = str2;
        this.f44542c = z10;
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append("&");
            }
            sb2.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb2.append("=");
            sb2.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb2.toString();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            SharedPreferences M10 = C6218a.M();
            HttpsURLConnection e10 = sd.d.e(Yd.a.g("%1$s/resetbadgecount.sdk", LiveChatUtil.getScreenName()));
            e10.setReadTimeout(15000);
            e10.setConnectTimeout(15000);
            e10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            e10.setDoInput(true);
            e10.setDoOutput(true);
            String d10 = MobilistenUtil.d();
            String c10 = MobilistenUtil.c();
            e10.addRequestProperty("x-appkey", d10);
            e10.addRequestProperty("x-accesskey", c10);
            e10.addRequestProperty("x-bundleid", MobilistenUtil.g());
            HashMap hashMap = new HashMap();
            hashMap.put("_zldp", M10.getString("zldp", null));
            hashMap.put("os", "2");
            hashMap.put("groupid", this.f44540a);
            hashMap.put("wmsid", M10.getString("annonid", null));
            if (this.f44542c) {
                hashMap.put("isread", "true");
            } else {
                hashMap.put("isread", Constants.CASEFIRST_FALSE);
            }
            String str = this.f44541b;
            if (str != null) {
                hashMap.put("timeuuid", str);
            }
            e10.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            e10.setRequestProperty("Content-Length", Integer.toString(a(hashMap).getBytes().length));
            og.i.v(e10.getOutputStream(), hashMap);
            if (e10.getResponseCode() == 200) {
                if (this.f44541b != null) {
                    com.zoho.livechat.android.provider.a.INSTANCE.delete(MobilistenInitProvider.k().getContentResolver(), b.c.f44270a, "TIMEUID=?", new String[]{this.f44541b});
                } else {
                    com.zoho.livechat.android.provider.a.INSTANCE.delete(MobilistenInitProvider.k().getContentResolver(), b.c.f44270a, "TYPE=?", new String[]{"1477"});
                }
            }
        } catch (Exception unused) {
        }
    }
}
