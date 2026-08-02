package com.vk.biometrics.lock.impl.service;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import xsna.af2;
import xsna.asu0;
import xsna.bf2;
import xsna.ca70;
import xsna.d370;
import xsna.i4v;
import xsna.m67;
import xsna.n67;
import xsna.q7s;
import xsna.qz;
import xsna.r57;
import xsna.rl3;
import xsna.sop;

/* compiled from: HidePushContentService.kt */
/* loaded from: classes.dex */
public final class HidePushContentService extends Service {
    public static final long i = TimeUnit.SECONDS.toMillis(15);
    public static final /* synthetic */ int j = 0;
    public boolean d;
    public StatusBarNotification f;
    public NotificationManager g;
    public boolean h;
    public final int b = 1;
    public final q7s c = new q7s();
    public final b e = new b();

    public final void a() {
        StatusBarNotification statusBarNotification = this.f;
        if (statusBarNotification != null) {
            this.h = true;
            n67 b = r57.b();
            b.getClass();
            asu0.a.getClass();
            asu0.s().submit(new m67(statusBarNotification, b));
        }
    }

    public final void b() {
        Notification a;
        StatusBarNotification[] activeNotifications;
        NotificationManager notificationManager = this.g;
        StatusBarNotification statusBarNotification = (notificationManager == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) ? null : (StatusBarNotification) rl3.O(activeNotifications);
        if (statusBarNotification == null || (a = statusBarNotification.getNotification()) == null) {
            d370.n(this);
            a = new i4v(this).a();
        }
        this.f = statusBarNotification;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.b;
        if (i2 >= 29) {
            startForeground(i3, a, 1);
        } else {
            startForeground(i3, a);
        }
        if (statusBarNotification == null) {
            stopSelf();
            return;
        }
        NotificationManager notificationManager2 = this.g;
        if (notificationManager2 != null) {
            String tag = statusBarNotification.getTag();
            ca70 ca70Var = ca70.a;
            notificationManager2.cancel(tag, ca70.e(Integer.valueOf(statusBarNotification.getId())));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        boolean z;
        super.onCreate();
        this.g = (NotificationManager) getApplicationContext().getSystemService("notification");
        this.c.getClass();
        q7s.a("HidePushContentService");
        getApplicationContext();
        if (this.d) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                b();
            } catch (ForegroundServiceStartNotAllowedException e) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't start hide push content service from bg", e));
                z = false;
            }
        } else {
            b();
        }
        z = true;
        this.d = z;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.e.e();
        this.d = false;
        if (!this.h) {
            a();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        long j2 = i;
        if (intent != null) {
            j2 = intent.getLongExtra("DELAY_IN_MS_KEY", j2);
        }
        b bVar = this.e;
        bVar.e();
        bVar.b(new s0(new Callable() { // from class: xsna.h4v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i4 = HidePushContentService.j;
                return s3q0.a;
            }
        }).A(j2, TimeUnit.MILLISECONDS).subscribe(new qz(new sop(this, 14), 20), new bf2(new af2(26), 21)));
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        a();
        super.onTaskRemoved(intent);
    }

    public final void onTimeout(int i2, int i3) {
        super.onTimeout(i2, i3);
        stopSelf();
    }
}
