package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class AFe1nSDK {
    public final String AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private final boolean component1;
    private final byte[] component2;
    private boolean component3;
    public int component4;
    final Map<String, String> getCurrencyIso4217Code;
    public boolean getMediationNetwork;
    public boolean getMonetizationNetwork;
    final String getRevenue;

    public AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.component3 = true;
        this.getMediationNetwork = false;
        this.getMonetizationNetwork = true;
        this.component4 = -1;
        this.AFAdRevenueData = str;
        this.component2 = bArr;
        this.getRevenue = str2;
        this.getCurrencyIso4217Code = map;
        this.areAllFieldsValid = z;
        this.component1 = true;
    }

    public AFe1nSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] getMonetizationNetwork() {
        return this.component2;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid;
    }

    public final boolean getRevenue() {
        return this.component3;
    }

    public final boolean AFAdRevenueData() {
        return this.getMediationNetwork;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component1;
    }

    public final boolean areAllFieldsValid() {
        return this.getMonetizationNetwork;
    }
}
