package com.vk.video.recast.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.zcl;

/* compiled from: Buffer.kt */
/* loaded from: classes6.dex */
public final class Buffer implements Parcelable {
    public static final Parcelable.Creator<Buffer> CREATOR = new a();
    public final double b;
    public final double c;

    /* compiled from: Buffer.kt */
    public static final class a implements Parcelable.Creator<Buffer> {
        @Override // android.os.Parcelable.Creator
        public final Buffer createFromParcel(Parcel parcel) {
            return new Buffer(parcel.readDouble(), Position.CREATOR.createFromParcel(parcel).b, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Buffer[] newArray(int i) {
            return new Buffer[i];
        }
    }

    static {
        new Buffer(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null);
    }

    public Buffer(double d, double d2, zcl zclVar) {
        this.b = d;
        this.c = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        return Double.compare(this.b, buffer.b) == 0 && Double.compare(this.c, buffer.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Buffer(length=" + this.b + ", position=" + ((Object) ("Position(value=" + this.c + ')')) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
