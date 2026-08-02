package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.a9x0;
import xsna.kpn0;
import xsna.m100;
import xsna.s3q0;
import xsna.z8x0;

/* loaded from: classes12.dex */
public class SystemAlarmService extends LifecycleService {
    public kpn0 c;
    public boolean d;

    static {
        m100.d("SystemAlarmService");
    }

    public final void a() {
        this.d = true;
        m100.c().getClass();
        int i = z8x0.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (a9x0.a) {
            linkedHashMap.putAll(a9x0.b);
            s3q0 s3q0Var = s3q0.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                m100.c().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        kpn0 kpn0Var = new kpn0(this);
        this.c = kpn0Var;
        if (kpn0Var.j != null) {
            m100.c().a(kpn0.l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            kpn0Var.j = this;
        }
        this.d = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d = true;
        kpn0 kpn0Var = this.c;
        kpn0Var.getClass();
        m100.c().getClass();
        kpn0Var.e.f(kpn0Var);
        kpn0Var.j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            m100.c().getClass();
            kpn0 kpn0Var = this.c;
            kpn0Var.getClass();
            m100.c().getClass();
            kpn0Var.e.f(kpn0Var);
            kpn0Var.j = null;
            kpn0 kpn0Var2 = new kpn0(this);
            this.c = kpn0Var2;
            if (kpn0Var2.j != null) {
                m100.c().a(kpn0.l, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                kpn0Var2.j = this;
            }
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.c.a(i2, intent);
        return 3;
    }
}
