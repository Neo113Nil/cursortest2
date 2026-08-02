package com.vk.ecomm.orders.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ReviewSuggestion.kt */
/* loaded from: classes18.dex */
public abstract class ReviewSuggestion implements Parcelable {

    /* compiled from: ReviewSuggestion.kt */
    public static final class AllOrders extends ReviewSuggestion {
        public static final AllOrders b = new AllOrders(null);
        public static final Parcelable.Creator<AllOrders> CREATOR = new a();

        /* compiled from: ReviewSuggestion.kt */
        public static final class a implements Parcelable.Creator<AllOrders> {
            @Override // android.os.Parcelable.Creator
            public final AllOrders createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllOrders.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AllOrders[] newArray(int i) {
                return new AllOrders[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllOrders);
        }

        public final int hashCode() {
            return -1801614739;
        }

        public final String toString() {
            return "AllOrders";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ReviewSuggestion.kt */
    public static final class Order extends ReviewSuggestion {
        public static final Parcelable.Creator<Order> CREATOR = new a();
        public final int b;

        /* compiled from: ReviewSuggestion.kt */
        public static final class a implements Parcelable.Creator<Order> {
            @Override // android.os.Parcelable.Creator
            public final Order createFromParcel(Parcel parcel) {
                return new Order(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Order[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(int i) {
            super(null);
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Order) && this.b == ((Order) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Order(orderId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    public /* synthetic */ ReviewSuggestion(zcl zclVar) {
        this();
    }

    public ReviewSuggestion() {
    }
}
