package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenItem implements SchemeStat$TypeClick.b {

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("comments_button")
        public static final Source COMMENTS_BUTTON;

        @pmi0("expand")
        public static final Source EXPAND;

        @pmi0("news_item_click")
        public static final Source NEWS_ITEM_CLICK;

        static {
            Source source = new Source("NEWS_ITEM_CLICK", 0);
            NEWS_ITEM_CLICK = source;
            Source source2 = new Source("COMMENTS_BUTTON", 1);
            COMMENTS_BUTTON = source2;
            Source source3 = new Source("EXPAND", 2);
            EXPAND = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedOpenItem(Source source) {
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenItem) && this.source == ((MobileOfficialAppsFeedStat$TypeFeedOpenItem) obj).source;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "TypeFeedOpenItem(source=" + this.source + ')';
    }
}
