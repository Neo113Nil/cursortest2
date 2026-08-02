package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsFriendStatusStatusDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFriendStatusStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsFriendStatusStatusDto[] $VALUES;
    public static final Parcelable.Creator<FriendsFriendStatusStatusDto> CREATOR;

    @pmi0("2")
    public static final FriendsFriendStatusStatusDto INCOMING_REQUEST;

    @pmi0("3")
    public static final FriendsFriendStatusStatusDto IS_FRIEND;

    @pmi0("0")
    public static final FriendsFriendStatusStatusDto NOT_A_FRIEND;

    @pmi0("1")
    public static final FriendsFriendStatusStatusDto OUTCOMING_REQUEST;
    private final int value;

    /* compiled from: FriendsFriendStatusStatusDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFriendStatusStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFriendStatusStatusDto createFromParcel(Parcel parcel) {
            return FriendsFriendStatusStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFriendStatusStatusDto[] newArray(int i) {
            return new FriendsFriendStatusStatusDto[i];
        }
    }

    static {
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = new FriendsFriendStatusStatusDto("NOT_A_FRIEND", 0, 0);
        NOT_A_FRIEND = friendsFriendStatusStatusDto;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2 = new FriendsFriendStatusStatusDto("OUTCOMING_REQUEST", 1, 1);
        OUTCOMING_REQUEST = friendsFriendStatusStatusDto2;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto3 = new FriendsFriendStatusStatusDto("INCOMING_REQUEST", 2, 2);
        INCOMING_REQUEST = friendsFriendStatusStatusDto3;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto4 = new FriendsFriendStatusStatusDto("IS_FRIEND", 3, 3);
        IS_FRIEND = friendsFriendStatusStatusDto4;
        FriendsFriendStatusStatusDto[] friendsFriendStatusStatusDtoArr = {friendsFriendStatusStatusDto, friendsFriendStatusStatusDto2, friendsFriendStatusStatusDto3, friendsFriendStatusStatusDto4};
        $VALUES = friendsFriendStatusStatusDtoArr;
        $ENTRIES = new asp(friendsFriendStatusStatusDtoArr);
        CREATOR = new a();
    }

    private FriendsFriendStatusStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static FriendsFriendStatusStatusDto valueOf(String str) {
        return (FriendsFriendStatusStatusDto) Enum.valueOf(FriendsFriendStatusStatusDto.class, str);
    }

    public static FriendsFriendStatusStatusDto[] values() {
        return (FriendsFriendStatusStatusDto[]) $VALUES.clone();
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
