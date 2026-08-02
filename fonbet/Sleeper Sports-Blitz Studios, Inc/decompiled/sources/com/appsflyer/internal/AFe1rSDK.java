package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class AFe1rSDK<ResponseBody> {
    private final AFe1lSDK AFAdRevenueData;
    private final ExecutorService getCurrencyIso4217Code;
    private final AtomicBoolean getMediationNetwork = new AtomicBoolean(false);
    private final AFe1kSDK<ResponseBody> getMonetizationNetwork;
    public final AFe1nSDK getRevenue;

    public AFe1rSDK(AFe1nSDK aFe1nSDK, ExecutorService executorService, AFe1lSDK aFe1lSDK, AFe1kSDK<ResponseBody> aFe1kSDK) {
        this.getRevenue = aFe1nSDK;
        this.getCurrencyIso4217Code = executorService;
        this.AFAdRevenueData = aFe1lSDK;
        this.getMonetizationNetwork = aFe1kSDK;
    }

    public final AFe1iSDK<ResponseBody> AFAdRevenueData() throws IOException {
        if (!this.getMediationNetwork.getAndSet(true)) {
            AFe1iSDK<String> monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork(this.getRevenue);
            try {
                return new AFe1iSDK<>(this.getMonetizationNetwork.AFAdRevenueData(monetizationNetwork.getBody()), monetizationNetwork.getRevenue, monetizationNetwork.getMediationNetwork, monetizationNetwork.AFAdRevenueData, monetizationNetwork.getMonetizationNetwork);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, monetizationNetwork);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
