package com.appsflyer.share;

import G.g;
import Sh.b;
import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.AFj1vSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    private String AFInAppEventType;
    private final String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> afInfoLog = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private String f57537d;

    /* renamed from: e, reason: collision with root package name */
    private String f57538e;

    /* renamed from: i, reason: collision with root package name */
    private String f57539i;
    private String registerClient;
    private String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f57540v;
    private String valueOf;
    String values;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFKeystoreWrapper = str;
    }

    private Map<String, String> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.AFKeystoreWrapper);
        String str = this.unregisterClient;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.registerClient;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.f57537d;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.AFLogger;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.f57539i != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f57539i);
            String str7 = this.f57538e;
            if (str7 != null) {
                this.f57538e = str7.replaceFirst("^[/]", "");
                sb2.append(this.f57539i.endsWith("/") ? "" : "/");
                sb2.append(this.f57538e);
            }
            hashMap.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.afInfoLog.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1hSDK.AFInAppEventParameterName(hashMap);
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
        StringBuilder sb2 = new StringBuilder();
        String str = this.values;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFj1vSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
        } else {
            sb2.append(this.values);
        }
        if (this.AFInAppEventParameterName != null) {
            sb2.append('/');
            sb2.append(this.AFInAppEventParameterName);
        }
        Map<String, String> AFKeystoreWrapper = AFKeystoreWrapper();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFKeystoreWrapper.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.f57540v;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.AFInAppEventType;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afInfoLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f57539i = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.values = b.c("https://", g.c(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFb1tSDK.valueOf().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.values = b.c("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f57540v = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f57538e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f57537d = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.unregisterClient = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.f57540v;
        Map<String, String> AFKeystoreWrapper = AFKeystoreWrapper();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1tSDK.valueOf().AFInAppEventParameterName(context);
        AFd1mSDK values = AFb1tSDK.valueOf().values();
        AFf1uSDK aFf1uSDK = new AFf1uSDK(values, UUID.randomUUID(), string, AFKeystoreWrapper, str, responseListener, this);
        AFe1fSDK afInfoLog = values.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1uSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.3
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
