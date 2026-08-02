package com.vk.metrics.eventtracking;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.os.Handler;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.im.engine.exceptions.stacktrace.StopBgSyncAnrStackTraceInfoException;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vkontakte.android.VKActivity;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bky;
import xsna.bpn0;
import xsna.epx;
import xsna.fpb;
import xsna.gzs;
import xsna.hri0;
import xsna.izs;
import xsna.jgp;
import xsna.k1q;
import xsna.mn8;
import xsna.ohp0;
import xsna.qhp0;
import xsna.s3q0;
import xsna.sb60;
import xsna.wx0;
import xsna.x52;
import xsna.zrp;

/* compiled from: VkMainTracker.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public class VkMainTracker implements ohp0 {
    public Application f;
    public k1q i;
    public boolean j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Set<String> b = Collections.synchronizedSet(new HashSet());
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final bpn0 d = new bpn0(new mn8(18));
    public final bpn0 e = new bpn0(new bky(this, 8));
    public volatile State g = State.IDLE;
    public final qhp0 h = qhp0.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMainTracker.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE;
        public static final State INITIALIZED;
        public static final State INITIALIZING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("INITIALIZING", 1);
            INITIALIZING = state2;
            State state3 = new State("INITIALIZED", 2);
            INITIALIZED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VkMainTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Event.LogType.values().length];
            try {
                iArr[Event.LogType.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.LogType.ONCE_PER_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.LogType.ONCE_PER_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Event.LogType.ONCE_PER_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Event.LogType.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ohp0
    public final void a(Throwable th) {
        m(new wx0(27, this, th));
    }

    @Override // xsna.ohp0
    public void b(ohp0 ohp0Var) {
        if (o(ohp0Var.getId()) != null) {
            throw new IllegalArgumentException("Tracker with id=" + ohp0Var.getId() + " is already registered!");
        }
        if (r()) {
            throw new IllegalStateException("Already initialized!");
        }
        p().add(ohp0Var);
        q().add(ohp0Var.getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[Catch: all -> 0x002b, LOOP:0: B:18:0x0077->B:20:0x007d, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0001, B:8:0x0009, B:11:0x0019, B:13:0x0024, B:17:0x0031, B:18:0x0077, B:20:0x007d), top: B:2:0x0001 }] */
    @Override // xsna.ohp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c(Application application, Bundle bundle, final gzs<s3q0> gzsVar) {
        String str;
        Iterator<T> it;
        try {
            if (this.g != State.IDLE) {
                return;
            }
            this.g = State.INITIALIZING;
            this.f = application;
            PackageManager packageManager = application.getPackageManager();
            Application application2 = this.f;
            if (application2 == null) {
                application2 = null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(application2.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (str == null) {
                }
                String str2 = str;
                this.j = bundle.getBoolean("IS_DEBUG", false);
                this.i = new k1q(application, bundle.getLong(CommonConstant.RETKEY.USERID, 0L), str2, (ExecutorService) this.e.getValue());
                this.h.getClass();
                qhp0.b = jgp.b;
                final AtomicInteger atomicInteger = new AtomicInteger(p().size());
                gzs<s3q0> gzsVar2 = new gzs() { // from class: xsna.c3v0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        AtomicInteger atomicInteger2 = atomicInteger;
                        VkMainTracker vkMainTracker = this;
                        gzs gzsVar3 = gzsVar;
                        if (atomicInteger2.decrementAndGet() == 0) {
                            vkMainTracker.g = VkMainTracker.State.INITIALIZED;
                            vkMainTracker.u();
                            gzsVar3.invoke();
                        }
                        return s3q0.a;
                    }
                };
                it = p().iterator();
                while (it.hasNext()) {
                    ((ohp0) it.next()).c(application, bundle, gzsVar2);
                }
            }
            str = "";
            String str22 = str;
            this.j = bundle.getBoolean("IS_DEBUG", false);
            this.i = new k1q(application, bundle.getLong(CommonConstant.RETKEY.USERID, 0L), str22, (ExecutorService) this.e.getValue());
            this.h.getClass();
            qhp0.b = jgp.b;
            final AtomicInteger atomicInteger2 = new AtomicInteger(p().size());
            gzs<s3q0> gzsVar22 = new gzs() { // from class: xsna.c3v0
                @Override // xsna.gzs
                public final Object invoke() {
                    AtomicInteger atomicInteger22 = atomicInteger2;
                    VkMainTracker vkMainTracker = this;
                    gzs gzsVar3 = gzsVar;
                    if (atomicInteger22.decrementAndGet() == 0) {
                        vkMainTracker.g = VkMainTracker.State.INITIALIZED;
                        vkMainTracker.u();
                        gzsVar3.invoke();
                    }
                    return s3q0.a;
                }
            };
            it = p().iterator();
            while (it.hasNext()) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ohp0
    public final void d(final long j) {
        m(new gzs() { // from class: xsna.f3v0
            @Override // xsna.gzs
            public final Object invoke() {
                VkMainTracker vkMainTracker = VkMainTracker.this;
                long j2 = j;
                k1q k1qVar = vkMainTracker.i;
                if (k1qVar != null) {
                    k1qVar.e = j2;
                }
                Iterator<T> it = vkMainTracker.p().iterator();
                while (it.hasNext()) {
                    ((ohp0) it.next()).d(j2);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.ohp0
    public final void e(final long j) {
        m(new gzs() { // from class: xsna.e3v0
            @Override // xsna.gzs
            public final Object invoke() {
                VkMainTracker vkMainTracker = VkMainTracker.this;
                long j2 = j;
                k1q k1qVar = vkMainTracker.i;
                if (k1qVar != null) {
                    k1qVar.e = j2;
                }
                Iterator<T> it = vkMainTracker.p().iterator();
                while (it.hasNext()) {
                    ((ohp0) it.next()).e(j2);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
        m(new sb60(1, this, bundle));
    }

    @Override // xsna.ohp0
    public final void g() {
        m(new hri0(this, 20));
    }

    @Override // xsna.ohp0
    public String getId() {
        return "TrackersFacade";
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
        Iterator<T> it = p().iterator();
        while (it.hasNext()) {
            ((ohp0) it.next()).i(vKActivity);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
        Iterator<T> it = p().iterator();
        while (it.hasNext()) {
            ((ohp0) it.next()).j(vKActivity);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.ohp0
    public final void k(final Event event) {
        m(new gzs() { // from class: xsna.g3v0
            @Override // xsna.gzs
            public final Object invoke() {
                final Event event2 = Event.this;
                final VkMainTracker vkMainTracker = this;
                com.vk.metrics.eventtracking.b.a.getClass();
                if (!com.vk.metrics.eventtracking.b.b && !epx.f(event2.a.d.get("vk_tracking_startup_event"), Boolean.TRUE)) {
                    return s3q0.a;
                }
                int i = VkMainTracker.a.$EnumSwitchMapping$0[event2.a.e.ordinal()];
                if (i == 1) {
                    final k1q k1qVar = vkMainTracker.i;
                    if (k1qVar != null) {
                        final b7x b7xVar = new b7x(1, vkMainTracker, event2);
                        final zv zvVar = new zv(9, k1qVar, event2);
                        k1qVar.b.execute(new Runnable() { // from class: xsna.h1q
                            @Override // java.lang.Runnable
                            public final void run() {
                                gzs gzsVar = gzs.this;
                                k1q k1qVar2 = k1qVar;
                                Event event3 = event2;
                                gzs gzsVar2 = b7xVar;
                                if (((Boolean) gzsVar.invoke()).booleanValue()) {
                                    SQLiteDatabase a2 = k1qVar2.a();
                                    ContentValues contentValues = new ContentValues(3);
                                    contentValues.put("event_name", event3.a.c);
                                    contentValues.put("app_hash", (String) k1qVar2.k.getValue());
                                    contentValues.put("session_id", Long.valueOf(((Number) k1qVar2.f.getValue()).longValue()));
                                    contentValues.put("date", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("user_id", Long.valueOf(k1qVar2.e));
                                    a2.insert("events", null, contentValues);
                                    gzsVar2.invoke();
                                }
                            }
                        });
                    }
                } else if (i == 2) {
                    final k1q k1qVar2 = vkMainTracker.i;
                    if (k1qVar2 != null) {
                        final vy2 vy2Var = new vy2(2, vkMainTracker, event2);
                        final ge0 ge0Var = new ge0(7, k1qVar2, event2);
                        k1qVar2.b.execute(new Runnable() { // from class: xsna.h1q
                            @Override // java.lang.Runnable
                            public final void run() {
                                gzs gzsVar = gzs.this;
                                k1q k1qVar22 = k1qVar2;
                                Event event3 = event2;
                                gzs gzsVar2 = vy2Var;
                                if (((Boolean) gzsVar.invoke()).booleanValue()) {
                                    SQLiteDatabase a2 = k1qVar22.a();
                                    ContentValues contentValues = new ContentValues(3);
                                    contentValues.put("event_name", event3.a.c);
                                    contentValues.put("app_hash", (String) k1qVar22.k.getValue());
                                    contentValues.put("session_id", Long.valueOf(((Number) k1qVar22.f.getValue()).longValue()));
                                    contentValues.put("date", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("user_id", Long.valueOf(k1qVar22.e));
                                    a2.insert("events", null, contentValues);
                                    gzsVar2.invoke();
                                }
                            }
                        });
                    }
                } else if (i == 3) {
                    final k1q k1qVar3 = vkMainTracker.i;
                    if (k1qVar3 != null) {
                        final gzs gzsVar = new gzs() { // from class: xsna.b3v0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                vkMainTracker.v(event2);
                                return s3q0.a;
                            }
                        };
                        final gzs gzsVar2 = new gzs() { // from class: xsna.g1q
                            @Override // xsna.gzs
                            public final Object invoke() {
                                k1q k1qVar4 = k1q.this;
                                Event event3 = event2;
                                SQLiteStatement sQLiteStatement = (SQLiteStatement) k1qVar4.h.getValue();
                                sQLiteStatement.clearBindings();
                                boolean z = true;
                                sQLiteStatement.bindString(1, event3.a.c);
                                sQLiteStatement.bindLong(2, k1qVar4.e);
                                sQLiteStatement.bindString(3, (String) k1qVar4.k.getValue());
                                try {
                                    if (sQLiteStatement.simpleQueryForString() != null) {
                                        z = false;
                                    }
                                } catch (SQLiteDoneException unused) {
                                }
                                return Boolean.valueOf(z);
                            }
                        };
                        k1qVar3.b.execute(new Runnable() { // from class: xsna.h1q
                            @Override // java.lang.Runnable
                            public final void run() {
                                gzs gzsVar3 = gzs.this;
                                k1q k1qVar22 = k1qVar3;
                                Event event3 = event2;
                                gzs gzsVar22 = gzsVar;
                                if (((Boolean) gzsVar3.invoke()).booleanValue()) {
                                    SQLiteDatabase a2 = k1qVar22.a();
                                    ContentValues contentValues = new ContentValues(3);
                                    contentValues.put("event_name", event3.a.c);
                                    contentValues.put("app_hash", (String) k1qVar22.k.getValue());
                                    contentValues.put("session_id", Long.valueOf(((Number) k1qVar22.f.getValue()).longValue()));
                                    contentValues.put("date", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("user_id", Long.valueOf(k1qVar22.e));
                                    a2.insert("events", null, contentValues);
                                    gzsVar22.invoke();
                                }
                            }
                        });
                    }
                } else if (i == 4) {
                    final k1q k1qVar4 = vkMainTracker.i;
                    if (k1qVar4 != null) {
                        final gu2 gu2Var = new gu2(1, vkMainTracker, event2);
                        long currentTimeMillis = System.currentTimeMillis();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(currentTimeMillis);
                        calendar.set(10, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        final com.vk.movika.sdk.base.ui.h hVar = new com.vk.movika.sdk.base.ui.h(calendar.getTimeInMillis(), k1qVar4, event2, 1);
                        k1qVar4.b.execute(new Runnable() { // from class: xsna.h1q
                            @Override // java.lang.Runnable
                            public final void run() {
                                gzs gzsVar3 = gzs.this;
                                k1q k1qVar22 = k1qVar4;
                                Event event3 = event2;
                                gzs gzsVar22 = gu2Var;
                                if (((Boolean) gzsVar3.invoke()).booleanValue()) {
                                    SQLiteDatabase a2 = k1qVar22.a();
                                    ContentValues contentValues = new ContentValues(3);
                                    contentValues.put("event_name", event3.a.c);
                                    contentValues.put("app_hash", (String) k1qVar22.k.getValue());
                                    contentValues.put("session_id", Long.valueOf(((Number) k1qVar22.f.getValue()).longValue()));
                                    contentValues.put("date", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("user_id", Long.valueOf(k1qVar22.e));
                                    a2.insert("events", null, contentValues);
                                    gzsVar22.invoke();
                                }
                            }
                        });
                    }
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkMainTracker.v(event2);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.ohp0
    public final void l(String str) {
        Iterator<T> it = p().iterator();
        while (it.hasNext()) {
            ((ohp0) it.next()).l(str);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void m(gzs<s3q0> gzsVar) {
        if (r()) {
            gzsVar.invoke();
        } else {
            n().add(gzsVar);
        }
    }

    public List<gzs<s3q0>> n() {
        return this.c;
    }

    public final ohp0 o(String str) {
        Object obj;
        Iterator<T> it = p().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ohp0) obj).getId(), str)) {
                break;
            }
        }
        return (ohp0) obj;
    }

    public List<ohp0> p() {
        return this.a;
    }

    public Set<String> q() {
        return this.b;
    }

    public final boolean r() {
        return this.g == State.INITIALIZED;
    }

    public final void s(Collection collection, StopBgSyncAnrStackTraceInfoException stopBgSyncAnrStackTraceInfoException) {
        m(new fpb(collection, this, stopBgSyncAnrStackTraceInfoException, 4));
    }

    public final void t(Throwable th) {
        a(th);
        if (this.j) {
            ((Handler) this.d.getValue()).post(new x52(th, 17));
        }
    }

    public final void u() {
        if (!r()) {
            throw new IllegalStateException("Trying to send events when uninitialized!");
        }
        Iterator<gzs<s3q0>> it = n().iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        n().clear();
    }

    public void v(Event event) {
        Set<String> a2 = event.a();
        Event.a aVar = event.a;
        if (!q().containsAll(a2)) {
            t(new IllegalStateException("Event " + aVar.c + " is targeted by " + getClass().getSimpleName() + " to tracker that is not registered '" + event.a() + "'. Registered trackers are " + q()));
        }
        this.h.getClass();
        jgp jgpVar = qhp0.b;
        if (jgpVar == null) {
            jgpVar = null;
        }
        aVar.f = false;
        aVar.d(jgpVar);
        aVar.f = true;
        for (ohp0 ohp0Var : p()) {
            if (event.a().isEmpty() || event.a().contains(ohp0Var.getId())) {
                ohp0Var.k(event);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.ohp0
    public void h(izs<? super Event, s3q0> izsVar) {
    }
}
