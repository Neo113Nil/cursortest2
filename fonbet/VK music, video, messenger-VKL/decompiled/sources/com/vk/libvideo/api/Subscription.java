package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* compiled from: VideoSubscriptionRepository.kt */
/* loaded from: classes2.dex */
public interface Subscription {

    /* compiled from: VideoSubscriptionRepository.kt */
    public static final class Subscribed implements Subscription {
        public final Notifications a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoSubscriptionRepository.kt */
        public static final class Notifications {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Notifications[] $VALUES;
            public static final Notifications All;
            public static final Notifications None;
            public static final Notifications Preferred;

            static {
                Notifications notifications = new Notifications("All", 0);
                All = notifications;
                Notifications notifications2 = new Notifications("Preferred", 1);
                Preferred = notifications2;
                Notifications notifications3 = new Notifications("None", 2);
                None = notifications3;
                Notifications[] notificationsArr = {notifications, notifications2, notifications3};
                $VALUES = notificationsArr;
                $ENTRIES = new asp(notificationsArr);
            }

            public Notifications() {
                throw null;
            }

            public static Notifications valueOf(String str) {
                return (Notifications) Enum.valueOf(Notifications.class, str);
            }

            public static Notifications[] values() {
                return (Notifications[]) $VALUES.clone();
            }
        }

        public Subscribed(Notifications notifications) {
            this.a = notifications;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Subscribed) && this.a == ((Subscribed) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Subscribed(notificationsType=" + this.a + ')';
        }
    }

    /* compiled from: VideoSubscriptionRepository.kt */
    public static final class a implements Subscription {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 252304484;
        }

        public final String toString() {
            return "Unsubscribed";
        }
    }
}
