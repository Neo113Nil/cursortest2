package com.vk.libvideo.autoplay.background.service;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.vk.core.service.BoundService;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import xsna.gzs;
import xsna.q7s;
import xsna.y4s0;

/* compiled from: VideoBackgroundService.kt */
/* loaded from: classes2.dex */
public final class VideoBackgroundService extends BoundService {
    public final q7s d = new q7s();
    public y4s0 e;
    public PowerManager.WakeLock f;

    public final void k() {
        PowerManager.WakeLock wakeLock = this.f;
        PowerManager.WakeLock wakeLock2 = null;
        if (wakeLock == null) {
            wakeLock = null;
        }
        if (wakeLock.isHeld()) {
            try {
                PowerManager.WakeLock wakeLock3 = this.f;
                if (wakeLock3 != null) {
                    wakeLock2 = wakeLock3;
                }
                wakeLock2.release();
            } catch (Throwable th) {
                L.i(th);
            }
        }
    }

    public final boolean l(int i, Notification notification, gzs<Boolean> gzsVar) {
        PowerManager.WakeLock wakeLock = this.f;
        PowerManager.WakeLock wakeLock2 = null;
        if (wakeLock == null) {
            wakeLock = null;
        }
        if (!wakeLock.isHeld()) {
            try {
                PowerManager.WakeLock wakeLock3 = this.f;
                if (wakeLock3 != null) {
                    wakeLock2 = wakeLock3;
                }
                wakeLock2.acquire();
            } catch (Throwable th) {
                L.i(th);
            }
        }
        if (!gzsVar.invoke().booleanValue()) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(i, notification, 2);
                return true;
            }
            startForeground(i, notification);
            return true;
        } catch (Exception e) {
            b.a.a(e);
            return false;
        }
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.d.getClass();
        q7s.a("VideoBackgroundService");
        this.f = ((PowerManager) getSystemService("power")).newWakeLock(1, "VideoBackgroundService");
        h();
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        y4s0 y4s0Var = this.e;
        if (y4s0Var != null) {
            y4s0Var.onTaskRemoved();
        }
    }
}
