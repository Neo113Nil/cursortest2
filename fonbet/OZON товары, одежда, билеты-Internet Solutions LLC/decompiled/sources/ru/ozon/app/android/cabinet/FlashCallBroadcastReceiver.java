package ru.ozon.app.android.cabinet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0002\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cabinet/FlashCallBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "onReceive", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnReceive", "()Lkotlin/jvm/functions/Function1;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlashCallBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private final Function1<String, Unit> onReceive;

    /* JADX WARN: Multi-variable type inference failed */
    public FlashCallBroadcastReceiver(@NotNull Function1<? super String, Unit> onReceive) {
        Intrinsics.checkNotNullParameter(onReceive, "onReceive");
        this.onReceive = onReceive;
    }

    @NotNull
    public final Function1<String, Unit> getOnReceive() {
        return this.onReceive;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Executor mainExecutor;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object systemService = context.getSystemService("phone");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (Build.VERSION.SDK_INT < 31) {
            telephonyManager.listen(new PhoneStateListener() { // from class: ru.ozon.app.android.cabinet.FlashCallBroadcastReceiver$onReceive$2
                @Override // android.telephony.PhoneStateListener
                public void onCallStateChanged(int state, String phoneNumber) {
                    FlashCallBroadcastReceiver.this.getOnReceive().invoke(phoneNumber);
                }
            }, 32);
        } else {
            mainExecutor = context.getMainExecutor();
            telephonyManager.registerTelephonyCallback(mainExecutor, new FlashCallBroadcastReceiver$onReceive$1(intent, this));
        }
    }
}
