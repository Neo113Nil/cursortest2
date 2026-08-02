package com.vk.sdk.api.stories.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesStoryStatsStateDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStoryStatsStateDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesStoryStatsStateDto[] $VALUES;

    @pmi0("hidden")
    public static final StoriesStoryStatsStateDto HIDDEN;

    @pmi0("off")
    public static final StoriesStoryStatsStateDto OFF;

    @pmi0("on")
    public static final StoriesStoryStatsStateDto ON;
    private final String value;

    static {
        StoriesStoryStatsStateDto storiesStoryStatsStateDto = new StoriesStoryStatsStateDto("ON", 0, "on");
        ON = storiesStoryStatsStateDto;
        StoriesStoryStatsStateDto storiesStoryStatsStateDto2 = new StoriesStoryStatsStateDto("OFF", 1, "off");
        OFF = storiesStoryStatsStateDto2;
        StoriesStoryStatsStateDto storiesStoryStatsStateDto3 = new StoriesStoryStatsStateDto("HIDDEN", 2, "hidden");
        HIDDEN = storiesStoryStatsStateDto3;
        StoriesStoryStatsStateDto[] storiesStoryStatsStateDtoArr = {storiesStoryStatsStateDto, storiesStoryStatsStateDto2, storiesStoryStatsStateDto3};
        $VALUES = storiesStoryStatsStateDtoArr;
        $ENTRIES = new asp(storiesStoryStatsStateDtoArr);
    }

    private StoriesStoryStatsStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesStoryStatsStateDto valueOf(String str) {
        return (StoriesStoryStatsStateDto) Enum.valueOf(StoriesStoryStatsStateDto.class, str);
    }

    public static StoriesStoryStatsStateDto[] values() {
        return (StoriesStoryStatsStateDto[]) $VALUES.clone();
    }
}
