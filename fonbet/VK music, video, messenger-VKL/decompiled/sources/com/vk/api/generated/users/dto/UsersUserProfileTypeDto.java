package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersUserProfileTypeDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserProfileTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersUserProfileTypeDto[] $VALUES;
    public static final Parcelable.Creator<UsersUserProfileTypeDto> CREATOR;

    @pmi0("2")
    public static final UsersUserProfileTypeDto EDU;

    @pmi0("0")
    public static final UsersUserProfileTypeDto NORMAL;

    @pmi0("4")
    public static final UsersUserProfileTypeDto RELATED;
    private final int value;

    /* compiled from: UsersUserProfileTypeDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserProfileTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserProfileTypeDto createFromParcel(Parcel parcel) {
            return UsersUserProfileTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserProfileTypeDto[] newArray(int i) {
            return new UsersUserProfileTypeDto[i];
        }
    }

    static {
        UsersUserProfileTypeDto usersUserProfileTypeDto = new UsersUserProfileTypeDto("NORMAL", 0, 0);
        NORMAL = usersUserProfileTypeDto;
        UsersUserProfileTypeDto usersUserProfileTypeDto2 = new UsersUserProfileTypeDto("EDU", 1, 2);
        EDU = usersUserProfileTypeDto2;
        UsersUserProfileTypeDto usersUserProfileTypeDto3 = new UsersUserProfileTypeDto("RELATED", 2, 4);
        RELATED = usersUserProfileTypeDto3;
        UsersUserProfileTypeDto[] usersUserProfileTypeDtoArr = {usersUserProfileTypeDto, usersUserProfileTypeDto2, usersUserProfileTypeDto3};
        $VALUES = usersUserProfileTypeDtoArr;
        $ENTRIES = new asp(usersUserProfileTypeDtoArr);
        CREATOR = new a();
    }

    private UsersUserProfileTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersUserProfileTypeDto valueOf(String str) {
        return (UsersUserProfileTypeDto) Enum.valueOf(UsersUserProfileTypeDto.class, str);
    }

    public static UsersUserProfileTypeDto[] values() {
        return (UsersUserProfileTypeDto[]) $VALUES.clone();
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
