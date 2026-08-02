package com.vk.posting.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.zcl;

/* compiled from: PickerRootParams.kt */
/* loaded from: classes5.dex */
public abstract class PickerAttachType implements Parcelable {

    /* compiled from: PickerRootParams.kt */
    public static final class Album extends PickerAttachType {
        public static final Album b = new Album(null);
        public static final Parcelable.Creator<Album> CREATOR = new a();

        /* compiled from: PickerRootParams.kt */
        public static final class a implements Parcelable.Creator<Album> {
            @Override // android.os.Parcelable.Creator
            public final Album createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Album.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Album[] newArray(int i) {
                return new Album[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PickerRootParams.kt */
    public static final class Article extends PickerAttachType {
        public static final Article b = new Article(null);
        public static final Parcelable.Creator<Article> CREATOR = new a();

        /* compiled from: PickerRootParams.kt */
        public static final class a implements Parcelable.Creator<Article> {
            @Override // android.os.Parcelable.Creator
            public final Article createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Article.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Article[] newArray(int i) {
                return new Article[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PickerRootParams.kt */
    public static final class PhotoVk extends PickerAttachType {
        public static final PhotoVk b = new PhotoVk(null);
        public static final Parcelable.Creator<PhotoVk> CREATOR = new a();

        /* compiled from: PickerRootParams.kt */
        public static final class a implements Parcelable.Creator<PhotoVk> {
            @Override // android.os.Parcelable.Creator
            public final PhotoVk createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PhotoVk.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoVk[] newArray(int i) {
                return new PhotoVk[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PickerRootParams.kt */
    public static final class VideoVk extends PickerAttachType {
        public static final Parcelable.Creator<VideoVk> CREATOR = new a();
        public final VideoAttachParams b;

        /* compiled from: PickerRootParams.kt */
        public static final class a implements Parcelable.Creator<VideoVk> {
            @Override // android.os.Parcelable.Creator
            public final VideoVk createFromParcel(Parcel parcel) {
                return new VideoVk(VideoAttachParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VideoVk[] newArray(int i) {
                return new VideoVk[i];
            }
        }

        public VideoVk(VideoAttachParams videoAttachParams) {
            super(null);
            this.b = videoAttachParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoVk) && epx.f(this.b, ((VideoVk) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VideoVk(params=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PickerAttachType(zcl zclVar) {
        this();
    }

    public PickerAttachType() {
    }
}
