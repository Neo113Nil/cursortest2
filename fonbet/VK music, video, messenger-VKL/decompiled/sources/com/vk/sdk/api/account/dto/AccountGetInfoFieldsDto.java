package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountGetInfoFieldsDto.kt */
/* loaded from: classes5.dex */
public final class AccountGetInfoFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountGetInfoFieldsDto[] $VALUES;

    @pmi0("audio_autoplay")
    public static final AccountGetInfoFieldsDto AUDIO_AUTOPLAY;

    @pmi0("country")
    public static final AccountGetInfoFieldsDto COUNTRY;

    @pmi0("https_required")
    public static final AccountGetInfoFieldsDto HTTPS_REQUIRED;

    @pmi0("intro")
    public static final AccountGetInfoFieldsDto INTRO;

    @pmi0("lang")
    public static final AccountGetInfoFieldsDto LANG;

    @pmi0("no_wall_replies")
    public static final AccountGetInfoFieldsDto NO_WALL_REPLIES;

    @pmi0("own_posts_default")
    public static final AccountGetInfoFieldsDto OWN_POSTS_DEFAULT;
    private final String value;

    static {
        AccountGetInfoFieldsDto accountGetInfoFieldsDto = new AccountGetInfoFieldsDto("COUNTRY", 0, "country");
        COUNTRY = accountGetInfoFieldsDto;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto2 = new AccountGetInfoFieldsDto("HTTPS_REQUIRED", 1, "https_required");
        HTTPS_REQUIRED = accountGetInfoFieldsDto2;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto3 = new AccountGetInfoFieldsDto("OWN_POSTS_DEFAULT", 2, "own_posts_default");
        OWN_POSTS_DEFAULT = accountGetInfoFieldsDto3;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto4 = new AccountGetInfoFieldsDto("NO_WALL_REPLIES", 3, "no_wall_replies");
        NO_WALL_REPLIES = accountGetInfoFieldsDto4;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto5 = new AccountGetInfoFieldsDto("INTRO", 4, "intro");
        INTRO = accountGetInfoFieldsDto5;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto6 = new AccountGetInfoFieldsDto("LANG", 5, "lang");
        LANG = accountGetInfoFieldsDto6;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto7 = new AccountGetInfoFieldsDto("AUDIO_AUTOPLAY", 6, "audio_autoplay");
        AUDIO_AUTOPLAY = accountGetInfoFieldsDto7;
        AccountGetInfoFieldsDto[] accountGetInfoFieldsDtoArr = {accountGetInfoFieldsDto, accountGetInfoFieldsDto2, accountGetInfoFieldsDto3, accountGetInfoFieldsDto4, accountGetInfoFieldsDto5, accountGetInfoFieldsDto6, accountGetInfoFieldsDto7};
        $VALUES = accountGetInfoFieldsDtoArr;
        $ENTRIES = new asp(accountGetInfoFieldsDtoArr);
    }

    private AccountGetInfoFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountGetInfoFieldsDto valueOf(String str) {
        return (AccountGetInfoFieldsDto) Enum.valueOf(AccountGetInfoFieldsDto.class, str);
    }

    public static AccountGetInfoFieldsDto[] values() {
        return (AccountGetInfoFieldsDto[]) $VALUES.clone();
    }
}
