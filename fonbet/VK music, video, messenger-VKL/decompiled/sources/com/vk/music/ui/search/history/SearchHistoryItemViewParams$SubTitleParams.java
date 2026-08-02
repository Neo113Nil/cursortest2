package com.vk.music.ui.search.history;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: SearchHistoryItemViewParams.kt */
/* loaded from: classes3.dex */
public final class SearchHistoryItemViewParams$SubTitleParams {
    public static final SearchHistoryItemViewParams$SubTitleParams c = new SearchHistoryItemViewParams$SubTitleParams(null, null);
    public final String a;
    public final IconType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHistoryItemViewParams.kt */
    public static final class IconType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType Video;

        static {
            IconType iconType = new IconType("Video", 0);
            Video = iconType;
            IconType[] iconTypeArr = {iconType};
            $VALUES = iconTypeArr;
            $ENTRIES = new asp(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    public SearchHistoryItemViewParams$SubTitleParams(String str, IconType iconType) {
        this.a = str;
        this.b = iconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHistoryItemViewParams$SubTitleParams)) {
            return false;
        }
        SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams = (SearchHistoryItemViewParams$SubTitleParams) obj;
        return epx.f(this.a, searchHistoryItemViewParams$SubTitleParams.a) && this.b == searchHistoryItemViewParams$SubTitleParams.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        IconType iconType = this.b;
        return hashCode + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        return "SubTitleParams(text=" + this.a + ", iconType=" + this.b + ')';
    }
}
