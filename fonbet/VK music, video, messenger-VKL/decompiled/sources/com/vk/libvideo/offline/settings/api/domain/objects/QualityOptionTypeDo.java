package com.vk.libvideo.offline.settings.api.domain.objects;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QualityOptionTypeDo.kt */
/* loaded from: classes.dex */
public final class QualityOptionTypeDo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QualityOptionTypeDo[] $VALUES;
    public static final QualityOptionTypeDo ALWAYS_ASK;
    public static final QualityOptionTypeDo AUDIO_ONLY;
    public static final QualityOptionTypeDo AVG;
    public static final QualityOptionTypeDo HIGH;
    public static final QualityOptionTypeDo LOW;

    static {
        QualityOptionTypeDo qualityOptionTypeDo = new QualityOptionTypeDo("ALWAYS_ASK", 0);
        ALWAYS_ASK = qualityOptionTypeDo;
        QualityOptionTypeDo qualityOptionTypeDo2 = new QualityOptionTypeDo("HIGH", 1);
        HIGH = qualityOptionTypeDo2;
        QualityOptionTypeDo qualityOptionTypeDo3 = new QualityOptionTypeDo("AVG", 2);
        AVG = qualityOptionTypeDo3;
        QualityOptionTypeDo qualityOptionTypeDo4 = new QualityOptionTypeDo("LOW", 3);
        LOW = qualityOptionTypeDo4;
        QualityOptionTypeDo qualityOptionTypeDo5 = new QualityOptionTypeDo("AUDIO_ONLY", 4);
        AUDIO_ONLY = qualityOptionTypeDo5;
        QualityOptionTypeDo[] qualityOptionTypeDoArr = {qualityOptionTypeDo, qualityOptionTypeDo2, qualityOptionTypeDo3, qualityOptionTypeDo4, qualityOptionTypeDo5};
        $VALUES = qualityOptionTypeDoArr;
        $ENTRIES = new asp(qualityOptionTypeDoArr);
    }

    public QualityOptionTypeDo() {
        throw null;
    }

    public static QualityOptionTypeDo valueOf(String str) {
        return (QualityOptionTypeDo) Enum.valueOf(QualityOptionTypeDo.class, str);
    }

    public static QualityOptionTypeDo[] values() {
        return (QualityOptionTypeDo[]) $VALUES.clone();
    }
}
