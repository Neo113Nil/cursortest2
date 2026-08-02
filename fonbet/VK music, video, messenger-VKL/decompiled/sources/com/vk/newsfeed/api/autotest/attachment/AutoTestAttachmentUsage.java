package com.vk.newsfeed.api.autotest.attachment;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachmentAutoTestTag.kt */
/* loaded from: classes3.dex */
public final class AutoTestAttachmentUsage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoTestAttachmentUsage[] $VALUES;
    public static final AutoTestAttachmentUsage CAROUSEL;
    public static final AutoTestAttachmentUsage GRID;

    static {
        AutoTestAttachmentUsage autoTestAttachmentUsage = new AutoTestAttachmentUsage(SignalingProtocol.KEY_GRID, 0);
        GRID = autoTestAttachmentUsage;
        AutoTestAttachmentUsage autoTestAttachmentUsage2 = new AutoTestAttachmentUsage("CAROUSEL", 1);
        CAROUSEL = autoTestAttachmentUsage2;
        AutoTestAttachmentUsage[] autoTestAttachmentUsageArr = {autoTestAttachmentUsage, autoTestAttachmentUsage2};
        $VALUES = autoTestAttachmentUsageArr;
        $ENTRIES = new asp(autoTestAttachmentUsageArr);
    }

    public AutoTestAttachmentUsage() {
        throw null;
    }

    public static AutoTestAttachmentUsage valueOf(String str) {
        return (AutoTestAttachmentUsage) Enum.valueOf(AutoTestAttachmentUsage.class, str);
    }

    public static AutoTestAttachmentUsage[] values() {
        return (AutoTestAttachmentUsage[]) $VALUES.clone();
    }
}
