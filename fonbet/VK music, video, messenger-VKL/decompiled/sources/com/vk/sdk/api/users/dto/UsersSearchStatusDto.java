package com.vk.sdk.api.users.dto;

import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersSearchStatusDto.kt */
/* loaded from: classes5.dex */
public final class UsersSearchStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersSearchStatusDto[] $VALUES;

    @pmi0("6")
    public static final UsersSearchStatusDto ACTIVELY_SEARCHING;

    @pmi0("8")
    public static final UsersSearchStatusDto CIVIL_UNION;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final UsersSearchStatusDto COMPLICATED;

    @pmi0("3")
    public static final UsersSearchStatusDto ENGAGED;

    @pmi0(Gc.e)
    public static final UsersSearchStatusDto IN_LOVE;

    @pmi0("4")
    public static final UsersSearchStatusDto MARRIED;

    @pmi0("1")
    public static final UsersSearchStatusDto NOT_MARRIED;

    @pmi0("0")
    public static final UsersSearchStatusDto NOT_SPECIFIED;

    @pmi0("2")
    public static final UsersSearchStatusDto RELATIONSHIP;
    private final int value;

    static {
        UsersSearchStatusDto usersSearchStatusDto = new UsersSearchStatusDto("NOT_SPECIFIED", 0, 0);
        NOT_SPECIFIED = usersSearchStatusDto;
        UsersSearchStatusDto usersSearchStatusDto2 = new UsersSearchStatusDto("NOT_MARRIED", 1, 1);
        NOT_MARRIED = usersSearchStatusDto2;
        UsersSearchStatusDto usersSearchStatusDto3 = new UsersSearchStatusDto("RELATIONSHIP", 2, 2);
        RELATIONSHIP = usersSearchStatusDto3;
        UsersSearchStatusDto usersSearchStatusDto4 = new UsersSearchStatusDto("ENGAGED", 3, 3);
        ENGAGED = usersSearchStatusDto4;
        UsersSearchStatusDto usersSearchStatusDto5 = new UsersSearchStatusDto("MARRIED", 4, 4);
        MARRIED = usersSearchStatusDto5;
        UsersSearchStatusDto usersSearchStatusDto6 = new UsersSearchStatusDto("COMPLICATED", 5, 5);
        COMPLICATED = usersSearchStatusDto6;
        UsersSearchStatusDto usersSearchStatusDto7 = new UsersSearchStatusDto("ACTIVELY_SEARCHING", 6, 6);
        ACTIVELY_SEARCHING = usersSearchStatusDto7;
        UsersSearchStatusDto usersSearchStatusDto8 = new UsersSearchStatusDto("IN_LOVE", 7, 7);
        IN_LOVE = usersSearchStatusDto8;
        UsersSearchStatusDto usersSearchStatusDto9 = new UsersSearchStatusDto("CIVIL_UNION", 8, 8);
        CIVIL_UNION = usersSearchStatusDto9;
        UsersSearchStatusDto[] usersSearchStatusDtoArr = {usersSearchStatusDto, usersSearchStatusDto2, usersSearchStatusDto3, usersSearchStatusDto4, usersSearchStatusDto5, usersSearchStatusDto6, usersSearchStatusDto7, usersSearchStatusDto8, usersSearchStatusDto9};
        $VALUES = usersSearchStatusDtoArr;
        $ENTRIES = new asp(usersSearchStatusDtoArr);
    }

    private UsersSearchStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersSearchStatusDto valueOf(String str) {
        return (UsersSearchStatusDto) Enum.valueOf(UsersSearchStatusDto.class, str);
    }

    public static UsersSearchStatusDto[] values() {
        return (UsersSearchStatusDto[]) $VALUES.clone();
    }
}
