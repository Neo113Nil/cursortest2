package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionsGetPricingInfoSubscriptionNameDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsGetPricingInfoSubscriptionNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[] $VALUES;
    public static final Parcelable.Creator<CommunitySubscriptionsGetPricingInfoSubscriptionNameDto> CREATOR;

    @pmi0("pin_review")
    public static final CommunitySubscriptionsGetPricingInfoSubscriptionNameDto PIN_REVIEW;
    private final String value;

    /* compiled from: CommunitySubscriptionsGetPricingInfoSubscriptionNameDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsGetPricingInfoSubscriptionNameDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPricingInfoSubscriptionNameDto createFromParcel(Parcel parcel) {
            return CommunitySubscriptionsGetPricingInfoSubscriptionNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[] newArray(int i) {
            return new CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[i];
        }
    }

    static {
        CommunitySubscriptionsGetPricingInfoSubscriptionNameDto communitySubscriptionsGetPricingInfoSubscriptionNameDto = new CommunitySubscriptionsGetPricingInfoSubscriptionNameDto("PIN_REVIEW", 0, "pin_review");
        PIN_REVIEW = communitySubscriptionsGetPricingInfoSubscriptionNameDto;
        CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[] communitySubscriptionsGetPricingInfoSubscriptionNameDtoArr = {communitySubscriptionsGetPricingInfoSubscriptionNameDto};
        $VALUES = communitySubscriptionsGetPricingInfoSubscriptionNameDtoArr;
        $ENTRIES = new asp(communitySubscriptionsGetPricingInfoSubscriptionNameDtoArr);
        CREATOR = new a();
    }

    private CommunitySubscriptionsGetPricingInfoSubscriptionNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunitySubscriptionsGetPricingInfoSubscriptionNameDto valueOf(String str) {
        return (CommunitySubscriptionsGetPricingInfoSubscriptionNameDto) Enum.valueOf(CommunitySubscriptionsGetPricingInfoSubscriptionNameDto.class, str);
    }

    public static CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[] values() {
        return (CommunitySubscriptionsGetPricingInfoSubscriptionNameDto[]) $VALUES.clone();
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
