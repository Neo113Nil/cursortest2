package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetLeaderboardExtendedTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetLeaderboardExtendedTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetLeaderboardExtendedTypeDto[] $VALUES;

    @pmi0("level")
    public static final AppsGetLeaderboardExtendedTypeDto LEVEL;

    @pmi0("points")
    public static final AppsGetLeaderboardExtendedTypeDto POINTS;

    @pmi0("score")
    public static final AppsGetLeaderboardExtendedTypeDto SCORE;
    private final String value;

    static {
        AppsGetLeaderboardExtendedTypeDto appsGetLeaderboardExtendedTypeDto = new AppsGetLeaderboardExtendedTypeDto("LEVEL", 0, "level");
        LEVEL = appsGetLeaderboardExtendedTypeDto;
        AppsGetLeaderboardExtendedTypeDto appsGetLeaderboardExtendedTypeDto2 = new AppsGetLeaderboardExtendedTypeDto("POINTS", 1, "points");
        POINTS = appsGetLeaderboardExtendedTypeDto2;
        AppsGetLeaderboardExtendedTypeDto appsGetLeaderboardExtendedTypeDto3 = new AppsGetLeaderboardExtendedTypeDto("SCORE", 2, "score");
        SCORE = appsGetLeaderboardExtendedTypeDto3;
        AppsGetLeaderboardExtendedTypeDto[] appsGetLeaderboardExtendedTypeDtoArr = {appsGetLeaderboardExtendedTypeDto, appsGetLeaderboardExtendedTypeDto2, appsGetLeaderboardExtendedTypeDto3};
        $VALUES = appsGetLeaderboardExtendedTypeDtoArr;
        $ENTRIES = new asp(appsGetLeaderboardExtendedTypeDtoArr);
    }

    private AppsGetLeaderboardExtendedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetLeaderboardExtendedTypeDto valueOf(String str) {
        return (AppsGetLeaderboardExtendedTypeDto) Enum.valueOf(AppsGetLeaderboardExtendedTypeDto.class, str);
    }

    public static AppsGetLeaderboardExtendedTypeDto[] values() {
        return (AppsGetLeaderboardExtendedTypeDto[]) $VALUES.clone();
    }
}
