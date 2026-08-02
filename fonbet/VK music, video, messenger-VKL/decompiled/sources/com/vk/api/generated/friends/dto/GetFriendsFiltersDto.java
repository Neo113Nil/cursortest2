package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetFriendsFiltersDto.kt */
/* loaded from: classes14.dex */
public final class GetFriendsFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GetFriendsFiltersDto[] $VALUES;

    @pmi0("adult")
    public static final GetFriendsFiltersDto ADULT;

    @pmi0("blacklists")
    public static final GetFriendsFiltersDto BLACKLISTS;
    public static final Parcelable.Creator<GetFriendsFiltersDto> CREATOR;

    @pmi0("no_access")
    public static final GetFriendsFiltersDto NO_ACCESS;

    @pmi0("without_banned")
    public static final GetFriendsFiltersDto WITHOUT_BANNED;

    @pmi0("without_dead")
    public static final GetFriendsFiltersDto WITHOUT_DEAD;

    @pmi0("without_deleted")
    public static final GetFriendsFiltersDto WITHOUT_DELETED;
    private final String value;

    /* compiled from: GetFriendsFiltersDto.kt */
    public static final class a implements Parcelable.Creator<GetFriendsFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final GetFriendsFiltersDto createFromParcel(Parcel parcel) {
            return GetFriendsFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GetFriendsFiltersDto[] newArray(int i) {
            return new GetFriendsFiltersDto[i];
        }
    }

    static {
        GetFriendsFiltersDto getFriendsFiltersDto = new GetFriendsFiltersDto("ADULT", 0, "adult");
        ADULT = getFriendsFiltersDto;
        GetFriendsFiltersDto getFriendsFiltersDto2 = new GetFriendsFiltersDto("NO_ACCESS", 1, "no_access");
        NO_ACCESS = getFriendsFiltersDto2;
        GetFriendsFiltersDto getFriendsFiltersDto3 = new GetFriendsFiltersDto("BLACKLISTS", 2, "blacklists");
        BLACKLISTS = getFriendsFiltersDto3;
        GetFriendsFiltersDto getFriendsFiltersDto4 = new GetFriendsFiltersDto("WITHOUT_DEAD", 3, "without_dead");
        WITHOUT_DEAD = getFriendsFiltersDto4;
        GetFriendsFiltersDto getFriendsFiltersDto5 = new GetFriendsFiltersDto("WITHOUT_BANNED", 4, "without_banned");
        WITHOUT_BANNED = getFriendsFiltersDto5;
        GetFriendsFiltersDto getFriendsFiltersDto6 = new GetFriendsFiltersDto("WITHOUT_DELETED", 5, "without_deleted");
        WITHOUT_DELETED = getFriendsFiltersDto6;
        GetFriendsFiltersDto[] getFriendsFiltersDtoArr = {getFriendsFiltersDto, getFriendsFiltersDto2, getFriendsFiltersDto3, getFriendsFiltersDto4, getFriendsFiltersDto5, getFriendsFiltersDto6};
        $VALUES = getFriendsFiltersDtoArr;
        $ENTRIES = new asp(getFriendsFiltersDtoArr);
        CREATOR = new a();
    }

    private GetFriendsFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GetFriendsFiltersDto valueOf(String str) {
        return (GetFriendsFiltersDto) Enum.valueOf(GetFriendsFiltersDto.class, str);
    }

    public static GetFriendsFiltersDto[] values() {
        return (GetFriendsFiltersDto[]) $VALUES.clone();
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
