package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasyPromoteData.kt */
/* loaded from: classes17.dex */
public final class EasyPromoteUnavailabilityTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EasyPromoteUnavailabilityTarget[] $VALUES;
    public static final EasyPromoteUnavailabilityTarget EASY_PROMOTE;
    public static final EasyPromoteUnavailabilityTarget EXTERNAL;

    static {
        EasyPromoteUnavailabilityTarget easyPromoteUnavailabilityTarget = new EasyPromoteUnavailabilityTarget("EASY_PROMOTE", 0);
        EASY_PROMOTE = easyPromoteUnavailabilityTarget;
        EasyPromoteUnavailabilityTarget easyPromoteUnavailabilityTarget2 = new EasyPromoteUnavailabilityTarget("EXTERNAL", 1);
        EXTERNAL = easyPromoteUnavailabilityTarget2;
        EasyPromoteUnavailabilityTarget[] easyPromoteUnavailabilityTargetArr = {easyPromoteUnavailabilityTarget, easyPromoteUnavailabilityTarget2};
        $VALUES = easyPromoteUnavailabilityTargetArr;
        $ENTRIES = new asp(easyPromoteUnavailabilityTargetArr);
    }

    public EasyPromoteUnavailabilityTarget() {
        throw null;
    }

    public static EasyPromoteUnavailabilityTarget valueOf(String str) {
        return (EasyPromoteUnavailabilityTarget) Enum.valueOf(EasyPromoteUnavailabilityTarget.class, str);
    }

    public static EasyPromoteUnavailabilityTarget[] values() {
        return (EasyPromoteUnavailabilityTarget[]) $VALUES.clone();
    }
}
