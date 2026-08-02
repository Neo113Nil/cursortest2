package com.vk.sdk.api.discover.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselObjectsTypeDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselObjectsTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselObjectsTypeDto[] $VALUES;

    @pmi0("direct_game")
    public static final DiscoverCarouselObjectsTypeDto DIRECT_GAME;

    @pmi0("vk_app")
    public static final DiscoverCarouselObjectsTypeDto VK_APP;
    private final String value;

    static {
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = new DiscoverCarouselObjectsTypeDto("VK_APP", 0, "vk_app");
        VK_APP = discoverCarouselObjectsTypeDto;
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto2 = new DiscoverCarouselObjectsTypeDto("DIRECT_GAME", 1, "direct_game");
        DIRECT_GAME = discoverCarouselObjectsTypeDto2;
        DiscoverCarouselObjectsTypeDto[] discoverCarouselObjectsTypeDtoArr = {discoverCarouselObjectsTypeDto, discoverCarouselObjectsTypeDto2};
        $VALUES = discoverCarouselObjectsTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselObjectsTypeDtoArr);
    }

    private DiscoverCarouselObjectsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselObjectsTypeDto valueOf(String str) {
        return (DiscoverCarouselObjectsTypeDto) Enum.valueOf(DiscoverCarouselObjectsTypeDto.class, str);
    }

    public static DiscoverCarouselObjectsTypeDto[] values() {
        return (DiscoverCarouselObjectsTypeDto[]) $VALUES.clone();
    }
}
