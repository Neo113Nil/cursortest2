package ru.ozon.app.android.cscore.orderlist.configurators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cscore/orderlist/configurators/OnTimeChangeReciever;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/Function0;", "onTimeUpdated", "Lkotlin/jvm/functions/Function0;", "getOnTimeUpdated", "()Lkotlin/jvm/functions/Function0;", "setOnTimeUpdated", "(Lkotlin/jvm/functions/Function0;)V", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnTimeChangeReciever extends BroadcastReceiver {
    private Function0<Unit> onTimeUpdated;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Function0<Unit> function0 = this.onTimeUpdated;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setOnTimeUpdated(Function0<Unit> function0) {
        this.onTimeUpdated = function0;
    }
}
