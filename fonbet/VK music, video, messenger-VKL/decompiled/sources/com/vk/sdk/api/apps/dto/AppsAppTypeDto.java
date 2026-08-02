package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsAppTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppTypeDto[] $VALUES;

    @pmi0("mini_app")
    public static final AppsAppTypeDto MINI_APP;
    private final String value;

    static {
        AppsAppTypeDto appsAppTypeDto = new AppsAppTypeDto("MINI_APP", 0, "mini_app");
        MINI_APP = appsAppTypeDto;
        AppsAppTypeDto[] appsAppTypeDtoArr = {appsAppTypeDto};
        $VALUES = appsAppTypeDtoArr;
        $ENTRIES = new asp(appsAppTypeDtoArr);
    }

    private AppsAppTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAppTypeDto valueOf(String str) {
        return (AppsAppTypeDto) Enum.valueOf(AppsAppTypeDto.class, str);
    }

    public static AppsAppTypeDto[] values() {
        return (AppsAppTypeDto[]) $VALUES.clone();
    }
}
