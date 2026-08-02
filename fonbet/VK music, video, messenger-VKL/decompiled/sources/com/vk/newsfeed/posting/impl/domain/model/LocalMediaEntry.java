package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import xsna.epx;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public interface LocalMediaEntry extends MediaPickerEntry {

    /* compiled from: MediaPickerState.kt */
    public static final class Image implements LocalMediaEntry {
        public static final Parcelable.Creator<Image> CREATOR = new a();
        public final MediaStoreImageEntry b;

        /* compiled from: MediaPickerState.kt */
        public static final class a implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                return new Image((MediaStoreImageEntry) parcel.readParcelable(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        public Image(MediaStoreImageEntry mediaStoreImageEntry) {
            this.b = mediaStoreImageEntry;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry
        public final MediaStoreEntry ba() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && epx.f(this.b, ((Image) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Image(mediaStoreEntry=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class Video implements LocalMediaEntry {
        public static final Parcelable.Creator<Video> CREATOR = new a();
        public final MediaStoreVideoEntry b;

        /* compiled from: MediaPickerState.kt */
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            public final Video createFromParcel(Parcel parcel) {
                return new Video((MediaStoreVideoEntry) parcel.readParcelable(Video.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Video[] newArray(int i) {
                return new Video[i];
            }
        }

        public Video(MediaStoreVideoEntry mediaStoreVideoEntry) {
            this.b = mediaStoreVideoEntry;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry
        public final MediaStoreEntry ba() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Video) && epx.f(this.b, ((Video) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Video(mediaStoreEntry=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    MediaStoreEntry ba();
}
