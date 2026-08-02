package com.vk.catalog2.common.dto.api.hint;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogHintType.kt */
/* loaded from: classes16.dex */
public final class CatalogHintType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogHintType[] $VALUES;
    public static final CatalogHintType COACHMARK;
    public static final a Companion;
    public static final CatalogHintType HIGHLIGHT;
    public static final CatalogHintType HIGHLIGHT_KIDS;
    public static final CatalogHintType HIGHLIGHT_TABS;
    public static final CatalogHintType TOOLTIP;
    private final String type;

    /* compiled from: CatalogHintType.kt */
    public static final class a {
        public static CatalogHintType a(String str) {
            CatalogHintType catalogHintType = CatalogHintType.HIGHLIGHT;
            if (str.equals(catalogHintType.h())) {
                return catalogHintType;
            }
            CatalogHintType catalogHintType2 = CatalogHintType.HIGHLIGHT_TABS;
            if (str.equals(catalogHintType2.h())) {
                return catalogHintType2;
            }
            CatalogHintType catalogHintType3 = CatalogHintType.HIGHLIGHT_KIDS;
            if (str.equals(catalogHintType3.h())) {
                return catalogHintType3;
            }
            CatalogHintType catalogHintType4 = CatalogHintType.COACHMARK;
            return str.equals(catalogHintType4.h()) ? catalogHintType4 : CatalogHintType.TOOLTIP;
        }
    }

    static {
        CatalogHintType catalogHintType = new CatalogHintType("HIGHLIGHT_TABS", 0, "highlight_tabs");
        HIGHLIGHT_TABS = catalogHintType;
        CatalogHintType catalogHintType2 = new CatalogHintType("HIGHLIGHT_KIDS", 1, "highlight_kids");
        HIGHLIGHT_KIDS = catalogHintType2;
        CatalogHintType catalogHintType3 = new CatalogHintType("HIGHLIGHT", 2, "highlight");
        HIGHLIGHT = catalogHintType3;
        CatalogHintType catalogHintType4 = new CatalogHintType("TOOLTIP", 3, "tooltip");
        TOOLTIP = catalogHintType4;
        CatalogHintType catalogHintType5 = new CatalogHintType("COACHMARK", 4, "coachmark");
        COACHMARK = catalogHintType5;
        CatalogHintType[] catalogHintTypeArr = {catalogHintType, catalogHintType2, catalogHintType3, catalogHintType4, catalogHintType5};
        $VALUES = catalogHintTypeArr;
        $ENTRIES = new asp(catalogHintTypeArr);
        Companion = new a();
    }

    public CatalogHintType(String str, int i, String str2) {
        this.type = str2;
    }

    public static CatalogHintType valueOf(String str) {
        return (CatalogHintType) Enum.valueOf(CatalogHintType.class, str);
    }

    public static CatalogHintType[] values() {
        return (CatalogHintType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
