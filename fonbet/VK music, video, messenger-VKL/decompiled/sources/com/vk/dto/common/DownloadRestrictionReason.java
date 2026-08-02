package com.vk.dto.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDownloadDto.kt */
/* loaded from: classes18.dex */
public final class DownloadRestrictionReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownloadRestrictionReason[] $VALUES;
    public static final DownloadRestrictionReason AUTHOR;
    public static final DownloadRestrictionReason LICENCE;
    public static final DownloadRestrictionReason PROCESSING;
    public static final DownloadRestrictionReason TECHNICAL;
    public static final DownloadRestrictionReason UNKNOWN;

    static {
        DownloadRestrictionReason downloadRestrictionReason = new DownloadRestrictionReason("AUTHOR", 0);
        AUTHOR = downloadRestrictionReason;
        DownloadRestrictionReason downloadRestrictionReason2 = new DownloadRestrictionReason("LICENCE", 1);
        LICENCE = downloadRestrictionReason2;
        DownloadRestrictionReason downloadRestrictionReason3 = new DownloadRestrictionReason("TECHNICAL", 2);
        TECHNICAL = downloadRestrictionReason3;
        DownloadRestrictionReason downloadRestrictionReason4 = new DownloadRestrictionReason("PROCESSING", 3);
        PROCESSING = downloadRestrictionReason4;
        DownloadRestrictionReason downloadRestrictionReason5 = new DownloadRestrictionReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNKNOWN = downloadRestrictionReason5;
        DownloadRestrictionReason[] downloadRestrictionReasonArr = {downloadRestrictionReason, downloadRestrictionReason2, downloadRestrictionReason3, downloadRestrictionReason4, downloadRestrictionReason5};
        $VALUES = downloadRestrictionReasonArr;
        $ENTRIES = new asp(downloadRestrictionReasonArr);
    }

    public DownloadRestrictionReason() {
        throw null;
    }

    public static DownloadRestrictionReason valueOf(String str) {
        return (DownloadRestrictionReason) Enum.valueOf(DownloadRestrictionReason.class, str);
    }

    public static DownloadRestrictionReason[] values() {
        return (DownloadRestrictionReason[]) $VALUES.clone();
    }
}
