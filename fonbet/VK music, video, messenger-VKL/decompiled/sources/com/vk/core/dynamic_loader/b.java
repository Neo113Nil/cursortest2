package com.vk.core.dynamic_loader;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicLibLoadException;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.log.L;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import xsna.aqo;
import xsna.bpn0;
import xsna.bti;
import xsna.c5g;
import xsna.c63;
import xsna.cqo;
import xsna.epx;
import xsna.gzs;
import xsna.j5g;
import xsna.k6k;
import xsna.mlk0;
import xsna.nlk0;
import xsna.s3q0;
import xsna.sk3;
import xsna.t0f;
import xsna.ta3;
import xsna.ua3;
import xsna.uqn0;
import xsna.vpo;
import xsna.vu5;
import xsna.wpo;
import xsna.zkb;

/* compiled from: DynamicLibLoader.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class b {
    public static vpo a;
    public static Context c;
    public static ScheduledExecutorService d;
    public static boolean m;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final bpn0 e = new bpn0(new t0f(1));
    public static final aqo f = new aqo();
    public static final HashMap<DynamicTask, Integer> g = new HashMap<>();
    public static final HashMap<DynamicTask, uqn0> h = new HashMap<>();
    public static final HashMap<Integer, d<AbstractC0762b>> i = new HashMap<>();
    public static final HashMap<Integer, Integer> j = new HashMap<>();
    public static final sk3<a> k = new sk3<>();
    public static final ReentrantLock l = new ReentrantLock();

    /* compiled from: DynamicLibLoader.kt */
    public static final class a {
        public final DynamicTask a;
        public final d<AbstractC0762b> b;
        public final int c;

        public a(int i, DynamicTask dynamicTask, d dVar) {
            this.a = dynamicTask;
            this.b = dVar;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnqueuedTask(task=");
            sb.append(this.a);
            sb.append(", listener=");
            sb.append(this.b);
            sb.append(", retryCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: DynamicLibLoader.kt */
    /* renamed from: com.vk.core.dynamic_loader.b$b, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static abstract class AbstractC0762b {

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$a */
        public static final class a extends AbstractC0762b {
            public static final a a = new a();
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$b, reason: collision with other inner class name */
        public static final class C0763b extends AbstractC0762b {
            public final zkb a;

            public C0763b(zkb zkbVar) {
                this.a = zkbVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0763b) && epx.f(this.a, ((C0763b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Confirmation(onStartConformation=" + this.a + ')';
            }
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$c */
        public static final class c extends AbstractC0762b {
            public static final c a = new c();
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$d */
        public static final class d extends AbstractC0762b {
            public final int a;
            public final boolean b;

            public d(int i) {
                this.a = i;
                this.b = i == 0;
            }

            public final boolean a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Loading(progress="), this.a, ')');
            }
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$e */
        public static final class e extends AbstractC0762b {
            public static final e a = new e();
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$f */
        public static final class f extends AbstractC0762b {
            public static final f a = new f();
        }

        /* compiled from: DynamicLibLoader.kt */
        /* renamed from: com.vk.core.dynamic_loader.b$b$g */
        public static final class g extends AbstractC0762b {
            public static final g a = new g();
        }
    }

    public static void a(gzs gzsVar) {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            gzsVar.invoke();
            if (!m) {
                a l2 = k.l();
                if (l2 == null) {
                    reentrantLock.unlock();
                    return;
                } else {
                    i(l2.c, l2.a, l2.b);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static DynamicTask b(int i2) {
        Object obj;
        Iterator<T> it = g.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) ((Map.Entry) obj).getValue();
            if (num != null && num.intValue() == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (DynamicTask) entry.getKey();
        }
        return null;
    }

    public static q c(DynamicTask dynamicTask) {
        a aVar;
        Set<NativeLib> h2 = dynamicTask.h();
        boolean z = false;
        if (h2 != null) {
            Set<NativeLib> set = h2;
            NativeLibLoader nativeLibLoader = NativeLibLoader.a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (NativeLib nativeLib : set) {
                    nativeLibLoader.getClass();
                    if (!NativeLibLoader.g(nativeLib)) {
                        break;
                    }
                }
            }
            z = true;
        }
        if (z) {
            L.p("DynamicLibLoader", "Dynamic lib has required artifacts - " + dynamicTask.name() + '!');
        }
        boolean isEmpty = d(dynamicTask).isEmpty();
        if (isEmpty) {
            L.p("DynamicLibLoader", "Dynamic lib has been already loaded - " + dynamicTask.name() + '!');
        }
        if (isEmpty || z || BuildInfo.p()) {
            return g0.b;
        }
        Integer num = g.get(dynamicTask);
        d<AbstractC0762b> dVar = i.get(num);
        if (num != null && dVar != null) {
            L.p("DynamicLibLoader", "Dynamic lib is already loading - " + dynamicTask.name() + '!');
            return dVar;
        }
        Iterator<a> it = k.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.a == dynamicTask) {
                break;
            }
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return null;
        }
        L.p("DynamicLibLoader", "Dynamic lib is already enqueued - " + dynamicTask.name());
        return aVar2.b;
    }

    public static List d(DynamicTask dynamicTask) {
        Set<DynamicLib> i2 = dynamicTask.i();
        ArrayList arrayList = new ArrayList(c5g.u(i2, 10));
        Iterator<T> it = i2.iterator();
        while (it.hasNext()) {
            arrayList.add(((DynamicLib) it.next()).i());
        }
        return j5g.t0(arrayList, e().e());
    }

    public static mlk0 e() {
        return (mlk0) e.getValue();
    }

    public static void f(Context context, ScheduledExecutorService scheduledExecutorService, bti btiVar) {
        int i2 = 1;
        if (b.compareAndSet(false, true)) {
            c = context;
            d = scheduledExecutorService;
            a = btiVar;
            com.vk.core.utils.newtork.b.a.getClass();
            com.vk.core.utils.newtork.b.d.subscribe(new ua3(new ta3(2), i2));
            c63 c63Var = c63.a;
            c63.a(new cqo());
        }
    }

    public static boolean g(DynamicTask dynamicTask) {
        Set<DynamicLib> i2 = dynamicTask.i();
        ArrayList arrayList = new ArrayList(c5g.u(i2, 10));
        Iterator<T> it = i2.iterator();
        while (it.hasNext()) {
            arrayList.add(((DynamicLib) it.next()).i());
        }
        return e().e().containsAll(arrayList);
    }

    public static q h(DynamicTask dynamicTask) {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            q c2 = c(dynamicTask);
            if (c2 != null) {
                return c2;
            }
            d N0 = d.N0();
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                return q.H(new DynamicException.Queuing());
            }
            if (g.isEmpty()) {
                c63 c63Var = c63.a;
                if (c63.f) {
                    i(0, dynamicTask, N0);
                    return N0;
                }
            }
            k.addLast(new a(0, dynamicTask, N0));
            N0.onNext(AbstractC0762b.f.a);
            return N0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void i(final int i2, final DynamicTask dynamicTask, final d dVar) {
        List d2 = d(dynamicTask);
        if (d2.isEmpty()) {
            a(new k6k(dVar, 5));
            return;
        }
        nlk0.a c2 = nlk0.c();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            c2.a((String) it.next());
        }
        nlk0 b2 = c2.b();
        L.p("DynamicLibLoader", "Starting installation of " + dynamicTask.name() + ", retry count is " + i2);
        m = false;
        Task<Integer> a2 = e().a(b2);
        final wpo wpoVar = new wpo(i2, dynamicTask, dVar);
        a2.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.xpo
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                wpo.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.ypo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                final int i3 = i2;
                final DynamicTask dynamicTask2 = dynamicTask;
                final io.reactivex.rxjava3.subjects.d dVar2 = dVar;
                if (i3 >= 4) {
                    dVar2.onError(new DynamicLibLoadException("Failed to load dynamic library - " + dynamicTask2.name(), exc));
                    return;
                }
                L.l("DynamicLibLoader", "Retry with after " + exc);
                c63 c63Var = c63.a;
                if (!c63.f) {
                    com.vk.core.dynamic_loader.b.k.addFirst(new b.a(i3 + 1, dynamicTask2, dVar2));
                    return;
                }
                com.vk.core.dynamic_loader.b.m = true;
                ScheduledExecutorService scheduledExecutorService = com.vk.core.dynamic_loader.b.d;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = null;
                }
                scheduledExecutorService.schedule(new Runnable() { // from class: xsna.zpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        DynamicTask dynamicTask3 = dynamicTask2;
                        io.reactivex.rxjava3.subjects.d dVar3 = dVar2;
                        int i4 = i3;
                        ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
                        reentrantLock.lock();
                        try {
                            com.vk.core.dynamic_loader.b.i(i4 + 1, dynamicTask3, dVar3);
                            s3q0 s3q0Var = s3q0.a;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }, 2L, TimeUnit.SECONDS);
            }
        });
    }
}
