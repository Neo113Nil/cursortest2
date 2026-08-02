package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetPlatformDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetPlatformDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetPlatformDto ANDROID;

    @pmi0("ios")
    public static final AppsGetPlatformDto IOS;

    @pmi0("web")
    public static final AppsGetPlatformDto WEB;
    private final String value;

    static {
        AppsGetPlatformDto appsGetPlatformDto = new AppsGetPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetPlatformDto;
        AppsGetPlatformDto appsGetPlatformDto2 = new AppsGetPlatformDto("IOS", 1, "ios");
        IOS = appsGetPlatformDto2;
        AppsGetPlatformDto appsGetPlatformDto3 = new AppsGetPlatformDto("WEB", 2, "web");
        WEB = appsGetPlatformDto3;
        AppsGetPlatformDto[] appsGetPlatformDtoArr = {appsGetPlatformDto, appsGetPlatformDto2, appsGetPlatformDto3};
        $VALUES = appsGetPlatformDtoArr;
        $ENTRIES = new asp(appsGetPlatformDtoArr);
    }

    private AppsGetPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetPlatformDto valueOf(String str) {
        return (AppsGetPlatformDto) Enum.valueOf(AppsGetPlatformDto.class, str);
    }

    public static AppsGetPlatformDto[] values() {
        return (AppsGetPlatformDto[]) $VALUES.clone();
    }
}
