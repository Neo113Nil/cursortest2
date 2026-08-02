package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetBirthdaysSectionProfileButtonDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetBirthdaysSectionProfileButtonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetBirthdaysSectionProfileButtonDto[] $VALUES;
    public static final Parcelable.Creator<FriendsGetBirthdaysSectionProfileButtonDto> CREATOR;

    @pmi0("gift")
    public static final FriendsGetBirthdaysSectionProfileButtonDto GIFT;

    @pmi0("gift_schedule")
    public static final FriendsGetBirthdaysSectionProfileButtonDto GIFT_SCHEDULE;

    @pmi0("message")
    public static final FriendsGetBirthdaysSectionProfileButtonDto MESSAGE;

    @pmi0("wishlist")
    public static final FriendsGetBirthdaysSectionProfileButtonDto WISHLIST;
    private final String value;

    /* compiled from: FriendsGetBirthdaysSectionProfileButtonDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetBirthdaysSectionProfileButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionProfileButtonDto createFromParcel(Parcel parcel) {
            return FriendsGetBirthdaysSectionProfileButtonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionProfileButtonDto[] newArray(int i) {
            return new FriendsGetBirthdaysSectionProfileButtonDto[i];
        }
    }

    static {
        FriendsGetBirthdaysSectionProfileButtonDto friendsGetBirthdaysSectionProfileButtonDto = new FriendsGetBirthdaysSectionProfileButtonDto("WISHLIST", 0, "wishlist");
        WISHLIST = friendsGetBirthdaysSectionProfileButtonDto;
        FriendsGetBirthdaysSectionProfileButtonDto friendsGetBirthdaysSectionProfileButtonDto2 = new FriendsGetBirthdaysSectionProfileButtonDto("MESSAGE", 1, "message");
        MESSAGE = friendsGetBirthdaysSectionProfileButtonDto2;
        FriendsGetBirthdaysSectionProfileButtonDto friendsGetBirthdaysSectionProfileButtonDto3 = new FriendsGetBirthdaysSectionProfileButtonDto("GIFT", 2, "gift");
        GIFT = friendsGetBirthdaysSectionProfileButtonDto3;
        FriendsGetBirthdaysSectionProfileButtonDto friendsGetBirthdaysSectionProfileButtonDto4 = new FriendsGetBirthdaysSectionProfileButtonDto("GIFT_SCHEDULE", 3, "gift_schedule");
        GIFT_SCHEDULE = friendsGetBirthdaysSectionProfileButtonDto4;
        FriendsGetBirthdaysSectionProfileButtonDto[] friendsGetBirthdaysSectionProfileButtonDtoArr = {friendsGetBirthdaysSectionProfileButtonDto, friendsGetBirthdaysSectionProfileButtonDto2, friendsGetBirthdaysSectionProfileButtonDto3, friendsGetBirthdaysSectionProfileButtonDto4};
        $VALUES = friendsGetBirthdaysSectionProfileButtonDtoArr;
        $ENTRIES = new asp(friendsGetBirthdaysSectionProfileButtonDtoArr);
        CREATOR = new a();
    }

    private FriendsGetBirthdaysSectionProfileButtonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetBirthdaysSectionProfileButtonDto valueOf(String str) {
        return (FriendsGetBirthdaysSectionProfileButtonDto) Enum.valueOf(FriendsGetBirthdaysSectionProfileButtonDto.class, str);
    }

    public static FriendsGetBirthdaysSectionProfileButtonDto[] values() {
        return (FriendsGetBirthdaysSectionProfileButtonDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
