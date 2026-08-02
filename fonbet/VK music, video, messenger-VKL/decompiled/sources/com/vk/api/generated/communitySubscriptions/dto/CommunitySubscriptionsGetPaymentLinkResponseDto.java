package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsGetPaymentLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsGetPaymentLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsGetPaymentLinkResponseDto> CREATOR = new a();

    @pmi0("payment_link")
    private final String paymentLink;

    /* compiled from: CommunitySubscriptionsGetPaymentLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsGetPaymentLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPaymentLinkResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsGetPaymentLinkResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPaymentLinkResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsGetPaymentLinkResponseDto[i];
        }
    }

    public CommunitySubscriptionsGetPaymentLinkResponseDto(String str) {
        this.paymentLink = str;
    }

    public final String d() {
        return this.paymentLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommunitySubscriptionsGetPaymentLinkResponseDto) && epx.f(this.paymentLink, ((CommunitySubscriptionsGetPaymentLinkResponseDto) obj).paymentLink);
    }

    public final int hashCode() {
        return this.paymentLink.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CommunitySubscriptionsGetPaymentLinkResponseDto(paymentLink="), this.paymentLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paymentLink);
    }
}
