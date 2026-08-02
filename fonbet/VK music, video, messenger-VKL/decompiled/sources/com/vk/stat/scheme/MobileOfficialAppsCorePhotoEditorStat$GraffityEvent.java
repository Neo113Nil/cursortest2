package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$GraffityEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$GraffityEvent[] $VALUES;

    @pmi0("add_graffity")
    public static final MobileOfficialAppsCorePhotoEditorStat$GraffityEvent ADD_GRAFFITY;

    @pmi0("save_graffity")
    public static final MobileOfficialAppsCorePhotoEditorStat$GraffityEvent SAVE_GRAFFITY;

    static {
        MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent = new MobileOfficialAppsCorePhotoEditorStat$GraffityEvent("ADD_GRAFFITY", 0);
        ADD_GRAFFITY = mobileOfficialAppsCorePhotoEditorStat$GraffityEvent;
        MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent2 = new MobileOfficialAppsCorePhotoEditorStat$GraffityEvent("SAVE_GRAFFITY", 1);
        SAVE_GRAFFITY = mobileOfficialAppsCorePhotoEditorStat$GraffityEvent2;
        MobileOfficialAppsCorePhotoEditorStat$GraffityEvent[] mobileOfficialAppsCorePhotoEditorStat$GraffityEventArr = {mobileOfficialAppsCorePhotoEditorStat$GraffityEvent, mobileOfficialAppsCorePhotoEditorStat$GraffityEvent2};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$GraffityEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$GraffityEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$GraffityEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$GraffityEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$GraffityEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$GraffityEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$GraffityEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$GraffityEvent[]) $VALUES.clone();
    }
}
