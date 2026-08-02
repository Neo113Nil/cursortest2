package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetCatalogSortDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetCatalogSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetCatalogSortDto[] $VALUES;

    @pmi0("create_date")
    public static final AppsGetCatalogSortDto CREATE_DATE;

    @pmi0("growth_rate")
    public static final AppsGetCatalogSortDto GROWTH_RATE;

    @pmi0("popular")
    public static final AppsGetCatalogSortDto POPULAR;

    @pmi0("popular_today")
    public static final AppsGetCatalogSortDto POPULAR_TODAY;

    @pmi0("popular_week")
    public static final AppsGetCatalogSortDto POPULAR_WEEK;

    @pmi0("visitors")
    public static final AppsGetCatalogSortDto VISITORS;
    private final String value;

    static {
        AppsGetCatalogSortDto appsGetCatalogSortDto = new AppsGetCatalogSortDto("CREATE_DATE", 0, "create_date");
        CREATE_DATE = appsGetCatalogSortDto;
        AppsGetCatalogSortDto appsGetCatalogSortDto2 = new AppsGetCatalogSortDto("GROWTH_RATE", 1, "growth_rate");
        GROWTH_RATE = appsGetCatalogSortDto2;
        AppsGetCatalogSortDto appsGetCatalogSortDto3 = new AppsGetCatalogSortDto("POPULAR", 2, "popular");
        POPULAR = appsGetCatalogSortDto3;
        AppsGetCatalogSortDto appsGetCatalogSortDto4 = new AppsGetCatalogSortDto("POPULAR_TODAY", 3, "popular_today");
        POPULAR_TODAY = appsGetCatalogSortDto4;
        AppsGetCatalogSortDto appsGetCatalogSortDto5 = new AppsGetCatalogSortDto("POPULAR_WEEK", 4, "popular_week");
        POPULAR_WEEK = appsGetCatalogSortDto5;
        AppsGetCatalogSortDto appsGetCatalogSortDto6 = new AppsGetCatalogSortDto("VISITORS", 5, "visitors");
        VISITORS = appsGetCatalogSortDto6;
        AppsGetCatalogSortDto[] appsGetCatalogSortDtoArr = {appsGetCatalogSortDto, appsGetCatalogSortDto2, appsGetCatalogSortDto3, appsGetCatalogSortDto4, appsGetCatalogSortDto5, appsGetCatalogSortDto6};
        $VALUES = appsGetCatalogSortDtoArr;
        $ENTRIES = new asp(appsGetCatalogSortDtoArr);
    }

    private AppsGetCatalogSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetCatalogSortDto valueOf(String str) {
        return (AppsGetCatalogSortDto) Enum.valueOf(AppsGetCatalogSortDto.class, str);
    }

    public static AppsGetCatalogSortDto[] values() {
        return (AppsGetCatalogSortDto[]) $VALUES.clone();
    }
}
