package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile k0 f16586i;

    /* renamed from: a, reason: collision with root package name */
    public final long f16587a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f16588b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f16589c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f16590d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f16591e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f16592f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f16584g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    public static final long f16585h = TimeUnit.SECONDS.toMillis(1);
    public static final io.sentry.util.a j = new io.sentry.util.a();

    public k0() {
        i0 i0Var = new i0(0);
        this.f16590d = new AtomicBoolean(false);
        this.f16592f = Executors.newSingleThreadExecutor(new j0(0));
        this.f16587a = f16584g;
        this.f16591e = i0Var;
        b();
    }

    public static k0 a() {
        if (f16586i == null) {
            r a7 = j.a();
            try {
                if (f16586i == null) {
                    f16586i = new k0();
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f16586i;
    }

    public final void b() {
        try {
            this.f16592f.submit(new d4.z(4, this)).get(f16585h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f16589c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f16589c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
