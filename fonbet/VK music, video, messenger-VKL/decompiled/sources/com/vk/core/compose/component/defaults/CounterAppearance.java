package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.dn;
import xsna.l5g;
import xsna.pm0;
import xsna.zrp;

/* compiled from: VkCounterDefaults.kt */
/* loaded from: classes17.dex */
public interface CounterAppearance {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCounterDefaults.kt */
    public static final class Design implements CounterAppearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Design[] $VALUES;
        public static final Design Accent;
        public static final Design AccentGreen;
        public static final Design AccentRed;
        public static final Design Neutral;

        static {
            Design design = new Design("Accent", 0);
            Accent = design;
            Design design2 = new Design("Neutral", 1);
            Neutral = design2;
            Design design3 = new Design("AccentGreen", 2);
            AccentGreen = design3;
            Design design4 = new Design("AccentRed", 3);
            AccentRed = design4;
            Design[] designArr = {design, design2, design3, design4};
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
    /* compiled from: VkCounterDefaults.kt */
    public static final class Priority implements CounterAppearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        public static final Priority High;
        public static final Priority Low;
        public static final Priority Medium;

        static {
            Priority priority = new Priority("High", 0);
            High = priority;
            Priority priority2 = new Priority("Medium", 1);
            Medium = priority2;
            Priority priority3 = new Priority("Low", 2);
            Low = priority3;
            Priority[] priorityArr = {priority, priority2, priority3};
            $VALUES = priorityArr;
            $ENTRIES = new asp(priorityArr);
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCounterDefaults.kt */
    public static final class a implements CounterAppearance {
        public final long b;
        public final long c;

        public a(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l5g.d(this.b, aVar.b) && l5g.d(this.c, aVar.c);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Custom(backgroundColor=");
            dn.h(this.b, ", contentColor=", sb);
            return pm0.d(')', this.c, sb);
        }
    }
}
