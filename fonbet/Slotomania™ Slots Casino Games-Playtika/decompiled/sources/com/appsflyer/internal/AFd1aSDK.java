package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class AFd1aSDK {
    final Map<String, String> AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private boolean component1;
    public int component2;
    private final boolean component3;
    private final byte[] component4;
    public final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    public boolean getMonetizationNetwork;
    public boolean getRevenue;

    public AFd1aSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFd1aSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.component1 = true;
        this.getRevenue = false;
        this.getMonetizationNetwork = true;
        this.component2 = -1;
        this.getCurrencyIso4217Code = str;
        this.component4 = bArr;
        this.getMediationNetwork = str2;
        this.AFAdRevenueData = map;
        this.areAllFieldsValid = z;
        this.component3 = true;
    }

    public AFd1aSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] getRevenue() {
        return this.component4;
    }

    public final boolean getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }

    public final boolean AFAdRevenueData() {
        return this.component1;
    }

    public final boolean getMediationNetwork() {
        return this.getRevenue;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component3;
    }

    public final boolean areAllFieldsValid() {
        return this.getMonetizationNetwork;
    }
}
