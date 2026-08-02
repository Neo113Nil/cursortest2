package com.vk.imageloader.stat;

import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: FeedImageLoadingListener.kt */
/* loaded from: classes2.dex */
public final class Metrics {
    public int a;
    public long b;
    public long c;
    public long d;
    public MobileOfficialAppsCoreDeviceStat$NetworkInfo e;
    public String f;
    public Status g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedImageLoadingListener.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK;
        public static final Status PROCESSING_ERROR;
        public static final Status REQUEST_ERROR;
        public static final Status TIMEOUT;

        static {
            Status status = new Status("OK", 0);
            OK = status;
            Status status2 = new Status("TIMEOUT", 1);
            TIMEOUT = status2;
            Status status3 = new Status("REQUEST_ERROR", 2);
            REQUEST_ERROR = status3;
            Status status4 = new Status("PROCESSING_ERROR", 3);
            PROCESSING_ERROR = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public Metrics() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metrics)) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        return this.a == metrics.a && this.b == metrics.b && this.c == metrics.c && this.d == metrics.d && epx.f(this.e, metrics.e) && epx.f(this.f, metrics.f) && this.g == metrics.g;
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(qoy.b(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c), 31, this.d);
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.e;
        int hashCode = (a + (mobileOfficialAppsCoreDeviceStat$NetworkInfo == null ? 0 : mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Status status = this.g;
        return hashCode2 + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        return "Metrics(appearingTime=" + this.a + ", processingTime=" + this.b + ", isCache=false, responseTime=" + this.c + ", timeToFirstByte=" + this.d + ", networkInfo=" + this.e + ", imageLoadStartTime=" + this.f + ", status=" + this.g + ')';
    }

    public Metrics(int i) {
        this.a = 0;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
