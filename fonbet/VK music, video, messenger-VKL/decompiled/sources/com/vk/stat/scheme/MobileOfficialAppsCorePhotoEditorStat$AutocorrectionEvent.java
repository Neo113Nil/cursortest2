package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent[] $VALUES;

    @pmi0("cancel_autocorrection")
    public static final MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent CANCEL_AUTOCORRECTION;

    @pmi0("change_autocorrection_value")
    public static final MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent CHANGE_AUTOCORRECTION_VALUE;

    @pmi0("save_autocorrection")
    public static final MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent SAVE_AUTOCORRECTION;

    static {
        MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent = new MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent("CHANGE_AUTOCORRECTION_VALUE", 0);
        CHANGE_AUTOCORRECTION_VALUE = mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent;
        MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent2 = new MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent("CANCEL_AUTOCORRECTION", 1);
        CANCEL_AUTOCORRECTION = mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent2;
        MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent3 = new MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent("SAVE_AUTOCORRECTION", 2);
        SAVE_AUTOCORRECTION = mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent3;
        MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent[] mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEventArr = {mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent, mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent2, mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent3};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent[]) $VALUES.clone();
    }
}
