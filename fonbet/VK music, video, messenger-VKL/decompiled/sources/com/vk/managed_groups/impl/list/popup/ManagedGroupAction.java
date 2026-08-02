package com.vk.managed_groups.impl.list.popup;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ManagedGroupAction.kt */
/* loaded from: classes3.dex */
public final class ManagedGroupAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ManagedGroupAction[] $VALUES;
    public static final ManagedGroupAction NOTIFICATIONS_OFF;
    public static final ManagedGroupAction NOTIFICATIONS_ON;

    static {
        ManagedGroupAction managedGroupAction = new ManagedGroupAction("NOTIFICATIONS_ON", 0);
        NOTIFICATIONS_ON = managedGroupAction;
        ManagedGroupAction managedGroupAction2 = new ManagedGroupAction("NOTIFICATIONS_OFF", 1);
        NOTIFICATIONS_OFF = managedGroupAction2;
        ManagedGroupAction[] managedGroupActionArr = {managedGroupAction, managedGroupAction2};
        $VALUES = managedGroupActionArr;
        $ENTRIES = new asp(managedGroupActionArr);
    }

    public ManagedGroupAction() {
        throw null;
    }

    public static ManagedGroupAction valueOf(String str) {
        return (ManagedGroupAction) Enum.valueOf(ManagedGroupAction.class, str);
    }

    public static ManagedGroupAction[] values() {
        return (ManagedGroupAction[]) $VALUES.clone();
    }
}
