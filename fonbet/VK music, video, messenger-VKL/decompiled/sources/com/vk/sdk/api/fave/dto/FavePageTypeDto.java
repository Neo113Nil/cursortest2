package com.vk.sdk.api.fave.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavePageTypeDto.kt */
/* loaded from: classes5.dex */
public final class FavePageTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FavePageTypeDto[] $VALUES;

    @pmi0("group")
    public static final FavePageTypeDto GROUP;

    @pmi0("hints")
    public static final FavePageTypeDto HINTS;

    @pmi0("user")
    public static final FavePageTypeDto USER;
    private final String value;

    static {
        FavePageTypeDto favePageTypeDto = new FavePageTypeDto("USER", 0, "user");
        USER = favePageTypeDto;
        FavePageTypeDto favePageTypeDto2 = new FavePageTypeDto("GROUP", 1, "group");
        GROUP = favePageTypeDto2;
        FavePageTypeDto favePageTypeDto3 = new FavePageTypeDto("HINTS", 2, "hints");
        HINTS = favePageTypeDto3;
        FavePageTypeDto[] favePageTypeDtoArr = {favePageTypeDto, favePageTypeDto2, favePageTypeDto3};
        $VALUES = favePageTypeDtoArr;
        $ENTRIES = new asp(favePageTypeDtoArr);
    }

    private FavePageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FavePageTypeDto valueOf(String str) {
        return (FavePageTypeDto) Enum.valueOf(FavePageTypeDto.class, str);
    }

    public static FavePageTypeDto[] values() {
        return (FavePageTypeDto[]) $VALUES.clone();
    }
}
