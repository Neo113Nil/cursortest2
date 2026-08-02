package com.vk.clips.media.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsMediaStatController.kt */
/* loaded from: classes16.dex */
public final class ClipsMediaStatController$StatErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsMediaStatController$StatErrorType[] $VALUES;
    public static final ClipsMediaStatController$StatErrorType GALLERY_COPY;
    public static final ClipsMediaStatController$StatErrorType GALLERY_PHOTO;

    static {
        ClipsMediaStatController$StatErrorType clipsMediaStatController$StatErrorType = new ClipsMediaStatController$StatErrorType("GALLERY_PHOTO", 0);
        GALLERY_PHOTO = clipsMediaStatController$StatErrorType;
        ClipsMediaStatController$StatErrorType clipsMediaStatController$StatErrorType2 = new ClipsMediaStatController$StatErrorType("GALLERY_COPY", 1);
        GALLERY_COPY = clipsMediaStatController$StatErrorType2;
        ClipsMediaStatController$StatErrorType[] clipsMediaStatController$StatErrorTypeArr = {clipsMediaStatController$StatErrorType, clipsMediaStatController$StatErrorType2};
        $VALUES = clipsMediaStatController$StatErrorTypeArr;
        $ENTRIES = new asp(clipsMediaStatController$StatErrorTypeArr);
    }

    public ClipsMediaStatController$StatErrorType() {
        throw null;
    }

    public static ClipsMediaStatController$StatErrorType valueOf(String str) {
        return (ClipsMediaStatController$StatErrorType) Enum.valueOf(ClipsMediaStatController$StatErrorType.class, str);
    }

    public static ClipsMediaStatController$StatErrorType[] values() {
        return (ClipsMediaStatController$StatErrorType[]) $VALUES.clone();
    }
}
