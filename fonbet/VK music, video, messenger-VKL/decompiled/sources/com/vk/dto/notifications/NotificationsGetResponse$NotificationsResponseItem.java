package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import xsna.epx;

/* compiled from: NotificationsGetResponse.kt */
/* loaded from: classes18.dex */
public final class NotificationsGetResponse$NotificationsResponseItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationsGetResponse$NotificationsResponseItem> CREATOR = new a();
    public final NotificationItem b;
    public final FriendRequestsItem c;
    public final Boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NotificationsGetResponse$NotificationsResponseItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationsGetResponse$NotificationsResponseItem a(Serializer serializer) {
            return new NotificationsGetResponse$NotificationsResponseItem((NotificationItem) serializer.G(NotificationItem.class.getClassLoader()), (FriendRequestsItem) serializer.G(FriendRequestsItem.class.getClassLoader()), (Boolean) serializer.C());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationsGetResponse$NotificationsResponseItem[i];
        }
    }

    public NotificationsGetResponse$NotificationsResponseItem(NotificationItem notificationItem, FriendRequestsItem friendRequestsItem, Boolean bool) {
        this.b = notificationItem;
        this.c = friendRequestsItem;
        this.d = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.g0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, NotificationsGetResponse$NotificationsResponseItem.class)) {
            return false;
        }
        NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) obj;
        return epx.f(this.b, notificationsGetResponse$NotificationsResponseItem.b) && epx.f(this.c, notificationsGetResponse$NotificationsResponseItem.c) && epx.f(this.d, notificationsGetResponse$NotificationsResponseItem.d);
    }

    public final int hashCode() {
        NotificationItem notificationItem = this.b;
        int hashCode = (notificationItem != null ? notificationItem.hashCode() : 0) * 31;
        FriendRequestsItem friendRequestsItem = this.c;
        int hashCode2 = (hashCode + (friendRequestsItem != null ? friendRequestsItem.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsResponseItem(notificationItem=" + this.b + ", friendRequestsItem=" + this.c + ')';
    }
}
