package ru.ozon.push.sdk.internal.broadcast;

import Yg0.a;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kh0.C7680a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/push/sdk/internal/broadcast/AppUpdatedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppUpdatedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        boolean z11;
        NotificationManager notificationManager;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.d(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            try {
                Yg0.a.f35038y.getClass();
                z11 = a.C0652a.b().p().e().g();
            } catch (C7680a e11) {
                int i11 = sh0.b.f98783c;
                sh0.b.a("AppUpdatedBroadcastReceiver", null, e11, null, c.f97693b);
                z11 = false;
            }
            if (!z11 || (notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class)) == null) {
                return;
            }
            int length = notificationManager.getActiveNotifications().length;
            if (length > 0) {
                int i12 = sh0.b.f98783c;
                sh0.b.e("AppUpdatedBroadcastReceiver", null, Boolean.FALSE, new a(length));
            }
            try {
                notificationManager.cancelAll();
            } catch (Throwable th2) {
                int i13 = sh0.b.f98783c;
                sh0.b.a("AppUpdatedBroadcastReceiver", null, th2, null, b.f97692b);
            }
        }
    }
}
