package t60;

import U50.j;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: t60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9773a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99219a;

    public C9773a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f99219a = context;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_channel_status";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationManager notificationManager = (NotificationManager) this.f99219a.getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel("ozonBankId = 1") : null;
        ((j) callback).invoke(new NativeResult.Success(String.valueOf(notificationChannel == null || notificationChannel.getImportance() != 0)));
    }
}
