package io.sentry.cache;

import L3.B;
import L3.D;
import L3.H;
import L3.q;
import androidx.compose.ui.platform.RunnableC5296x;
import com.appsflyer.internal.v;
import io.sentry.AbstractC7221x1;
import io.sentry.C7141f;
import io.sentry.C7209u1;
import io.sentry.I2;
import io.sentry.V2;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.cache.tape.d;
import io.sentry.j3;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.E;
import io.sentry.protocol.o;
import io.sentry.protocol.t;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l extends AbstractC7221x1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f67798c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private SentryAndroidOptions f67799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<io.sentry.cache.tape.c<C7141f>> f67800b = new io.sentry.util.l<>(new V2(this, 1));

    public l(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f67799a = sentryAndroidOptions;
    }

    public static /* synthetic */ void A(l lVar, Runnable runnable) {
        lVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th2) {
            lVar.f67799a.getLogger().a(I2.ERROR, "Serialization task failed", th2);
        }
    }

    public static /* synthetic */ void C(l lVar, C7141f c7141f) {
        lVar.getClass();
        try {
            lVar.f67800b.a().c(c7141f);
        } catch (IOException e11) {
            lVar.f67799a.getLogger().a(I2.ERROR, "Failed to add breadcrumb to file queue", e11);
        }
    }

    private void F(@NotNull String str) {
        d.a(this.f67799a, ".scope-cache", str);
    }

    private void I(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f67799a;
        if (sentryAndroidOptions.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                sentryAndroidOptions.getExecutorService().submit(new v(1, this, runnable));
            } catch (Throwable th3) {
                sentryAndroidOptions.getLogger().a(I2.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public static <T> void J(@NotNull W2 w22, @NotNull T t2, @NotNull String str) {
        d.d(w22, t2, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void K(@NotNull T t2, @NotNull String str) {
        J(this.f67799a, t2, str);
    }

    public static /* synthetic */ void q(l lVar, j3 j3Var, C7209u1 c7209u1) {
        if (j3Var != null) {
            lVar.K(j3Var, "trace.json");
        } else {
            lVar.getClass();
            lVar.K(c7209u1.H().e(), "trace.json");
        }
    }

    public static /* synthetic */ void v(l lVar) {
        lVar.getClass();
        try {
            lVar.f67800b.a().clear();
        } catch (IOException e11) {
            lVar.f67799a.getLogger().a(I2.ERROR, "Failed to clear breadcrumbs from file queue", e11);
        }
    }

    public static /* synthetic */ void w(l lVar, String str) {
        if (str == null) {
            lVar.F("transaction.json");
        } else {
            lVar.K(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c y(l lVar) {
        io.sentry.cache.tape.d a11;
        SentryAndroidOptions sentryAndroidOptions = lVar.f67799a;
        File b11 = d.b(sentryAndroidOptions, ".scope-cache");
        if (b11 == null) {
            sentryAndroidOptions.getLogger().c(I2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.m();
        }
        File file = new File(b11, "breadcrumbs.json");
        try {
            try {
                d.a aVar = new d.a(file);
                aVar.b(sentryAndroidOptions.getMaxBreadcrumbs());
                a11 = aVar.a();
            } catch (IOException unused) {
                file.delete();
                d.a aVar2 = new d.a(file);
                aVar2.b(sentryAndroidOptions.getMaxBreadcrumbs());
                a11 = aVar2.a();
            }
            return io.sentry.cache.tape.c.k(a11, new k(lVar));
        } catch (IOException e11) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to create breadcrumbs queue", e11);
            return io.sentry.cache.tape.c.m();
        }
    }

    public final <T> T G(@NotNull W2 w22, @NotNull String str, @NotNull Class<T> cls) {
        if (!str.equals("breadcrumbs.json")) {
            return (T) d.c(w22, ".scope-cache", str, cls);
        }
        try {
            io.sentry.cache.tape.c<C7141f> a11 = this.f67800b.a();
            int min = Math.min(a11.size(), a11.size());
            ArrayList arrayList = new ArrayList(min);
            Iterator<C7141f> it = a11.iterator();
            for (int i11 = 0; i11 < min; i11++) {
                arrayList.add(it.next());
            }
            return cls.cast(Collections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            w22.getLogger().c(I2.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void H() {
        try {
            this.f67800b.a().clear();
        } catch (IOException e11) {
            this.f67799a.getLogger().a(I2.ERROR, "Failed to clear breadcrumbs from file queue", e11);
        }
        F("user.json");
        F("level.json");
        F("request.json");
        F("fingerprint.json");
        F("contexts.json");
        F("extras.json");
        F("tags.json");
        F("trace.json");
        F("transaction.json");
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void a(@NotNull Collection<C7141f> collection) {
        if (collection.isEmpty()) {
            I(new RunnableC5296x(this, 1));
        }
    }

    @Override // io.sentry.V
    public final void d(E e11) {
        I(new io.sentry.android.ndk.b(1, this, e11));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void e(@NotNull C7187c c7187c) {
        I(new j(0, this, c7187c));
    }

    @Override // io.sentry.V
    public final void f(@NotNull C7141f c7141f) {
        I(new H(2, this, c7141f));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void g(@NotNull ConcurrentHashMap concurrentHashMap) {
        I(new q(4, this, concurrentHashMap));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void h(@NotNull List list) {
        I(new io.sentry.android.ndk.e(this, list));
    }

    @Override // io.sentry.V
    public final void i(final j3 j3Var, @NotNull final C7209u1 c7209u1) {
        I(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                l.q(l.this, j3Var, c7209u1);
            }
        });
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void j(o oVar) {
        I(new VS.a(2, this, oVar));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void k(I2 i22) {
        I(new D(2, this, i22));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void m(@NotNull ConcurrentHashMap concurrentHashMap) {
        I(new L3.E(this, concurrentHashMap, 1));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void o(@NotNull t tVar) {
        I(new Cm.c(5, this, tVar));
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void p(String str) {
        I(new B(2, this, str));
    }
}
