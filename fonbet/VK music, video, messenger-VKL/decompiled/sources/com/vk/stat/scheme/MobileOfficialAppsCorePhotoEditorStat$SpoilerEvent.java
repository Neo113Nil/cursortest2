package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent[] $VALUES;

    @pmi0("save_spoiler")
    public static final MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent SAVE_SPOILER;

    static {
        MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent = new MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent("SAVE_SPOILER", 0);
        SAVE_SPOILER = mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent;
        MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent[] mobileOfficialAppsCorePhotoEditorStat$SpoilerEventArr = {mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$SpoilerEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$SpoilerEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent[]) $VALUES.clone();
    }
}
