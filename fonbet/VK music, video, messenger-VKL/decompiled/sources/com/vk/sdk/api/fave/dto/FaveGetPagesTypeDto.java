package com.vk.sdk.api.fave.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveGetPagesTypeDto.kt */
/* loaded from: classes5.dex */
public final class FaveGetPagesTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveGetPagesTypeDto[] $VALUES;

    @pmi0("groups")
    public static final FaveGetPagesTypeDto GROUPS;

    @pmi0("hints")
    public static final FaveGetPagesTypeDto HINTS;

    @pmi0("users")
    public static final FaveGetPagesTypeDto USERS;
    private final String value;

    static {
        FaveGetPagesTypeDto faveGetPagesTypeDto = new FaveGetPagesTypeDto("GROUPS", 0, "groups");
        GROUPS = faveGetPagesTypeDto;
        FaveGetPagesTypeDto faveGetPagesTypeDto2 = new FaveGetPagesTypeDto("HINTS", 1, "hints");
        HINTS = faveGetPagesTypeDto2;
        FaveGetPagesTypeDto faveGetPagesTypeDto3 = new FaveGetPagesTypeDto("USERS", 2, "users");
        USERS = faveGetPagesTypeDto3;
        FaveGetPagesTypeDto[] faveGetPagesTypeDtoArr = {faveGetPagesTypeDto, faveGetPagesTypeDto2, faveGetPagesTypeDto3};
        $VALUES = faveGetPagesTypeDtoArr;
        $ENTRIES = new asp(faveGetPagesTypeDtoArr);
    }

    private FaveGetPagesTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveGetPagesTypeDto valueOf(String str) {
        return (FaveGetPagesTypeDto) Enum.valueOf(FaveGetPagesTypeDto.class, str);
    }

    public static FaveGetPagesTypeDto[] values() {
        return (FaveGetPagesTypeDto[]) $VALUES.clone();
    }
}
