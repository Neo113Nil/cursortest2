package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetLeaderboardTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetLeaderboardTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetLeaderboardTypeDto[] $VALUES;

    @pmi0("level")
    public static final AppsGetLeaderboardTypeDto LEVEL;

    @pmi0("points")
    public static final AppsGetLeaderboardTypeDto POINTS;

    @pmi0("score")
    public static final AppsGetLeaderboardTypeDto SCORE;
    private final String value;

    static {
        AppsGetLeaderboardTypeDto appsGetLeaderboardTypeDto = new AppsGetLeaderboardTypeDto("LEVEL", 0, "level");
        LEVEL = appsGetLeaderboardTypeDto;
        AppsGetLeaderboardTypeDto appsGetLeaderboardTypeDto2 = new AppsGetLeaderboardTypeDto("POINTS", 1, "points");
        POINTS = appsGetLeaderboardTypeDto2;
        AppsGetLeaderboardTypeDto appsGetLeaderboardTypeDto3 = new AppsGetLeaderboardTypeDto("SCORE", 2, "score");
        SCORE = appsGetLeaderboardTypeDto3;
        AppsGetLeaderboardTypeDto[] appsGetLeaderboardTypeDtoArr = {appsGetLeaderboardTypeDto, appsGetLeaderboardTypeDto2, appsGetLeaderboardTypeDto3};
        $VALUES = appsGetLeaderboardTypeDtoArr;
        $ENTRIES = new asp(appsGetLeaderboardTypeDtoArr);
    }

    private AppsGetLeaderboardTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetLeaderboardTypeDto valueOf(String str) {
        return (AppsGetLeaderboardTypeDto) Enum.valueOf(AppsGetLeaderboardTypeDto.class, str);
    }

    public static AppsGetLeaderboardTypeDto[] values() {
        return (AppsGetLeaderboardTypeDto[]) $VALUES.clone();
    }
}
