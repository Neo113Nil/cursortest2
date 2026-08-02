package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AFe1iSDK extends AFe1kSDK<String> {
    private final String component1;
    private final UUID copy;
    private final LinkGenerator copydefault;
    private final Map<String, String> equals;
    private final String hashCode;
    private final LinkGenerator.ResponseListener toString;

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 3000L;
    }

    public AFe1iSDK(AFc1fSDK aFc1fSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFe1uSDK.ONELINK, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, aFc1fSDK, uuid.toString());
        this.copy = uuid;
        this.component1 = str;
        this.equals = new HashMap(map);
        this.toString = responseListener;
        this.hashCode = str2;
        this.copydefault = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        LinkGenerator.ResponseListener responseListener = this.toString;
        if (responseListener != null) {
            if (this.getMediationNetwork == AFe1rSDK.SUCCESS && ((AFe1kSDK) this).component2 != null) {
                responseListener.onResponse((String) ((AFe1kSDK) this).component2.getBody());
                return;
            }
            Throwable component3 = component3();
            if (component3 instanceof ParsingException) {
                if (((ParsingException) component3).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.copydefault.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.copydefault.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        return ((AFe1kSDK) this).areAllFieldsValid.getCurrencyIso4217Code(this.component1, this.equals, this.hashCode, this.copy, str);
    }
}
