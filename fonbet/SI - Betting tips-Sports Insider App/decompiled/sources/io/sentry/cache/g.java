package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.n6;
import io.sentry.protocol.v;
import io.sentry.s3;
import io.sentry.v3;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends v3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f16253c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16254a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.f f16255b = new io.sentry.util.f(new io.sentry.android.core.internal.gestures.c(5, this));

    public g(SentryAndroidOptions sentryAndroidOptions) {
        this.f16254a = sentryAndroidOptions;
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void a(Collection collection) {
        if (collection.isEmpty()) {
            n(new io.sentry.android.core.f(9, this));
        }
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void b(ConcurrentHashMap concurrentHashMap) {
        n(new f(this, concurrentHashMap, 0));
    }

    @Override // io.sentry.a1
    public final void c(io.sentry.e eVar) {
        n(new io.sentry.android.replay.util.c(3, this, eVar));
    }

    @Override // io.sentry.a1
    public final void d(n6 n6Var, s3 s3Var) {
        n(new androidx.fragment.app.d(this, n6Var, s3Var, 17));
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void e(io.sentry.protocol.c cVar) {
        n(new io.sentry.android.replay.util.c(4, this, cVar));
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void g(ConcurrentHashMap concurrentHashMap) {
        n(new f(this, concurrentHashMap, 1));
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void h(String str) {
        n(new io.sentry.android.replay.util.c(6, this, str));
    }

    public final void k(String str) {
        a.a(this.f16254a, ".scope-cache", str);
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void l(v vVar) {
        n(new io.sentry.android.replay.util.c(5, this, vVar));
    }

    public final Object m(b6 b6Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(b6Var, ".scope-cache", str, cls);
        }
        try {
            io.sentry.cache.tape.e eVar = (io.sentry.cache.tape.e) this.f16255b.a();
            int min = Math.min(eVar.size(), eVar.size());
            ArrayList arrayList = new ArrayList(min);
            Iterator it = eVar.iterator();
            for (int i5 = 0; i5 < min; i5++) {
                arrayList.add(it.next());
            }
            return cls.cast(DesugarCollections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            b6Var.getLogger().h(b5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void n(Runnable runnable) {
        b6 b6Var = this.f16254a;
        if (b6Var.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    b6Var.getLogger().e(b5.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                b6Var.getExecutorService().submit(new io.sentry.android.replay.util.c(7, this, runnable));
            } catch (Throwable th3) {
                b6Var.getLogger().e(b5.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public final void p(Object obj, String str) {
        a.d(this.f16254a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void r(b5 b5Var) {
        n(new io.sentry.android.replay.util.c(2, this, b5Var));
    }
}
