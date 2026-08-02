package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import com.twilio.voice.VoiceURLConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t.C6375b;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final w f23386a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f23387b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f23388c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f23389d;

    /* renamed from: e, reason: collision with root package name */
    public C2265c f23390e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23391f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f23392g;

    /* renamed from: h, reason: collision with root package name */
    public volatile E2.k f23393h;

    /* renamed from: i, reason: collision with root package name */
    public final b f23394i;

    /* renamed from: j, reason: collision with root package name */
    public final o f23395j;

    /* renamed from: k, reason: collision with root package name */
    public final C6375b f23396k;

    /* renamed from: l, reason: collision with root package name */
    public t f23397l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f23398m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f23399n;

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f23400o;

    @NotNull
    private final String[] tablesNames;

    /* renamed from: p, reason: collision with root package name */
    public static final a f23385p = new a(null);

    @NotNull
    private static final String[] TRIGGERS = {"UPDATE", VoiceURLConnection.METHOD_TYPE_DELETE, "INSERT"};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(E2.g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.N1()) {
                database.c0();
            } else {
                database.v();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23401b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public boolean f23402a;

        @NotNull
        private final long[] tableObservers;

        @NotNull
        private final int[] triggerStateChanges;

        @NotNull
        private final boolean[] triggerStates;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(int i10) {
            this.tableObservers = new long[i10];
            this.triggerStates = new boolean[i10];
            this.triggerStateChanges = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f23402a) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.triggerStates;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.triggerStateChanges[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f23402a = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f23402a = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f23402a = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.f23402a = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static abstract class c {

        @NotNull
        private final String[] tables;

        public c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        public final String[] a() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final c f23403a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f23404b;

        @NotNull
        private final int[] tableIds;

        @NotNull
        private final String[] tableNames;

        public d(c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f23403a = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            this.f23404b = !(tableNames.length == 0) ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.tableIds;
        }

        public final void b(Set invalidatedTablesIds) {
            Set emptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set createSetBuilder = SetsKt.createSetBuilder();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            createSetBuilder.add(this.tableNames[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    emptySet = SetsKt.build(createSetBuilder);
                } else {
                    emptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f23404b : SetsKt.emptySet();
                }
            } else {
                emptySet = SetsKt.emptySet();
            }
            if (emptySet.isEmpty()) {
                return;
            }
            this.f23403a.c(emptySet);
        }

        public final void c(String[] tables) {
            Set emptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.tableNames.length;
            if (length == 0) {
                emptySet = SetsKt.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        emptySet = SetsKt.emptySet();
                        break;
                    } else {
                        if (StringsKt.equals(tables[i10], this.tableNames[0], true)) {
                            emptySet = this.f23404b;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set createSetBuilder = SetsKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : this.tableNames) {
                        if (StringsKt.equals(str2, str, true)) {
                            createSetBuilder.add(str2);
                        }
                    }
                }
                emptySet = SetsKt.build(createSetBuilder);
            }
            if (emptySet.isEmpty()) {
                return;
            }
            this.f23403a.c(emptySet);
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final q f23405a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f23406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q tracker, c delegate) {
            super(delegate.a());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f23405a = tracker;
            this.f23406b = new WeakReference(delegate);
        }

        @Override // androidx.room.q.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            c cVar = (c) this.f23406b.get();
            if (cVar == null) {
                this.f23405a.p(this);
            } else {
                cVar.c(tables);
            }
        }
    }

    public static final class f implements Runnable {
        public f() {
        }

        public final Set a() {
            q qVar = q.this;
            Set createSetBuilder = SetsKt.createSetBuilder();
            Cursor query$default = w.query$default(qVar.h(), new E2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (query$default.moveToNext()) {
                try {
                    createSetBuilder.add(Integer.valueOf(query$default.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query$default, null);
            Set build = SetsKt.build(createSetBuilder);
            if (build.isEmpty()) {
                return build;
            }
            if (q.this.g() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            E2.k g10 = q.this.g();
            if (g10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            g10.G();
            return build;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        
            if (r2.isEmpty() != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r0 = r4.f23407a.i();
            r1 = r4.f23407a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        
            r1 = r1.i().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
        
            if (r1.hasNext() == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
        
            ((androidx.room.q.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            r1 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
        
            if (r0 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        
            if (r0 == null) goto L44;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Set emptySet;
            C2265c c2265c;
            C2265c c2265c2;
            Lock closeLock$room_runtime_release = q.this.h().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                    if (!q.this.f()) {
                        if (c2265c2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (!q.this.j().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        C2265c c2265c3 = q.this.f23390e;
                        if (c2265c3 != null) {
                            c2265c3.e();
                            return;
                        }
                        return;
                    }
                    if (q.this.h().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        C2265c c2265c4 = q.this.f23390e;
                        if (c2265c4 != null) {
                            c2265c4.e();
                            return;
                        }
                        return;
                    }
                    E2.g writableDatabase = q.this.h().getOpenHelper().getWritableDatabase();
                    writableDatabase.c0();
                    try {
                        emptySet = a();
                        writableDatabase.a0();
                        closeLock$room_runtime_release.unlock();
                        c2265c = q.this.f23390e;
                    } finally {
                        writableDatabase.l0();
                    }
                } finally {
                    closeLock$room_runtime_release.unlock();
                    c2265c2 = q.this.f23390e;
                    if (c2265c2 != null) {
                        c2265c2.e();
                    }
                }
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                emptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                c2265c = q.this.f23390e;
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                emptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                c2265c = q.this.f23390e;
            }
        }
    }

    public q(w database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f23386a = database;
        this.f23387b = shadowTablesMap;
        this.f23388c = viewTables;
        this.f23391f = new AtomicBoolean(false);
        this.f23394i = new b(tableNames.length);
        this.f23395j = new o(database);
        this.f23396k = new C6375b();
        this.f23398m = new Object();
        this.f23399n = new Object();
        this.f23389d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f23389d.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f23387b.get(tableNames[i10]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i10] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry entry : this.f23387b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f23389d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f23389d;
                map.put(lowerCase3, MapsKt.getValue(map, lowerCase2));
            }
        }
        this.f23400o = new f();
    }

    public void c(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] q10 = q(observer.a());
        ArrayList arrayList = new ArrayList(q10.length);
        for (String str : q10) {
            Map map = this.f23389d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        d dVar2 = new d(observer, intArray, q10);
        synchronized (this.f23396k) {
            dVar = (d) this.f23396k.g(observer, dVar2);
        }
        if (dVar == null && this.f23394i.b(Arrays.copyOf(intArray, intArray.length))) {
            w();
        }
    }

    public void d(c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c(new e(this, observer));
    }

    public LiveData e(String[] tableNames, boolean z10, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.f23395j.a(y(tableNames), z10, computeFunction);
    }

    public final boolean f() {
        if (!this.f23386a.isOpenInternal()) {
            return false;
        }
        if (!this.f23392g) {
            this.f23386a.getOpenHelper().getWritableDatabase();
        }
        if (this.f23392g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final E2.k g() {
        return this.f23393h;
    }

    public final w h() {
        return this.f23386a;
    }

    public final C6375b i() {
        return this.f23396k;
    }

    public final AtomicBoolean j() {
        return this.f23391f;
    }

    public final Map k() {
        return this.f23389d;
    }

    public final void l(E2.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f23399n) {
            if (this.f23392g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.z("PRAGMA temp_store = MEMORY;");
            database.z("PRAGMA recursive_triggers='ON';");
            database.z("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            x(database);
            this.f23393h = database.R0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f23392g = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void m(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f23396k) {
            try {
                for (Map.Entry entry : this.f23396k) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        synchronized (this.f23399n) {
            this.f23392g = false;
            this.f23394i.d();
            E2.k kVar = this.f23393h;
            if (kVar != null) {
                kVar.close();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public void o() {
        if (this.f23391f.compareAndSet(false, true)) {
            C2265c c2265c = this.f23390e;
            if (c2265c != null) {
                c2265c.j();
            }
            this.f23386a.getQueryExecutor().execute(this.f23400o);
        }
    }

    public void p(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f23396k) {
            dVar = (d) this.f23396k.h(observer);
        }
        if (dVar != null) {
            b bVar = this.f23394i;
            int[] a10 = dVar.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                w();
            }
        }
    }

    public final String[] q(String[] strArr) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Map map = this.f23388c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f23388c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.checkNotNull(obj);
                createSetBuilder.addAll((Collection) obj);
            } else {
                createSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(createSetBuilder).toArray(new String[0]);
    }

    public final void r(C2265c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f23390e = autoCloser;
        autoCloser.m(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                q.this.n();
            }
        });
    }

    public final void s(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f23397l = new t(context, name, serviceIntent, this, this.f23386a.getQueryExecutor());
    }

    public final void t(E2.g gVar, int i10) {
        gVar.z("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.tablesNames[i10];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f23385p.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.z(str3);
        }
    }

    public final void u() {
        t tVar = this.f23397l;
        if (tVar != null) {
            tVar.o();
        }
        this.f23397l = null;
    }

    public final void v(E2.g gVar, int i10) {
        String str = this.tablesNames[i10];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + f23385p.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.z(str3);
        }
    }

    public final void w() {
        if (this.f23386a.isOpenInternal()) {
            x(this.f23386a.getOpenHelper().getWritableDatabase());
        }
    }

    public final void x(E2.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.F1()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f23386a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f23398m) {
                    int[] a10 = this.f23394i.a();
                    if (a10 != null) {
                        f23385p.a(database);
                        try {
                            int length = a10.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = a10[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    t(database, i11);
                                } else if (i12 == 2) {
                                    v(database, i11);
                                }
                                i10++;
                                i11 = i13;
                            }
                            database.a0();
                            database.l0();
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            database.l0();
                            throw th2;
                        }
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }

    public final String[] y(String[] strArr) {
        String[] q10 = q(strArr);
        for (String str : q10) {
            Map map = this.f23389d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return q10;
    }
}
