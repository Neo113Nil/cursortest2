package com.vk.sdk.api.polls.dto;

import com.ironsource.C4243ba;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetByIdNameCaseDto.kt */
/* loaded from: classes5.dex */
public final class PollsGetByIdNameCaseDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetByIdNameCaseDto[] $VALUES;

    @pmi0("abl")
    public static final PollsGetByIdNameCaseDto ABL;

    @pmi0("acc")
    public static final PollsGetByIdNameCaseDto ACC;

    @pmi0("dat")
    public static final PollsGetByIdNameCaseDto DAT;

    @pmi0(C4243ba.n)
    public static final PollsGetByIdNameCaseDto GEN;

    @pmi0("ins")
    public static final PollsGetByIdNameCaseDto INS;

    @pmi0("nom")
    public static final PollsGetByIdNameCaseDto NOM;
    private final String value;

    static {
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto = new PollsGetByIdNameCaseDto("ABL", 0, "abl");
        ABL = pollsGetByIdNameCaseDto;
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto2 = new PollsGetByIdNameCaseDto("ACC", 1, "acc");
        ACC = pollsGetByIdNameCaseDto2;
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto3 = new PollsGetByIdNameCaseDto("DAT", 2, "dat");
        DAT = pollsGetByIdNameCaseDto3;
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto4 = new PollsGetByIdNameCaseDto("GEN", 3, C4243ba.n);
        GEN = pollsGetByIdNameCaseDto4;
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto5 = new PollsGetByIdNameCaseDto("INS", 4, "ins");
        INS = pollsGetByIdNameCaseDto5;
        PollsGetByIdNameCaseDto pollsGetByIdNameCaseDto6 = new PollsGetByIdNameCaseDto("NOM", 5, "nom");
        NOM = pollsGetByIdNameCaseDto6;
        PollsGetByIdNameCaseDto[] pollsGetByIdNameCaseDtoArr = {pollsGetByIdNameCaseDto, pollsGetByIdNameCaseDto2, pollsGetByIdNameCaseDto3, pollsGetByIdNameCaseDto4, pollsGetByIdNameCaseDto5, pollsGetByIdNameCaseDto6};
        $VALUES = pollsGetByIdNameCaseDtoArr;
        $ENTRIES = new asp(pollsGetByIdNameCaseDtoArr);
    }

    private PollsGetByIdNameCaseDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PollsGetByIdNameCaseDto valueOf(String str) {
        return (PollsGetByIdNameCaseDto) Enum.valueOf(PollsGetByIdNameCaseDto.class, str);
    }

    public static PollsGetByIdNameCaseDto[] values() {
        return (PollsGetByIdNameCaseDto[]) $VALUES.clone();
    }
}
