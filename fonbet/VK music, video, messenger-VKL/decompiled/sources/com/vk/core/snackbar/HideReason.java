package com.vk.core.snackbar;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HideReason.kt */
/* loaded from: classes17.dex */
public final class HideReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HideReason[] $VALUES;
    public static final HideReason Consecutive;
    public static final HideReason Manual;
    public static final HideReason RootViewDetached;
    public static final HideReason Swipe;
    public static final HideReason Timeout;

    static {
        HideReason hideReason = new HideReason(AndroidInitializeBoldSDK.MSG_TIMEOUT, 0);
        Timeout = hideReason;
        HideReason hideReason2 = new HideReason("Swipe", 1);
        Swipe = hideReason2;
        HideReason hideReason3 = new HideReason("Manual", 2);
        Manual = hideReason3;
        HideReason hideReason4 = new HideReason("RootViewDetached", 3);
        RootViewDetached = hideReason4;
        HideReason hideReason5 = new HideReason("Consecutive", 4);
        Consecutive = hideReason5;
        HideReason[] hideReasonArr = {hideReason, hideReason2, hideReason3, hideReason4, hideReason5};
        $VALUES = hideReasonArr;
        $ENTRIES = new asp(hideReasonArr);
    }

    public HideReason() {
        throw null;
    }

    public static HideReason valueOf(String str) {
        return (HideReason) Enum.valueOf(HideReason.class, str);
    }

    public static HideReason[] values() {
        return (HideReason[]) $VALUES.clone();
    }
}
