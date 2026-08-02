package com.vk.sdk.api.search.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchHintTypeDto.kt */
/* loaded from: classes5.dex */
public final class SearchHintTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchHintTypeDto[] $VALUES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final SearchHintTypeDto APP;

    @pmi0("group")
    public static final SearchHintTypeDto GROUP;

    @pmi0("html5_game")
    public static final SearchHintTypeDto HTML5_GAME;

    @pmi0("link")
    public static final SearchHintTypeDto LINK;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final SearchHintTypeDto PROFILE;

    @pmi0("vk_app")
    public static final SearchHintTypeDto VK_APP;
    private final String value;

    static {
        SearchHintTypeDto searchHintTypeDto = new SearchHintTypeDto("GROUP", 0, "group");
        GROUP = searchHintTypeDto;
        SearchHintTypeDto searchHintTypeDto2 = new SearchHintTypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = searchHintTypeDto2;
        SearchHintTypeDto searchHintTypeDto3 = new SearchHintTypeDto("VK_APP", 2, "vk_app");
        VK_APP = searchHintTypeDto3;
        SearchHintTypeDto searchHintTypeDto4 = new SearchHintTypeDto("APP", 3, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = searchHintTypeDto4;
        SearchHintTypeDto searchHintTypeDto5 = new SearchHintTypeDto("HTML5_GAME", 4, "html5_game");
        HTML5_GAME = searchHintTypeDto5;
        SearchHintTypeDto searchHintTypeDto6 = new SearchHintTypeDto("LINK", 5, "link");
        LINK = searchHintTypeDto6;
        SearchHintTypeDto[] searchHintTypeDtoArr = {searchHintTypeDto, searchHintTypeDto2, searchHintTypeDto3, searchHintTypeDto4, searchHintTypeDto5, searchHintTypeDto6};
        $VALUES = searchHintTypeDtoArr;
        $ENTRIES = new asp(searchHintTypeDtoArr);
    }

    private SearchHintTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchHintTypeDto valueOf(String str) {
        return (SearchHintTypeDto) Enum.valueOf(SearchHintTypeDto.class, str);
    }

    public static SearchHintTypeDto[] values() {
        return (SearchHintTypeDto[]) $VALUES.clone();
    }
}
