package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k6g {

    @NotNull
    public static final h6g Companion = new h6g();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private cq0 autoCloser;
    private hg4 configuration;
    private d6g connectionManager;
    private ku3 coroutineScope;
    private Executor internalQueryExecutor;
    private taa internalTracker;
    private Executor internalTransactionExecutor;

    @Nullable
    protected List<? extends g6g> mCallbacks;

    @Nullable
    protected volatile dni mDatabase;
    private CoroutineContext transactionContext;

    @NotNull
    private final cz2 closeBarrier = new cz2(new fl8(0, this, k6g.class, "onClosed", "onClosed()V", 0, 15));

    @NotNull
    private final ThreadLocal<CoroutineContext> suspendingTransactionContext = new ThreadLocal<>();

    @NotNull
    private final Map<KClass<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static final void access$onClosed(k6g k6gVar) {
        ku3 ku3Var = k6gVar.coroutineScope;
        rq3 rq3Var = null;
        if (ku3Var == null) {
            Intrinsics.i("coroutineScope");
            throw null;
        }
        s9a.o(ku3Var, null);
        rqa rqaVar = k6gVar.getInvalidationTracker().i;
        if (rqaVar != null) {
            int i = 0;
            if (((AtomicBoolean) rqaVar.f).compareAndSet(false, true)) {
                taa taaVar = (taa) rqaVar.c;
                wj9 wj9Var = (wj9) rqaVar.i;
                wj9Var.getClass();
                ReentrantLock reentrantLock = taaVar.e;
                reentrantLock.lock();
                try {
                    vkd vkdVar = (vkd) taaVar.d.remove(wj9Var);
                    if (vkdVar != null) {
                        i1k i1kVar = taaVar.c;
                        int[] iArr = vkdVar.b;
                        i1kVar.getClass();
                        iArr.getClass();
                        if (((pkd) i1kVar.h).b(iArr)) {
                            wca.F(new saa(taaVar, rq3Var, i));
                        }
                    }
                    try {
                        sm9 sm9Var = (sm9) rqaVar.g;
                        if (sm9Var != null) {
                            sm9Var.Y3((yxc) rqaVar.j, rqaVar.a);
                        }
                    } catch (RemoteException unused) {
                    }
                    ((Context) rqaVar.d).unbindService((zxc) rqaVar.k);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        d6g d6gVar = k6gVar.connectionManager;
        if (d6gVar == null) {
            Intrinsics.i("connectionManager");
            throw null;
        }
        d6gVar.f.close();
        fni fniVar = d6gVar.g;
        if (fniVar != null) {
            fniVar.close();
        }
    }

    public static /* synthetic */ Cursor query$default(k6g k6gVar, hni hniVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return k6gVar.query(hniVar, cancellationSignal);
    }

    public final Object a(Function0 function0) {
        if (!inCompatibilityMode()) {
            return gz8.S(this, false, true, new ma0(16, function0));
        }
        beginTransaction();
        try {
            Object invoke = function0.invoke();
            setTransactionSuccessful();
            return invoke;
        } finally {
            endTransaction();
        }
    }

    public final void addTypeConverter$room_runtime(@NotNull KClass<?> kClass, @NotNull Object obj) {
        kClass.getClass();
        obj.getClass();
        this.typeConverters.put(kClass, obj);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            a70.r("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode() || inTransaction()) {
            return;
        }
        CoroutineContext coroutineContext = this.suspendingTransactionContext.get();
        if ((coroutineContext != null ? (xuj) coroutineContext.get(xuj.b) : null) == null) {
            return;
        }
        a70.r("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @wx4
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        dni writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.y()) {
            taa invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            wca.F(new saa(invalidationTracker, null, 1));
        }
        if (writableDatabase.N0()) {
            writableDatabase.Q();
        } else {
            writableDatabase.A();
        }
    }

    public abstract void clearAllTables();

    public void close() {
        cz2 cz2Var = this.closeBarrier;
        synchronized (cz2Var) {
            if (cz2Var.c.compareAndSet(false, true)) {
                Unit unit = Unit.a;
                while (cz2Var.b.get() != 0) {
                }
                cz2Var.a.invoke();
            }
        }
    }

    @NotNull
    public mni compileStatement(@NotNull String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().o0(str);
    }

    @NotNull
    public List<njc> createAutoMigrations(@NotNull Map<KClass<? extends jr0>, ? extends jr0> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(sha.x((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    @NotNull
    public final d6g createConnectionManager$room_runtime(@NotNull hg4 hg4Var) {
        o6g o6gVar;
        hg4Var.getClass();
        try {
            p6g createOpenDelegate = createOpenDelegate();
            createOpenDelegate.getClass();
            o6gVar = (o6g) createOpenDelegate;
        } catch (ped unused) {
            o6gVar = null;
        }
        if (o6gVar == null) {
            return new d6g(hg4Var, new mme(this, 26), new p1(2, this, l6g.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 13));
        }
        return new d6g(hg4Var, o6gVar, new p1(2, this, l6g.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 14));
    }

    @NotNull
    public abstract taa createInvalidationTracker();

    @NotNull
    public p6g createOpenDelegate() {
        throw new ped(null, 1, null);
    }

    @wx4
    @NotNull
    public fni createOpenHelper(@NotNull hg4 hg4Var) {
        hg4Var.getClass();
        throw new ped(null, 1, null);
    }

    @wx4
    public void endTransaction() {
        getOpenHelper().getWritableDatabase().U();
        if (inTransaction()) {
            return;
        }
        taa invalidationTracker = getInvalidationTracker();
        invalidationTracker.c.e(invalidationTracker.f, invalidationTracker.g);
    }

    @wx4
    @NotNull
    public List<njc> getAutoMigrations(@NotNull Map<Class<? extends jr0>, jr0> map) {
        map.getClass();
        return km5.a;
    }

    @NotNull
    public final cz2 getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    @NotNull
    public final ku3 getCoroutineScope() {
        ku3 ku3Var = this.coroutineScope;
        if (ku3Var != null) {
            return ku3Var;
        }
        Intrinsics.i("coroutineScope");
        throw null;
    }

    @NotNull
    public final hlg getDriver() {
        hg4 hg4Var = this.configuration;
        if (hg4Var == null) {
            Intrinsics.i("configuration");
            throw null;
        }
        hlg hlgVar = hg4Var.t;
        if (hlgVar != null) {
            return hlgVar;
        }
        a70.r("No SQLiteDriver was configured with Room.");
        return null;
    }

    @NotNull
    public taa getInvalidationTracker() {
        taa taaVar = this.internalTracker;
        if (taaVar != null) {
            return taaVar;
        }
        Intrinsics.i("internalTracker");
        throw null;
    }

    @NotNull
    public fni getOpenHelper() {
        d6g d6gVar = this.connectionManager;
        if (d6gVar == null) {
            Intrinsics.i("connectionManager");
            throw null;
        }
        fni fniVar = d6gVar.g;
        if (fniVar != null) {
            return fniVar;
        }
        a70.r("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    @Nullable
    public final String getPath() {
        hg4 hg4Var = this.configuration;
        if (hg4Var == null) {
            Intrinsics.i("configuration");
            throw null;
        }
        String str = hg4Var.b;
        if (str == null) {
            return null;
        }
        if (hg4Var != null) {
            return hg4Var.a.getDatabasePath(str).getPath();
        }
        Intrinsics.i("configuration");
        throw null;
    }

    @NotNull
    public final CoroutineContext getQueryContext() {
        ku3 ku3Var = this.coroutineScope;
        if (ku3Var != null) {
            return ku3Var.getCoroutineContext();
        }
        Intrinsics.i("coroutineScope");
        throw null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.i("internalQueryExecutor");
        throw null;
    }

    @NotNull
    public Set<KClass<? extends jr0>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends jr0>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(k13.r(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(sha.A((Class) it.next()));
        }
        return CollectionsKt.W0(arrayList);
    }

    @wx4
    @NotNull
    public Set<Class<? extends jr0>> getRequiredAutoMigrationSpecs() {
        return rm5.a;
    }

    @NotNull
    public Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = getRequiredTypeConverters().entrySet();
        int c = sub.c(k13.r(entrySet, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass A = sha.A(cls);
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(sha.A((Class) it2.next()));
            }
            linkedHashMap.put(A, arrayList);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    @NotNull
    public final ThreadLocal<CoroutineContext> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    @NotNull
    public final CoroutineContext getTransactionContext$room_runtime() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.i("transactionContext");
        throw null;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.i("internalTransactionExecutor");
        throw null;
    }

    @wx4
    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(sha.A(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        d6g d6gVar = this.connectionManager;
        if (d6gVar != null) {
            return d6gVar.g != null;
        }
        Intrinsics.i("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().getWritableDatabase().y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        defpackage.a70.p("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a A[LOOP:5: B:56:0x010e->B:68:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(@NotNull hg4 hg4Var) {
        d6g d6gVar;
        CoroutineContext coroutineContext;
        boolean z;
        int i;
        int i2;
        hg4Var.getClass();
        this.configuration = hg4Var;
        String str = hg4Var.b;
        Intent intent = hg4Var.j;
        CoroutineContext coroutineContext2 = hg4Var.u;
        this.useTempTrackingTable = true;
        this.connectionManager = createConnectionManager$room_runtime(hg4Var);
        this.internalTracker = createInvalidationTracker();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<KClass<? extends jr0>> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List list = hg4Var.r;
        jga jgaVar = hg4Var.d;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<KClass<? extends jr0>> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i3 = -1;
            if (it.hasNext()) {
                KClass<? extends jr0> next = it.next();
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        i = i3;
                        if (next.isInstance(list.get(size2))) {
                            zArr[size2] = true;
                            i2 = size2;
                            break;
                        } else {
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                            i3 = i;
                        }
                    }
                } else {
                    i = -1;
                }
                i2 = i;
                if (i2 < 0) {
                    pvd.A(next.getQualifiedName(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return;
                }
                linkedHashMap.put(next, list.get(i2));
            } else {
                int size3 = list.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i5 = size3 - 1;
                        if (size3 >= size || !zArr[size3]) {
                            break;
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size3 = i5;
                        }
                    }
                }
                for (njc njcVar : createAutoMigrations(linkedHashMap)) {
                    int i6 = njcVar.a;
                    int i7 = njcVar.b;
                    LinkedHashMap linkedHashMap2 = jgaVar.a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                        if (map == null) {
                            map = lm5.a;
                            map.getClass();
                        }
                        z = map.containsKey(Integer.valueOf(i7));
                    } else {
                        z = false;
                    }
                    if (!z) {
                        jgaVar.a(njcVar);
                    }
                }
                Map<KClass<?>, List<KClass<?>>> requiredTypeConverterClassesMap$room_runtime = getRequiredTypeConverterClassesMap$room_runtime();
                List list2 = hg4Var.q;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<KClass<?>, List<KClass<?>>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
                    KClass<?> key = entry.getKey();
                    for (KClass<?> kClass : entry.getValue()) {
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i8 = size4 - 1;
                                if (kClass.isInstance(list2.get(size4))) {
                                    zArr2[size4] = true;
                                    break;
                                } else if (i8 < 0) {
                                    break;
                                } else {
                                    size4 = i8;
                                }
                            }
                            if (size4 >= 0) {
                                pvd.t("A required type converter (", kClass.getQualifiedName(), ") for ", key.getQualifiedName(), " is missing in the database configuration.");
                                return;
                            }
                            addTypeConverter$room_runtime(kClass, list2.get(size4));
                        }
                        size4 = -1;
                        if (size4 >= 0) {
                        }
                    }
                }
                int size5 = list2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i9 = size5 - 1;
                        if (!zArr2[size5]) {
                            a70.p(lnb.m(list2.get(size5), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                            return;
                        } else if (i9 < 0) {
                            break;
                        } else {
                            size5 = i9;
                        }
                    }
                }
                fni fniVar = null;
                if (coroutineContext2 != null) {
                    CoroutineContext.Element element = coroutineContext2.get(d.Q7);
                    element.getClass();
                    au3 au3Var = (au3) element;
                    Executor B = fz8.B(au3Var);
                    this.internalQueryExecutor = B;
                    this.internalTransactionExecutor = new n5h(B, 1);
                    this.coroutineScope = s9a.c(coroutineContext2.plus(new smi((yda) coroutineContext2.get(uic.g))));
                    boolean inCompatibilityMode = inCompatibilityMode();
                    ku3 ku3Var = this.coroutineScope;
                    if (inCompatibilityMode) {
                        if (ku3Var == null) {
                            Intrinsics.i("coroutineScope");
                            throw null;
                        }
                        coroutineContext = ku3Var.getCoroutineContext().plus(au3Var.f0(1));
                    } else {
                        if (ku3Var == null) {
                            Intrinsics.i("coroutineScope");
                            throw null;
                        }
                        coroutineContext = ku3Var.getCoroutineContext();
                    }
                    this.transactionContext = coroutineContext;
                } else {
                    this.internalQueryExecutor = hg4Var.h;
                    this.internalTransactionExecutor = new n5h(hg4Var.i, 1);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        Intrinsics.i("internalQueryExecutor");
                        throw null;
                    }
                    ad2 c = s9a.c(fz8.P(executor).plus(tz9.o()));
                    this.coroutineScope = c;
                    CoroutineContext coroutineContext3 = c.b;
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        Intrinsics.i("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = coroutineContext3.plus(fz8.P(executor2));
                }
                this.allowMainThreadQueries = hg4Var.f;
                d6g d6gVar2 = this.connectionManager;
                if (d6gVar2 == null) {
                    Intrinsics.i("connectionManager");
                    throw null;
                }
                fni fniVar2 = d6gVar2.g;
                if (fniVar2 != null) {
                    while (!(fniVar2 instanceof d3f)) {
                        if (fniVar2 instanceof cw4) {
                            fniVar2 = ((cw4) fniVar2).getDelegate();
                        }
                    }
                    d6gVar = this.connectionManager;
                    if (d6gVar != null) {
                        Intrinsics.i("connectionManager");
                        throw null;
                    }
                    fni fniVar3 = d6gVar.g;
                    if (fniVar3 != null) {
                        while (true) {
                            if (fniVar3 instanceof dq0) {
                                fniVar = fniVar3;
                                break;
                            } else if (!(fniVar3 instanceof cw4)) {
                                break;
                            } else {
                                fniVar3 = ((cw4) fniVar3).getDelegate();
                            }
                        }
                    }
                    if (intent != null) {
                        if (str == null) {
                            a70.p("Required value was null.");
                            return;
                        }
                        taa invalidationTracker = getInvalidationTracker();
                        Context context = hg4Var.a;
                        invalidationTracker.getClass();
                        context.getClass();
                        invalidationTracker.h = intent;
                        invalidationTracker.i = new rqa(context, str, invalidationTracker);
                        return;
                    }
                    return;
                }
                fniVar2 = null;
                d6gVar = this.connectionManager;
                if (d6gVar != null) {
                }
            }
        }
    }

    public final void internalInitInvalidationTracker(@NotNull glg glgVar) {
        glgVar.getClass();
        taa invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        i1k i1kVar = invalidationTracker.c;
        i1kVar.getClass();
        nlg V0 = glgVar.V0("PRAGMA query_only");
        try {
            V0.U0();
            boolean v0 = V0.v0();
            o1j.t(V0, null);
            if (!v0) {
                b0a.F(glgVar, "PRAGMA temp_store = MEMORY");
                b0a.F(glgVar, "PRAGMA recursive_triggers = 1");
                b0a.F(glgVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (i1kVar.a) {
                    b0a.F(glgVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    b0a.F(glgVar, c.r("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                pkd pkdVar = (pkd) i1kVar.h;
                ReentrantLock reentrantLock = pkdVar.a;
                reentrantLock.lock();
                try {
                    pkdVar.d = true;
                    Unit unit = Unit.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.j) {
                try {
                    rqa rqaVar = invalidationTracker.i;
                    if (rqaVar != null) {
                        Intent intent = invalidationTracker.h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        rqaVar.g(intent);
                        Unit unit2 = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        d6g d6gVar = this.connectionManager;
        if (d6gVar == null) {
            Intrinsics.i("connectionManager");
            throw null;
        }
        dni dniVar = d6gVar.h;
        if (dniVar != null) {
            return dniVar.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        d6g d6gVar = this.connectionManager;
        if (d6gVar == null) {
            Intrinsics.i("connectionManager");
            throw null;
        }
        dni dniVar = d6gVar.h;
        if (dniVar != null) {
            return dniVar.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z, @NotNull String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        wca.F(new t3(this, z, strArr, (rq3) null, 11));
    }

    @NotNull
    public Cursor query(@NotNull hni hniVar, @Nullable CancellationSignal cancellationSignal) {
        hniVar.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().w0(hniVar, cancellationSignal) : getOpenHelper().getWritableDatabase().B(hniVar);
    }

    public void runInTransaction(@NotNull Runnable runnable) {
        runnable.getClass();
        a(new ate(runnable, 29));
    }

    @wx4
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().O();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    @Nullable
    public final <R> Object useConnection(boolean z, @NotNull Function2<? super avj, ? super rq3<? super R>, ? extends Object> function2, @NotNull rq3<? super R> rq3Var) {
        d6g d6gVar = this.connectionManager;
        if (d6gVar != null) {
            return d6gVar.f.T0(z, function2, rq3Var);
        }
        Intrinsics.i("connectionManager");
        throw null;
    }

    @NotNull
    public final <T> T getTypeConverter(@NotNull KClass<T> kClass) {
        kClass.getClass();
        T t = (T) this.typeConverters.get(kClass);
        t.getClass();
        return t;
    }

    public <V> V runInTransaction(@NotNull Callable<V> callable) {
        callable.getClass();
        return (V) a(new e6g(callable, 0));
    }

    @wx4
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @wx4
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    @NotNull
    public Cursor query(@NotNull String str, @Nullable Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().B(new y3g(str, objArr));
    }

    @NotNull
    public final Cursor query(@NotNull hni hniVar) {
        hniVar.getClass();
        return query$default(this, hniVar, null, 2, null);
    }

    @wx4
    public void internalInitInvalidationTracker(@NotNull dni dniVar) {
        dniVar.getClass();
        internalInitInvalidationTracker(new cni(dniVar));
    }
}
