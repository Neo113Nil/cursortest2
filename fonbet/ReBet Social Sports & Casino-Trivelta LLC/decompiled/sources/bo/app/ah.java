package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ah implements z9 {

    /* renamed from: A, reason: collision with root package name */
    public final hd f25257A;

    /* renamed from: B, reason: collision with root package name */
    public final mg f25258B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25259a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f25260b;

    /* renamed from: c, reason: collision with root package name */
    public final h9 f25261c;

    /* renamed from: d, reason: collision with root package name */
    public final g9 f25262d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25263e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25264f;

    /* renamed from: g, reason: collision with root package name */
    public final xg f25265g;

    /* renamed from: h, reason: collision with root package name */
    public final z4 f25266h;

    /* renamed from: i, reason: collision with root package name */
    public final r7 f25267i;

    /* renamed from: j, reason: collision with root package name */
    public final ue f25268j;

    /* renamed from: k, reason: collision with root package name */
    public final g6 f25269k;

    /* renamed from: l, reason: collision with root package name */
    public final o7 f25270l;

    /* renamed from: m, reason: collision with root package name */
    public final k4 f25271m;

    /* renamed from: n, reason: collision with root package name */
    public final q2 f25272n;

    /* renamed from: o, reason: collision with root package name */
    public final u7 f25273o;

    /* renamed from: p, reason: collision with root package name */
    public final qc f25274p;

    /* renamed from: q, reason: collision with root package name */
    public final qd f25275q;

    /* renamed from: r, reason: collision with root package name */
    public final mc f25276r;

    /* renamed from: s, reason: collision with root package name */
    public final ie f25277s;

    /* renamed from: t, reason: collision with root package name */
    public final e2 f25278t;

    /* renamed from: u, reason: collision with root package name */
    public final BrazeGeofenceManager f25279u;

    /* renamed from: v, reason: collision with root package name */
    public final c2 f25280v;

    /* renamed from: w, reason: collision with root package name */
    public final g8 f25281w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f25282x;

    /* renamed from: y, reason: collision with root package name */
    public final x3 f25283y;

    /* renamed from: z, reason: collision with root package name */
    public final r6 f25284z;

    public ah(Context applicationContext, fb offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, m9 externalEventPublisher, h9 deviceIdProvider, p9 registrationDataProvider, hc pushDeliveryManager, boolean z10, boolean z11, g9 deviceDataProvider, boolean z12) {
        z4 z4Var;
        Context context;
        z4 z4Var2;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(offlineUserStorageProvider, "offlineUserStorageProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
        this.f25259a = applicationContext;
        this.f25260b = configurationProvider;
        this.f25261c = deviceIdProvider;
        this.f25262d = deviceDataProvider;
        String a10 = offlineUserStorageProvider.a();
        this.f25263e = a10;
        String str = configurationProvider.getBrazeApiKey().f25307a;
        this.f25264f = str;
        he heVar = new he(applicationContext);
        u4 u4Var = new u4(applicationContext);
        a7 a7Var = new a7(applicationContext);
        r7 r7Var = new r7(heVar, u4Var, true);
        this.f25267i = r7Var;
        ue ueVar = new ue(applicationContext, str, r7Var);
        this.f25268j = ueVar;
        this.f25269k = new g6(applicationContext, a10, str, ueVar, r7Var, new o6(), new x7(ueVar.j(), ueVar.k(), ueVar.k(), ueVar.l()));
        new xd(ueVar, r7Var, applicationContext);
        f7 f7Var = new f7(new hf(applicationContext, a10, str), r7Var);
        k4 k4Var = new k4(applicationContext, r7Var, new d4(applicationContext));
        this.f25271m = k4Var;
        Object systemService = applicationContext.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        q2 q2Var = new q2(applicationContext, f7Var, r7Var, externalEventPublisher, (AlarmManager) systemService, configurationProvider.getSessionTimeoutSeconds(), configurationProvider.isSessionStartBasedTimeoutEnabled());
        this.f25272n = q2Var;
        u7 u7Var = new u7(new t7(new q1(applicationContext, a10, str), r7Var));
        this.f25273o = u7Var;
        qc qcVar = new qc(applicationContext, str, a10, r7Var, ueVar);
        this.f25274p = qcVar;
        this.f25275q = new qd(applicationContext, a10, str);
        f2 f2Var = new f2(applicationContext, r7Var, ueVar);
        mc mcVar = new mc(applicationContext, str, a10);
        this.f25276r = mcVar;
        ie ieVar = new ie(applicationContext, a10, str);
        this.f25277s = ieVar;
        e2 e2Var = new e2(applicationContext, a10, str, q2Var, r7Var, configurationProvider, ueVar, u7Var, f2Var, heVar, qcVar, pushDeliveryManager, mcVar, u4Var);
        this.f25278t = e2Var;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(applicationContext, str, e2Var, configurationProvider, ueVar, r7Var);
        this.f25279u = brazeGeofenceManager;
        c2 c2Var = new c2(applicationContext, e2Var, configurationProvider);
        this.f25280v = c2Var;
        g8 g8Var = new g8(applicationContext, str, a10, r7Var, externalEventPublisher, ueVar, e2Var);
        this.f25281w = g8Var;
        d0 d0Var = new d0(applicationContext, str, a10, r7Var, externalEventPublisher, ueVar, e2Var);
        this.f25282x = d0Var;
        x3 x3Var = new x3(applicationContext, a10, str, e2Var);
        this.f25283y = x3Var;
        int i10 = x8.f26266a;
        cd cdVar = new cd(new ta(new w8(x8.f26266a)), r7Var, externalEventPublisher, ueVar, x3Var, e2Var, a7Var);
        this.f25284z = new r6(r7Var, e2Var);
        hd hdVar = new hd(new q5(this), cdVar, z10, z12);
        this.f25257A = hdVar;
        mg mgVar = new mg(applicationContext, e2Var, r7Var, externalEventPublisher, configurationProvider, a10, str, hdVar);
        this.f25258B = mgVar;
        if (Intrinsics.areEqual(a10, "")) {
            z4Var = null;
            context = applicationContext;
            xg xgVar = new xg(context, registrationDataProvider, heVar, u4Var, null, null);
            Intrinsics.checkNotNullParameter(xgVar, "<set-?>");
            this.f25265g = xgVar;
            z4 z4Var3 = new z4(context, null, null);
            Intrinsics.checkNotNullParameter(z4Var3, "<set-?>");
            this.f25266h = z4Var3;
        } else {
            z4Var = null;
            context = applicationContext;
            xg xgVar2 = new xg(context, registrationDataProvider, heVar, u4Var, a10, str);
            Intrinsics.checkNotNullParameter(xgVar2, "<set-?>");
            this.f25265g = xgVar2;
            z4 z4Var4 = new z4(context, a10, str);
            Intrinsics.checkNotNullParameter(z4Var4, "<set-?>");
            this.f25266h = z4Var4;
        }
        synchronized (k4Var) {
            try {
                k4Var.f25651l = z11;
                k4Var.b();
                if (z11) {
                    k4Var.f();
                } else {
                    k4Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xg a11 = a();
        z4 z4Var5 = this.f25266h;
        if (z4Var5 != null) {
            z4Var2 = z4Var5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            z4Var2 = z4Var;
        }
        this.f25270l = new o7(context, c2Var, r7Var, e2Var, a11, z4Var2, mgVar, mgVar.f25771h, u7Var, brazeGeofenceManager, externalEventPublisher, configurationProvider, x3Var, ieVar, ueVar, g8Var, pushDeliveryManager, d0Var);
    }

    public final xg a() {
        xg xgVar = this.f25265g;
        if (xgVar != null) {
            return xgVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }
}
