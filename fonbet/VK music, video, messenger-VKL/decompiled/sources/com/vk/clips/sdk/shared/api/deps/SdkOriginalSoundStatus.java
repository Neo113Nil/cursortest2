package com.vk.clips.sdk.shared.api.deps;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkOriginalSoundStatus.kt */
/* loaded from: classes17.dex */
public final class SdkOriginalSoundStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkOriginalSoundStatus[] $VALUES;
    public static final SdkOriginalSoundStatus APPROVED;
    public static final SdkOriginalSoundStatus DENIED;
    public static final SdkOriginalSoundStatus MODERATING;
    public static final SdkOriginalSoundStatus NONE;

    static {
        SdkOriginalSoundStatus sdkOriginalSoundStatus = new SdkOriginalSoundStatus("NONE", 0);
        NONE = sdkOriginalSoundStatus;
        SdkOriginalSoundStatus sdkOriginalSoundStatus2 = new SdkOriginalSoundStatus("MODERATING", 1);
        MODERATING = sdkOriginalSoundStatus2;
        SdkOriginalSoundStatus sdkOriginalSoundStatus3 = new SdkOriginalSoundStatus("APPROVED", 2);
        APPROVED = sdkOriginalSoundStatus3;
        SdkOriginalSoundStatus sdkOriginalSoundStatus4 = new SdkOriginalSoundStatus("DENIED", 3);
        DENIED = sdkOriginalSoundStatus4;
        SdkOriginalSoundStatus[] sdkOriginalSoundStatusArr = {sdkOriginalSoundStatus, sdkOriginalSoundStatus2, sdkOriginalSoundStatus3, sdkOriginalSoundStatus4};
        $VALUES = sdkOriginalSoundStatusArr;
        $ENTRIES = new asp(sdkOriginalSoundStatusArr);
    }

    public SdkOriginalSoundStatus() {
        throw null;
    }

    public static SdkOriginalSoundStatus valueOf(String str) {
        return (SdkOriginalSoundStatus) Enum.valueOf(SdkOriginalSoundStatus.class, str);
    }

    public static SdkOriginalSoundStatus[] values() {
        return (SdkOriginalSoundStatus[]) $VALUES.clone();
    }
}
