package com.vk.media.pipeline.model.source.picture;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qr;

/* compiled from: ImageBitmapMediaSource.kt */
/* loaded from: classes3.dex */
public final class ImageBitmapMediaSource implements ImageMediaSource, Parcelable {
    public static final Parcelable.Creator<ImageBitmapMediaSource> CREATOR = new a();
    public final Bitmap b;

    /* compiled from: ImageBitmapMediaSource.kt */
    public static final class a implements Parcelable.Creator<ImageBitmapMediaSource> {
        @Override // android.os.Parcelable.Creator
        public final ImageBitmapMediaSource createFromParcel(Parcel parcel) {
            return new ImageBitmapMediaSource((Bitmap) parcel.readParcelable(ImageBitmapMediaSource.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageBitmapMediaSource[] newArray(int i) {
            return new ImageBitmapMediaSource[i];
        }
    }

    public ImageBitmapMediaSource(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageBitmapMediaSource) && epx.f(this.b, ((ImageBitmapMediaSource) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return qr.c(new StringBuilder("ImageBitmapMediaSource(bitmap="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
