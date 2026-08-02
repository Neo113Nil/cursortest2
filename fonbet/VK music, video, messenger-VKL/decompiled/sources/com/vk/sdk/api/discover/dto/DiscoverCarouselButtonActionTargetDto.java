package com.vk.sdk.api.discover.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCarouselButtonActionTargetDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonActionTargetDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCarouselButtonActionTargetDto[] $VALUES;

    @pmi0("internal")
    public static final DiscoverCarouselButtonActionTargetDto INTERNAL;
    private final String value;

    static {
        DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto = new DiscoverCarouselButtonActionTargetDto("INTERNAL", 0, "internal");
        INTERNAL = discoverCarouselButtonActionTargetDto;
        DiscoverCarouselButtonActionTargetDto[] discoverCarouselButtonActionTargetDtoArr = {discoverCarouselButtonActionTargetDto};
        $VALUES = discoverCarouselButtonActionTargetDtoArr;
        $ENTRIES = new asp(discoverCarouselButtonActionTargetDtoArr);
    }

    private DiscoverCarouselButtonActionTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCarouselButtonActionTargetDto valueOf(String str) {
        return (DiscoverCarouselButtonActionTargetDto) Enum.valueOf(DiscoverCarouselButtonActionTargetDto.class, str);
    }

    public static DiscoverCarouselButtonActionTargetDto[] values() {
        return (DiscoverCarouselButtonActionTargetDto[]) $VALUES.clone();
    }
}
