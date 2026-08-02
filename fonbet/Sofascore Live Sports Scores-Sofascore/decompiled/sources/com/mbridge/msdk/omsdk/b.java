package com.mbridge.msdk.omsdk;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import com.iab.omid.library.mmadbridge.adsession.Partner;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.bf3;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    public static final String a = DomainNameUtils.VERIFICATION_URL;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            q0.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
            new h(this.b).a("", "", "", "", "fetch OM failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
            b.b(str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.omsdk.b$b, reason: collision with other inner class name */
    public class RunnableC1284b implements Runnable {
        final /* synthetic */ String a;

        public RunnableC1284b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                o0.a(this.a.getBytes(), file);
            } catch (Exception e) {
                q0.a("OMSDK", e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;

        public c(Context context) {
            this.b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            q0.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
            new h(this.b).a("", "", "", "", "fetch OM H5 failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_H5_CONTENT = str;
            b.c(str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                o0.a(this.a.getBytes(), file);
            } catch (Exception e) {
                q0.a("OMSDK", e.getMessage());
            }
        }
    }

    public static AdSession a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Context context2;
        String str7;
        Partner createPartner;
        AdSessionConfiguration createAdSessionConfiguration;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        AdSession adSession = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            q0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new h(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            try {
                a(context);
                try {
                    createPartner = Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION);
                    CreativeType creativeType = z ? CreativeType.NATIVE_DISPLAY : CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z ? Owner.NONE : owner, false);
                    context2 = context;
                    try {
                    } catch (IllegalArgumentException e) {
                        e = e;
                    } catch (Exception e2) {
                        e = e2;
                        str7 = str2;
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    context2 = context;
                }
            } catch (IllegalArgumentException e4) {
                e = e4;
                context2 = context;
            }
        } catch (Exception e5) {
            e = e5;
            context2 = context;
        }
        try {
            str7 = str2;
        } catch (IllegalArgumentException e6) {
            e = e6;
            q0.b("OMSDK", e.getMessage());
            new h(context2).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        } catch (Exception e7) {
            e = e7;
            str7 = str2;
            q0.b("OMSDK", e.getMessage());
            new h(context2).a(str7, str6, str3, str4, bf3.j(e, new StringBuilder("failed, exception ")));
            return adSession;
        }
        try {
            adSession = AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(createPartner, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context2, str2, str3, str4, str6), str5, str7));
            q0.a("OMSDK", "adSession create success");
            return adSession;
        } catch (IllegalArgumentException e8) {
            e = e8;
            q0.b("OMSDK", e.getMessage());
            new h(context2).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        } catch (Exception e9) {
            e = e9;
            q0.b("OMSDK", e.getMessage());
            new h(context2).a(str7, str6, str3, str4, bf3.j(e, new StringBuilder("failed, exception ")));
            return adSession;
        }
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new a(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e) {
                q0.b("OMSDK", e.getMessage());
            }
        }
    }

    public static void c(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new c(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e) {
                q0.b("OMSDK", e.getMessage());
            }
        }
    }

    public static String b() {
        try {
            File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            return file.exists() ? o0.e(file) : "";
        } catch (Exception e) {
            q0.a("OMSDK", e.getMessage());
            return "";
        }
    }

    public static void c(String str) {
        new Thread(new d(str)).start();
    }

    public static void b(String str) {
        new Thread(new RunnableC1284b(str)).start();
    }

    public static String a() {
        try {
            return o0.e(new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e) {
            q0.a("OMSDK", e.getMessage());
            return "";
        }
    }

    private static void a(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    private static List<VerificationScriptResource> a(String str, Context context, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        MalformedURLException malformedURLException;
        String str8;
        String str9;
        IllegalArgumentException illegalArgumentException;
        VerificationScriptResource createVerificationScriptResourceWithParameters;
        ArrayList arrayList = new ArrayList();
        try {
            try {
            } catch (JSONException e) {
                q0.b("OMSDK", e.getMessage());
                new h(context).a(str2, str5, str3, str4, "failed, exception " + e.getMessage());
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (str != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        String optString = optJSONObject.optString("vkey", "");
                        URL url = new URL(optJSONObject.optString("et_url", ""));
                        String optString2 = optJSONObject.optString("verification_p", "");
                        if (TextUtils.isEmpty(optString2)) {
                            if (TextUtils.isEmpty(optString)) {
                                createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            } else {
                                createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            }
                        } else {
                            createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(optString, url, optString2);
                        }
                        arrayList.add(createVerificationScriptResourceWithParameters);
                    }
                }
            } catch (IllegalArgumentException e2) {
                illegalArgumentException = e2;
                str8 = str2;
                str9 = str5;
                q0.b("OMSDK", illegalArgumentException.getMessage());
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                new h(context).a(str8, str9, str3, str4, "failed, exception " + illegalArgumentException2.getMessage());
                return arrayList;
            } catch (MalformedURLException e3) {
                malformedURLException = e3;
                str6 = str2;
                str7 = str5;
                q0.b("OMSDK", malformedURLException.getMessage());
                MalformedURLException malformedURLException2 = malformedURLException;
                new h(context).a(str6, str7, str3, str4, "failed, exception " + malformedURLException2.getMessage());
                return arrayList;
            }
        } catch (IllegalArgumentException e4) {
            str8 = str2;
            str9 = str5;
            illegalArgumentException = e4;
        } catch (MalformedURLException e5) {
            str6 = str2;
            str7 = str5;
            malformedURLException = e5;
        }
        return arrayList;
    }

    public static AdSession a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            return a(context, webView, (String) null, CreativeType.DEFINED_BY_JAVASCRIPT);
        }
        q0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static AdSession a(Context context, WebView webView, String str, CreativeType creativeType) {
        a(context);
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), webView, null, str));
        createAdSession.registerAdView(webView);
        return createAdSession;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", a);
    }
}
