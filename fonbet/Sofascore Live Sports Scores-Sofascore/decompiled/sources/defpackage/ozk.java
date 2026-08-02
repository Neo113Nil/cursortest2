package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ozk {
    static {
        rik.x("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (pzk.a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
