package bo.app;

import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJT\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052(\u0010\u000b\u001a$\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\bj\u0002`\t0\u0007j\u0002`\nH\u0002J\u001c\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J*\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J*\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J*\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J+\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0012J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R*\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00130\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001b"}, d2 = {"Lbo/app/b1;", "Lbo/app/h2;", "T", "Lcom/braze/events/IEventSubscriber;", "subscriber", "Ljava/lang/Class;", "eventClass", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/braze/events/EventSubscribers;", "Lcom/braze/events/EventSubscriptionMap;", "subscriptionMap", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "b", "c", "message", "(Ljava/lang/Object;Ljava/lang/Class;)V", "", "publishReplayCache", "Ljava/util/concurrent/ConcurrentMap;", "()Ljava/util/concurrent/ConcurrentMap;", "Lbo/app/f5;", "sdkEnablementProvider", "<init>", "(Lbo/app/f5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class b1 implements h2 {
    public static final a h = new a(null);
    private final f5 a;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> b;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> c;
    private final ConcurrentMap<Class<?>, Object> d;
    private final ReentrantLock e;
    private final ReentrantLock f;
    private final ReentrantLock g;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0002JT\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\"\u0004\b\u0000\u0010\u0002*$\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\nj\u0002`\u000b0\tj\u0002`\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0011"}, d2 = {"Lbo/app/b1$a;", "", "T", "Ljava/lang/Class;", "eventClass", "", "Lcom/braze/events/IEventSubscriber;", "subscriberList", Constants.BRAZE_PUSH_CONTENT_KEY, "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/braze/events/EventSubscribers;", "Lcom/braze/events/EventSubscriptionMap;", "Ljava/util/concurrent/locks/ReentrantLock;", SentryStackFrame.JsonKeys.LOCK, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.b1$a$a, reason: collision with other inner class name */
        static final class C0072a extends Lambda implements Function0<String> {
            final /* synthetic */ Class<T> b;
            final /* synthetic */ Set<IEventSubscriber<?>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0072a(Class<T> cls, Set<? extends IEventSubscriber<?>> set) {
                super(0);
                this.b = cls;
                this.c = set;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Triggering " + ((Object) this.b.getName()) + " on " + this.c.size() + " subscribers.";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Set<IEventSubscriber<T>> a(Class<T> eventClass, Set<? extends IEventSubscriber<?>> subscriberList) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0072a(eventClass, subscriberList), 3, (Object) null);
            return subscriberList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Set<IEventSubscriber<?>> a(ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> concurrentMap, Class<T> cls, ReentrantLock reentrantLock) {
            reentrantLock.lock();
            try {
                CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet = concurrentMap.get(cls);
                if (copyOnWriteArraySet == null) {
                    return new HashSet();
                }
                HashSet hashSet = new HashSet(copyOnWriteArraySet);
                ArrayList arrayList = new ArrayList();
                for (T t : copyOnWriteArraySet) {
                    if (t instanceof IFireOnceEventSubscriber) {
                        arrayList.add(t);
                    }
                }
                copyOnWriteArraySet.removeAll(CollectionsKt.toSet(arrayList));
                concurrentMap.put(cls, copyOnWriteArraySet);
                return hashSet;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Publishing cached event for class: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;
        final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class<T> cls, T t) {
            super(0);
            this.b = cls;
            this.c = t;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not publishing event class: " + ((Object) this.b.getName()) + " and message: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Not publishing null message to event class ", this.b.getName());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;
        final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Class<T> cls, T t) {
            super(0);
            this.b = cls;
            this.c = t;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((Object) this.b.getName()) + " fired:\n" + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.events.EventMessenger$publish$4", f = "EventMessenger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ IEventSubscriber<T> c;
        final /* synthetic */ T d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(IEventSubscriber<T> iEventSubscriber, T t, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = iEventSubscriber;
            this.d = t;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.c.trigger(this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Event was published, but no subscribers were found. But not saving event for publishing later. Event class: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ", this.b);
        }
    }

    public b1(f5 sdkEnablementProvider) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.a = sdkEnablementProvider;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ReentrantLock();
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
    }

    @Override // bo.app.h2
    public <T> void a(Class<T> eventClass, IEventSubscriber<T> subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            a(subscriber, eventClass, this.b);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.h2
    public <T> boolean b(Class<T> eventClass, IEventSubscriber<T> subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return a(subscriber, eventClass, this.c);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ConcurrentMap<Class<?>, Object> c() {
        return this.d;
    }

    @Override // bo.app.h2
    public <T> boolean c(Class<T> eventClass, IEventSubscriber<T> subscriber) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet = this.b.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            c().remove(ContentCardsUpdatedEvent.class);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bo.app.h2
    public <T> void a(T message, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (this.a.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(eventClass, message), 3, (Object) null);
            return;
        }
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(eventClass), 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(eventClass, message), 3, (Object) null);
        a aVar = h;
        Set a2 = aVar.a(this.b, eventClass, this.e);
        Iterator it = aVar.a(eventClass, a2).iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new f((IEventSubscriber) it.next(), message, null), 3, null);
        }
        a aVar2 = h;
        Set a3 = aVar2.a(this.c, eventClass, this.f);
        Iterator it2 = aVar2.a(eventClass, a3).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(message);
        }
        if (a3.isEmpty() && a2.isEmpty()) {
            if (Intrinsics.areEqual(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(eventClass), 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new h(eventClass), 2, (Object) null);
            ReentrantLock reentrantLock = this.g;
            reentrantLock.lock();
            try {
                c().put(eventClass, message);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // bo.app.h2
    public void a() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            this.b.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f;
            reentrantLock2.lock();
            try {
                this.c.clear();
                Unit unit2 = Unit.INSTANCE;
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final <T> boolean a(IEventSubscriber<T> subscriber, Class<T> eventClass, ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> subscriptionMap) {
        CopyOnWriteArraySet<IEventSubscriber<?>> putIfAbsent;
        CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet = subscriptionMap.get(eventClass);
        if (copyOnWriteArraySet == null && (putIfAbsent = subscriptionMap.putIfAbsent(eventClass, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
            copyOnWriteArraySet = putIfAbsent;
        }
        boolean add = copyOnWriteArraySet.add(subscriber);
        a(eventClass);
        return add;
    }

    private final <T> void a(Class<T> eventClass) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (c().containsKey(eventClass)) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(eventClass), 2, (Object) null);
                    Object remove = c().remove(eventClass);
                    if (remove != null) {
                        a((b1) remove, (Class<b1>) eventClass);
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
