package com.vk.push.common.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.j5g;
import xsna.pn00;
import xsna.yfb;
import xsna.zcl;

/* compiled from: RemoteMessage.kt */
/* loaded from: classes5.dex */
public final class RemoteMessage implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final Bundle b;
    public final bpn0 c;

    /* compiled from: RemoteMessage.kt */
    public static final class Builder {
        public byte[] b;
        public String c;
        public String d;
        public int e;
        public NotificationParams h;
        public long i;
        public String k;
        public String l;
        public final LinkedHashMap a = new LinkedHashMap();
        public Integer f = 0;
        public String g = "";
        public String j = "";

        public final Builder addData(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public final RemoteMessage build() {
            Bundle bundle = new Bundle();
            String str = this.c;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bundle.putString("vk.message_id", str);
            bundle.putString("vk.collapse_key", this.d);
            bundle.putInt("vk.priority", this.e);
            Integer num = this.f;
            if (num != null) {
                bundle.putInt("vk.ttl", num.intValue());
            }
            bundle.putString("vk.from", this.g);
            LinkedHashMap linkedHashMap = this.a;
            bundle.putStringArrayList("vk.data_key", new ArrayList<>(linkedHashMap.keySet()));
            bundle.putStringArrayList("vk.data_value", new ArrayList<>(linkedHashMap.values()));
            bundle.putByteArray("vk.data_raw", this.b);
            bundle.putString("vkpns.click_action_type", this.k);
            bundle.putParcelable("vk.notification_params", this.h);
            bundle.putLong("vk.push_message_server_received_at", this.i);
            bundle.putString("vk.token", this.j);
            String str2 = this.l;
            if (str2 != null) {
                bundle.putString("vk.received_by", str2);
            }
            return new RemoteMessage(bundle, null);
        }

        public final Builder clearData() {
            this.a.clear();
            return this;
        }

        public final Builder setClickActionType(String str) {
            this.k = str;
            return this;
        }

        public final Builder setCollapseKey(String str) {
            this.d = str;
            return this;
        }

        public final Builder setData(Map<String, String> map) {
            LinkedHashMap linkedHashMap = this.a;
            linkedHashMap.clear();
            linkedHashMap.putAll(map);
            return this;
        }

        public final Builder setFrom(String str) {
            this.g = str;
            return this;
        }

        public final Builder setMessageId(String str) {
            this.c = str;
            return this;
        }

        public final Builder setNotificationParams(NotificationParams notificationParams) {
            this.h = notificationParams;
            return this;
        }

        public final Builder setPriority(int i) {
            this.e = i;
            return this;
        }

        public final Builder setPushMessageServerReceivedAt(long j) {
            this.i = j;
            return this;
        }

        public final Builder setRawData(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public final Builder setReceivedBy(String str) {
            this.l = str;
            return this;
        }

        public final Builder setToken(String str) {
            this.j = str;
            return this;
        }

        public final Builder setTtl(Integer num) {
            this.f = num;
            return this;
        }
    }

    /* compiled from: RemoteMessage.kt */
    public static final class CREATOR implements Parcelable.Creator<RemoteMessage> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteMessage[] newArray(int i) {
            return new RemoteMessage[i];
        }
    }

    /* compiled from: RemoteMessage.kt */
    public static final class Notification {
        public final NotificationParams a;

        public Notification(NotificationParams notificationParams) {
            this.a = notificationParams;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, NotificationParams notificationParams, int i, Object obj) {
            if ((i & 1) != 0) {
                notificationParams = notification.a;
            }
            return notification.copy(notificationParams);
        }

        public final Notification copy(NotificationParams notificationParams) {
            return new Notification(notificationParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Notification) && epx.f(this.a, ((Notification) obj).a);
        }

        public final String getBody() {
            return this.a.getBody();
        }

        public final String getChannelId() {
            return this.a.getChannelId();
        }

        public final String getClickAction() {
            return this.a.getClickAction();
        }

        public final String getColor() {
            return this.a.getColor();
        }

        public final String getIcon() {
            return this.a.getIcon();
        }

        public final Uri getImageUrl() {
            NotificationParams notificationParams = this.a;
            String imageUrl = notificationParams.getImageUrl();
            if (imageUrl == null || imageUrl.length() == 0) {
                return null;
            }
            return Uri.parse(notificationParams.getImageUrl());
        }

        public final String getTitle() {
            return this.a.getTitle();
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Notification(notificationParams=" + this.a + ')';
        }
    }

    /* compiled from: RemoteMessage.kt */
    public static final class a extends Lambda implements gzs<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Map<String, ? extends String> invoke() {
            Iterable stringArrayList = RemoteMessage.this.b.getStringArrayList("vk.data_key");
            if (stringArrayList == null) {
                stringArrayList = EmptyList.b;
            }
            Iterable stringArrayList2 = RemoteMessage.this.b.getStringArrayList("vk.data_value");
            if (stringArrayList2 == null) {
                stringArrayList2 = EmptyList.b;
            }
            return pn00.s(j5g.X0(stringArrayList, stringArrayList2));
        }
    }

    public /* synthetic */ RemoteMessage(Bundle bundle, zcl zclVar) {
        this(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ClickActionType getClickActionType() {
        String string = this.b.getString("vkpns.click_action_type");
        if (string == null) {
            return null;
        }
        Enum r1 = ClickActionType.DEFAULT;
        try {
            r1 = Enum.valueOf(ClickActionType.class, string.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
        }
        return (ClickActionType) r1;
    }

    public final String getCollapseKey() {
        return this.b.getString("vk.collapse_key");
    }

    public final Map<String, String> getData() {
        return (Map) this.c.getValue();
    }

    public final String getFrom() {
        return this.b.getString("vk.from", "");
    }

    public final String getMessageId() {
        return this.b.getString("vk.message_id");
    }

    public final Notification getNotification() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.b;
        NotificationParams notificationParams = (NotificationParams) (i >= 33 ? bundle.getParcelable("vk.notification_params", NotificationParams.class) : bundle.getParcelable("vk.notification_params"));
        if (notificationParams == null) {
            return null;
        }
        return new Notification(notificationParams);
    }

    public final int getPriority() {
        return this.b.getInt("vk.priority", 0);
    }

    public final long getPushMessageServerReceivedAt() {
        return this.b.getLong("vk.push_message_server_received_at");
    }

    public final byte[] getRawData() {
        return this.b.getByteArray("vk.data_raw");
    }

    public final String getReceivedBy() {
        return this.b.getString("vk.received_by");
    }

    public final String getToken() {
        return this.b.getString("vk.token");
    }

    public final int getTtl() {
        return this.b.getInt("vk.ttl", 0);
    }

    public final void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.b);
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.b);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public RemoteMessage(Bundle bundle) {
        this.b = bundle;
        this.c = new bpn0(new a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteMessage(Parcel parcel) {
        this(r2 == null ? yfb.a() : r2);
        Bundle readBundle = parcel.readBundle(RemoteMessage.class.getClassLoader());
    }
}
