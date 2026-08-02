package com.vk.sdk.api.users.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersReportTypeDto.kt */
/* loaded from: classes5.dex */
public final class UsersReportTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersReportTypeDto[] $VALUES;

    @pmi0("advertisement")
    public static final UsersReportTypeDto ADVERTISEMENT;

    @pmi0("advertisment")
    public static final UsersReportTypeDto ADVERTISMENT;

    @pmi0("fraud")
    public static final UsersReportTypeDto FRAUD;

    @pmi0("insult")
    public static final UsersReportTypeDto INSULT;

    @pmi0("porn")
    public static final UsersReportTypeDto PORN;

    @pmi0("spam")
    public static final UsersReportTypeDto SPAM;
    private final String value;

    static {
        UsersReportTypeDto usersReportTypeDto = new UsersReportTypeDto("ADVERTISEMENT", 0, "advertisement");
        ADVERTISEMENT = usersReportTypeDto;
        UsersReportTypeDto usersReportTypeDto2 = new UsersReportTypeDto("ADVERTISMENT", 1, "advertisment");
        ADVERTISMENT = usersReportTypeDto2;
        UsersReportTypeDto usersReportTypeDto3 = new UsersReportTypeDto("FRAUD", 2, "fraud");
        FRAUD = usersReportTypeDto3;
        UsersReportTypeDto usersReportTypeDto4 = new UsersReportTypeDto("INSULT", 3, "insult");
        INSULT = usersReportTypeDto4;
        UsersReportTypeDto usersReportTypeDto5 = new UsersReportTypeDto("PORN", 4, "porn");
        PORN = usersReportTypeDto5;
        UsersReportTypeDto usersReportTypeDto6 = new UsersReportTypeDto("SPAM", 5, "spam");
        SPAM = usersReportTypeDto6;
        UsersReportTypeDto[] usersReportTypeDtoArr = {usersReportTypeDto, usersReportTypeDto2, usersReportTypeDto3, usersReportTypeDto4, usersReportTypeDto5, usersReportTypeDto6};
        $VALUES = usersReportTypeDtoArr;
        $ENTRIES = new asp(usersReportTypeDtoArr);
    }

    private UsersReportTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersReportTypeDto valueOf(String str) {
        return (UsersReportTypeDto) Enum.valueOf(UsersReportTypeDto.class, str);
    }

    public static UsersReportTypeDto[] values() {
        return (UsersReportTypeDto[]) $VALUES.clone();
    }
}
