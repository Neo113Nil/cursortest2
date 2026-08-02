package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppLeaderboardTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsAppLeaderboardTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppLeaderboardTypeDto[] $VALUES;

    @pmi0("1")
    public static final AppsAppLeaderboardTypeDto LEVELS;

    @pmi0("0")
    public static final AppsAppLeaderboardTypeDto NOT_SUPPORTED;

    @pmi0("2")
    public static final AppsAppLeaderboardTypeDto POINTS;
    private final int value;

    static {
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = new AppsAppLeaderboardTypeDto("NOT_SUPPORTED", 0, 0);
        NOT_SUPPORTED = appsAppLeaderboardTypeDto;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto2 = new AppsAppLeaderboardTypeDto("LEVELS", 1, 1);
        LEVELS = appsAppLeaderboardTypeDto2;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto3 = new AppsAppLeaderboardTypeDto("POINTS", 2, 2);
        POINTS = appsAppLeaderboardTypeDto3;
        AppsAppLeaderboardTypeDto[] appsAppLeaderboardTypeDtoArr = {appsAppLeaderboardTypeDto, appsAppLeaderboardTypeDto2, appsAppLeaderboardTypeDto3};
        $VALUES = appsAppLeaderboardTypeDtoArr;
        $ENTRIES = new asp(appsAppLeaderboardTypeDtoArr);
    }

    private AppsAppLeaderboardTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AppsAppLeaderboardTypeDto valueOf(String str) {
        return (AppsAppLeaderboardTypeDto) Enum.valueOf(AppsAppLeaderboardTypeDto.class, str);
    }

    public static AppsAppLeaderboardTypeDto[] values() {
        return (AppsAppLeaderboardTypeDto[]) $VALUES.clone();
    }
}
