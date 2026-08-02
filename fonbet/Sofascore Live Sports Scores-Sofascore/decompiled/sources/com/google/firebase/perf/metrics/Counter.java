package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wd;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new wd(9);
    public final String a;
    public final AtomicLong b;

    public Counter(Parcel parcel) {
        this.a = parcel.readString();
        this.b = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.get());
    }

    public Counter(String str) {
        this.a = str;
        this.b = new AtomicLong(0L);
    }
}
