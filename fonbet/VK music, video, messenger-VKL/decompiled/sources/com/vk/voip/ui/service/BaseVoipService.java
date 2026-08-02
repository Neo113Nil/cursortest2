package com.vk.voip.ui.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.permission.PermissionHelper;
import com.vk.voip.ui.service.BaseVoipService;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.a201;
import xsna.b25;
import xsna.bpn0;
import xsna.e1x0;
import xsna.j5g;
import xsna.lj70;
import xsna.msy;
import xsna.o25;
import xsna.px0;
import xsna.q7s;
import xsna.qjl;
import xsna.sd;
import xsna.uqi;
import xsna.w8i;
import xsna.ws6;
import xsna.xs6;

/* compiled from: BaseVoipService.kt */
/* loaded from: classes7.dex */
public abstract class BaseVoipService extends Service implements w8i {
    public static boolean k;
    public static final Integer[] l = {-1, 2, 32, 128};
    public boolean b;
    public boolean c;
    public boolean d;
    public qjl h;
    public lj70 i;
    public final ws6 e = new b25.a() { // from class: xsna.ws6
        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            boolean z = BaseVoipService.k;
            if (tbu0Var.b()) {
                return;
            }
            BaseVoipService baseVoipService = BaseVoipService.this;
            baseVoipService.stopSelf();
            baseVoipService.b();
        }
    };
    public final bpn0 f = new bpn0(new xs6(0));
    public final q7s g = new q7s();
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new px0(this, 9));

    /* compiled from: BaseVoipService.kt */
    public static final class a {
        public static final String a(int i) {
            boolean z = BaseVoipService.k;
            if (i == -1) {
                return "manifest";
            }
            ArrayList arrayList = new ArrayList();
            Integer[] numArr = BaseVoipService.l;
            for (int i2 = 0; i2 < 4; i2++) {
                int intValue = numArr[i2].intValue();
                if (intValue != -1 && (i & intValue) != 0) {
                    arrayList.add(intValue != -1 ? intValue != 2 ? intValue != 32 ? intValue != 128 ? uqi.a("unknown(", intValue, ')') : "microphone" : "mediaProjection" : "mediaPlayback" : "manifest");
                }
            }
            return j5g.g0(arrayList, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        Notification c;
        int foregroundServiceType;
        int foregroundServiceType2;
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        boolean z2 = k;
        boolean z3 = true;
        if (i >= 34) {
            foregroundServiceType2 = getForegroundServiceType();
            if ((foregroundServiceType2 & 128) == 0) {
                z = false;
                if (z2 == z) {
                    boolean z4 = this.d;
                    if (i >= 34) {
                        foregroundServiceType = getForegroundServiceType();
                        if ((foregroundServiceType & 32) == 0) {
                            z3 = false;
                        }
                    }
                    if (z4 == z3) {
                        return;
                    }
                }
                c = c();
                if (c == null) {
                    n(c, f());
                    return;
                }
                return;
            }
        }
        z = true;
        if (z2 == z) {
        }
        c = c();
        if (c == null) {
        }
    }

    public abstract void b();

    public abstract Notification c();

    public abstract Notification d(boolean z);

    public abstract e1x0 e();

    public abstract int f();

    public abstract String g();

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        Notification c = c();
        if (c != null) {
            try {
                lj70 lj70Var = this.i;
                qjl qjlVar = null;
                if (lj70Var == null) {
                    lj70Var = null;
                }
                qjl qjlVar2 = this.h;
                if (qjlVar2 != null) {
                    qjlVar = qjlVar2;
                }
                lj70Var.b(qjlVar);
            } catch (Throwable th) {
                b.a.q(th);
            }
            try {
                L.e(g(), " Will now update notification");
                ((NotificationManager) this.j.getValue()).notify(f(), c);
            } catch (Throwable th2) {
                L.f(g(), "Notification exposition failed", th2);
            }
        }
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public final void n(Notification notification, int i) {
        int i2;
        int foregroundServiceType;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 29) {
                L.e(g(), "start foreground using manifest types");
                startForeground(i, notification);
                return;
            }
            if (i3 < 34) {
                i2 = -1;
            } else {
                i2 = k ? 130 : 2;
                if (this.d) {
                    i2 |= 32;
                }
            }
            L.e(g(), "start foreground with particular types: " + a.a(i2));
            startForeground(i, notification, i2);
            String g = g();
            StringBuilder sb = new StringBuilder("crosscheck: ");
            foregroundServiceType = getForegroundServiceType();
            sb.append(a.a(foregroundServiceType));
            L.e(g, sb.toString());
        } catch (Throwable th) {
            L.f(g(), "can't start foreground service", th);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        L.A(g(), "onCreate");
        super.onCreate();
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr = PermissionHelper.m;
        permissionHelper.getClass();
        k = PermissionHelper.b(this, strArr);
        this.h = new qjl(this);
        this.i = new lj70(this);
        String g = g();
        this.g.getClass();
        q7s.a(g);
        e().d = true;
        n(d(j()), f());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Service
    public final void onDestroy() {
        L.A(g(), "onDestroy");
        ((NotificationManager) this.j.getValue()).cancel(f());
        stopForeground(1);
        o25.a().B(this.e);
        e().d = false;
        l();
        if (this.b) {
            m();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        L.A(g(), "onStartCommand");
        boolean i3 = i();
        bpn0 bpn0Var = this.f;
        if (i3) {
            L.e(g(), "Call is in idle state. stopSelf");
            ((Handler) bpn0Var.getValue()).postDelayed(new sd(this, 3), 500L);
            return 2;
        }
        if (!a201.b().b().isInitialized()) {
            L.e(g(), "Service is started without call initialization. Restarting");
            ((Handler) bpn0Var.getValue()).postDelayed(new sd(this, 3), 500L);
            this.b = true;
            return 2;
        }
        if (!this.c) {
            this.c = true;
            L.A(g(), "initializeService");
            o25.a().b0(this.e);
            k();
        }
        return 2;
    }
}
