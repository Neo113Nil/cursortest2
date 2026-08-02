package com.vk.clips.viewer.impl.grid.toolbar.common.trends;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.h5s;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrendsHeaderCellStyle.kt */
/* loaded from: classes17.dex */
public final class TrendsHeaderCellStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TrendsHeaderCellStyle[] $VALUES;
    public static final TrendsHeaderCellStyle COLORFUL;
    public static final a Companion;
    public static final TrendsHeaderCellStyle DEFAULT;
    private final b description;
    private final c title;

    /* compiled from: TrendsHeaderCellStyle.kt */
    public static final class a {
    }

    /* compiled from: TrendsHeaderCellStyle.kt */
    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(3) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return h5s.c(this.a, ", maxLines=3)", new StringBuilder("Description(textColorAttr="));
        }
    }

    /* compiled from: TrendsHeaderCellStyle.kt */
    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(1) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return h5s.c(this.a, ", maxLines=1)", new StringBuilder("Title(textColorAttr="));
        }
    }

    static {
        TrendsHeaderCellStyle trendsHeaderCellStyle = new TrendsHeaderCellStyle("DEFAULT", 0, new c(R.attr.vk_ui_text_primary), new b(R.attr.vk_ui_text_secondary));
        DEFAULT = trendsHeaderCellStyle;
        TrendsHeaderCellStyle trendsHeaderCellStyle2 = new TrendsHeaderCellStyle("COLORFUL", 1, new c(R.attr.vk_ui_text_contrast), new b(R.attr.vk_ui_text_contrast));
        COLORFUL = trendsHeaderCellStyle2;
        TrendsHeaderCellStyle[] trendsHeaderCellStyleArr = {trendsHeaderCellStyle, trendsHeaderCellStyle2};
        $VALUES = trendsHeaderCellStyleArr;
        $ENTRIES = new asp(trendsHeaderCellStyleArr);
        Companion = new a();
    }

    public TrendsHeaderCellStyle(String str, int i, c cVar, b bVar) {
        this.title = cVar;
        this.description = bVar;
    }

    public static TrendsHeaderCellStyle valueOf(String str) {
        return (TrendsHeaderCellStyle) Enum.valueOf(TrendsHeaderCellStyle.class, str);
    }

    public static TrendsHeaderCellStyle[] values() {
        return (TrendsHeaderCellStyle[]) $VALUES.clone();
    }

    public final b h() {
        return this.description;
    }

    public final c i() {
        return this.title;
    }
}
