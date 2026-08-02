package com.vk.posting.presentation.video.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoAlbumParams.kt */
/* loaded from: classes5.dex */
public final class VideoAlbumParams implements Parcelable {
    public static final Parcelable.Creator<VideoAlbumParams> CREATOR = new a();
    public final int b;
    public final String c;

    /* compiled from: VideoAlbumParams.kt */
    public static final class a implements Parcelable.Creator<VideoAlbumParams> {
        @Override // android.os.Parcelable.Creator
        public final VideoAlbumParams createFromParcel(Parcel parcel) {
            return new VideoAlbumParams(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAlbumParams[] newArray(int i) {
            return new VideoAlbumParams[i];
        }
    }

    public VideoAlbumParams(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAlbumParams)) {
            return false;
        }
        VideoAlbumParams videoAlbumParams = (VideoAlbumParams) obj;
        return this.b == videoAlbumParams.b && epx.f(this.c, videoAlbumParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbumParams(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
