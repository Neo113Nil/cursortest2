package com.vk.sdk.api.fave.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveAddTagPositionDto.kt */
/* loaded from: classes5.dex */
public final class FaveAddTagPositionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveAddTagPositionDto[] $VALUES;

    @pmi0("back")
    public static final FaveAddTagPositionDto BACK;

    @pmi0("front")
    public static final FaveAddTagPositionDto FRONT;
    private final String value;

    static {
        FaveAddTagPositionDto faveAddTagPositionDto = new FaveAddTagPositionDto("BACK", 0, "back");
        BACK = faveAddTagPositionDto;
        FaveAddTagPositionDto faveAddTagPositionDto2 = new FaveAddTagPositionDto("FRONT", 1, "front");
        FRONT = faveAddTagPositionDto2;
        FaveAddTagPositionDto[] faveAddTagPositionDtoArr = {faveAddTagPositionDto, faveAddTagPositionDto2};
        $VALUES = faveAddTagPositionDtoArr;
        $ENTRIES = new asp(faveAddTagPositionDtoArr);
    }

    private FaveAddTagPositionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveAddTagPositionDto valueOf(String str) {
        return (FaveAddTagPositionDto) Enum.valueOf(FaveAddTagPositionDto.class, str);
    }

    public static FaveAddTagPositionDto[] values() {
        return (FaveAddTagPositionDto[]) $VALUES.clone();
    }
}
