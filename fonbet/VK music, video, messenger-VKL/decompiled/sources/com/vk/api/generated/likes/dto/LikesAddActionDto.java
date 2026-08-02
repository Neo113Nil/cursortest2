package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesAddActionDto.kt */
/* loaded from: classes14.dex */
public final class LikesAddActionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesAddActionDto[] $VALUES;

    @pmi0("button")
    public static final LikesAddActionDto BUTTON;
    public static final Parcelable.Creator<LikesAddActionDto> CREATOR;

    @pmi0("double_tap")
    public static final LikesAddActionDto DOUBLE_TAP;

    @pmi0("reactions_modal")
    public static final LikesAddActionDto REACTIONS_MODAL;

    @pmi0("reactions_popup")
    public static final LikesAddActionDto REACTIONS_POPUP;
    private final String value;

    /* compiled from: LikesAddActionDto.kt */
    public static final class a implements Parcelable.Creator<LikesAddActionDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesAddActionDto createFromParcel(Parcel parcel) {
            return LikesAddActionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesAddActionDto[] newArray(int i) {
            return new LikesAddActionDto[i];
        }
    }

    static {
        LikesAddActionDto likesAddActionDto = new LikesAddActionDto("BUTTON", 0, "button");
        BUTTON = likesAddActionDto;
        LikesAddActionDto likesAddActionDto2 = new LikesAddActionDto("DOUBLE_TAP", 1, "double_tap");
        DOUBLE_TAP = likesAddActionDto2;
        LikesAddActionDto likesAddActionDto3 = new LikesAddActionDto("REACTIONS_MODAL", 2, "reactions_modal");
        REACTIONS_MODAL = likesAddActionDto3;
        LikesAddActionDto likesAddActionDto4 = new LikesAddActionDto("REACTIONS_POPUP", 3, "reactions_popup");
        REACTIONS_POPUP = likesAddActionDto4;
        LikesAddActionDto[] likesAddActionDtoArr = {likesAddActionDto, likesAddActionDto2, likesAddActionDto3, likesAddActionDto4};
        $VALUES = likesAddActionDtoArr;
        $ENTRIES = new asp(likesAddActionDtoArr);
        CREATOR = new a();
    }

    private LikesAddActionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesAddActionDto valueOf(String str) {
        return (LikesAddActionDto) Enum.valueOf(LikesAddActionDto.class, str);
    }

    public static LikesAddActionDto[] values() {
        return (LikesAddActionDto[]) $VALUES.clone();
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
