package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleService;
import java.util.Objects;
import java.util.UUID;
import xsna.aq9;
import xsna.bqn0;
import xsna.dwx0;
import xsna.m100;
import xsna.ug0;
import xsna.zs80;

/* loaded from: classes12.dex */
public class SystemForegroundService extends LifecycleService {
    public static final /* synthetic */ int f = 0;
    public boolean c;
    public bqn0 d;
    public NotificationManager e;

    public static class a {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            systemForegroundService.startForeground(i, notification, i2);
        }
    }

    public static class b {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            try {
                systemForegroundService.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                m100 c = m100.c();
                int i3 = SystemForegroundService.f;
                c.getClass();
            } catch (SecurityException unused2) {
                m100 c2 = m100.c();
                int i4 = SystemForegroundService.f;
                c2.getClass();
            }
        }
    }

    static {
        m100.d("SystemFgService");
    }

    public final void a() {
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        bqn0 bqn0Var = new bqn0(getApplicationContext());
        this.d = bqn0Var;
        if (bqn0Var.j != null) {
            m100.c().a(bqn0.k, "A callback already exists.");
        } else {
            bqn0Var.j = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            m100.c().getClass();
            this.d.f();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        bqn0 bqn0Var = this.d;
        bqn0Var.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m100 c = m100.c();
            Objects.toString(intent);
            c.getClass();
            bqn0Var.c.b(new ug0(bqn0Var, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bqn0Var.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bqn0Var.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            m100 c2 = m100.c();
            Objects.toString(intent);
            c2.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            dwx0 dwx0Var = bqn0Var.b;
            zs80.a(dwx0Var.b.m, "CancelWorkById", dwx0Var.d.a, new aq9(dwx0Var, UUID.fromString(stringExtra)));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        m100.c().getClass();
        SystemForegroundService systemForegroundService = bqn0Var.j;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.c = true;
        m100.c().getClass();
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.d.g(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.d.g(i2);
    }
}
