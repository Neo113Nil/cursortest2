package com.vk.video.ui.discovery.minimizable.player;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: VideoPlayerState.kt */
/* loaded from: classes7.dex */
public final class AdProgressState implements Parcelable {
    public static final Parcelable.Creator<AdProgressState> CREATOR = new a();
    public final long b;
    public final long c;

    /* compiled from: VideoPlayerState.kt */
    public static final class a implements Parcelable.Creator<AdProgressState> {
        @Override // android.os.Parcelable.Creator
        public final AdProgressState createFromParcel(Parcel parcel) {
            return new AdProgressState(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AdProgressState[] newArray(int i) {
            return new AdProgressState[i];
        }
    }

    public AdProgressState(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdProgressState)) {
            return false;
        }
        AdProgressState adProgressState = (AdProgressState) obj;
        return this.b == adProgressState.b && this.c == adProgressState.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdProgressState(position=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
