package com.vk.video.ui.upload.impl.videoviewer.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoViewerArguments.kt */
/* loaded from: classes7.dex */
public final class VideoViewerResult implements Parcelable {
    public static final Parcelable.Creator<VideoViewerResult> CREATOR = new a();
    public final String b;

    /* compiled from: VideoViewerArguments.kt */
    public static final class a implements Parcelable.Creator<VideoViewerResult> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewerResult createFromParcel(Parcel parcel) {
            return new VideoViewerResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewerResult[] newArray(int i) {
            return new VideoViewerResult[i];
        }
    }

    public VideoViewerResult(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoViewerResult) && epx.f(this.b, ((VideoViewerResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoViewerResult(videoId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
