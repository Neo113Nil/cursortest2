package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.l;
import androidx.room.m;
import androidx.room.q;
import androidx.room.t;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f23410a;

    /* renamed from: b, reason: collision with root package name */
    public final q f23411b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f23412c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f23413d;

    /* renamed from: e, reason: collision with root package name */
    public int f23414e;

    /* renamed from: f, reason: collision with root package name */
    public q.c f23415f;

    /* renamed from: g, reason: collision with root package name */
    public m f23416g;

    /* renamed from: h, reason: collision with root package name */
    public final l f23417h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23418i;

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnection f23419j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f23420k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f23421l;

    public static final class a extends q.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.q.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.q.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (t.this.j().get()) {
                return;
            }
            try {
                m h10 = t.this.h();
                if (h10 != null) {
                    h10.T(t.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends l.a {
        public b() {
        }

        public static final void i(t this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().m((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.l
        public void r(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor d10 = t.this.d();
            final t tVar = t.this;
            d10.execute(new Runnable() { // from class: androidx.room.u
                @Override // java.lang.Runnable
                public final void run() {
                    t.b.i(t.this, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            t.this.m(m.a.c(service));
            t.this.d().execute(t.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            t.this.d().execute(t.this.g());
            t.this.m(null);
        }
    }

    public t(Context context, String name, Intent serviceIntent, q invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f23410a = name;
        this.f23411b = invalidationTracker;
        this.f23412c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f23413d = applicationContext;
        this.f23417h = new b();
        this.f23418i = new AtomicBoolean(false);
        c cVar = new c();
        this.f23419j = cVar;
        this.f23420k = new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                t.n(t.this);
            }
        };
        this.f23421l = new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                t.k(t.this);
            }
        };
        l(new a((String[]) invalidationTracker.k().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f23411b.p(this$0.f());
    }

    public static final void n(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            m mVar = this$0.f23416g;
            if (mVar != null) {
                this$0.f23414e = mVar.d0(this$0.f23417h, this$0.f23410a);
                this$0.f23411b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f23414e;
    }

    public final Executor d() {
        return this.f23412c;
    }

    public final q e() {
        return this.f23411b;
    }

    public final q.c f() {
        q.c cVar = this.f23415f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    public final Runnable g() {
        return this.f23421l;
    }

    public final m h() {
        return this.f23416g;
    }

    public final Runnable i() {
        return this.f23420k;
    }

    public final AtomicBoolean j() {
        return this.f23418i;
    }

    public final void l(q.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f23415f = cVar;
    }

    public final void m(m mVar) {
        this.f23416g = mVar;
    }

    public final void o() {
        if (this.f23418i.compareAndSet(false, true)) {
            this.f23411b.p(f());
            try {
                m mVar = this.f23416g;
                if (mVar != null) {
                    mVar.J0(this.f23417h, this.f23414e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f23413d.unbindService(this.f23419j);
        }
    }
}
