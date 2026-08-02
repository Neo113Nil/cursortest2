package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionsSuspendSubscriptionNameDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsSuspendSubscriptionNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitySubscriptionsSuspendSubscriptionNameDto[] $VALUES;
    public static final Parcelable.Creator<CommunitySubscriptionsSuspendSubscriptionNameDto> CREATOR;

    @pmi0("pin_review")
    public static final CommunitySubscriptionsSuspendSubscriptionNameDto PIN_REVIEW;
    private final String value;

    /* compiled from: CommunitySubscriptionsSuspendSubscriptionNameDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsSuspendSubscriptionNameDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsSuspendSubscriptionNameDto createFromParcel(Parcel parcel) {
            return CommunitySubscriptionsSuspendSubscriptionNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsSuspendSubscriptionNameDto[] newArray(int i) {
            return new CommunitySubscriptionsSuspendSubscriptionNameDto[i];
        }
    }

    static {
        CommunitySubscriptionsSuspendSubscriptionNameDto communitySubscriptionsSuspendSubscriptionNameDto = new CommunitySubscriptionsSuspendSubscriptionNameDto("PIN_REVIEW", 0, "pin_review");
        PIN_REVIEW = communitySubscriptionsSuspendSubscriptionNameDto;
        CommunitySubscriptionsSuspendSubscriptionNameDto[] communitySubscriptionsSuspendSubscriptionNameDtoArr = {communitySubscriptionsSuspendSubscriptionNameDto};
        $VALUES = communitySubscriptionsSuspendSubscriptionNameDtoArr;
        $ENTRIES = new asp(communitySubscriptionsSuspendSubscriptionNameDtoArr);
        CREATOR = new a();
    }

    private CommunitySubscriptionsSuspendSubscriptionNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunitySubscriptionsSuspendSubscriptionNameDto valueOf(String str) {
        return (CommunitySubscriptionsSuspendSubscriptionNameDto) Enum.valueOf(CommunitySubscriptionsSuspendSubscriptionNameDto.class, str);
    }

    public static CommunitySubscriptionsSuspendSubscriptionNameDto[] values() {
        return (CommunitySubscriptionsSuspendSubscriptionNameDto[]) $VALUES.clone();
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
