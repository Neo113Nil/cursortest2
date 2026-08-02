package com.vk.libvideo.models.videotracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResizeAction.kt */
/* loaded from: classes3.dex */
public final class ResizeAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ResizeAction[] $VALUES;
    public static final ResizeAction BUTTON;
    public static final ResizeAction GESTURE;

    static {
        ResizeAction resizeAction = new ResizeAction("BUTTON", 0);
        BUTTON = resizeAction;
        ResizeAction resizeAction2 = new ResizeAction("GESTURE", 1);
        GESTURE = resizeAction2;
        ResizeAction[] resizeActionArr = {resizeAction, resizeAction2};
        $VALUES = resizeActionArr;
        $ENTRIES = new asp(resizeActionArr);
    }

    public ResizeAction() {
        throw null;
    }

    public static ResizeAction valueOf(String str) {
        return (ResizeAction) Enum.valueOf(ResizeAction.class, str);
    }

    public static ResizeAction[] values() {
        return (ResizeAction[]) $VALUES.clone();
    }
}
