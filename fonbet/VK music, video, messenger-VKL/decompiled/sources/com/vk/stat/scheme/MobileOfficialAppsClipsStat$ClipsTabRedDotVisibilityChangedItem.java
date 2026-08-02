package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem {

    @pmi0("action")
    private final Action action;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("clips_red_button_hide")
        public static final Action CLIPS_RED_BUTTON_HIDE;

        @pmi0("clips_red_button_show")
        public static final Action CLIPS_RED_BUTTON_SHOW;

        static {
            Action action = new Action("CLIPS_RED_BUTTON_SHOW", 0);
            CLIPS_RED_BUTTON_SHOW = action;
            Action action2 = new Action("CLIPS_RED_BUTTON_HIDE", 1);
            CLIPS_RED_BUTTON_HIDE = action2;
            Action[] actionArr = {action, action2};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem(Action action) {
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem) && this.action == ((MobileOfficialAppsClipsStat$ClipsTabRedDotVisibilityChangedItem) obj).action;
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final String toString() {
        return "ClipsTabRedDotVisibilityChangedItem(action=" + this.action + ')';
    }
}
