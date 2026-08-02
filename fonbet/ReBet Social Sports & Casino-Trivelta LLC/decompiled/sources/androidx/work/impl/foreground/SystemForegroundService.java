package androidx.work.impl.foreground;

import Q2.AbstractC1508t;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.AbstractServiceC2198x;
import androidx.work.impl.foreground.a;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC2198x implements a.b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f23902e = AbstractC1508t.i("SystemFgService");

    /* renamed from: f, reason: collision with root package name */
    public static SystemForegroundService f23903f = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23904b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.impl.foreground.a f23905c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f23906d;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC1508t.e().l(SystemForegroundService.f23902e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                AbstractC1508t.e().l(SystemForegroundService.f23902e, "Unable to start foreground service", e11);
            }
        }
    }

    private void g() {
        this.f23906d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f23905c = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f23906d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10) {
        this.f23904b = true;
        AbstractC1508t.e().a(f23902e, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f23903f = null;
        stopSelf(i10);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b.a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            a.a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i10) {
        this.f23906d.cancel(i10);
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onCreate() {
        super.onCreate();
        f23903f = this;
        g();
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f23905c.l();
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f23904b) {
            AbstractC1508t.e().f(f23902e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f23905c.l();
            g();
            this.f23904b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f23905c.m(intent, i11);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f23905c.n(i10, 2048);
    }

    public void onTimeout(int i10, int i11) {
        this.f23905c.n(i10, i11);
    }
}
