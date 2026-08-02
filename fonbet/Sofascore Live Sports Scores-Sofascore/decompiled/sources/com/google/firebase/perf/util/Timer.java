package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import defpackage.dyh;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new dyh(8);
    public long a;
    public long b;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), SystemClock.elapsedRealtimeNanos() / 1000);
    }

    public final long a() {
        return new Timer().b - this.b;
    }

    public final long b(Timer timer) {
        return timer.b - this.b;
    }

    public final void c() {
        this.a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public Timer(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
