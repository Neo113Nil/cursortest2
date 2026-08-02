package com.vk.im.reporters.api.analytics.click;

import xsna.asp;
import xsna.bh10;
import xsna.mwv;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ImPinClickAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface ImPinClickAnalyticsItem extends mwv.a {

    /* compiled from: ImPinClickAnalyticsItem.kt */
    public static final class PinnedMessage implements ImPinClickAnalyticsItem {
        public final ClickType a;
        public final ConversationType b;
        public final long c;
        public final int d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImPinClickAnalyticsItem.kt */
        public static final class ClickType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ClickType[] $VALUES;
            public static final ClickType PIN;
            public static final ClickType PINNED_VIEW;
            public static final ClickType UNPIN;

            static {
                ClickType clickType = new ClickType("PIN", 0);
                PIN = clickType;
                ClickType clickType2 = new ClickType("UNPIN", 1);
                UNPIN = clickType2;
                ClickType clickType3 = new ClickType("PINNED_VIEW", 2);
                PINNED_VIEW = clickType3;
                ClickType[] clickTypeArr = {clickType, clickType2, clickType3};
                $VALUES = clickTypeArr;
                $ENTRIES = new asp(clickTypeArr);
            }

            public ClickType() {
                throw null;
            }

            public static ClickType valueOf(String str) {
                return (ClickType) Enum.valueOf(ClickType.class, str);
            }

            public static ClickType[] values() {
                return (ClickType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImPinClickAnalyticsItem.kt */
        public static final class ConversationType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ConversationType[] $VALUES;
            public static final ConversationType CHANNEL;

            static {
                ConversationType conversationType = new ConversationType("CHANNEL", 0);
                CHANNEL = conversationType;
                ConversationType[] conversationTypeArr = {conversationType};
                $VALUES = conversationTypeArr;
                $ENTRIES = new asp(conversationTypeArr);
            }

            public ConversationType() {
                throw null;
            }

            public static ConversationType valueOf(String str) {
                return (ConversationType) Enum.valueOf(ConversationType.class, str);
            }

            public static ConversationType[] values() {
                return (ConversationType[]) $VALUES.clone();
            }
        }

        public PinnedMessage(ClickType clickType, ConversationType conversationType, long j, int i) {
            this.a = clickType;
            this.b = conversationType;
            this.c = j;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinnedMessage)) {
                return false;
            }
            PinnedMessage pinnedMessage = (PinnedMessage) obj;
            return this.a == pinnedMessage.a && this.b == pinnedMessage.b && this.c == pinnedMessage.c && this.d == pinnedMessage.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PinnedMessage(clickType=");
            sb.append(this.a);
            sb.append(", conversationType=");
            sb.append(this.b);
            sb.append(", conversationId=");
            sb.append(this.c);
            sb.append(", conversationMessageId=");
            return vu5.b(sb, this.d, ')');
        }
    }
}
