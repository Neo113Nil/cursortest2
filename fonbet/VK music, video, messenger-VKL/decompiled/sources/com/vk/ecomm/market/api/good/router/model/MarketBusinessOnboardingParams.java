package com.vk.ecomm.market.api.good.router.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MarketBusinessOnboardingParams.kt */
/* loaded from: classes18.dex */
public final class MarketBusinessOnboardingParams implements Parcelable {
    public static final Parcelable.Creator<MarketBusinessOnboardingParams> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: MarketBusinessOnboardingParams.kt */
    public static final class a implements Parcelable.Creator<MarketBusinessOnboardingParams> {
        @Override // android.os.Parcelable.Creator
        public final MarketBusinessOnboardingParams createFromParcel(Parcel parcel) {
            return new MarketBusinessOnboardingParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBusinessOnboardingParams[] newArray(int i) {
            return new MarketBusinessOnboardingParams[i];
        }
    }

    public MarketBusinessOnboardingParams(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBusinessOnboardingParams)) {
            return false;
        }
        MarketBusinessOnboardingParams marketBusinessOnboardingParams = (MarketBusinessOnboardingParams) obj;
        return epx.f(this.b, marketBusinessOnboardingParams.b) && epx.f(this.c, marketBusinessOnboardingParams.c) && epx.f(this.d, marketBusinessOnboardingParams.d) && epx.f(this.e, marketBusinessOnboardingParams.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBusinessOnboardingParams(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", tooltip=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
