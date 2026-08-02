package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class AFh1mSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public int component4;
    public String copydefault;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public final Map<String, String> getMediationNetwork;
    public String getMonetizationNetwork;
    public Map<String, Object> getRevenue;
    private final boolean hashCode;
    private byte[] toString;

    public AFh1mSDK() {
        this(null, null, null);
    }

    public abstract AFe1pSDK AFAdRevenueData();

    public final AFh1mSDK AFAdRevenueData(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component1() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.hashCode;
    }

    public boolean getMediationNetwork() {
        return true;
    }

    public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid == null && this.component3 == null;
    }

    public AFh1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getMediationNetwork = new HashMap();
        this.areAllFieldsValid = str;
        this.component2 = str2;
        this.hashCode = bool != null ? bool.booleanValue() : true;
    }

    public static boolean getRevenue(double d10) {
        if (d10 < 0.0d || d10 >= 1.0d) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        int i5 = (int) (1.0d / d10);
        if (i5 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i5)) + 1.0d)) != i5;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFh1mSDK getMediationNetwork(byte[] bArr) {
        this.toString = bArr;
        return this;
    }

    public final AFh1mSDK AFAdRevenueData(int i5) {
        this.component4 = i5;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey("counter")) {
                    this.AFAdRevenueData.put("counter", Integer.toString(i5));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final byte[] getMonetizationNetwork() {
        return this.toString;
    }
}
