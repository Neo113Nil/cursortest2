package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import com.sports.insider.MyApp;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.y3;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements q1, Closeable, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15505a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i1 f15506b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15507c;

    /* renamed from: d, reason: collision with root package name */
    public y3 f15508d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f15509e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f15510f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f15511g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile IntentFilter f15512h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile HandlerThread f15513i = null;
    public final AtomicBoolean j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.util.a f15514k = new io.sentry.util.a();

    /* renamed from: l, reason: collision with root package name */
    public h1 f15515l;

    public SystemEventsBreadcrumbsIntegration(MyApp myApp) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = myApp.getApplicationContext();
        this.f15505a = applicationContext == null ? myApp : applicationContext;
        this.f15509e = strArr;
    }

    public final void c(y3 y3Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f15510f && !this.f15511g && this.f15506b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new b1(this, y3Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().h(b5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f15514k.a();
        try {
            this.f15510f = true;
            this.f15512h = null;
            if (this.f15513i != null) {
                this.f15513i.quit();
            }
            this.f15513i = null;
            a7.close();
            h0.f15617e.r(this);
            SentryAndroidOptions sentryAndroidOptions = this.f15507c;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new f(3, this));
                } catch (RejectedExecutionException unused) {
                    r();
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f15507c;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().h(b5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.e0
    public final void k() {
        if (this.f15508d == null || this.f15507c == null) {
            return;
        }
        this.f15511g = false;
        c(this.f15508d, this.f15507c);
    }

    @Override // io.sentry.android.core.e0
    public final void n() {
        SentryAndroidOptions sentryAndroidOptions = this.f15507c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new f(3, this));
        } catch (RejectedExecutionException unused) {
            r();
        }
    }

    public final void r() {
        io.sentry.r a7 = this.f15514k.a();
        try {
            this.f15511g = true;
            i1 i1Var = this.f15506b;
            this.f15506b = null;
            a7.close();
            if (i1Var != null) {
                this.f15505a.unregisterReceiver(i1Var);
            }
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15507c = sentryAndroidOptions;
        this.f15508d = y3.f17255a;
        sentryAndroidOptions.getLogger().h(b5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f15507c.isEnableSystemEventBreadcrumbs()));
        if (this.f15507c.isEnableSystemEventBreadcrumbs()) {
            h0.f15617e.c(this);
            if (m0.h()) {
                c(this.f15508d, this.f15507c);
            }
        }
    }
}
