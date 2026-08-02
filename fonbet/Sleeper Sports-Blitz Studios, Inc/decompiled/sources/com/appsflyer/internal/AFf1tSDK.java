package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.common.net.HttpHeaders;

/* loaded from: classes6.dex */
public final class AFf1tSDK extends AFf1pSDK<String> {
    private final String component3;
    private final AFj1bSDK equals;
    private final AFd1rSDK hashCode;

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFf1tSDK(AFd1kSDK aFd1kSDK, String str, AFj1bSDK aFj1bSDK) {
        super(AFf1wSDK.IMPRESSIONS, new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = str;
        this.equals = aFj1bSDK;
        this.hashCode = aFd1kSDK.getCurrencyIso4217Code();
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AFe1rSDK<String> getMonetizationNetwork(String str) {
        String obj;
        AFe1qSDK aFe1qSDK = this.component2;
        String currencyIso4217Code = this.hashCode.getCurrencyIso4217Code();
        if (AFc1rSDK.getMediationNetwork(currencyIso4217Code)) {
            obj = this.component3;
        } else {
            obj = Uri.parse(this.component3).buildUpon().appendQueryParameter("advertising_id", currencyIso4217Code).build().toString();
        }
        return aFe1qSDK.getRevenue(obj);
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1iSDK<Result> aFe1iSDK = ((AFf1pSDK) this).areAllFieldsValid;
        if (aFe1iSDK != 0) {
            int statusCode = aFe1iSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component3);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                sb2.append(this.component3);
                AFLogger.afInfoLog(sb2.toString(), false);
                String currencyIso4217Code = aFe1iSDK.getCurrencyIso4217Code(HttpHeaders.LOCATION);
                AFj1bSDK aFj1bSDK = this.equals;
                if (aFj1bSDK == null || currencyIso4217Code == null) {
                    return;
                }
                aFj1bSDK.getMediationNetwork = currencyIso4217Code;
                AFj1bSDK aFj1bSDK2 = this.equals;
                Context context = aFj1bSDK2.getRevenue.get();
                if (context != null) {
                    try {
                        if (aFj1bSDK2.getMediationNetwork != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1bSDK2.getMediationNetwork)).setFlags(268435456));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                        return;
                    }
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder("call to ");
            sb3.append(this.component3);
            sb3.append(" failed: ");
            sb3.append(statusCode);
            AFLogger.afInfoLog(sb3.toString());
        }
    }
}
