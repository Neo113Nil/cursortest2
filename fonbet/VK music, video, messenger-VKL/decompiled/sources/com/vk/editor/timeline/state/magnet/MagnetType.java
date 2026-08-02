package com.vk.editor.timeline.state.magnet;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MagnetType.kt */
/* loaded from: classes18.dex */
public final class MagnetType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MagnetType[] $VALUES;
    public static final MagnetType LeftEdgeToCursor;
    public static final MagnetType LeftEdgeToLeftVideoItem;
    public static final MagnetType LeftEdgeToNeighbourItem;
    public static final MagnetType None;
    public static final MagnetType RightEdgeToCursor;
    public static final MagnetType RightEdgeToNeighbourItem;
    public static final MagnetType RightEdgeToRightVideoItem;
    public static final MagnetType VerticalInsert;

    static {
        MagnetType magnetType = new MagnetType("None", 0);
        None = magnetType;
        MagnetType magnetType2 = new MagnetType("RightEdgeToCursor", 1);
        RightEdgeToCursor = magnetType2;
        MagnetType magnetType3 = new MagnetType("LeftEdgeToCursor", 2);
        LeftEdgeToCursor = magnetType3;
        MagnetType magnetType4 = new MagnetType("LeftEdgeToNeighbourItem", 3);
        LeftEdgeToNeighbourItem = magnetType4;
        MagnetType magnetType5 = new MagnetType("RightEdgeToNeighbourItem", 4);
        RightEdgeToNeighbourItem = magnetType5;
        MagnetType magnetType6 = new MagnetType("LeftEdgeToLeftVideoItem", 5);
        LeftEdgeToLeftVideoItem = magnetType6;
        MagnetType magnetType7 = new MagnetType("RightEdgeToRightVideoItem", 6);
        RightEdgeToRightVideoItem = magnetType7;
        MagnetType magnetType8 = new MagnetType("VerticalInsert", 7);
        VerticalInsert = magnetType8;
        MagnetType[] magnetTypeArr = {magnetType, magnetType2, magnetType3, magnetType4, magnetType5, magnetType6, magnetType7, magnetType8};
        $VALUES = magnetTypeArr;
        $ENTRIES = new asp(magnetTypeArr);
    }

    public MagnetType() {
        throw null;
    }

    public static MagnetType valueOf(String str) {
        return (MagnetType) Enum.valueOf(MagnetType.class, str);
    }

    public static MagnetType[] values() {
        return (MagnetType[]) $VALUES.clone();
    }
}
