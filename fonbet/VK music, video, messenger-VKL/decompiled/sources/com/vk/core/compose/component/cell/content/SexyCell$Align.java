package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SexyCell.kt */
/* loaded from: classes17.dex */
public final class SexyCell$Align {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SexyCell$Align[] $VALUES;
    public static final SexyCell$Align Middle;
    public static final SexyCell$Align Top;

    static {
        SexyCell$Align sexyCell$Align = new SexyCell$Align("Top", 0);
        Top = sexyCell$Align;
        SexyCell$Align sexyCell$Align2 = new SexyCell$Align("Middle", 1);
        Middle = sexyCell$Align2;
        SexyCell$Align[] sexyCell$AlignArr = {sexyCell$Align, sexyCell$Align2};
        $VALUES = sexyCell$AlignArr;
        $ENTRIES = new asp(sexyCell$AlignArr);
    }

    public SexyCell$Align() {
        throw null;
    }

    public static SexyCell$Align valueOf(String str) {
        return (SexyCell$Align) Enum.valueOf(SexyCell$Align.class, str);
    }

    public static SexyCell$Align[] values() {
        return (SexyCell$Align[]) $VALUES.clone();
    }
}
