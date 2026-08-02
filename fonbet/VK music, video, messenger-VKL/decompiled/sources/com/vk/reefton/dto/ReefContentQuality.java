package com.vk.reefton.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefContentQuality.kt */
/* loaded from: classes5.dex */
public final class ReefContentQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefContentQuality[] $VALUES;
    public static final ReefContentQuality AUTO;
    public static final ReefContentQuality P1080;
    public static final ReefContentQuality P144;
    public static final ReefContentQuality P1440;
    public static final ReefContentQuality P2160;
    public static final ReefContentQuality P240;
    public static final ReefContentQuality P360;
    public static final ReefContentQuality P480;
    public static final ReefContentQuality P720;
    public static final ReefContentQuality UNKNOWN;

    static {
        ReefContentQuality reefContentQuality = new ReefContentQuality(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = reefContentQuality;
        ReefContentQuality reefContentQuality2 = new ReefContentQuality("AUTO", 1);
        AUTO = reefContentQuality2;
        ReefContentQuality reefContentQuality3 = new ReefContentQuality("P144", 2);
        P144 = reefContentQuality3;
        ReefContentQuality reefContentQuality4 = new ReefContentQuality("P240", 3);
        P240 = reefContentQuality4;
        ReefContentQuality reefContentQuality5 = new ReefContentQuality("P360", 4);
        P360 = reefContentQuality5;
        ReefContentQuality reefContentQuality6 = new ReefContentQuality("P480", 5);
        P480 = reefContentQuality6;
        ReefContentQuality reefContentQuality7 = new ReefContentQuality("P720", 6);
        P720 = reefContentQuality7;
        ReefContentQuality reefContentQuality8 = new ReefContentQuality("P1080", 7);
        P1080 = reefContentQuality8;
        ReefContentQuality reefContentQuality9 = new ReefContentQuality("P1440", 8);
        P1440 = reefContentQuality9;
        ReefContentQuality reefContentQuality10 = new ReefContentQuality("P2160", 9);
        P2160 = reefContentQuality10;
        ReefContentQuality[] reefContentQualityArr = {reefContentQuality, reefContentQuality2, reefContentQuality3, reefContentQuality4, reefContentQuality5, reefContentQuality6, reefContentQuality7, reefContentQuality8, reefContentQuality9, reefContentQuality10};
        $VALUES = reefContentQualityArr;
        $ENTRIES = new asp(reefContentQualityArr);
    }

    public ReefContentQuality() {
        throw null;
    }

    public static ReefContentQuality valueOf(String str) {
        return (ReefContentQuality) Enum.valueOf(ReefContentQuality.class, str);
    }

    public static ReefContentQuality[] values() {
        return (ReefContentQuality[]) $VALUES.clone();
    }
}
