package com.vk.ecomm.moderation.api.restrictions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModerationCheckAdultResult.kt */
/* loaded from: classes18.dex */
public final class ModerationCheckAdultResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ModerationCheckAdultResult[] $VALUES;
    public static final ModerationCheckAdultResult ADULT_NOT_REQUIRED;
    public static final ModerationCheckAdultResult CONFIRM_ADULT_REQUIRED;
    public static final ModerationCheckAdultResult ONLY_FOR_ADULT;

    static {
        ModerationCheckAdultResult moderationCheckAdultResult = new ModerationCheckAdultResult("ONLY_FOR_ADULT", 0);
        ONLY_FOR_ADULT = moderationCheckAdultResult;
        ModerationCheckAdultResult moderationCheckAdultResult2 = new ModerationCheckAdultResult("CONFIRM_ADULT_REQUIRED", 1);
        CONFIRM_ADULT_REQUIRED = moderationCheckAdultResult2;
        ModerationCheckAdultResult moderationCheckAdultResult3 = new ModerationCheckAdultResult("ADULT_NOT_REQUIRED", 2);
        ADULT_NOT_REQUIRED = moderationCheckAdultResult3;
        ModerationCheckAdultResult[] moderationCheckAdultResultArr = {moderationCheckAdultResult, moderationCheckAdultResult2, moderationCheckAdultResult3};
        $VALUES = moderationCheckAdultResultArr;
        $ENTRIES = new asp(moderationCheckAdultResultArr);
    }

    public ModerationCheckAdultResult() {
        throw null;
    }

    public static ModerationCheckAdultResult valueOf(String str) {
        return (ModerationCheckAdultResult) Enum.valueOf(ModerationCheckAdultResult.class, str);
    }

    public static ModerationCheckAdultResult[] values() {
        return (ModerationCheckAdultResult[]) $VALUES.clone();
    }
}
