package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$StoryStickerItem {

    @pmi0("id")
    private final long id;

    @pmi0("pack_id")
    private final int packId;

    @pmi0("sticker_type")
    private final StickerType stickerType;

    @pmi0(TtmlNode.TAG_STYLE)
    private final Style style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StickerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StickerType[] $VALUES;

        @pmi0("animated")
        public static final StickerType ANIMATED;

        @pmi0("from_pack")
        public static final StickerType FROM_PACK;

        @pmi0("gif")
        public static final StickerType GIF;

        @pmi0("individual")
        public static final StickerType INDIVIDUAL;

        @pmi0("photo")
        public static final StickerType PHOTO;

        @pmi0("time")
        public static final StickerType TIME;

        static {
            StickerType stickerType = new StickerType("INDIVIDUAL", 0);
            INDIVIDUAL = stickerType;
            StickerType stickerType2 = new StickerType("FROM_PACK", 1);
            FROM_PACK = stickerType2;
            StickerType stickerType3 = new StickerType("ANIMATED", 2);
            ANIMATED = stickerType3;
            StickerType stickerType4 = new StickerType("GIF", 3);
            GIF = stickerType4;
            StickerType stickerType5 = new StickerType("TIME", 4);
            TIME = stickerType5;
            StickerType stickerType6 = new StickerType("PHOTO", 5);
            PHOTO = stickerType6;
            StickerType[] stickerTypeArr = {stickerType, stickerType2, stickerType3, stickerType4, stickerType5, stickerType6};
            $VALUES = stickerTypeArr;
            $ENTRIES = new asp(stickerTypeArr);
        }

        private StickerType(String str, int i) {
        }

        public static zrp<StickerType> h() {
            return $ENTRIES;
        }

        public static StickerType valueOf(String str) {
            return (StickerType) Enum.valueOf(StickerType.class, str);
        }

        public static StickerType[] values() {
            return (StickerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    /* loaded from: classes11.dex */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style BLACK;
        public static final Style DEFAULT;
        public static final Style ROUND_WHITE;
        public static final Style SQUARE_BLACK;
        public static final Style SQUARE_WHITE;
        public static final Style TEXT;
        public static final Style TRANSPARENT;
        public static final Style WHITE;
        private final int value;

        /* compiled from: MobileOfficialAppsStoriesStat.kt */
        public static final class Serializer implements uay<Style> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((Style) obj).value));
            }
        }

        static {
            Style style = new Style("DEFAULT", 0, 0);
            DEFAULT = style;
            Style style2 = new Style("SQUARE_WHITE", 1, 1);
            SQUARE_WHITE = style2;
            Style style3 = new Style("SQUARE_BLACK", 2, 2);
            SQUARE_BLACK = style3;
            Style style4 = new Style("ROUND_WHITE", 3, 3);
            ROUND_WHITE = style4;
            Style style5 = new Style("WHITE", 4, 4);
            WHITE = style5;
            Style style6 = new Style("BLACK", 5, 5);
            BLACK = style6;
            Style style7 = new Style("TRANSPARENT", 6, 6);
            TRANSPARENT = style7;
            Style style8 = new Style("TEXT", 7, 7);
            TEXT = style8;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<Style> h() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStoriesStat$StoryStickerItem(long j, int i, StickerType stickerType, Style style) {
        this.id = j;
        this.packId = i;
        this.stickerType = stickerType;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StoryStickerItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StoryStickerItem mobileOfficialAppsStoriesStat$StoryStickerItem = (MobileOfficialAppsStoriesStat$StoryStickerItem) obj;
        return this.id == mobileOfficialAppsStoriesStat$StoryStickerItem.id && this.packId == mobileOfficialAppsStoriesStat$StoryStickerItem.packId && this.stickerType == mobileOfficialAppsStoriesStat$StoryStickerItem.stickerType && this.style == mobileOfficialAppsStoriesStat$StoryStickerItem.style;
    }

    public final int hashCode() {
        int a = shy.a(this.packId, Long.hashCode(this.id) * 31, 31);
        StickerType stickerType = this.stickerType;
        int hashCode = (a + (stickerType == null ? 0 : stickerType.hashCode())) * 31;
        Style style = this.style;
        return hashCode + (style != null ? style.hashCode() : 0);
    }

    public final String toString() {
        return "StoryStickerItem(id=" + this.id + ", packId=" + this.packId + ", stickerType=" + this.stickerType + ", style=" + this.style + ')';
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$StoryStickerItem(long j, int i, StickerType stickerType, Style style, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : stickerType, (i2 & 8) != 0 ? null : style);
    }
}
