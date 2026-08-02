package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsSetFollowersModeModeStatusDto.kt */
/* loaded from: classes14.dex */
public final class FriendsSetFollowersModeModeStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsSetFollowersModeModeStatusDto[] $VALUES;

    @pmi0("all_users")
    public static final FriendsSetFollowersModeModeStatusDto ALL_USERS;
    public static final Parcelable.Creator<FriendsSetFollowersModeModeStatusDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final FriendsSetFollowersModeModeStatusDto DISABLED;
    private final String value;

    /* compiled from: FriendsSetFollowersModeModeStatusDto.kt */
    public static final class a implements Parcelable.Creator<FriendsSetFollowersModeModeStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsSetFollowersModeModeStatusDto createFromParcel(Parcel parcel) {
            return FriendsSetFollowersModeModeStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsSetFollowersModeModeStatusDto[] newArray(int i) {
            return new FriendsSetFollowersModeModeStatusDto[i];
        }
    }

    static {
        FriendsSetFollowersModeModeStatusDto friendsSetFollowersModeModeStatusDto = new FriendsSetFollowersModeModeStatusDto("ALL_USERS", 0, "all_users");
        ALL_USERS = friendsSetFollowersModeModeStatusDto;
        FriendsSetFollowersModeModeStatusDto friendsSetFollowersModeModeStatusDto2 = new FriendsSetFollowersModeModeStatusDto("DISABLED", 1, C4217a2.e);
        DISABLED = friendsSetFollowersModeModeStatusDto2;
        FriendsSetFollowersModeModeStatusDto[] friendsSetFollowersModeModeStatusDtoArr = {friendsSetFollowersModeModeStatusDto, friendsSetFollowersModeModeStatusDto2};
        $VALUES = friendsSetFollowersModeModeStatusDtoArr;
        $ENTRIES = new asp(friendsSetFollowersModeModeStatusDtoArr);
        CREATOR = new a();
    }

    private FriendsSetFollowersModeModeStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsSetFollowersModeModeStatusDto valueOf(String str) {
        return (FriendsSetFollowersModeModeStatusDto) Enum.valueOf(FriendsSetFollowersModeModeStatusDto.class, str);
    }

    public static FriendsSetFollowersModeModeStatusDto[] values() {
        return (FriendsSetFollowersModeModeStatusDto[]) $VALUES.clone();
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
