package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes3.dex */
public final class AppState implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static AppState f50663e = new AppState();

    /* renamed from: b, reason: collision with root package name */
    public volatile LifecycleObserver f50665b;

    /* renamed from: a, reason: collision with root package name */
    public final C4843a f50664a = new C4843a();

    /* renamed from: c, reason: collision with root package name */
    public L0 f50666c = new L0();

    /* renamed from: d, reason: collision with root package name */
    public volatile Boolean f50667d = null;

    @ApiStatus.Internal
    public final class LifecycleObserver implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final List f50668a = new a();

        public class a extends CopyOnWriteArrayList {
            public a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean add = super.add(aVar);
                if (Boolean.FALSE.equals(AppState.this.f50667d)) {
                    aVar.d();
                    return add;
                }
                if (Boolean.TRUE.equals(AppState.this.f50667d)) {
                    aVar.k();
                }
                return add;
            }
        }

        public LifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2193s interfaceC2193s) {
            AppState.this.n1(false);
            Iterator it = this.f50668a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC2193s interfaceC2193s) {
            AppState.this.n1(true);
            Iterator it = this.f50668a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).k();
            }
        }
    }

    public interface a {
        void d();

        void k();
    }

    public static AppState w0() {
        return f50663e;
    }

    public void A0(F3 f32) {
        if (this.f50665b != null) {
            return;
        }
        InterfaceC4765j0 d10 = this.f50664a.d();
        try {
            U(f32 != null ? f32.getLogger() : io.sentry.U0.e());
            if (d10 != null) {
                d10.close();
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

    public void B(a aVar) {
        InterfaceC4765j0 d10 = this.f50664a.d();
        try {
            U(io.sentry.U0.e());
            if (this.f50665b != null) {
                this.f50665b.f50668a.add(aVar);
            }
            if (d10 != null) {
                d10.close();
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

    public void D0(a aVar) {
        InterfaceC4765j0 d10 = this.f50664a.d();
        try {
            if (this.f50665b != null) {
                this.f50665b.f50668a.remove(aVar);
            }
            if (d10 != null) {
                d10.close();
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

    public final void J(ILogger iLogger) {
        LifecycleObserver lifecycleObserver = this.f50665b;
        if (lifecycleObserver != null) {
            try {
                ProcessLifecycleOwner.l().getLifecycle().a(lifecycleObserver);
            } catch (Throwable th2) {
                this.f50665b = null;
                iLogger.b(EnumC4788n3.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    public final void U(final ILogger iLogger) {
        if (this.f50665b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f50665b = new LifecycleObserver();
            if (io.sentry.android.core.internal.util.k.e().a()) {
                J(iLogger);
            } else {
                this.f50666c.b(new Runnable() { // from class: io.sentry.android.core.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppState.this.J(iLogger);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(EnumC4788n3.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y1();
    }

    public final void m1(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver != null) {
            ProcessLifecycleOwner.l().getLifecycle().d(lifecycleObserver);
        }
    }

    public void n1(boolean z10) {
        this.f50667d = Boolean.valueOf(z10);
    }

    public void y1() {
        if (this.f50665b == null) {
            return;
        }
        InterfaceC4765j0 d10 = this.f50664a.d();
        try {
            final LifecycleObserver lifecycleObserver = this.f50665b;
            this.f50665b.f50668a.clear();
            this.f50665b = null;
            if (d10 != null) {
                d10.close();
            }
            if (io.sentry.android.core.internal.util.k.e().a()) {
                m1(lifecycleObserver);
            } else {
                this.f50666c.b(new Runnable() { // from class: io.sentry.android.core.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppState.this.m1(lifecycleObserver);
                    }
                });
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

    public Boolean z0() {
        return this.f50667d;
    }
}
