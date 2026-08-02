package com.vk.newsfeed.posting.impl.domain.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.azw;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class ImageCropArea implements Parcelable {
    public static final Parcelable.Creator<ImageCropArea> CREATOR = new a();
    public final String b;
    public final Uri c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final RelativeImageCropArea h;
    public final azw i;

    /* compiled from: PhotoVideoAttachmentsCropData.kt */
    public static final class a implements Parcelable.Creator<ImageCropArea> {
        @Override // android.os.Parcelable.Creator
        public final ImageCropArea createFromParcel(Parcel parcel) {
            return new ImageCropArea(parcel.readString(), (Uri) parcel.readParcelable(ImageCropArea.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : RelativeImageCropArea.CREATOR.createFromParcel(parcel), null, 128, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageCropArea[] newArray(int i) {
            return new ImageCropArea[i];
        }
    }

    public ImageCropArea(String str, Uri uri, int i, int i2, int i3, int i4, RelativeImageCropArea relativeImageCropArea, azw azwVar) {
        this.b = str;
        this.c = uri;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = relativeImageCropArea;
        this.i = azwVar;
    }

    public static ImageCropArea a(ImageCropArea imageCropArea, String str, int i, int i2, int i3, int i4, azw azwVar, int i5) {
        if ((i5 & 1) != 0) {
            str = imageCropArea.b;
        }
        String str2 = str;
        Uri uri = imageCropArea.c;
        if ((i5 & 4) != 0) {
            i = imageCropArea.d;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = imageCropArea.e;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = imageCropArea.f;
        }
        int i8 = i3;
        int i9 = (i5 & 32) != 0 ? imageCropArea.g : i4;
        RelativeImageCropArea relativeImageCropArea = imageCropArea.h;
        azw azwVar2 = (i5 & 128) != 0 ? imageCropArea.i : azwVar;
        imageCropArea.getClass();
        return new ImageCropArea(str2, uri, i6, i7, i8, i9, relativeImageCropArea, azwVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCropArea)) {
            return false;
        }
        ImageCropArea imageCropArea = (ImageCropArea) obj;
        return epx.f(this.b, imageCropArea.b) && epx.f(this.c, imageCropArea.c) && this.d == imageCropArea.d && this.e == imageCropArea.e && this.f == imageCropArea.f && this.g == imageCropArea.g && epx.f(this.h, imageCropArea.h) && epx.f(this.i, imageCropArea.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Uri uri = this.c;
        int a2 = shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31), 31), 31);
        RelativeImageCropArea relativeImageCropArea = this.h;
        int hashCode2 = (a2 + (relativeImageCropArea != null ? relativeImageCropArea.hashCode() : 0)) * 31;
        this.i.getClass();
        return hashCode2;
    }

    public final String toString() {
        return "ImageCropArea(photoId=" + this.b + ", uri=" + this.c + ", x=" + this.d + ", y=" + this.e + ", width=" + this.f + ", height=" + this.g + ", relativeArea=" + this.h + ", initialCropState=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        RelativeImageCropArea relativeImageCropArea = this.h;
        if (relativeImageCropArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relativeImageCropArea.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ImageCropArea(String str, Uri uri, int i, int i2, int i3, int i4, RelativeImageCropArea relativeImageCropArea, azw azwVar, int i5, zcl zclVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : uri, i, i2, i3, i4, (i5 & 64) != 0 ? null : relativeImageCropArea, (i5 & 128) != 0 ? new azw(false) : azwVar);
    }
}
