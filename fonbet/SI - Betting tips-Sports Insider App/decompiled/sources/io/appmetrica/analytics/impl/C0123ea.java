package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123ea {

    /* renamed from: d, reason: collision with root package name */
    public static final C0123ea f13678d = new C0123ea();

    /* renamed from: a, reason: collision with root package name */
    public final C0480sd f13679a = new C0480sd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f13680b = AbstractC0056bk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f13681c = false;

    public final void a(Context context) {
        C0049bd c0049bd;
        C0353na.a(context);
        this.f13680b.onCreate(context);
        this.f13679a.getClass();
        List<String> a7 = C0353na.I.f14337s.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(a7, 10));
        for (String str : a7) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0049bd = new C0049bd(str, false);
            } else {
                C0353na.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0049bd = new C0049bd(str, true);
            }
            arrayList.add(c0049bd);
        }
        new C0363nk(C0353na.I.D().f12015d).a(context);
        wo woVar = C0353na.I.D().f12014c;
        synchronized (woVar) {
            woVar.f14882a.a();
        }
        C0353na.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f13681c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f13681c) {
                    a(context);
                    this.f13681c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C0075cd a() {
        C0288kk c0288kk = C0353na.I.f14324d;
        if (c0288kk.f14149b == null) {
            synchronized (c0288kk) {
                try {
                    if (c0288kk.f14149b == null) {
                        c0288kk.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-SC");
                        c0288kk.f14149b = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return new C0075cd(c0288kk.f14149b, C0353na.I.y(), "service_modules", new SystemTimeProvider());
    }
}
