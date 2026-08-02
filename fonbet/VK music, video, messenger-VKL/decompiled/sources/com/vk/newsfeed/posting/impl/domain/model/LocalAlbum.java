package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class LocalAlbum implements Parcelable {
    public static final Parcelable.Creator<LocalAlbum> CREATOR = new a();
    public final int b;
    public final int c;
    public final CatalogType d;

    /* compiled from: MediaPickerState.kt */
    public static abstract class CatalogType implements Parcelable {

        /* compiled from: MediaPickerState.kt */
        public static final class Folder extends CatalogType {
            public static final Parcelable.Creator<Folder> CREATOR = new a();
            public final String b;

            /* compiled from: MediaPickerState.kt */
            public static final class a implements Parcelable.Creator<Folder> {
                @Override // android.os.Parcelable.Creator
                public final Folder createFromParcel(Parcel parcel) {
                    return new Folder(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Folder[] newArray(int i) {
                    return new Folder[i];
                }
            }

            public Folder(String str) {
                super(null);
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
                return (obj instanceof Folder) && epx.f(this.b, ((Folder) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Folder(name="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: MediaPickerState.kt */
        public static final class Root extends CatalogType {
            public static final Root b = new Root(null);
            public static final Parcelable.Creator<Root> CREATOR = new a();

            /* compiled from: MediaPickerState.kt */
            public static final class a implements Parcelable.Creator<Root> {
                @Override // android.os.Parcelable.Creator
                public final Root createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Root.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Root[] newArray(int i) {
                    return new Root[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Root);
            }

            public final int hashCode() {
                return 609614441;
            }

            public final String toString() {
                return "Root";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ CatalogType(zcl zclVar) {
            this();
        }

        public CatalogType() {
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class a implements Parcelable.Creator<LocalAlbum> {
        @Override // android.os.Parcelable.Creator
        public final LocalAlbum createFromParcel(Parcel parcel) {
            return new LocalAlbum(parcel.readInt(), parcel.readInt(), (CatalogType) parcel.readParcelable(LocalAlbum.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocalAlbum[] newArray(int i) {
            return new LocalAlbum[i];
        }
    }

    public LocalAlbum(int i, int i2, CatalogType catalogType) {
        this.b = i;
        this.c = i2;
        this.d = catalogType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalAlbum)) {
            return false;
        }
        LocalAlbum localAlbum = (LocalAlbum) obj;
        return this.b == localAlbum.b && this.c == localAlbum.c && epx.f(this.d, localAlbum.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "LocalAlbum(bucketId=" + this.b + ", totalMediaCount=" + this.c + ", catalogType=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
