package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[] $VALUES;
    public static final Parcelable.Creator<CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto> CREATOR;

    @pmi0("pin_review")
    public static final CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto PIN_REVIEW;
    private final String value;

    /* compiled from: CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto createFromParcel(Parcel parcel) {
            return CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[] newArray(int i) {
            return new CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[i];
        }
    }

    static {
        CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto communitySubscriptionsGetPaymentLinkSubscriptionNameDto = new CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto("PIN_REVIEW", 0, "pin_review");
        PIN_REVIEW = communitySubscriptionsGetPaymentLinkSubscriptionNameDto;
        CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[] communitySubscriptionsGetPaymentLinkSubscriptionNameDtoArr = {communitySubscriptionsGetPaymentLinkSubscriptionNameDto};
        $VALUES = communitySubscriptionsGetPaymentLinkSubscriptionNameDtoArr;
        $ENTRIES = new asp(communitySubscriptionsGetPaymentLinkSubscriptionNameDtoArr);
        CREATOR = new a();
    }

    private CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto valueOf(String str) {
        return (CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto) Enum.valueOf(CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto.class, str);
    }

    public static CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[] values() {
        return (CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
