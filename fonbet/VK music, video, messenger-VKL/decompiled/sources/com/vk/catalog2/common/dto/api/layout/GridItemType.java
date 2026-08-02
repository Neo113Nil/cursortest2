package com.vk.catalog2.common.dto.api.layout;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GridItemType.kt */
/* loaded from: classes16.dex */
public final class GridItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GridItemType[] $VALUES;
    public static final GridItemType COMPACT;
    public static final a Companion;
    public static final GridItemType DETAILED;
    public static final GridItemType UNKNOWN;
    private final String id;

    /* compiled from: GridItemType.kt */
    public static final class a {
        public static GridItemType a(String str) {
            GridItemType gridItemType;
            try {
                GridItemType[] values = GridItemType.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        gridItemType = null;
                        break;
                    }
                    gridItemType = values[i];
                    if (epx.f(gridItemType.getId(), str)) {
                        break;
                    }
                    i++;
                }
                return gridItemType == null ? GridItemType.UNKNOWN : gridItemType;
            } catch (Exception unused) {
                return GridItemType.UNKNOWN;
            }
        }
    }

    static {
        GridItemType gridItemType = new GridItemType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
        UNKNOWN = gridItemType;
        GridItemType gridItemType2 = new GridItemType("DETAILED", 1, "detailed");
        DETAILED = gridItemType2;
        GridItemType gridItemType3 = new GridItemType("COMPACT", 2, "compact");
        COMPACT = gridItemType3;
        GridItemType[] gridItemTypeArr = {gridItemType, gridItemType2, gridItemType3};
        $VALUES = gridItemTypeArr;
        $ENTRIES = new asp(gridItemTypeArr);
        Companion = new a();
    }

    public GridItemType(String str, int i, String str2) {
        this.id = str2;
    }

    public static GridItemType valueOf(String str) {
        return (GridItemType) Enum.valueOf(GridItemType.class, str);
    }

    public static GridItemType[] values() {
        return (GridItemType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
