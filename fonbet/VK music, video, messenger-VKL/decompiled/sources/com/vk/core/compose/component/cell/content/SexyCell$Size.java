package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SexyCell.kt */
/* loaded from: classes17.dex */
public final class SexyCell$Size {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SexyCell$Size[] $VALUES;
    public static final SexyCell$Size Large;
    public static final SexyCell$Size Medium;
    public static final SexyCell$Size Small;

    static {
        SexyCell$Size sexyCell$Size = new SexyCell$Size("Small", 0);
        Small = sexyCell$Size;
        SexyCell$Size sexyCell$Size2 = new SexyCell$Size("Medium", 1);
        Medium = sexyCell$Size2;
        SexyCell$Size sexyCell$Size3 = new SexyCell$Size("Large", 2);
        Large = sexyCell$Size3;
        SexyCell$Size[] sexyCell$SizeArr = {sexyCell$Size, sexyCell$Size2, sexyCell$Size3};
        $VALUES = sexyCell$SizeArr;
        $ENTRIES = new asp(sexyCell$SizeArr);
    }

    public SexyCell$Size() {
        throw null;
    }

    public static SexyCell$Size valueOf(String str) {
        return (SexyCell$Size) Enum.valueOf(SexyCell$Size.class, str);
    }

    public static SexyCell$Size[] values() {
        return (SexyCell$Size[]) $VALUES.clone();
    }
}
