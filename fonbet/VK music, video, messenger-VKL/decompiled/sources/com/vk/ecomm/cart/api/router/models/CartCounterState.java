package com.vk.ecomm.cart.api.router.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.uqi;
import xsna.vby;

/* compiled from: CartCounterState.kt */
@vby
/* loaded from: classes18.dex */
public final class CartCounterState implements Parcelable {
    public static final Parcelable.Creator<CartCounterState> CREATOR = new a();
    public final int b;

    /* compiled from: CartCounterState.kt */
    public static final class a implements Parcelable.Creator<CartCounterState> {
        @Override // android.os.Parcelable.Creator
        public final CartCounterState createFromParcel(Parcel parcel) {
            return new CartCounterState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CartCounterState[] newArray(int i) {
            return new CartCounterState[i];
        }
    }

    public /* synthetic */ CartCounterState(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CartCounterState) {
            return this.b == ((CartCounterState) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return uqi.a("CartCounterState(count=", this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
