package com.vk.media.pipeline.model.source.picture;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vu5;

/* compiled from: ImageFileMediaSource.kt */
/* loaded from: classes3.dex */
public final class ImageFileMediaSource implements ImageMediaSource, Parcelable {
    public static final Parcelable.Creator<ImageFileMediaSource> CREATOR = new a();
    public final Uri b;
    public final int c;

    /* compiled from: ImageFileMediaSource.kt */
    public static final class a implements Parcelable.Creator<ImageFileMediaSource> {
        @Override // android.os.Parcelable.Creator
        public final ImageFileMediaSource createFromParcel(Parcel parcel) {
            return new ImageFileMediaSource((Uri) parcel.readParcelable(ImageFileMediaSource.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageFileMediaSource[] newArray(int i) {
            return new ImageFileMediaSource[i];
        }
    }

    public ImageFileMediaSource(Uri uri, int i) {
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
        if (!(obj instanceof ImageFileMediaSource)) {
            return false;
        }
        ImageFileMediaSource imageFileMediaSource = (ImageFileMediaSource) obj;
        return epx.f(this.b, imageFileMediaSource.b) && this.c == imageFileMediaSource.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFileMediaSource(uri=");
        sb.append(this.b);
        sb.append(", rotation=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
