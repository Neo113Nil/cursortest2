package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsAddResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsAddResponseDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsAddResponseDto[] $VALUES;

    @pmi0("2")
    public static final FriendsAddResponseDto APPROVED;
    public static final Parcelable.Creator<FriendsAddResponseDto> CREATOR;

    @pmi0("4")
    public static final FriendsAddResponseDto RESEND;

    @pmi0("1")
    public static final FriendsAddResponseDto SEND;
    private final int value;

    /* compiled from: FriendsAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsAddResponseDto createFromParcel(Parcel parcel) {
            return FriendsAddResponseDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsAddResponseDto[] newArray(int i) {
            return new FriendsAddResponseDto[i];
        }
    }

    static {
        FriendsAddResponseDto friendsAddResponseDto = new FriendsAddResponseDto("SEND", 0, 1);
        SEND = friendsAddResponseDto;
        FriendsAddResponseDto friendsAddResponseDto2 = new FriendsAddResponseDto("APPROVED", 1, 2);
        APPROVED = friendsAddResponseDto2;
        FriendsAddResponseDto friendsAddResponseDto3 = new FriendsAddResponseDto("RESEND", 2, 4);
        RESEND = friendsAddResponseDto3;
        FriendsAddResponseDto[] friendsAddResponseDtoArr = {friendsAddResponseDto, friendsAddResponseDto2, friendsAddResponseDto3};
        $VALUES = friendsAddResponseDtoArr;
        $ENTRIES = new asp(friendsAddResponseDtoArr);
        CREATOR = new a();
    }

    private FriendsAddResponseDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static FriendsAddResponseDto valueOf(String str) {
        return (FriendsAddResponseDto) Enum.valueOf(FriendsAddResponseDto.class, str);
    }

    public static FriendsAddResponseDto[] values() {
        return (FriendsAddResponseDto[]) $VALUES.clone();
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
