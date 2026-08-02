package com.vk.push.common.messaging;

import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.d;
import eb.EnumC6337a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/common/messaging/RemoteMessage;", "Landroid/os/Parcelable;", "CREATOR", "a", "b", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemoteMessage implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f60701a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60702b;

    /* renamed from: com.vk.push.common.messaging.RemoteMessage$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<RemoteMessage> {
        @Override // android.os.Parcelable.Creator
        public final RemoteMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage[] newArray(int i11) {
            return new RemoteMessage[i11];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final NotificationParams f60703a;

        public b(@NotNull NotificationParams notificationParams) {
            Intrinsics.checkNotNullParameter(notificationParams, "notificationParams");
            this.f60703a = notificationParams;
        }

        public final String a() {
            return this.f60703a.getF60695b();
        }

        public final String b() {
            return this.f60703a.getF60699f();
        }

        public final String c() {
            return this.f60703a.getF60700g();
        }

        public final String d() {
            return this.f60703a.getF60698e();
        }

        public final String e() {
            return this.f60703a.getF60697d();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f60703a, ((b) obj).f60703a);
        }

        public final Uri f() {
            NotificationParams notificationParams = this.f60703a;
            String f60696c = notificationParams.getF60696c();
            if (f60696c == null || f60696c.length() == 0) {
                return null;
            }
            return Uri.parse(notificationParams.getF60696c());
        }

        public final String g() {
            return this.f60703a.getF60694a();
        }

        public final int hashCode() {
            return this.f60703a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Notification(notificationParams=" + this.f60703a + ')';
        }
    }

    public RemoteMessage(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(RemoteMessage.class.getClassLoader());
        readBundle = readBundle == null ? d.a() : readBundle;
        Intrinsics.checkNotNullExpressionValue(readBundle, "parcel.readBundle(Remote…lassLoader) ?: bundleOf()");
        this.f60701a = readBundle;
        this.f60702b = k.b(new a(this));
    }

    public final EnumC6337a b() {
        String string = this.f60701a.getString("vkpns.click_action_type");
        if (string == null) {
            return null;
        }
        Object obj = EnumC6337a.DEFAULT;
        try {
            String upperCase = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Object valueOf = Enum.valueOf(EnumC6337a.class, upperCase);
            Intrinsics.checkNotNullExpressionValue(valueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
            obj = valueOf;
        } catch (IllegalArgumentException unused) {
        }
        return (EnumC6337a) obj;
    }

    public final String c() {
        return this.f60701a.getString("vk.collapse_key");
    }

    @NotNull
    public final Map<String, String> d() {
        return (Map) this.f60702b.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        String string = this.f60701a.getString("vk.from", "");
        Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(FROM, \"\")");
        return string;
    }

    public final String f() {
        return this.f60701a.getString("vk.message_id");
    }

    public final b g() {
        int i11 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f60701a;
        NotificationParams notificationParams = (NotificationParams) (i11 >= 33 ? bundle.getParcelable("vk.notification_params", NotificationParams.class) : bundle.getParcelable("vk.notification_params"));
        if (notificationParams == null) {
            return null;
        }
        return new b(notificationParams);
    }

    public final int h() {
        return this.f60701a.getInt("vk.priority", 0);
    }

    public final long i() {
        return this.f60701a.getLong("vk.push_message_server_received_at");
    }

    public final byte[] j() {
        return this.f60701a.getByteArray("vk.data_raw");
    }

    public final String k() {
        return this.f60701a.getString("vk.token");
    }

    public final int l() {
        return this.f60701a.getInt("vk.ttl", 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeBundle(this.f60701a);
    }
}
