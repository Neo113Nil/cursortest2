package com.vk.sdk.api.discover.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselItemDescriptionTypeDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselItemDescriptionTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselItemDescriptionTypeDto[] $VALUES;

    @pmi0("plain")
    public static final DiscoverCarouselItemDescriptionTypeDto PLAIN;
    private final String value;

    static {
        DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto = new DiscoverCarouselItemDescriptionTypeDto("PLAIN", 0, "plain");
        PLAIN = discoverCarouselItemDescriptionTypeDto;
        DiscoverCarouselItemDescriptionTypeDto[] discoverCarouselItemDescriptionTypeDtoArr = {discoverCarouselItemDescriptionTypeDto};
        $VALUES = discoverCarouselItemDescriptionTypeDtoArr;
        $ENTRIES = new asp(discoverCarouselItemDescriptionTypeDtoArr);
    }

    private DiscoverCarouselItemDescriptionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselItemDescriptionTypeDto valueOf(String str) {
        return (DiscoverCarouselItemDescriptionTypeDto) Enum.valueOf(DiscoverCarouselItemDescriptionTypeDto.class, str);
    }

    public static DiscoverCarouselItemDescriptionTypeDto[] values() {
        return (DiscoverCarouselItemDescriptionTypeDto[]) $VALUES.clone();
    }
}
