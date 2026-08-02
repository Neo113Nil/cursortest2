package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetInterestingRequestsFieldsDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetInterestingRequestsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetInterestingRequestsFieldsDto[] $VALUES;

    @pmi0("bdate")
    public static final FriendsGetInterestingRequestsFieldsDto BDATE;

    @pmi0("city")
    public static final FriendsGetInterestingRequestsFieldsDto CITY;
    public static final Parcelable.Creator<FriendsGetInterestingRequestsFieldsDto> CREATOR;

    @pmi0("crop_photo")
    public static final FriendsGetInterestingRequestsFieldsDto CROP_PHOTO;

    @pmi0("first_name_acc")
    public static final FriendsGetInterestingRequestsFieldsDto FIRST_NAME_ACC;

    @pmi0("has_photo")
    public static final FriendsGetInterestingRequestsFieldsDto HAS_PHOTO;

    @pmi0("hoto_400_orig")
    public static final FriendsGetInterestingRequestsFieldsDto HOTO_400_ORIG;

    @pmi0("mutual")
    public static final FriendsGetInterestingRequestsFieldsDto MUTUAL;

    @pmi0("occupation")
    public static final FriendsGetInterestingRequestsFieldsDto OCCUPATION;

    @pmi0("photo_100")
    public static final FriendsGetInterestingRequestsFieldsDto PHOTO_100;

    @pmi0("photo_200")
    public static final FriendsGetInterestingRequestsFieldsDto PHOTO_200;

    @pmi0("photo_50")
    public static final FriendsGetInterestingRequestsFieldsDto PHOTO_50;

    @pmi0("relation")
    public static final FriendsGetInterestingRequestsFieldsDto RELATION;

    @pmi0("screen_name")
    public static final FriendsGetInterestingRequestsFieldsDto SCREEN_NAME;
    private final String value;

    /* compiled from: FriendsGetInterestingRequestsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetInterestingRequestsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetInterestingRequestsFieldsDto createFromParcel(Parcel parcel) {
            return FriendsGetInterestingRequestsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetInterestingRequestsFieldsDto[] newArray(int i) {
            return new FriendsGetInterestingRequestsFieldsDto[i];
        }
    }

    static {
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto = new FriendsGetInterestingRequestsFieldsDto("CROP_PHOTO", 0, "crop_photo");
        CROP_PHOTO = friendsGetInterestingRequestsFieldsDto;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto2 = new FriendsGetInterestingRequestsFieldsDto("BDATE", 1, "bdate");
        BDATE = friendsGetInterestingRequestsFieldsDto2;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto3 = new FriendsGetInterestingRequestsFieldsDto("HAS_PHOTO", 2, "has_photo");
        HAS_PHOTO = friendsGetInterestingRequestsFieldsDto3;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto4 = new FriendsGetInterestingRequestsFieldsDto("CITY", 3, "city");
        CITY = friendsGetInterestingRequestsFieldsDto4;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto5 = new FriendsGetInterestingRequestsFieldsDto("MUTUAL", 4, "mutual");
        MUTUAL = friendsGetInterestingRequestsFieldsDto5;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto6 = new FriendsGetInterestingRequestsFieldsDto("FIRST_NAME_ACC", 5, "first_name_acc");
        FIRST_NAME_ACC = friendsGetInterestingRequestsFieldsDto6;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto7 = new FriendsGetInterestingRequestsFieldsDto("OCCUPATION", 6, "occupation");
        OCCUPATION = friendsGetInterestingRequestsFieldsDto7;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto8 = new FriendsGetInterestingRequestsFieldsDto("RELATION", 7, "relation");
        RELATION = friendsGetInterestingRequestsFieldsDto8;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto9 = new FriendsGetInterestingRequestsFieldsDto("PHOTO_50", 8, "photo_50");
        PHOTO_50 = friendsGetInterestingRequestsFieldsDto9;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto10 = new FriendsGetInterestingRequestsFieldsDto("PHOTO_100", 9, "photo_100");
        PHOTO_100 = friendsGetInterestingRequestsFieldsDto10;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto11 = new FriendsGetInterestingRequestsFieldsDto("PHOTO_200", 10, "photo_200");
        PHOTO_200 = friendsGetInterestingRequestsFieldsDto11;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto12 = new FriendsGetInterestingRequestsFieldsDto("HOTO_400_ORIG", 11, "hoto_400_orig");
        HOTO_400_ORIG = friendsGetInterestingRequestsFieldsDto12;
        FriendsGetInterestingRequestsFieldsDto friendsGetInterestingRequestsFieldsDto13 = new FriendsGetInterestingRequestsFieldsDto("SCREEN_NAME", 12, "screen_name");
        SCREEN_NAME = friendsGetInterestingRequestsFieldsDto13;
        FriendsGetInterestingRequestsFieldsDto[] friendsGetInterestingRequestsFieldsDtoArr = {friendsGetInterestingRequestsFieldsDto, friendsGetInterestingRequestsFieldsDto2, friendsGetInterestingRequestsFieldsDto3, friendsGetInterestingRequestsFieldsDto4, friendsGetInterestingRequestsFieldsDto5, friendsGetInterestingRequestsFieldsDto6, friendsGetInterestingRequestsFieldsDto7, friendsGetInterestingRequestsFieldsDto8, friendsGetInterestingRequestsFieldsDto9, friendsGetInterestingRequestsFieldsDto10, friendsGetInterestingRequestsFieldsDto11, friendsGetInterestingRequestsFieldsDto12, friendsGetInterestingRequestsFieldsDto13};
        $VALUES = friendsGetInterestingRequestsFieldsDtoArr;
        $ENTRIES = new asp(friendsGetInterestingRequestsFieldsDtoArr);
        CREATOR = new a();
    }

    private FriendsGetInterestingRequestsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetInterestingRequestsFieldsDto valueOf(String str) {
        return (FriendsGetInterestingRequestsFieldsDto) Enum.valueOf(FriendsGetInterestingRequestsFieldsDto.class, str);
    }

    public static FriendsGetInterestingRequestsFieldsDto[] values() {
        return (FriendsGetInterestingRequestsFieldsDto[]) $VALUES.clone();
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
