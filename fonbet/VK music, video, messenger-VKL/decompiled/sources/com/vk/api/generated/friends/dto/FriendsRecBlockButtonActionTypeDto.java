package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockButtonActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockButtonActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockButtonActionTypeDto[] $VALUES;

    @pmi0("add_friend")
    public static final FriendsRecBlockButtonActionTypeDto ADD_FRIEND;
    public static final Parcelable.Creator<FriendsRecBlockButtonActionTypeDto> CREATOR;

    @pmi0("delete_friend")
    public static final FriendsRecBlockButtonActionTypeDto DELETE_FRIEND;
    private final String value;

    /* compiled from: FriendsRecBlockButtonActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockButtonActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonActionTypeDto createFromParcel(Parcel parcel) {
            return FriendsRecBlockButtonActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonActionTypeDto[] newArray(int i) {
            return new FriendsRecBlockButtonActionTypeDto[i];
        }
    }

    static {
        FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto = new FriendsRecBlockButtonActionTypeDto("ADD_FRIEND", 0, "add_friend");
        ADD_FRIEND = friendsRecBlockButtonActionTypeDto;
        FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto2 = new FriendsRecBlockButtonActionTypeDto("DELETE_FRIEND", 1, "delete_friend");
        DELETE_FRIEND = friendsRecBlockButtonActionTypeDto2;
        FriendsRecBlockButtonActionTypeDto[] friendsRecBlockButtonActionTypeDtoArr = {friendsRecBlockButtonActionTypeDto, friendsRecBlockButtonActionTypeDto2};
        $VALUES = friendsRecBlockButtonActionTypeDtoArr;
        $ENTRIES = new asp(friendsRecBlockButtonActionTypeDtoArr);
        CREATOR = new a();
    }

    private FriendsRecBlockButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecBlockButtonActionTypeDto valueOf(String str) {
        return (FriendsRecBlockButtonActionTypeDto) Enum.valueOf(FriendsRecBlockButtonActionTypeDto.class, str);
    }

    public static FriendsRecBlockButtonActionTypeDto[] values() {
        return (FriendsRecBlockButtonActionTypeDto[]) $VALUES.clone();
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
