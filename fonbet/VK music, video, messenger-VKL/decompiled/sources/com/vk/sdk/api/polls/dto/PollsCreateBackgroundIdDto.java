package com.vk.sdk.api.polls.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsCreateBackgroundIdDto.kt */
/* loaded from: classes5.dex */
public final class PollsCreateBackgroundIdDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsCreateBackgroundIdDto[] $VALUES;

    @pmi0("1")
    public static final PollsCreateBackgroundIdDto TYPE_1;

    @pmi0("2")
    public static final PollsCreateBackgroundIdDto TYPE_2;

    @pmi0("3")
    public static final PollsCreateBackgroundIdDto TYPE_3;

    @pmi0("4")
    public static final PollsCreateBackgroundIdDto TYPE_4;

    @pmi0("6")
    public static final PollsCreateBackgroundIdDto TYPE_6;

    @pmi0("8")
    public static final PollsCreateBackgroundIdDto TYPE_8;

    @pmi0("9")
    public static final PollsCreateBackgroundIdDto TYPE_9;
    private final String value;

    static {
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto = new PollsCreateBackgroundIdDto("TYPE_1", 0, "1");
        TYPE_1 = pollsCreateBackgroundIdDto;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto2 = new PollsCreateBackgroundIdDto("TYPE_2", 1, "2");
        TYPE_2 = pollsCreateBackgroundIdDto2;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto3 = new PollsCreateBackgroundIdDto("TYPE_3", 2, "3");
        TYPE_3 = pollsCreateBackgroundIdDto3;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto4 = new PollsCreateBackgroundIdDto("TYPE_4", 3, "4");
        TYPE_4 = pollsCreateBackgroundIdDto4;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto5 = new PollsCreateBackgroundIdDto("TYPE_6", 4, "6");
        TYPE_6 = pollsCreateBackgroundIdDto5;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto6 = new PollsCreateBackgroundIdDto("TYPE_8", 5, "8");
        TYPE_8 = pollsCreateBackgroundIdDto6;
        PollsCreateBackgroundIdDto pollsCreateBackgroundIdDto7 = new PollsCreateBackgroundIdDto("TYPE_9", 6, "9");
        TYPE_9 = pollsCreateBackgroundIdDto7;
        PollsCreateBackgroundIdDto[] pollsCreateBackgroundIdDtoArr = {pollsCreateBackgroundIdDto, pollsCreateBackgroundIdDto2, pollsCreateBackgroundIdDto3, pollsCreateBackgroundIdDto4, pollsCreateBackgroundIdDto5, pollsCreateBackgroundIdDto6, pollsCreateBackgroundIdDto7};
        $VALUES = pollsCreateBackgroundIdDtoArr;
        $ENTRIES = new asp(pollsCreateBackgroundIdDtoArr);
    }

    private PollsCreateBackgroundIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PollsCreateBackgroundIdDto valueOf(String str) {
        return (PollsCreateBackgroundIdDto) Enum.valueOf(PollsCreateBackgroundIdDto.class, str);
    }

    public static PollsCreateBackgroundIdDto[] values() {
        return (PollsCreateBackgroundIdDto[]) $VALUES.clone();
    }
}
