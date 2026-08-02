package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFf1sSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1cSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes6.dex */
public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map<String, String> copydefault = new HashMap();
    private String getCurrencyIso4217Code;
    private String getMediationNetwork;
    private final String getMonetizationNetwork;
    String getRevenue;
    private String hashCode;
    private String toString;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.getMonetizationNetwork = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.hashCode = str;
        return this;
    }

    public String getBrandDomain() {
        return this.hashCode;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.toString = str;
        return this;
    }

    public String getChannel() {
        return this.getMediationNetwork;
    }

    public LinkGenerator setChannel(String str) {
        this.getMediationNetwork = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component1 = str;
        return this;
    }

    public String getMediaSource() {
        return this.getMonetizationNetwork;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copydefault);
    }

    public String getCampaign() {
        return this.getCurrencyIso4217Code;
    }

    public LinkGenerator setCampaign(String str) {
        this.getCurrencyIso4217Code = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copydefault.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copydefault.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFAdRevenueData = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFAdRevenueData = String.format("https://%s/%s", str2, str);
        return this;
    }

    private Map<String, String> getRevenue() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.getMonetizationNetwork);
        String str = this.component3;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.getMediationNetwork;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component1;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getCurrencyIso4217Code;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.component2;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.component4;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.toString != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.toString);
            String str7 = this.areAllFieldsValid;
            if (str7 != null) {
                this.areAllFieldsValid = str7.replaceFirst("^[/]", "");
                sb.append(this.toString.endsWith("/") ? "" : "/");
                sb.append(this.areAllFieldsValid);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.copydefault.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1gSDK.getMonetizationNetwork(hashMap);
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFAdRevenueData;
        if (str != null && str.startsWith("http")) {
            sb.append(this.AFAdRevenueData);
        } else {
            sb.append(String.format(AFj1cSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        }
        if (this.getRevenue != null) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(this.getRevenue);
        }
        Map<String, String> revenue = getRevenue();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : revenue.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append(Typography.amp);
            }
            sb2.append(entry.getKey());
            sb2.append(SignatureVisitor.INSTANCEOF);
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.hashCode;
        Map<String, String> revenue = getRevenue();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1rSDK.getRevenue().getRevenue(context);
        AFd1kSDK currencyIso4217Code = AFb1rSDK.getRevenue().getCurrencyIso4217Code();
        AFf1sSDK aFf1sSDK = new AFf1sSDK(currencyIso4217Code, UUID.randomUUID(), string, revenue, str, responseListener, this);
        AFf1zSDK copydefault = currencyIso4217Code.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1sSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.4
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
