package com.vk.photos.root.selectalbum.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.photo.PhotoAlbum;
import defpackage.q0;
import xsna.epx;
import xsna.j6i0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotoAlbumWrapper.kt */
/* loaded from: classes4.dex */
public abstract class PhotoAlbumWrapper implements Parcelable, j6i0 {
    public final int b;
    public final boolean c;
    public final String d;

    /* compiled from: PhotoAlbumWrapper.kt */
    public static final class CommonPhotoAlbum extends PhotoAlbumWrapper {
        public static final Parcelable.Creator<CommonPhotoAlbum> CREATOR = new a();
        public final PhotoAlbum e;
        public final boolean f;

        /* compiled from: PhotoAlbumWrapper.kt */
        public static final class a implements Parcelable.Creator<CommonPhotoAlbum> {
            @Override // android.os.Parcelable.Creator
            public final CommonPhotoAlbum createFromParcel(Parcel parcel) {
                return new CommonPhotoAlbum((PhotoAlbum) parcel.readParcelable(CommonPhotoAlbum.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CommonPhotoAlbum[] newArray(int i) {
                return new CommonPhotoAlbum[i];
            }
        }

        public CommonPhotoAlbum(PhotoAlbum photoAlbum, boolean z) {
            super(photoAlbum.b, z, photoAlbum.g, null);
            this.e = photoAlbum;
            this.f = z;
        }

        @Override // com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper, xsna.j6i0
        public final boolean d() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonPhotoAlbum)) {
                return false;
            }
            CommonPhotoAlbum commonPhotoAlbum = (CommonPhotoAlbum) obj;
            return epx.f(this.e, commonPhotoAlbum.e) && this.f == commonPhotoAlbum.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + (this.e.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonPhotoAlbum(album=");
            sb.append(this.e);
            sb.append(", selected=");
            return q0.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    /* compiled from: PhotoAlbumWrapper.kt */
    public static final class SpecialPhotoAlbum extends PhotoAlbumWrapper {
        public static final Parcelable.Creator<SpecialPhotoAlbum> CREATOR = new a();
        public final int e;
        public final String f;
        public final boolean g;

        /* compiled from: PhotoAlbumWrapper.kt */
        public static final class a implements Parcelable.Creator<SpecialPhotoAlbum> {
            @Override // android.os.Parcelable.Creator
            public final SpecialPhotoAlbum createFromParcel(Parcel parcel) {
                return new SpecialPhotoAlbum(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SpecialPhotoAlbum[] newArray(int i) {
                return new SpecialPhotoAlbum[i];
            }
        }

        public SpecialPhotoAlbum(int i, String str, boolean z) {
            super(i, z, str, null);
            this.e = i;
            this.f = str;
            this.g = z;
        }

        @Override // com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper, xsna.j6i0
        public final boolean d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialPhotoAlbum)) {
                return false;
            }
            SpecialPhotoAlbum specialPhotoAlbum = (SpecialPhotoAlbum) obj;
            return this.e == specialPhotoAlbum.e && epx.f(this.f, specialPhotoAlbum.f) && this.g == specialPhotoAlbum.g;
        }

        @Override // com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper, xsna.j6i0
        public final int getId() {
            return this.e;
        }

        @Override // com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper
        public final String getTitle() {
            return this.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + urd0.a(Integer.hashCode(this.e) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpecialPhotoAlbum(id=");
            sb.append(this.e);
            sb.append(", title=");
            sb.append(this.f);
            sb.append(", selected=");
            return q0.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public PhotoAlbumWrapper(int i, boolean z, String str, zcl zclVar) {
        this.b = i;
        this.c = z;
        this.d = str;
    }

    @Override // xsna.j6i0
    public boolean d() {
        return this.c;
    }

    @Override // xsna.j6i0
    public int getId() {
        return this.b;
    }

    public String getTitle() {
        return this.d;
    }
}
