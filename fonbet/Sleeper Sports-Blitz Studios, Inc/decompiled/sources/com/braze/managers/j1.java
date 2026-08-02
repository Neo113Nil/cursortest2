package com.braze.managers;

import android.app.AlarmManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.storage.b3;
import com.braze.storage.h3;
import com.braze.storage.k1;
import com.braze.storage.m2;
import com.braze.storage.n3;
import com.braze.storage.s2;
import com.braze.storage.v2;
import com.braze.storage.w1;
import com.braze.storage.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class j1 implements r0 {
    public final p A;
    public final k0 B;
    public final j C;
    public final com.braze.storage.p D;
    public final com.braze.requests.i E;
    public final com.braze.requests.framework.g F;
    public final com.braze.triggers.managers.f G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f593a;
    public final BrazeConfigurationProvider b;
    public final o0 c;
    public final v0 d;
    public final n0 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final v2 i;
    public final com.braze.storage.t0 j;
    public final com.braze.requests.util.a k;
    public final n3 l;
    public final com.braze.storage.v0 m;
    public final com.braze.events.d n;
    public final b3 o;
    public final g0 p;
    public final com.braze.events.a q;
    public final com.braze.dispatch.f r;
    public final w s;
    public final h0 t;
    public final y0 u;
    public final s2 v;
    public final m2 w;
    public final w2 x;
    public final r y;
    public final BrazeGeofenceManager z;

    public j1(Context applicationContext, com.braze.configuration.e offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, com.braze.events.e externalEventPublisher, o0 deviceIdProvider, q0 registrationDataProvider, v0 pushDeliveryManager, boolean z, boolean z2, n0 deviceDataProvider, boolean z3) {
        Context context;
        com.braze.storage.v0 v0Var;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(offlineUserStorageProvider, "offlineUserStorageProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
        this.f593a = applicationContext;
        this.b = configurationProvider;
        this.c = deviceIdProvider;
        this.d = pushDeliveryManager;
        this.e = deviceDataProvider;
        this.f = z3;
        String a2 = offlineUserStorageProvider.a();
        this.g = a2;
        String str = configurationProvider.getBrazeApiKey().f639a;
        this.h = str;
        v2 v2Var = new v2(applicationContext);
        this.i = v2Var;
        com.braze.storage.t0 t0Var = new com.braze.storage.t0(applicationContext);
        this.j = t0Var;
        com.braze.requests.util.a aVar = new com.braze.requests.util.a(applicationContext);
        this.k = aVar;
        com.braze.events.d dVar = new com.braze.events.d(v2Var, t0Var, true);
        this.n = dVar;
        b3 b3Var = new b3(applicationContext, str, dVar);
        this.o = b3Var;
        this.p = new g0(applicationContext, a2, str, b3Var, dVar, new com.braze.communication.dust.i(), new com.braze.requests.util.b(b3Var.j(), b3Var.k(), b3Var.k(), b3Var.l()));
        new h1(b3Var, dVar, applicationContext);
        k1 k1Var = new k1(new h3(applicationContext, a2, str), dVar);
        com.braze.dispatch.f fVar = new com.braze.dispatch.f(applicationContext, dVar, new com.braze.dispatch.a(applicationContext));
        this.r = fVar;
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        w wVar = new w(applicationContext, k1Var, dVar, externalEventPublisher, (AlarmManager) systemService, configurationProvider.getSessionTimeoutSeconds(), configurationProvider.isSessionStartBasedTimeoutEnabled());
        this.s = wVar;
        h0 h0Var = new h0(new w1(new com.braze.storage.j(applicationContext, a2, str), dVar));
        this.t = h0Var;
        y0 y0Var = new y0(applicationContext, str, a2, dVar, b3Var);
        this.u = y0Var;
        this.v = new s2(applicationContext, a2, str);
        s sVar = new s(applicationContext, dVar, b3Var);
        m2 m2Var = new m2(applicationContext, str, a2);
        this.w = m2Var;
        w2 w2Var = new w2(applicationContext, a2, str);
        this.x = w2Var;
        r rVar = new r(applicationContext, a2, str, wVar, dVar, configurationProvider, b3Var, h0Var, sVar, v2Var, y0Var, pushDeliveryManager, m2Var, t0Var);
        this.y = rVar;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(applicationContext, str, rVar, configurationProvider, b3Var, dVar);
        this.z = brazeGeofenceManager;
        p pVar = new p(applicationContext, rVar, configurationProvider);
        this.A = pVar;
        k0 k0Var = new k0(applicationContext, str, a2, dVar, externalEventPublisher, b3Var, rVar);
        this.B = k0Var;
        j jVar = new j(applicationContext, str, a2, dVar, externalEventPublisher, b3Var, rVar);
        this.C = jVar;
        com.braze.storage.p pVar2 = new com.braze.storage.p(applicationContext, a2, str, rVar, Constants.BRAZE_SDK_VERSION);
        this.D = pVar2;
        int i = com.braze.communication.c.f473a;
        com.braze.requests.v vVar = new com.braze.requests.v(new com.braze.communication.e(new com.braze.communication.b(com.braze.communication.c.f473a)), dVar, externalEventPublisher, b3Var, pVar2, rVar, aVar);
        this.E = new com.braze.requests.i(dVar, rVar);
        com.braze.requests.framework.g gVar = new com.braze.requests.framework.g(new com.braze.dispatch.h(this), vVar, z, z3);
        this.F = gVar;
        com.braze.triggers.managers.f fVar2 = new com.braze.triggers.managers.f(applicationContext, rVar, dVar, externalEventPublisher, configurationProvider, a2, str, gVar);
        this.G = fVar2;
        if (Intrinsics.areEqual(a2, "")) {
            context = applicationContext;
            n3 n3Var = new n3(context, registrationDataProvider, v2Var, t0Var, null, null);
            Intrinsics.checkNotNullParameter(n3Var, "<set-?>");
            this.l = n3Var;
            com.braze.storage.v0 v0Var2 = new com.braze.storage.v0(context, null, null);
            Intrinsics.checkNotNullParameter(v0Var2, "<set-?>");
            this.m = v0Var2;
        } else {
            context = applicationContext;
            n3 n3Var2 = new n3(context, registrationDataProvider, v2Var, t0Var, a2, str);
            Intrinsics.checkNotNullParameter(n3Var2, "<set-?>");
            this.l = n3Var2;
            com.braze.storage.v0 v0Var3 = new com.braze.storage.v0(context, a2, str);
            Intrinsics.checkNotNullParameter(v0Var3, "<set-?>");
            this.m = v0Var3;
        }
        synchronized (fVar) {
            fVar.l = z2;
            fVar.b();
            if (z2) {
                fVar.f();
            } else {
                fVar.c();
            }
        }
        n3 d = d();
        com.braze.storage.v0 v0Var4 = this.m;
        if (v0Var4 != null) {
            v0Var = v0Var4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            v0Var = null;
        }
        this.q = new com.braze.events.a(context, pVar, dVar, rVar, d, v0Var, fVar2, fVar2.h, h0Var, brazeGeofenceManager, externalEventPublisher, configurationProvider, pVar2, w2Var, b3Var, k0Var, pushDeliveryManager, jVar);
    }

    public final String a() {
        return this.h;
    }

    public final Context b() {
        return this.f593a;
    }

    public final String c() {
        return this.g;
    }

    public final n3 d() {
        n3 n3Var = this.l;
        if (n3Var != null) {
            return n3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }
}
