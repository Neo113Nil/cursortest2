package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC4772k2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.N1;
import io.sentry.V3;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C4843a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f50877a = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public static final C4843a f50878b = new C4843a();

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, InterfaceC4730c0 interfaceC4730c0) {
        V3 M10 = interfaceC4730c0.M();
        if (M10 == null || M10.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, AbstractC4772k2.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean z10;
        io.sentry.util.s sVar = new io.sentry.util.s();
        boolean d10 = sVar.d("timber.log.Timber", sentryAndroidOptions);
        boolean z11 = true;
        if (sVar.d("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && sVar.d("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z10 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        boolean z12 = (d10 && sVar.d("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) ? z10 : false;
        boolean d11 = sVar.d("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean d12 = sVar.d("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        C4683i0 c4683i0 = new C4683i0(iLogger);
        io.sentry.util.s sVar2 = new io.sentry.util.s();
        C4682i c4682i = new C4682i(sVar2, sentryAndroidOptions);
        M.i(sentryAndroidOptions, context, iLogger, c4683i0);
        M.h(context, sentryAndroidOptions, c4683i0, sVar2, c4682i, z11, z12, d11, d12);
        boolean z13 = z12;
        boolean z14 = z11;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        if (sentryAndroidOptions.isEnablePerformanceV2() && c4683i0.d() >= 24) {
            io.sentry.android.core.performance.n o10 = v10.o();
            if (o10.k()) {
                o10.p(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            v10.B((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.n w10 = v10.w();
        if (w10.k()) {
            w10.p(f50877a);
        }
        M.g(sentryAndroidOptions, context, c4683i0, sVar2, c4682i, d11);
        d(sentryAndroidOptions, z14, z13);
    }

    public static void d(F3 f32, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC4839u0 interfaceC4839u0 : f32.getIntegrations()) {
            if (z10 && (interfaceC4839u0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC4839u0);
            }
            if (z11 && (interfaceC4839u0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC4839u0);
            }
            if (interfaceC4839u0 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(interfaceC4839u0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                f32.getIntegrations().remove((InterfaceC4839u0) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                f32.getIntegrations().remove((InterfaceC4839u0) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                f32.getIntegrations().remove((InterfaceC4839u0) arrayList3.get(i12));
            }
        }
    }

    public static void e(Context context, ILogger iLogger) {
        f(context, iLogger, new AbstractC4772k2.a() { // from class: io.sentry.android.core.X0
            @Override // io.sentry.AbstractC4772k2.a
            public final void a(F3 f32) {
                a1.a((SentryAndroidOptions) f32);
            }
        });
    }

    public static void f(final Context context, final ILogger iLogger, final AbstractC4772k2.a aVar) {
        try {
            InterfaceC4765j0 d10 = f50878b.d();
            try {
                AbstractC4772k2.u(new c1(), new AbstractC4772k2.a() { // from class: io.sentry.android.core.Y0
                    @Override // io.sentry.AbstractC4772k2.a
                    public final void a(F3 f32) {
                        a1.c(ILogger.this, context, aVar, (SentryAndroidOptions) f32);
                    }
                }, true);
                InterfaceC4740e0 p10 = AbstractC4772k2.p();
                if (AbstractC4704q0.s()) {
                    if (p10.i().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        p10.l(new N1() { // from class: io.sentry.android.core.Z0
                            @Override // io.sentry.N1
                            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                                a1.b(atomicBoolean, interfaceC4730c0);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            p10.t();
                        }
                    }
                    p10.i().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.b(EnumC4788n3.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.b(EnumC4788n3.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.b(EnumC4788n3.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.b(EnumC4788n3.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static void g(Context context, AbstractC4772k2.a aVar) {
        f(context, new C(), aVar);
    }
}
