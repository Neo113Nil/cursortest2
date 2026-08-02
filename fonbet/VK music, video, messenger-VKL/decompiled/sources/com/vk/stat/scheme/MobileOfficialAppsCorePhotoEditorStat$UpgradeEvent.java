package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent[] $VALUES;

    @pmi0("cancel_upgrade")
    public static final MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent CANCEL_UPGRADE;

    @pmi0("change_upgrade_value")
    public static final MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent CHANGE_UPGRADE_VALUE;

    @pmi0("ready_upgrade")
    public static final MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent READY_UPGRADE;

    @pmi0("save_upgrade")
    public static final MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent SAVE_UPGRADE;

    static {
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent = new MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent("CANCEL_UPGRADE", 0);
        CANCEL_UPGRADE = mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent;
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent2 = new MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent("READY_UPGRADE", 1);
        READY_UPGRADE = mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent2;
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent3 = new MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent("SAVE_UPGRADE", 2);
        SAVE_UPGRADE = mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent3;
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent4 = new MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent("CHANGE_UPGRADE_VALUE", 3);
        CHANGE_UPGRADE_VALUE = mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent4;
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent[] mobileOfficialAppsCorePhotoEditorStat$UpgradeEventArr = {mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent, mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent2, mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent3, mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent4};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$UpgradeEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$UpgradeEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent[]) $VALUES.clone();
    }
}
