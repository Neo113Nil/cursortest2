package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersGetFollowersSortDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetFollowersSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersGetFollowersSortDto[] $VALUES;
    public static final Parcelable.Creator<UsersGetFollowersSortDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final UsersGetFollowersSortDto DEFAULT;

    @pmi0("smart")
    public static final UsersGetFollowersSortDto SMART;
    private final String value;

    /* compiled from: UsersGetFollowersSortDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetFollowersSortDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetFollowersSortDto createFromParcel(Parcel parcel) {
            return UsersGetFollowersSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetFollowersSortDto[] newArray(int i) {
            return new UsersGetFollowersSortDto[i];
        }
    }

    static {
        UsersGetFollowersSortDto usersGetFollowersSortDto = new UsersGetFollowersSortDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = usersGetFollowersSortDto;
        UsersGetFollowersSortDto usersGetFollowersSortDto2 = new UsersGetFollowersSortDto("SMART", 1, "smart");
        SMART = usersGetFollowersSortDto2;
        UsersGetFollowersSortDto[] usersGetFollowersSortDtoArr = {usersGetFollowersSortDto, usersGetFollowersSortDto2};
        $VALUES = usersGetFollowersSortDtoArr;
        $ENTRIES = new asp(usersGetFollowersSortDtoArr);
        CREATOR = new a();
    }

    private UsersGetFollowersSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersGetFollowersSortDto valueOf(String str) {
        return (UsersGetFollowersSortDto) Enum.valueOf(UsersGetFollowersSortDto.class, str);
    }

    public static UsersGetFollowersSortDto[] values() {
        return (UsersGetFollowersSortDto[]) $VALUES.clone();
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
