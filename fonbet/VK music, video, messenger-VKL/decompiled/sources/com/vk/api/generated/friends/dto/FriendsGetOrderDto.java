package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetOrderDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetOrderDto[] $VALUES;
    public static final Parcelable.Creator<FriendsGetOrderDto> CREATOR;

    @pmi0("hints")
    public static final FriendsGetOrderDto HINTS;

    @pmi0("mobile")
    public static final FriendsGetOrderDto MOBILE;

    @pmi0("name")
    public static final FriendsGetOrderDto NAME;

    @pmi0("random")
    public static final FriendsGetOrderDto RANDOM;

    @pmi0("smart")
    public static final FriendsGetOrderDto SMART;
    private final String value;

    /* compiled from: FriendsGetOrderDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetOrderDto createFromParcel(Parcel parcel) {
            return FriendsGetOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetOrderDto[] newArray(int i) {
            return new FriendsGetOrderDto[i];
        }
    }

    static {
        FriendsGetOrderDto friendsGetOrderDto = new FriendsGetOrderDto("HINTS", 0, "hints");
        HINTS = friendsGetOrderDto;
        FriendsGetOrderDto friendsGetOrderDto2 = new FriendsGetOrderDto("MOBILE", 1, "mobile");
        MOBILE = friendsGetOrderDto2;
        FriendsGetOrderDto friendsGetOrderDto3 = new FriendsGetOrderDto("NAME", 2, "name");
        NAME = friendsGetOrderDto3;
        FriendsGetOrderDto friendsGetOrderDto4 = new FriendsGetOrderDto("RANDOM", 3, "random");
        RANDOM = friendsGetOrderDto4;
        FriendsGetOrderDto friendsGetOrderDto5 = new FriendsGetOrderDto("SMART", 4, "smart");
        SMART = friendsGetOrderDto5;
        FriendsGetOrderDto[] friendsGetOrderDtoArr = {friendsGetOrderDto, friendsGetOrderDto2, friendsGetOrderDto3, friendsGetOrderDto4, friendsGetOrderDto5};
        $VALUES = friendsGetOrderDtoArr;
        $ENTRIES = new asp(friendsGetOrderDtoArr);
        CREATOR = new a();
    }

    private FriendsGetOrderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetOrderDto valueOf(String str) {
        return (FriendsGetOrderDto) Enum.valueOf(FriendsGetOrderDto.class, str);
    }

    public static FriendsGetOrderDto[] values() {
        return (FriendsGetOrderDto[]) $VALUES.clone();
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
