package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$FilterEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$FilterEvent[] $VALUES;

    @pmi0("add_filter")
    public static final MobileOfficialAppsCorePhotoEditorStat$FilterEvent ADD_FILTER;

    @pmi0("cancel_filter")
    public static final MobileOfficialAppsCorePhotoEditorStat$FilterEvent CANCEL_FILTER;

    @pmi0("change_filter_value")
    public static final MobileOfficialAppsCorePhotoEditorStat$FilterEvent CHANGE_FILTER_VALUE;

    @pmi0("save_filter")
    public static final MobileOfficialAppsCorePhotoEditorStat$FilterEvent SAVE_FILTER;

    static {
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent = new MobileOfficialAppsCorePhotoEditorStat$FilterEvent("ADD_FILTER", 0);
        ADD_FILTER = mobileOfficialAppsCorePhotoEditorStat$FilterEvent;
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent2 = new MobileOfficialAppsCorePhotoEditorStat$FilterEvent("CHANGE_FILTER_VALUE", 1);
        CHANGE_FILTER_VALUE = mobileOfficialAppsCorePhotoEditorStat$FilterEvent2;
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent3 = new MobileOfficialAppsCorePhotoEditorStat$FilterEvent("CANCEL_FILTER", 2);
        CANCEL_FILTER = mobileOfficialAppsCorePhotoEditorStat$FilterEvent3;
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent4 = new MobileOfficialAppsCorePhotoEditorStat$FilterEvent("SAVE_FILTER", 3);
        SAVE_FILTER = mobileOfficialAppsCorePhotoEditorStat$FilterEvent4;
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent[] mobileOfficialAppsCorePhotoEditorStat$FilterEventArr = {mobileOfficialAppsCorePhotoEditorStat$FilterEvent, mobileOfficialAppsCorePhotoEditorStat$FilterEvent2, mobileOfficialAppsCorePhotoEditorStat$FilterEvent3, mobileOfficialAppsCorePhotoEditorStat$FilterEvent4};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$FilterEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$FilterEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$FilterEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$FilterEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$FilterEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$FilterEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$FilterEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$FilterEvent[]) $VALUES.clone();
    }
}
