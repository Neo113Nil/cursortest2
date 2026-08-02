package bo.app;

import Ph.AbstractC1459k;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r7 implements m9 {

    /* renamed from: j, reason: collision with root package name */
    public static final p7 f25977j = new p7();

    /* renamed from: a, reason: collision with root package name */
    public final he f25978a;

    /* renamed from: b, reason: collision with root package name */
    public final u4 f25979b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f25980c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f25981d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f25982e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f25983f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f25984g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f25985h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25986i;

    public r7(he sdkEnablementProvider, u4 delayedInitializationProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(delayedInitializationProvider, "delayedInitializationProvider");
        this.f25978a = sdkEnablementProvider;
        this.f25979b = delayedInitializationProvider;
        this.f25980c = new ConcurrentHashMap();
        this.f25981d = new ConcurrentHashMap();
        this.f25982e = new ConcurrentHashMap();
        this.f25983f = new ReentrantLock();
        this.f25984g = new ReentrantLock();
        this.f25985h = new ReentrantLock();
        this.f25986i = !z10;
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ra
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.r7.b();
            }
        }, 7, (Object) null);
        this.f25986i = true;
        ReentrantLock reentrantLock = this.f25985h;
        reentrantLock.lock();
        try {
            for (Class cls : this.f25982e.keySet()) {
                Intrinsics.checkNotNull(cls);
                a(cls);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean c(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f25984g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f25981d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean add = copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
            return add;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f25983f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f25980c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean b(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f25984g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f25981d.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class eventClass) {
        boolean z10;
        d9 d9Var;
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if ((obj instanceof be) || (obj instanceof fe)) {
            z10 = true;
        } else {
            if ((obj instanceof o5) && (d9Var = ((o5) obj).f25852d) != null) {
                ((i2) d9Var).e();
            }
            if (obj instanceof ad) {
                ((ad) obj).f25252a.e();
            }
            if (obj instanceof zc) {
                ((zc) obj).f26356a.e();
            }
            if (obj instanceof s5) {
                ((i2) ((s5) obj).f26039a).e();
            }
            z10 = false;
        }
        boolean z11 = z10;
        if (this.f25978a.a() || this.f25979b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new Function0() { // from class: c3.qa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.r7.a(bo.app.r7.this, eventClass, obj);
                }
            }, 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new Function0() { // from class: c3.la
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.r7.d(eventClass);
                }
            }, 3, (Object) null);
            return;
        }
        if (!this.f25986i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new Function0() { // from class: c3.ma
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.r7.a(eventClass, obj);
                }
            }, 3, (Object) null);
            a(obj, eventClass);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new Function0() { // from class: c3.na
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.r7.b(eventClass, obj);
            }
        }, 3, (Object) null);
        p7 p7Var = f25977j;
        HashSet a10 = p7.a(this.f25980c, eventClass, this.f25983f);
        Iterator it = ((HashSet) p7Var.a(eventClass, a10)).iterator();
        while (it.hasNext()) {
            AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new q7((IEventSubscriber) it.next(), obj, null), 3, null);
        }
        p7 p7Var2 = f25977j;
        HashSet a11 = p7.a(this.f25981d, eventClass, this.f25984g);
        Iterator it2 = ((HashSet) p7Var2.a(eventClass, a11)).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (a11.isEmpty() && a10.isEmpty()) {
            if (Intrinsics.areEqual(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f29471I, (Throwable) null, z11, new Function0() { // from class: c3.oa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.r7.a(eventClass, this);
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f29471I, (Throwable) null, z11, new Function0() { // from class: c3.pa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.r7.b(eventClass, this);
                    }
                }, 2, (Object) null);
                a(obj, eventClass);
            }
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class " + cls.getName();
    }

    public final boolean a(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f25983f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f25980c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f25983f;
        reentrantLock.lock();
        try {
            this.f25980c.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f25984g;
            reentrantLock2.lock();
            try {
                this.f25981d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String c(Class cls) {
        return "Publishing cached event for class: " + cls;
    }

    public static final String a(r7 r7Var, Class cls, Object obj) {
        return "SDK delayed initialization mode: " + r7Var.f25979b.c() + " and GDPR disabled mode: " + r7Var.f25978a.a() + ". Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, r7 r7Var) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + " " + r7Var;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.f25985h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            if (this.f25982e.containsKey(cls)) {
                List list = (List) this.f25982e.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.f25982e.put(cls, CollectionsKt.mutableListOf(obj));
                }
            } else {
                this.f25982e.put(cls, CollectionsKt.mutableListOf(obj));
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void a(final Class cls) {
        if (!this.f25986i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ja
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.r7.b(cls);
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f25985h;
        reentrantLock.lock();
        try {
            if (this.f25982e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.ka
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.r7.c(cls);
                    }
                }, 6, (Object) null);
                Object remove = this.f25982e.remove(cls);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlin.collections.List<T of com.braze.events.EventMessenger.attemptPublishFromCache>");
                Iterator it = ((List) remove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, r7 r7Var) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + r7Var;
    }

    public static final String b(Class cls) {
        return "Not publishing cached event for class: " + cls + " because events are not allowed to send yet.";
    }
}
