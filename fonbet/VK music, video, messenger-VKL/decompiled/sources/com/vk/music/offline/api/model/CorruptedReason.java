package com.vk.music.offline.api.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CorruptedReason.kt */
/* loaded from: classes3.dex */
public final class CorruptedReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CorruptedReason[] $VALUES;
    public static final a Companion;
    public static final CorruptedReason MALFORMED;
    public static final CorruptedReason MANIFEST_DB;
    public static final CorruptedReason MANIFEST_PLAYLIST;
    public static final CorruptedReason SD_CARD;
    public static final CorruptedReason SEGMENT;
    public static final CorruptedReason UNKNOWN;
    private final int value;

    /* compiled from: CorruptedReason.kt */
    public static final class a {
    }

    static {
        CorruptedReason corruptedReason = new CorruptedReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = corruptedReason;
        CorruptedReason corruptedReason2 = new CorruptedReason("MANIFEST_DB", 1, 1);
        MANIFEST_DB = corruptedReason2;
        CorruptedReason corruptedReason3 = new CorruptedReason("MANIFEST_PLAYLIST", 2, 2);
        MANIFEST_PLAYLIST = corruptedReason3;
        CorruptedReason corruptedReason4 = new CorruptedReason("SEGMENT", 3, 3);
        SEGMENT = corruptedReason4;
        CorruptedReason corruptedReason5 = new CorruptedReason("SD_CARD", 4, 4);
        SD_CARD = corruptedReason5;
        CorruptedReason corruptedReason6 = new CorruptedReason("MALFORMED", 5, 5);
        MALFORMED = corruptedReason6;
        CorruptedReason[] corruptedReasonArr = {corruptedReason, corruptedReason2, corruptedReason3, corruptedReason4, corruptedReason5, corruptedReason6};
        $VALUES = corruptedReasonArr;
        $ENTRIES = new asp(corruptedReasonArr);
        Companion = new a();
    }

    public CorruptedReason(String str, int i, int i2) {
        this.value = i2;
    }

    public static CorruptedReason valueOf(String str) {
        return (CorruptedReason) Enum.valueOf(CorruptedReason.class, str);
    }

    public static CorruptedReason[] values() {
        return (CorruptedReason[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
