package com.vk.clips.sdk.shared.feed.analytics;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;
import xsna.asp;
import xsna.bh10;
import xsna.cq;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: ClipViewerAnalyticsEvent.kt */
/* loaded from: classes17.dex */
public interface ClipViewerAnalyticsEvent {

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class FloatingButtonEvent implements ClipViewerAnalyticsEvent {
        public final String a;
        public final EventType b;
        public final a c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class EventType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EventType[] $VALUES;
            public static final EventType BUTTON_CLICK;
            public static final EventType BUTTON_CLOSE;
            public static final EventType BUTTON_SHOW;
            public static final EventType MODAL_CARD_CTA_BUTTON_CLICK;

            static {
                EventType eventType = new EventType("BUTTON_SHOW", 0);
                BUTTON_SHOW = eventType;
                EventType eventType2 = new EventType("BUTTON_CLICK", 1);
                BUTTON_CLICK = eventType2;
                EventType eventType3 = new EventType("BUTTON_CLOSE", 2);
                BUTTON_CLOSE = eventType3;
                EventType eventType4 = new EventType("MODAL_CARD_CTA_BUTTON_CLICK", 3);
                MODAL_CARD_CTA_BUTTON_CLICK = eventType4;
                EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
                $VALUES = eventTypeArr;
                $ENTRIES = new asp(eventTypeArr);
            }

            public EventType() {
                throw null;
            }

            public static EventType valueOf(String str) {
                return (EventType) Enum.valueOf(EventType.class, str);
            }

            public static EventType[] values() {
                return (EventType[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class a {
            public final int a;
            public final long b;
            public final String c;

            public a(int i, long j, String str) {
                this.a = i;
                this.b = j;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VideoParamsModel(videoId=");
                sb.append(this.a);
                sb.append(", videoOwnerId=");
                sb.append(this.b);
                sb.append(", videoTrackCode=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public FloatingButtonEvent(String str, EventType eventType, a aVar) {
            this.a = str;
            this.b = eventType;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FloatingButtonEvent)) {
                return false;
            }
            FloatingButtonEvent floatingButtonEvent = (FloatingButtonEvent) obj;
            return epx.f(this.a, floatingButtonEvent.a) && this.b == floatingButtonEvent.b && epx.f(this.c, floatingButtonEvent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FloatingButtonEvent(buttonId=" + this.a + ", eventType=" + this.b + ", videoParamsModel=" + this.c + ')';
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public interface a extends ClipViewerAnalyticsEvent {

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        /* renamed from: com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent$a$a, reason: collision with other inner class name */
        public static final class C0641a implements a {
            public final SdkClipVideoFile a;

            public C0641a(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.a
            public final SdkClipVideoFile a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0641a) && epx.f(this.a, ((C0641a) obj).a);
            }

            public final int hashCode() {
                SdkClipVideoFile sdkClipVideoFile = this.a;
                if (sdkClipVideoFile == null) {
                    return 0;
                }
                return sdkClipVideoFile.hashCode();
            }

            public final String toString() {
                return cq.d(new StringBuilder("Manual(clip="), this.a, ')');
            }
        }

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class b implements a {
            public final SdkClipVideoFile a;

            public b(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.a
            public final SdkClipVideoFile a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return cq.d(new StringBuilder("Toggle(clip="), this.a, ')');
            }
        }

        SdkClipVideoFile a();
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public interface b extends ClipViewerAnalyticsEvent {

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class a implements b {
            public final SdkClipVideoFile a;

            public a(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.b
            public final SdkClipVideoFile a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return cq.d(new StringBuilder("Disabled(clip="), this.a, ')');
            }
        }

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        /* renamed from: com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent$b$b, reason: collision with other inner class name */
        public static final class C0642b implements b {
            public final SdkClipVideoFile a;

            public C0642b(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.b
            public final SdkClipVideoFile a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0642b) && epx.f(this.a, ((C0642b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return cq.d(new StringBuilder("Enabled(clip="), this.a, ')');
            }
        }

        SdkClipVideoFile a();
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class c implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;
        public final SdkClipActivity.Comments b;

        public c(SdkClipVideoFile sdkClipVideoFile, SdkClipActivity.Comments comments) {
            this.a = sdkClipVideoFile;
            this.b = comments;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FriendCommentActivitiesShown(clip=" + this.a + ", comments=" + this.b + ')';
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class d implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;
        public final SdkClipActivity.Likes b;

        public d(SdkClipVideoFile sdkClipVideoFile, SdkClipActivity.Likes likes) {
            this.a = sdkClipVideoFile;
            this.b = likes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FriendsLikesActivitiesShown(clip=" + this.a + ", likes=" + this.b + ')';
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class e implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;

        public e(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("GoToVideoButtonShown(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class f implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;

        public f(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("NewsMonothemeBadgeClicked(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class g implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;

        public g(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("NewsMonothemeBadgeShown(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public interface h extends ClipViewerAnalyticsEvent {

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class a implements h {
            public final SdkVideoFile a;

            public a(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.h
            public final SdkVideoFile k() {
                return this.a;
            }

            public final String toString() {
                return "IsSubscribed(video=" + this.a + ')';
            }
        }

        /* compiled from: ClipViewerAnalyticsEvent.kt */
        public static final class b implements h {
            public final SdkVideoFile a;

            public b(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent.h
            public final SdkVideoFile k() {
                return this.a;
            }

            public final String toString() {
                return "IsUnsubscribed(video=" + this.a + ')';
            }
        }

        SdkVideoFile k();
    }

    /* compiled from: ClipViewerAnalyticsEvent.kt */
    public static final class i implements ClipViewerAnalyticsEvent {
        public final SdkClipVideoFile a;

        public i(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("ShopsMoreButtonShown(clip="), this.a, ')');
        }
    }
}
