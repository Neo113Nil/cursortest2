package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[] $VALUES;
    public static final Parcelable.Creator<CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto> CREATOR;

    @pmi0("pin_review")
    public static final CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto PIN_REVIEW;
    private final String value;

    /* compiled from: CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto createFromParcel(Parcel parcel) {
            return CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[] newArray(int i) {
            return new CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[i];
        }
    }

    static {
        CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto communitySubscriptionsHasActiveSubscriptionSubscriptionNameDto = new CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto("PIN_REVIEW", 0, "pin_review");
        PIN_REVIEW = communitySubscriptionsHasActiveSubscriptionSubscriptionNameDto;
        CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[] communitySubscriptionsHasActiveSubscriptionSubscriptionNameDtoArr = {communitySubscriptionsHasActiveSubscriptionSubscriptionNameDto};
        $VALUES = communitySubscriptionsHasActiveSubscriptionSubscriptionNameDtoArr;
        $ENTRIES = new asp(communitySubscriptionsHasActiveSubscriptionSubscriptionNameDtoArr);
        CREATOR = new a();
    }

    private CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto valueOf(String str) {
        return (CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto) Enum.valueOf(CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto.class, str);
    }

    public static CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[] values() {
        return (CommunitySubscriptionsHasActiveSubscriptionSubscriptionNameDto[]) $VALUES.clone();
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
