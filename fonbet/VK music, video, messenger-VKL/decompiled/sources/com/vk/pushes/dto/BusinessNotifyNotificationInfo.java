package com.vk.pushes.dto;

import com.vk.core.serialize.Serializer;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import java.util.List;

/* compiled from: BusinessNotifyNotificationInfo.kt */
/* loaded from: classes5.dex */
public final class BusinessNotifyNotificationInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BusinessNotifyNotificationInfo> CREATOR = new a();
    public final BusinessNotifyNotification.BusinessNotifyNotificationContainer b;
    public final String c;
    public final List<PushBusinessNotify> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BusinessNotifyNotificationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BusinessNotifyNotificationInfo a(Serializer serializer) {
            return new BusinessNotifyNotificationInfo((BusinessNotifyNotification.BusinessNotifyNotificationContainer) serializer.G(BusinessNotifyNotificationInfo.class.getClassLoader()), serializer.H(), serializer.j(PushBusinessNotify.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BusinessNotifyNotificationInfo[i];
        }
    }

    public BusinessNotifyNotificationInfo(BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer, String str, List<PushBusinessNotify> list) {
        this.b = businessNotifyNotificationContainer;
        this.c = str;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
    }
}
