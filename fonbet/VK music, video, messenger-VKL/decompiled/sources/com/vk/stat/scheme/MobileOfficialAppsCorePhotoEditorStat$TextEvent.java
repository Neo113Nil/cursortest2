package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$TextEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$TextEvent[] $VALUES;

    @pmi0("add_text")
    public static final MobileOfficialAppsCorePhotoEditorStat$TextEvent ADD_TEXT;

    @pmi0("edit_text")
    public static final MobileOfficialAppsCorePhotoEditorStat$TextEvent EDIT_TEXT;

    @pmi0("save_text")
    public static final MobileOfficialAppsCorePhotoEditorStat$TextEvent SAVE_TEXT;

    static {
        MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent = new MobileOfficialAppsCorePhotoEditorStat$TextEvent("ADD_TEXT", 0);
        ADD_TEXT = mobileOfficialAppsCorePhotoEditorStat$TextEvent;
        MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent2 = new MobileOfficialAppsCorePhotoEditorStat$TextEvent("SAVE_TEXT", 1);
        SAVE_TEXT = mobileOfficialAppsCorePhotoEditorStat$TextEvent2;
        MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent3 = new MobileOfficialAppsCorePhotoEditorStat$TextEvent("EDIT_TEXT", 2);
        EDIT_TEXT = mobileOfficialAppsCorePhotoEditorStat$TextEvent3;
        MobileOfficialAppsCorePhotoEditorStat$TextEvent[] mobileOfficialAppsCorePhotoEditorStat$TextEventArr = {mobileOfficialAppsCorePhotoEditorStat$TextEvent, mobileOfficialAppsCorePhotoEditorStat$TextEvent2, mobileOfficialAppsCorePhotoEditorStat$TextEvent3};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$TextEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$TextEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$TextEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$TextEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$TextEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$TextEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$TextEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$TextEvent[]) $VALUES.clone();
    }
}
