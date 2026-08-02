package com.vk.push.common.messaging;

import xsna.epx;

/* compiled from: NotificationPayload.kt */
/* loaded from: classes5.dex */
public final class NotificationPayload {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ClickActionType h;

    public NotificationPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, ClickActionType clickActionType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = clickActionType;
    }

    public static /* synthetic */ NotificationPayload copy$default(NotificationPayload notificationPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, ClickActionType clickActionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationPayload.a;
        }
        if ((i & 2) != 0) {
            str2 = notificationPayload.b;
        }
        if ((i & 4) != 0) {
            str3 = notificationPayload.c;
        }
        if ((i & 8) != 0) {
            str4 = notificationPayload.d;
        }
        if ((i & 16) != 0) {
            str5 = notificationPayload.e;
        }
        if ((i & 32) != 0) {
            str6 = notificationPayload.f;
        }
        if ((i & 64) != 0) {
            str7 = notificationPayload.g;
        }
        if ((i & 128) != 0) {
            clickActionType = notificationPayload.h;
        }
        String str8 = str7;
        ClickActionType clickActionType2 = clickActionType;
        String str9 = str5;
        String str10 = str6;
        return notificationPayload.copy(str, str2, str3, str4, str9, str10, str8, clickActionType2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final ClickActionType component8() {
        return this.h;
    }

    public final NotificationPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, ClickActionType clickActionType) {
        return new NotificationPayload(str, str2, str3, str4, str5, str6, str7, clickActionType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationPayload)) {
            return false;
        }
        NotificationPayload notificationPayload = (NotificationPayload) obj;
        return epx.f(this.a, notificationPayload.a) && epx.f(this.b, notificationPayload.b) && epx.f(this.c, notificationPayload.c) && epx.f(this.d, notificationPayload.d) && epx.f(this.e, notificationPayload.e) && epx.f(this.f, notificationPayload.f) && epx.f(this.g, notificationPayload.g) && this.h == notificationPayload.h;
    }

    public final String getBody() {
        return this.b;
    }

    public final String getChannelId() {
        return this.f;
    }

    public final String getClickAction() {
        return this.g;
    }

    public final ClickActionType getClickActionType() {
        return this.h;
    }

    public final String getColor() {
        return this.d;
    }

    public final String getIcon() {
        return this.c;
    }

    public final String getImage() {
        return this.e;
    }

    public final String getTitle() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClickActionType clickActionType = this.h;
        return hashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
    }

    public String toString() {
        return "NotificationPayload(title=" + this.a + ", body=" + this.b + ", icon=" + this.c + ", color=" + this.d + ", image=" + this.e + ", channelId=" + this.f + ", clickAction=" + this.g + ", clickActionType=" + this.h + ')';
    }
}
