package io.sentry.android.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.J0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static F f66890e = new F();

    /* renamed from: b, reason: collision with root package name */
    private volatile b f66892b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66891a = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    private Z f66893c = new Z();

    /* renamed from: d, reason: collision with root package name */
    private volatile Boolean f66894d = null;

    public interface a {
        void c();

        void j();
    }

    public final class b implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final List<a> f66895a = new a();

        final class a extends CopyOnWriteArrayList<a> {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final boolean add(Object obj) {
                a aVar = (a) obj;
                boolean add = super.add(aVar);
                Boolean bool = Boolean.FALSE;
                b bVar = b.this;
                if (bool.equals(F.this.f66894d)) {
                    aVar.c();
                    return add;
                }
                if (Boolean.TRUE.equals(F.this.f66894d)) {
                    aVar.j();
                }
                return add;
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(@NonNull androidx.lifecycle.J j11) {
            F.this.s(false);
            Iterator it = ((CopyOnWriteArrayList) this.f66895a).iterator();
            while (it.hasNext()) {
                ((a) it.next()).c();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(@NonNull androidx.lifecycle.J j11) {
            F.this.s(true);
            Iterator it = ((CopyOnWriteArrayList) this.f66895a).iterator();
            while (it.hasNext()) {
                ((a) it.next()).j();
            }
        }
    }

    private F() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@NotNull ILogger iLogger) {
        ProcessLifecycleOwner processLifecycleOwner;
        b bVar = this.f66892b;
        if (bVar != null) {
            try {
                processLifecycleOwner = ProcessLifecycleOwner.f43230i;
                processLifecycleOwner.getLifecycle().a(bVar);
            } catch (Throwable th2) {
                this.f66892b = null;
                iLogger.a(I2.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    private void m(@NotNull ILogger iLogger) {
        if (this.f66892b != null) {
            return;
        }
        try {
            int i11 = ProcessLifecycleOwner.f43231j;
            this.f66892b = new b();
            if (io.sentry.android.core.internal.util.d.d().a()) {
                k(iLogger);
            } else {
                this.f66893c.b(new com.appsflyer.internal.s(1, this, iLogger));
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(I2.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    @NotNull
    public static F o() {
        return f66890e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        t();
    }

    public final void j(@NotNull a aVar) {
        InterfaceC7097a0 a11 = this.f66891a.a();
        try {
            m(J0.e());
            if (this.f66892b != null) {
                ((b.a) this.f66892b.f66895a).add(aVar);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Boolean p() {
        return this.f66894d;
    }

    public final void q(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f66892b != null) {
            return;
        }
        InterfaceC7097a0 a11 = this.f66891a.a();
        try {
            m(sentryAndroidOptions != null ? sentryAndroidOptions.getLogger() : J0.e());
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void r(@NotNull a aVar) {
        InterfaceC7097a0 a11 = this.f66891a.a();
        try {
            if (this.f66892b != null) {
                ((CopyOnWriteArrayList) this.f66892b.f66895a).remove(aVar);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    final void s(boolean z11) {
        this.f66894d = Boolean.valueOf(z11);
    }

    public final void t() {
        ProcessLifecycleOwner processLifecycleOwner;
        if (this.f66892b == null) {
            return;
        }
        InterfaceC7097a0 a11 = this.f66891a.a();
        try {
            b bVar = this.f66892b;
            ((CopyOnWriteArrayList) this.f66892b.f66895a).clear();
            this.f66892b = null;
            a11.close();
            if (!io.sentry.android.core.internal.util.d.d().a()) {
                this.f66893c.b(new L3.q(3, this, bVar));
            } else if (bVar != null) {
                processLifecycleOwner = ProcessLifecycleOwner.f43230i;
                processLifecycleOwner.getLifecycle().e(bVar);
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
}
