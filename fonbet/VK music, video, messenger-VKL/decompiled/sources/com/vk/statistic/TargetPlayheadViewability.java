package com.vk.statistic;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TargetPlayheadViewability.kt */
/* loaded from: classes5.dex */
public final class TargetPlayheadViewability {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TargetPlayheadViewability[] $VALUES;
    public static final TargetPlayheadViewability BANNER;
    public static final a Companion;
    public static final TargetPlayheadViewability VIDEO;

    /* compiled from: TargetPlayheadViewability.kt */
    public static final class a {
    }

    static {
        TargetPlayheadViewability targetPlayheadViewability = new TargetPlayheadViewability("BANNER", 0);
        BANNER = targetPlayheadViewability;
        TargetPlayheadViewability targetPlayheadViewability2 = new TargetPlayheadViewability(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = targetPlayheadViewability2;
        TargetPlayheadViewability[] targetPlayheadViewabilityArr = {targetPlayheadViewability, targetPlayheadViewability2};
        $VALUES = targetPlayheadViewabilityArr;
        $ENTRIES = new asp(targetPlayheadViewabilityArr);
        Companion = new a();
    }

    public TargetPlayheadViewability() {
        throw null;
    }

    public static zrp<TargetPlayheadViewability> h() {
        return $ENTRIES;
    }

    public static TargetPlayheadViewability valueOf(String str) {
        return (TargetPlayheadViewability) Enum.valueOf(TargetPlayheadViewability.class, str);
    }

    public static TargetPlayheadViewability[] values() {
        return (TargetPlayheadViewability[]) $VALUES.clone();
    }
}
