package com.vk.libvideo.api.quality;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QualitySettingsInterval.kt */
/* loaded from: classes2.dex */
public final class QualitySettingsInterval {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QualitySettingsInterval[] $VALUES;
    public static final QualitySettingsInterval AUTO;
    public static final QualitySettingsInterval ECONOM;
    public static final QualitySettingsInterval HIGH;
    public static final QualitySettingsInterval OTHER;
    private final AdaptiveTrackSelectionInterval interval;

    static {
        QualitySettingsInterval qualitySettingsInterval = new QualitySettingsInterval("AUTO", 0, AdaptiveTrackSelectionInterval.DEFAULT);
        AUTO = qualitySettingsInterval;
        QualitySettingsInterval qualitySettingsInterval2 = new QualitySettingsInterval("HIGH", 1, AdaptiveTrackSelectionInterval.HIGH);
        HIGH = qualitySettingsInterval2;
        QualitySettingsInterval qualitySettingsInterval3 = new QualitySettingsInterval("ECONOM", 2, AdaptiveTrackSelectionInterval.LOW);
        ECONOM = qualitySettingsInterval3;
        QualitySettingsInterval qualitySettingsInterval4 = new QualitySettingsInterval(NativeAdContent.ViewTag.OTHER, 3, null);
        OTHER = qualitySettingsInterval4;
        QualitySettingsInterval[] qualitySettingsIntervalArr = {qualitySettingsInterval, qualitySettingsInterval2, qualitySettingsInterval3, qualitySettingsInterval4};
        $VALUES = qualitySettingsIntervalArr;
        $ENTRIES = new asp(qualitySettingsIntervalArr);
    }

    public QualitySettingsInterval(String str, int i, AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval) {
        this.interval = adaptiveTrackSelectionInterval;
    }

    public static QualitySettingsInterval valueOf(String str) {
        return (QualitySettingsInterval) Enum.valueOf(QualitySettingsInterval.class, str);
    }

    public static QualitySettingsInterval[] values() {
        return (QualitySettingsInterval[]) $VALUES.clone();
    }

    public final AdaptiveTrackSelectionInterval h() {
        return this.interval;
    }
}
