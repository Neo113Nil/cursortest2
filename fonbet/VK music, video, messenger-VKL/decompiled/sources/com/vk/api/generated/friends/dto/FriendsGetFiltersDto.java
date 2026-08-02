package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetFiltersDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetFiltersDto[] $VALUES;

    @pmi0("adult")
    public static final FriendsGetFiltersDto ADULT;

    @pmi0("blacklists")
    public static final FriendsGetFiltersDto BLACKLISTS;
    public static final Parcelable.Creator<FriendsGetFiltersDto> CREATOR;

    @pmi0("no_access")
    public static final FriendsGetFiltersDto NO_ACCESS;

    @pmi0("without_banned")
    public static final FriendsGetFiltersDto WITHOUT_BANNED;

    @pmi0("without_dead")
    public static final FriendsGetFiltersDto WITHOUT_DEAD;

    @pmi0("without_deleted")
    public static final FriendsGetFiltersDto WITHOUT_DELETED;
    private final String value;

    /* compiled from: FriendsGetFiltersDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetFiltersDto createFromParcel(Parcel parcel) {
            return FriendsGetFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetFiltersDto[] newArray(int i) {
            return new FriendsGetFiltersDto[i];
        }
    }

    static {
        FriendsGetFiltersDto friendsGetFiltersDto = new FriendsGetFiltersDto("ADULT", 0, "adult");
        ADULT = friendsGetFiltersDto;
        FriendsGetFiltersDto friendsGetFiltersDto2 = new FriendsGetFiltersDto("NO_ACCESS", 1, "no_access");
        NO_ACCESS = friendsGetFiltersDto2;
        FriendsGetFiltersDto friendsGetFiltersDto3 = new FriendsGetFiltersDto("BLACKLISTS", 2, "blacklists");
        BLACKLISTS = friendsGetFiltersDto3;
        FriendsGetFiltersDto friendsGetFiltersDto4 = new FriendsGetFiltersDto("WITHOUT_DEAD", 3, "without_dead");
        WITHOUT_DEAD = friendsGetFiltersDto4;
        FriendsGetFiltersDto friendsGetFiltersDto5 = new FriendsGetFiltersDto("WITHOUT_BANNED", 4, "without_banned");
        WITHOUT_BANNED = friendsGetFiltersDto5;
        FriendsGetFiltersDto friendsGetFiltersDto6 = new FriendsGetFiltersDto("WITHOUT_DELETED", 5, "without_deleted");
        WITHOUT_DELETED = friendsGetFiltersDto6;
        FriendsGetFiltersDto[] friendsGetFiltersDtoArr = {friendsGetFiltersDto, friendsGetFiltersDto2, friendsGetFiltersDto3, friendsGetFiltersDto4, friendsGetFiltersDto5, friendsGetFiltersDto6};
        $VALUES = friendsGetFiltersDtoArr;
        $ENTRIES = new asp(friendsGetFiltersDtoArr);
        CREATOR = new a();
    }

    private FriendsGetFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetFiltersDto valueOf(String str) {
        return (FriendsGetFiltersDto) Enum.valueOf(FriendsGetFiltersDto.class, str);
    }

    public static FriendsGetFiltersDto[] values() {
        return (FriendsGetFiltersDto[]) $VALUES.clone();
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
