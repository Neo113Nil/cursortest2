package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.internal.ads.zzeh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nzk {
    public final Context a;
    public PowerManager.WakeLock b;

    public synchronized void a(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (this.b == null) {
                if (this.a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    tgj.d0("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
                if (powerManager == null) {
                    tgj.d0("PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.b = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public synchronized void b(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (this.b == null) {
                Context context = this.a;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    zzeh.c("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    zzeh.c("PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.b = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
