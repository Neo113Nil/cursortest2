package com.vk.dto.notifications.settings;

import com.vk.core.serialize.Serializer;
import com.vk.dto.notifications.NotificationsGetResponse$NotificationsResponseItem;
import java.util.ArrayList;
import xsna.drm0;
import xsna.epx;
import xsna.p4g;

/* compiled from: NotificationSettingsCategory.kt */
/* loaded from: classes18.dex */
public final class NotificationSettingsCategory extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationSettingsCategory> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ArrayList<NotificationsSettingsConfig> i;
    public final int j;
    public final NotificationsGetResponse$NotificationsResponseItem k;
    public final String l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NotificationSettingsCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationSettingsCategory a(Serializer serializer) {
            return new NotificationSettingsCategory(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.j(NotificationsSettingsConfig.CREATOR), serializer.u(), (NotificationsGetResponse$NotificationsResponseItem) serializer.G(NotificationsGetResponse$NotificationsResponseItem.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationSettingsCategory[i];
        }
    }

    public NotificationSettingsCategory(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList<NotificationsSettingsConfig> arrayList, int i, NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem, String str8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = arrayList;
        this.j = i;
        this.k = notificationsGetResponse$NotificationsResponseItem;
        this.l = str8;
    }

    public final ArrayList<NotificationsSettingsConfig> Ab() {
        return this.i;
    }

    public final boolean Bb() {
        return "on".equals(this.h);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.o0(this.i);
        serializer.S(this.j);
        serializer.i0(this.k);
        serializer.j0(this.l);
    }

    public final boolean equals(Object obj) {
        int size;
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, NotificationSettingsCategory.class)) {
            return false;
        }
        NotificationSettingsCategory notificationSettingsCategory = (NotificationSettingsCategory) obj;
        if (!epx.f(this.b, notificationSettingsCategory.b) || !epx.f(this.c, notificationSettingsCategory.c) || !epx.f(this.d, notificationSettingsCategory.d) || !epx.f(this.e, notificationSettingsCategory.e) || !epx.f(this.f, notificationSettingsCategory.f) || !epx.f(this.g, notificationSettingsCategory.g) || !epx.f(this.h, notificationSettingsCategory.h)) {
            return false;
        }
        ArrayList<NotificationsSettingsConfig> arrayList = notificationSettingsCategory.i;
        p4g.a aVar = p4g.a;
        ArrayList<NotificationsSettingsConfig> arrayList2 = this.i;
        if (!epx.f(arrayList2, arrayList)) {
            if (arrayList2 != null && arrayList != null && arrayList.size() == (size = arrayList2.size())) {
                for (int i = 0; i < size; i++) {
                    if (epx.f(arrayList2.get(i), arrayList.get(i))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.h;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        p4g.a aVar = p4g.a;
        ArrayList<NotificationsSettingsConfig> arrayList = this.i;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 1;
            while (i < size) {
                NotificationsSettingsConfig notificationsSettingsConfig = arrayList.get(i);
                if (notificationsSettingsConfig != null) {
                    i2 = (i2 * 31) + notificationsSettingsConfig.hashCode();
                }
                i++;
            }
            i = i2;
        }
        return hashCode7 + i;
    }

    public final boolean zb() {
        String str = this.h;
        String str2 = this.g;
        return !(str2 == null || drm0.N(str2) || str == null || drm0.N(str)) || epx.f(str, "on");
    }
}
