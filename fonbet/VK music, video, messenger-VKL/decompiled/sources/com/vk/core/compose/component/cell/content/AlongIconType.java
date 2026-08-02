package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonIconImpl.kt */
/* loaded from: classes17.dex */
public final class AlongIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AlongIconType[] $VALUES;
    public static final AlongIconType AlongSubtitle;
    public static final AlongIconType AlongTitle;

    static {
        AlongIconType alongIconType = new AlongIconType("AlongTitle", 0);
        AlongTitle = alongIconType;
        AlongIconType alongIconType2 = new AlongIconType("AlongSubtitle", 1);
        AlongSubtitle = alongIconType2;
        AlongIconType[] alongIconTypeArr = {alongIconType, alongIconType2};
        $VALUES = alongIconTypeArr;
        $ENTRIES = new asp(alongIconTypeArr);
    }

    public AlongIconType() {
        throw null;
    }

    public static AlongIconType valueOf(String str) {
        return (AlongIconType) Enum.valueOf(AlongIconType.class, str);
    }

    public static AlongIconType[] values() {
        return (AlongIconType[]) $VALUES.clone();
    }
}
