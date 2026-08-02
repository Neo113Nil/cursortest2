package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import xsna.dwx0;
import xsna.m100;
import xsna.z790;

/* loaded from: classes12.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public class a implements Runnable {
        public final /* synthetic */ Intent b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ BroadcastReceiver.PendingResult d;

        public a(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.b = intent;
            this.c = context;
            this.d = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.d;
            Context context = this.c;
            Intent intent = this.b;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m100 c = m100.c();
                int i = ConstraintProxyUpdateReceiver.a;
                c.getClass();
                z790.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                z790.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                z790.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                z790.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        m100.d("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            dwx0.h(context).d.b(new a(goAsync(), context, intent));
        } else {
            m100.c().getClass();
        }
    }
}
