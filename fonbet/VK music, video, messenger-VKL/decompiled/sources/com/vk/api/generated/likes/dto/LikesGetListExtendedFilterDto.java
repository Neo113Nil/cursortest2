package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListExtendedFilterDto.kt */
/* loaded from: classes14.dex */
public final class LikesGetListExtendedFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListExtendedFilterDto[] $VALUES;

    @pmi0("copies")
    public static final LikesGetListExtendedFilterDto COPIES;
    public static final Parcelable.Creator<LikesGetListExtendedFilterDto> CREATOR;

    @pmi0("like")
    public static final LikesGetListExtendedFilterDto LIKE;

    @pmi0("likes")
    public static final LikesGetListExtendedFilterDto LIKES;
    private final String value;

    /* compiled from: LikesGetListExtendedFilterDto.kt */
    public static final class a implements Parcelable.Creator<LikesGetListExtendedFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedFilterDto createFromParcel(Parcel parcel) {
            return LikesGetListExtendedFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedFilterDto[] newArray(int i) {
            return new LikesGetListExtendedFilterDto[i];
        }
    }

    static {
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto = new LikesGetListExtendedFilterDto("COPIES", 0, "copies");
        COPIES = likesGetListExtendedFilterDto;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto2 = new LikesGetListExtendedFilterDto("LIKE", 1, "like");
        LIKE = likesGetListExtendedFilterDto2;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto3 = new LikesGetListExtendedFilterDto("LIKES", 2, "likes");
        LIKES = likesGetListExtendedFilterDto3;
        LikesGetListExtendedFilterDto[] likesGetListExtendedFilterDtoArr = {likesGetListExtendedFilterDto, likesGetListExtendedFilterDto2, likesGetListExtendedFilterDto3};
        $VALUES = likesGetListExtendedFilterDtoArr;
        $ENTRIES = new asp(likesGetListExtendedFilterDtoArr);
        CREATOR = new a();
    }

    private LikesGetListExtendedFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesGetListExtendedFilterDto valueOf(String str) {
        return (LikesGetListExtendedFilterDto) Enum.valueOf(LikesGetListExtendedFilterDto.class, str);
    }

    public static LikesGetListExtendedFilterDto[] values() {
        return (LikesGetListExtendedFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
