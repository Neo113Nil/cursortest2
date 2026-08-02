package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsUpdateMetaForTestingGroupPlatformsDto.kt */
/* loaded from: classes5.dex */
public final class AppsUpdateMetaForTestingGroupPlatformsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsUpdateMetaForTestingGroupPlatformsDto[] $VALUES;

    @pmi0("mobile")
    public static final AppsUpdateMetaForTestingGroupPlatformsDto MOBILE;

    @pmi0("mvk")
    public static final AppsUpdateMetaForTestingGroupPlatformsDto MVK;

    @pmi0("web")
    public static final AppsUpdateMetaForTestingGroupPlatformsDto WEB;
    private final String value;

    static {
        AppsUpdateMetaForTestingGroupPlatformsDto appsUpdateMetaForTestingGroupPlatformsDto = new AppsUpdateMetaForTestingGroupPlatformsDto("MOBILE", 0, "mobile");
        MOBILE = appsUpdateMetaForTestingGroupPlatformsDto;
        AppsUpdateMetaForTestingGroupPlatformsDto appsUpdateMetaForTestingGroupPlatformsDto2 = new AppsUpdateMetaForTestingGroupPlatformsDto("WEB", 1, "web");
        WEB = appsUpdateMetaForTestingGroupPlatformsDto2;
        AppsUpdateMetaForTestingGroupPlatformsDto appsUpdateMetaForTestingGroupPlatformsDto3 = new AppsUpdateMetaForTestingGroupPlatformsDto("MVK", 2, "mvk");
        MVK = appsUpdateMetaForTestingGroupPlatformsDto3;
        AppsUpdateMetaForTestingGroupPlatformsDto[] appsUpdateMetaForTestingGroupPlatformsDtoArr = {appsUpdateMetaForTestingGroupPlatformsDto, appsUpdateMetaForTestingGroupPlatformsDto2, appsUpdateMetaForTestingGroupPlatformsDto3};
        $VALUES = appsUpdateMetaForTestingGroupPlatformsDtoArr;
        $ENTRIES = new asp(appsUpdateMetaForTestingGroupPlatformsDtoArr);
    }

    private AppsUpdateMetaForTestingGroupPlatformsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsUpdateMetaForTestingGroupPlatformsDto valueOf(String str) {
        return (AppsUpdateMetaForTestingGroupPlatformsDto) Enum.valueOf(AppsUpdateMetaForTestingGroupPlatformsDto.class, str);
    }

    public static AppsUpdateMetaForTestingGroupPlatformsDto[] values() {
        return (AppsUpdateMetaForTestingGroupPlatformsDto[]) $VALUES.clone();
    }
}
