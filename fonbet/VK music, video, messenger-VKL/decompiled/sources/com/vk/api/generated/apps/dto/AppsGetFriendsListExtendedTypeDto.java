package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetFriendsListExtendedTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetFriendsListExtendedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetFriendsListExtendedTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetFriendsListExtendedTypeDto> CREATOR;

    @pmi0("invite")
    public static final AppsGetFriendsListExtendedTypeDto INVITE;

    @pmi0("request")
    public static final AppsGetFriendsListExtendedTypeDto REQUEST;
    private final String value;

    /* compiled from: AppsGetFriendsListExtendedTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetFriendsListExtendedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetFriendsListExtendedTypeDto createFromParcel(Parcel parcel) {
            return AppsGetFriendsListExtendedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetFriendsListExtendedTypeDto[] newArray(int i) {
            return new AppsGetFriendsListExtendedTypeDto[i];
        }
    }

    static {
        AppsGetFriendsListExtendedTypeDto appsGetFriendsListExtendedTypeDto = new AppsGetFriendsListExtendedTypeDto("INVITE", 0, "invite");
        INVITE = appsGetFriendsListExtendedTypeDto;
        AppsGetFriendsListExtendedTypeDto appsGetFriendsListExtendedTypeDto2 = new AppsGetFriendsListExtendedTypeDto("REQUEST", 1, "request");
        REQUEST = appsGetFriendsListExtendedTypeDto2;
        AppsGetFriendsListExtendedTypeDto[] appsGetFriendsListExtendedTypeDtoArr = {appsGetFriendsListExtendedTypeDto, appsGetFriendsListExtendedTypeDto2};
        $VALUES = appsGetFriendsListExtendedTypeDtoArr;
        $ENTRIES = new asp(appsGetFriendsListExtendedTypeDtoArr);
        CREATOR = new a();
    }

    private AppsGetFriendsListExtendedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetFriendsListExtendedTypeDto valueOf(String str) {
        return (AppsGetFriendsListExtendedTypeDto) Enum.valueOf(AppsGetFriendsListExtendedTypeDto.class, str);
    }

    public static AppsGetFriendsListExtendedTypeDto[] values() {
        return (AppsGetFriendsListExtendedTypeDto[]) $VALUES.clone();
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
