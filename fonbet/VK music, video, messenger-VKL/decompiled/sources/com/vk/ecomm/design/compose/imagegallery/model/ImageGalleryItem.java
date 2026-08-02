package com.vk.ecomm.design.compose.imagegallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: ImageGalleryItem.kt */
/* loaded from: classes18.dex */
public interface ImageGalleryItem extends Parcelable {

    /* compiled from: ImageGalleryItem.kt */
    public static final class ImageGalleryAddItem implements ImageGalleryItem {
        public static final ImageGalleryAddItem b = new ImageGalleryAddItem();
        public static final Parcelable.Creator<ImageGalleryAddItem> CREATOR = new a();

        /* compiled from: ImageGalleryItem.kt */
        public static final class a implements Parcelable.Creator<ImageGalleryAddItem> {
            @Override // android.os.Parcelable.Creator
            public final ImageGalleryAddItem createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ImageGalleryAddItem.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ImageGalleryAddItem[] newArray(int i) {
                return new ImageGalleryAddItem[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ImageGalleryAddItem);
        }

        public final int hashCode() {
            return -1810433358;
        }

        public final String toString() {
            return "ImageGalleryAddItem";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ImageGalleryItem.kt */
    public static final class ImageGalleryImageItem implements ImageGalleryItem {
        public static final Parcelable.Creator<ImageGalleryImageItem> CREATOR = new a();
        public final int b;
        public final ImageGalleryCellItemPlaceholderType c;
        public final String d;

        /* compiled from: ImageGalleryItem.kt */
        public static final class a implements Parcelable.Creator<ImageGalleryImageItem> {
            @Override // android.os.Parcelable.Creator
            public final ImageGalleryImageItem createFromParcel(Parcel parcel) {
                return new ImageGalleryImageItem(parcel.readInt(), parcel.readInt() == 0 ? null : ImageGalleryCellItemPlaceholderType.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageGalleryImageItem[] newArray(int i) {
                return new ImageGalleryImageItem[i];
            }
        }

        public ImageGalleryImageItem(int i, ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType, String str) {
            this.b = i;
            this.c = imageGalleryCellItemPlaceholderType;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageGalleryImageItem)) {
                return false;
            }
            ImageGalleryImageItem imageGalleryImageItem = (ImageGalleryImageItem) obj;
            return this.b == imageGalleryImageItem.b && this.c == imageGalleryImageItem.c && epx.f(this.d, imageGalleryImageItem.d);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType = this.c;
            return this.d.hashCode() + ((hashCode + (imageGalleryCellItemPlaceholderType == null ? 0 : imageGalleryCellItemPlaceholderType.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageGalleryImageItem(id=");
            sb.append(this.b);
            sb.append(", placeholderType=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType = this.c;
            if (imageGalleryCellItemPlaceholderType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(imageGalleryCellItemPlaceholderType.name());
            }
            parcel.writeString(this.d);
        }

        public /* synthetic */ ImageGalleryImageItem(int i, ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType, String str, int i2, zcl zclVar) {
            this(i, (i2 & 2) != 0 ? null : imageGalleryCellItemPlaceholderType, str);
        }
    }
}
