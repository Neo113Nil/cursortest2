package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.km50;
import xsna.ms9;
import xsna.vu5;
import xsna.zrp;

/* compiled from: QualityChooserFeatureState.kt */
/* loaded from: classes3.dex */
public interface QualityChooserFeatureState extends km50 {

    /* compiled from: QualityChooserFeatureState.kt */
    public static final class QualityOption {
        public final QualityOptionType a;
        public final long b;
        public final long c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: QualityChooserFeatureState.kt */
        public static final class QualityOptionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ QualityOptionType[] $VALUES;
            public static final QualityOptionType AUDIO_ONLY;
            public static final QualityOptionType AVG;
            public static final QualityOptionType HIGH;
            public static final QualityOptionType LOW;

            static {
                QualityOptionType qualityOptionType = new QualityOptionType("HIGH", 0);
                HIGH = qualityOptionType;
                QualityOptionType qualityOptionType2 = new QualityOptionType("AVG", 1);
                AVG = qualityOptionType2;
                QualityOptionType qualityOptionType3 = new QualityOptionType("LOW", 2);
                LOW = qualityOptionType3;
                QualityOptionType qualityOptionType4 = new QualityOptionType("AUDIO_ONLY", 3);
                AUDIO_ONLY = qualityOptionType4;
                QualityOptionType[] qualityOptionTypeArr = {qualityOptionType, qualityOptionType2, qualityOptionType3, qualityOptionType4};
                $VALUES = qualityOptionTypeArr;
                $ENTRIES = new asp(qualityOptionTypeArr);
            }

            public QualityOptionType() {
                throw null;
            }

            public static QualityOptionType valueOf(String str) {
                return (QualityOptionType) Enum.valueOf(QualityOptionType.class, str);
            }

            public static QualityOptionType[] values() {
                return (QualityOptionType[]) $VALUES.clone();
            }
        }

        public QualityOption(QualityOptionType qualityOptionType, long j, long j2) {
            this.a = qualityOptionType;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QualityOption)) {
                return false;
            }
            QualityOption qualityOption = (QualityOption) obj;
            return this.a == qualityOption.a && this.b == qualityOption.b && this.c == qualityOption.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QualityOption(type=");
            sb.append(this.a);
            sb.append(", sizeBytes=");
            sb.append(this.b);
            sb.append(", exactSizeBytes=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: QualityChooserFeatureState.kt */
    public static final class a implements QualityChooserFeatureState {
        public final List<QualityOption> b;

        public a(List<QualityOption> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ChoosingQuality(qualityOptions="), this.b);
        }
    }
}
