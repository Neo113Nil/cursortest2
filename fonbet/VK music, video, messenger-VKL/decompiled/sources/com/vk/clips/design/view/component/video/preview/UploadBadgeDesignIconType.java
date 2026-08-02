package com.vk.clips.design.view.component.video.preview;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadBadgeState.kt */
/* loaded from: classes16.dex */
public final class UploadBadgeDesignIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadBadgeDesignIconType[] $VALUES;
    public static final UploadBadgeDesignIconType CANCEL;
    public static final UploadBadgeDesignIconType CHECK;
    public static final UploadBadgeDesignIconType PROGRESS;
    public static final UploadBadgeDesignIconType RETRY;

    static {
        UploadBadgeDesignIconType uploadBadgeDesignIconType = new UploadBadgeDesignIconType("PROGRESS", 0);
        PROGRESS = uploadBadgeDesignIconType;
        UploadBadgeDesignIconType uploadBadgeDesignIconType2 = new UploadBadgeDesignIconType("CANCEL", 1);
        CANCEL = uploadBadgeDesignIconType2;
        UploadBadgeDesignIconType uploadBadgeDesignIconType3 = new UploadBadgeDesignIconType("CHECK", 2);
        CHECK = uploadBadgeDesignIconType3;
        UploadBadgeDesignIconType uploadBadgeDesignIconType4 = new UploadBadgeDesignIconType("RETRY", 3);
        RETRY = uploadBadgeDesignIconType4;
        UploadBadgeDesignIconType[] uploadBadgeDesignIconTypeArr = {uploadBadgeDesignIconType, uploadBadgeDesignIconType2, uploadBadgeDesignIconType3, uploadBadgeDesignIconType4};
        $VALUES = uploadBadgeDesignIconTypeArr;
        $ENTRIES = new asp(uploadBadgeDesignIconTypeArr);
    }

    public UploadBadgeDesignIconType() {
        throw null;
    }

    public static UploadBadgeDesignIconType valueOf(String str) {
        return (UploadBadgeDesignIconType) Enum.valueOf(UploadBadgeDesignIconType.class, str);
    }

    public static UploadBadgeDesignIconType[] values() {
        return (UploadBadgeDesignIconType[]) $VALUES.clone();
    }
}
