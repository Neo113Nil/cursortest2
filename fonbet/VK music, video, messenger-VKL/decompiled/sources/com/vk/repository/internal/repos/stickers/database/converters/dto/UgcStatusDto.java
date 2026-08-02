package com.vk.repository.internal.repos.stickers.database.converters.dto;

import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UgcStatusDto.kt */
/* loaded from: classes5.dex */
public final class UgcStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UgcStatusDto[] $VALUES;
    public static final UgcStatusDto AGE_RESTRICTED;
    public static final UgcStatusDto BANNED;
    public static final UgcStatusDto CLAIMED;
    public static final a Companion;
    public static final UgcStatusDto DELETED;
    public static final UgcStatusDto OK;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: UgcStatusDto.kt */
    public static final class a {
    }

    static {
        UgcStatusDto ugcStatusDto = new UgcStatusDto("CLAIMED", 0, "claimed");
        CLAIMED = ugcStatusDto;
        UgcStatusDto ugcStatusDto2 = new UgcStatusDto("BANNED", 1, "banned");
        BANNED = ugcStatusDto2;
        UgcStatusDto ugcStatusDto3 = new UgcStatusDto("DELETED", 2, "deleted");
        DELETED = ugcStatusDto3;
        UgcStatusDto ugcStatusDto4 = new UgcStatusDto("AGE_RESTRICTED", 3, "age_restricted");
        AGE_RESTRICTED = ugcStatusDto4;
        UgcStatusDto ugcStatusDto5 = new UgcStatusDto("OK", 4, ApiUris.SCHEME_OK);
        OK = ugcStatusDto5;
        UgcStatusDto[] ugcStatusDtoArr = {ugcStatusDto, ugcStatusDto2, ugcStatusDto3, ugcStatusDto4, ugcStatusDto5};
        $VALUES = ugcStatusDtoArr;
        $ENTRIES = new asp(ugcStatusDtoArr);
        Companion = new a();
    }

    private UgcStatusDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static UgcStatusDto valueOf(String str) {
        return (UgcStatusDto) Enum.valueOf(UgcStatusDto.class, str);
    }

    public static UgcStatusDto[] values() {
        return (UgcStatusDto[]) $VALUES.clone();
    }
}
