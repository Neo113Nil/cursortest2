package com.vk.video.ui.upload.impl.publish.domain.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qr;
import xsna.zcl;

/* compiled from: CoverDo.kt */
/* loaded from: classes7.dex */
public interface CoverDo extends Parcelable {

    /* compiled from: CoverDo.kt */
    public static final class Local implements CoverDo {
        public static final Parcelable.Creator<Local> CREATOR = new a();
        public final String b;

        /* compiled from: CoverDo.kt */
        public static final class a implements Parcelable.Creator<Local> {
            @Override // android.os.Parcelable.Creator
            public final Local createFromParcel(Parcel parcel) {
                return new Local(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Local[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(String str) {
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
            return (obj instanceof Local) && epx.f(this.b, ((Local) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Local(path="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: CoverDo.kt */
    public static final class Preview implements CoverDo {
        public static final Parcelable.Creator<Preview> CREATOR = new a();
        public final Bitmap b;

        /* compiled from: CoverDo.kt */
        public static final class a implements Parcelable.Creator<Preview> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Preview createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new Preview(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Preview[] newArray(int i) {
                return new Preview[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Preview() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Preview) && epx.f(this.b, ((Preview) obj).b);
        }

        public final int hashCode() {
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        public final String toString() {
            return qr.c(new StringBuilder("Preview(bitmap="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }

        public Preview(Bitmap bitmap) {
            this.b = bitmap;
        }

        public /* synthetic */ Preview(Bitmap bitmap, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : bitmap);
        }
    }

    /* compiled from: CoverDo.kt */
    public static final class Remote implements CoverDo {
        public static final Parcelable.Creator<Remote> CREATOR = new a();
        public final String b;

        /* compiled from: CoverDo.kt */
        public static final class a implements Parcelable.Creator<Remote> {
            @Override // android.os.Parcelable.Creator
            public final Remote createFromParcel(Parcel parcel) {
                return new Remote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Remote[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(String str) {
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
            return (obj instanceof Remote) && epx.f(this.b, ((Remote) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Remote(url="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
