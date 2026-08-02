package com.vk.libvideo.api.minimizable;

import defpackage.q0;
import xsna.acb0;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.uqi;
import xsna.zrp;

/* compiled from: VideoDiscoveryActionsTracker.kt */
/* loaded from: classes2.dex */
public interface DiscoveryAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;
        public static final EventSource ACTION_MENU;
        public static final EventSource BUTTON;
        public static final EventSource SETTINGS_MENU;

        static {
            EventSource eventSource = new EventSource("BUTTON", 0);
            BUTTON = eventSource;
            EventSource eventSource2 = new EventSource("ACTION_MENU", 1);
            ACTION_MENU = eventSource2;
            EventSource eventSource3 = new EventSource("SETTINGS_MENU", 2);
            SETTINGS_MENU = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        public EventSource() {
            throw null;
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class a implements DiscoveryAction {
        public final EventSource a;

        public a(EventSource eventSource) {
            this.a = eventSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Add(eventSource=" + this.a + ')';
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class b implements DiscoveryAction {
        public final Integer a;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("Cast(videoPositionSec="), this.a, ')');
        }

        public b(Integer num) {
            this.a = num;
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class c implements DiscoveryAction {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -426478487;
        }

        public final String toString() {
            return "Comments";
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class d implements DiscoveryAction {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 555033387;
        }

        public final String toString() {
            return "DescriptionModalShown";
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class e implements DiscoveryAction {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -457009075;
        }

        public final String toString() {
            return "Episodes";
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class f implements DiscoveryAction {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -251737972;
        }

        public final String toString() {
            return "Like";
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class g implements DiscoveryAction {
        public final boolean a;
        public final EventSource b;

        public g(boolean z, EventSource eventSource) {
            this.a = z;
            this.b = eventSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "PlayNextVideo(isActive=" + this.a + ", eventSource=" + this.b + ')';
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public interface h extends DiscoveryAction {

        /* compiled from: VideoDiscoveryActionsTracker.kt */
        public static final class a implements h {
            public final acb0 a;

            public a(acb0 acb0Var) {
                this.a = acb0Var;
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
                return "ClickOnSeason(params=" + this.a + ')';
            }
        }

        /* compiled from: VideoDiscoveryActionsTracker.kt */
        public static final class b implements h {
            public final acb0 a;

            public b(acb0 acb0Var) {
                this.a = acb0Var;
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
                return "OpenPlaylist(params=" + this.a + ')';
            }
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class i implements DiscoveryAction {
        public final boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Scale(isScaled="), this.a, ')');
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class j implements DiscoveryAction {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1610568344;
        }

        public final String toString() {
            return "Settings";
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class k implements DiscoveryAction {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TabClick(tabId="), this.a, ')');
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class l implements DiscoveryAction {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TabShown(tabId="), this.a, ')');
        }
    }

    /* compiled from: VideoDiscoveryActionsTracker.kt */
    public static final class m implements DiscoveryAction {
        public final EventSource a;

        public m(EventSource eventSource) {
            this.a = eventSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WatchLater(eventSource=" + this.a + ')';
        }
    }
}
