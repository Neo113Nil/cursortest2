package ru.ozon.app.android.push.handlers;

import android.content.Context;
import android.content.Intent;
import eh0.b;
import i3.C7003a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/push/handlers/PartPaymentPushHandler;", "Leh0/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "sendBroadcastEvent", "Lru/ozon/push/sdk/external/service/RemoteMessage;", "message", "", "hasRegisteredNotificationChannel", "shouldHandle", "(Lru/ozon/push/sdk/external/service/RemoteMessage;Z)Z", "handle", "(Lru/ozon/push/sdk/external/service/RemoteMessage;)V", "Landroid/content/Context;", "Companion", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PartPaymentPushHandler implements b {

    @NotNull
    private final Context context;

    public PartPaymentPushHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void sendBroadcastEvent(Context context) {
        Intent intent = new Intent("ru.ozon.app.android.push.PART_PAYMENT_INTENT_ACTION");
        intent.putExtra("ru.ozon.app.android.push.PART_PAYMENT_NOTIFICATION_EXTRAS", 3516);
        C7003a.b(context).d(intent);
    }

    @Override // eh0.b
    public void handle(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        sendBroadcastEvent(this.context);
    }

    @Override // eh0.b
    public boolean shouldHandle(@NotNull RemoteMessage message, boolean hasRegisteredNotificationChannel) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.b().get("comm_id");
        Integer w02 = str != null ? h.w0(str) : null;
        return w02 != null && w02.intValue() == 184 && hasRegisteredNotificationChannel;
    }
}
