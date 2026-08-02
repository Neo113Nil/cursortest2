package com.vk.push.common.messaging;

import com.vk.push.common.utils.StringExtensionsKt;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: NotificationAnalyticsPayload.kt */
/* loaded from: classes5.dex */
public final class NotificationAnalyticsPayload {
    public static final int CHARS_TO_CHECK = 10;
    public static final Companion Companion = new Companion(null);
    public final String a;
    public final String b;

    /* compiled from: NotificationAnalyticsPayload.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final NotificationAnalyticsPayload createSafe(String str, String str2) {
            String takeSafe = str != null ? StringExtensionsKt.takeSafe(str, 10) : null;
            if (takeSafe == null || str2 == null) {
                return null;
            }
            return new NotificationAnalyticsPayload(takeSafe, str2);
        }

        public final NotificationAnalyticsPayload toNotificationAnalyticsPayload(RemoteMessage remoteMessage) {
            return createSafe(remoteMessage.getToken(), remoteMessage.getMessageId());
        }

        public Companion() {
        }
    }

    public NotificationAnalyticsPayload(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ NotificationAnalyticsPayload copy$default(NotificationAnalyticsPayload notificationAnalyticsPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationAnalyticsPayload.a;
        }
        if ((i & 2) != 0) {
            str2 = notificationAnalyticsPayload.b;
        }
        return notificationAnalyticsPayload.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final NotificationAnalyticsPayload copy(String str, String str2) {
        return new NotificationAnalyticsPayload(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationAnalyticsPayload)) {
            return false;
        }
        NotificationAnalyticsPayload notificationAnalyticsPayload = (NotificationAnalyticsPayload) obj;
        return epx.f(this.a, notificationAnalyticsPayload.a) && epx.f(this.b, notificationAnalyticsPayload.b);
    }

    public final String getMessageId() {
        return this.b;
    }

    public final String getPushTokenPart() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NotificationAnalyticsPayload(pushTokenPart=");
        sb.append(this.a);
        sb.append(", messageId=");
        return ho8.a(sb, this.b, ')');
    }
}
