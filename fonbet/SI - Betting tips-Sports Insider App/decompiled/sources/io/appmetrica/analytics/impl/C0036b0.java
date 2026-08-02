package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0642z0 f13364a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f13365b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f13366c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13367d = TimeUnit.SECONDS.toMillis(10);

    public C0036b0(C0642z0 c0642z0, Wk wk, R3 r32) {
        this.f13364a = c0642z0;
        this.f13365b = wk;
        this.f13366c = r32;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f13364a.getClass();
        if (C0642z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f13365b.a();
        this.f13364a.getClass();
        C0617y0 a7 = C0617y0.a(context);
        a7.f14942d.a(null, a7);
        IHandlerExecutor a10 = this.f13366c.a();
        ((C0651z9) a10).f14990b.post(new androidx.fragment.app.d(this, context, appMetricaLibraryAdapterConfig, 14));
        this.f13364a.getClass();
        C0642z0.b();
    }

    public static final void a(C0036b0 c0036b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0036b0.f13364a.getClass();
        C0617y0 a7 = C0617y0.a(context);
        a7.f().a(appMetricaLibraryAdapterConfig);
        C0040b4.l().f13374c.a().execute(new RunnableC0568w1(a7.f14939a));
    }
}
