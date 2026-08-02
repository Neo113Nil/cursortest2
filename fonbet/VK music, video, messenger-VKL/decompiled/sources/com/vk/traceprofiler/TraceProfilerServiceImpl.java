package com.vk.traceprofiler;

import android.R;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.vk.metrics.eventtracking.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import xsna.c63;
import xsna.dd70;
import xsna.e750;
import xsna.fo8;
import xsna.n970;
import xsna.q7s;
import xsna.r7s;
import xsna.vdp0;
import xsna.vdp0.a;
import xsna.ygm0;

/* compiled from: TraceProfilerServiceImpl.kt */
/* loaded from: classes6.dex */
public final class TraceProfilerServiceImpl extends Service {
    public static final /* synthetic */ int d = 0;
    public vdp0 b;
    public final q7s c = new q7s();

    /* compiled from: TraceProfilerServiceImpl.kt */
    public static final class a {
        public static void a(Context context, Intent intent) {
            try {
                context.startForegroundService(intent);
            } catch (Exception e) {
                c63 c63Var = c63.a;
                if (c63.f) {
                    throw e;
                }
                b bVar = b.a;
                ComponentName component = intent.getComponent();
                bVar.q(new r7s.a(component != null ? component.getClassName() : null, e));
            }
        }
    }

    public final void a() {
        PendingIntent broadcast;
        String str;
        int i;
        boolean z;
        dd70 dd70Var = new dd70(this);
        if (dd70Var.b.getNotificationChannel("TraceProfilerService") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("TraceProfilerService", "TraceProfilerService", 3);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            dd70.a.a(dd70Var.b, notificationChannel);
        }
        vdp0 vdp0Var = this.b;
        if (vdp0Var != null) {
            synchronized (vdp0Var) {
                z = vdp0Var.e != null;
            }
            if (z) {
                int i2 = TraceProfilerReceiver.a;
                Intent intent = new Intent(this, (Class<?>) TraceProfilerReceiver.class);
                intent.setAction("action_stop_profiler");
                broadcast = PendingIntent.getBroadcast(this, 1, intent, 167772160);
                str = "Running...";
                i = R.drawable.ic_media_pause;
                NotificationCompat.h hVar = new NotificationCompat.h(this, "TraceProfilerService");
                hVar.I.icon = com.vkontakte.android.R.drawable.vk_icon_bug_24;
                hVar.e = NotificationCompat.h.d("TraceProfilerService");
                hVar.f = NotificationCompat.h.d(str);
                hVar.k = 2;
                hVar.I.when = 0L;
                hVar.n(2, true);
                hVar.n(16, false);
                hVar.t = true;
                hVar.I.vibrate = new long[]{0};
                n970 n970Var = new n970();
                n970Var.e = new int[]{0};
                hVar.B(n970Var);
                hVar.a(i, broadcast, "");
                startForeground(4623642, hVar.c());
            }
        }
        int i3 = TraceProfilerReceiver.a;
        Intent intent2 = new Intent(this, (Class<?>) TraceProfilerReceiver.class);
        intent2.setAction("action_start_profiler");
        broadcast = PendingIntent.getBroadcast(this, 1, intent2, 167772160);
        str = "Not active";
        i = R.drawable.ic_media_play;
        NotificationCompat.h hVar2 = new NotificationCompat.h(this, "TraceProfilerService");
        hVar2.I.icon = com.vkontakte.android.R.drawable.vk_icon_bug_24;
        hVar2.e = NotificationCompat.h.d("TraceProfilerService");
        hVar2.f = NotificationCompat.h.d(str);
        hVar2.k = 2;
        hVar2.I.when = 0L;
        hVar2.n(2, true);
        hVar2.n(16, false);
        hVar2.t = true;
        hVar2.I.vibrate = new long[]{0};
        n970 n970Var2 = new n970();
        n970Var2.e = new int[]{0};
        hVar2.B(n970Var2);
        hVar2.a(i, broadcast, "");
        startForeground(4623642, hVar2.c());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.c.getClass();
        q7s.a("TraceProfilerServiceImpl");
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        vdp0 vdp0Var = this.b;
        if (vdp0Var != null) {
            synchronized (vdp0Var) {
                try {
                    vdp0.a aVar = vdp0Var.e;
                    if (aVar != null) {
                        aVar.interrupt();
                    }
                    vdp0Var.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.b = null;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 2;
        }
        int hashCode = action.hashCode();
        if (hashCode == -632440954) {
            if (!action.equals("stop_profiler")) {
                return 2;
            }
            vdp0 vdp0Var = this.b;
            if (vdp0Var != null) {
                synchronized (vdp0Var) {
                    try {
                        vdp0.a aVar = vdp0Var.e;
                        if (aVar != null) {
                            aVar.interrupt();
                        }
                        vdp0Var.e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.b = null;
            a();
            return 2;
        }
        if (hashCode != 1024911142 || !action.equals("start_profiler")) {
            return 2;
        }
        if (this.b == null) {
            com.vk.traceprofiler.a.a.a();
            File file = com.vk.traceprofiler.a.e;
            vdp0 vdp0Var2 = new vdp0(new File(file != null ? file : null, fo8.a(new SimpleDateFormat("yyyy-MM-dd HH.mm.ss", Locale.US).format(new Date()), ".trace")), TimeUnit.MICROSECONDS.toNanos(100L), new e750(21), new ygm0(4));
            this.b = vdp0Var2;
            synchronized (vdp0Var2) {
                if (vdp0Var2.e == null) {
                    vdp0.a aVar2 = vdp0Var2.new a();
                    aVar2.setName("TraceProfilerManager");
                    aVar2.start();
                    vdp0Var2.e = aVar2;
                }
            }
        }
        a();
        return 2;
    }
}
