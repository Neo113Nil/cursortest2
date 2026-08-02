package ru.ozon.android.messenger.framework.core.initialization;

import De.C2862e;
import Sc.s;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.cache.g;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;
import ru.ozon.android.messenger.framework.di.k;
import ru.ozon.uni.atoms.AtomConfig;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f87339a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f87340b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f87341c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static C2862e f87342d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f87343e = 0;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.core.initialization.OzonMessenger$clearAllUsers$1", f = "OzonMessenger.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            Iterator it = e.f87339a.values().iterator();
            while (it.hasNext()) {
                ((MessengerDB) it.next()).clearAllTables();
            }
            Iterator it2 = e.f87340b.values().iterator();
            while (it2.hasNext()) {
                ((ru.ozon.android.messenger.framework.data.cache.b) it2.next()).clearCache();
            }
            Iterator it3 = e.f87341c.values().iterator();
            while (it3.hasNext()) {
                ((ru.ozon.android.messenger.framework.data.cache.f) it3.next()).clearCache();
            }
            return Unit.f71690a;
        }
    }

    static {
        C10720e0 c10720e0 = C10720e0.f105451a;
        f87342d = N.a(He.b.f10879b);
    }

    public static void d() {
        C10727i.c(f87342d, null, null, new a(), 3);
    }

    public static ru.ozon.android.messenger.framework.core.initialization.newinit.b e(d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        ru.ozon.android.messenger.framework.core.initialization.newinit.a.a(config.getAppContext());
        String namespace = config.getNetworkConfig().c();
        Context context = config.getAppContext();
        ru.ozon.android.messenger.framework.logger.b nonFatalLogger = config.getNonFatalLogger();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        LinkedHashMap linkedHashMap = f87339a;
        if (linkedHashMap.get(namespace) == null) {
            MessengerDB.f87462a.getClass();
            linkedHashMap.put(namespace, MessengerDB.a.a(context, namespace, nonFatalLogger));
        }
        ru.ozon.android.messenger.framework.data.cache.a aVar = new ru.ozon.android.messenger.framework.data.cache.a();
        LinkedHashMap linkedHashMap2 = f87341c;
        if (linkedHashMap2.get(namespace) == null) {
            linkedHashMap2.put(namespace, new g(aVar));
        }
        LinkedHashMap linkedHashMap3 = f87340b;
        if (linkedHashMap3.get(namespace) == null) {
            linkedHashMap3.put(namespace, new ru.ozon.android.messenger.framework.data.cache.c(aVar));
        }
        ru.ozon.android.messenger.framework.core.initialization.di.b bVar = new ru.ozon.android.messenger.framework.core.initialization.di.b(config);
        config.getNetworkConfig().getClass();
        ru.ozon.android.messenger.framework.core.initialization.newinit.b bVar2 = new ru.ozon.android.messenger.framework.core.initialization.newinit.b(namespace, bVar, "");
        String c11 = config.getNetworkConfig().c();
        config.getNetworkConfig().getClass();
        boolean z11 = false;
        AtomConfig.INSTANCE.initialize(new AtomConfig.Config(new k(c11, ""), z11, false, null, new f(), 8, null));
        ru.ozon.android.messenger.api.b.f83914a.getClass();
        ru.ozon.android.messenger.api.b.a(bVar2);
        return bVar2;
    }

    @NotNull
    public static ru.ozon.android.messenger.framework.data.cache.b f(@NotNull String namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Object obj = f87340b.get(namespace);
        Intrinsics.f(obj);
        return (ru.ozon.android.messenger.framework.data.cache.b) obj;
    }

    @NotNull
    public static ru.ozon.android.messenger.framework.data.cache.f g(@NotNull String namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Object obj = f87341c.get(namespace);
        Intrinsics.f(obj);
        return (ru.ozon.android.messenger.framework.data.cache.f) obj;
    }

    @NotNull
    public static MessengerDB h(@NotNull String namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Object obj = f87339a.get(namespace);
        Intrinsics.f(obj);
        return (MessengerDB) obj;
    }
}
