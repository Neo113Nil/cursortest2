package com.vk.newsfeed.impl.domain.model;

import com.vk.newsfeed.common.domain.model.AddLikeAction;
import xsna.asp;
import xsna.dvl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionWithOfflineSupport.kt */
/* loaded from: classes4.dex */
public final class ActionWithOfflineSupportType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionWithOfflineSupportType[] $VALUES;
    public static final ActionWithOfflineSupportType ADD_LIKE;
    public static final ActionWithOfflineSupportType DELETE_LIKE;
    private final Class<?> clazz;

    static {
        ActionWithOfflineSupportType actionWithOfflineSupportType = new ActionWithOfflineSupportType("ADD_LIKE", 0, AddLikeAction.class);
        ADD_LIKE = actionWithOfflineSupportType;
        ActionWithOfflineSupportType actionWithOfflineSupportType2 = new ActionWithOfflineSupportType("DELETE_LIKE", 1, dvl.class);
        DELETE_LIKE = actionWithOfflineSupportType2;
        ActionWithOfflineSupportType[] actionWithOfflineSupportTypeArr = {actionWithOfflineSupportType, actionWithOfflineSupportType2};
        $VALUES = actionWithOfflineSupportTypeArr;
        $ENTRIES = new asp(actionWithOfflineSupportTypeArr);
    }

    public ActionWithOfflineSupportType(String str, int i, Class cls) {
        this.clazz = cls;
    }

    public static ActionWithOfflineSupportType valueOf(String str) {
        return (ActionWithOfflineSupportType) Enum.valueOf(ActionWithOfflineSupportType.class, str);
    }

    public static ActionWithOfflineSupportType[] values() {
        return (ActionWithOfflineSupportType[]) $VALUES.clone();
    }
}
