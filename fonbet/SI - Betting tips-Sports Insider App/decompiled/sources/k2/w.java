package k2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public jg.d f18779a;

    /* renamed from: b, reason: collision with root package name */
    public CoroutineContext f18780b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f18781c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f18782d;

    /* renamed from: e, reason: collision with root package name */
    public r f18783e;

    /* renamed from: f, reason: collision with root package name */
    public i f18784f;

    /* renamed from: g, reason: collision with root package name */
    public final x5.h f18785g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18786h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f18787i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18788k;

    public w() {
        u closeAction = new u(0, this, w.class, "onClosed", "onClosed()V", 0, 0);
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        x5.h hVar = new x5.h();
        hVar.f25409a = new AtomicInteger(0);
        hVar.f25410b = new AtomicBoolean(false);
        this.f18785g = hVar;
        this.f18787i = new ThreadLocal();
        this.j = new LinkedHashMap();
        this.f18788k = true;
    }

    public final void a() {
        if (this.f18786h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        t2.a Q = h().Q();
        if (!Q.j()) {
            i g10 = g();
            g10.getClass();
            x.A(new androidx.lifecycle.b(g10, (Continuation) null, 10));
        }
        if (Q.g0()) {
            Q.I();
        } else {
            Q.m();
        }
    }

    public List c(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap autoMigrationSpecs2 = new LinkedHashMap(kotlin.collections.m0.a(autoMigrationSpecs.size()));
        for (Map.Entry entry : autoMigrationSpecs.entrySet()) {
            autoMigrationSpecs2.put(u6.h.k((ag.c) entry.getKey()), entry.getValue());
        }
        Intrinsics.checkNotNullParameter(autoMigrationSpecs2, "autoMigrationSpecs");
        return kotlin.collections.e0.f19204a;
    }

    public abstract i d();

    public j1.f e() {
        throw new gf.n(null, 1, null);
    }

    public final void f() {
        h().Q().S();
        if (l()) {
            return;
        }
        i g10 = g();
        g10.f18677b.e(g10.f18680e, g10.f18681f);
    }

    public final i g() {
        i iVar = this.f18784f;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTracker");
        return null;
    }

    public final t2.d h() {
        r rVar = this.f18783e;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            rVar = null;
        }
        t2.d dVar = (t2.d) rVar.f18753g;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set i() {
        kotlin.collections.g0 g0Var = kotlin.collections.g0.f19206a;
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(g0Var, 10));
        Iterator<E> it = g0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(u6.h.m((Class) it.next()));
        }
        return CollectionsKt.Z(arrayList);
    }

    public LinkedHashMap j() {
        kotlin.collections.n0.c().getClass();
        int a7 = kotlin.collections.m0.a(kotlin.collections.v.k(kotlin.collections.g0.f19206a, 10));
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        kotlin.collections.d0.f19200a.getClass();
        return linkedHashMap;
    }

    public final boolean k() {
        r rVar = this.f18783e;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            rVar = null;
        }
        return ((t2.d) rVar.f18753g) != null;
    }

    public final boolean l() {
        return n() && h().Q().j();
    }

    public final void m(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        i g10 = g();
        g10.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        o0 o0Var = g10.f18677b;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        s2.c r02 = connection.r0("PRAGMA query_only");
        try {
            r02.n0();
            boolean E = r02.E();
            u6.h.g(r02, null);
            if (!E) {
                h8.b.l(connection, "PRAGMA temp_store = MEMORY");
                h8.b.l(connection, "PRAGMA recursive_triggers = 1");
                h8.b.l(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (o0Var.f18740d) {
                    h8.b.l(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    h8.b.l(connection, kotlin.text.z.m("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                m mVar = o0Var.f18744h;
                ReentrantLock reentrantLock = mVar.f18714a;
                reentrantLock.lock();
                try {
                    mVar.f18717d = true;
                    Unit unit = Unit.f19194a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (g10.f18682g) {
            }
        } finally {
        }
    }

    public final boolean n() {
        r rVar = this.f18783e;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            rVar = null;
        }
        t2.a aVar = (t2.a) rVar.f18754h;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object o(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return p(new a2.q(20, body));
    }

    public final Object p(Function0 function0) {
        if (!k()) {
            return f3.x.n0(this, false, true, new a2.f(9, function0));
        }
        b();
        try {
            Object invoke = function0.invoke();
            r();
            return invoke;
        } finally {
            f();
        }
    }

    public final void q(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        p(new a2.q(21, body));
    }

    public final void r() {
        h().Q().G();
    }

    public final Object s(boolean z5, Function2 function2, mf.c cVar) {
        r rVar = this.f18783e;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            rVar = null;
        }
        return ((m2.b) rVar.f18752f).H(z5, function2, cVar);
    }
}
