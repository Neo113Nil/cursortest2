package com.vk.im.reporters.api.analytics.click;

import xsna.asp;
import xsna.mwv;
import xsna.zrp;

/* compiled from: ImShareItemClickAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface ImShareItemClickAnalyticsItem extends mwv.a {

    /* compiled from: ImShareItemClickAnalyticsItem.kt */
    public static final class ChatLinkFromProfile implements ImShareItemClickAnalyticsItem {
        public final Source a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImShareItemClickAnalyticsItem.kt */
        public static final class Source {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source BUTTON_SHARE_IN_MORE_LIST;
            public static final Source BUTTON_SHARE_IN_USER_ID;

            static {
                Source source = new Source("BUTTON_SHARE_IN_MORE_LIST", 0);
                BUTTON_SHARE_IN_MORE_LIST = source;
                Source source2 = new Source("BUTTON_SHARE_IN_USER_ID", 1);
                BUTTON_SHARE_IN_USER_ID = source2;
                Source[] sourceArr = {source, source2};
                $VALUES = sourceArr;
                $ENTRIES = new asp(sourceArr);
            }

            public Source() {
                throw null;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public ChatLinkFromProfile(Source source) {
            this.a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChatLinkFromProfile) && this.a == ((ChatLinkFromProfile) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChatLinkFromProfile(source=" + this.a + ')';
        }
    }
}
