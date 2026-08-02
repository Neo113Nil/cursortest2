package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsLinkCheckedStatusDto.kt */
/* loaded from: classes5.dex */
public final class UtilsLinkCheckedStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsLinkCheckedStatusDto[] $VALUES;

    @pmi0("banned")
    public static final UtilsLinkCheckedStatusDto BANNED;

    @pmi0("not_banned")
    public static final UtilsLinkCheckedStatusDto NOT_BANNED;

    @pmi0("processing")
    public static final UtilsLinkCheckedStatusDto PROCESSING;
    private final String value;

    static {
        UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto = new UtilsLinkCheckedStatusDto("NOT_BANNED", 0, "not_banned");
        NOT_BANNED = utilsLinkCheckedStatusDto;
        UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto2 = new UtilsLinkCheckedStatusDto("BANNED", 1, "banned");
        BANNED = utilsLinkCheckedStatusDto2;
        UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto3 = new UtilsLinkCheckedStatusDto("PROCESSING", 2, "processing");
        PROCESSING = utilsLinkCheckedStatusDto3;
        UtilsLinkCheckedStatusDto[] utilsLinkCheckedStatusDtoArr = {utilsLinkCheckedStatusDto, utilsLinkCheckedStatusDto2, utilsLinkCheckedStatusDto3};
        $VALUES = utilsLinkCheckedStatusDtoArr;
        $ENTRIES = new asp(utilsLinkCheckedStatusDtoArr);
    }

    private UtilsLinkCheckedStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsLinkCheckedStatusDto valueOf(String str) {
        return (UtilsLinkCheckedStatusDto) Enum.valueOf(UtilsLinkCheckedStatusDto.class, str);
    }

    public static UtilsLinkCheckedStatusDto[] values() {
        return (UtilsLinkCheckedStatusDto[]) $VALUES.clone();
    }
}
