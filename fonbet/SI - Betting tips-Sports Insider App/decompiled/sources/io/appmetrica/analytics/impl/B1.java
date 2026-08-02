package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import j$.util.Objects;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class B1 implements A1, InterfaceC0467s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12020a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12021b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0643z1 f12022c;

    /* renamed from: d, reason: collision with root package name */
    public final C0014a4 f12023d;

    /* renamed from: e, reason: collision with root package name */
    public final J1 f12024e;

    /* renamed from: f, reason: collision with root package name */
    public Sg f12025f;

    /* renamed from: g, reason: collision with root package name */
    public final C0123ea f12026g;

    /* renamed from: h, reason: collision with root package name */
    public final C0167g2 f12027h;

    /* renamed from: i, reason: collision with root package name */
    public final C1 f12028i;
    public final C0105dh j;

    public B1(@NonNull Context context, @NonNull InterfaceC0643z1 interfaceC0643z1) {
        this(context, interfaceC0643z1, new C0093d5(context));
    }

    public final void a() {
        this.f12024e.c(new jp(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f12024e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f12023d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f12027h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        J1 j12 = this.f12024e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f12405a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f12406b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0353na.I.v().a(AbstractC0176gb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C0353na.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f12020a) {
            C0353na.I.v().a(this.f12021b.getResources().getConfiguration());
        } else {
            this.f12026g.b(this.f12021b);
            C0353na c0353na = C0353na.I;
            synchronized (c0353na) {
                c0353na.B.initAsync();
                c0353na.f14339u.a(c0353na.f14321a);
                c0353na.f14339u.a(new C0266jo(c0353na.B));
                NetworkServiceLocator.init(c0353na.f14321a, new C0144f5(new C0411pi(c0353na.h()), new C0398p5(c0353na.f14321a)));
                c0353na.l().a(c0353na.q);
                c0353na.E();
            }
            Wj.f13112a.e();
            C0213hm c0213hm = C0353na.I.f14339u;
            c0213hm.b();
            C0161fm b10 = c0213hm.b();
            C0612xk p10 = C0353na.I.p();
            p10.a(new C0082ck(new C0023ad(this.f12024e)), b10);
            c0213hm.a(p10);
            ((Al) C0353na.I.z()).getClass();
            a();
            C0353na.I.m().init();
            C0353na.I.c().init();
            C1 c12 = this.f12028i;
            Context context = this.f12021b;
            C0014a4 c0014a4 = this.f12023d;
            c12.getClass();
            this.f12025f = new Sg(context, c0014a4);
            Context context2 = this.f12021b;
            AbstractC0518u1.f14693a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f12021b;
            Sg sg2 = this.f12025f;
            Od r5 = C0353na.k().r();
            IHandlerExecutor d10 = C0353na.k().w().d();
            C0171g6 c0171g6 = new C0171g6(context3, sg2, EnumC0047bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0171g6 c0171g62 = new C0171g6(context3, sg2, EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0329mb(), d10, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0119e6 fileObserverC0119e6 = new FileObserverC0119e6(crashesDirectory, c0171g62, new C0020aa());
                d10.execute(new Uf(crashesDirectory, c0171g6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0119e6.startWatching();
                C0353na.I.E.storeReference(fileObserverC0119e6);
            }
            r5.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r5.f12687a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r5.f12687a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Jd b11 = r5.f12688b.b(context3, sg2);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b11.newCrash((NativeCrash) it.next());
                    }
                }
                r5.f12687a.setDefaultCrashHandler(r5.f12688b.a(context3, sg2));
            }
            new I5(kotlin.collections.t.c(new Yg())).run();
            this.f12020a = true;
        }
        C0353na.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Fb l6 = C0353na.I.l();
        synchronized (l6) {
            Iterator it = l6.f12222c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0313lk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Bf bf2;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f12059c;
        try {
            bf2 = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf2 = null;
        }
        Integer asInteger = bf2 != null ? bf2.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f12027h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i5, Bundle bundle) {
        this.j.getClass();
        List list = (List) C0353na.I.f14340v.f13704a.get(Integer.valueOf(i5));
        if (list == null) {
            list = kotlin.collections.e0.f19204a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0108dk) it.next()).reportData(i5, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Bf bf2;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f12059c;
        try {
            bf2 = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf2 = null;
        }
        Integer asInteger = bf2 != null ? bf2.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f12027h.c(asInteger.intValue());
        }
    }

    public B1(Context context, InterfaceC0643z1 interfaceC0643z1, C0093d5 c0093d5) {
        this(context, interfaceC0643z1, new C0014a4(context, c0093d5), new J1(), C0123ea.f13678d, C0353na.k().e(), new C1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        J1 j12 = this.f12024e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f12405a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f12406b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public B1(Context context, InterfaceC0643z1 interfaceC0643z1, C0014a4 c0014a4, J1 j12, C0123ea c0123ea, C0167g2 c0167g2, C1 c12) {
        this.f12020a = false;
        this.f12021b = context;
        this.f12022c = interfaceC0643z1;
        this.f12023d = c0014a4;
        this.f12024e = j12;
        this.f12026g = c0123ea;
        this.f12027h = c0167g2;
        this.f12028i = c12;
        this.j = new C0105dh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        P5.b(bundle);
        Sg sg2 = this.f12025f;
        if (sg2 != null) {
            sg2.a(P5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i5) {
        ((C0517u0) this.f12022c).f14692a.stopSelf(i5);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i5, int i10) {
        ((C0517u0) this.f12022c).f14692a.stopSelf(i10);
    }
}
