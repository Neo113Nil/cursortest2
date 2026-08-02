package com.vk.sdk.api.pages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagesSaveAccessEditDto.kt */
/* loaded from: classes5.dex */
public final class PagesSaveAccessEditDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PagesSaveAccessEditDto[] $VALUES;

    @pmi0("2")
    public static final PagesSaveAccessEditDto ALL;

    @pmi0("0")
    public static final PagesSaveAccessEditDto MANAGERS;

    @pmi0("1")
    public static final PagesSaveAccessEditDto MEMBERS;
    private final int value;

    static {
        PagesSaveAccessEditDto pagesSaveAccessEditDto = new PagesSaveAccessEditDto("MANAGERS", 0, 0);
        MANAGERS = pagesSaveAccessEditDto;
        PagesSaveAccessEditDto pagesSaveAccessEditDto2 = new PagesSaveAccessEditDto("MEMBERS", 1, 1);
        MEMBERS = pagesSaveAccessEditDto2;
        PagesSaveAccessEditDto pagesSaveAccessEditDto3 = new PagesSaveAccessEditDto("ALL", 2, 2);
        ALL = pagesSaveAccessEditDto3;
        PagesSaveAccessEditDto[] pagesSaveAccessEditDtoArr = {pagesSaveAccessEditDto, pagesSaveAccessEditDto2, pagesSaveAccessEditDto3};
        $VALUES = pagesSaveAccessEditDtoArr;
        $ENTRIES = new asp(pagesSaveAccessEditDtoArr);
    }

    private PagesSaveAccessEditDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PagesSaveAccessEditDto valueOf(String str) {
        return (PagesSaveAccessEditDto) Enum.valueOf(PagesSaveAccessEditDto.class, str);
    }

    public static PagesSaveAccessEditDto[] values() {
        return (PagesSaveAccessEditDto[]) $VALUES.clone();
    }
}
