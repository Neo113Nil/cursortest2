package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickersSubscribePackAuthorRefDto.kt */
/* loaded from: classes15.dex */
public final class StickersSubscribePackAuthorRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickersSubscribePackAuthorRefDto[] $VALUES;

    @pmi0("autotests")
    public static final StickersSubscribePackAuthorRefDto AUTOTESTS;
    public static final Parcelable.Creator<StickersSubscribePackAuthorRefDto> CREATOR;

    @pmi0("pack_details")
    public static final StickersSubscribePackAuthorRefDto PACK_DETAILS;

    @pmi0("pack_recommendations_all_author_packs")
    public static final StickersSubscribePackAuthorRefDto PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS;

    @pmi0("pack_recommendations_author_packs")
    public static final StickersSubscribePackAuthorRefDto PACK_RECOMMENDATIONS_AUTHOR_PACKS;
    private final String value;

    /* compiled from: StickersSubscribePackAuthorRefDto.kt */
    public static final class a implements Parcelable.Creator<StickersSubscribePackAuthorRefDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSubscribePackAuthorRefDto createFromParcel(Parcel parcel) {
            return StickersSubscribePackAuthorRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSubscribePackAuthorRefDto[] newArray(int i) {
            return new StickersSubscribePackAuthorRefDto[i];
        }
    }

    static {
        StickersSubscribePackAuthorRefDto stickersSubscribePackAuthorRefDto = new StickersSubscribePackAuthorRefDto("AUTOTESTS", 0, "autotests");
        AUTOTESTS = stickersSubscribePackAuthorRefDto;
        StickersSubscribePackAuthorRefDto stickersSubscribePackAuthorRefDto2 = new StickersSubscribePackAuthorRefDto("PACK_DETAILS", 1, "pack_details");
        PACK_DETAILS = stickersSubscribePackAuthorRefDto2;
        StickersSubscribePackAuthorRefDto stickersSubscribePackAuthorRefDto3 = new StickersSubscribePackAuthorRefDto("PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS", 2, "pack_recommendations_all_author_packs");
        PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS = stickersSubscribePackAuthorRefDto3;
        StickersSubscribePackAuthorRefDto stickersSubscribePackAuthorRefDto4 = new StickersSubscribePackAuthorRefDto("PACK_RECOMMENDATIONS_AUTHOR_PACKS", 3, "pack_recommendations_author_packs");
        PACK_RECOMMENDATIONS_AUTHOR_PACKS = stickersSubscribePackAuthorRefDto4;
        StickersSubscribePackAuthorRefDto[] stickersSubscribePackAuthorRefDtoArr = {stickersSubscribePackAuthorRefDto, stickersSubscribePackAuthorRefDto2, stickersSubscribePackAuthorRefDto3, stickersSubscribePackAuthorRefDto4};
        $VALUES = stickersSubscribePackAuthorRefDtoArr;
        $ENTRIES = new asp(stickersSubscribePackAuthorRefDtoArr);
        CREATOR = new a();
    }

    private StickersSubscribePackAuthorRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StickersSubscribePackAuthorRefDto valueOf(String str) {
        return (StickersSubscribePackAuthorRefDto) Enum.valueOf(StickersSubscribePackAuthorRefDto.class, str);
    }

    public static StickersSubscribePackAuthorRefDto[] values() {
        return (StickersSubscribePackAuthorRefDto[]) $VALUES.clone();
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
