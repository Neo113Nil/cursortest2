package com.vk.sdk.api.base.dto;

import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseLinkButtonStyleDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkButtonStyleDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseLinkButtonStyleDto[] $VALUES;

    @pmi0("primary")
    public static final BaseLinkButtonStyleDto PRIMARY;

    @pmi0(X3.i.Y)
    public static final BaseLinkButtonStyleDto SECONDARY;
    private final String value;

    static {
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = new BaseLinkButtonStyleDto("PRIMARY", 0, "primary");
        PRIMARY = baseLinkButtonStyleDto;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto2 = new BaseLinkButtonStyleDto("SECONDARY", 1, X3.i.Y);
        SECONDARY = baseLinkButtonStyleDto2;
        BaseLinkButtonStyleDto[] baseLinkButtonStyleDtoArr = {baseLinkButtonStyleDto, baseLinkButtonStyleDto2};
        $VALUES = baseLinkButtonStyleDtoArr;
        $ENTRIES = new asp(baseLinkButtonStyleDtoArr);
    }

    private BaseLinkButtonStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseLinkButtonStyleDto valueOf(String str) {
        return (BaseLinkButtonStyleDto) Enum.valueOf(BaseLinkButtonStyleDto.class, str);
    }

    public static BaseLinkButtonStyleDto[] values() {
        return (BaseLinkButtonStyleDto[]) $VALUES.clone();
    }
}
