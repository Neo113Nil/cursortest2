package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetFriendsListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetFriendsListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetFriendsListTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetFriendsListTypeDto> CREATOR;

    @pmi0("invite")
    public static final AppsGetFriendsListTypeDto INVITE;

    @pmi0("request")
    public static final AppsGetFriendsListTypeDto REQUEST;
    private final String value;

    /* compiled from: AppsGetFriendsListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetFriendsListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetFriendsListTypeDto createFromParcel(Parcel parcel) {
            return AppsGetFriendsListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetFriendsListTypeDto[] newArray(int i) {
            return new AppsGetFriendsListTypeDto[i];
        }
    }

    static {
        AppsGetFriendsListTypeDto appsGetFriendsListTypeDto = new AppsGetFriendsListTypeDto("INVITE", 0, "invite");
        INVITE = appsGetFriendsListTypeDto;
        AppsGetFriendsListTypeDto appsGetFriendsListTypeDto2 = new AppsGetFriendsListTypeDto("REQUEST", 1, "request");
        REQUEST = appsGetFriendsListTypeDto2;
        AppsGetFriendsListTypeDto[] appsGetFriendsListTypeDtoArr = {appsGetFriendsListTypeDto, appsGetFriendsListTypeDto2};
        $VALUES = appsGetFriendsListTypeDtoArr;
        $ENTRIES = new asp(appsGetFriendsListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsGetFriendsListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetFriendsListTypeDto valueOf(String str) {
        return (AppsGetFriendsListTypeDto) Enum.valueOf(AppsGetFriendsListTypeDto.class, str);
    }

    public static AppsGetFriendsListTypeDto[] values() {
        return (AppsGetFriendsListTypeDto[]) $VALUES.clone();
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
