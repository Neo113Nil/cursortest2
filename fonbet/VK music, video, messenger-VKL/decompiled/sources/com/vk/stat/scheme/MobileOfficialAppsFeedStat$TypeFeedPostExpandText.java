package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostExpandText implements SchemeStat$TypeClick.b {

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("show_more_button")
        public static final Source SHOW_MORE_BUTTON;

        @pmi0("text")
        public static final Source TEXT;

        static {
            Source source = new Source("TEXT", 0);
            TEXT = source;
            Source source2 = new Source("SHOW_MORE_BUTTON", 1);
            SHOW_MORE_BUTTON = source2;
            Source[] sourceArr = {source, source2};
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

    public MobileOfficialAppsFeedStat$TypeFeedPostExpandText(Source source) {
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostExpandText) && this.source == ((MobileOfficialAppsFeedStat$TypeFeedPostExpandText) obj).source;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostExpandText(source=" + this.source + ')';
    }
}
