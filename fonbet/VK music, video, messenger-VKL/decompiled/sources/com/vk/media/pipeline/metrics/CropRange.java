package com.vk.media.pipeline.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
import xsna.vu5;

/* compiled from: MetricsCalculationConfig.kt */
/* loaded from: classes3.dex */
public final class CropRange implements Parcelable {
    public static final Parcelable.Creator<CropRange> CREATOR = new a();
    public final long b;
    public final long c;
    public final long d;

    /* compiled from: MetricsCalculationConfig.kt */
    public static final class a implements Parcelable.Creator<CropRange> {
        @Override // android.os.Parcelable.Creator
        public final CropRange createFromParcel(Parcel parcel) {
            return new CropRange(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CropRange[] newArray(int i) {
            return new CropRange[i];
        }
    }

    public CropRange(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = TimeUnit.MICROSECONDS.toMillis(j2 - j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropRange)) {
            return false;
        }
        CropRange cropRange = (CropRange) obj;
        return this.b == cropRange.b && this.c == cropRange.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropRange(startMcs=");
        sb.append(this.b);
        sb.append(", endMcs=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
