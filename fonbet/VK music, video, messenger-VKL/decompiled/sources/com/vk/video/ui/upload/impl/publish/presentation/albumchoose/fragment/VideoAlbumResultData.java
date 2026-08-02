package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: AlbumChooseArguments.kt */
/* loaded from: classes7.dex */
public final class VideoAlbumResultData implements Parcelable {
    public static final Parcelable.Creator<VideoAlbumResultData> CREATOR = new a();
    public final int b;
    public final String c;

    /* compiled from: AlbumChooseArguments.kt */
    public static final class a implements Parcelable.Creator<VideoAlbumResultData> {
        @Override // android.os.Parcelable.Creator
        public final VideoAlbumResultData createFromParcel(Parcel parcel) {
            return new VideoAlbumResultData(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAlbumResultData[] newArray(int i) {
            return new VideoAlbumResultData[i];
        }
    }

    public VideoAlbumResultData(int i, String str) {
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
        if (!(obj instanceof VideoAlbumResultData)) {
            return false;
        }
        VideoAlbumResultData videoAlbumResultData = (VideoAlbumResultData) obj;
        return this.b == videoAlbumResultData.b && epx.f(this.c, videoAlbumResultData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbumResultData(id=");
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
