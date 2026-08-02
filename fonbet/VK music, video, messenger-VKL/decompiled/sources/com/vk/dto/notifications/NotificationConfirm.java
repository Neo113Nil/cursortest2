package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: NotificationConfirm.kt */
/* loaded from: classes18.dex */
public final class NotificationConfirm extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationConfirm> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NotificationConfirm> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationConfirm a(Serializer serializer) {
            return new NotificationConfirm(serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationConfirm[i];
        }
    }

    public NotificationConfirm(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationConfirm)) {
            return false;
        }
        NotificationConfirm notificationConfirm = (NotificationConfirm) obj;
        return epx.f(this.b, notificationConfirm.b) && epx.f(this.c, notificationConfirm.c) && epx.f(this.d, notificationConfirm.d) && epx.f(this.e, notificationConfirm.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationConfirm(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", okLabel=");
        sb.append(this.d);
        sb.append(", cancelLabel=");
        return ho8.a(sb, this.e, ')');
    }
}
