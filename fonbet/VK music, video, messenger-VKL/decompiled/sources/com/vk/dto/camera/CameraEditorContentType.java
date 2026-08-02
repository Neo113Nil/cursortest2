package com.vk.dto.camera;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraEditorContentType.kt */
/* loaded from: classes18.dex */
public final class CameraEditorContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CameraEditorContentType[] $VALUES;
    public static final CameraEditorContentType CLIP;
    public static final CameraEditorContentType MEDIA;
    public static final CameraEditorContentType STORY;

    static {
        CameraEditorContentType cameraEditorContentType = new CameraEditorContentType("STORY", 0);
        STORY = cameraEditorContentType;
        CameraEditorContentType cameraEditorContentType2 = new CameraEditorContentType("MEDIA", 1);
        MEDIA = cameraEditorContentType2;
        CameraEditorContentType cameraEditorContentType3 = new CameraEditorContentType("CLIP", 2);
        CLIP = cameraEditorContentType3;
        CameraEditorContentType[] cameraEditorContentTypeArr = {cameraEditorContentType, cameraEditorContentType2, cameraEditorContentType3};
        $VALUES = cameraEditorContentTypeArr;
        $ENTRIES = new asp(cameraEditorContentTypeArr);
    }

    public CameraEditorContentType() {
        throw null;
    }

    public static CameraEditorContentType valueOf(String str) {
        return (CameraEditorContentType) Enum.valueOf(CameraEditorContentType.class, str);
    }

    public static CameraEditorContentType[] values() {
        return (CameraEditorContentType[]) $VALUES.clone();
    }
}
