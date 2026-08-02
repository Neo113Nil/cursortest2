package com.appsflyer.internal;

import E0.C2942q;
import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFe1eSDK<Result> implements Comparable<AFe1eSDK<?>>, Callable<AFe1dSDK> {
    private static final AtomicInteger AFLogger = new AtomicInteger();

    @NonNull
    public final AFf1zSDK AFInAppEventParameterName;
    public AFe1dSDK AFInAppEventType;

    @NonNull
    public final Set<AFf1zSDK> AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    private long f57396d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f57397e;
    private final int registerClient;
    private final String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57398v;

    @NonNull
    public final Set<AFf1zSDK> valueOf;
    public volatile int values;

    public AFe1eSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFKeystoreWrapper = hashSet;
        this.valueOf = new HashSet();
        int incrementAndGet = AFLogger.incrementAndGet();
        this.registerClient = incrementAndGet;
        this.f57398v = false;
        this.values = 0;
        this.AFInAppEventParameterName = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.unregisterClient = str;
        } else {
            this.unregisterClient = String.valueOf(incrementAndGet);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1eSDK<?> aFe1eSDK) {
        int i11 = this.AFInAppEventParameterName.afLogForce - aFe1eSDK.AFInAppEventParameterName.afLogForce;
        if (i11 != 0) {
            return i11;
        }
        if (this.unregisterClient.equals(aFe1eSDK.unregisterClient)) {
            return 0;
        }
        return this.registerClient - aFe1eSDK.registerClient;
    }

    protected abstract boolean AFInAppEventParameterName();

    protected abstract long AFInAppEventType();

    protected void AFInAppEventType(Throwable th2) {
    }

    protected void AFKeystoreWrapper() {
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public final AFe1dSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.AFInAppEventType = null;
        this.f57397e = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.values++;
        try {
            AFe1dSDK values = values();
            this.AFInAppEventType = values;
            return values;
        } finally {
        }
    }

    protected final boolean d() {
        return this.f57398v;
    }

    public final Throwable e() {
        return this.f57397e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1eSDK aFe1eSDK = (AFe1eSDK) obj;
        if (this.AFInAppEventParameterName != aFe1eSDK.AFInAppEventParameterName) {
            return false;
        }
        return this.unregisterClient.equals(aFe1eSDK.unregisterClient);
    }

    public final int hashCode() {
        return this.unregisterClient.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFInAppEventParameterName);
        sb2.append("-");
        sb2.append(this.unregisterClient);
        String obj = sb2.toString();
        if (String.valueOf(this.registerClient).equals(this.unregisterClient)) {
            return obj;
        }
        StringBuilder e11 = C2942q.e(obj, "-");
        e11.append(this.registerClient);
        return e11.toString();
    }

    public void valueOf() {
        this.f57398v = true;
    }

    @NonNull
    protected abstract AFe1dSDK values() throws Exception;
}
