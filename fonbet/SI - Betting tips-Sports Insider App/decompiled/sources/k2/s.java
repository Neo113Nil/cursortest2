package k2;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.c1;
import eg.e1;
import eg.u1;
import eg.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ag.c f18755a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18757c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18758d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f18759e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f18760f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f18761g;

    /* renamed from: h, reason: collision with root package name */
    public f3.q f18762h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18763i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final long f18764k;

    /* renamed from: l, reason: collision with root package name */
    public final e3.i f18765l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f18766m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f18767n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f18768o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18769p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18770r;

    /* renamed from: s, reason: collision with root package name */
    public CoroutineContext f18771s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18772t;

    public s(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f18758d = new ArrayList();
        this.f18759e = new ArrayList();
        this.j = t.f18773a;
        this.f18764k = -1L;
        this.f18765l = new e3.i(2);
        this.f18766m = new LinkedHashSet();
        this.f18767n = new LinkedHashSet();
        this.f18768o = new ArrayList();
        this.f18769p = true;
        this.f18772t = true;
        Intrinsics.checkNotNullParameter(klass, "<this>");
        this.f18755a = Reflection.getOrCreateKotlinClass(klass);
        this.f18756b = context;
        this.f18757c = str;
    }

    public final void a(n2.b... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (n2.b bVar : migrations) {
            Integer valueOf = Integer.valueOf(bVar.f20819a);
            LinkedHashSet linkedHashSet = this.f18767n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(bVar.f20820b));
        }
        n2.b[] migrations2 = (n2.b[]) Arrays.copyOf(migrations, migrations.length);
        e3.i iVar = this.f18765l;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(migrations2, "migrations");
        for (n2.b bVar2 : migrations2) {
            iVar.b(bVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0377, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x057e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w b() {
        String str;
        j1.f openDelegate;
        boolean z5;
        int i5;
        Object gVar;
        t2.d dVar;
        r rVar;
        t2.d dVar2;
        t2.d dVar3;
        Executor l0Var;
        CoroutineContext coroutineContext;
        boolean z7;
        Executor executor = this.f18760f;
        if (executor == null && this.f18761g == null) {
            o.a aVar = o.b.f21054c;
            this.f18761g = aVar;
            this.f18760f = aVar;
        } else if (executor != null && this.f18761g == null) {
            this.f18761g = executor;
        } else if (executor == null) {
            this.f18760f = this.f18761g;
        }
        LinkedHashSet migrationStartAndEndVersions = this.f18767n;
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        LinkedHashSet migrationsNotRequiredFrom = this.f18766m;
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (!migrationStartAndEndVersions.isEmpty()) {
            Iterator it = migrationStartAndEndVersions.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (migrationsNotRequiredFrom.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(c1.i(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        t2.c cVar = this.f18762h;
        if (cVar == null) {
            cVar = new s7.t(18);
        }
        t2.c cVar2 = cVar;
        if (this.f18764k > 0) {
            if (this.f18757c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z10 = this.f18763i;
        t tVar = this.j;
        tVar.getClass();
        Context context = this.f18756b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (tVar == t.f18773a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            tVar = (activityManager == null || activityManager.isLowRamDevice()) ? t.f18774b : t.f18775c;
        }
        Executor executor2 = this.f18760f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f18761g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z11 = this.f18769p;
        boolean z12 = this.q;
        boolean z13 = this.f18770r;
        CoroutineContext coroutineContext2 = this.f18771s;
        b config = new b(context, this.f18757c, cVar2, this.f18765l, this.f18758d, z10, tVar, executor2, executor3, null, z11, z12, migrationsNotRequiredFrom, null, null, null, this.f18759e, this.f18768o, z13, null, coroutineContext2);
        config.f18649v = this.f18772t;
        Class klass = u6.h.k(this.f18755a);
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter("_Impl", "suffix");
        Package r6 = klass.getPackage();
        if (r6 == null || (str = r6.getName()) == null) {
            str = "";
        }
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
        }
        String l6 = d9.e.l(new StringBuilder(), kotlin.text.z.l(canonicalName, '.', '_', false), "_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? l6 : str + '.' + l6, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            w wVar = (w) cls.getDeclaredConstructor(null).newInstance(null);
            wVar.getClass();
            Intrinsics.checkNotNullParameter(config, "configuration");
            wVar.f18788k = config.f18649v;
            Intrinsics.checkNotNullParameter(config, "configuration");
            try {
                j1.f e7 = wVar.e();
                Intrinsics.checkNotNull(e7, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                openDelegate = e7;
            } catch (gf.n unused) {
                openDelegate = null;
            }
            if (openDelegate == null) {
                a2.f supportOpenHelperFactory = new a2.f(8, wVar);
                v transactionWrapper = new v(2, wVar, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0);
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
                Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
                r rVar2 = new r();
                rVar2.f18749c = config;
                rVar2.f18750d = new q(-1, "", "");
                List list = config.f18634e;
                rVar2.f18751e = list == null ? kotlin.collections.e0.f19204a : list;
                a2.f fVar = new a2.f(7, rVar2);
                List list2 = list;
                if (list == null) {
                    list2 = kotlin.collections.e0.f19204a;
                }
                ArrayList O = CollectionsKt.O(list2, new f3.a(fVar));
                Context context2 = config.f18630a;
                Intrinsics.checkNotNullParameter(context2, "context");
                e3.i migrationContainer = config.f18633d;
                Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
                t journalMode = config.f18636g;
                Intrinsics.checkNotNullParameter(journalMode, "journalMode");
                Executor queryExecutor = config.f18637h;
                Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
                Executor transactionExecutor = config.f18638i;
                Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
                List typeConverters = config.q;
                Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
                List autoMigrationSpecs = config.f18645r;
                Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
                b bVar = new b(context2, config.f18631b, config.f18632c, migrationContainer, O, config.f18635f, journalMode, queryExecutor, transactionExecutor, config.j, config.f18639k, config.f18640l, config.f18641m, config.f18642n, config.f18643o, config.f18644p, typeConverters, autoMigrationSpecs, config.f18646s, config.f18647t, config.f18648u);
                bVar.f18649v = config.f18649v;
                supportOpenHelperFactory.invoke(bVar);
                throw null;
            }
            v transactionWrapper2 = new v(2, wVar, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 1);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
            Intrinsics.checkNotNullParameter(transactionWrapper2, "transactionWrapper");
            r rVar3 = new r();
            rVar3.f18749c = config;
            rVar3.f18750d = openDelegate;
            List list3 = config.f18634e;
            if (list3 == null) {
                list3 = kotlin.collections.e0.f19204a;
            }
            rVar3.f18751e = list3;
            t tVar2 = config.f18636g;
            String str2 = config.f18631b;
            s2.b bVar2 = config.f18647t;
            if (bVar2 == null) {
                t2.c cVar3 = config.f18632c;
                if (cVar3 == null) {
                    throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
                }
                Context context3 = config.f18630a;
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(context3, "context");
                com.android.billingclient.api.l0 callback = new com.android.billingclient.api.l0(rVar3, openDelegate.f18198a);
                Intrinsics.checkNotNullParameter(callback, "callback");
                t2.d b10 = cVar3.b(new t2.b(context3, str2, callback, false, false));
                rVar3.f18753g = b10;
                rVar3.f18752f = new m2.s(new r7.a(b10), str2 != null ? str2 : ":memory:", transactionWrapper2);
                z5 = true;
            } else {
                rVar3.f18753g = null;
                if (bVar2.e()) {
                    gVar = new m2.s(new io.sentry.util.network.b(rVar3, bVar2), str2 != null ? str2 : ":memory:", transactionWrapper2);
                } else if (str2 == null) {
                    io.sentry.util.network.b driver = new io.sentry.util.network.b(rVar3, bVar2);
                    Intrinsics.checkNotNullParameter(driver, "driver");
                    Intrinsics.checkNotNullParameter(":memory:", "fileName");
                    gVar = new m2.g(driver);
                } else {
                    io.sentry.util.network.b driver2 = new io.sentry.util.network.b(rVar3, bVar2);
                    Intrinsics.checkNotNullParameter(tVar2, "<this>");
                    int[] iArr = a.$EnumSwitchMapping$0;
                    int i10 = iArr[tVar2.ordinal()];
                    z5 = true;
                    if (i10 == 1) {
                        i5 = 1;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + tVar2 + '\'').toString());
                        }
                        i5 = 4;
                    }
                    Intrinsics.checkNotNullParameter(tVar2, "<this>");
                    int i11 = iArr[tVar2.ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + tVar2 + '\'').toString());
                    }
                    Intrinsics.checkNotNullParameter(driver2, "driver");
                    String fileName = config.f18631b;
                    Intrinsics.checkNotNullParameter(fileName, "fileName");
                    gVar = new m2.g(driver2, fileName, i5);
                    rVar3.f18752f = gVar;
                }
                z5 = true;
                rVar3.f18752f = gVar;
            }
            boolean z14 = tVar2 == t.f18775c;
            t2.d dVar4 = (t2.d) rVar3.f18753g;
            if (dVar4 != null) {
                dVar4.setWriteAheadLoggingEnabled(z14);
            }
            wVar.f18783e = rVar3;
            wVar.f18784f = wVar.d();
            Intrinsics.checkNotNullParameter(wVar, "<this>");
            Intrinsics.checkNotNullParameter(config, "configuration");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set i12 = wVar.i();
            List list4 = config.f18645r;
            int size = list4.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = i12.iterator();
            while (true) {
                int i13 = -1;
                if (!it2.hasNext()) {
                    int size2 = list4.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i14 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                break;
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size2 = i14;
                        }
                    }
                    for (n2.b bVar3 : wVar.c(linkedHashMap)) {
                        int i15 = bVar3.f20819a;
                        int i16 = bVar3.f20820b;
                        e3.i iVar = config.f18633d;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        LinkedHashMap linkedHashMap2 = iVar.f8523a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i15))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i15));
                            if (map == null) {
                                map = kotlin.collections.n0.c();
                            }
                            z7 = map.containsKey(Integer.valueOf(i16));
                        } else {
                            z7 = false;
                        }
                        if (!z7) {
                            iVar.b(bVar3);
                        }
                    }
                    Intrinsics.checkNotNullParameter(wVar, "<this>");
                    Intrinsics.checkNotNullParameter(config, "configuration");
                    LinkedHashMap j = wVar.j();
                    List list5 = config.q;
                    boolean[] zArr2 = new boolean[list5.size()];
                    for (Map.Entry entry : j.entrySet()) {
                        ag.c cVar4 = (ag.c) entry.getKey();
                        for (ag.c kclass : (List) entry.getValue()) {
                            int size3 = list5.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i17 = size3 - 1;
                                    if (kclass.isInstance(list5.get(size3))) {
                                        zArr2[size3] = z5;
                                        break;
                                    }
                                    if (i17 < 0) {
                                        break;
                                    }
                                    size3 = i17;
                                }
                            }
                            size3 = -1;
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + kclass.getQualifiedName() + ") for " + cVar4.getQualifiedName() + " is missing in the database configuration.").toString());
                            }
                            Object converter = list5.get(size3);
                            Intrinsics.checkNotNullParameter(kclass, "kclass");
                            Intrinsics.checkNotNullParameter(converter, "converter");
                            wVar.j.put(kclass, converter);
                        }
                    }
                    int size4 = list5.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i18 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list5.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i18 < 0) {
                                break;
                            }
                            size4 = i18;
                        }
                    }
                    if (coroutineContext2 != null) {
                        CoroutineContext.Element r5 = coroutineContext2.r(kotlin.coroutines.d.f19226f0);
                        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                        eg.w wVar2 = (eg.w) r5;
                        x0 x0Var = wVar2 instanceof x0 ? (x0) wVar2 : null;
                        if (x0Var == null || (l0Var = x0Var.i0()) == null) {
                            l0Var = new eg.l0(wVar2);
                        }
                        wVar.f18781c = l0Var;
                        wVar.f18782d = new a0(l0Var, 0);
                        wVar.f18779a = eg.c0.b(coroutineContext2.t(new u1((e1) coroutineContext2.r(eg.x.f9237b))));
                        if (wVar.k()) {
                            jg.d dVar5 = wVar.f18779a;
                            if (dVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                                dVar5 = null;
                            }
                            coroutineContext = dVar5.f18494a.t(wVar2.h0(z5 ? 1 : 0));
                        } else {
                            jg.d dVar6 = wVar.f18779a;
                            if (dVar6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                                dVar6 = null;
                            }
                            coroutineContext = dVar6.f18494a;
                        }
                        wVar.f18780b = coroutineContext;
                    } else {
                        wVar.f18781c = config.f18637h;
                        wVar.f18782d = new a0(config.f18638i, 0);
                        Executor executor4 = wVar.f18781c;
                        if (executor4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                            executor4 = null;
                        }
                        jg.d b11 = eg.c0.b(kotlin.coroutines.e.c(eg.c0.l(executor4), eg.c0.d()));
                        wVar.f18779a = b11;
                        CoroutineContext coroutineContext3 = b11.f18494a;
                        a0 a0Var = wVar.f18782d;
                        if (a0Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                            a0Var = null;
                        }
                        wVar.f18780b = coroutineContext3.t(eg.c0.l(a0Var));
                    }
                    wVar.f18786h = config.f18635f;
                    r rVar4 = wVar.f18783e;
                    if (rVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                        rVar4 = null;
                    }
                    t2.d dVar7 = (t2.d) rVar4.f18753g;
                    if (dVar7 != null) {
                        dVar = dVar7;
                        while (!(dVar instanceof o2.b)) {
                            if (dVar instanceof c) {
                                dVar = ((c) dVar).getDelegate();
                            }
                        }
                        rVar = wVar.f18783e;
                        if (rVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                            rVar = null;
                        }
                        dVar2 = (t2.d) rVar.f18753g;
                        if (dVar2 != null) {
                            dVar3 = dVar2;
                            while (!(dVar3 instanceof o2.a)) {
                                if (dVar3 instanceof c) {
                                    dVar3 = ((c) dVar3).getDelegate();
                                }
                            }
                            return wVar;
                        }
                        dVar3 = null;
                        return wVar;
                    }
                    dVar = null;
                    rVar = wVar.f18783e;
                    if (rVar == null) {
                    }
                    dVar2 = (t2.d) rVar.f18753g;
                    if (dVar2 != null) {
                    }
                    dVar3 = null;
                    return wVar;
                }
                ag.c cVar5 = (ag.c) it2.next();
                int size5 = list4.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i19 = size5 - 1;
                        if (cVar5.isInstance(list4.get(size5))) {
                            zArr[size5] = z5;
                            i13 = size5;
                            break;
                        }
                        if (i19 < 0) {
                            break;
                        }
                        size5 = i19;
                    }
                }
                if (i13 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cVar5.getQualifiedName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cVar5, list4.get(i13));
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + l6 + " does not exist. Is Room annotation processor correctly configured?", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e11);
        }
    }
}
