package com.vk.catalog2.common.dto.api.link;

import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogLinkImageStyle.kt */
/* loaded from: classes16.dex */
public final class CatalogLinkImageStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogLinkImageStyle[] $VALUES;
    public static final a Companion;
    public static final CatalogLinkImageStyle DEFAULT;
    public static final CatalogLinkImageStyle PLACEHOLDER_ICON;
    public static final CatalogLinkImageStyle RECTANGLE_RIGHT_SIDE;
    public static final CatalogLinkImageStyle RECTANGLE_STACKED_ROTATED;
    public static final CatalogLinkImageStyle ROUND_STACKED_ROTATED;
    public static final CatalogLinkImageStyle TRIPLE_ROTATED_RIGHT;
    private final String value;

    /* compiled from: CatalogLinkImageStyle.kt */
    public static final class a {
        public static CatalogLinkImageStyle a(String str) {
            Object obj;
            Iterator<E> it = CatalogLinkImageStyle.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((CatalogLinkImageStyle) next).i(), str != null ? str.toLowerCase(Locale.ROOT) : null)) {
                    obj = next;
                    break;
                }
            }
            CatalogLinkImageStyle catalogLinkImageStyle = (CatalogLinkImageStyle) obj;
            return catalogLinkImageStyle == null ? CatalogLinkImageStyle.DEFAULT : catalogLinkImageStyle;
        }
    }

    static {
        CatalogLinkImageStyle catalogLinkImageStyle = new CatalogLinkImageStyle("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = catalogLinkImageStyle;
        CatalogLinkImageStyle catalogLinkImageStyle2 = new CatalogLinkImageStyle("PLACEHOLDER_ICON", 1, "placeholder_icon");
        PLACEHOLDER_ICON = catalogLinkImageStyle2;
        CatalogLinkImageStyle catalogLinkImageStyle3 = new CatalogLinkImageStyle("ROUND_STACKED_ROTATED", 2, "round_stacked_rotated");
        ROUND_STACKED_ROTATED = catalogLinkImageStyle3;
        CatalogLinkImageStyle catalogLinkImageStyle4 = new CatalogLinkImageStyle("RECTANGLE_STACKED_ROTATED", 3, "rectangle_stacked_rotated");
        RECTANGLE_STACKED_ROTATED = catalogLinkImageStyle4;
        CatalogLinkImageStyle catalogLinkImageStyle5 = new CatalogLinkImageStyle("RECTANGLE_RIGHT_SIDE", 4, "rectangle_right_side");
        RECTANGLE_RIGHT_SIDE = catalogLinkImageStyle5;
        CatalogLinkImageStyle catalogLinkImageStyle6 = new CatalogLinkImageStyle("TRIPLE_ROTATED_RIGHT", 5, "triple_rotated_right");
        TRIPLE_ROTATED_RIGHT = catalogLinkImageStyle6;
        CatalogLinkImageStyle[] catalogLinkImageStyleArr = {catalogLinkImageStyle, catalogLinkImageStyle2, catalogLinkImageStyle3, catalogLinkImageStyle4, catalogLinkImageStyle5, catalogLinkImageStyle6};
        $VALUES = catalogLinkImageStyleArr;
        $ENTRIES = new asp(catalogLinkImageStyleArr);
        Companion = new a();
    }

    public CatalogLinkImageStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CatalogLinkImageStyle> h() {
        return $ENTRIES;
    }

    public static CatalogLinkImageStyle valueOf(String str) {
        return (CatalogLinkImageStyle) Enum.valueOf(CatalogLinkImageStyle.class, str);
    }

    public static CatalogLinkImageStyle[] values() {
        return (CatalogLinkImageStyle[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
