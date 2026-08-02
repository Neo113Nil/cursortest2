package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635yi implements InterfaceC0108dk {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C0610xi f14953e = new C0610xi();

    /* renamed from: f, reason: collision with root package name */
    public static final long f14954f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14955g;

    /* renamed from: a, reason: collision with root package name */
    public final C0393p0 f14956a;

    /* renamed from: b, reason: collision with root package name */
    public final Yj f14957b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f14958c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f14959d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f14954f = timeUnit.toMillis(1L);
        f14955g = timeUnit.toMillis(4L);
    }

    public C0635yi(@NotNull C0393p0 c0393p0, @NotNull Yj yj, @NotNull TimeProvider timeProvider) {
        this.f14956a = c0393p0;
        this.f14957b = yj;
        this.f14958c = timeProvider;
        this.f14959d = C0040b4.l().g().b();
    }

    public final void a(@NotNull C0559vh c0559vh) {
        Callable pg;
        ICommonExecutor iCommonExecutor = this.f14959d;
        if (c0559vh.f14795b) {
            Yj yj = this.f14957b;
            pg = new C0068c6(yj.f13235a, yj.f13236b, yj.f13237c, c0559vh);
        } else {
            Yj yj2 = this.f14957b;
            pg = new Pg(yj2.f13236b, yj2.f13237c, c0559vh);
        }
        iCommonExecutor.submit(pg);
    }

    public final void b(@NotNull C0559vh c0559vh) {
        long uptimeMillis = this.f14958c.uptimeMillis();
        Yj yj = this.f14957b;
        C0068c6 c0068c6 = new C0068c6(yj.f13235a, yj.f13236b, yj.f13237c, c0559vh);
        long j = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) ? f14954f : f14955g;
        if (this.f14956a.a()) {
            try {
                this.f14959d.submit(c0068c6).get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c0068c6.f14928c) {
            return;
        }
        try {
            c0068c6.a();
            Thread.sleep(Math.max(0L, j - (this.f14958c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0108dk
    public final void reportData(int i5, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f14959d;
        Yj yj = this.f14957b;
        iCommonExecutor.submit(new Nn(yj.f13236b, yj.f13237c, i5, bundle));
    }

    public C0635yi(@NotNull C0393p0 c0393p0, @NotNull Yj yj) {
        this(c0393p0, yj, new SystemTimeProvider());
    }

    public final void a(@NotNull Bf bf2) {
        ICommonExecutor iCommonExecutor = this.f14959d;
        Yj yj = this.f14957b;
        iCommonExecutor.submit(new C0456re(yj.f13236b, yj.f13237c, bf2));
    }

    public final void b(@NotNull Bf bf2) {
        ICommonExecutor iCommonExecutor = this.f14959d;
        Yj yj = this.f14957b;
        iCommonExecutor.submit(new Ei(yj.f13236b, yj.f13237c, bf2));
    }
}
