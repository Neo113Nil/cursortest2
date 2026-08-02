package com.vk.voip.ui.sessionrooms.dialog;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotifyRoomsClosedDialog.kt */
/* loaded from: classes7.dex */
public final class NotifyRoomsClosedDialog$Builder$DialogType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotifyRoomsClosedDialog$Builder$DialogType[] $VALUES;
    public static final NotifyRoomsClosedDialog$Builder$DialogType JUST_CLOSED;
    public static final NotifyRoomsClosedDialog$Builder$DialogType RECORD;
    public static final NotifyRoomsClosedDialog$Builder$DialogType TRANSLATION;

    static {
        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType = new NotifyRoomsClosedDialog$Builder$DialogType("JUST_CLOSED", 0);
        JUST_CLOSED = notifyRoomsClosedDialog$Builder$DialogType;
        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType2 = new NotifyRoomsClosedDialog$Builder$DialogType("RECORD", 1);
        RECORD = notifyRoomsClosedDialog$Builder$DialogType2;
        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType3 = new NotifyRoomsClosedDialog$Builder$DialogType("TRANSLATION", 2);
        TRANSLATION = notifyRoomsClosedDialog$Builder$DialogType3;
        NotifyRoomsClosedDialog$Builder$DialogType[] notifyRoomsClosedDialog$Builder$DialogTypeArr = {notifyRoomsClosedDialog$Builder$DialogType, notifyRoomsClosedDialog$Builder$DialogType2, notifyRoomsClosedDialog$Builder$DialogType3};
        $VALUES = notifyRoomsClosedDialog$Builder$DialogTypeArr;
        $ENTRIES = new asp(notifyRoomsClosedDialog$Builder$DialogTypeArr);
    }

    public NotifyRoomsClosedDialog$Builder$DialogType() {
        throw null;
    }

    public static NotifyRoomsClosedDialog$Builder$DialogType valueOf(String str) {
        return (NotifyRoomsClosedDialog$Builder$DialogType) Enum.valueOf(NotifyRoomsClosedDialog$Builder$DialogType.class, str);
    }

    public static NotifyRoomsClosedDialog$Builder$DialogType[] values() {
        return (NotifyRoomsClosedDialog$Builder$DialogType[]) $VALUES.clone();
    }
}
