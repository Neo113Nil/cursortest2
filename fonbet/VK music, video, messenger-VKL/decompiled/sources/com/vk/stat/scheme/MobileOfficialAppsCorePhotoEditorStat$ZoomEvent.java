package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$ZoomEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$ZoomEvent[] $VALUES;

    @pmi0("zoom_brush_screen")
    public static final MobileOfficialAppsCorePhotoEditorStat$ZoomEvent ZOOM_BRUSH_SCREEN;

    @pmi0("zoom_main_screen")
    public static final MobileOfficialAppsCorePhotoEditorStat$ZoomEvent ZOOM_MAIN_SCREEN;

    static {
        MobileOfficialAppsCorePhotoEditorStat$ZoomEvent mobileOfficialAppsCorePhotoEditorStat$ZoomEvent = new MobileOfficialAppsCorePhotoEditorStat$ZoomEvent("ZOOM_MAIN_SCREEN", 0);
        ZOOM_MAIN_SCREEN = mobileOfficialAppsCorePhotoEditorStat$ZoomEvent;
        MobileOfficialAppsCorePhotoEditorStat$ZoomEvent mobileOfficialAppsCorePhotoEditorStat$ZoomEvent2 = new MobileOfficialAppsCorePhotoEditorStat$ZoomEvent("ZOOM_BRUSH_SCREEN", 1);
        ZOOM_BRUSH_SCREEN = mobileOfficialAppsCorePhotoEditorStat$ZoomEvent2;
        MobileOfficialAppsCorePhotoEditorStat$ZoomEvent[] mobileOfficialAppsCorePhotoEditorStat$ZoomEventArr = {mobileOfficialAppsCorePhotoEditorStat$ZoomEvent, mobileOfficialAppsCorePhotoEditorStat$ZoomEvent2};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$ZoomEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$ZoomEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$ZoomEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$ZoomEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$ZoomEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$ZoomEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$ZoomEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$ZoomEvent[]) $VALUES.clone();
    }
}
