package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.android.core.AppState;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC4839u0, Closeable, AppState.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50806a;

    @NotNull
    private final String[] actions;

    /* renamed from: b, reason: collision with root package name */
    public volatile b f50807b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50808c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4740e0 f50809d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f50810e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f50811f;

    /* renamed from: g, reason: collision with root package name */
    public volatile IntentFilter f50812g;

    /* renamed from: h, reason: collision with root package name */
    public volatile HandlerThread f50813h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f50814i;

    /* renamed from: j, reason: collision with root package name */
    public final C4843a f50815j;

    /* renamed from: k, reason: collision with root package name */
    public a f50816k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f50817l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f50818a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f50819b;

        public a(Integer num, Boolean bool) {
            this.f50818a = num;
            this.f50819b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.w.a(this.f50818a, aVar.f50818a) && io.sentry.util.w.a(this.f50819b, aVar.f50819b);
        }

        public int hashCode() {
            return io.sentry.util.w.b(this.f50818a, this.f50819b);
        }
    }

    public final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4740e0 f50820a;

        /* renamed from: b, reason: collision with root package name */
        public final SentryAndroidOptions f50821b;

        /* renamed from: c, reason: collision with root package name */
        public final io.sentry.android.core.internal.util.o f50822c = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.b(), 60000, 0);
        private final char[] buf = new char[64];

        public b(InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions) {
            this.f50820a = interfaceC4740e0;
            this.f50821b = sentryAndroidOptions;
        }

        public final C4744f a(long j10, Intent intent, String str, a aVar) {
            Bundle extras;
            C4744f c4744f = new C4744f(j10);
            c4744f.A("system");
            c4744f.v("device.event");
            String b10 = b(str);
            if (b10 != null) {
                c4744f.w("action", b10);
            }
            if (aVar != null) {
                if (aVar.f50818a != null) {
                    c4744f.w("level", aVar.f50818a);
                }
                if (aVar.f50819b != null) {
                    c4744f.w("charging", aVar.f50819b);
                }
            } else if (this.f50821b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap hashMap = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            hashMap.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f50821b.getLogger().a(EnumC4788n3.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                c4744f.w("extras", hashMap);
            }
            c4744f.x(EnumC4788n3.INFO);
            return c4744f;
        }

        public String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.buf.length;
            for (int i10 = length - 1; i10 >= 0; i10--) {
                char charAt = str.charAt(i10);
                if (charAt == '.') {
                    char[] cArr = this.buf;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.D.f(str);
                }
                length2--;
                this.buf[length2] = charAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f50822c.a()) {
                    return;
                }
                Float c10 = C4713v0.c(intent, this.f50821b);
                a aVar2 = new a(c10 != null ? Integer.valueOf(c10.intValue()) : null, C4713v0.t(intent, this.f50821b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f50816k)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f50816k = aVar2;
                aVar = aVar2;
            }
            C4744f a10 = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.J j10 = new io.sentry.J();
            j10.m("android:intent", intent);
            this.f50820a.g(a10, j10);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, z0(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void r(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC4765j0 d10 = systemEventsBreadcrumbsIntegration.f50815j.d();
        try {
            if (!systemEventsBreadcrumbsIntegration.f50810e && !systemEventsBreadcrumbsIntegration.f50811f && systemEventsBreadcrumbsIntegration.f50807b == null) {
                systemEventsBreadcrumbsIntegration.f50807b = systemEventsBreadcrumbsIntegration.new b(interfaceC4740e0, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f50812g == null) {
                    systemEventsBreadcrumbsIntegration.f50812g = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.actions) {
                        systemEventsBreadcrumbsIntegration.f50812g.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f50817l == null && systemEventsBreadcrumbsIntegration.f50813h == null) {
                    systemEventsBreadcrumbsIntegration.f50813h = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f50813h.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.f50817l;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.f50813h.getLooper());
                    }
                    AbstractC4704q0.t(systemEventsBreadcrumbsIntegration.f50806a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f50807b, systemEventsBreadcrumbsIntegration.f50812g, handler);
                    if (!systemEventsBreadcrumbsIntegration.f50814i.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.n.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                if (d10 != null) {
                    d10.close();
                }
            }
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static String[] z0() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    public final void A0(final InterfaceC4740e0 interfaceC4740e0, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f50810e && !this.f50811f && this.f50807b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.r(SystemEventsBreadcrumbsIntegration.this, interfaceC4740e0, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void D0() {
        SentryAndroidOptions sentryAndroidOptions = this.f50808c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.s1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.m1(SystemEventsBreadcrumbsIntegration.this.f50808c);
                }
            });
        } catch (RejectedExecutionException unused) {
            m1(this.f50808c);
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50808c = sentryAndroidOptions;
        this.f50809d = interfaceC4740e0;
        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f50808c.isEnableSystemEventBreadcrumbs()));
        if (this.f50808c.isEnableSystemEventBreadcrumbs()) {
            AppState.w0().B(this);
            if (AbstractC4704q0.s()) {
                A0(this.f50809d, this.f50808c);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f50815j.d();
        try {
            this.f50810e = true;
            this.f50812g = null;
            if (this.f50813h != null) {
                this.f50813h.quit();
            }
            this.f50813h = null;
            if (d10 != null) {
                d10.close();
            }
            AppState.w0().D0(this);
            D0();
            SentryAndroidOptions sentryAndroidOptions = this.f50808c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public void d() {
        if (this.f50809d == null || this.f50808c == null) {
            return;
        }
        this.f50811f = false;
        A0(this.f50809d, this.f50808c);
    }

    @Override // io.sentry.android.core.AppState.a
    public void k() {
        D0();
    }

    public final void m1(SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC4765j0 d10 = this.f50815j.d();
        try {
            this.f50811f = true;
            b bVar = this.f50807b;
            this.f50807b = null;
            if (d10 != null) {
                d10.close();
            }
            if (bVar != null) {
                try {
                    this.f50806a.unregisterReceiver(bVar);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.f50810e = false;
        this.f50811f = false;
        this.f50812g = null;
        this.f50813h = null;
        this.f50814i = new AtomicBoolean(false);
        this.f50815j = new C4843a();
        this.f50817l = null;
        this.f50806a = AbstractC4704q0.g(context);
        this.actions = strArr;
        this.f50817l = handler;
    }
}
