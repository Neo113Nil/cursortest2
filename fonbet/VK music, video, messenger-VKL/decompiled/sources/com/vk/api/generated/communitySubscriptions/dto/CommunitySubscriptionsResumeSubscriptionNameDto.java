package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionsResumeSubscriptionNameDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsResumeSubscriptionNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitySubscriptionsResumeSubscriptionNameDto[] $VALUES;
    public static final Parcelable.Creator<CommunitySubscriptionsResumeSubscriptionNameDto> CREATOR;

    @pmi0("pin_review")
    public static final CommunitySubscriptionsResumeSubscriptionNameDto PIN_REVIEW;
    private final String value;

    /* compiled from: CommunitySubscriptionsResumeSubscriptionNameDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsResumeSubscriptionNameDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsResumeSubscriptionNameDto createFromParcel(Parcel parcel) {
            return CommunitySubscriptionsResumeSubscriptionNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsResumeSubscriptionNameDto[] newArray(int i) {
            return new CommunitySubscriptionsResumeSubscriptionNameDto[i];
        }
    }

    static {
        CommunitySubscriptionsResumeSubscriptionNameDto communitySubscriptionsResumeSubscriptionNameDto = new CommunitySubscriptionsResumeSubscriptionNameDto("PIN_REVIEW", 0, "pin_review");
        PIN_REVIEW = communitySubscriptionsResumeSubscriptionNameDto;
        CommunitySubscriptionsResumeSubscriptionNameDto[] communitySubscriptionsResumeSubscriptionNameDtoArr = {communitySubscriptionsResumeSubscriptionNameDto};
        $VALUES = communitySubscriptionsResumeSubscriptionNameDtoArr;
        $ENTRIES = new asp(communitySubscriptionsResumeSubscriptionNameDtoArr);
        CREATOR = new a();
    }

    private CommunitySubscriptionsResumeSubscriptionNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunitySubscriptionsResumeSubscriptionNameDto valueOf(String str) {
        return (CommunitySubscriptionsResumeSubscriptionNameDto) Enum.valueOf(CommunitySubscriptionsResumeSubscriptionNameDto.class, str);
    }

    public static CommunitySubscriptionsResumeSubscriptionNameDto[] values() {
        return (CommunitySubscriptionsResumeSubscriptionNameDto[]) $VALUES.clone();
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
