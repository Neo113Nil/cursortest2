package com.vk.voip.ui.scheduled.creation.feature.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipScheduledCallStatReport.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallReportType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipScheduledCallReportType[] $VALUES;
    public static final VoipScheduledCallReportType SCHEDULED;
    public static final VoipScheduledCallReportType SCHEDULED_CALL_EDITED;

    static {
        VoipScheduledCallReportType voipScheduledCallReportType = new VoipScheduledCallReportType("SCHEDULED", 0);
        SCHEDULED = voipScheduledCallReportType;
        VoipScheduledCallReportType voipScheduledCallReportType2 = new VoipScheduledCallReportType("SCHEDULED_CALL_EDITED", 1);
        SCHEDULED_CALL_EDITED = voipScheduledCallReportType2;
        VoipScheduledCallReportType[] voipScheduledCallReportTypeArr = {voipScheduledCallReportType, voipScheduledCallReportType2};
        $VALUES = voipScheduledCallReportTypeArr;
        $ENTRIES = new asp(voipScheduledCallReportTypeArr);
    }

    public VoipScheduledCallReportType() {
        throw null;
    }

    public static VoipScheduledCallReportType valueOf(String str) {
        return (VoipScheduledCallReportType) Enum.valueOf(VoipScheduledCallReportType.class, str);
    }

    public static VoipScheduledCallReportType[] values() {
        return (VoipScheduledCallReportType[]) $VALUES.clone();
    }
}
