package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsSearchFiltersDto.kt */
/* loaded from: classes14.dex */
public final class FriendsSearchFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsSearchFiltersDto[] $VALUES;
    public static final Parcelable.Creator<FriendsSearchFiltersDto> CREATOR;

    @pmi0("without_banned")
    public static final FriendsSearchFiltersDto WITHOUT_BANNED;

    @pmi0("without_dead")
    public static final FriendsSearchFiltersDto WITHOUT_DEAD;

    @pmi0("without_deleted")
    public static final FriendsSearchFiltersDto WITHOUT_DELETED;
    private final String value;

    /* compiled from: FriendsSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<FriendsSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsSearchFiltersDto createFromParcel(Parcel parcel) {
            return FriendsSearchFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsSearchFiltersDto[] newArray(int i) {
            return new FriendsSearchFiltersDto[i];
        }
    }

    static {
        FriendsSearchFiltersDto friendsSearchFiltersDto = new FriendsSearchFiltersDto("WITHOUT_DEAD", 0, "without_dead");
        WITHOUT_DEAD = friendsSearchFiltersDto;
        FriendsSearchFiltersDto friendsSearchFiltersDto2 = new FriendsSearchFiltersDto("WITHOUT_BANNED", 1, "without_banned");
        WITHOUT_BANNED = friendsSearchFiltersDto2;
        FriendsSearchFiltersDto friendsSearchFiltersDto3 = new FriendsSearchFiltersDto("WITHOUT_DELETED", 2, "without_deleted");
        WITHOUT_DELETED = friendsSearchFiltersDto3;
        FriendsSearchFiltersDto[] friendsSearchFiltersDtoArr = {friendsSearchFiltersDto, friendsSearchFiltersDto2, friendsSearchFiltersDto3};
        $VALUES = friendsSearchFiltersDtoArr;
        $ENTRIES = new asp(friendsSearchFiltersDtoArr);
        CREATOR = new a();
    }

    private FriendsSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsSearchFiltersDto valueOf(String str) {
        return (FriendsSearchFiltersDto) Enum.valueOf(FriendsSearchFiltersDto.class, str);
    }

    public static FriendsSearchFiltersDto[] values() {
        return (FriendsSearchFiltersDto[]) $VALUES.clone();
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
