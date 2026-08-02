package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393p0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f14437k = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f14438a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f14439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14440c;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f14441d;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f14442e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14443f;

    /* renamed from: g, reason: collision with root package name */
    public final F1 f14444g;

    /* renamed from: h, reason: collision with root package name */
    public final G1 f14445h;

    /* renamed from: i, reason: collision with root package name */
    public final RunnableC0343n0 f14446i;
    public final ServiceConnectionC0368o0 j;

    public C0393p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C0040b4.l().e(), new G1());
    }

    public final synchronized boolean a() {
        return this.f14441d != null;
    }

    public final void b() {
        synchronized (this.f14443f) {
            this.f14439b.remove(this.f14446i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f14439b;
        synchronized (this.f14443f) {
            try {
                iCommonExecutor.remove(this.f14446i);
                if (!this.f14440c) {
                    iCommonExecutor.executeDelayed(this.f14446i, f14437k);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Long l6) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f14442e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l6.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public C0393p0(Context context, ICommonExecutor iCommonExecutor, F1 f12, G1 g12) {
        this.f14441d = null;
        this.f14443f = new Object();
        this.f14446i = new RunnableC0343n0(this);
        this.j = new ServiceConnectionC0368o0(this);
        this.f14438a = context.getApplicationContext();
        this.f14439b = iCommonExecutor;
        this.f14440c = false;
        this.f14444g = f12;
        this.f14445h = g12;
    }
}
