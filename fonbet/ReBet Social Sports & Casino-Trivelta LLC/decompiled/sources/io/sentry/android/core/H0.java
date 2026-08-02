package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC4779m;
import io.sentry.C4665a3;
import io.sentry.C4733c3;
import io.sentry.C4866x2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4770k0;
import io.sentry.N1;
import io.sentry.P1;
import io.sentry.V3;
import io.sentry.X1;
import io.sentry.protocol.C4799a;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class H0 {
    public static /* synthetic */ void a(V3.b bVar, boolean z10, AtomicReference atomicReference, F3 f32, InterfaceC4730c0 interfaceC4730c0) {
        V3 M10 = interfaceC4730c0.M();
        if (M10 == null) {
            f32.getLogger().c(EnumC4788n3.INFO, "Session is null on updateSession", new Object[0]);
        } else if (M10.q(bVar, null, z10, null)) {
            if (M10.l() == V3.b.Crashed) {
                M10.c();
                interfaceC4730c0.U();
            }
            atomicReference.set(M10);
        }
    }

    public static void d(io.sentry.android.core.performance.n nVar, List list) {
        if (nVar.k()) {
            X1.D().i().getLogger().c(EnumC4788n3.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (nVar.l()) {
            X1.D().i().getLogger().c(EnumC4788n3.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("description", nVar.b());
        hashMap.put("start_timestamp_ms", Long.valueOf(nVar.h()));
        hashMap.put("end_timestamp_ms", Long.valueOf(nVar.e()));
        list.add(hashMap);
    }

    public static io.sentry.protocol.u e(byte[] bArr, boolean z10) {
        X1 D10 = X1.D();
        F3 i10 = D10.i();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                InterfaceC4770k0 serializer = i10.getSerializer();
                C4866x2 a10 = i10.getEnvelopeReader().a(byteArrayInputStream);
                if (a10 == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                V3.b bVar = null;
                boolean z11 = false;
                for (C4665a3 c4665a3 : a10.c()) {
                    arrayList.add(c4665a3);
                    C4733c3 N10 = c4665a3.N(serializer);
                    if (N10 != null) {
                        if (N10.y0()) {
                            bVar = V3.b.Crashed;
                        }
                        if (N10.y0() || N10.z0()) {
                            z11 = true;
                        }
                    }
                }
                V3 k10 = k(D10, i10, bVar, z11);
                if (k10 != null) {
                    arrayList.add(C4665a3.K(serializer, k10));
                    g(i10, (z10 && D10.i().getThreadChecker().a()) ? false : true);
                    if (z10) {
                        D10.t();
                    }
                }
                io.sentry.protocol.u s10 = D10.s(new C4866x2(a10.b(), arrayList));
                byteArrayInputStream.close();
                return s10;
            } finally {
            }
        } catch (Throwable th2) {
            i10.getLogger().b(EnumC4788n3.ERROR, "Failed to capture envelope", th2);
            return null;
        }
    }

    public static void f(F3 f32) {
        String cacheDirPath = f32.getCacheDirPath();
        if (cacheDirPath == null) {
            f32.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else {
            if (io.sentry.cache.f.t(cacheDirPath).delete()) {
                return;
            }
            f32.getLogger().c(EnumC4788n3.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }

    public static void g(final F3 f32, boolean z10) {
        if (z10) {
            f(f32);
            return;
        }
        try {
            f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.G0
                @Override // java.lang.Runnable
                public final void run() {
                    H0.f(F3.this);
                }
            });
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.WARNING, "Submission of deletion of the current session file rejected.", th2);
        }
    }

    public static Map h() {
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        ArrayList arrayList = new ArrayList();
        d(v10.e(), arrayList);
        d(v10.t(), arrayList);
        Iterator it = v10.u().iterator();
        while (it.hasNext()) {
            d((io.sentry.android.core.performance.n) it.next(), arrayList);
        }
        for (io.sentry.android.core.performance.c cVar : v10.f()) {
            d(cVar.b(), arrayList);
            d(cVar.c(), arrayList);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spans", arrayList);
        hashMap.put("type", v10.s().toString().toLowerCase(Locale.ROOT));
        if (v10.o().m()) {
            hashMap.put("app_start_timestamp_ms", Long.valueOf(v10.o().h()));
        }
        return hashMap;
    }

    public static InterfaceC4730c0 i() {
        final AtomicReference atomicReference = new AtomicReference();
        X1.D().n(P1.COMBINED, new N1() { // from class: io.sentry.android.core.E0
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                atomicReference.set(interfaceC4730c0.m130clone());
            }
        });
        return (InterfaceC4730c0) atomicReference.get();
    }

    public static Map j(Context context, SentryAndroidOptions sentryAndroidOptions, InterfaceC4730c0 interfaceC4730c0) {
        HashMap hashMap = new HashMap();
        if (interfaceC4730c0 != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.util.v vVar = new io.sentry.util.v(hashMap);
                C4713v0 i10 = C4713v0.i(context, sentryAndroidOptions);
                interfaceC4730c0.B().r(i10.a(true, true));
                interfaceC4730c0.B().v(i10.j());
                io.sentry.protocol.F user = interfaceC4730c0.getUser();
                if (user == null) {
                    user = new io.sentry.protocol.F();
                    interfaceC4730c0.j(user);
                }
                if (user.i() == null) {
                    try {
                        user.m(D0.a(context));
                    } catch (RuntimeException e10) {
                        logger.b(EnumC4788n3.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                C4799a d10 = interfaceC4730c0.B().d();
                if (d10 == null) {
                    d10 = new C4799a();
                }
                d10.o(AbstractC4704q0.i(context));
                io.sentry.android.core.performance.n q10 = io.sentry.android.core.performance.m.v().q(sentryAndroidOptions);
                if (q10.m()) {
                    d10.p(AbstractC4779m.o(q10.g()));
                }
                C4683i0 c4683i0 = new C4683i0(sentryAndroidOptions.getLogger());
                PackageInfo o10 = AbstractC4704q0.o(context, 4096, sentryAndroidOptions.getLogger(), c4683i0);
                if (o10 != null) {
                    AbstractC4704q0.x(o10, c4683i0, i10, d10);
                }
                interfaceC4730c0.B().o(d10);
                vVar.d("user").j(logger, interfaceC4730c0.getUser());
                vVar.d("contexts").j(logger, interfaceC4730c0.B());
                vVar.d("tags").j(logger, interfaceC4730c0.y());
                vVar.d("extras").j(logger, interfaceC4730c0.getExtras());
                vVar.d("fingerprint").j(logger, interfaceC4730c0.E());
                vVar.d("level").j(logger, interfaceC4730c0.N());
                vVar.d("breadcrumbs").j(logger, interfaceC4730c0.w());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return hashMap;
    }

    public static V3 k(InterfaceC4740e0 interfaceC4740e0, final F3 f32, final V3.b bVar, final boolean z10) {
        final AtomicReference atomicReference = new AtomicReference();
        interfaceC4740e0.l(new N1() { // from class: io.sentry.android.core.F0
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                H0.a(V3.b.this, z10, atomicReference, f32, interfaceC4730c0);
            }
        });
        return (V3) atomicReference.get();
    }
}
