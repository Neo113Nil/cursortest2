package ru.ozon.app.android.fresh.unsorted.liveActivity;

import Lm0.a;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import bh0.InterfaceC5666b;
import ch0.C5835a;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/FreshLiveActivityListener;", "Lbh0/b;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "notificationProvider", "", "widgetName", "liveActivityKey", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/push/sdk/external/liveactivity/model/LiveActivitySelector;", "selector", "Lch0/a;", "liveActivityUpdate", "", "onNewMessage", "(Lru/ozon/push/sdk/external/liveactivity/model/LiveActivitySelector;Lch0/a;)V", "Landroid/app/Application;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "Ljava/lang/String;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshLiveActivityListener implements InterfaceC5666b {

    @NotNull
    private final Application application;

    @NotNull
    private final String liveActivityKey;

    @NotNull
    private final LiveActivityNotificationProvider notificationProvider;

    @NotNull
    private final String widgetName;

    public FreshLiveActivityListener(@NotNull Application application, @NotNull LiveActivityNotificationProvider notificationProvider, @NotNull String widgetName, @NotNull String liveActivityKey) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(notificationProvider, "notificationProvider");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(liveActivityKey, "liveActivityKey");
        this.application = application;
        this.notificationProvider = notificationProvider;
        this.widgetName = widgetName;
        this.liveActivityKey = liveActivityKey;
    }

    @Override // bh0.InterfaceC5666b
    public void onDismiss(@NotNull LiveActivitySelector liveActivitySelector) {
        InterfaceC5666b.a.a(liveActivitySelector);
    }

    @Override // bh0.InterfaceC5666b
    public void onNewMessage(@NotNull LiveActivitySelector selector, @NotNull C5835a liveActivityUpdate) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(liveActivityUpdate, "liveActivityUpdate");
        Object systemService = this.application.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null || !Intrinsics.d(selector.getF97685a(), this.widgetName) || (str = selector.a().get(this.liveActivityKey)) == null) {
            return;
        }
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
        NotificationChannel notificationChannel = (NotificationChannel) C7714v.M(notificationChannels);
        if (notificationChannel == null || (str2 = notificationChannel.getId()) == null) {
            str2 = "miscellaneous";
        }
        if (liveActivityUpdate.c() == C5835a.EnumC0868a.END) {
            Date b11 = liveActivityUpdate.b();
            if ((b11 != null ? b11.getTime() : 0L) <= liveActivityUpdate.d().getTime()) {
                notificationManager.cancel(str.hashCode());
                return;
            }
        }
        try {
            notificationManager.notify(str.hashCode(), this.notificationProvider.provideNotification(liveActivityUpdate, str2));
        } catch (Exception e11) {
            a.f17149a.e(e11, "The liveActivity notification was not notified", new Object[0]);
        }
    }
}
