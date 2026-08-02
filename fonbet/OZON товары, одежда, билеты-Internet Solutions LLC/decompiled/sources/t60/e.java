package t60;

import C.J;
import U50.j;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class e implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99223a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f99224b;

    public e(@NotNull Context context, @NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f99223a = context;
        this.f99224b = fintechNavigation;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "request_channel";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context context = this.f99223a;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel("ozonBankId = 1") : null;
        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
            ((j) callback).invoke(new NativeResult.Error(J.b(notificationChannel != null ? Integer.valueOf(notificationChannel.getImportance()) : null, "channel importance: "), null, 2, null));
            return;
        }
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", "ozonBankId = 1");
        ((j) callback).invoke(new NativeResult.Success("true"));
        Activity c11 = this.f99224b.c();
        if (c11 != null) {
            c11.startActivity(intent);
        }
    }
}
