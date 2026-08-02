package com.vk.sdk.api.discover.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonActionTypeDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonActionTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonActionTypeDto[] $VALUES;

    @pmi0("open_game")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_GAME;

    @pmi0("open_url")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_URL;

    @pmi0("open_vkapp")
    public static final DiscoverCarouselButtonActionTypeDto OPEN_VKAPP;
    private final String value;

    static {
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto = new DiscoverCarouselButtonActionTypeDto("OPEN_URL", 0, "open_url");
        OPEN_URL = discoverCarouselButtonActionTypeDto;
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto2 = new DiscoverCarouselButtonActionTypeDto("OPEN_VKAPP", 1, "open_vkapp");
        OPEN_VKAPP = discoverCarouselButtonActionTypeDto2;
        DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto3 = new DiscoverCarouselButtonActionTypeDto("OPEN_GAME", 2, "open_game");
        OPEN_GAME = discoverCarouselButtonActionTypeDto3;
        DiscoverCarouselButtonActionTypeDto[] discoverCarouselButtonActionTypeDtoArr = {discoverCarouselButtonActionTypeDto, discoverCarouselButtonActionTypeDto2, discoverCarouselButtonActionTypeDto3};
        $VALUES = discoverCarouselButtonActionTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonActionTypeDtoArr);
    }

    private DiscoverCarouselButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonActionTypeDto valueOf(String str) {
        return (DiscoverCarouselButtonActionTypeDto) Enum.valueOf(DiscoverCarouselButtonActionTypeDto.class, str);
    }

    public static DiscoverCarouselButtonActionTypeDto[] values() {
        return (DiscoverCarouselButtonActionTypeDto[]) $VALUES.clone();
    }
}
