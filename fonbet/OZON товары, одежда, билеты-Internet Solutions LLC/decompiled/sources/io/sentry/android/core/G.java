package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.A2;
import io.sentry.C7141f;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7129c;
import io.sentry.W2;
import io.sentry.a3;
import io.sentry.android.core.K;
import io.sentry.j3;
import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.C7189e;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G implements InterfaceC7129c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66898a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f66899b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f66900c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A2 f66901d;

    /* renamed from: e, reason: collision with root package name */
    private final io.sentry.cache.l f66902e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<b> f66903f = Collections.singletonList(new a());

    private final class a implements b {
        a() {
        }

        @Override // io.sentry.android.core.G.b
        public final boolean a(@NotNull io.sentry.hints.c cVar) {
            return cVar instanceof io.sentry.hints.a;
        }

        @Override // io.sentry.android.core.G.b
        public final void b(@NotNull C7230z2 c7230z2, @NotNull io.sentry.hints.c cVar) {
            boolean equals = cVar instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) cVar).d()) : false;
            boolean z11 = !equals;
            C7185a d11 = c7230z2.C().d();
            if (d11 == null) {
                d11 = new C7185a();
                c7230z2.C().o(d11);
            }
            if (d11.l() == null) {
                d11.r(Boolean.valueOf(z11));
            }
            if (c7230z2.o0() == null) {
                c7230z2.y0(Arrays.asList("{{ default }}", equals ? "background-anr" : "foreground-anr"));
            }
        }

        @Override // io.sentry.android.core.G.b
        public final void c(@NotNull C7230z2 c7230z2, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2) {
            io.sentry.protocol.z zVar;
            boolean equals = cVar2 instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) cVar2).d()) : false;
            G g10 = G.this;
            g10.getClass();
            if (c7230z2.I() == null) {
                c7230z2.W("java");
            }
            if (c7230z2.n0() != null) {
                return;
            }
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            if (cVar.e()) {
                lVar.r("AppExitInfo");
            } else {
                lVar.r("HistoricalAppExitInfo");
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(equals ? "Background ANR" : "ANR", Thread.currentThread());
            ArrayList s02 = c7230z2.s0();
            if (s02 != null) {
                Iterator it = s02.iterator();
                while (it.hasNext()) {
                    zVar = (io.sentry.protocol.z) it.next();
                    String m11 = zVar.m();
                    if (m11 != null && m11.equals("main")) {
                        break;
                    }
                }
            }
            zVar = null;
            if (zVar == null) {
                zVar = new io.sentry.protocol.z();
                zVar.y(new io.sentry.protocol.y());
            }
            g10.f66901d.getClass();
            c7230z2.x0(A2.c(zVar, lVar, applicationNotResponding));
        }
    }

    private interface b {
        boolean a(@NotNull io.sentry.hints.c cVar);

        void b(@NotNull C7230z2 c7230z2, @NotNull io.sentry.hints.c cVar);

        void c(@NotNull C7230z2 c7230z2, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2);
    }

    public G(@NotNull Context context, @NotNull I i11, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f66898a = applicationContext != null ? applicationContext : context;
        this.f66899b = sentryAndroidOptions;
        this.f66900c = i11;
        this.f66902e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f66901d = new A2(new a3(sentryAndroidOptions));
    }

    private <T> T b(@NotNull W2 w22, @NotNull String str, @NotNull Class<T> cls) {
        io.sentry.cache.l lVar = this.f66902e;
        if (lVar == null) {
            return null;
        }
        return (T) lVar.G(w22, str, cls);
    }

    @Override // io.sentry.InterfaceC7227z
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11) {
        b bVar;
        Object obj;
        String str;
        String str2;
        File[] fileArr;
        DisplayMetrics displayMetrics;
        String str3;
        Object d11 = e11.d("sentry:typeCheckHint");
        boolean z11 = d11 instanceof io.sentry.hints.c;
        SentryAndroidOptions sentryAndroidOptions = this.f66899b;
        if (!z11) {
            sentryAndroidOptions.getLogger().c(I2.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c7230z2;
        }
        io.sentry.hints.c cVar = (io.sentry.hints.c) d11;
        Iterator<b> it = this.f66903f.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.a((io.sentry.hints.c) d11)) {
                break;
            }
        }
        if (bVar != null) {
            bVar.c(c7230z2, cVar, (io.sentry.hints.c) d11);
        }
        io.sentry.protocol.n h11 = c7230z2.C().h();
        Context context = this.f66898a;
        c7230z2.C().t(P.c(context, sentryAndroidOptions).d());
        if (h11 != null) {
            String g10 = h11.g();
            c7230z2.C().l(h11, (g10 == null || g10.isEmpty()) ? "os_1" : "os_" + g10.trim().toLowerCase(Locale.ROOT));
        }
        C7189e e12 = c7230z2.C().e();
        I i11 = this.f66900c;
        if (e12 == null) {
            C7187c C11 = c7230z2.C();
            C7189e c7189e = new C7189e();
            String str4 = Build.MANUFACTURER;
            c7189e.b0();
            String str5 = Build.BRAND;
            c7189e.P();
            c7189e.V(K.c(sentryAndroidOptions.getLogger()));
            String str6 = Build.MODEL;
            c7189e.d0();
            String str7 = Build.ID;
            c7189e.e0();
            c7189e.L(Build.SUPPORTED_ABIS);
            ActivityManager.MemoryInfo d12 = K.d(context, sentryAndroidOptions.getLogger());
            if (d12 != null) {
                c7189e.c0(Long.valueOf(d12.totalMem));
            }
            c7189e.n0(i11.a());
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th2) {
                logger.a(I2.ERROR, "Error getting DisplayMetrics.", th2);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c7189e.m0(Integer.valueOf(displayMetrics.widthPixels));
                c7189e.l0(Integer.valueOf(displayMetrics.heightPixels));
                c7189e.j0(Float.valueOf(displayMetrics.density));
                c7189e.k0(Integer.valueOf(displayMetrics.densityDpi));
            }
            if (c7189e.J() == null) {
                try {
                    str3 = V.a(context);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting installationId.", th3);
                    str3 = null;
                }
                c7189e.Y(str3);
            }
            ArrayList b11 = io.sentry.android.core.internal.util.f.a().b();
            if (!b11.isEmpty()) {
                c7189e.i0(Double.valueOf(((Integer) Collections.max(b11)).doubleValue()));
                c7189e.h0(Integer.valueOf(b11.size()));
            }
            C11.q(c7189e);
        }
        if (!cVar.e()) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c7230z2;
        }
        if (c7230z2.K() == null) {
            c7230z2.Y((io.sentry.protocol.o) b(sentryAndroidOptions, "request.json", io.sentry.protocol.o.class));
        }
        if (c7230z2.P() == null) {
            c7230z2.d0((io.sentry.protocol.E) b(sentryAndroidOptions, "user.json", io.sentry.protocol.E.class));
        }
        Map map = (Map) b(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (c7230z2.N() == null) {
                c7230z2.c0(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c7230z2.N().containsKey(entry.getKey())) {
                        c7230z2.b0((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List<C7141f> list = (List) b(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list != null) {
            if (c7230z2.B() == null) {
                c7230z2.Q(list);
            } else {
                c7230z2.B().addAll(list);
            }
        }
        Map map2 = (Map) b(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (c7230z2.H() == null) {
                c7230z2.V(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!c7230z2.H().containsKey(entry2.getKey())) {
                        c7230z2.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        C7187c c7187c = (C7187c) b(sentryAndroidOptions, "contexts.json", C7187c.class);
        if (c7187c != null) {
            C7187c C12 = c7230z2.C();
            Iterator<Map.Entry<String, Object>> it2 = new C7187c(c7187c).b().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Object> next = it2.next();
                Object value = next.getValue();
                Iterator<Map.Entry<String, Object>> it3 = it2;
                if ((!"trace".equals(next.getKey()) || !(value instanceof j3)) && !C12.a(next.getKey())) {
                    C12.l(value, next.getKey());
                }
                it2 = it3;
            }
        }
        String str8 = (String) b(sentryAndroidOptions, "transaction.json", String.class);
        if (c7230z2.u0() == null) {
            c7230z2.F0(str8);
        }
        List<String> list2 = (List) b(sentryAndroidOptions, "fingerprint.json", List.class);
        if (c7230z2.o0() == null) {
            c7230z2.y0(list2);
        }
        I2 i22 = (I2) b(sentryAndroidOptions, "level.json", I2.class);
        if (c7230z2.p0() == null) {
            c7230z2.z0(i22);
        }
        j3 j3Var = (j3) b(sentryAndroidOptions, "trace.json", j3.class);
        if (c7230z2.C().j() == null && j3Var != null) {
            c7230z2.C().x(j3Var);
        }
        String str9 = (String) b(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            if (!new File(cacheDirPath, Nk.a.b("replay_", str9)).exists()) {
                String str10 = (String) io.sentry.cache.h.i(sentryAndroidOptions, "replay-error-sample-rate.json", String.class);
                if (str10 != null) {
                    try {
                        if (Double.parseDouble(str10) < io.sentry.util.u.a().d()) {
                            sentryAndroidOptions.getLogger().c(I2.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c7230z2.G());
                        } else {
                            File[] listFiles = new File(cacheDirPath).listFiles();
                            if (listFiles != null) {
                                int length = listFiles.length;
                                long j11 = Long.MIN_VALUE;
                                int i12 = 0;
                                String str11 = null;
                                while (i12 < length) {
                                    File file = listFiles[i12];
                                    if (file.isDirectory()) {
                                        fileArr = listFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > j11 && file.lastModified() <= c7230z2.t0().getTime()) {
                                            j11 = file.lastModified();
                                            str11 = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = listFiles;
                                    }
                                    i12++;
                                    listFiles = fileArr;
                                }
                                str9 = str11;
                            } else {
                                str9 = null;
                            }
                        }
                    } catch (Throwable th4) {
                        sentryAndroidOptions.getLogger().a(I2.ERROR, "Error parsing replay sample rate.", th4);
                    }
                }
            }
            if (str9 != null) {
                io.sentry.cache.l.J(sentryAndroidOptions, str9, "replay.json");
                c7230z2.C().l(str9, "replay_id");
            }
        }
        if (c7230z2.J() == null) {
            c7230z2.X((String) io.sentry.cache.h.i(sentryAndroidOptions, "release.json", String.class));
        }
        if (c7230z2.F() == null) {
            String str12 = (String) io.sentry.cache.h.i(sentryAndroidOptions, "environment.json", String.class);
            if (str12 == null) {
                str12 = sentryAndroidOptions.getEnvironment();
            }
            c7230z2.T(str12);
        }
        if (c7230z2.E() == null) {
            c7230z2.S((String) io.sentry.cache.h.i(sentryAndroidOptions, "dist.json", String.class));
        }
        if (c7230z2.E() == null && (str2 = (String) io.sentry.cache.h.i(sentryAndroidOptions, "release.json", String.class)) != null) {
            try {
                c7230z2.S(str2.substring(str2.indexOf(43) + 1));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(I2.WARNING, "Failed to parse release from scope cache: %s", str2);
            }
        }
        C7188d D11 = c7230z2.D();
        if (D11 == null) {
            D11 = new C7188d();
        }
        if (D11.d() == null) {
            D11.e(new ArrayList());
        }
        List<DebugImage> d13 = D11.d();
        if (d13 != null) {
            String str13 = (String) io.sentry.cache.h.i(sentryAndroidOptions, "proguard-uuid.json", String.class);
            if (str13 != null) {
                DebugImage debugImage = new DebugImage();
                obj = d11;
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str13);
                d13.add(debugImage);
            } else {
                obj = d11;
            }
            c7230z2.R(D11);
        } else {
            obj = d11;
        }
        if (c7230z2.L() == null) {
            c7230z2.Z((io.sentry.protocol.r) io.sentry.cache.h.i(sentryAndroidOptions, "sdk-version.json", io.sentry.protocol.r.class));
        }
        C7185a d14 = c7230z2.C().d();
        if (d14 == null) {
            d14 = new C7185a();
        }
        C7185a c7185a = d14;
        c7185a.o(K.b(context));
        PackageInfo e13 = K.e(context, i11);
        if (e13 != null) {
            c7185a.n(e13.packageName);
        }
        String J11 = c7230z2.J() != null ? c7230z2.J() : (String) io.sentry.cache.h.i(sentryAndroidOptions, "release.json", String.class);
        if (J11 != null) {
            try {
                String substring = J11.substring(J11.indexOf(64) + 1, J11.indexOf(43));
                String substring2 = J11.substring(J11.indexOf(43) + 1);
                c7185a.q(substring);
                c7185a.m(substring2);
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().c(I2.WARNING, "Failed to parse release from scope cache: %s", J11);
            }
        }
        try {
            K.b f7 = P.c(context, sentryAndroidOptions).f();
            if (f7 != null) {
                c7185a.t(Boolean.valueOf(f7.b()));
                if (f7.a() != null) {
                    c7185a.u(Arrays.asList(f7.a()));
                }
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting split apks info.", th5);
        }
        c7230z2.C().o(c7185a);
        Map map3 = (Map) io.sentry.cache.h.i(sentryAndroidOptions, "tags.json", Map.class);
        if (map3 != null) {
            if (c7230z2.N() == null) {
                c7230z2.c0(new HashMap(map3));
            } else {
                for (Map.Entry entry3 : map3.entrySet()) {
                    if (!c7230z2.N().containsKey(entry3.getKey())) {
                        c7230z2.b0((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.E P11 = c7230z2.P();
        if (P11 == null) {
            P11 = new io.sentry.protocol.E();
            c7230z2.d0(P11);
        }
        io.sentry.protocol.E e14 = P11;
        if (e14.j() == null) {
            try {
                str = V.a(context);
            } catch (Throwable th6) {
                sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting installationId.", th6);
                str = null;
            }
            e14.n(str);
        }
        if (e14.k() == null && sentryAndroidOptions.isSendDefaultPii()) {
            e14.o();
        }
        try {
            K.a e15 = P.c(context, sentryAndroidOptions).e();
            if (e15 != null) {
                for (Map.Entry entry4 : e15.a().entrySet()) {
                    c7230z2.b0((String) entry4.getKey(), (String) entry4.getValue());
                }
            }
        } catch (Throwable th7) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting side loaded info.", th7);
        }
        if (bVar != null) {
            bVar.b(c7230z2, (io.sentry.hints.c) obj);
        }
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull io.sentry.E e11) {
        return a11;
    }
}
