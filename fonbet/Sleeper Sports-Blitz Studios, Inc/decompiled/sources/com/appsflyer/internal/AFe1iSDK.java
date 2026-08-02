package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class AFe1iSDK<Body> implements ResponseNetwork<Body> {
    final Map<String, List<String>> AFAdRevenueData;
    private final Body getCurrencyIso4217Code;
    final boolean getMediationNetwork;
    public final AFe1mSDK getMonetizationNetwork;
    final int getRevenue;

    public AFe1iSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFe1mSDK aFe1mSDK) {
        this.getCurrencyIso4217Code = body;
        this.getRevenue = i;
        this.getMediationNetwork = z;
        this.AFAdRevenueData = new HashMap(map);
        this.getMonetizationNetwork = aFe1mSDK;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.AFAdRevenueData.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFAdRevenueData.get(str2);
            }
        }
        return null;
    }

    public final String getCurrencyIso4217Code(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1iSDK aFe1iSDK = (AFe1iSDK) obj;
        if (this.getRevenue == aFe1iSDK.getRevenue && this.getMediationNetwork == aFe1iSDK.getMediationNetwork && this.getCurrencyIso4217Code.equals(aFe1iSDK.getCurrencyIso4217Code) && this.AFAdRevenueData.equals(aFe1iSDK.AFAdRevenueData)) {
            return this.getMonetizationNetwork.equals(aFe1iSDK.getMonetizationNetwork);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.getCurrencyIso4217Code.hashCode() * 31) + this.getRevenue) * 31) + (this.getMediationNetwork ? 1 : 0)) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMonetizationNetwork.hashCode();
    }
}
