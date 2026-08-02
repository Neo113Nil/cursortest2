package ru.ozon.fintech.notifications.domains.receivers;

import U7.d;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/notifications/domains/receivers/CopyBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CopyBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private static final String COPY_ACTION_SUFFIX = ".fintech.ACTION_COPY";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    private static final String OTP_CODE_KEY = "OTP_CODE_KEY";

    @NotNull
    private static final String TAG = "CopyBroadcastReceiver";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/fintech/notifications/domains/receivers/CopyBroadcastReceiver$Companion;", "", "<init>", "()V", "TAG", "", CopyBroadcastReceiver.OTP_CODE_KEY, "COPY_ACTION_SUFFIX", "getPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "otpCode", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        @Keep
        @NotNull
        public final PendingIntent getPendingIntent(@NotNull Context context, @NotNull String otpCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(otpCode, "otpCode");
            Intent intent = new Intent(d.e(context.getPackageName(), CopyBroadcastReceiver.COPY_ACTION_SUFFIX));
            intent.setComponent(new ComponentName(context, (Class<?>) CopyBroadcastReceiver.class));
            intent.putExtra(CopyBroadcastReceiver.OTP_CODE_KEY, otpCode);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, 67108864);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        private Companion() {
        }
    }

    @Keep
    @NotNull
    public static final PendingIntent getPendingIntent(@NotNull Context context, @NotNull String str) {
        return INSTANCE.getPendingIntent(context, str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        String stringExtra = intent.getStringExtra(OTP_CODE_KEY);
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("otp_code", stringExtra));
        Toast.makeText(context, context.getString(R.string.fintech_notification_code_copied, stringExtra), 0).show();
    }
}
