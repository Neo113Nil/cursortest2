package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestHeaderDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemDigestHeaderDto {

    @pmi0("button")
    private final NewsfeedItemDigestButtonDto button;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestHeaderDto.kt */
    public static final class StyleDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("multiline")
        public static final StyleDto MULTILINE;

        @pmi0("singleline")
        public static final StyleDto SINGLELINE;
        private final String value;

        static {
            StyleDto styleDto = new StyleDto("SINGLELINE", 0, "singleline");
            SINGLELINE = styleDto;
            StyleDto styleDto2 = new StyleDto("MULTILINE", 1, "multiline");
            MULTILINE = styleDto2;
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

    public NewsfeedItemDigestHeaderDto(String str, StyleDto styleDto, String str2, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto) {
        this.title = str;
        this.style = styleDto;
        this.subtitle = str2;
        this.button = newsfeedItemDigestButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestHeaderDto)) {
            return false;
        }
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = (NewsfeedItemDigestHeaderDto) obj;
        return epx.f(this.title, newsfeedItemDigestHeaderDto.title) && this.style == newsfeedItemDigestHeaderDto.style && epx.f(this.subtitle, newsfeedItemDigestHeaderDto.subtitle) && epx.f(this.button, newsfeedItemDigestHeaderDto.button);
    }

    public final int hashCode() {
        int hashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        return hashCode2 + (newsfeedItemDigestButtonDto != null ? newsfeedItemDigestButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemDigestHeaderDto(title=" + this.title + ", style=" + this.style + ", subtitle=" + this.subtitle + ", button=" + this.button + ")";
    }

    public /* synthetic */ NewsfeedItemDigestHeaderDto(String str, StyleDto styleDto, String str2, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto, int i, zcl zclVar) {
        this(str, styleDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : newsfeedItemDigestButtonDto);
    }
}
