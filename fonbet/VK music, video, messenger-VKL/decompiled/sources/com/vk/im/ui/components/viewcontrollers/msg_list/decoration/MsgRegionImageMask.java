package com.vk.im.ui.components.viewcontrollers.msg_list.decoration;

import xsna.asp;
import xsna.tpf0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgRegionImageMask.kt */
/* loaded from: classes2.dex */
public final class MsgRegionImageMask implements tpf0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgRegionImageMask[] $VALUES;
    public static final MsgRegionImageMask BOTTOM;
    public static final MsgRegionImageMask FULL;
    public static final MsgRegionImageMask FULL_LINKED;
    public static final MsgRegionImageMask MIDDLE;
    public static final MsgRegionImageMask TOP;
    public static final MsgRegionImageMask TOP_LINKED;

    static {
        MsgRegionImageMask msgRegionImageMask = new MsgRegionImageMask("FULL", 0);
        FULL = msgRegionImageMask;
        MsgRegionImageMask msgRegionImageMask2 = new MsgRegionImageMask("TOP", 1);
        TOP = msgRegionImageMask2;
        MsgRegionImageMask msgRegionImageMask3 = new MsgRegionImageMask("MIDDLE", 2);
        MIDDLE = msgRegionImageMask3;
        MsgRegionImageMask msgRegionImageMask4 = new MsgRegionImageMask("BOTTOM", 3);
        BOTTOM = msgRegionImageMask4;
        MsgRegionImageMask msgRegionImageMask5 = new MsgRegionImageMask("TOP_LINKED", 4);
        TOP_LINKED = msgRegionImageMask5;
        MsgRegionImageMask msgRegionImageMask6 = new MsgRegionImageMask("FULL_LINKED", 5);
        FULL_LINKED = msgRegionImageMask6;
        MsgRegionImageMask[] msgRegionImageMaskArr = {msgRegionImageMask, msgRegionImageMask2, msgRegionImageMask3, msgRegionImageMask4, msgRegionImageMask5, msgRegionImageMask6};
        $VALUES = msgRegionImageMaskArr;
        $ENTRIES = new asp(msgRegionImageMaskArr);
    }

    public MsgRegionImageMask() {
        throw null;
    }

    public static MsgRegionImageMask valueOf(String str) {
        return (MsgRegionImageMask) Enum.valueOf(MsgRegionImageMask.class, str);
    }

    public static MsgRegionImageMask[] values() {
        return (MsgRegionImageMask[]) $VALUES.clone();
    }
}
