package com.vk.clips.download.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsDownloadLauncher.kt */
/* loaded from: classes16.dex */
public final class ClipsDownloadLauncher$ClipsDownloadQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsDownloadLauncher$ClipsDownloadQuality[] $VALUES;
    public static final ClipsDownloadLauncher$ClipsDownloadQuality FULLHD;
    public static final ClipsDownloadLauncher$ClipsDownloadQuality HD;
    public static final ClipsDownloadLauncher$ClipsDownloadQuality SD;

    static {
        ClipsDownloadLauncher$ClipsDownloadQuality clipsDownloadLauncher$ClipsDownloadQuality = new ClipsDownloadLauncher$ClipsDownloadQuality("FULLHD", 0);
        FULLHD = clipsDownloadLauncher$ClipsDownloadQuality;
        ClipsDownloadLauncher$ClipsDownloadQuality clipsDownloadLauncher$ClipsDownloadQuality2 = new ClipsDownloadLauncher$ClipsDownloadQuality("HD", 1);
        HD = clipsDownloadLauncher$ClipsDownloadQuality2;
        ClipsDownloadLauncher$ClipsDownloadQuality clipsDownloadLauncher$ClipsDownloadQuality3 = new ClipsDownloadLauncher$ClipsDownloadQuality("SD", 2);
        SD = clipsDownloadLauncher$ClipsDownloadQuality3;
        ClipsDownloadLauncher$ClipsDownloadQuality[] clipsDownloadLauncher$ClipsDownloadQualityArr = {clipsDownloadLauncher$ClipsDownloadQuality, clipsDownloadLauncher$ClipsDownloadQuality2, clipsDownloadLauncher$ClipsDownloadQuality3};
        $VALUES = clipsDownloadLauncher$ClipsDownloadQualityArr;
        $ENTRIES = new asp(clipsDownloadLauncher$ClipsDownloadQualityArr);
    }

    public ClipsDownloadLauncher$ClipsDownloadQuality() {
        throw null;
    }

    public static ClipsDownloadLauncher$ClipsDownloadQuality valueOf(String str) {
        return (ClipsDownloadLauncher$ClipsDownloadQuality) Enum.valueOf(ClipsDownloadLauncher$ClipsDownloadQuality.class, str);
    }

    public static ClipsDownloadLauncher$ClipsDownloadQuality[] values() {
        return (ClipsDownloadLauncher$ClipsDownloadQuality[]) $VALUES.clone();
    }
}
