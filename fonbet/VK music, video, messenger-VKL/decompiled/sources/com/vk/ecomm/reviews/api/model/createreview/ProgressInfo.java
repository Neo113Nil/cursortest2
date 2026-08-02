package com.vk.ecomm.reviews.api.model.createreview;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: UploadImageModel.kt */
/* loaded from: classes18.dex */
public interface ProgressInfo extends Parcelable {

    /* compiled from: UploadImageModel.kt */
    public static final class Error implements ProgressInfo {
        public static final Error b = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: UploadImageModel.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -416540006;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UploadImageModel.kt */
    public static final class Loading implements ProgressInfo {
        public static final Loading b = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: UploadImageModel.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 952651086;
        }

        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UploadImageModel.kt */
    public static final class None implements ProgressInfo {
        public static final None b = new None();
        public static final Parcelable.Creator<None> CREATOR = new a();

        /* compiled from: UploadImageModel.kt */
        public static final class a implements Parcelable.Creator<None> {
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                parcel.readInt();
                return None.b;
            }

            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -2091381658;
        }

        public final String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
