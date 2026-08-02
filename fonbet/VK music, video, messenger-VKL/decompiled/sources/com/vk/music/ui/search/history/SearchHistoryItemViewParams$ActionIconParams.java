package com.vk.music.ui.search.history;

import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.uqi;
import xsna.zrp;

/* compiled from: SearchHistoryItemViewParams.kt */
/* loaded from: classes3.dex */
public final class SearchHistoryItemViewParams$ActionIconParams {
    public static final SearchHistoryItemViewParams$ActionIconParams d = new SearchHistoryItemViewParams$ActionIconParams(null, false, null, 15);
    public final IconType a;
    public final boolean b;
    public final Integer c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHistoryItemViewParams.kt */
    public static final class IconType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType Add;
        public static final IconType Chevron;
        public static final IconType Done;
        public static final IconType More;
        public static final IconType MoreWithPreAction;
        public static final IconType None;

        static {
            IconType iconType = new IconType("None", 0);
            None = iconType;
            IconType iconType2 = new IconType("More", 1);
            More = iconType2;
            IconType iconType3 = new IconType("MoreWithPreAction", 2);
            MoreWithPreAction = iconType3;
            IconType iconType4 = new IconType("Chevron", 3);
            Chevron = iconType4;
            IconType iconType5 = new IconType("Add", 4);
            Add = iconType5;
            IconType iconType6 = new IconType("Done", 5);
            Done = iconType6;
            IconType[] iconTypeArr = {iconType, iconType2, iconType3, iconType4, iconType5, iconType6};
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

    public SearchHistoryItemViewParams$ActionIconParams() {
        this(null, false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHistoryItemViewParams$ActionIconParams)) {
            return false;
        }
        SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams = (SearchHistoryItemViewParams$ActionIconParams) obj;
        return this.a == searchHistoryItemViewParams$ActionIconParams.a && this.b == searchHistoryItemViewParams$ActionIconParams.b && epx.f(this.c, searchHistoryItemViewParams$ActionIconParams.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 961, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionIconParams(iconType=");
        sb.append(this.a);
        sb.append(", isClickable=");
        sb.append(this.b);
        sb.append(", contentDescription=null, contentDescriptionResId=");
        return uqi.b(sb, this.c, ')');
    }

    public SearchHistoryItemViewParams$ActionIconParams(IconType iconType, boolean z, Integer num, int i) {
        iconType = (i & 1) != 0 ? IconType.None : iconType;
        z = (i & 2) != 0 ? false : z;
        num = (i & 8) != 0 ? null : num;
        this.a = iconType;
        this.b = z;
        this.c = num;
    }
}
