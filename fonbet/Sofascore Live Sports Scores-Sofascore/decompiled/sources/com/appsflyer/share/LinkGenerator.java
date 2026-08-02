package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1ySDK;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.internal.AFj1rSDK;
import com.appsflyer.internal.AFj1zSDK;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.fc6;
import defpackage.wv8;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFKeystoreWrapper;
    private String AFLogger;
    private String AFLoggerLogLevel;
    private String afErrorLog;
    private final Map<String, String> afInfoLog = new HashMap();
    String d;
    private String e;
    private String force;
    private String i;
    private final String registerClient;
    String unregisterClient;
    private String v;
    private String w;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.registerClient = str;
    }

    private Map<String, String> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.registerClient);
        String str = this.force;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.w;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFLogger;
        if (str4 != null) {
            hashMap.put(a.q, str4);
        }
        String str5 = this.v;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.e;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.AFLoggerLogLevel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AFLoggerLogLevel);
            String str7 = this.i;
            if (str7 != null) {
                this.i = str7.replaceFirst("^[/]", "");
                sb.append(this.AFLoggerLogLevel.endsWith("/") ? "" : "/");
                sb.append(this.i);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.afInfoLog.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFj1zSDK.AFKeystoreWrapper(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afInfoLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afInfoLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.d;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(Locale.US, AFj1rSDK.AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName()));
        } else {
            sb.append(this.d);
        }
        if (this.unregisterClient != null) {
            sb.append('/');
            sb.append(this.unregisterClient);
        }
        Map<String, String> d = d();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : d.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append(C4427z5.U);
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.afErrorLog;
    }

    public String getCampaign() {
        return this.AFLogger;
    }

    public String getChannel() {
        return this.AFKeystoreWrapper;
    }

    public String getMediaSource() {
        return this.registerClient;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afInfoLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.AFLoggerLogLevel = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            Locale locale = Locale.US;
            this.d = fc6.n("https://", wv8.i(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFa1zSDK.d().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        Locale locale2 = Locale.US;
        this.d = fc6.n("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.i = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.w = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.e = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.v = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.force = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String str = AFa1zSDK.d().AFKeystoreWrapper.setImeiData().AFLoggerLogLevel;
        String str2 = this.afErrorLog;
        Map<String, String> d = d();
        AFc1dSDK aFc1dSDK = AFa1zSDK.d().AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFc1dSDK aFc1dSDK2 = AFa1zSDK.d().AFKeystoreWrapper;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(aFc1dSDK2, UUID.randomUUID(), str, d, str2, responseListener, this);
        AFe1ySDK afWarnLog = aFc1dSDK2.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFe1mSDK));
    }
}
