package com.vk.dto.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OriginalSoundStatus.kt */
/* loaded from: classes18.dex */
public final class OriginalSoundStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OriginalSoundStatus[] $VALUES;
    public static final OriginalSoundStatus APPROVED;
    public static final OriginalSoundStatus DENIED;
    public static final OriginalSoundStatus MODERATING;
    public static final OriginalSoundStatus NONE;

    static {
        OriginalSoundStatus originalSoundStatus = new OriginalSoundStatus("NONE", 0);
        NONE = originalSoundStatus;
        OriginalSoundStatus originalSoundStatus2 = new OriginalSoundStatus("MODERATING", 1);
        MODERATING = originalSoundStatus2;
        OriginalSoundStatus originalSoundStatus3 = new OriginalSoundStatus("APPROVED", 2);
        APPROVED = originalSoundStatus3;
        OriginalSoundStatus originalSoundStatus4 = new OriginalSoundStatus("DENIED", 3);
        DENIED = originalSoundStatus4;
        OriginalSoundStatus[] originalSoundStatusArr = {originalSoundStatus, originalSoundStatus2, originalSoundStatus3, originalSoundStatus4};
        $VALUES = originalSoundStatusArr;
        $ENTRIES = new asp(originalSoundStatusArr);
    }

    public OriginalSoundStatus() {
        throw null;
    }

    public static OriginalSoundStatus valueOf(String str) {
        return (OriginalSoundStatus) Enum.valueOf(OriginalSoundStatus.class, str);
    }

    public static OriginalSoundStatus[] values() {
        return (OriginalSoundStatus[]) $VALUES.clone();
    }
}
