package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersSearchFiltersDto.kt */
/* loaded from: classes15.dex */
public final class UsersSearchFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersSearchFiltersDto[] $VALUES;
    public static final Parcelable.Creator<UsersSearchFiltersDto> CREATOR;

    @pmi0("group_members")
    public static final UsersSearchFiltersDto GROUP_MEMBERS;
    private final String value;

    /* compiled from: UsersSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<UsersSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSearchFiltersDto createFromParcel(Parcel parcel) {
            return UsersSearchFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSearchFiltersDto[] newArray(int i) {
            return new UsersSearchFiltersDto[i];
        }
    }

    static {
        UsersSearchFiltersDto usersSearchFiltersDto = new UsersSearchFiltersDto("GROUP_MEMBERS", 0, "group_members");
        GROUP_MEMBERS = usersSearchFiltersDto;
        UsersSearchFiltersDto[] usersSearchFiltersDtoArr = {usersSearchFiltersDto};
        $VALUES = usersSearchFiltersDtoArr;
        $ENTRIES = new asp(usersSearchFiltersDtoArr);
        CREATOR = new a();
    }

    private UsersSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersSearchFiltersDto valueOf(String str) {
        return (UsersSearchFiltersDto) Enum.valueOf(UsersSearchFiltersDto.class, str);
    }

    public static UsersSearchFiltersDto[] values() {
        return (UsersSearchFiltersDto[]) $VALUES.clone();
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
