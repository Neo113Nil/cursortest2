package com.vk.superapp.browser.internal.ui.changephone;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VkChangePhoneResult.kt */
/* loaded from: classes6.dex */
public interface VkChangePhoneResult extends Parcelable {

    /* compiled from: VkChangePhoneResult.kt */
    public static final class Error implements VkChangePhoneResult {
        public static final Error b = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: VkChangePhoneResult.kt */
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VkChangePhoneResult.kt */
    public static final class Success implements VkChangePhoneResult {
        public static final Parcelable.Creator<Success> CREATOR = new a();
        public final String b;

        /* compiled from: VkChangePhoneResult.kt */
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
