package com.vk.sdk.api.pages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagesPrivacySettingsDto.kt */
/* loaded from: classes5.dex */
public final class PagesPrivacySettingsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PagesPrivacySettingsDto[] $VALUES;

    @pmi0("0")
    public static final PagesPrivacySettingsDto COMMUNITY_MANAGERS_ONLY;

    @pmi0("1")
    public static final PagesPrivacySettingsDto COMMUNITY_MEMBERS_ONLY;

    @pmi0("2")
    public static final PagesPrivacySettingsDto EVERYONE;
    private final int value;

    static {
        PagesPrivacySettingsDto pagesPrivacySettingsDto = new PagesPrivacySettingsDto("COMMUNITY_MANAGERS_ONLY", 0, 0);
        COMMUNITY_MANAGERS_ONLY = pagesPrivacySettingsDto;
        PagesPrivacySettingsDto pagesPrivacySettingsDto2 = new PagesPrivacySettingsDto("COMMUNITY_MEMBERS_ONLY", 1, 1);
        COMMUNITY_MEMBERS_ONLY = pagesPrivacySettingsDto2;
        PagesPrivacySettingsDto pagesPrivacySettingsDto3 = new PagesPrivacySettingsDto("EVERYONE", 2, 2);
        EVERYONE = pagesPrivacySettingsDto3;
        PagesPrivacySettingsDto[] pagesPrivacySettingsDtoArr = {pagesPrivacySettingsDto, pagesPrivacySettingsDto2, pagesPrivacySettingsDto3};
        $VALUES = pagesPrivacySettingsDtoArr;
        $ENTRIES = new asp(pagesPrivacySettingsDtoArr);
    }

    private PagesPrivacySettingsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PagesPrivacySettingsDto valueOf(String str) {
        return (PagesPrivacySettingsDto) Enum.valueOf(PagesPrivacySettingsDto.class, str);
    }

    public static PagesPrivacySettingsDto[] values() {
        return (PagesPrivacySettingsDto[]) $VALUES.clone();
    }
}
