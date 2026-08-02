package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();
    public long b;
    public long c;
    public long d;

    public class a implements Parcelable.Creator<Timer> {
        @Override // android.os.Parcelable.Creator
        public final Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Timer() {
        this(r0.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()), r0.toMicros(SystemClock.uptimeMillis()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    }

    public final long d() {
        return new Timer().c - this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e(@NonNull Timer timer) {
        return timer.c - this.c;
    }

    public final void reset() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = timeUnit.toMicros(System.currentTimeMillis());
        this.c = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
        this.d = timeUnit.toMicros(SystemClock.uptimeMillis());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    @VisibleForTesting
    public Timer(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
