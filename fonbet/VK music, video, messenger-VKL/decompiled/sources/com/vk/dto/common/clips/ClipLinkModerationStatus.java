package com.vk.dto.common.clips;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipLinkModerationStatus.kt */
/* loaded from: classes18.dex */
public final class ClipLinkModerationStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipLinkModerationStatus[] $VALUES;
    public static final ClipLinkModerationStatus APPROVED;
    public static final a Companion;
    public static final ClipLinkModerationStatus NOT_MODERATED;
    public static final ClipLinkModerationStatus PENDING_MODERATION;
    public static final ClipLinkModerationStatus REJECTED;
    public static final ClipLinkModerationStatus UNDEFINED;
    private final int serverValue;

    /* compiled from: ClipLinkModerationStatus.kt */
    public static final class a {
        public static ClipLinkModerationStatus a(Integer num) {
            ClipLinkModerationStatus clipLinkModerationStatus;
            ClipLinkModerationStatus[] values = ClipLinkModerationStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    clipLinkModerationStatus = null;
                    break;
                }
                clipLinkModerationStatus = values[i];
                int h = clipLinkModerationStatus.h();
                if (num != null && h == num.intValue()) {
                    break;
                }
                i++;
            }
            return clipLinkModerationStatus == null ? ClipLinkModerationStatus.UNDEFINED : clipLinkModerationStatus;
        }
    }

    static {
        ClipLinkModerationStatus clipLinkModerationStatus = new ClipLinkModerationStatus("UNDEFINED", 0, -1);
        UNDEFINED = clipLinkModerationStatus;
        ClipLinkModerationStatus clipLinkModerationStatus2 = new ClipLinkModerationStatus("NOT_MODERATED", 1, 0);
        NOT_MODERATED = clipLinkModerationStatus2;
        ClipLinkModerationStatus clipLinkModerationStatus3 = new ClipLinkModerationStatus("PENDING_MODERATION", 2, 1);
        PENDING_MODERATION = clipLinkModerationStatus3;
        ClipLinkModerationStatus clipLinkModerationStatus4 = new ClipLinkModerationStatus("REJECTED", 3, 2);
        REJECTED = clipLinkModerationStatus4;
        ClipLinkModerationStatus clipLinkModerationStatus5 = new ClipLinkModerationStatus("APPROVED", 4, 3);
        APPROVED = clipLinkModerationStatus5;
        ClipLinkModerationStatus[] clipLinkModerationStatusArr = {clipLinkModerationStatus, clipLinkModerationStatus2, clipLinkModerationStatus3, clipLinkModerationStatus4, clipLinkModerationStatus5};
        $VALUES = clipLinkModerationStatusArr;
        $ENTRIES = new asp(clipLinkModerationStatusArr);
        Companion = new a();
    }

    public ClipLinkModerationStatus(String str, int i, int i2) {
        this.serverValue = i2;
    }

    public static ClipLinkModerationStatus valueOf(String str) {
        return (ClipLinkModerationStatus) Enum.valueOf(ClipLinkModerationStatus.class, str);
    }

    public static ClipLinkModerationStatus[] values() {
        return (ClipLinkModerationStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.serverValue;
    }
}
