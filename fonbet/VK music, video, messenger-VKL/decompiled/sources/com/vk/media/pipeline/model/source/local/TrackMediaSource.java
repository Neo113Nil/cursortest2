package com.vk.media.pipeline.model.source.local;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.source.MediaSource;
import xsna.epx;
import xsna.vu5;

/* compiled from: TrackMediaSource.kt */
/* loaded from: classes3.dex */
public final class TrackMediaSource implements MediaSource {
    public static final Parcelable.Creator<TrackMediaSource> CREATOR = new a();
    public final Uri b;
    public final int c;

    /* compiled from: TrackMediaSource.kt */
    public static final class a implements Parcelable.Creator<TrackMediaSource> {
        @Override // android.os.Parcelable.Creator
        public final TrackMediaSource createFromParcel(Parcel parcel) {
            return new TrackMediaSource((Uri) parcel.readParcelable(TrackMediaSource.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackMediaSource[] newArray(int i) {
            return new TrackMediaSource[i];
        }
    }

    public TrackMediaSource(Uri uri, int i) {
        this.b = uri;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackMediaSource)) {
            return false;
        }
        TrackMediaSource trackMediaSource = (TrackMediaSource) obj;
        return epx.f(this.b, trackMediaSource.b) && this.c == trackMediaSource.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackMediaSource(uri=");
        sb.append(this.b);
        sb.append(", track=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
