package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.vu5;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: CommonOnboardingStat.kt */
/* loaded from: classes11.dex */
public final class CommonOnboardingStat$TypeUiHintItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("action")
    private final Action action;

    @pmi0("duration")
    private final int duration;

    @pmi0("hint_id")
    private final FilteredString filteredHintId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonOnboardingStat.kt */
    /* loaded from: classes5.dex */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("click")
        public static final Action CLICK;

        @pmi0("hide")
        public static final Action HIDE;

        @pmi0("show")
        public static final Action SHOW;

        @pmi0("tooltip_could_be_shown")
        public static final Action TOOLTIP_COULD_BE_SHOWN;

        @pmi0("tooltip_hide_by_click")
        public static final Action TOOLTIP_HIDE_BY_CLICK;

        @pmi0("tooltip_hide_by_cross")
        public static final Action TOOLTIP_HIDE_BY_CROSS;

        @pmi0("tooltip_hide_by_interface_interaction")
        public static final Action TOOLTIP_HIDE_BY_INTERFACE_INTERACTION;

        @pmi0("tooltip_show")
        public static final Action TOOLTIP_SHOW;

        static {
            Action action = new Action("SHOW", 0);
            SHOW = action;
            Action action2 = new Action("CLICK", 1);
            CLICK = action2;
            Action action3 = new Action("HIDE", 2);
            HIDE = action3;
            Action action4 = new Action("TOOLTIP_SHOW", 3);
            TOOLTIP_SHOW = action4;
            Action action5 = new Action("TOOLTIP_COULD_BE_SHOWN", 4);
            TOOLTIP_COULD_BE_SHOWN = action5;
            Action action6 = new Action("TOOLTIP_HIDE_BY_INTERFACE_INTERACTION", 5);
            TOOLTIP_HIDE_BY_INTERFACE_INTERACTION = action6;
            Action action7 = new Action("TOOLTIP_HIDE_BY_CROSS", 6);
            TOOLTIP_HIDE_BY_CROSS = action7;
            Action action8 = new Action("TOOLTIP_HIDE_BY_CLICK", 7);
            TOOLTIP_HIDE_BY_CLICK = action8;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8};
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

    /* compiled from: CommonOnboardingStat.kt */
    public static final class PersistenceSerializer implements uay<CommonOnboardingStat$TypeUiHintItem>, a9y<CommonOnboardingStat$TypeUiHintItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonOnboardingStat$TypeUiHintItem(fai.s(x9yVar, "hint_id"), (Action) dq.f(x9yVar, "action", tru.a(), Action.class), fai.p(x9yVar, "duration"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem = (CommonOnboardingStat$TypeUiHintItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("hint_id", commonOnboardingStat$TypeUiHintItem.a);
            x9yVar.o("action", tru.a().toJson(commonOnboardingStat$TypeUiHintItem.a()));
            x9yVar.n("duration", Integer.valueOf(commonOnboardingStat$TypeUiHintItem.b()));
            return x9yVar;
        }
    }

    public CommonOnboardingStat$TypeUiHintItem(String str, Action action, int i) {
        this.a = str;
        this.action = action;
        this.duration = i;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredHintId = filteredString;
        filteredString.a(str);
    }

    public final Action a() {
        return this.action;
    }

    public final int b() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonOnboardingStat$TypeUiHintItem)) {
            return false;
        }
        CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem = (CommonOnboardingStat$TypeUiHintItem) obj;
        return epx.f(this.a, commonOnboardingStat$TypeUiHintItem.a) && this.action == commonOnboardingStat$TypeUiHintItem.action && this.duration == commonOnboardingStat$TypeUiHintItem.duration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.duration) + ((this.action.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeUiHintItem(hintId=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", duration=");
        return vu5.b(sb, this.duration, ')');
    }
}
