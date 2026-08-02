package com.vk.ecomm.market.good.good2.presentation.businessonboarding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: ProductCardBusinessOnboardingState.kt */
/* loaded from: classes18.dex */
public final class ProductCardBusinessOnboardingState implements Parcelable {
    public static final Parcelable.Creator<ProductCardBusinessOnboardingState> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    /* compiled from: ProductCardBusinessOnboardingState.kt */
    public static final class a implements Parcelable.Creator<ProductCardBusinessOnboardingState> {
        @Override // android.os.Parcelable.Creator
        public final ProductCardBusinessOnboardingState createFromParcel(Parcel parcel) {
            return new ProductCardBusinessOnboardingState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductCardBusinessOnboardingState[] newArray(int i) {
            return new ProductCardBusinessOnboardingState[i];
        }
    }

    public ProductCardBusinessOnboardingState(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCardBusinessOnboardingState)) {
            return false;
        }
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState = (ProductCardBusinessOnboardingState) obj;
        return epx.f(this.b, productCardBusinessOnboardingState.b) && epx.f(this.c, productCardBusinessOnboardingState.c) && epx.f(this.d, productCardBusinessOnboardingState.d) && epx.f(this.e, productCardBusinessOnboardingState.e) && this.f == productCardBusinessOnboardingState.f;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardBusinessOnboardingState(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", buttonTitle=");
        sb.append(this.d);
        sb.append(", tooltip=");
        sb.append(this.e);
        sb.append(", shouldShowDialog=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
