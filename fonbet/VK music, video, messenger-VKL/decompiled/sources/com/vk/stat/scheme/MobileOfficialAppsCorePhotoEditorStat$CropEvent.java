package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$CropEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$CropEvent[] $VALUES;

    @pmi0("cancel_crop")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent CANCEL_CROP;

    @pmi0("change_angle")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent CHANGE_ANGLE;

    @pmi0("change_crop_mode")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent CHANGE_CROP_MODE;

    @pmi0("change_size")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent CHANGE_SIZE;

    @pmi0("clear_crop")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent CLEAR_CROP;

    @pmi0("navigate")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent NAVIGATE;

    @pmi0("reflect")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent REFLECT;

    @pmi0("rotate")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent ROTATE;

    @pmi0("save_crop")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent SAVE_CROP;

    @pmi0("unzoom")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent UNZOOM;

    @pmi0("zoom")
    public static final MobileOfficialAppsCorePhotoEditorStat$CropEvent ZOOM;

    static {
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("CHANGE_CROP_MODE", 0);
        CHANGE_CROP_MODE = mobileOfficialAppsCorePhotoEditorStat$CropEvent;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent2 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("NAVIGATE", 1);
        NAVIGATE = mobileOfficialAppsCorePhotoEditorStat$CropEvent2;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent3 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("ZOOM", 2);
        ZOOM = mobileOfficialAppsCorePhotoEditorStat$CropEvent3;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent4 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("UNZOOM", 3);
        UNZOOM = mobileOfficialAppsCorePhotoEditorStat$CropEvent4;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent5 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("CHANGE_SIZE", 4);
        CHANGE_SIZE = mobileOfficialAppsCorePhotoEditorStat$CropEvent5;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent6 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("CHANGE_ANGLE", 5);
        CHANGE_ANGLE = mobileOfficialAppsCorePhotoEditorStat$CropEvent6;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent7 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("ROTATE", 6);
        ROTATE = mobileOfficialAppsCorePhotoEditorStat$CropEvent7;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent8 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("SAVE_CROP", 7);
        SAVE_CROP = mobileOfficialAppsCorePhotoEditorStat$CropEvent8;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent9 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("CANCEL_CROP", 8);
        CANCEL_CROP = mobileOfficialAppsCorePhotoEditorStat$CropEvent9;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent10 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("REFLECT", 9);
        REFLECT = mobileOfficialAppsCorePhotoEditorStat$CropEvent10;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent11 = new MobileOfficialAppsCorePhotoEditorStat$CropEvent("CLEAR_CROP", 10);
        CLEAR_CROP = mobileOfficialAppsCorePhotoEditorStat$CropEvent11;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent[] mobileOfficialAppsCorePhotoEditorStat$CropEventArr = {mobileOfficialAppsCorePhotoEditorStat$CropEvent, mobileOfficialAppsCorePhotoEditorStat$CropEvent2, mobileOfficialAppsCorePhotoEditorStat$CropEvent3, mobileOfficialAppsCorePhotoEditorStat$CropEvent4, mobileOfficialAppsCorePhotoEditorStat$CropEvent5, mobileOfficialAppsCorePhotoEditorStat$CropEvent6, mobileOfficialAppsCorePhotoEditorStat$CropEvent7, mobileOfficialAppsCorePhotoEditorStat$CropEvent8, mobileOfficialAppsCorePhotoEditorStat$CropEvent9, mobileOfficialAppsCorePhotoEditorStat$CropEvent10, mobileOfficialAppsCorePhotoEditorStat$CropEvent11};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$CropEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$CropEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$CropEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$CropEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$CropEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$CropEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$CropEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$CropEvent[]) $VALUES.clone();
    }
}
