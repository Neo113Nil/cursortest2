package com.vk.sdk.api.gifts.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGiftPrivacyDto.kt */
/* loaded from: classes5.dex */
public final class GiftsGiftPrivacyDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGiftPrivacyDto[] $VALUES;

    @pmi0("0")
    public static final GiftsGiftPrivacyDto NAME_AND_MESSAGE_FOR_ALL;

    @pmi0("2")
    public static final GiftsGiftPrivacyDto NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY;

    @pmi0("1")
    public static final GiftsGiftPrivacyDto NAME_FOR_ALL;
    private final int value;

    static {
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = new GiftsGiftPrivacyDto("NAME_AND_MESSAGE_FOR_ALL", 0, 0);
        NAME_AND_MESSAGE_FOR_ALL = giftsGiftPrivacyDto;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto2 = new GiftsGiftPrivacyDto("NAME_FOR_ALL", 1, 1);
        NAME_FOR_ALL = giftsGiftPrivacyDto2;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto3 = new GiftsGiftPrivacyDto("NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY", 2, 2);
        NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY = giftsGiftPrivacyDto3;
        GiftsGiftPrivacyDto[] giftsGiftPrivacyDtoArr = {giftsGiftPrivacyDto, giftsGiftPrivacyDto2, giftsGiftPrivacyDto3};
        $VALUES = giftsGiftPrivacyDtoArr;
        $ENTRIES = new asp(giftsGiftPrivacyDtoArr);
    }

    private GiftsGiftPrivacyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GiftsGiftPrivacyDto valueOf(String str) {
        return (GiftsGiftPrivacyDto) Enum.valueOf(GiftsGiftPrivacyDto.class, str);
    }

    public static GiftsGiftPrivacyDto[] values() {
        return (GiftsGiftPrivacyDto[]) $VALUES.clone();
    }
}
