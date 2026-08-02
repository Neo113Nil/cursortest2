package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickersUnSubscribePackAuthorRefDto.kt */
/* loaded from: classes15.dex */
public final class StickersUnSubscribePackAuthorRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickersUnSubscribePackAuthorRefDto[] $VALUES;

    @pmi0("autotests")
    public static final StickersUnSubscribePackAuthorRefDto AUTOTESTS;
    public static final Parcelable.Creator<StickersUnSubscribePackAuthorRefDto> CREATOR;

    @pmi0("pack_details")
    public static final StickersUnSubscribePackAuthorRefDto PACK_DETAILS;

    @pmi0("pack_recommendations_all_author_packs")
    public static final StickersUnSubscribePackAuthorRefDto PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS;

    @pmi0("pack_recommendations_author_packs")
    public static final StickersUnSubscribePackAuthorRefDto PACK_RECOMMENDATIONS_AUTHOR_PACKS;
    private final String value;

    /* compiled from: StickersUnSubscribePackAuthorRefDto.kt */
    public static final class a implements Parcelable.Creator<StickersUnSubscribePackAuthorRefDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUnSubscribePackAuthorRefDto createFromParcel(Parcel parcel) {
            return StickersUnSubscribePackAuthorRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUnSubscribePackAuthorRefDto[] newArray(int i) {
            return new StickersUnSubscribePackAuthorRefDto[i];
        }
    }

    static {
        StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto = new StickersUnSubscribePackAuthorRefDto("AUTOTESTS", 0, "autotests");
        AUTOTESTS = stickersUnSubscribePackAuthorRefDto;
        StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto2 = new StickersUnSubscribePackAuthorRefDto("PACK_DETAILS", 1, "pack_details");
        PACK_DETAILS = stickersUnSubscribePackAuthorRefDto2;
        StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto3 = new StickersUnSubscribePackAuthorRefDto("PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS", 2, "pack_recommendations_all_author_packs");
        PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS = stickersUnSubscribePackAuthorRefDto3;
        StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto4 = new StickersUnSubscribePackAuthorRefDto("PACK_RECOMMENDATIONS_AUTHOR_PACKS", 3, "pack_recommendations_author_packs");
        PACK_RECOMMENDATIONS_AUTHOR_PACKS = stickersUnSubscribePackAuthorRefDto4;
        StickersUnSubscribePackAuthorRefDto[] stickersUnSubscribePackAuthorRefDtoArr = {stickersUnSubscribePackAuthorRefDto, stickersUnSubscribePackAuthorRefDto2, stickersUnSubscribePackAuthorRefDto3, stickersUnSubscribePackAuthorRefDto4};
        $VALUES = stickersUnSubscribePackAuthorRefDtoArr;
        $ENTRIES = new asp(stickersUnSubscribePackAuthorRefDtoArr);
        CREATOR = new a();
    }

    private StickersUnSubscribePackAuthorRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StickersUnSubscribePackAuthorRefDto valueOf(String str) {
        return (StickersUnSubscribePackAuthorRefDto) Enum.valueOf(StickersUnSubscribePackAuthorRefDto.class, str);
    }

    public static StickersUnSubscribePackAuthorRefDto[] values() {
        return (StickersUnSubscribePackAuthorRefDto[]) $VALUES.clone();
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
