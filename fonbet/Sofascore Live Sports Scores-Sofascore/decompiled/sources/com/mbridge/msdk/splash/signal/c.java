package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static String a = "SplashSignalUtils";
    private static int b = 0;
    private static int c = 1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ CampaignEx a;

        public a(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j a = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (a != null) {
                    if (a.a(this.a.getId())) {
                        a.b(this.a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.a.getId());
                        gVar.b(this.a.getFca());
                        gVar.c(this.a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        a.b(gVar);
                    }
                }
                c.b(this.a.getCampaignUnitId(), this.a);
            } catch (Throwable th) {
                q0.b(c.a, th.getMessage(), th);
            }
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        int i;
        boolean z;
        String str2;
        File file;
        String str3 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                q0.a(a, e.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
                JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
                if (jSONArray2 == null || jSONArray2.length() <= 0) {
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e2) {
                        q0.a(a, e2.getMessage());
                        return;
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray2.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    String optString = jSONObject3.optString("ref", str3);
                    int i4 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i4 != i2 || TextUtils.isEmpty(optString)) {
                        str = str3;
                        jSONArray = jSONArray2;
                        i = length;
                        z = false;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(optString) == null ? str : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th) {
                                if (MBridgeConstans.DEBUG) {
                                    th.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                q0.a(a, "getFileInfo Mraid file " + optString);
                                str2 = "file:////" + optString;
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 3);
                                jSONObject6.put("path", str2);
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray3.put(jSONObject4);
                            }
                            str2 = str;
                            JSONObject jSONObject62 = new JSONObject();
                            jSONObject62.put("type", 3);
                            jSONObject62.put("path", str2);
                            jSONObject4.put(optString, jSONObject62);
                            jSONArray3.put(jSONObject4);
                        } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", u0.a(optString) == null ? str : u0.a(optString));
                            jSONObject4.put(optString, jSONObject7);
                            jSONArray3.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        m b2 = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(optString);
                        if (b2 != null) {
                            jSONArray = jSONArray2;
                            q0.a(a, "VideoBean not null");
                            jSONObject8.put("type", 1);
                            jSONObject8.put("videoDataLength", b2.d());
                            String e3 = b2.e();
                            if (TextUtils.isEmpty(e3)) {
                                i = length;
                                q0.a(a, "VideoPath null");
                                jSONObject8.put("path", str3);
                                jSONObject8.put("path4Web", str3);
                                str = str3;
                            } else {
                                i = length;
                                str = str3;
                                q0.a(a, "VideoPath not null");
                                jSONObject8.put("path", e3);
                                jSONObject8.put("path4Web", e3);
                            }
                            if (b2.b() == 5) {
                                jSONObject8.put("downloaded", 1);
                                z = false;
                            } else {
                                z = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str = str3;
                            jSONArray = jSONArray2;
                            i = length;
                            z = false;
                            q0.a(a, "VideoBean null");
                        }
                    }
                    i3++;
                    jSONArray2 = jSONArray;
                    length = i;
                    str3 = str;
                    i2 = 1;
                }
                jSONObject2.put("resource", jSONArray3);
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (Throwable th2) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e4) {
            q0.a(a, e4.getMessage());
            return;
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            a(obj, e.getMessage());
            q0.a(a, e.getMessage());
        }
    }

    public static void b(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(parseCampaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "splash");
    }

    public static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b(a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            q0.a(a, e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        q0.b(a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
