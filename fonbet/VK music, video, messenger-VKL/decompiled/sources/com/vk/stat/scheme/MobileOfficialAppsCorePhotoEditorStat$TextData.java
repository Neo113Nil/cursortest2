package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$TextData {

    @pmi0("align")
    private final Align align;

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("font")
    private final String font;

    @pmi0("size")
    private final Integer size;

    @pmi0("text")
    private final String text;

    @pmi0("text_color")
    private final String textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
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

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePhotoEditorStat$TextData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePhotoEditorStat$TextData)) {
            return false;
        }
        MobileOfficialAppsCorePhotoEditorStat$TextData mobileOfficialAppsCorePhotoEditorStat$TextData = (MobileOfficialAppsCorePhotoEditorStat$TextData) obj;
        return this.align == mobileOfficialAppsCorePhotoEditorStat$TextData.align && epx.f(this.size, mobileOfficialAppsCorePhotoEditorStat$TextData.size) && epx.f(this.text, mobileOfficialAppsCorePhotoEditorStat$TextData.text) && epx.f(this.font, mobileOfficialAppsCorePhotoEditorStat$TextData.font) && epx.f(this.textColor, mobileOfficialAppsCorePhotoEditorStat$TextData.textColor) && epx.f(this.backgroundColor, mobileOfficialAppsCorePhotoEditorStat$TextData.backgroundColor);
    }

    public final int hashCode() {
        Align align = this.align;
        int hashCode = (align == null ? 0 : align.hashCode()) * 31;
        Integer num = this.size;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.font;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColor;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextData(align=");
        sb.append(this.align);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", font=");
        sb.append(this.font);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.backgroundColor, ')');
    }

    public MobileOfficialAppsCorePhotoEditorStat$TextData(Align align, Integer num, String str, String str2, String str3, String str4) {
        this.align = align;
        this.size = num;
        this.text = str;
        this.font = str2;
        this.textColor = str3;
        this.backgroundColor = str4;
    }

    public /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$TextData(Align align, Integer num, String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : align, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
