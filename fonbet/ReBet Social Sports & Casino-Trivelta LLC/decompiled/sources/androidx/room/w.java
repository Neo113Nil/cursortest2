package androidx.room;

import E2.h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z2.AbstractC6912b;
import z2.InterfaceC6911a;

/* loaded from: classes.dex */
public abstract class w {

    @NotNull
    public static final c Companion = new c(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private C2265c autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private E2.h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    @Nullable
    protected List<? extends b> mCallbacks;

    @JvmField
    @Nullable
    protected volatile E2.g mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final q invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends InterfaceC6911a>, InterfaceC6911a> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f23428a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f23429b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23430c;

        /* renamed from: d, reason: collision with root package name */
        public final List f23431d;

        /* renamed from: e, reason: collision with root package name */
        public final List f23432e;

        /* renamed from: f, reason: collision with root package name */
        public List f23433f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f23434g;

        /* renamed from: h, reason: collision with root package name */
        public Executor f23435h;

        /* renamed from: i, reason: collision with root package name */
        public h.c f23436i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f23437j;

        /* renamed from: k, reason: collision with root package name */
        public d f23438k;

        /* renamed from: l, reason: collision with root package name */
        public Intent f23439l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f23440m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f23441n;

        /* renamed from: o, reason: collision with root package name */
        public long f23442o;

        /* renamed from: p, reason: collision with root package name */
        public TimeUnit f23443p;

        /* renamed from: q, reason: collision with root package name */
        public final e f23444q;

        /* renamed from: r, reason: collision with root package name */
        public Set f23445r;

        /* renamed from: s, reason: collision with root package name */
        public Set f23446s;

        /* renamed from: t, reason: collision with root package name */
        public String f23447t;

        /* renamed from: u, reason: collision with root package name */
        public File f23448u;

        /* renamed from: v, reason: collision with root package name */
        public Callable f23449v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f23428a = context;
            this.f23429b = klass;
            this.f23430c = str;
            this.f23431d = new ArrayList();
            this.f23432e = new ArrayList();
            this.f23433f = new ArrayList();
            this.f23438k = d.AUTOMATIC;
            this.f23440m = true;
            this.f23442o = -1L;
            this.f23444q = new e();
            this.f23445r = new LinkedHashSet();
        }

        public a a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23431d.add(callback);
            return this;
        }

        public a b(AbstractC6912b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f23446s == null) {
                this.f23446s = new HashSet();
            }
            for (AbstractC6912b abstractC6912b : migrations) {
                Set set = this.f23446s;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(abstractC6912b.f68524a));
                Set set2 = this.f23446s;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(abstractC6912b.f68525b));
            }
            this.f23444q.b((AbstractC6912b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f23437j = true;
            return this;
        }

        public w d() {
            Executor executor = this.f23434g;
            if (executor == null && this.f23435h == null) {
                Executor g10 = s.c.g();
                this.f23435h = g10;
                this.f23434g = g10;
            } else if (executor != null && this.f23435h == null) {
                this.f23435h = executor;
            } else if (executor == null) {
                this.f23434g = this.f23435h;
            }
            Set set = this.f23446s;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (this.f23445r.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            h.c cVar = this.f23436i;
            if (cVar == null) {
                cVar = new F2.f();
            }
            if (cVar != null) {
                if (this.f23442o > 0) {
                    if (this.f23430c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f23442o;
                    TimeUnit timeUnit = this.f23443p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f23434g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar = new C2267e(cVar, new C2265c(j10, timeUnit, executor2));
                }
                String str = this.f23447t;
                if (str != null || this.f23448u != null || this.f23449v != null) {
                    if (this.f23430c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f23448u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f23449v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar = new F(str, file, callable, cVar);
                }
            } else {
                cVar = null;
            }
            h.c cVar2 = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f23428a;
            String str2 = this.f23430c;
            e eVar = this.f23444q;
            List list = this.f23431d;
            boolean z10 = this.f23437j;
            d c10 = this.f23438k.c(context);
            Executor executor3 = this.f23434g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f23435h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2270h c2270h = new C2270h(context, str2, cVar2, eVar, list, z10, c10, executor3, executor4, this.f23439l, this.f23440m, this.f23441n, this.f23445r, this.f23447t, this.f23448u, this.f23449v, null, this.f23432e, this.f23433f);
            w wVar = (w) v.b(this.f23429b, "_Impl");
            wVar.init(c2270h);
            return wVar;
        }

        public a e() {
            this.f23440m = false;
            this.f23441n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f23436i = cVar;
            return this;
        }

        public a g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f23434g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void b(E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final boolean b(ActivityManager activityManager) {
            return E2.c.b(activityManager);
        }

        public final d c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map f23453a = new LinkedHashMap();

        public final void a(AbstractC6912b abstractC6912b) {
            int i10 = abstractC6912b.f68524a;
            int i11 = abstractC6912b.f68525b;
            Map map = this.f23453a;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + abstractC6912b);
            }
            treeMap.put(Integer.valueOf(i11), abstractC6912b);
        }

        public void b(AbstractC6912b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC6912b abstractC6912b : migrations) {
                a(abstractC6912b);
            }
        }

        public final boolean c(int i10, int i11) {
            Map f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map map = (Map) f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return CollectionsKt.emptyList();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public final List e(List list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f23453a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                for (Integer targetVersion : z10 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                    if (z10) {
                        int i12 = i10 + 1;
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int intValue = targetVersion.intValue();
                        if (i12 <= intValue && intValue <= i11) {
                            Object obj = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj);
                            list.add(obj);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int intValue2 = targetVersion.intValue();
                        if (i11 <= intValue2 && intValue2 < i10) {
                            Object obj2 = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj2);
                            list.add(obj2);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                            break;
                        }
                    }
                }
                z11 = false;
            } while (z11);
            return null;
        }

        public Map f() {
            return this.f23453a;
        }
    }

    public static abstract class f {
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            w.this.d();
            return null;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            w.this.e();
            return null;
        }
    }

    public w() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @Deprecated(message = "Will be hidden in a future release.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(message = "Will be hidden in the next release.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(w wVar, E2.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return wVar.query(jVar, cancellationSignal);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        C2265c c2265c = this.autoCloser;
        if (c2265c == null) {
            d();
        } else {
            c2265c.g(new g());
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().u();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public E2.k compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().R0(sql);
    }

    @NotNull
    public abstract q createInvalidationTracker();

    @NotNull
    public abstract E2.h createOpenHelper(@NotNull C2270h c2270h);

    public final void d() {
        assertNotMainThread();
        E2.g writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().x(writableDatabase);
        if (writableDatabase.N1()) {
            writableDatabase.c0();
        } else {
            writableDatabase.v();
        }
    }

    public final void e() {
        getOpenHelper().getWritableDatabase().l0();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().o();
    }

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        C2265c c2265c = this.autoCloser;
        if (c2265c == null) {
            e();
        } else {
            c2265c.g(new h());
        }
    }

    public final Object f(Class cls, E2.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof InterfaceC2271i) {
            return f(cls, ((InterfaceC2271i) hVar).getDelegate());
        }
        return null;
    }

    @NotNull
    public final Map<Class<? extends InterfaceC6911a>, InterfaceC6911a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @JvmSuppressWildcards
    @NotNull
    public List<AbstractC6912b> getAutoMigrations(@NotNull Map<Class<? extends InterfaceC6911a>, InterfaceC6911a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @NotNull
    public q getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public E2.h getOpenHelper() {
        E2.h hVar = this.internalOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @NotNull
    public Set<Class<? extends InterfaceC6911a>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().F1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(@NotNull C2270h configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends InterfaceC6911a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC6911a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC6911a> next = it.next();
                int size = configuration.f23374r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f23374r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.f23374r.get(i10));
            } else {
                int size2 = configuration.f23374r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (AbstractC6912b abstractC6912b : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.f23360d.c(abstractC6912b.f68524a, abstractC6912b.f68525b)) {
                        configuration.f23360d.b(abstractC6912b);
                    }
                }
                E e10 = (E) f(E.class, getOpenHelper());
                if (e10 != null) {
                    e10.r(configuration);
                }
                C2266d c2266d = (C2266d) f(C2266d.class, getOpenHelper());
                if (c2266d != null) {
                    this.autoCloser = c2266d.f23305b;
                    getInvalidationTracker().r(c2266d.f23305b);
                }
                boolean z10 = configuration.f23363g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = configuration.f23361e;
                this.internalQueryExecutor = configuration.f23364h;
                this.internalTransactionExecutor = new J(configuration.f23365i);
                this.allowMainThreadQueries = configuration.f23362f;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.f23366j != null) {
                    if (configuration.f23358b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().s(configuration.f23357a, configuration.f23358b, configuration.f23366j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f23373q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.f23373q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.f23373q.get(size3));
                    }
                }
                int size4 = configuration.f23373q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f23373q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        getInvalidationTracker().l(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        C2265c c2265c = this.autoCloser;
        if (c2265c != null) {
            isOpen = c2265c.l();
        } else {
            E2.g gVar = this.mDatabase;
            if (gVar == null) {
                bool = null;
                return Intrinsics.areEqual(bool, Boolean.TRUE);
            }
            isOpen = gVar.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        E2.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    @JvmOverloads
    @NotNull
    public final Cursor query(@NotNull E2.j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends InterfaceC6911a>, InterfaceC6911a> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().a0();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().S(new E2.a(query, objArr));
    }

    @JvmOverloads
    @NotNull
    public Cursor query(@NotNull E2.j query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().t0(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().S(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
