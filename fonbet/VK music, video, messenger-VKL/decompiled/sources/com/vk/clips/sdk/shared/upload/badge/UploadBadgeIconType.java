package com.vk.clips.sdk.shared.upload.badge;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadBadgeState.kt */
/* loaded from: classes17.dex */
public final class UploadBadgeIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadBadgeIconType[] $VALUES;
    public static final UploadBadgeIconType CANCEL;
    public static final UploadBadgeIconType CHECK;
    public static final UploadBadgeIconType PROGRESS;
    public static final UploadBadgeIconType RETRY;

    static {
        UploadBadgeIconType uploadBadgeIconType = new UploadBadgeIconType("PROGRESS", 0);
        PROGRESS = uploadBadgeIconType;
        UploadBadgeIconType uploadBadgeIconType2 = new UploadBadgeIconType("CANCEL", 1);
        CANCEL = uploadBadgeIconType2;
        UploadBadgeIconType uploadBadgeIconType3 = new UploadBadgeIconType("CHECK", 2);
        CHECK = uploadBadgeIconType3;
        UploadBadgeIconType uploadBadgeIconType4 = new UploadBadgeIconType("RETRY", 3);
        RETRY = uploadBadgeIconType4;
        UploadBadgeIconType[] uploadBadgeIconTypeArr = {uploadBadgeIconType, uploadBadgeIconType2, uploadBadgeIconType3, uploadBadgeIconType4};
        $VALUES = uploadBadgeIconTypeArr;
        $ENTRIES = new asp(uploadBadgeIconTypeArr);
    }

    public UploadBadgeIconType() {
        throw null;
    }

    public static UploadBadgeIconType valueOf(String str) {
        return (UploadBadgeIconType) Enum.valueOf(UploadBadgeIconType.class, str);
    }

    public static UploadBadgeIconType[] values() {
        return (UploadBadgeIconType[]) $VALUES.clone();
    }
}
