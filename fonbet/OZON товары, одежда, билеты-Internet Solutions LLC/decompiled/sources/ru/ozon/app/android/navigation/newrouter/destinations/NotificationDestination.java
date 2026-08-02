package ru.ozon.app.android.navigation.newrouter.destinations;

import EZ.a;
import android.app.Notification;
import android.app.NotificationChannel;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.newrouter.navigators.NotificationNavigationHandler;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/destinations/NotificationDestination;", "LpZ/f;", "Landroid/app/Notification;", "notification", "", "id", "", "tag", "Landroid/app/NotificationChannel;", AppsFlyerProperties.CHANNEL, "<init>", "(Landroid/app/Notification;ILjava/lang/String;Landroid/app/NotificationChannel;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "I", "getId", "Ljava/lang/String;", "getTag", "Landroid/app/NotificationChannel;", "getChannel", "()Landroid/app/NotificationChannel;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class NotificationDestination extends f {
    private final NotificationChannel channel;
    private final int id;

    @NotNull
    private final d<? extends a<?>> navigator;

    @NotNull
    private final Notification notification;
    private final String tag;

    public NotificationDestination(@NotNull Notification notification, int i11, String str, NotificationChannel notificationChannel) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
        this.id = i11;
        this.tag = str;
        this.channel = notificationChannel;
        this.navigator = N.b(NotificationNavigationHandler.class);
    }

    @Override // pZ.f
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.navigation.newrouter.destinations.NotificationDestination");
        NotificationDestination notificationDestination = (NotificationDestination) other;
        return Intrinsics.d(this.notification, notificationDestination.notification) && this.id == notificationDestination.id && Intrinsics.d(this.tag, notificationDestination.tag) && Intrinsics.d(this.channel, notificationDestination.channel) && Intrinsics.d(getNavigator(), notificationDestination.getNavigator());
    }

    public final NotificationChannel getChannel() {
        return this.channel;
    }

    public final int getId() {
        return this.id;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final Notification getNotification() {
        return this.notification;
    }

    public final String getTag() {
        return this.tag;
    }

    @Override // pZ.f
    public int hashCode() {
        int hashCode = (((this.notification.hashCode() + (super.hashCode() * 31)) * 31) + this.id) * 31;
        String str = this.tag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        NotificationChannel notificationChannel = this.channel;
        return getNavigator().hashCode() + ((hashCode2 + (notificationChannel != null ? notificationChannel.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "NotificationDestination(notification=" + this.notification + ", id=" + this.id + ", tag=" + this.tag + ", channel=" + this.channel + ", navigator=" + getNavigator() + ")";
    }
}
