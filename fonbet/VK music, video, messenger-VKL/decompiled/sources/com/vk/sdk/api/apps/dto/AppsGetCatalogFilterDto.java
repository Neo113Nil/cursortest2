package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetCatalogFilterDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetCatalogFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetCatalogFilterDto[] $VALUES;

    @pmi0("favorite")
    public static final AppsGetCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetCatalogFilterDto NEW;
    private final String value;

    static {
        AppsGetCatalogFilterDto appsGetCatalogFilterDto = new AppsGetCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetCatalogFilterDto;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto2 = new AppsGetCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetCatalogFilterDto2;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto3 = new AppsGetCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetCatalogFilterDto3;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto4 = new AppsGetCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetCatalogFilterDto4;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto5 = new AppsGetCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetCatalogFilterDto5;
        AppsGetCatalogFilterDto[] appsGetCatalogFilterDtoArr = {appsGetCatalogFilterDto, appsGetCatalogFilterDto2, appsGetCatalogFilterDto3, appsGetCatalogFilterDto4, appsGetCatalogFilterDto5};
        $VALUES = appsGetCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetCatalogFilterDtoArr);
    }

    private AppsGetCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetCatalogFilterDto valueOf(String str) {
        return (AppsGetCatalogFilterDto) Enum.valueOf(AppsGetCatalogFilterDto.class, str);
    }

    public static AppsGetCatalogFilterDto[] values() {
        return (AppsGetCatalogFilterDto[]) $VALUES.clone();
    }
}
