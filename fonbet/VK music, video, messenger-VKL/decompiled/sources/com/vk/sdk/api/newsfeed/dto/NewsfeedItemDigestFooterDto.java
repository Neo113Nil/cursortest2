package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestFooterDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemDigestFooterDto {

    @pmi0("button")
    private final NewsfeedItemDigestButtonDto button;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestFooterDto.kt */
    public static final class StyleDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("button")
        public static final StyleDto BUTTON;

        @pmi0("text")
        public static final StyleDto TEXT;
        private final String value;

        static {
            StyleDto styleDto = new StyleDto("TEXT", 0, "text");
            TEXT = styleDto;
            StyleDto styleDto2 = new StyleDto("BUTTON", 1, "button");
            BUTTON = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    public NewsfeedItemDigestFooterDto(StyleDto styleDto, String str, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto) {
        this.style = styleDto;
        this.text = str;
        this.button = newsfeedItemDigestButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestFooterDto)) {
            return false;
        }
        NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = (NewsfeedItemDigestFooterDto) obj;
        return this.style == newsfeedItemDigestFooterDto.style && epx.f(this.text, newsfeedItemDigestFooterDto.text) && epx.f(this.button, newsfeedItemDigestFooterDto.button);
    }

    public final int hashCode() {
        int a = urd0.a(this.style.hashCode() * 31, 31, this.text);
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        return a + (newsfeedItemDigestButtonDto == null ? 0 : newsfeedItemDigestButtonDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedItemDigestFooterDto(style=" + this.style + ", text=" + this.text + ", button=" + this.button + ")";
    }

    public /* synthetic */ NewsfeedItemDigestFooterDto(StyleDto styleDto, String str, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto, int i, zcl zclVar) {
        this(styleDto, str, (i & 4) != 0 ? null : newsfeedItemDigestButtonDto);
    }
}
