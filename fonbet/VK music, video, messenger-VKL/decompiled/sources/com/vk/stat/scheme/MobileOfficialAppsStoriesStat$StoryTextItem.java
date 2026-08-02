package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.impl.L2;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.vu5;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsStoriesStat$StoryTextItem {
    public final transient String a;

    @pmi0("align")
    private final Align align;

    @pmi0(L2.g)
    private final int background;

    @pmi0("color")
    private final FilteredString filteredColor;

    @pmi0("font")
    private final Font font;

    @pmi0("size")
    private final int size;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    /* loaded from: classes5.dex */
    public static final class Align {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;

        @pmi0(TtmlNode.CENTER)
        public static final Align CENTER;

        @pmi0(TtmlNode.LEFT)
        public static final Align LEFT;

        @pmi0(TtmlNode.RIGHT)
        public static final Align RIGHT;

        static {
            Align align = new Align("LEFT", 0);
            LEFT = align;
            Align align2 = new Align("CENTER", 1);
            CENTER = align2;
            Align align3 = new Align("RIGHT", 2);
            RIGHT = align3;
            Align[] alignArr = {align, align2, align3};
            $VALUES = alignArr;
            $ENTRIES = new asp(alignArr);
        }

        private Align(String str, int i) {
        }

        public static zrp<Align> h() {
            return $ENTRIES;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    /* loaded from: classes5.dex */
    public static final class Font {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Font[] $VALUES;

        @pmi0("classic")
        public static final Font CLASSIC;

        @pmi0("cursive")
        public static final Font CURSIVE;

        @pmi0("italics")
        public static final Font ITALICS;

        @pmi0("marker")
        public static final Font MARKER;

        @pmi0("poster")
        public static final Font POSTER;

        @pmi0("retro")
        public static final Font RETRO;

        @pmi0("typewriter")
        public static final Font TYPEWRITER;

        static {
            Font font = new Font("CLASSIC", 0);
            CLASSIC = font;
            Font font2 = new Font("CURSIVE", 1);
            CURSIVE = font2;
            Font font3 = new Font("MARKER", 2);
            MARKER = font3;
            Font font4 = new Font("ITALICS", 3);
            ITALICS = font4;
            Font font5 = new Font("TYPEWRITER", 4);
            TYPEWRITER = font5;
            Font font6 = new Font("POSTER", 5);
            POSTER = font6;
            Font font7 = new Font("RETRO", 6);
            RETRO = font7;
            Font[] fontArr = {font, font2, font3, font4, font5, font6, font7};
            $VALUES = fontArr;
            $ENTRIES = new asp(fontArr);
        }

        private Font(String str, int i) {
        }

        public static zrp<Font> h() {
            return $ENTRIES;
        }

        public static Font valueOf(String str) {
            return (Font) Enum.valueOf(Font.class, str);
        }

        public static Font[] values() {
            return (Font[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsStoriesStat$StoryTextItem>, a9y<MobileOfficialAppsStoriesStat$StoryTextItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsStoriesStat$StoryTextItem((Align) dq.f(x9yVar, "align", tru.a(), Align.class), fai.p(x9yVar, "size"), fai.s(x9yVar, "text"), (Font) dq.f(x9yVar, "font", tru.a(), Font.class), fai.s(x9yVar, "color"), fai.p(x9yVar, L2.g));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsStoriesStat$StoryTextItem mobileOfficialAppsStoriesStat$StoryTextItem = (MobileOfficialAppsStoriesStat$StoryTextItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("align", tru.a().toJson(mobileOfficialAppsStoriesStat$StoryTextItem.a()));
            x9yVar.n("size", Integer.valueOf(mobileOfficialAppsStoriesStat$StoryTextItem.d()));
            x9yVar.o("text", mobileOfficialAppsStoriesStat$StoryTextItem.e());
            x9yVar.o("font", tru.a().toJson(mobileOfficialAppsStoriesStat$StoryTextItem.c()));
            x9yVar.o("color", mobileOfficialAppsStoriesStat$StoryTextItem.a);
            x9yVar.n(L2.g, Integer.valueOf(mobileOfficialAppsStoriesStat$StoryTextItem.b()));
            return x9yVar;
        }
    }

    public MobileOfficialAppsStoriesStat$StoryTextItem(Align align, int i, String str, Font font, String str2, int i2) {
        this.align = align;
        this.size = i;
        this.text = str;
        this.font = font;
        this.a = str2;
        this.background = i2;
        FilteredString filteredString = new FilteredString(lhg.b(7));
        this.filteredColor = filteredString;
        filteredString.a(str2);
    }

    public final Align a() {
        return this.align;
    }

    public final int b() {
        return this.background;
    }

    public final Font c() {
        return this.font;
    }

    public final int d() {
        return this.size;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StoryTextItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StoryTextItem mobileOfficialAppsStoriesStat$StoryTextItem = (MobileOfficialAppsStoriesStat$StoryTextItem) obj;
        return this.align == mobileOfficialAppsStoriesStat$StoryTextItem.align && this.size == mobileOfficialAppsStoriesStat$StoryTextItem.size && epx.f(this.text, mobileOfficialAppsStoriesStat$StoryTextItem.text) && this.font == mobileOfficialAppsStoriesStat$StoryTextItem.font && epx.f(this.a, mobileOfficialAppsStoriesStat$StoryTextItem.a) && this.background == mobileOfficialAppsStoriesStat$StoryTextItem.background;
    }

    public final int hashCode() {
        return Integer.hashCode(this.background) + urd0.a((this.font.hashCode() + urd0.a(shy.a(this.size, this.align.hashCode() * 31, 31), 31, this.text)) * 31, 31, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryTextItem(align=");
        sb.append(this.align);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", font=");
        sb.append(this.font);
        sb.append(", color=");
        sb.append(this.a);
        sb.append(", background=");
        return vu5.b(sb, this.background, ')');
    }
}
