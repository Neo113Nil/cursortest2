package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsChangePaymentMethodResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsChangePaymentMethodResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsChangePaymentMethodResponseDto> CREATOR = new a();

    @pmi0("payment_method_link")
    private final String paymentMethodLink;

    /* compiled from: CommunitySubscriptionsChangePaymentMethodResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsChangePaymentMethodResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsChangePaymentMethodResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsChangePaymentMethodResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsChangePaymentMethodResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsChangePaymentMethodResponseDto[i];
        }
    }

    public CommunitySubscriptionsChangePaymentMethodResponseDto(String str) {
        this.paymentMethodLink = str;
    }

    public final String d() {
        return this.paymentMethodLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommunitySubscriptionsChangePaymentMethodResponseDto) && epx.f(this.paymentMethodLink, ((CommunitySubscriptionsChangePaymentMethodResponseDto) obj).paymentMethodLink);
    }

    public final int hashCode() {
        return this.paymentMethodLink.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CommunitySubscriptionsChangePaymentMethodResponseDto(paymentMethodLink="), this.paymentMethodLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paymentMethodLink);
    }
}
