package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.mz1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFe1vSDK<Result> implements Comparable<AFe1vSDK<?>>, Callable<AFd1bSDK> {
    private static final AtomicInteger force = new AtomicInteger();

    @Nullable
    public AFd1bSDK AFKeystoreWrapper;

    @NonNull
    public final Set<AFe1zSDK> AFLogger;
    private volatile int AFLoggerLogLevel;

    @NonNull
    public final AFe1zSDK d;

    @Nullable
    private Throwable e;
    private boolean i;
    private long registerClient;

    @NonNull
    public final Set<AFe1zSDK> unregisterClient;
    private final String v;
    private final int w;

    public AFe1vSDK(@NonNull AFe1zSDK aFe1zSDK, @NonNull AFe1zSDK[] aFe1zSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.unregisterClient = hashSet;
        this.AFLogger = new HashSet();
        int incrementAndGet = force.incrementAndGet();
        this.w = incrementAndGet;
        this.i = false;
        this.AFLoggerLogLevel = 0;
        this.d = aFe1zSDK;
        Collections.addAll(hashSet, aFe1zSDKArr);
        if (str != null) {
            this.v = str;
        } else {
            this.v = String.valueOf(incrementAndGet);
        }
    }

    public final int AFKeystoreWrapper() {
        return this.AFLoggerLogLevel;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1vSDK<?> aFe1vSDK) {
        int registerClient = this.d.registerClient() - aFe1vSDK.d.registerClient();
        if (registerClient != 0) {
            return registerClient;
        }
        if (this.v.equals(aFe1vSDK.v)) {
            return 0;
        }
        return this.w - aFe1vSDK.w;
    }

    public abstract boolean d();

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1vSDK aFe1vSDK = (AFe1vSDK) obj;
        if (this.d != aFe1vSDK.d) {
            return false;
        }
        return this.v.equals(aFe1vSDK.v);
    }

    @Nullable
    public final Throwable force() {
        return this.e;
    }

    public final int hashCode() {
        return this.v.hashCode() + (this.d.hashCode() * 31);
    }

    public abstract long registerClient();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append("-");
        sb.append(this.v);
        String obj = sb.toString();
        if (String.valueOf(this.w).equals(this.v)) {
            return obj;
        }
        StringBuilder r = mz1.r(obj, "-");
        r.append(this.w);
        return r.toString();
    }

    @NonNull
    public abstract AFd1bSDK unregisterClient() throws Exception;

    @Override // java.util.concurrent.Callable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AFd1bSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.AFKeystoreWrapper = null;
        this.e = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFLoggerLogLevel++;
        try {
            AFd1bSDK unregisterClient = unregisterClient();
            this.AFKeystoreWrapper = unregisterClient;
            return unregisterClient;
        } finally {
        }
    }

    public void w() {
        this.i = true;
    }

    public void AFLogger() {
    }

    public void unregisterClient(Throwable th) {
    }
}
