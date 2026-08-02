package com.vk.clips.design.compose.upload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsUploadButtonType.kt */
/* loaded from: classes16.dex */
public final class ClipsUploadButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsUploadButtonType[] $VALUES;
    public static final ClipsUploadButtonType Draft;
    public static final ClipsUploadButtonType Upload;

    static {
        ClipsUploadButtonType clipsUploadButtonType = new ClipsUploadButtonType("Upload", 0);
        Upload = clipsUploadButtonType;
        ClipsUploadButtonType clipsUploadButtonType2 = new ClipsUploadButtonType("Draft", 1);
        Draft = clipsUploadButtonType2;
        ClipsUploadButtonType[] clipsUploadButtonTypeArr = {clipsUploadButtonType, clipsUploadButtonType2};
        $VALUES = clipsUploadButtonTypeArr;
        $ENTRIES = new asp(clipsUploadButtonTypeArr);
    }

    public ClipsUploadButtonType() {
        throw null;
    }

    public static ClipsUploadButtonType valueOf(String str) {
        return (ClipsUploadButtonType) Enum.valueOf(ClipsUploadButtonType.class, str);
    }

    public static ClipsUploadButtonType[] values() {
        return (ClipsUploadButtonType[]) $VALUES.clone();
    }
}
