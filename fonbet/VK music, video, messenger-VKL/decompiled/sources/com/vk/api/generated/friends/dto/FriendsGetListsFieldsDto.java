package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetListsFieldsDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetListsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetListsFieldsDto[] $VALUES;

    @pmi0("count")
    public static final FriendsGetListsFieldsDto COUNT;
    public static final Parcelable.Creator<FriendsGetListsFieldsDto> CREATOR;
    private final String value;

    /* compiled from: FriendsGetListsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetListsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetListsFieldsDto createFromParcel(Parcel parcel) {
            return FriendsGetListsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetListsFieldsDto[] newArray(int i) {
            return new FriendsGetListsFieldsDto[i];
        }
    }

    static {
        FriendsGetListsFieldsDto friendsGetListsFieldsDto = new FriendsGetListsFieldsDto("COUNT", 0, "count");
        COUNT = friendsGetListsFieldsDto;
        FriendsGetListsFieldsDto[] friendsGetListsFieldsDtoArr = {friendsGetListsFieldsDto};
        $VALUES = friendsGetListsFieldsDtoArr;
        $ENTRIES = new asp(friendsGetListsFieldsDtoArr);
        CREATOR = new a();
    }

    private FriendsGetListsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetListsFieldsDto valueOf(String str) {
        return (FriendsGetListsFieldsDto) Enum.valueOf(FriendsGetListsFieldsDto.class, str);
    }

    public static FriendsGetListsFieldsDto[] values() {
        return (FriendsGetListsFieldsDto[]) $VALUES.clone();
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
