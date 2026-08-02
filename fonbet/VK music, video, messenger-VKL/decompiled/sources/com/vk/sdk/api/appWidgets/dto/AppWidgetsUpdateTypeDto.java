package com.vk.sdk.api.appWidgets.dto;

import com.ironsource.B5;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsUpdateTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsUpdateTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsUpdateTypeDto[] $VALUES;

    @pmi0("compact_list")
    public static final AppWidgetsUpdateTypeDto COMPACT_LIST;

    @pmi0("cover_list")
    public static final AppWidgetsUpdateTypeDto COVER_LIST;

    @pmi0("donation")
    public static final AppWidgetsUpdateTypeDto DONATION;

    @pmi0("list")
    public static final AppWidgetsUpdateTypeDto LIST;

    @pmi0("match")
    public static final AppWidgetsUpdateTypeDto MATCH;

    @pmi0("matches")
    public static final AppWidgetsUpdateTypeDto MATCHES;

    @pmi0(B5.R)
    public static final AppWidgetsUpdateTypeDto TABLE;

    @pmi0("text")
    public static final AppWidgetsUpdateTypeDto TEXT;

    @pmi0("tiles")
    public static final AppWidgetsUpdateTypeDto TILES;
    private final String value;

    static {
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto = new AppWidgetsUpdateTypeDto("COMPACT_LIST", 0, "compact_list");
        COMPACT_LIST = appWidgetsUpdateTypeDto;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto2 = new AppWidgetsUpdateTypeDto("COVER_LIST", 1, "cover_list");
        COVER_LIST = appWidgetsUpdateTypeDto2;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto3 = new AppWidgetsUpdateTypeDto("DONATION", 2, "donation");
        DONATION = appWidgetsUpdateTypeDto3;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto4 = new AppWidgetsUpdateTypeDto("LIST", 3, "list");
        LIST = appWidgetsUpdateTypeDto4;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto5 = new AppWidgetsUpdateTypeDto("MATCH", 4, "match");
        MATCH = appWidgetsUpdateTypeDto5;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto6 = new AppWidgetsUpdateTypeDto("MATCHES", 5, "matches");
        MATCHES = appWidgetsUpdateTypeDto6;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto7 = new AppWidgetsUpdateTypeDto("TABLE", 6, B5.R);
        TABLE = appWidgetsUpdateTypeDto7;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto8 = new AppWidgetsUpdateTypeDto("TEXT", 7, "text");
        TEXT = appWidgetsUpdateTypeDto8;
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto9 = new AppWidgetsUpdateTypeDto("TILES", 8, "tiles");
        TILES = appWidgetsUpdateTypeDto9;
        AppWidgetsUpdateTypeDto[] appWidgetsUpdateTypeDtoArr = {appWidgetsUpdateTypeDto, appWidgetsUpdateTypeDto2, appWidgetsUpdateTypeDto3, appWidgetsUpdateTypeDto4, appWidgetsUpdateTypeDto5, appWidgetsUpdateTypeDto6, appWidgetsUpdateTypeDto7, appWidgetsUpdateTypeDto8, appWidgetsUpdateTypeDto9};
        $VALUES = appWidgetsUpdateTypeDtoArr;
        $ENTRIES = new asp(appWidgetsUpdateTypeDtoArr);
    }

    private AppWidgetsUpdateTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsUpdateTypeDto valueOf(String str) {
        return (AppWidgetsUpdateTypeDto) Enum.valueOf(AppWidgetsUpdateTypeDto.class, str);
    }

    public static AppWidgetsUpdateTypeDto[] values() {
        return (AppWidgetsUpdateTypeDto[]) $VALUES.clone();
    }
}
