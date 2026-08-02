package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0609xh implements Callable {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0584wh f14925d = new C0584wh();

    /* renamed from: a, reason: collision with root package name */
    public final C0393p0 f14926a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f14927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14928c;

    public AbstractCallableC0609xh(C0393p0 c0393p0, Zk zk) {
        this.f14926a = c0393p0;
        this.f14927b = zk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th2) {
    }

    @NotNull
    public final C0393p0 b() {
        return this.f14926a;
    }

    public boolean c() {
        C0393p0 c0393p0 = this.f14926a;
        synchronized (c0393p0) {
            try {
                if (c0393p0.f14441d == null) {
                    c0393p0.f14442e = new CountDownLatch(1);
                    Intent a7 = c0393p0.f14445h.a(c0393p0.f14438a);
                    try {
                        c0393p0.f14444g.b(c0393p0.f14438a);
                        c0393p0.f14438a.bindService(a7, c0393p0.j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f14926a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f19194a;
    }

    public final boolean d() {
        return this.f14928c;
    }

    public final void a(boolean z5) {
        this.f14928c = z5;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f14928c) {
                return;
            }
            this.f14928c = true;
            int i5 = 0;
            do {
                C0393p0 c0393p0 = this.f14926a;
                synchronized (c0393p0) {
                    iAppMetricaService = c0393p0.f14441d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Zk zk = this.f14927b;
                        if (zk != null && !((C0234ii) zk).a()) {
                            return;
                        }
                        this.f14926a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i5++;
                if (!c() || O1.f12671e.get()) {
                    return;
                }
            } while (i5 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
