package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetScopesTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetScopesTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetScopesTypeDto[] $VALUES;

    @pmi0("group")
    public static final AppsGetScopesTypeDto GROUP;

    @pmi0("user")
    public static final AppsGetScopesTypeDto USER;
    private final String value;

    static {
        AppsGetScopesTypeDto appsGetScopesTypeDto = new AppsGetScopesTypeDto("GROUP", 0, "group");
        GROUP = appsGetScopesTypeDto;
        AppsGetScopesTypeDto appsGetScopesTypeDto2 = new AppsGetScopesTypeDto("USER", 1, "user");
        USER = appsGetScopesTypeDto2;
        AppsGetScopesTypeDto[] appsGetScopesTypeDtoArr = {appsGetScopesTypeDto, appsGetScopesTypeDto2};
        $VALUES = appsGetScopesTypeDtoArr;
        $ENTRIES = new asp(appsGetScopesTypeDtoArr);
    }

    private AppsGetScopesTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetScopesTypeDto valueOf(String str) {
        return (AppsGetScopesTypeDto) Enum.valueOf(AppsGetScopesTypeDto.class, str);
    }

    public static AppsGetScopesTypeDto[] values() {
        return (AppsGetScopesTypeDto[]) $VALUES.clone();
    }
}
