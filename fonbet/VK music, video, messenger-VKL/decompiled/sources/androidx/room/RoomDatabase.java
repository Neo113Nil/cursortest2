package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ap;
import xsna.asp;
import xsna.brm0;
import xsna.c5g;
import xsna.cmg0;
import xsna.cxc0;
import xsna.dcy;
import xsna.fg3;
import xsna.fpf0;
import xsna.gg3;
import xsna.gzs;
import xsna.hm20;
import xsna.hpj;
import xsna.hyg0;
import xsna.j5g;
import xsna.jgp;
import xsna.jvf;
import xsna.lhg;
import xsna.lx1;
import xsna.o45;
import xsna.on00;
import xsna.ozl;
import xsna.p7i;
import xsna.pfc;
import xsna.qgs;
import xsna.qu5;
import xsna.qyg0;
import xsna.rfc;
import xsna.s3q0;
import xsna.sin0;
import xsna.so;
import xsna.sqp0;
import xsna.tin0;
import xsna.u370;
import xsna.uy2;
import xsna.whn0;
import xsna.wip0;
import xsna.wlg0;
import xsna.wpx;
import xsna.wrg0;
import xsna.wzs;
import xsna.xe5;
import xsna.xlg0;
import xsna.yfb;
import xsna.zrp;
import xsna.ztl;
import xsna.zvj;

/* compiled from: RoomDatabase.android.kt */
/* loaded from: classes.dex */
public abstract class RoomDatabase {
    public volatile sin0 a;
    public hpj b;
    public kotlin.coroutines.d c;
    public Executor d;
    public wip0 e;
    public j f;
    public e g;
    public boolean i;
    public final jvf h = new jvf(new d(0, this, RoomDatabase.class, "onClosed", "onClosed()V", 0));
    public final ThreadLocal<Integer> j = new ThreadLocal<>();
    public final LinkedHashMap k = new LinkedHashMap();
    public boolean l = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RoomDatabase.android.kt */
    public static final class JournalMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC;
        public static final JournalMode TRUNCATE;
        public static final JournalMode WRITE_AHEAD_LOGGING;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            AUTOMATIC = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            TRUNCATE = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            WRITE_AHEAD_LOGGING = journalMode3;
            JournalMode[] journalModeArr = {journalMode, journalMode2, journalMode3};
            $VALUES = journalModeArr;
            $ENTRIES = new asp(journalModeArr);
        }

        public JournalMode() {
            throw null;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public static class a<T extends RoomDatabase> {
        public final rfc a;
        public final Context b;
        public final String c;
        public Executor f;
        public Executor g;
        public lx1 h;
        public boolean i;
        public boolean q;
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final JournalMode j = JournalMode.AUTOMATIC;
        public final long k = -1;
        public final c l = new c();
        public final LinkedHashSet m = new LinkedHashSet();
        public final LinkedHashSet n = new LinkedHashSet();
        public final ArrayList o = new ArrayList();
        public boolean p = true;
        public final boolean r = true;

        public a(Context context, String str, Class cls) {
            this.a = fpf0.a(cls);
            this.b = context;
            this.c = str;
        }

        public final void a(hm20... hm20VarArr) {
            for (hm20 hm20Var : hm20VarArr) {
                Integer valueOf = Integer.valueOf(hm20Var.a);
                LinkedHashSet linkedHashSet = this.n;
                linkedHashSet.add(valueOf);
                linkedHashSet.add(Integer.valueOf(hm20Var.b));
            }
            hm20[] hm20VarArr2 = (hm20[]) Arrays.copyOf(hm20VarArr, hm20VarArr.length);
            c cVar = this.l;
            cVar.getClass();
            for (hm20 hm20Var2 : hm20VarArr2) {
                cVar.a(hm20Var2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:95:0x021a, code lost:
        
            throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
         */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02bc A[LOOP:6: B:118:0x028f->B:130:0x02bc, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x02c6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0397  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x03b9  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0381  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final T b() {
            String str;
            l lVar;
            tin0 tin0Var;
            j jVar;
            tin0 j;
            tin0 tin0Var2;
            boolean z;
            Executor executor = this.f;
            if (executor == null && this.g == null) {
                fg3 fg3Var = gg3.i;
                this.g = fg3Var;
                this.f = fg3Var;
            } else if (executor != null && this.g == null) {
                this.g = executor;
            } else if (executor == null) {
                this.f = this.g;
            }
            LinkedHashSet linkedHashSet = this.n;
            boolean isEmpty = linkedHashSet.isEmpty();
            LinkedHashSet linkedHashSet2 = this.m;
            if (!isEmpty) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(lhg.a(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                    }
                }
            }
            tin0.c cVar = this.h;
            if (cVar == null) {
                cVar = new qgs();
            }
            tin0.c cVar2 = cVar;
            if (this.k > 0) {
                if (this.c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            boolean z2 = this.i;
            JournalMode journalMode = this.j;
            journalMode.getClass();
            JournalMode journalMode2 = JournalMode.AUTOMATIC;
            Context context = this.b;
            if (journalMode == journalMode2) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.TRUNCATE : JournalMode.WRITE_AHEAD_LOGGING;
            }
            Executor executor2 = this.f;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            androidx.room.b bVar = new androidx.room.b(context, this.c, cVar2, this.l, this.d, z2, journalMode, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, this.e, this.o, false, null, null);
            bVar.v = this.r;
            Class<?> a = this.a.a();
            Package r5 = a.getPackage();
            if (r5 == null || (str = r5.getName()) == null) {
                str = "";
            }
            String canonicalName = a.getCanonicalName();
            if (str.length() != 0) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String str2 = canonicalName.replace(JwtParser.SEPARATOR_CHAR, '_') + "_Impl";
            try {
                T t = (T) Class.forName(str.length() == 0 ? str2 : str + JwtParser.SEPARATOR_CHAR + str2, true, a.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
                t.getClass();
                t.l = bVar.v;
                try {
                    lVar = (l) t.f();
                } catch (NotImplementedError unused) {
                    lVar = null;
                }
                t.f = lVar == null ? new j(bVar, new o45(t, 3)) : new j(bVar, lVar);
                t.g = t.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<dcy<Object>> k = t.k();
                List<Object> list = bVar.r;
                int size = list.size();
                boolean[] zArr = new boolean[size];
                Iterator<dcy<Object>> it2 = k.iterator();
                while (true) {
                    int i = -1;
                    if (it2.hasNext()) {
                        dcy<Object> next = it2.next();
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (next.c(list.get(size2))) {
                                    zArr[size2] = true;
                                    i = size2;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        }
                        if (i < 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + next.h() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(next, list.get(i));
                    } else {
                        int size3 = list.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i3 = size3 - 1;
                                if (size3 >= size || !zArr[size3]) {
                                    break;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size3 = i3;
                            }
                        }
                        for (hm20 hm20Var : t.d(linkedHashMap)) {
                            int i4 = hm20Var.a;
                            int i5 = hm20Var.b;
                            c cVar3 = bVar.d;
                            LinkedHashMap linkedHashMap2 = cVar3.a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                                if (map == null) {
                                    map = jgp.b;
                                }
                                z = map.containsKey(Integer.valueOf(i5));
                            } else {
                                z = false;
                            }
                            if (!z) {
                                cVar3.a(hm20Var);
                            }
                        }
                        LinkedHashMap m = t.m();
                        List<Object> list2 = bVar.q;
                        boolean[] zArr2 = new boolean[list2.size()];
                        for (Map.Entry entry : m.entrySet()) {
                            dcy dcyVar = (dcy) entry.getKey();
                            for (dcy dcyVar2 : (List) entry.getValue()) {
                                int size4 = list2.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i6 = size4 - 1;
                                        if (dcyVar2.c(list2.get(size4))) {
                                            zArr2[size4] = true;
                                            break;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        size4 = i6;
                                    }
                                    if (size4 >= 0) {
                                        throw new IllegalArgumentException(("A required type converter (" + dcyVar2.h() + ") for " + dcyVar.h() + " is missing in the database configuration.").toString());
                                    }
                                    t.k.put(dcyVar2, list2.get(size4));
                                }
                                size4 = -1;
                                if (size4 >= 0) {
                                }
                            }
                        }
                        int size5 = list2.size() - 1;
                        if (size5 >= 0) {
                            while (true) {
                                int i7 = size5 - 1;
                                if (!zArr2[size5]) {
                                    throw new IllegalArgumentException(so.a(list2.get(size5), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                }
                                if (i7 < 0) {
                                    break;
                                }
                                size5 = i7;
                            }
                        }
                        t.d = bVar.h;
                        t.e = new wip0(bVar.i);
                        Executor executor4 = t.d;
                        if (executor4 == null) {
                            executor4 = null;
                        }
                        hpj a2 = zvj.a(qu5.b(executor4).plus(whn0.a()));
                        t.b = a2;
                        kotlin.coroutines.d dVar = a2.b;
                        wip0 wip0Var = t.e;
                        if (wip0Var == null) {
                            wip0Var = null;
                        }
                        t.c = dVar.plus(qu5.b(wip0Var));
                        t.i = bVar.f;
                        j jVar2 = t.f;
                        if (jVar2 == null) {
                            jVar2 = null;
                        }
                        tin0 j2 = jVar2.j();
                        if (j2 != null) {
                            tin0Var = j2;
                            while (!(tin0Var instanceof cxc0)) {
                                if (tin0Var instanceof ztl) {
                                    tin0Var = ((ztl) tin0Var).getDelegate();
                                }
                            }
                            jVar = t.f;
                            if (jVar == null) {
                                jVar = null;
                            }
                            j = jVar.j();
                            if (j != null) {
                                tin0Var2 = j;
                                while (!(tin0Var2 instanceof xe5)) {
                                    if (tin0Var2 instanceof ztl) {
                                        tin0Var2 = ((ztl) tin0Var2).getDelegate();
                                    }
                                }
                                if (((xe5) tin0Var2) != null) {
                                    throw null;
                                }
                                Intent intent = bVar.j;
                                if (intent != null) {
                                    String str3 = bVar.b;
                                    if (str3 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    e eVar = t.g;
                                    if (eVar == null) {
                                        eVar = null;
                                    }
                                    eVar.i = intent;
                                    eVar.j = new g(bVar.a, str3, eVar);
                                }
                                return t;
                            }
                            tin0Var2 = null;
                            if (((xe5) tin0Var2) != null) {
                            }
                        }
                        tin0Var = null;
                        jVar = t.f;
                        if (jVar == null) {
                        }
                        j = jVar.j();
                        if (j != null) {
                        }
                        tin0Var2 = null;
                        if (((xe5) tin0Var2) != null) {
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Cannot find implementation for " + a.getCanonicalName() + ". " + str2 + " does not exist. Is Room annotation processor correctly configured?", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(xlg0.a(a, new StringBuilder("Cannot access the constructor ")), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(xlg0.a(a, new StringBuilder("Failed to create an instance of ")), e3);
            }
        }

        @ozl
        public final void c() {
            this.p = false;
            this.q = true;
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public static class c {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(hm20 hm20Var) {
            int i = hm20Var.a;
            int i2 = hm20Var.b;
            Integer valueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap.get(Integer.valueOf(i2)));
                hm20Var.toString();
            }
            treeMap.put(Integer.valueOf(i2), hm20Var);
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            RoomDatabase roomDatabase = (RoomDatabase) this.receiver;
            hpj hpjVar = roomDatabase.b;
            if (hpjVar == null) {
                hpjVar = null;
            }
            zvj.c(hpjVar, null);
            e eVar = roomDatabase.g;
            if (eVar == null) {
                eVar = null;
            }
            g gVar = eVar.j;
            if (gVar != null) {
                gVar.c();
            }
            j jVar = roomDatabase.f;
            (jVar != null ? jVar : null).f.close();
            return s3q0.a;
        }
    }

    public final void a() {
        if (this.i) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (o() && !p() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @ozl
    public final void c() {
        a();
        a();
        sin0 writableDatabase = i().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            e eVar = this.g;
            if (eVar == null) {
                eVar = null;
            }
            eVar.getClass();
            wrg0.a(new wpx(eVar, null));
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((pfc) ((dcy) entry.getKey())).a(), entry.getValue());
        }
        return h();
    }

    public abstract e e();

    public cmg0 f() {
        throw new NotImplementedError();
    }

    @ozl
    public tin0 g(androidx.room.b bVar) {
        throw new NotImplementedError();
    }

    @ozl
    public List h() {
        return EmptyList.b;
    }

    public final tin0 i() {
        j jVar = this.f;
        if (jVar == null) {
            jVar = null;
        }
        tin0 j = jVar.j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final kotlin.coroutines.d j() {
        hpj hpjVar = this.b;
        if (hpjVar == null) {
            hpjVar = null;
        }
        return hpjVar.b;
    }

    public Set<dcy<Object>> k() {
        Set<Class<Object>> l = l();
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(fpf0.a((Class) it.next()));
        }
        return j5g.S0(arrayList);
    }

    @ozl
    public Set<Class<Object>> l() {
        return EmptySet.b;
    }

    public LinkedHashMap m() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = n().entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            rfc a2 = fpf0.a(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(fpf0.a((Class) it2.next()));
            }
            Pair pair = new Pair(a2, arrayList);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    public Map<Class<?>, List<Class<?>>> n() {
        return jgp.b;
    }

    public final boolean o() {
        j jVar = this.f;
        if (jVar == null) {
            jVar = null;
        }
        return jVar.j() != null;
    }

    public final boolean p() {
        return s() && i().getWritableDatabase().inTransaction();
    }

    public final void q() {
        i().getWritableDatabase().endTransaction();
        if (p()) {
            return;
        }
        e eVar = this.g;
        if (eVar == null) {
            eVar = null;
        }
        eVar.c.e(eVar.f, eVar.g);
    }

    public final void r(hyg0 hyg0Var) {
        e eVar = this.g;
        if (eVar == null) {
            eVar = null;
        }
        sqp0 sqp0Var = eVar.c;
        sqp0Var.getClass();
        qyg0 V0 = hyg0Var.V0("PRAGMA query_only");
        try {
            V0.step();
            boolean N3 = V0.N3();
            yfb.d(V0, null);
            if (!N3) {
                p7i.e(hyg0Var, "PRAGMA temp_store = MEMORY");
                p7i.e(hyg0Var, "PRAGMA recursive_triggers = 1");
                p7i.e(hyg0Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (sqp0Var.d) {
                    p7i.e(hyg0Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    p7i.e(hyg0Var, brm0.y("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                ObservedTableStates observedTableStates = sqp0Var.h;
                ReentrantLock reentrantLock = observedTableStates.a;
                reentrantLock.lock();
                try {
                    observedTableStates.d = true;
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (eVar.k) {
                try {
                    g gVar = eVar.j;
                    if (gVar != null) {
                        Intent intent = eVar.i;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        gVar.b(intent);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean s() {
        j jVar = this.f;
        if (jVar == null) {
            jVar = null;
        }
        sin0 sin0Var = jVar.g;
        if (sin0Var != null) {
            return sin0Var.isOpen();
        }
        return false;
    }

    public final <V> V t(Callable<V> callable) {
        return (V) u(new ap(callable, 5));
    }

    public final <T> T u(gzs<? extends T> gzsVar) {
        if (!o()) {
            return (T) u370.f(this, false, true, new wlg0(gzsVar, 0));
        }
        c();
        try {
            T invoke = gzsVar.invoke();
            w();
            return invoke;
        } finally {
            q();
        }
    }

    public final void v(Runnable runnable) {
        u(new uy2(runnable, 8));
    }

    @ozl
    public final void w() {
        i().getWritableDatabase().setTransactionSuccessful();
    }

    public final Object x(boolean z, wzs wzsVar, ContinuationImpl continuationImpl) {
        j jVar = this.f;
        if (jVar == null) {
            jVar = null;
        }
        return jVar.f.J2(z, wzsVar, continuationImpl);
    }

    /* compiled from: RoomDatabase.android.kt */
    public static abstract class b {
        public void a(sin0 sin0Var) {
        }

        public void b(sin0 sin0Var) {
        }
    }
}
