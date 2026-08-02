package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.l5g;
import xsna.pm0;
import xsna.zrp;

/* compiled from: VkBadgeDefaults.kt */
/* loaded from: classes17.dex */
public interface BadgeAppearance {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBadgeDefaults.kt */
    public static final class Design implements BadgeAppearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Design[] $VALUES;
        public static final Design Accent;
        public static final Design AccentGreen;
        public static final Design AccentRed;
        public static final Design Contrast;
        public static final Design Neutral;

        static {
            Design design = new Design("Accent", 0);
            Accent = design;
            Design design2 = new Design("AccentGreen", 1);
            AccentGreen = design2;
            Design design3 = new Design("Neutral", 2);
            Neutral = design3;
            Design design4 = new Design("AccentRed", 3);
            AccentRed = design4;
            Design design5 = new Design("Contrast", 4);
            Contrast = design5;
            Design[] designArr = {design, design2, design3, design4, design5};
            $VALUES = designArr;
            $ENTRIES = new asp(designArr);
        }

        public Design() {
            throw null;
        }

        public static zrp<Design> h() {
            return $ENTRIES;
        }

        public static Design valueOf(String str) {
            return (Design) Enum.valueOf(Design.class, str);
        }

        public static Design[] values() {
            return (Design[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBadgeDefaults.kt */
    public static final class LegoDesign implements BadgeAppearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LegoDesign[] $VALUES;
        public static final LegoDesign High;
        public static final LegoDesign Low;
        public static final LegoDesign Medium;

        static {
            LegoDesign legoDesign = new LegoDesign("High", 0);
            High = legoDesign;
            LegoDesign legoDesign2 = new LegoDesign("Medium", 1);
            Medium = legoDesign2;
            LegoDesign legoDesign3 = new LegoDesign("Low", 2);
            Low = legoDesign3;
            LegoDesign[] legoDesignArr = {legoDesign, legoDesign2, legoDesign3};
            $VALUES = legoDesignArr;
            $ENTRIES = new asp(legoDesignArr);
        }

        public LegoDesign() {
            throw null;
        }

        public static LegoDesign valueOf(String str) {
            return (LegoDesign) Enum.valueOf(LegoDesign.class, str);
        }

        public static LegoDesign[] values() {
            return (LegoDesign[]) $VALUES.clone();
        }
    }

    /* compiled from: VkBadgeDefaults.kt */
    public static final class a implements BadgeAppearance {
        public final long b;

        public a(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && l5g.d(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return pm0.d(')', this.b, new StringBuilder("Custom(color="));
        }
    }
}
