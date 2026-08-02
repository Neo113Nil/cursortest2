package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsPromoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsPromoStat$TypePromoClickItem implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    @pmi0("type_promo_item")
    private final MobileOfficialAppsPromoStat$TypePromoItem typePromoItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsPromoStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("action")
        public static final Action ACTION;

        @pmi0("cancel")
        public static final Action CANCEL;

        static {
            Action action = new Action("ACTION", 0);
            ACTION = action;
            Action action2 = new Action("CANCEL", 1);
            CANCEL = action2;
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

    public MobileOfficialAppsPromoStat$TypePromoClickItem(MobileOfficialAppsPromoStat$TypePromoItem mobileOfficialAppsPromoStat$TypePromoItem, Action action) {
        this.typePromoItem = mobileOfficialAppsPromoStat$TypePromoItem;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsPromoStat$TypePromoClickItem)) {
            return false;
        }
        MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem = (MobileOfficialAppsPromoStat$TypePromoClickItem) obj;
        return epx.f(this.typePromoItem, mobileOfficialAppsPromoStat$TypePromoClickItem.typePromoItem) && this.action == mobileOfficialAppsPromoStat$TypePromoClickItem.action;
    }

    public final int hashCode() {
        int hashCode = this.typePromoItem.hashCode() * 31;
        Action action = this.action;
        return hashCode + (action == null ? 0 : action.hashCode());
    }

    public final String toString() {
        return "TypePromoClickItem(typePromoItem=" + this.typePromoItem + ", action=" + this.action + ')';
    }

    public /* synthetic */ MobileOfficialAppsPromoStat$TypePromoClickItem(MobileOfficialAppsPromoStat$TypePromoItem mobileOfficialAppsPromoStat$TypePromoItem, Action action, int i, zcl zclVar) {
        this(mobileOfficialAppsPromoStat$TypePromoItem, (i & 2) != 0 ? null : action);
    }
}
