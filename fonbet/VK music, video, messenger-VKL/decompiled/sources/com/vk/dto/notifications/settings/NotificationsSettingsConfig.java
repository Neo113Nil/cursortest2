package com.vk.dto.notifications.settings;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.qey;
import xsna.qoy;

/* compiled from: NotificationsSettingsConfig.kt */
/* loaded from: classes18.dex */
public final class NotificationsSettingsConfig extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Boolean f;
    public static final qey g = new qey(19);
    public static final Serializer.c<NotificationsSettingsConfig> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NotificationsSettingsConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationsSettingsConfig a(Serializer serializer) {
            return new NotificationsSettingsConfig(serializer.H(), serializer.H(), serializer.H(), serializer.u() == 1, (Boolean) serializer.C());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationsSettingsConfig[i];
        }
    }

    public NotificationsSettingsConfig(String str, String str2, String str3, boolean z, Boolean bool) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e ? 1 : 0);
        serializer.g0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, NotificationsSettingsConfig.class)) {
            return false;
        }
        NotificationsSettingsConfig notificationsSettingsConfig = (NotificationsSettingsConfig) obj;
        return epx.f(this.b, notificationsSettingsConfig.b) && epx.f(this.c, notificationsSettingsConfig.c) && epx.f(this.d, notificationsSettingsConfig.d) && this.e == notificationsSettingsConfig.e && epx.f(this.f, notificationsSettingsConfig.f);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int b = qoy.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
        Boolean bool = this.f;
        return b + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean zb() {
        return this.e;
    }
}
