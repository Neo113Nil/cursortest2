package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import io.sentry.android.core.F;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC7166l0, Closeable, F.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66990a;

    /* renamed from: b, reason: collision with root package name */
    volatile b f66991b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f66992c;

    /* renamed from: d, reason: collision with root package name */
    private A1 f66993d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f66994e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f66995f = false;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f66996g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile IntentFilter f66997h = null;

    /* renamed from: i, reason: collision with root package name */
    private volatile HandlerThread f66998i = null;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f66999j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67000k = new io.sentry.util.a();

    /* renamed from: l, reason: collision with root package name */
    private a f67001l;

    /* loaded from: classes10.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Integer f67002a;

        /* renamed from: b, reason: collision with root package name */
        private final Boolean f67003b;

        a(Boolean bool, Integer num) {
            this.f67002a = num;
            this.f67003b = bool;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.p.a(this.f67002a, aVar.f67002a) && io.sentry.util.p.a(this.f67003b, aVar.f67003b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f67002a, this.f67003b});
        }
    }

    /* loaded from: classes10.dex */
    final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final A1 f67004a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final SentryAndroidOptions f67005b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final io.sentry.android.core.internal.util.g f67006c = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.a(), 60000, 0);

        /* renamed from: d, reason: collision with root package name */
        private final char[] f67007d = new char[64];

        b(@NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.f67004a = a12;
            this.f67005b = sentryAndroidOptions;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        
            r2 = r11;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, @NotNull Intent intent) {
            a aVar;
            Bundle extras;
            int i11;
            String action = intent.getAction();
            boolean equals = "android.intent.action.BATTERY_CHANGED".equals(action);
            SentryAndroidOptions sentryAndroidOptions = this.f67005b;
            String str = null;
            if (!equals) {
                aVar = null;
            } else {
                if (this.f67006c.a()) {
                    return;
                }
                Float b11 = P.b(intent, sentryAndroidOptions);
                aVar = new a(P.h(intent, sentryAndroidOptions), b11 != null ? Integer.valueOf(b11.intValue()) : null);
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = SystemEventsBreadcrumbsIntegration.this;
                if (aVar.equals(systemEventsBreadcrumbsIntegration.f67001l)) {
                    return;
                } else {
                    systemEventsBreadcrumbsIntegration.f67001l = aVar;
                }
            }
            C7141f c7141f = new C7141f(System.currentTimeMillis());
            c7141f.r("system");
            c7141f.n("device.event");
            if (action != null) {
                int length = action.length();
                char[] cArr = this.f67007d;
                int length2 = cArr.length;
                int i12 = length - 1;
                while (true) {
                    if (i12 < 0) {
                        break;
                    }
                    char charAt = action.charAt(i12);
                    if (charAt == '.') {
                        str = new String(cArr, length2, cArr.length - length2);
                        break;
                    }
                    if (length2 == 0) {
                        int i13 = io.sentry.util.w.f68605c;
                        int lastIndexOf = action.lastIndexOf(".");
                        if (lastIndexOf >= 0 && action.length() > (i11 = lastIndexOf + 1)) {
                            str = action.substring(i11);
                        }
                    } else {
                        length2--;
                        cArr[length2] = charAt;
                        i12--;
                    }
                }
            }
            if (str != null) {
                c7141f.o(str, "action");
            }
            if (aVar != null) {
                if (aVar.f67002a != null) {
                    c7141f.o(aVar.f67002a, "level");
                }
                if (aVar.f67003b != null) {
                    c7141f.o(aVar.f67003b, "charging");
                }
            } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap hashMap = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            hashMap.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "%s key of the %s action threw an error.", str2, action);
                    }
                }
                c7141f.o(hashMap, "extras");
            }
            c7141f.p(I2.INFO);
            io.sentry.E e11 = new io.sentry.E();
            e11.k(intent, "android:intent");
            this.f67004a.g(c7141f, e11);
        }
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.f66990a = applicationContext == null ? context : applicationContext;
        this.f66994e = strArr;
    }

    public static void k(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, A1 a12, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC7097a0 a11 = systemEventsBreadcrumbsIntegration.f67000k.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f66995f && !systemEventsBreadcrumbsIntegration.f66996g && systemEventsBreadcrumbsIntegration.f66991b == null) {
                systemEventsBreadcrumbsIntegration.f66991b = systemEventsBreadcrumbsIntegration.new b(a12, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f66997h == null) {
                    systemEventsBreadcrumbsIntegration.f66997h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f66994e) {
                        systemEventsBreadcrumbsIntegration.f66997h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f66998i == null) {
                    systemEventsBreadcrumbsIntegration.f66998i = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f66998i.start();
                }
                try {
                    Handler handler = new Handler(systemEventsBreadcrumbsIntegration.f66998i.getLooper());
                    Context context = systemEventsBreadcrumbsIntegration.f66990a;
                    b bVar = systemEventsBreadcrumbsIntegration.f66991b;
                    IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.f66997h;
                    io.sentry.util.p.b(sentryAndroidOptions.getLogger(), "The ILogger object is required.");
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(bVar, intentFilter, null, handler, 4);
                    } else {
                        context.registerReceiver(bVar, intentFilter, null, handler);
                    }
                    if (!systemEventsBreadcrumbsIntegration.f66999j.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(I2.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.j.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                a11.close();
                return;
            }
            a11.close();
        } finally {
        }
    }

    private void q(@NotNull final A1 a12, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f66995f && !this.f66996g && this.f66991b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.k(SystemEventsBreadcrumbsIntegration.this, a12, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(I2.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void r() {
        SentryAndroidOptions sentryAndroidOptions = this.f66992c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new QI.b(this, 3));
        } catch (RejectedExecutionException unused) {
            s(this.f66992c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC7097a0 a11 = this.f67000k.a();
        try {
            this.f66996g = true;
            b bVar = this.f66991b;
            this.f66991b = null;
            a11.close();
            if (bVar != null) {
                try {
                    this.f66990a.unregisterReceiver(bVar);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                a11.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.android.core.F.a
    public final void c() {
        if (this.f66993d == null || this.f66992c == null) {
            return;
        }
        this.f66996g = false;
        q(this.f66993d, this.f66992c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC7097a0 a11 = this.f67000k.a();
        try {
            this.f66995f = true;
            this.f66997h = null;
            if (this.f66998i != null) {
                this.f66998i.quit();
            }
            this.f66998i = null;
            a11.close();
            F.o().r(this);
            r();
            SentryAndroidOptions sentryAndroidOptions = this.f66992c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66992c = sentryAndroidOptions;
        this.f66993d = a12;
        sentryAndroidOptions.getLogger().c(I2.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f66992c.isEnableSystemEventBreadcrumbs()));
        if (this.f66992c.isEnableSystemEventBreadcrumbs()) {
            F.o().j(this);
            if (K.g()) {
                q(this.f66993d, this.f66992c);
            }
        }
    }

    @Override // io.sentry.android.core.F.a
    public final void j() {
        r();
    }
}
