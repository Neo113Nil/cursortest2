package com.braze.events;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.internal.g;
import com.braze.events.internal.q;
import com.braze.events.internal.r;
import com.braze.events.internal.u;
import com.braze.events.internal.v;
import com.braze.requests.o;
import com.braze.storage.t0;
import com.braze.storage.v2;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class d implements e {
    public static final b j = new b();

    /* renamed from: a, reason: collision with root package name */
    public final v2 f509a;
    public final t0 b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ReentrantLock f;
    public final ReentrantLock g;
    public final ReentrantLock h;
    public boolean i;

    public d(v2 sdkEnablementProvider, t0 delayedInitializationProvider, boolean z) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(delayedInitializationProvider, "delayedInitializationProvider");
        this.f509a = sdkEnablementProvider;
        this.b = delayedInitializationProvider;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
        this.h = new ReentrantLock();
        this.i = !z;
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.b();
            }
        }, 7, (Object) null);
        this.i = true;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            for (Class cls : this.e.keySet()) {
                Intrinsics.checkNotNull(cls);
                a(cls);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.d;
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
            return add;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.c;
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
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.d.get(eventClass);
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
        o oVar;
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        boolean z = true;
        if (!(obj instanceof u) && !(obj instanceof v) && ((!(obj instanceof com.braze.events.internal.dispatchmanager.c) || (oVar = ((com.braze.events.internal.dispatchmanager.c) obj).d) == null || !((com.braze.requests.b) oVar).e().d) && ((!(obj instanceof r) || !((r) obj).f534a.e().d) && ((!(obj instanceof q) || !((q) obj).f533a.e().d) && (!(obj instanceof g) || !((com.braze.requests.b) ((g) obj).f522a).e().d))))) {
            z = false;
        }
        boolean z2 = z;
        if (this.f509a.a() || this.b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.a(d.this, eventClass, obj);
                }
            }, 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.d(eventClass);
                }
            }, 3, (Object) null);
            return;
        }
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.a(eventClass, obj);
                }
            }, 3, (Object) null);
            a(obj, eventClass);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.b(eventClass, obj);
            }
        }, 3, (Object) null);
        b bVar = j;
        HashSet a2 = b.a(this.c, eventClass, this.f);
        Iterator it = bVar.a(eventClass, a2).iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new c((IEventSubscriber) it.next(), obj, null), 3, null);
        }
        b bVar2 = j;
        HashSet a3 = b.a(this.d, eventClass, this.g);
        Iterator it2 = bVar2.a(eventClass, a3).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (a3.isEmpty() && a2.isEmpty()) {
            if (Intrinsics.areEqual(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.a(eventClass, this);
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z2, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.b(eventClass, this);
                    }
                }, 2, (Object) null);
                a(obj, eventClass);
            }
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.c.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.g;
            reentrantLock2.lock();
            try {
                this.d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class " + cls.getName();
    }

    public static final String c(Class cls) {
        return "Publishing cached event for class: " + cls;
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + dVar;
    }

    public static final String b(Class cls) {
        return "Not publishing cached event for class: " + cls + " because events are not allowed to send yet.";
    }

    public final boolean a(Class eventClass, IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(d dVar, Class cls, Object obj) {
        return "SDK delayed initialization mode: " + dVar.b.c() + " and GDPR disabled mode: " + dVar.f509a.a() + ". Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + " " + dVar;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        if (obj == null) {
            return;
        }
        try {
            if (this.e.containsKey(cls)) {
                List list = (List) this.e.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.e.put(cls, CollectionsKt.mutableListOf(obj));
                }
            } else {
                this.e.put(cls, CollectionsKt.mutableListOf(obj));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(final Class cls) {
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.b(cls);
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.events.d$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.c(cls);
                    }
                }, 6, (Object) null);
                Object remove = this.e.remove(cls);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlin.collections.List<T of com.braze.events.EventMessenger.attemptPublishFromCache>");
                Iterator it = ((List) remove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
