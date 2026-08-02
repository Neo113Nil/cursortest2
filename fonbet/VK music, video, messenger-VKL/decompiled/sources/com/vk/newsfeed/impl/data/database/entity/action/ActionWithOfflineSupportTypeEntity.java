package com.vk.newsfeed.impl.data.database.entity.action;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionWithOfflineSupportTypeEntity.kt */
/* loaded from: classes4.dex */
public final class ActionWithOfflineSupportTypeEntity {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionWithOfflineSupportTypeEntity[] $VALUES;
    public static final ActionWithOfflineSupportTypeEntity ADD_LIKE;
    public static final ActionWithOfflineSupportTypeEntity DELETE_LIKE;
    private final String value;

    static {
        ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity = new ActionWithOfflineSupportTypeEntity("ADD_LIKE", 0, "add_like");
        ADD_LIKE = actionWithOfflineSupportTypeEntity;
        ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity2 = new ActionWithOfflineSupportTypeEntity("DELETE_LIKE", 1, "delete_like");
        DELETE_LIKE = actionWithOfflineSupportTypeEntity2;
        ActionWithOfflineSupportTypeEntity[] actionWithOfflineSupportTypeEntityArr = {actionWithOfflineSupportTypeEntity, actionWithOfflineSupportTypeEntity2};
        $VALUES = actionWithOfflineSupportTypeEntityArr;
        $ENTRIES = new asp(actionWithOfflineSupportTypeEntityArr);
    }

    public ActionWithOfflineSupportTypeEntity(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionWithOfflineSupportTypeEntity valueOf(String str) {
        return (ActionWithOfflineSupportTypeEntity) Enum.valueOf(ActionWithOfflineSupportTypeEntity.class, str);
    }

    public static ActionWithOfflineSupportTypeEntity[] values() {
        return (ActionWithOfflineSupportTypeEntity[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
