package com.vk.libvideo.design.compose.video.topshelf.state;

import xsna.asp;
import xsna.mno0;
import xsna.zrp;

/* compiled from: TopshelfCardMetaCountState.kt */
/* loaded from: classes2.dex */
public final class TopshelfCardMetaCountState {
    public final mno0.i a;
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TopshelfCardMetaCountState.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Accent;
        public static final Style Default;
        public static final Style LiveUpcoming;

        static {
            Style style = new Style("Default", 0);
            Default = style;
            Style style2 = new Style("Accent", 1);
            Accent = style2;
            Style style3 = new Style("LiveUpcoming", 2);
            LiveUpcoming = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public TopshelfCardMetaCountState(mno0.i iVar, Style style) {
        this.a = iVar;
        this.b = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfCardMetaCountState)) {
            return false;
        }
        TopshelfCardMetaCountState topshelfCardMetaCountState = (TopshelfCardMetaCountState) obj;
        return this.a.equals(topshelfCardMetaCountState.a) && this.b == topshelfCardMetaCountState.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 29791);
    }

    public final String toString() {
        return "TopshelfCardMetaCountState(text=" + this.a + ", icon=null, contentDescription=null, style=" + this.b + ')';
    }
}
