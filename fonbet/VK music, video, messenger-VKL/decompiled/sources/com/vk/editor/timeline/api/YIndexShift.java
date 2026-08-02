package com.vk.editor.timeline.api;

import xsna.asp;
import xsna.zrp;

/* compiled from: YIndexShift.kt */
/* loaded from: classes18.dex */
public final class YIndexShift {
    public final int a;
    public final Mode b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YIndexShift.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode MIDDLE;
        public static final Mode REPLACE;

        static {
            Mode mode = new Mode("REPLACE", 0);
            REPLACE = mode;
            Mode mode2 = new Mode("MIDDLE", 1);
            MIDDLE = mode2;
            Mode[] modeArr = {mode, mode2};
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

    public YIndexShift(int i, Mode mode) {
        this.a = i;
        this.b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YIndexShift)) {
            return false;
        }
        YIndexShift yIndexShift = (YIndexShift) obj;
        return this.a == yIndexShift.a && this.b == yIndexShift.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "YIndexShift(to=" + this.a + ", mode=" + this.b + ')';
    }
}
