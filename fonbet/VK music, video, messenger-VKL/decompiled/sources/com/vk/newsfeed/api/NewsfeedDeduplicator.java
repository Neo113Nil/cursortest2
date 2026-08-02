package com.vk.newsfeed.api;

import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.zrp;

/* compiled from: NewsfeedDeduplicator.kt */
/* loaded from: classes3.dex */
public interface NewsfeedDeduplicator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedDeduplicator.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType Append;
        public static final ActionType Prepend;
        public static final ActionType Refresh;

        static {
            ActionType actionType = new ActionType("Append", 0);
            Append = actionType;
            ActionType actionType2 = new ActionType("Prepend", 1);
            Prepend = actionType2;
            ActionType actionType3 = new ActionType("Refresh", 2);
            Refresh = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    ArrayList a(ActionType actionType, ArrayList arrayList, List list);
}
