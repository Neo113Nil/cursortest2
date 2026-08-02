package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$StickerEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$StickerEvent[] $VALUES;

    @pmi0("click_to_create_vmoji")
    public static final MobileOfficialAppsCorePhotoEditorStat$StickerEvent CLICK_TO_CREATE_VMOJI;

    @pmi0("click_to_shop")
    public static final MobileOfficialAppsCorePhotoEditorStat$StickerEvent CLICK_TO_SHOP;

    @pmi0("save_stickers")
    public static final MobileOfficialAppsCorePhotoEditorStat$StickerEvent SAVE_STICKERS;

    static {
        MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent = new MobileOfficialAppsCorePhotoEditorStat$StickerEvent("CLICK_TO_SHOP", 0);
        CLICK_TO_SHOP = mobileOfficialAppsCorePhotoEditorStat$StickerEvent;
        MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent2 = new MobileOfficialAppsCorePhotoEditorStat$StickerEvent("CLICK_TO_CREATE_VMOJI", 1);
        CLICK_TO_CREATE_VMOJI = mobileOfficialAppsCorePhotoEditorStat$StickerEvent2;
        MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent3 = new MobileOfficialAppsCorePhotoEditorStat$StickerEvent("SAVE_STICKERS", 2);
        SAVE_STICKERS = mobileOfficialAppsCorePhotoEditorStat$StickerEvent3;
        MobileOfficialAppsCorePhotoEditorStat$StickerEvent[] mobileOfficialAppsCorePhotoEditorStat$StickerEventArr = {mobileOfficialAppsCorePhotoEditorStat$StickerEvent, mobileOfficialAppsCorePhotoEditorStat$StickerEvent2, mobileOfficialAppsCorePhotoEditorStat$StickerEvent3};
        $VALUES = mobileOfficialAppsCorePhotoEditorStat$StickerEventArr;
        $ENTRIES = new asp(mobileOfficialAppsCorePhotoEditorStat$StickerEventArr);
    }

    private MobileOfficialAppsCorePhotoEditorStat$StickerEvent(String str, int i) {
    }

    public static MobileOfficialAppsCorePhotoEditorStat$StickerEvent valueOf(String str) {
        return (MobileOfficialAppsCorePhotoEditorStat$StickerEvent) Enum.valueOf(MobileOfficialAppsCorePhotoEditorStat$StickerEvent.class, str);
    }

    public static MobileOfficialAppsCorePhotoEditorStat$StickerEvent[] values() {
        return (MobileOfficialAppsCorePhotoEditorStat$StickerEvent[]) $VALUES.clone();
    }
}
