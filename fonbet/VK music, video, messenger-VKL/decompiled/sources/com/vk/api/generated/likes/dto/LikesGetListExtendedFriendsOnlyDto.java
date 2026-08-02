package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListExtendedFriendsOnlyDto.kt */
/* loaded from: classes14.dex */
public final class LikesGetListExtendedFriendsOnlyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListExtendedFriendsOnlyDto[] $VALUES;
    public static final Parcelable.Creator<LikesGetListExtendedFriendsOnlyDto> CREATOR;

    @pmi0("0")
    public static final LikesGetListExtendedFriendsOnlyDto TYPE_0;

    @pmi0("1")
    public static final LikesGetListExtendedFriendsOnlyDto TYPE_1;

    @pmi0("2")
    public static final LikesGetListExtendedFriendsOnlyDto TYPE_2;

    @pmi0("3")
    public static final LikesGetListExtendedFriendsOnlyDto TYPE_3;
    private final int value;

    /* compiled from: LikesGetListExtendedFriendsOnlyDto.kt */
    public static final class a implements Parcelable.Creator<LikesGetListExtendedFriendsOnlyDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedFriendsOnlyDto createFromParcel(Parcel parcel) {
            return LikesGetListExtendedFriendsOnlyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedFriendsOnlyDto[] newArray(int i) {
            return new LikesGetListExtendedFriendsOnlyDto[i];
        }
    }

    static {
        LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto = new LikesGetListExtendedFriendsOnlyDto("TYPE_0", 0, 0);
        TYPE_0 = likesGetListExtendedFriendsOnlyDto;
        LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto2 = new LikesGetListExtendedFriendsOnlyDto("TYPE_1", 1, 1);
        TYPE_1 = likesGetListExtendedFriendsOnlyDto2;
        LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto3 = new LikesGetListExtendedFriendsOnlyDto("TYPE_2", 2, 2);
        TYPE_2 = likesGetListExtendedFriendsOnlyDto3;
        LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto4 = new LikesGetListExtendedFriendsOnlyDto("TYPE_3", 3, 3);
        TYPE_3 = likesGetListExtendedFriendsOnlyDto4;
        LikesGetListExtendedFriendsOnlyDto[] likesGetListExtendedFriendsOnlyDtoArr = {likesGetListExtendedFriendsOnlyDto, likesGetListExtendedFriendsOnlyDto2, likesGetListExtendedFriendsOnlyDto3, likesGetListExtendedFriendsOnlyDto4};
        $VALUES = likesGetListExtendedFriendsOnlyDtoArr;
        $ENTRIES = new asp(likesGetListExtendedFriendsOnlyDtoArr);
        CREATOR = new a();
    }

    private LikesGetListExtendedFriendsOnlyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static LikesGetListExtendedFriendsOnlyDto valueOf(String str) {
        return (LikesGetListExtendedFriendsOnlyDto) Enum.valueOf(LikesGetListExtendedFriendsOnlyDto.class, str);
    }

    public static LikesGetListExtendedFriendsOnlyDto[] values() {
        return (LikesGetListExtendedFriendsOnlyDto[]) $VALUES.clone();
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
