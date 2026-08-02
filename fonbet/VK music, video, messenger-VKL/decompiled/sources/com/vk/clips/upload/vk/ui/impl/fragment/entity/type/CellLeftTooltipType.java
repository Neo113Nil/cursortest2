package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CellLeftTooltipType.kt */
/* loaded from: classes17.dex */
public final class CellLeftTooltipType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellLeftTooltipType[] $VALUES;
    public static final CellLeftTooltipType OPEN_CHANNEL_BUTTON;
    public static final CellLeftTooltipType TICKET_ACTION_BUTTON;

    /* compiled from: CellLeftTooltipType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellLeftTooltipType.values().length];
            try {
                iArr[CellLeftTooltipType.OPEN_CHANNEL_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellLeftTooltipType.TICKET_ACTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CellLeftTooltipType cellLeftTooltipType = new CellLeftTooltipType("OPEN_CHANNEL_BUTTON", 0);
        OPEN_CHANNEL_BUTTON = cellLeftTooltipType;
        CellLeftTooltipType cellLeftTooltipType2 = new CellLeftTooltipType("TICKET_ACTION_BUTTON", 1);
        TICKET_ACTION_BUTTON = cellLeftTooltipType2;
        CellLeftTooltipType[] cellLeftTooltipTypeArr = {cellLeftTooltipType, cellLeftTooltipType2};
        $VALUES = cellLeftTooltipTypeArr;
        $ENTRIES = new asp(cellLeftTooltipTypeArr);
    }

    public CellLeftTooltipType() {
        throw null;
    }

    public static CellLeftTooltipType valueOf(String str) {
        return (CellLeftTooltipType) Enum.valueOf(CellLeftTooltipType.class, str);
    }

    public static CellLeftTooltipType[] values() {
        return (CellLeftTooltipType[]) $VALUES.clone();
    }
}
