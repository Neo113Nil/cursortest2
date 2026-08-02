package com.vk.catalog2.common.dto.api.banner;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogBannerImageMode.kt */
/* loaded from: classes16.dex */
public final class CatalogBannerImageMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogBannerImageMode[] $VALUES;
    public static final a Companion;
    public static final CatalogBannerImageMode FULL_BACKGROUND;
    public static final CatalogBannerImageMode NONE;
    public static final CatalogBannerImageMode ROUNDED_SMALL_IMAGE;
    public static final CatalogBannerImageMode ROUND_BIG;
    public static final CatalogBannerImageMode ROUND_SMALL;
    public static final CatalogBannerImageMode SQUARE_BIG;
    public static final CatalogBannerImageMode SQUARE_SMALL;

    /* compiled from: CatalogBannerImageMode.kt */
    public static final class a {
        public static CatalogBannerImageMode a(String str) {
            CatalogBannerImageMode catalogBannerImageMode;
            CatalogBannerImageMode[] values = CatalogBannerImageMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    catalogBannerImageMode = null;
                    break;
                }
                catalogBannerImageMode = values[i];
                if (epx.f(catalogBannerImageMode.name(), str)) {
                    break;
                }
                i++;
            }
            return catalogBannerImageMode == null ? CatalogBannerImageMode.NONE : catalogBannerImageMode;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            return com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode.ROUND_SMALL;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        
            if (r1.equals("image") == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            return com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode.SQUARE_BIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        
            if (r1.equals("icon") == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        
            if (r1.equals("big") == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (r1.equals("small_image") == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r1.equals("small") == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
        
            return com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode.SQUARE_SMALL;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r1.equals("round") == false) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static CatalogBannerImageMode b(String str) {
            switch (str.hashCode()) {
                case -1405959847:
                    if (str.equals("avatar")) {
                        return CatalogBannerImageMode.ROUND_BIG;
                    }
                    return CatalogBannerImageMode.NONE;
                case -1209543279:
                    if (str.equals("rounded_small_image")) {
                        return CatalogBannerImageMode.ROUNDED_SMALL_IMAGE;
                    }
                    return CatalogBannerImageMode.NONE;
                case -534347741:
                    break;
                case 97536:
                    break;
                case 3226745:
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        return CatalogBannerImageMode.FULL_BACKGROUND;
                    }
                    return CatalogBannerImageMode.NONE;
                case 100313435:
                    break;
                case 108704142:
                    break;
                case 109548807:
                    break;
                default:
                    return CatalogBannerImageMode.NONE;
            }
        }
    }

    static {
        CatalogBannerImageMode catalogBannerImageMode = new CatalogBannerImageMode("ROUND_BIG", 0);
        ROUND_BIG = catalogBannerImageMode;
        CatalogBannerImageMode catalogBannerImageMode2 = new CatalogBannerImageMode("ROUND_SMALL", 1);
        ROUND_SMALL = catalogBannerImageMode2;
        CatalogBannerImageMode catalogBannerImageMode3 = new CatalogBannerImageMode("SQUARE_BIG", 2);
        SQUARE_BIG = catalogBannerImageMode3;
        CatalogBannerImageMode catalogBannerImageMode4 = new CatalogBannerImageMode("SQUARE_SMALL", 3);
        SQUARE_SMALL = catalogBannerImageMode4;
        CatalogBannerImageMode catalogBannerImageMode5 = new CatalogBannerImageMode("FULL_BACKGROUND", 4);
        FULL_BACKGROUND = catalogBannerImageMode5;
        CatalogBannerImageMode catalogBannerImageMode6 = new CatalogBannerImageMode("ROUNDED_SMALL_IMAGE", 5);
        ROUNDED_SMALL_IMAGE = catalogBannerImageMode6;
        CatalogBannerImageMode catalogBannerImageMode7 = new CatalogBannerImageMode("NONE", 6);
        NONE = catalogBannerImageMode7;
        CatalogBannerImageMode[] catalogBannerImageModeArr = {catalogBannerImageMode, catalogBannerImageMode2, catalogBannerImageMode3, catalogBannerImageMode4, catalogBannerImageMode5, catalogBannerImageMode6, catalogBannerImageMode7};
        $VALUES = catalogBannerImageModeArr;
        $ENTRIES = new asp(catalogBannerImageModeArr);
        Companion = new a();
    }

    public CatalogBannerImageMode() {
        throw null;
    }

    public static CatalogBannerImageMode valueOf(String str) {
        return (CatalogBannerImageMode) Enum.valueOf(CatalogBannerImageMode.class, str);
    }

    public static CatalogBannerImageMode[] values() {
        return (CatalogBannerImageMode[]) $VALUES.clone();
    }
}
