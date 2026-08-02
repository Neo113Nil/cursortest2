package com.vk.video.recast.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ojp0;

/* compiled from: PlaybackSnapshot.kt */
/* loaded from: classes6.dex */
public interface PlaybackSnapshot extends Parcelable {

    /* compiled from: PlaybackSnapshot.kt */
    public static final class AdsState implements PlaybackSnapshot {
        public static final Parcelable.Creator<AdsState> CREATOR = new a();
        public final double b;
        public final Buffer c;
        public final double d;

        /* compiled from: PlaybackSnapshot.kt */
        public static final class a implements Parcelable.Creator<AdsState> {
            @Override // android.os.Parcelable.Creator
            public final AdsState createFromParcel(Parcel parcel) {
                return new AdsState(parcel.readDouble(), Buffer.CREATOR.createFromParcel(parcel), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final AdsState[] newArray(int i) {
                return new AdsState[i];
            }
        }

        public AdsState(double d, Buffer buffer, double d2) {
            this.b = d;
            this.c = buffer;
            this.d = d2;
        }

        public final double d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsState)) {
                return false;
            }
            AdsState adsState = (AdsState) obj;
            return Double.compare(this.b, adsState.b) == 0 && epx.f(this.c, adsState.c) && Double.compare(this.d, adsState.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + ((this.c.hashCode() + (Double.hashCode(this.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdsState(currentTime=");
            sb.append(this.b);
            sb.append(", buffer=");
            sb.append(this.c);
            sb.append(", duration=");
            return ojp0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.b);
            this.c.writeToParcel(parcel, i);
            parcel.writeDouble(this.d);
        }
    }
}
