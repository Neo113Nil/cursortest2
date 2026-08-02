package com.vk.libvideo.api.quality;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QualitySettingsType.kt */
/* loaded from: classes2.dex */
public final class QualitySettingsType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QualitySettingsType[] $VALUES;
    public static final QualitySettingsType AUTO;
    public static final QualitySettingsType ECONOM;
    public static final QualitySettingsType HIGH;
    public static final QualitySettingsType MOBILE_AUTO;
    public static final QualitySettingsType MOBILE_ECONOM;
    public static final QualitySettingsType MOBILE_HIGH;
    public static final QualitySettingsType OTHER;
    public static final QualitySettingsType WIFI_AUTO;
    public static final QualitySettingsType WIFI_ECONOM;
    public static final QualitySettingsType WIFI_HIGH;
    private final int key;

    static {
        QualitySettingsType qualitySettingsType = new QualitySettingsType("WIFI_AUTO", 0, 0);
        WIFI_AUTO = qualitySettingsType;
        QualitySettingsType qualitySettingsType2 = new QualitySettingsType("WIFI_HIGH", 1, 1);
        WIFI_HIGH = qualitySettingsType2;
        QualitySettingsType qualitySettingsType3 = new QualitySettingsType("WIFI_ECONOM", 2, 2);
        WIFI_ECONOM = qualitySettingsType3;
        QualitySettingsType qualitySettingsType4 = new QualitySettingsType("MOBILE_AUTO", 3, 3);
        MOBILE_AUTO = qualitySettingsType4;
        QualitySettingsType qualitySettingsType5 = new QualitySettingsType("MOBILE_HIGH", 4, 4);
        MOBILE_HIGH = qualitySettingsType5;
        QualitySettingsType qualitySettingsType6 = new QualitySettingsType("MOBILE_ECONOM", 5, 5);
        MOBILE_ECONOM = qualitySettingsType6;
        QualitySettingsType qualitySettingsType7 = new QualitySettingsType("AUTO", 6, 6);
        AUTO = qualitySettingsType7;
        QualitySettingsType qualitySettingsType8 = new QualitySettingsType("HIGH", 7, 7);
        HIGH = qualitySettingsType8;
        QualitySettingsType qualitySettingsType9 = new QualitySettingsType("ECONOM", 8, 8);
        ECONOM = qualitySettingsType9;
        QualitySettingsType qualitySettingsType10 = new QualitySettingsType(NativeAdContent.ViewTag.OTHER, 9, 9);
        OTHER = qualitySettingsType10;
        QualitySettingsType[] qualitySettingsTypeArr = {qualitySettingsType, qualitySettingsType2, qualitySettingsType3, qualitySettingsType4, qualitySettingsType5, qualitySettingsType6, qualitySettingsType7, qualitySettingsType8, qualitySettingsType9, qualitySettingsType10};
        $VALUES = qualitySettingsTypeArr;
        $ENTRIES = new asp(qualitySettingsTypeArr);
    }

    public QualitySettingsType(String str, int i, int i2) {
        this.key = i2;
    }

    public static zrp<QualitySettingsType> h() {
        return $ENTRIES;
    }

    public static QualitySettingsType valueOf(String str) {
        return (QualitySettingsType) Enum.valueOf(QualitySettingsType.class, str);
    }

    public static QualitySettingsType[] values() {
        return (QualitySettingsType[]) $VALUES.clone();
    }

    public final int i() {
        return this.key;
    }
}
