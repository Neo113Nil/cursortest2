package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract class AFe1bSDK<Result> implements Comparable<AFe1bSDK<?>>, Callable<AFe1dSDK> {
    private static final AtomicInteger component2 = new AtomicInteger();
    public final Set<AFf1wSDK> AFAdRevenueData;
    private Throwable areAllFieldsValid;
    private long component1;
    private final int component3;
    private final String component4;
    public final AFf1wSDK getCurrencyIso4217Code;
    public volatile int getMediationNetwork;
    public AFe1dSDK getMonetizationNetwork;
    public final Set<AFf1wSDK> getRevenue;
    private boolean hashCode;

    protected abstract AFe1dSDK AFAdRevenueData() throws Exception;

    protected void AFAdRevenueData(Throwable th) {
    }

    protected void getCurrencyIso4217Code() {
    }

    protected abstract long getMediationNetwork();

    protected abstract boolean getMonetizationNetwork();

    public AFe1bSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.AFAdRevenueData = new HashSet();
        int incrementAndGet = component2.incrementAndGet();
        this.component3 = incrementAndGet;
        this.hashCode = false;
        this.getMediationNetwork = 0;
        this.getCurrencyIso4217Code = aFf1wSDK;
        Collections.addAll(hashSet, aFf1wSDKArr);
        if (str != null) {
            this.component4 = str;
        } else {
            this.component4 = String.valueOf(incrementAndGet);
        }
    }

    public void getRevenue() {
        this.hashCode = true;
    }

    protected final boolean component2() {
        return this.hashCode;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1dSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.getMonetizationNetwork = null;
        this.areAllFieldsValid = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.getMediationNetwork++;
        try {
            AFe1dSDK AFAdRevenueData = AFAdRevenueData();
            this.getMonetizationNetwork = AFAdRevenueData;
            return AFAdRevenueData;
        } finally {
        }
    }

    public final Throwable component4() {
        return this.areAllFieldsValid;
    }

    @Override // java.lang.Comparable
    /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1bSDK<?> aFe1bSDK) {
        int i = this.getCurrencyIso4217Code.d - aFe1bSDK.getCurrencyIso4217Code.d;
        if (i != 0) {
            return i;
        }
        if (this.component4.equals(aFe1bSDK.component4)) {
            return 0;
        }
        return this.component3 - aFe1bSDK.component3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1bSDK aFe1bSDK = (AFe1bSDK) obj;
        if (this.getCurrencyIso4217Code != aFe1bSDK.getCurrencyIso4217Code) {
            return false;
        }
        return this.component4.equals(aFe1bSDK.component4);
    }

    public final int hashCode() {
        return (this.getCurrencyIso4217Code.hashCode() * 31) + this.component4.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getCurrencyIso4217Code);
        sb.append("-");
        sb.append(this.component4);
        String obj = sb.toString();
        if (String.valueOf(this.component3).equals(this.component4)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.component3);
        return sb2.toString();
    }
}
