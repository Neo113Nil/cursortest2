package com.vk.instantjobs.services;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.vk.instantjobs.services.a;
import java.util.HashMap;
import java.util.Iterator;
import xsna.ehj;
import xsna.epx;
import xsna.gz80;
import xsna.ho8;
import xsna.o4;
import xsna.q7s;
import xsna.r7s;

/* compiled from: JobsForegroundService.kt */
/* loaded from: classes.dex */
public final class JobsForegroundService extends Service {
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static final HashMap<Integer, a> i = new HashMap<>();
    public static int j;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final long c = 5000;
    public final o4 d = new o4(this, 13);
    public final q7s e = new q7s();

    /* compiled from: JobsForegroundService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Notification a;
        public final String b;

        public a(Notification notification, String str) {
            this.a = notification;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveJobInfo(notification=");
            sb.append(this.a);
            sb.append(", jobDescription=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: JobsForegroundService.kt */
    public static final class b {
        public static final void a(Context context, boolean z) {
            boolean z2 = JobsForegroundService.f;
            if (JobsForegroundService.h != z) {
                JobsForegroundService.h = z;
                if (!z) {
                    Intent intent = new Intent(context, (Class<?>) JobsForegroundService.class);
                    if (JobsForegroundService.f) {
                        JobsForegroundService.g = true;
                    } else {
                        context.stopService(intent);
                    }
                    for (Integer num : JobsForegroundService.i.keySet()) {
                        int i = JobsForegroundService.j;
                        if (num == null || num.intValue() != i) {
                            boolean z3 = JobsForegroundService.f;
                            ((NotificationManager) context.getSystemService("notification")).cancel(num.intValue());
                        }
                    }
                    JobsForegroundService.i.clear();
                    JobsForegroundService.j = 0;
                }
                Iterator<a.InterfaceC1189a> it = com.vk.instantjobs.services.a.b.iterator();
                while (it.hasNext()) {
                    it.next().a(z);
                }
            }
        }

        public static void b(Context context, int i, Notification notification, String str) {
            Intent intent = new Intent(context, (Class<?>) JobsForegroundService.class);
            intent.putExtra("notification_id", i);
            intent.putExtra("notification_content", notification);
            if (!gz80.a(26)) {
                context.startService(intent);
                return;
            }
            JobsForegroundService.f = true;
            try {
                r7s.b(context, intent);
            } catch (Exception e) {
                if (!gz80.a(31) || !ehj.f(e)) {
                    throw e;
                }
                throw new c(str);
            }
        }
    }

    /* compiled from: JobsForegroundService.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Exception {
        public c(String str) {
            super("Failed to start foreground service for job with description ".concat(str));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.e.getClass();
        q7s.a("JobsForegroundService");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        b.a(getApplicationContext(), false);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        b.a(getApplicationContext(), true);
        int intExtra = intent.getIntExtra("notification_id", 0);
        Notification notification = (Notification) intent.getParcelableExtra("notification_content");
        Handler handler = this.b;
        o4 o4Var = this.d;
        handler.removeCallbacks(o4Var);
        if (r7s.a(this, intExtra, notification)) {
            handler.postDelayed(o4Var, this.c);
            return 2;
        }
        f = false;
        g = false;
        stopSelf();
        return 2;
    }

    public final void onTimeout(int i2, int i3) {
        super.onTimeout(i2, i3);
        stopSelf();
    }
}
