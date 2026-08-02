package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSmartTvInputTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSmartTvInputTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSmartTvInputTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchSmartTvInputTypeDto> CREATOR;

    @pmi0("google_speech_to_text")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto GOOGLE_SPEECH_TO_TEXT;

    @pmi0("keyboard")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto KEYBOARD;

    @pmi0("keyboard_search_button")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto KEYBOARD_SEARCH_BUTTON;

    @pmi0("marusia_speech_to_text")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto MARUSIA_SPEECH_TO_TEXT;

    @pmi0("preset_from_link")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto PRESET_FROM_LINK;

    @pmi0("suggest")
    public static final CatalogGetVideoSearchSmartTvInputTypeDto SUGGEST;
    private final String value;

    /* compiled from: CatalogGetVideoSearchSmartTvInputTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSmartTvInputTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvInputTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSmartTvInputTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvInputTypeDto[] newArray(int i) {
            return new CatalogGetVideoSearchSmartTvInputTypeDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto = new CatalogGetVideoSearchSmartTvInputTypeDto("GOOGLE_SPEECH_TO_TEXT", 0, "google_speech_to_text");
        GOOGLE_SPEECH_TO_TEXT = catalogGetVideoSearchSmartTvInputTypeDto;
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto2 = new CatalogGetVideoSearchSmartTvInputTypeDto("KEYBOARD", 1, "keyboard");
        KEYBOARD = catalogGetVideoSearchSmartTvInputTypeDto2;
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto3 = new CatalogGetVideoSearchSmartTvInputTypeDto("KEYBOARD_SEARCH_BUTTON", 2, "keyboard_search_button");
        KEYBOARD_SEARCH_BUTTON = catalogGetVideoSearchSmartTvInputTypeDto3;
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto4 = new CatalogGetVideoSearchSmartTvInputTypeDto("MARUSIA_SPEECH_TO_TEXT", 3, "marusia_speech_to_text");
        MARUSIA_SPEECH_TO_TEXT = catalogGetVideoSearchSmartTvInputTypeDto4;
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto5 = new CatalogGetVideoSearchSmartTvInputTypeDto("PRESET_FROM_LINK", 4, "preset_from_link");
        PRESET_FROM_LINK = catalogGetVideoSearchSmartTvInputTypeDto5;
        CatalogGetVideoSearchSmartTvInputTypeDto catalogGetVideoSearchSmartTvInputTypeDto6 = new CatalogGetVideoSearchSmartTvInputTypeDto("SUGGEST", 5, "suggest");
        SUGGEST = catalogGetVideoSearchSmartTvInputTypeDto6;
        CatalogGetVideoSearchSmartTvInputTypeDto[] catalogGetVideoSearchSmartTvInputTypeDtoArr = {catalogGetVideoSearchSmartTvInputTypeDto, catalogGetVideoSearchSmartTvInputTypeDto2, catalogGetVideoSearchSmartTvInputTypeDto3, catalogGetVideoSearchSmartTvInputTypeDto4, catalogGetVideoSearchSmartTvInputTypeDto5, catalogGetVideoSearchSmartTvInputTypeDto6};
        $VALUES = catalogGetVideoSearchSmartTvInputTypeDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSmartTvInputTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSmartTvInputTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchSmartTvInputTypeDto valueOf(String str) {
        return (CatalogGetVideoSearchSmartTvInputTypeDto) Enum.valueOf(CatalogGetVideoSearchSmartTvInputTypeDto.class, str);
    }

    public static CatalogGetVideoSearchSmartTvInputTypeDto[] values() {
        return (CatalogGetVideoSearchSmartTvInputTypeDto[]) $VALUES.clone();
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
