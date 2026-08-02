package com.vk.newsfeed.common.presentation.model.items;

import java.io.Serializable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostCoownersInviteBannerUiDto.kt */
/* loaded from: classes4.dex */
public final class CoownershipStatusUiDto implements Serializable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoownershipStatusUiDto[] $VALUES;
    public static final CoownershipStatusUiDto Approved;
    public static final CoownershipStatusUiDto Closed;
    public static final CoownershipStatusUiDto None;
    public static final CoownershipStatusUiDto Rejected;

    static {
        CoownershipStatusUiDto coownershipStatusUiDto = new CoownershipStatusUiDto("None", 0);
        None = coownershipStatusUiDto;
        CoownershipStatusUiDto coownershipStatusUiDto2 = new CoownershipStatusUiDto("Approved", 1);
        Approved = coownershipStatusUiDto2;
        CoownershipStatusUiDto coownershipStatusUiDto3 = new CoownershipStatusUiDto("Rejected", 2);
        Rejected = coownershipStatusUiDto3;
        CoownershipStatusUiDto coownershipStatusUiDto4 = new CoownershipStatusUiDto("Closed", 3);
        Closed = coownershipStatusUiDto4;
        CoownershipStatusUiDto[] coownershipStatusUiDtoArr = {coownershipStatusUiDto, coownershipStatusUiDto2, coownershipStatusUiDto3, coownershipStatusUiDto4};
        $VALUES = coownershipStatusUiDtoArr;
        $ENTRIES = new asp(coownershipStatusUiDtoArr);
    }

    public CoownershipStatusUiDto() {
        throw null;
    }

    public static CoownershipStatusUiDto valueOf(String str) {
        return (CoownershipStatusUiDto) Enum.valueOf(CoownershipStatusUiDto.class, str);
    }

    public static CoownershipStatusUiDto[] values() {
        return (CoownershipStatusUiDto[]) $VALUES.clone();
    }
}
