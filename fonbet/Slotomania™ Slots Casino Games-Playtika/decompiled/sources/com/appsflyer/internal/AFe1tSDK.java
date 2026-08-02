package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public abstract class AFe1tSDK<Result> implements Comparable<AFe1tSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component3 = new AtomicInteger();
    public final Set<AFe1uSDK> AFAdRevenueData;
    private final int areAllFieldsValid;
    private Throwable component1;
    private final String component2;
    private long component4;
    private boolean equals;
    public volatile int getCurrencyIso4217Code;
    public AFe1rSDK getMediationNetwork;
    public final AFe1uSDK getMonetizationNetwork;
    public final Set<AFe1uSDK> getRevenue;

    protected abstract AFe1rSDK AFAdRevenueData() throws Exception;

    public void getCurrencyIso4217Code() {
    }

    protected void getMonetizationNetwork(Throwable th) {
    }

    protected abstract boolean getMonetizationNetwork();

    protected abstract long getRevenue();

    public AFe1tSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFAdRevenueData = hashSet;
        this.getRevenue = new HashSet();
        int incrementAndGet = component3.incrementAndGet();
        this.areAllFieldsValid = incrementAndGet;
        this.equals = false;
        this.getCurrencyIso4217Code = 0;
        this.getMonetizationNetwork = aFe1uSDK;
        Collections.addAll(hashSet, aFe1uSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(incrementAndGet);
        }
    }

    public void getMediationNetwork() {
        this.equals = true;
    }

    protected final boolean areAllFieldsValid() {
        return this.equals;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component4, reason: merged with bridge method [inline-methods] */
    public final AFe1rSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.getMediationNetwork = null;
        this.component1 = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.getCurrencyIso4217Code++;
        try {
            AFe1rSDK AFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = AFAdRevenueData;
            return AFAdRevenueData;
        } finally {
        }
    }

    public final Throwable component3() {
        return this.component1;
    }

    @Override // java.lang.Comparable
    /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1tSDK<?> aFe1tSDK) {
        int i = this.getMonetizationNetwork.w - aFe1tSDK.getMonetizationNetwork.w;
        if (i != 0) {
            return i;
        }
        if (this.component2.equals(aFe1tSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1tSDK.areAllFieldsValid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1tSDK aFe1tSDK = (AFe1tSDK) obj;
        if (this.getMonetizationNetwork != aFe1tSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1tSDK.component2);
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component2.hashCode();
    }

    public String toString() {
        String obj = new StringBuilder().append(this.getMonetizationNetwork).append("-").append(this.component2).toString();
        return !String.valueOf(this.areAllFieldsValid).equals(this.component2) ? new StringBuilder().append(obj).append("-").append(this.areAllFieldsValid).toString() : obj;
    }
}
