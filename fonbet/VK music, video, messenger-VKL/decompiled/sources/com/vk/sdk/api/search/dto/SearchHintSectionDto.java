package com.vk.sdk.api.search.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchHintSectionDto.kt */
/* loaded from: classes5.dex */
public final class SearchHintSectionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchHintSectionDto[] $VALUES;

    @pmi0("apps")
    public static final SearchHintSectionDto APPS;

    @pmi0("direct_games")
    public static final SearchHintSectionDto DIRECT_GAMES;

    @pmi0("vk_apps")
    public static final SearchHintSectionDto VK_APPS;
    private final String value;

    static {
        SearchHintSectionDto searchHintSectionDto = new SearchHintSectionDto("VK_APPS", 0, "vk_apps");
        VK_APPS = searchHintSectionDto;
        SearchHintSectionDto searchHintSectionDto2 = new SearchHintSectionDto("APPS", 1, "apps");
        APPS = searchHintSectionDto2;
        SearchHintSectionDto searchHintSectionDto3 = new SearchHintSectionDto("DIRECT_GAMES", 2, "direct_games");
        DIRECT_GAMES = searchHintSectionDto3;
        SearchHintSectionDto[] searchHintSectionDtoArr = {searchHintSectionDto, searchHintSectionDto2, searchHintSectionDto3};
        $VALUES = searchHintSectionDtoArr;
        $ENTRIES = new asp(searchHintSectionDtoArr);
    }

    private SearchHintSectionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchHintSectionDto valueOf(String str) {
        return (SearchHintSectionDto) Enum.valueOf(SearchHintSectionDto.class, str);
    }

    public static SearchHintSectionDto[] values() {
        return (SearchHintSectionDto[]) $VALUES.clone();
    }
}
