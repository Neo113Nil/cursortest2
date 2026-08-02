package com.vk.core.compose.component.semantics;

import xsna.asp;
import xsna.izs;
import xsna.s3q0;
import xsna.tgi0;
import xsna.zrp;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes17.dex */
public interface SemanticsConfiguration extends izs<tgi0, s3q0> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SemanticsConfiguration.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ClearAndSet;
        public static final Mode Merge;
        public static final Mode None;

        static {
            Mode mode = new Mode("Merge", 0);
            Merge = mode;
            Mode mode2 = new Mode("ClearAndSet", 1);
            ClearAndSet = mode2;
            Mode mode3 = new Mode("None", 2);
            None = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SemanticsConfiguration.kt */
    public static final class Priority {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        public static final Priority High;
        public static final Priority Low;

        static {
            Priority priority = new Priority("High", 0);
            High = priority;
            Priority priority2 = new Priority("Low", 1);
            Low = priority2;
            Priority[] priorityArr = {priority, priority2};
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

    Priority getPriority();

    Mode u();
}
