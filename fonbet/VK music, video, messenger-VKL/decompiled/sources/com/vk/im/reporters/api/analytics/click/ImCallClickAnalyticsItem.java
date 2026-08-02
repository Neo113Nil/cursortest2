package com.vk.im.reporters.api.analytics.click;

import defpackage.q0;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.mwv;
import xsna.zrp;

/* compiled from: ImCallClickAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface ImCallClickAnalyticsItem extends mwv.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class ConversationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConversationType[] $VALUES;
        public static final ConversationType AUDIO;
        public static final ConversationType MAX;
        public static final ConversationType VIDEO;

        static {
            ConversationType conversationType = new ConversationType(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
            AUDIO = conversationType;
            ConversationType conversationType2 = new ConversationType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = conversationType2;
            ConversationType conversationType3 = new ConversationType("MAX", 2);
            MAX = conversationType3;
            ConversationType[] conversationTypeArr = {conversationType, conversationType2, conversationType3};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source IM_TOOLBAR;

        static {
            Source source = new Source("IM_TOOLBAR", 0);
            IM_TOOLBAR = source;
            Source[] sourceArr = {source};
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

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class a implements ImCallClickAnalyticsItem {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1061966987;
        }

        public final String toString() {
            return "CallBySystemPhone";
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class b implements ImCallClickAnalyticsItem {
        public final ImCallTypeAnalyticsItem a;

        public b(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
            this.a = imCallTypeAnalyticsItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CallFromChatProfile(callType=" + this.a + ')';
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class c implements ImCallClickAnalyticsItem {
        public final ImCallTypeAnalyticsItem a;
        public final boolean b;

        public c(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem, boolean z) {
            this.a = imCallTypeAnalyticsItem;
            this.b = z;
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
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallFromChatProfileWithChoose(callType=");
            sb.append(this.a);
            sb.append(", isVideo=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class d implements ImCallClickAnalyticsItem {
        public final ConversationType a;
        public final ImCallTypeAnalyticsItem b;

        public d(ConversationType conversationType, ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
            this.a = conversationType;
            this.b = imCallTypeAnalyticsItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CallFromChatToolbar(conversationType=" + this.a + ", callType=" + this.b + ')';
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class e implements ImCallClickAnalyticsItem {
        public final ImCallTypeAnalyticsItem a;

        public e(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
            this.a = imCallTypeAnalyticsItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "JoinToCallFromChatMessage(callType=" + this.a + ')';
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class f implements ImCallClickAnalyticsItem {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1540327169;
        }

        public final String toString() {
            return "MissedCallSettingsSnippetInChat";
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class g implements ImCallClickAnalyticsItem {
        public final Source a;

        public g(Source source) {
            this.a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCallServices(source=" + this.a + ')';
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class h implements ImCallClickAnalyticsItem {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1020539522;
        }

        public final String toString() {
            return "OpenPrivacySettings";
        }
    }

    /* compiled from: ImCallClickAnalyticsItem.kt */
    public static final class i implements ImCallClickAnalyticsItem {
        public final ImCallTypeAnalyticsItem a;

        public i(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
            this.a = imCallTypeAnalyticsItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowMenuFromChatToolbar(callType=" + this.a + ')';
        }
    }
}
