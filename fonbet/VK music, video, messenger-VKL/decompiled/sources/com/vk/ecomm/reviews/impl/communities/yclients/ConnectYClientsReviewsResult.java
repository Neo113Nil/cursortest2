package com.vk.ecomm.reviews.impl.communities.yclients;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ConnectYClientsReviewsEvent.kt */
/* loaded from: classes18.dex */
public interface ConnectYClientsReviewsResult extends Parcelable {

    /* compiled from: ConnectYClientsReviewsEvent.kt */
    public static final class Success implements ConnectYClientsReviewsResult {
        public static final Success b = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* compiled from: ConnectYClientsReviewsEvent.kt */
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Success.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -546346822;
        }

        public final String toString() {
            return "Success";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
