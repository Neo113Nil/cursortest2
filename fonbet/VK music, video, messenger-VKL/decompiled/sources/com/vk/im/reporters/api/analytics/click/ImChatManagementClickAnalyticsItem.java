package com.vk.im.reporters.api.analytics.click;

import xsna.asp;
import xsna.mwv;
import xsna.zrp;

/* compiled from: ImChatManagementClickAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface ImChatManagementClickAnalyticsItem extends mwv.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImChatManagementClickAnalyticsItem.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CHAT_LIST_LONGTAP;
        public static final Source CHAT_PROFILE;
        private final String value;

        static {
            Source source = new Source("CHAT_LIST_LONGTAP", 0, "chat_list_longtap");
            CHAT_LIST_LONGTAP = source;
            Source source2 = new Source("CHAT_PROFILE", 1, "chat_profile");
            CHAT_PROFILE = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source(String str, int i, String str2) {
            this.value = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: ImChatManagementClickAnalyticsItem.kt */
    public static final class a implements ImChatManagementClickAnalyticsItem {
        public final boolean a;
        public final Source b;

        public a(boolean z, Source source) {
            this.a = z;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        @Override // com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem
        public final Source t() {
            return this.b;
        }

        public final String toString() {
            return "ArchiveChat(isArchive=" + this.a + ", source=" + this.b + ')';
        }
    }

    /* compiled from: ImChatManagementClickAnalyticsItem.kt */
    public static final class b implements ImChatManagementClickAnalyticsItem {
        public final boolean a;
        public final Source b;

        public b(boolean z, Source source) {
            this.a = z;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        @Override // com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem
        public final Source t() {
            return this.b;
        }

        public final String toString() {
            return "PinChat(isPin=" + this.a + ", source=" + this.b + ')';
        }
    }

    /* compiled from: ImChatManagementClickAnalyticsItem.kt */
    public static final class c implements ImChatManagementClickAnalyticsItem {
        public final boolean a;
        public final Source b;

        public c(boolean z, Source source) {
            this.a = z;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        @Override // com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem
        public final Source t() {
            return this.b;
        }

        public final String toString() {
            return "SetChatAsRead(isRead=" + this.a + ", source=" + this.b + ')';
        }
    }

    Source t();
}
