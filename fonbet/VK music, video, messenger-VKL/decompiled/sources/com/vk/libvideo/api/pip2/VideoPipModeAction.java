package com.vk.libvideo.api.pip2;

import xsna.asp;
import xsna.zrp;

/* compiled from: VideoPipModeAction.kt */
/* loaded from: classes2.dex */
public interface VideoPipModeAction {

    /* compiled from: VideoPipModeAction.kt */
    public static final class Minimize implements VideoPipModeAction {
        public final boolean a;
        public final Trigger b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoPipModeAction.kt */
        public static final class Trigger {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Trigger[] $VALUES;
            public static final Trigger ByBackButton;
            public static final Trigger ByGesture;
            public static final Trigger Other;

            static {
                Trigger trigger = new Trigger("ByGesture", 0);
                ByGesture = trigger;
                Trigger trigger2 = new Trigger("ByBackButton", 1);
                ByBackButton = trigger2;
                Trigger trigger3 = new Trigger("Other", 2);
                Other = trigger3;
                Trigger[] triggerArr = {trigger, trigger2, trigger3};
                $VALUES = triggerArr;
                $ENTRIES = new asp(triggerArr);
            }

            public Trigger() {
                throw null;
            }

            public static Trigger valueOf(String str) {
                return (Trigger) Enum.valueOf(Trigger.class, str);
            }

            public static Trigger[] values() {
                return (Trigger[]) $VALUES.clone();
            }
        }

        public Minimize() {
            this(3);
        }

        public final boolean a() {
            return this.a;
        }

        public final Trigger b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Minimize)) {
                return false;
            }
            Minimize minimize = (Minimize) obj;
            return this.a == minimize.a && this.b == minimize.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Minimize(ignorePausedState=" + this.a + ", trigger=" + this.b + ')';
        }

        public Minimize(boolean z, Trigger trigger) {
            this.a = z;
            this.b = trigger;
        }

        public /* synthetic */ Minimize(int i) {
            this((i & 1) == 0, Trigger.Other);
        }
    }

    /* compiled from: VideoPipModeAction.kt */
    public static final class a implements VideoPipModeAction {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2121276754;
        }

        public final String toString() {
            return "Close";
        }
    }
}
