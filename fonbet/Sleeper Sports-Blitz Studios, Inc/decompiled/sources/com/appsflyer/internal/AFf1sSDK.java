package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AFf1sSDK extends AFf1pSDK<String> {
    private final String component3;
    private final LinkGenerator.ResponseListener copy;
    private final UUID copydefault;
    private final String equals;
    private final Map<String, String> hashCode;
    private final LinkGenerator toString;

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 3000L;
    }

    public AFf1sSDK(AFd1kSDK aFd1kSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFf1wSDK.ONELINK, new AFf1wSDK[]{AFf1wSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.copydefault = uuid;
        this.component3 = str;
        this.hashCode = new HashMap(map);
        this.copy = responseListener;
        this.equals = str2;
        this.toString = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        LinkGenerator.ResponseListener responseListener = this.copy;
        if (responseListener != null) {
            if (this.getMonetizationNetwork == AFe1dSDK.SUCCESS && ((AFf1pSDK) this).areAllFieldsValid != null) {
                responseListener.onResponse((String) ((AFf1pSDK) this).areAllFieldsValid.getBody());
                return;
            }
            Throwable component4 = component4();
            if (component4 instanceof ParsingException) {
                if (((ParsingException) component4).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.toString.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.toString.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AFe1rSDK<String> getMonetizationNetwork(String str) {
        return this.component2.getMonetizationNetwork(this.component3, this.hashCode, this.equals, this.copydefault, str);
    }
}
