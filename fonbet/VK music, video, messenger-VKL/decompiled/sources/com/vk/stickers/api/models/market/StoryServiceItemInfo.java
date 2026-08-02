package com.vk.stickers.api.models.market;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: StoryServiceItemInfo.kt */
/* loaded from: classes5.dex */
public final class StoryServiceItemInfo {
    public final String a;
    public final CharSequence b;
    public final Long c;
    public final UserId d;
    public final Style e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryServiceItemInfo.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style Cta;
        public static final Style Sticker;
        public static final Style StickerAndCta;
        private final boolean ctaEnabled;
        private final String value;

        /* compiled from: StoryServiceItemInfo.kt */
        public static final class a {
        }

        static {
            Style style = new Style("Cta", 0, X3.i.G0, true);
            Cta = style;
            Style style2 = new Style("Sticker", 1, "sticker", false);
            Sticker = style2;
            Style style3 = new Style("StickerAndCta", 2, "sticker_and_cta", true);
            StickerAndCta = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2, boolean z) {
            this.value = str2;
            this.ctaEnabled = z;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.ctaEnabled;
        }

        public final String i() {
            return this.value;
        }
    }

    public StoryServiceItemInfo(String str, CharSequence charSequence, Long l, UserId userId, Style style) {
        this.a = str;
        this.b = charSequence;
        this.c = l;
        this.d = userId;
        this.e = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryServiceItemInfo)) {
            return false;
        }
        StoryServiceItemInfo storyServiceItemInfo = (StoryServiceItemInfo) obj;
        return epx.f(this.a, storyServiceItemInfo.a) && epx.f(this.b, storyServiceItemInfo.b) && epx.f(this.c, storyServiceItemInfo.c) && epx.f(this.d, storyServiceItemInfo.d) && this.e == storyServiceItemInfo.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        UserId userId = this.d;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Style style = this.e;
        return hashCode4 + (style != null ? style.hashCode() : 0);
    }

    public final String toString() {
        return "StoryServiceItemInfo(title=" + this.a + ", subtitle=" + ((Object) this.b) + ", serviceYcItemId=" + this.c + ", ownerId=" + this.d + ", style=" + this.e + ')';
    }
}
