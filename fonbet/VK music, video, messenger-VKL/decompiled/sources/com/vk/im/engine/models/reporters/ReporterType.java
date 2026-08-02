package com.vk.im.engine.models.reporters;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReporterType.kt */
/* loaded from: classes2.dex */
public final class ReporterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReporterType[] $VALUES;
    public static final ReporterType CHANNEL;
    public static final ReporterType CHAT;
    public static final ReporterType GROUP_CHAT;

    static {
        ReporterType reporterType = new ReporterType("CHAT", 0);
        CHAT = reporterType;
        ReporterType reporterType2 = new ReporterType("GROUP_CHAT", 1);
        GROUP_CHAT = reporterType2;
        ReporterType reporterType3 = new ReporterType("CHANNEL", 2);
        CHANNEL = reporterType3;
        ReporterType[] reporterTypeArr = {reporterType, reporterType2, reporterType3};
        $VALUES = reporterTypeArr;
        $ENTRIES = new asp(reporterTypeArr);
    }

    public ReporterType() {
        throw null;
    }

    public static ReporterType valueOf(String str) {
        return (ReporterType) Enum.valueOf(ReporterType.class, str);
    }

    public static ReporterType[] values() {
        return (ReporterType[]) $VALUES.clone();
    }
}
