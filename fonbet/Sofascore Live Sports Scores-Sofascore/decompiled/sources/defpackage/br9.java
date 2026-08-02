package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class br9 extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final z07 a;

    static {
        List j = b.j("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = j;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        c = intentFilter;
    }

    public br9(z07 z07Var) {
        this.a = z07Var;
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean a = b90.a.a(powerManager);
        if (Build.VERSION.SDK_INT >= 33) {
            a = a || i90.a.a(powerManager);
        }
        if (a) {
            this.a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (CollectionsKt.R(b, intent.getAction())) {
            a(context);
        }
    }
}
