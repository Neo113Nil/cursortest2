package com.vk.sdk.api.pages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagesSaveAccessViewDto.kt */
/* loaded from: classes5.dex */
public final class PagesSaveAccessViewDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PagesSaveAccessViewDto[] $VALUES;

    @pmi0("2")
    public static final PagesSaveAccessViewDto ALL;

    @pmi0("0")
    public static final PagesSaveAccessViewDto MANAGERS;

    @pmi0("1")
    public static final PagesSaveAccessViewDto MEMBERS;
    private final int value;

    static {
        PagesSaveAccessViewDto pagesSaveAccessViewDto = new PagesSaveAccessViewDto("MANAGERS", 0, 0);
        MANAGERS = pagesSaveAccessViewDto;
        PagesSaveAccessViewDto pagesSaveAccessViewDto2 = new PagesSaveAccessViewDto("MEMBERS", 1, 1);
        MEMBERS = pagesSaveAccessViewDto2;
        PagesSaveAccessViewDto pagesSaveAccessViewDto3 = new PagesSaveAccessViewDto("ALL", 2, 2);
        ALL = pagesSaveAccessViewDto3;
        PagesSaveAccessViewDto[] pagesSaveAccessViewDtoArr = {pagesSaveAccessViewDto, pagesSaveAccessViewDto2, pagesSaveAccessViewDto3};
        $VALUES = pagesSaveAccessViewDtoArr;
        $ENTRIES = new asp(pagesSaveAccessViewDtoArr);
    }

    private PagesSaveAccessViewDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PagesSaveAccessViewDto valueOf(String str) {
        return (PagesSaveAccessViewDto) Enum.valueOf(PagesSaveAccessViewDto.class, str);
    }

    public static PagesSaveAccessViewDto[] values() {
        return (PagesSaveAccessViewDto[]) $VALUES.clone();
    }
}
