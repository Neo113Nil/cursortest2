package com.vk.socialgraph;

import xsna.asp;
import xsna.zrp;

/* compiled from: SocialGraphOpenParams.kt */
/* loaded from: classes5.dex */
public final class SocialGraphOpenParams {
    public final OpenAction a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialGraphOpenParams.kt */
    public static final class OpenAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpenAction[] $VALUES;
        public static final OpenAction AFTER_RESULT_SUCCESS;
        public static final OpenAction CONNECT_BUTTON;
        public static final OpenAction CREATE;
        public static final OpenAction NEXT_BUTTON;
        public static final OpenAction SKIP_BUTTON;

        static {
            OpenAction openAction = new OpenAction("CREATE", 0);
            CREATE = openAction;
            OpenAction openAction2 = new OpenAction("CONNECT_BUTTON", 1);
            CONNECT_BUTTON = openAction2;
            OpenAction openAction3 = new OpenAction("SKIP_BUTTON", 2);
            SKIP_BUTTON = openAction3;
            OpenAction openAction4 = new OpenAction("NEXT_BUTTON", 3);
            NEXT_BUTTON = openAction4;
            OpenAction openAction5 = new OpenAction("AFTER_RESULT_SUCCESS", 4);
            AFTER_RESULT_SUCCESS = openAction5;
            OpenAction[] openActionArr = {openAction, openAction2, openAction3, openAction4, openAction5};
            $VALUES = openActionArr;
            $ENTRIES = new asp(openActionArr);
        }

        public OpenAction() {
            throw null;
        }

        public static OpenAction valueOf(String str) {
            return (OpenAction) Enum.valueOf(OpenAction.class, str);
        }

        public static OpenAction[] values() {
            return (OpenAction[]) $VALUES.clone();
        }
    }

    public SocialGraphOpenParams(OpenAction openAction) {
        this.a = openAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SocialGraphOpenParams) && this.a == ((SocialGraphOpenParams) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SocialGraphOpenParams(action=" + this.a + ')';
    }
}
