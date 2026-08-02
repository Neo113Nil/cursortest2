package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersSearchSortDto.kt */
/* loaded from: classes15.dex */
public final class UsersSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersSearchSortDto[] $VALUES;

    @pmi0("1")
    public static final UsersSearchSortDto BY_DATE_REGISTERED;

    @pmi0("0")
    public static final UsersSearchSortDto BY_RATING;
    public static final Parcelable.Creator<UsersSearchSortDto> CREATOR;
    private final int value;

    /* compiled from: UsersSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<UsersSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSearchSortDto createFromParcel(Parcel parcel) {
            return UsersSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSearchSortDto[] newArray(int i) {
            return new UsersSearchSortDto[i];
        }
    }

    static {
        UsersSearchSortDto usersSearchSortDto = new UsersSearchSortDto("BY_RATING", 0, 0);
        BY_RATING = usersSearchSortDto;
        UsersSearchSortDto usersSearchSortDto2 = new UsersSearchSortDto("BY_DATE_REGISTERED", 1, 1);
        BY_DATE_REGISTERED = usersSearchSortDto2;
        UsersSearchSortDto[] usersSearchSortDtoArr = {usersSearchSortDto, usersSearchSortDto2};
        $VALUES = usersSearchSortDtoArr;
        $ENTRIES = new asp(usersSearchSortDtoArr);
        CREATOR = new a();
    }

    private UsersSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersSearchSortDto valueOf(String str) {
        return (UsersSearchSortDto) Enum.valueOf(UsersSearchSortDto.class, str);
    }

    public static UsersSearchSortDto[] values() {
        return (UsersSearchSortDto[]) $VALUES.clone();
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
