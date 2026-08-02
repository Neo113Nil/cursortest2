package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListFilterDto.kt */
/* loaded from: classes14.dex */
public final class LikesGetListFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListFilterDto[] $VALUES;

    @pmi0("copies")
    public static final LikesGetListFilterDto COPIES;
    public static final Parcelable.Creator<LikesGetListFilterDto> CREATOR;

    @pmi0("like")
    public static final LikesGetListFilterDto LIKE;

    @pmi0("likes")
    public static final LikesGetListFilterDto LIKES;
    private final String value;

    /* compiled from: LikesGetListFilterDto.kt */
    public static final class a implements Parcelable.Creator<LikesGetListFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesGetListFilterDto createFromParcel(Parcel parcel) {
            return LikesGetListFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesGetListFilterDto[] newArray(int i) {
            return new LikesGetListFilterDto[i];
        }
    }

    static {
        LikesGetListFilterDto likesGetListFilterDto = new LikesGetListFilterDto("COPIES", 0, "copies");
        COPIES = likesGetListFilterDto;
        LikesGetListFilterDto likesGetListFilterDto2 = new LikesGetListFilterDto("LIKE", 1, "like");
        LIKE = likesGetListFilterDto2;
        LikesGetListFilterDto likesGetListFilterDto3 = new LikesGetListFilterDto("LIKES", 2, "likes");
        LIKES = likesGetListFilterDto3;
        LikesGetListFilterDto[] likesGetListFilterDtoArr = {likesGetListFilterDto, likesGetListFilterDto2, likesGetListFilterDto3};
        $VALUES = likesGetListFilterDtoArr;
        $ENTRIES = new asp(likesGetListFilterDtoArr);
        CREATOR = new a();
    }

    private LikesGetListFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesGetListFilterDto valueOf(String str) {
        return (LikesGetListFilterDto) Enum.valueOf(LikesGetListFilterDto.class, str);
    }

    public static LikesGetListFilterDto[] values() {
        return (LikesGetListFilterDto[]) $VALUES.clone();
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
