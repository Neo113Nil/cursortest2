package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersSearchSexDto.kt */
/* loaded from: classes15.dex */
public final class UsersSearchSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersSearchSexDto[] $VALUES;

    @pmi0("0")
    public static final UsersSearchSexDto ANY;
    public static final Parcelable.Creator<UsersSearchSexDto> CREATOR;

    @pmi0("1")
    public static final UsersSearchSexDto FEMALE;

    @pmi0("2")
    public static final UsersSearchSexDto MALE;
    private final int value;

    /* compiled from: UsersSearchSexDto.kt */
    public static final class a implements Parcelable.Creator<UsersSearchSexDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSearchSexDto createFromParcel(Parcel parcel) {
            return UsersSearchSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSearchSexDto[] newArray(int i) {
            return new UsersSearchSexDto[i];
        }
    }

    static {
        UsersSearchSexDto usersSearchSexDto = new UsersSearchSexDto("ANY", 0, 0);
        ANY = usersSearchSexDto;
        UsersSearchSexDto usersSearchSexDto2 = new UsersSearchSexDto("FEMALE", 1, 1);
        FEMALE = usersSearchSexDto2;
        UsersSearchSexDto usersSearchSexDto3 = new UsersSearchSexDto("MALE", 2, 2);
        MALE = usersSearchSexDto3;
        UsersSearchSexDto[] usersSearchSexDtoArr = {usersSearchSexDto, usersSearchSexDto2, usersSearchSexDto3};
        $VALUES = usersSearchSexDtoArr;
        $ENTRIES = new asp(usersSearchSexDtoArr);
        CREATOR = new a();
    }

    private UsersSearchSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersSearchSexDto valueOf(String str) {
        return (UsersSearchSexDto) Enum.valueOf(UsersSearchSexDto.class, str);
    }

    public static UsersSearchSexDto[] values() {
        return (UsersSearchSexDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
