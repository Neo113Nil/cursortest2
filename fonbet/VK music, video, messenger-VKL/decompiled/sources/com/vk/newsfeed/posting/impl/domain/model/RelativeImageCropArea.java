package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.xq;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class RelativeImageCropArea implements Parcelable {
    public static final Parcelable.Creator<RelativeImageCropArea> CREATOR = new a();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    /* compiled from: PhotoVideoAttachmentsCropData.kt */
    public static final class a implements Parcelable.Creator<RelativeImageCropArea> {
        @Override // android.os.Parcelable.Creator
        public final RelativeImageCropArea createFromParcel(Parcel parcel) {
            return new RelativeImageCropArea(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RelativeImageCropArea[] newArray(int i) {
            return new RelativeImageCropArea[i];
        }
    }

    public RelativeImageCropArea(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeImageCropArea)) {
            return false;
        }
        RelativeImageCropArea relativeImageCropArea = (RelativeImageCropArea) obj;
        return Float.compare(this.b, relativeImageCropArea.b) == 0 && Float.compare(this.c, relativeImageCropArea.c) == 0 && Float.compare(this.d, relativeImageCropArea.d) == 0 && Float.compare(this.e, relativeImageCropArea.e) == 0 && Float.compare(this.f, relativeImageCropArea.f) == 0 && Float.compare(this.g, relativeImageCropArea.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeImageCropArea(x1=");
        sb.append(this.b);
        sb.append(", y1=");
        sb.append(this.c);
        sb.append(", x2=");
        sb.append(this.d);
        sb.append(", y2=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        return xq.c(')', this.g, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
    }
}
