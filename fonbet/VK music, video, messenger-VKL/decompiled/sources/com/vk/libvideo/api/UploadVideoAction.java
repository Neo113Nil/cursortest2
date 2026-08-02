package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadVideoAction.kt */
/* loaded from: classes2.dex */
public final class UploadVideoAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadVideoAction[] $VALUES;
    public static final UploadVideoAction RECORD;
    public static final UploadVideoAction SELECT;

    static {
        UploadVideoAction uploadVideoAction = new UploadVideoAction("SELECT", 0);
        SELECT = uploadVideoAction;
        UploadVideoAction uploadVideoAction2 = new UploadVideoAction("RECORD", 1);
        RECORD = uploadVideoAction2;
        UploadVideoAction[] uploadVideoActionArr = {uploadVideoAction, uploadVideoAction2};
        $VALUES = uploadVideoActionArr;
        $ENTRIES = new asp(uploadVideoActionArr);
    }

    public UploadVideoAction() {
        throw null;
    }

    public static UploadVideoAction valueOf(String str) {
        return (UploadVideoAction) Enum.valueOf(UploadVideoAction.class, str);
    }

    public static UploadVideoAction[] values() {
        return (UploadVideoAction[]) $VALUES.clone();
    }
}
