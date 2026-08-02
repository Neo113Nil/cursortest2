package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class AFa1mSDK {
    protected final Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public int component4;
    private final boolean copy;
    public Map<String, Object> getCurrencyIso4217Code;
    public AppsFlyerRequestListener getMediationNetwork;
    public String getMonetizationNetwork;
    public String getRevenue;
    private byte[] hashCode;

    public abstract AFf1wSDK AFAdRevenueData();

    public boolean component1() {
        return true;
    }

    public boolean component2() {
        return true;
    }

    public boolean component3() {
        return true;
    }

    public boolean component4() {
        return false;
    }

    public AFa1mSDK() {
        this(null, null, null);
    }

    public AFa1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.component3 = str;
        this.component1 = str2;
        this.copy = bool != null ? bool.booleanValue() : true;
    }

    public AFa1mSDK getMonetizationNetwork(String str) {
        this.component1 = str;
        return this;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component3 == null && this.getRevenue == null;
    }

    public final AFa1mSDK getRevenue(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public final AFa1mSDK getMediationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final Map<String, Object> getMonetizationNetwork() {
        return this.AFAdRevenueData;
    }

    public final AFa1mSDK getMediationNetwork(int i) {
        this.component4 = i;
        synchronized (this.AFAdRevenueData) {
            if (this.AFAdRevenueData.containsKey("counter")) {
                this.AFAdRevenueData.put("counter", Integer.toString(i));
            }
            if (this.AFAdRevenueData.containsKey("launch_counter")) {
                this.AFAdRevenueData.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final AFa1mSDK getMediationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }

    public final byte[] getMediationNetwork() {
        return this.hashCode;
    }

    public final boolean getRevenue() {
        return this.copy;
    }

    protected static String getRevenue(String str) {
        String areAllFieldsValid = AFb1rSDK.getRevenue().getCurrencyIso4217Code().getCurrencyIso4217Code().areAllFieldsValid();
        return areAllFieldsValid != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, areAllFieldsValid).build().toString() : str;
    }

    public static boolean getCurrencyIso4217Code(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
