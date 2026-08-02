package com.vk.sdk.api.discover.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonTypeDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonTypeDto[] $VALUES;

    @pmi0("outline")
    public static final DiscoverCarouselButtonTypeDto OUTLINE;

    @pmi0("tertiary")
    public static final DiscoverCarouselButtonTypeDto TERTIARY;
    private final String value;

    static {
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto = new DiscoverCarouselButtonTypeDto("OUTLINE", 0, "outline");
        OUTLINE = discoverCarouselButtonTypeDto;
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto2 = new DiscoverCarouselButtonTypeDto("TERTIARY", 1, "tertiary");
        TERTIARY = discoverCarouselButtonTypeDto2;
        DiscoverCarouselButtonTypeDto[] discoverCarouselButtonTypeDtoArr = {discoverCarouselButtonTypeDto, discoverCarouselButtonTypeDto2};
        $VALUES = discoverCarouselButtonTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonTypeDtoArr);
    }

    private DiscoverCarouselButtonTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonTypeDto valueOf(String str) {
        return (DiscoverCarouselButtonTypeDto) Enum.valueOf(DiscoverCarouselButtonTypeDto.class, str);
    }

    public static DiscoverCarouselButtonTypeDto[] values() {
        return (DiscoverCarouselButtonTypeDto[]) $VALUES.clone();
    }
}
