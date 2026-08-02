package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsStoriesStat$StoryClickableStickerItem {
    public final transient String a;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("color")
    private final FilteredString filteredColor;

    @pmi0("id_value")
    private final Long idValue;

    @pmi0("sticker_type")
    private final StickerType stickerType;

    @pmi0(TtmlNode.TAG_STYLE)
    private final Style style;

    @pmi0("text_value")
    private final String textValue;

    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsStoriesStat$StoryClickableStickerItem>, a9y<MobileOfficialAppsStoriesStat$StoryClickableStickerItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Style style = (Style) dq.f(x9yVar, TtmlNode.TAG_STYLE, tru.a(), Style.class);
            String C = fai.C(x9yVar, "color");
            Gson a = tru.a();
            b9y q = x9yVar.q("sticker_type");
            return new MobileOfficialAppsStoriesStat$StoryClickableStickerItem(style, C, (StickerType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), StickerType.class)), fai.C(x9yVar, "text_value"), fai.B(x9yVar, "id_value"), fai.A(x9yVar, "category_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsStoriesStat$StoryClickableStickerItem mobileOfficialAppsStoriesStat$StoryClickableStickerItem = (MobileOfficialAppsStoriesStat$StoryClickableStickerItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(TtmlNode.TAG_STYLE, tru.a().toJson(mobileOfficialAppsStoriesStat$StoryClickableStickerItem.d()));
            x9yVar.o("color", mobileOfficialAppsStoriesStat$StoryClickableStickerItem.a);
            x9yVar.o("sticker_type", tru.a().toJson(mobileOfficialAppsStoriesStat$StoryClickableStickerItem.c()));
            x9yVar.o("text_value", mobileOfficialAppsStoriesStat$StoryClickableStickerItem.e());
            x9yVar.n("id_value", mobileOfficialAppsStoriesStat$StoryClickableStickerItem.b());
            x9yVar.n("category_id", mobileOfficialAppsStoriesStat$StoryClickableStickerItem.a());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    /* loaded from: classes5.dex */
    public static final class StickerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StickerType[] $VALUES;

        @pmi0("hashtag")
        public static final StickerType HASHTAG;

        @pmi0("market_item")
        public static final StickerType MARKET_ITEM;

        @pmi0("mention")
        public static final StickerType MENTION;

        @pmi0("music")
        public static final StickerType MUSIC;

        @pmi0("place")
        public static final StickerType PLACE;

        @pmi0("poll")
        public static final StickerType POLL;

        @pmi0("situational_template")
        public static final StickerType SITUATIONAL_TEMPLATE;

        @pmi0("sticker")
        public static final StickerType STICKER;

        static {
            StickerType stickerType = new StickerType("HASHTAG", 0);
            HASHTAG = stickerType;
            StickerType stickerType2 = new StickerType("MENTION", 1);
            MENTION = stickerType2;
            StickerType stickerType3 = new StickerType("PLACE", 2);
            PLACE = stickerType3;
            StickerType stickerType4 = new StickerType("MARKET_ITEM", 3);
            MARKET_ITEM = stickerType4;
            StickerType stickerType5 = new StickerType("POLL", 4);
            POLL = stickerType5;
            StickerType stickerType6 = new StickerType("STICKER", 5);
            STICKER = stickerType6;
            StickerType stickerType7 = new StickerType("SITUATIONAL_TEMPLATE", 6);
            SITUATIONAL_TEMPLATE = stickerType7;
            StickerType stickerType8 = new StickerType("MUSIC", 7);
            MUSIC = stickerType8;
            StickerType[] stickerTypeArr = {stickerType, stickerType2, stickerType3, stickerType4, stickerType5, stickerType6, stickerType7, stickerType8};
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
    /* loaded from: classes5.dex */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @pmi0("blue")
        public static final Style BLUE;

        @pmi0("blue_gradient")
        public static final Style BLUE_GRADIENT;

        @pmi0("green")
        public static final Style GREEN;

        @pmi0("impressive")
        public static final Style IMPRESSIVE;

        @pmi0("light")
        public static final Style LIGHT;

        @pmi0("red_gradient")
        public static final Style RED_GRADIENT;

        @pmi0(X3.i.T)
        public static final Style TRANSPARENT;

        @pmi0(TtmlNode.UNDERLINE)
        public static final Style UNDERLINE;

        @pmi0("white")
        public static final Style WHITE;

        static {
            Style style = new Style("TRANSPARENT", 0);
            TRANSPARENT = style;
            Style style2 = new Style("BLUE_GRADIENT", 1);
            BLUE_GRADIENT = style2;
            Style style3 = new Style("RED_GRADIENT", 2);
            RED_GRADIENT = style3;
            Style style4 = new Style("UNDERLINE", 3);
            UNDERLINE = style4;
            Style style5 = new Style("BLUE", 4);
            BLUE = style5;
            Style style6 = new Style("GREEN", 5);
            GREEN = style6;
            Style style7 = new Style("WHITE", 6);
            WHITE = style7;
            Style style8 = new Style("LIGHT", 7);
            LIGHT = style8;
            Style style9 = new Style("IMPRESSIVE", 8);
            IMPRESSIVE = style9;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        private Style(String str, int i) {
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

    public MobileOfficialAppsStoriesStat$StoryClickableStickerItem(Style style, String str, StickerType stickerType, String str2, Long l, Integer num) {
        this.style = style;
        this.a = str;
        this.stickerType = stickerType;
        this.textValue = str2;
        this.idValue = l;
        this.categoryId = num;
        FilteredString filteredString = new FilteredString(lhg.b(7));
        this.filteredColor = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.categoryId;
    }

    public final Long b() {
        return this.idValue;
    }

    public final StickerType c() {
        return this.stickerType;
    }

    public final Style d() {
        return this.style;
    }

    public final String e() {
        return this.textValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StoryClickableStickerItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StoryClickableStickerItem mobileOfficialAppsStoriesStat$StoryClickableStickerItem = (MobileOfficialAppsStoriesStat$StoryClickableStickerItem) obj;
        return this.style == mobileOfficialAppsStoriesStat$StoryClickableStickerItem.style && epx.f(this.a, mobileOfficialAppsStoriesStat$StoryClickableStickerItem.a) && this.stickerType == mobileOfficialAppsStoriesStat$StoryClickableStickerItem.stickerType && epx.f(this.textValue, mobileOfficialAppsStoriesStat$StoryClickableStickerItem.textValue) && epx.f(this.idValue, mobileOfficialAppsStoriesStat$StoryClickableStickerItem.idValue) && epx.f(this.categoryId, mobileOfficialAppsStoriesStat$StoryClickableStickerItem.categoryId);
    }

    public final int hashCode() {
        int hashCode = this.style.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StickerType stickerType = this.stickerType;
        int hashCode3 = (hashCode2 + (stickerType == null ? 0 : stickerType.hashCode())) * 31;
        String str2 = this.textValue;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.idValue;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.categoryId;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryClickableStickerItem(style=");
        sb.append(this.style);
        sb.append(", color=");
        sb.append(this.a);
        sb.append(", stickerType=");
        sb.append(this.stickerType);
        sb.append(", textValue=");
        sb.append(this.textValue);
        sb.append(", idValue=");
        sb.append(this.idValue);
        sb.append(", categoryId=");
        return uqi.b(sb, this.categoryId, ')');
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$StoryClickableStickerItem(Style style, String str, StickerType stickerType, String str2, Long l, Integer num, int i, zcl zclVar) {
        this(style, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : stickerType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num);
    }
}
