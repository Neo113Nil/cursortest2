package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData;
import defpackage.a70;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.mz1;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ActivityMonitorData extends ActivityMonitorData {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final BoundingRectData nativeViewBounds;
    private final boolean nativeViewHidden;
    private final BoundingRectData nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder implements ActivityMonitorData.Builder {
        private String appState;
        private String eventId;
        private long nativeTime;
        private BoundingRectData nativeViewBounds;
        private boolean nativeViewHidden;
        private BoundingRectData nativeViewVisibleBounds;
        private double nativeVolume;
        private String queryId;
        private byte set$0;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder appState(String str) {
            if (str != null) {
                this.appState = str;
                return this;
            }
            yhk.s("Null appState");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData build() {
            String str;
            String str2;
            String str3;
            BoundingRectData boundingRectData;
            BoundingRectData boundingRectData2;
            if (this.set$0 == 7 && (str = this.queryId) != null && (str2 = this.eventId) != null && (str3 = this.appState) != null && (boundingRectData = this.nativeViewBounds) != null && (boundingRectData2 = this.nativeViewVisibleBounds) != null) {
                return new AutoValue_ActivityMonitorData(str, str2, str3, this.nativeTime, this.nativeVolume, this.nativeViewHidden, boundingRectData, boundingRectData2, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.queryId == null) {
                sb.append(" queryId");
            }
            if (this.eventId == null) {
                sb.append(" eventId");
            }
            if (this.appState == null) {
                sb.append(" appState");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" nativeTime");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" nativeVolume");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" nativeViewHidden");
            }
            if (this.nativeViewBounds == null) {
                sb.append(" nativeViewBounds");
            }
            if (this.nativeViewVisibleBounds == null) {
                sb.append(" nativeViewVisibleBounds");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder eventId(String str) {
            if (str != null) {
                this.eventId = str;
                return this;
            }
            yhk.s("Null eventId");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder nativeTime(long j) {
            this.nativeTime = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder nativeViewBounds(BoundingRectData boundingRectData) {
            if (boundingRectData != null) {
                this.nativeViewBounds = boundingRectData;
                return this;
            }
            yhk.s("Null nativeViewBounds");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder nativeViewHidden(boolean z) {
            this.nativeViewHidden = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder nativeViewVisibleBounds(BoundingRectData boundingRectData) {
            if (boundingRectData != null) {
                this.nativeViewVisibleBounds = boundingRectData;
                return this;
            }
            yhk.s("Null nativeViewVisibleBounds");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder nativeVolume(double d) {
            this.nativeVolume = d;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData.Builder
        public ActivityMonitorData.Builder queryId(String str) {
            if (str != null) {
                this.queryId = str;
                return this;
            }
            yhk.s("Null queryId");
            return null;
        }
    }

    private AutoValue_ActivityMonitorData(String str, String str2, String str3, long j, double d, boolean z, BoundingRectData boundingRectData, BoundingRectData boundingRectData2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d;
        this.nativeViewHidden = z;
        this.nativeViewBounds = boundingRectData;
        this.nativeViewVisibleBounds = boundingRectData2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActivityMonitorData) {
            ActivityMonitorData activityMonitorData = (ActivityMonitorData) obj;
            if (this.queryId.equals(activityMonitorData.queryId()) && this.eventId.equals(activityMonitorData.eventId()) && this.appState.equals(activityMonitorData.appState()) && this.nativeTime == activityMonitorData.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(activityMonitorData.nativeVolume()) && this.nativeViewHidden == activityMonitorData.nativeViewHidden() && this.nativeViewBounds.equals(activityMonitorData.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(activityMonitorData.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode = ((((this.queryId.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003) ^ this.appState.hashCode();
        long doubleToLongBits = (Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume);
        int i = true != this.nativeViewHidden ? 1237 : 1231;
        long j = this.nativeTime;
        return this.nativeViewVisibleBounds.hashCode() ^ (((((((((hashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) doubleToLongBits)) * 1000003) ^ i) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public BoundingRectData nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public BoundingRectData nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        BoundingRectData boundingRectData = this.nativeViewVisibleBounds;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(boundingRectData);
        String str = this.queryId;
        int length = String.valueOf(str).length();
        String str2 = this.eventId;
        int length2 = String.valueOf(str2).length();
        String str3 = this.appState;
        int length3 = String.valueOf(str3).length();
        long j = this.nativeTime;
        int length4 = String.valueOf(j).length();
        double d = this.nativeVolume;
        int length5 = String.valueOf(d).length();
        boolean z = this.nativeViewHidden;
        int length6 = String.valueOf(z).length();
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + length3 + 13 + length4 + 15 + length5 + 19 + length6 + 19 + valueOf.length() + 26 + valueOf2.length() + 1);
        bf3.v(sb, "ActivityMonitorData{queryId=", str, ", eventId=", str2);
        wt3.A(", appState=", str3, sb, ", nativeTime=");
        sb.append(j);
        fn0.A(sb, ", nativeVolume=", d, ", nativeViewHidden=");
        sb.append(z);
        sb.append(", nativeViewBounds=");
        sb.append(valueOf);
        sb.append(", nativeViewVisibleBounds=");
        return mz1.o(sb, valueOf2, "}");
    }

    public /* synthetic */ AutoValue_ActivityMonitorData(String str, String str2, String str3, long j, double d, boolean z, BoundingRectData boundingRectData, BoundingRectData boundingRectData2, byte[] bArr) {
        this(str, str2, str3, j, d, z, boundingRectData, boundingRectData2);
    }
}
