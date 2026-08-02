package com.vk.catalog2.common.dto.api;

import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogCustomAttributes.kt */
@ozl
/* loaded from: classes16.dex */
public final class CatalogCustomAttributes$Values {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogCustomAttributes$Values[] $VALUES;
    public static final CatalogCustomAttributes$Values FIT;
    public static final CatalogCustomAttributes$Values FOUND_BY_LYRICS;
    public static final CatalogCustomAttributes$Values HIGHLIGHT_TREND;
    public static final CatalogCustomAttributes$Values ISLAND;
    public static final CatalogCustomAttributes$Values ISLAND_TRANSPARENT;
    public static final CatalogCustomAttributes$Values LEGAL_NOTICE;
    public static final CatalogCustomAttributes$Values OUTLINE_WITH_CHEVRON;
    public static final CatalogCustomAttributes$Values OVERLAP;
    public static final CatalogCustomAttributes$Values SECONDARY;
    public static final CatalogCustomAttributes$Values THIN;
    public static final CatalogCustomAttributes$Values TRANSPARENT;
    private final String value;

    static {
        CatalogCustomAttributes$Values catalogCustomAttributes$Values = new CatalogCustomAttributes$Values("OUTLINE_WITH_CHEVRON", 0, "outline_with_chevron");
        OUTLINE_WITH_CHEVRON = catalogCustomAttributes$Values;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values2 = new CatalogCustomAttributes$Values("FIT", 1, "fit");
        FIT = catalogCustomAttributes$Values2;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values3 = new CatalogCustomAttributes$Values("FOUND_BY_LYRICS", 2, "found_by_lyrics");
        FOUND_BY_LYRICS = catalogCustomAttributes$Values3;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values4 = new CatalogCustomAttributes$Values("THIN", 3, "thin");
        THIN = catalogCustomAttributes$Values4;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values5 = new CatalogCustomAttributes$Values("ISLAND", 4, "island");
        ISLAND = catalogCustomAttributes$Values5;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values6 = new CatalogCustomAttributes$Values("SECONDARY", 5, X3.i.Y);
        SECONDARY = catalogCustomAttributes$Values6;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values7 = new CatalogCustomAttributes$Values("TRANSPARENT", 6, X3.i.T);
        TRANSPARENT = catalogCustomAttributes$Values7;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values8 = new CatalogCustomAttributes$Values("ISLAND_TRANSPARENT", 7, "island_transparent");
        ISLAND_TRANSPARENT = catalogCustomAttributes$Values8;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values9 = new CatalogCustomAttributes$Values("OVERLAP", 8, "overlap");
        OVERLAP = catalogCustomAttributes$Values9;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values10 = new CatalogCustomAttributes$Values("LEGAL_NOTICE", 9, "legal_notice");
        LEGAL_NOTICE = catalogCustomAttributes$Values10;
        CatalogCustomAttributes$Values catalogCustomAttributes$Values11 = new CatalogCustomAttributes$Values("HIGHLIGHT_TREND", 10, "highlight_trend");
        HIGHLIGHT_TREND = catalogCustomAttributes$Values11;
        CatalogCustomAttributes$Values[] catalogCustomAttributes$ValuesArr = {catalogCustomAttributes$Values, catalogCustomAttributes$Values2, catalogCustomAttributes$Values3, catalogCustomAttributes$Values4, catalogCustomAttributes$Values5, catalogCustomAttributes$Values6, catalogCustomAttributes$Values7, catalogCustomAttributes$Values8, catalogCustomAttributes$Values9, catalogCustomAttributes$Values10, catalogCustomAttributes$Values11};
        $VALUES = catalogCustomAttributes$ValuesArr;
        $ENTRIES = new asp(catalogCustomAttributes$ValuesArr);
    }

    public CatalogCustomAttributes$Values(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogCustomAttributes$Values valueOf(String str) {
        return (CatalogCustomAttributes$Values) Enum.valueOf(CatalogCustomAttributes$Values.class, str);
    }

    public static CatalogCustomAttributes$Values[] values() {
        return (CatalogCustomAttributes$Values[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }

    public final boolean i(String str) {
        return epx.f(this.value, str);
    }
}
