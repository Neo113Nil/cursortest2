package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsDomainResolvedTypeDto.kt */
/* loaded from: classes5.dex */
public final class UtilsDomainResolvedTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsDomainResolvedTypeDto[] $VALUES;

    @pmi0("application")
    public static final UtilsDomainResolvedTypeDto APPLICATION;

    @pmi0("community_application")
    public static final UtilsDomainResolvedTypeDto COMMUNITY_APPLICATION;

    @pmi0("group")
    public static final UtilsDomainResolvedTypeDto GROUP;

    @pmi0("internal_vkui")
    public static final UtilsDomainResolvedTypeDto INTERNAL_VKUI;

    @pmi0("page")
    public static final UtilsDomainResolvedTypeDto PAGE;

    @pmi0("user")
    public static final UtilsDomainResolvedTypeDto USER;

    @pmi0("vk_app")
    public static final UtilsDomainResolvedTypeDto VK_APP;
    private final String value;

    static {
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = new UtilsDomainResolvedTypeDto("USER", 0, "user");
        USER = utilsDomainResolvedTypeDto;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto2 = new UtilsDomainResolvedTypeDto("GROUP", 1, "group");
        GROUP = utilsDomainResolvedTypeDto2;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto3 = new UtilsDomainResolvedTypeDto("APPLICATION", 2, "application");
        APPLICATION = utilsDomainResolvedTypeDto3;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto4 = new UtilsDomainResolvedTypeDto("PAGE", 3, "page");
        PAGE = utilsDomainResolvedTypeDto4;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto5 = new UtilsDomainResolvedTypeDto("VK_APP", 4, "vk_app");
        VK_APP = utilsDomainResolvedTypeDto5;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto6 = new UtilsDomainResolvedTypeDto("COMMUNITY_APPLICATION", 5, "community_application");
        COMMUNITY_APPLICATION = utilsDomainResolvedTypeDto6;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto7 = new UtilsDomainResolvedTypeDto("INTERNAL_VKUI", 6, "internal_vkui");
        INTERNAL_VKUI = utilsDomainResolvedTypeDto7;
        UtilsDomainResolvedTypeDto[] utilsDomainResolvedTypeDtoArr = {utilsDomainResolvedTypeDto, utilsDomainResolvedTypeDto2, utilsDomainResolvedTypeDto3, utilsDomainResolvedTypeDto4, utilsDomainResolvedTypeDto5, utilsDomainResolvedTypeDto6, utilsDomainResolvedTypeDto7};
        $VALUES = utilsDomainResolvedTypeDtoArr;
        $ENTRIES = new asp(utilsDomainResolvedTypeDtoArr);
    }

    private UtilsDomainResolvedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsDomainResolvedTypeDto valueOf(String str) {
        return (UtilsDomainResolvedTypeDto) Enum.valueOf(UtilsDomainResolvedTypeDto.class, str);
    }

    public static UtilsDomainResolvedTypeDto[] values() {
        return (UtilsDomainResolvedTypeDto[]) $VALUES.clone();
    }
}
