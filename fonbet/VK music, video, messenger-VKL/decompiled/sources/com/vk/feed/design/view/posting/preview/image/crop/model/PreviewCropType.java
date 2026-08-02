package com.vk.feed.design.view.posting.preview.image.crop.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreviewCropType.kt */
/* loaded from: classes18.dex */
public final class PreviewCropType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PreviewCropType[] $VALUES;
    public static final PreviewCropType FIT;
    public static final PreviewCropType SCALE;

    static {
        PreviewCropType previewCropType = new PreviewCropType("FIT", 0);
        FIT = previewCropType;
        PreviewCropType previewCropType2 = new PreviewCropType("SCALE", 1);
        SCALE = previewCropType2;
        PreviewCropType[] previewCropTypeArr = {previewCropType, previewCropType2};
        $VALUES = previewCropTypeArr;
        $ENTRIES = new asp(previewCropTypeArr);
    }

    public PreviewCropType() {
        throw null;
    }

    public static PreviewCropType valueOf(String str) {
        return (PreviewCropType) Enum.valueOf(PreviewCropType.class, str);
    }

    public static PreviewCropType[] values() {
        return (PreviewCropType[]) $VALUES.clone();
    }
}
