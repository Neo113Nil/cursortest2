package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui;

import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.QualityChooserFeatureState;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.ao50;
import xsna.asp;
import xsna.bh10;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.vu5;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: QualityChooserViewState.kt */
/* loaded from: classes3.dex */
public final class QualityChooserViewState implements ao50 {
    public final fi50 a;

    /* compiled from: QualityChooserViewState.kt */
    public static final class QualityOption {
        public final QualityOptionType a;
        public final long b;
        public final long c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: QualityChooserViewState.kt */
        public static final class QualityOptionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ QualityOptionType[] $VALUES;
            public static final QualityOptionType AUDIO_ONLY;
            public static final QualityOptionType AVG;
            public static final QualityOptionType HIGH;
            public static final QualityOptionType LOW;

            /* compiled from: QualityChooserViewState.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QualityOptionType.values().length];
                    try {
                        iArr[QualityOptionType.HIGH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[QualityOptionType.AVG.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[QualityOptionType.LOW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[QualityOptionType.AUDIO_ONLY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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

    /* compiled from: QualityChooserViewState.kt */
    public static final class a implements fm50<QualityChooserFeatureState> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: QualityChooserViewState.kt */
    public interface b {

        /* compiled from: QualityChooserViewState.kt */
        public static final class a implements b {
            public final ArrayList a;

            public a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("ChoosingQuality(qualityOptions="), this.a);
            }
        }
    }

    public QualityChooserViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
