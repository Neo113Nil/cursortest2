package j10;

import A00.a;
import A00.e;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2425z;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import fd.InterfaceC6511n;
import h10.AbstractC6779a;
import h10.C6780b;
import h10.C6782d;
import i10.C6997c;
import i10.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import x00.C10622a;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.InterfaceC10724g0;
import xe.InterfaceC10746s;
import xe.M;
import xe.X0;
import y00.AbstractC10819a;

/* loaded from: classes7.dex */
public final class d<I extends C7854a> implements InterfaceC7238a<I>, M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f68758a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f68759b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<C6997c<I>> f68760c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<A00.a> f68761d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<C6997c<I>> f68762e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<AbstractC10819a> f68763f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b<I> f68764g;

    public static final class a<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C0 f68765a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final y00.b f68766b;

        public a(@NotNull C0 effectFlow, @NotNull y00.b effectPublisher) {
            Intrinsics.checkNotNullParameter(effectFlow, "effectFlow");
            Intrinsics.checkNotNullParameter(effectPublisher, "effectPublisher");
            this.f68765a = effectFlow;
            this.f68766b = effectPublisher;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(@NotNull A00.a aVar, @NotNull C6997c c6997c, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
            C7240c c7240c;
            int i11;
            Iterator it;
            a<I> aVar2;
            if (cVar instanceof C7240c) {
                c7240c = (C7240c) cVar;
                int i12 = c7240c.f68757h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c7240c.f68757h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c7240c.f68755f;
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c7240c.f68757h;
                    if (i11 != 0) {
                        s.b(obj);
                        List<AbstractC10819a> d11 = this.f68766b.d(aVar, c6997c);
                        if (d11.isEmpty()) {
                            return Unit.f71690a;
                        }
                        it = d11.iterator();
                        aVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c7240c.f68754e;
                        aVar2 = c7240c.f68753d;
                        s.b(obj);
                    }
                    while (it.hasNext()) {
                        AbstractC10819a abstractC10819a = (AbstractC10819a) it.next();
                        ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                        if (H00.b.c()) {
                            H00.b.b().e(cVar2, Pk0.g.c(Thread.currentThread(), ": ", "publish effect " + abstractC10819a), "ComposerStore", null, Boolean.TRUE);
                        }
                        C0 c02 = aVar2.f68765a;
                        c7240c.f68753d = aVar2;
                        c7240c.f68754e = it;
                        c7240c.f68757h = 1;
                        if (c02.emit(abstractC10819a, c7240c) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f71690a;
                }
            }
            c7240c = new C7240c(this, cVar);
            Object obj2 = c7240c.f68755f;
            Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c7240c.f68757h;
            if (i11 != 0) {
            }
            while (it.hasNext()) {
            }
            return Unit.f71690a;
        }
    }

    public static final class b<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f68767a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final x0<C6997c<I>> f68768b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final c<I> f68769c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final J00.b f68770d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection<a> f68771e;

        public static final class a implements B0 {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final A00.a f68772a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final B0 f68773b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f68774c;

            public a(@NotNull A00.a event, @NotNull B0 job, boolean z11) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(job, "job");
                this.f68772a = event;
                this.f68773b = job;
                this.f68774c = z11;
            }

            @Override // xe.B0
            @NotNull
            public final InterfaceC10746s Q(@NotNull H0 child) {
                Intrinsics.checkNotNullParameter(child, "child");
                return ((H0) this.f68773b).Q(child);
            }

            @Override // xe.B0
            @NotNull
            public final InterfaceC10724g0 X(boolean z11, boolean z12, @NotNull Function1<? super Throwable, Unit> handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return ((H0) this.f68773b).X(z11, z12, handler);
            }

            @Override // xe.B0
            @NotNull
            public final CancellationException Z() {
                return this.f68773b.Z();
            }

            public final boolean a() {
                return this.f68774c;
            }

            @Override // xe.B0
            @NotNull
            public final Sequence<B0> d() {
                return this.f68773b.d();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f68772a, aVar.f68772a) && Intrinsics.d(this.f68773b, aVar.f68773b) && this.f68774c == aVar.f68774c;
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) this.f68773b.fold(r11, operation);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return (E) this.f68773b.get(key);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            @NotNull
            public final CoroutineContext.a<?> getKey() {
                return ((H0) this.f68773b).getKey();
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f68774c) + ((this.f68773b.hashCode() + (this.f68772a.hashCode() * 31)) * 31);
            }

            @Override // xe.B0
            public final boolean isActive() {
                return this.f68773b.isActive();
            }

            @Override // xe.B0
            public final boolean isCancelled() {
                return this.f68773b.isCancelled();
            }

            @Override // xe.B0
            public final void j(CancellationException cancellationException) {
                this.f68773b.j(cancellationException);
            }

            @Override // xe.B0
            public final boolean l0() {
                return this.f68773b.l0();
            }

            @Override // kotlin.coroutines.CoroutineContext
            @NotNull
            public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return this.f68773b.minusKey(key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            @NotNull
            public final CoroutineContext plus(@NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return this.f68773b.plus(context);
            }

            @Override // xe.B0
            public final Object r0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
                return this.f68773b.r0(dVar);
            }

            @Override // xe.B0
            public final boolean start() {
                return this.f68773b.start();
            }

            @NotNull
            public final String toString() {
                return "ComposerJob(event=" + this.f68772a + ", job=" + this.f68773b + ")";
            }

            @Override // xe.B0
            @NotNull
            public final InterfaceC10724g0 y(@NotNull Function1<? super Throwable, Unit> handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return ((H0) this.f68773b).y(handler);
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$MiddlewareWrapper$call$4", f = "ComposerStore.kt", l = {217}, m = "invokeSuspend")
        /* renamed from: j10.d$b$b, reason: collision with other inner class name */
        static final class C1123b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f68775d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b<I> f68776e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A00.a f68777f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<a> f68778g;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$MiddlewareWrapper$call$4$1", f = "ComposerStore.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
            /* renamed from: j10.d$b$b$a */
            static final class a extends j implements Function2<A00.a, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f68779d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f68780e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ b<I> f68781f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b<I> bVar, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f68781f = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    a aVar = new a(this.f68781f, dVar);
                    aVar.f68780e = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(A00.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((a) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f68779d;
                    if (i11 == 0) {
                        s.b(obj);
                        A00.a aVar2 = (A00.a) this.f68780e;
                        b<I> bVar = this.f68781f;
                        c cVar = ((b) bVar).f68769c;
                        C6997c c6997c = (C6997c) ((b) bVar).f68768b.getValue();
                        this.f68779d = 1;
                        if (cVar.a(aVar2, c6997c, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$MiddlewareWrapper$call$4$2", f = "ComposerStore.kt", l = {}, m = "invokeSuspend")
            /* renamed from: j10.d$b$b$b, reason: collision with other inner class name */
            static final class C1124b extends j implements InterfaceC6511n<InterfaceC2397i<? super A00.a>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.M<a> f68782d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ b<I> f68783e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1124b(kotlin.jvm.internal.M<a> m11, b<I> bVar, kotlin.coroutines.d<? super C1124b> dVar) {
                    super(3, dVar);
                    this.f68782d = m11;
                    this.f68783e = bVar;
                }

                @Override // fd.InterfaceC6511n
                public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                    return new C1124b(this.f68782d, this.f68783e, dVar).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    s.b(obj);
                    a aVar2 = this.f68782d.f71787a;
                    if (aVar2 != null) {
                        this.f68783e.g().remove(aVar2);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1123b(b<I> bVar, A00.a aVar, kotlin.jvm.internal.M<a> m11, kotlin.coroutines.d<? super C1123b> dVar) {
                super(2, dVar);
                this.f68776e = bVar;
                this.f68777f = aVar;
                this.f68778g = m11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1123b(this.f68776e, this.f68777f, this.f68778g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1123b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f68775d;
                if (i11 == 0) {
                    s.b(obj);
                    b<I> bVar = this.f68776e;
                    J00.a aVar2 = ((b) bVar).f68770d;
                    J00.b bVar2 = (J00.b) aVar2;
                    C2425z c2425z = new C2425z(new C2408n0(bVar2.l(this.f68777f, (C6997c) ((b) bVar).f68768b.getValue()), new a(bVar, null)), new C1124b(this.f68778g, bVar, null));
                    this.f68775d = 1;
                    if (C2399j.g(c2425z, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        public b(@NotNull d scope, @NotNull x0 stateFlow, @NotNull c reducer, @NotNull J00.b middleware) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(stateFlow, "stateFlow");
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            Intrinsics.checkNotNullParameter(middleware, "middleware");
            this.f68767a = scope;
            this.f68768b = stateFlow;
            this.f68769c = reducer;
            this.f68770d = middleware;
            this.f68771e = Collections.synchronizedCollection(new ArrayList());
        }

        private static void e(Collection collection, Function1 function1) {
            synchronized (collection) {
                try {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (((Boolean) function1.invoke(aVar)).booleanValue()) {
                            if (!aVar.isCancelled() && !aVar.l0()) {
                                aVar.j(null);
                            }
                            it.remove();
                        }
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [T, j10.d$b$a] */
        public final void d(@NotNull A00.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            if (H00.b.c()) {
                H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", "execute " + event), "ComposerStore", null, Boolean.TRUE);
            }
            if ((event instanceof a.u.C0013a) && this.f68768b.getValue().p()) {
                if (H00.b.c()) {
                    H00.b.b().e(cVar, Thread.currentThread() + ": ignore first load event cause already loaded", "ComposerStore", null, Boolean.TRUE);
                    return;
                }
                return;
            }
            boolean z11 = event instanceof a.InterfaceC2366g;
            Collection<a> all = this.f68771e;
            if (z11) {
                if (H00.b.c()) {
                    ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
                    Thread currentThread = Thread.currentThread();
                    Intrinsics.checkNotNullExpressionValue(all, "all");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : all) {
                        if (((a) obj).a()) {
                            arrayList.add(obj);
                        }
                    }
                    b11.e(cVar, Pk0.g.c(currentThread, ": ", "cancel " + arrayList + " by " + event), "ComposerStore", null, Boolean.TRUE);
                }
                Intrinsics.checkNotNullExpressionValue(all, "all");
                e(all, f.f68794b);
            }
            kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            ?? aVar = new a(event, C10727i.c(this.f68767a, null, null, new C1123b(this, event, m11, null), 3), event instanceof a.InterfaceC2365f);
            m11.f71787a = aVar;
            if (aVar.isActive()) {
                all.add(m11.f71787a);
            }
        }

        public final void f() {
            Collection<a> all = this.f68771e;
            Intrinsics.checkNotNullExpressionValue(all, "all");
            e(all, e.f68793b);
        }

        public final Collection<a> g() {
            return this.f68771e;
        }
    }

    public static final class c<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final x0<C6997c<I>> f68784a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C0 f68785b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C0 f68786c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final C6780b f68787d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final a<I> f68788e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final C6782d f68789f;

        public c(@NotNull x0 stateFlow, @NotNull C0 eventFlow, @NotNull C0 eventsListener, @NotNull C6780b postProcessor, @NotNull a effectPublisher, @NotNull C6782d reducer) {
            Intrinsics.checkNotNullParameter(stateFlow, "stateFlow");
            Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
            Intrinsics.checkNotNullParameter(eventsListener, "eventsListener");
            Intrinsics.checkNotNullParameter(postProcessor, "postProcessor");
            Intrinsics.checkNotNullParameter(effectPublisher, "effectPublisher");
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            this.f68784a = stateFlow;
            this.f68785b = eventFlow;
            this.f68786c = eventsListener;
            this.f68787d = postProcessor;
            this.f68788e = effectPublisher;
            this.f68789f = reducer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x01ea, code lost:
        
            if (r7.f68785b.emit(r0, r1) == r2) goto L93;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(@NotNull A00.a aVar, @NotNull C6997c c6997c, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
            g gVar;
            Wc.a aVar2;
            int i11;
            C6997c<I> g10;
            c<I> cVar2;
            C0 c02;
            A00.a event;
            C6997c<I> state;
            c<I> cVar3;
            a<I> aVar3;
            c<I> cVar4;
            Object c2373n;
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i12 = gVar.f68800i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    gVar.f68800i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = gVar.f68798g;
                    aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = gVar.f68800i;
                    if (i11 != 0) {
                        s.b(obj);
                        ru.ozon.android.ozonLogger.core.c cVar5 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                        if (H00.b.c()) {
                            H00.b.b().e(cVar5, Pk0.g.c(Thread.currentThread(), ": ", "reduce event " + aVar), "ComposerStore", null, Boolean.TRUE);
                        }
                        g10 = this.f68789f.g(aVar, c6997c);
                        gVar.f68795d = this;
                        gVar.f68796e = aVar;
                        gVar.f68797f = g10;
                        gVar.f68800i = 1;
                        if (this.f68784a.emit(g10, gVar) != aVar2) {
                            cVar2 = this;
                        }
                        return aVar2;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            state = gVar.f68797f;
                            event = gVar.f68796e;
                            cVar3 = gVar.f68795d;
                            s.b(obj);
                            aVar3 = cVar3.f68788e;
                            gVar.f68795d = cVar3;
                            gVar.f68796e = event;
                            gVar.f68797f = state;
                            gVar.f68800i = 3;
                            if (aVar3.a(event, state, gVar) != aVar2) {
                                cVar4 = cVar3;
                                C6780b c6780b = cVar4.f68787d;
                                Intrinsics.checkNotNullParameter(event, "event");
                                Intrinsics.checkNotNullParameter(state, "state");
                                if (!(event instanceof a.u.C0013a)) {
                                }
                                if (c2373n != null) {
                                }
                                return Unit.f71690a;
                            }
                            return aVar2;
                        }
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        state = gVar.f68797f;
                        event = gVar.f68796e;
                        cVar4 = gVar.f68795d;
                        s.b(obj);
                        C6780b c6780b2 = cVar4.f68787d;
                        Intrinsics.checkNotNullParameter(event, "event");
                        Intrinsics.checkNotNullParameter(state, "state");
                        if (!(event instanceof a.u.C0013a)) {
                            c2373n = new a.C2373n(state.l(), event);
                        } else if (event instanceof a.u.b) {
                            h.c d11 = state.l().d();
                            h.b c11 = state.l().c();
                            A00.e b11 = c11 != null ? c11.b() : null;
                            c2373n = (b11 == null || (b11.f() instanceof e.c.b) || !(d11 instanceof h.c.a)) ? new a.C2373n(state.l(), event) : new a.s((a.u.b) event, state.l(), (h.c.a) d11, b11);
                        } else {
                            c2373n = event instanceof a.u.c ? new a.C2373n(state.l(), event) : event instanceof a.r.C0012a ? new a.q((a.r) event, state.l()) : event instanceof a.r.b ? new a.v((a.r.b) event, state.l()) : event instanceof a.C2372m ? state.l().c() == null ? a.C2370k.f211a : (((a.C2372m) event).d() || state.o().f()) ? a.C2370k.f211a : a.C2362c.f204a : Intrinsics.d(event, a.C2362c.f204a) ? a.C2370k.f211a : event instanceof a.p ? ((a.p) event).d() != null ? a.C2370k.f211a : (state.j() == null || !state.s()) ? a.C2370k.f211a : new a.r.C0012a(false) : null;
                        }
                        if (c2373n != null) {
                            ru.ozon.android.ozonLogger.core.c cVar6 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                            if (H00.b.c()) {
                                H00.b.b().e(cVar6, Pk0.g.c(Thread.currentThread(), ": ", "process event " + c2373n), "ComposerStore", null, Boolean.TRUE);
                            }
                            gVar.f68795d = null;
                            gVar.f68796e = null;
                            gVar.f68797f = null;
                            gVar.f68800i = 4;
                        }
                        return Unit.f71690a;
                    }
                    C6997c<I> c6997c2 = gVar.f68797f;
                    A00.a aVar4 = gVar.f68796e;
                    cVar2 = gVar.f68795d;
                    s.b(obj);
                    g10 = c6997c2;
                    aVar = aVar4;
                    c02 = cVar2.f68786c;
                    gVar.f68795d = cVar2;
                    gVar.f68796e = aVar;
                    gVar.f68797f = g10;
                    gVar.f68800i = 2;
                    if (c02.emit(aVar, gVar) != aVar2) {
                        event = aVar;
                        state = g10;
                        cVar3 = cVar2;
                        aVar3 = cVar3.f68788e;
                        gVar.f68795d = cVar3;
                        gVar.f68796e = event;
                        gVar.f68797f = state;
                        gVar.f68800i = 3;
                        if (aVar3.a(event, state, gVar) != aVar2) {
                        }
                    }
                    return aVar2;
                }
            }
            gVar = new g(this, cVar);
            Object obj2 = gVar.f68798g;
            aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = gVar.f68800i;
            if (i11 != 0) {
            }
            c02 = cVar2.f68786c;
            gVar.f68795d = cVar2;
            gVar.f68796e = aVar;
            gVar.f68797f = g10;
            gVar.f68800i = 2;
            if (c02.emit(aVar, gVar) != aVar2) {
            }
            return aVar2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$emit$1", f = "ComposerStore.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: j10.d$d, reason: collision with other inner class name */
    static final class C1125d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f68790d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d<I> f68791e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A00.a f68792f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1125d(d<I> dVar, A00.a aVar, kotlin.coroutines.d<? super C1125d> dVar2) {
            super(2, dVar2);
            this.f68791e = dVar;
            this.f68792f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1125d(this.f68791e, this.f68792f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1125d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f68790d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = ((d) this.f68791e).f68759b;
                this.f68790d = 1;
                if (c02.emit(this.f68792f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public d(@NotNull C6997c initialState, @NotNull C6780b postProcessor, @NotNull y00.b effectPublisher, @NotNull C6782d reducer, @NotNull J00.b middleware, @NotNull List list, @NotNull C10622a dispatchersProvider) {
        Map c11;
        List additionalStateReducers = list;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(postProcessor, "postProcessor");
        Intrinsics.checkNotNullParameter(effectPublisher, "effectPublisher");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(middleware, "middleware");
        Intrinsics.checkNotNullParameter(additionalStateReducers, "additionalStateReducers");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.f68758a = CoroutineContext.Element.a.d(dispatchersProvider.b().b(), (H0) X0.b());
        this.f68759b = E0.b(0, 0, null, 7);
        additionalStateReducers = additionalStateReducers.isEmpty() ? null : additionalStateReducers;
        if (additionalStateReducers != null) {
            List<AbstractC6779a> list2 = additionalStateReducers;
            int h11 = U.h(C7714v.z(list2, 10));
            c11 = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (AbstractC6779a abstractC6779a : list2) {
                Pair pair = new Pair(abstractC6779a.b(), abstractC6779a.a());
                c11.put(pair.e(), pair.f());
            }
        } else {
            c11 = U.c();
        }
        x0<C6997c<I>> a11 = O0.a(C6997c.c(initialState, null, null, null, null, null, null, false, false, 0L, null, c11, null, 49151));
        this.f68760c = a11;
        C0 b11 = E0.b(0, 0, null, 7);
        C0 b12 = E0.b(0, 0, null, 7);
        this.f68761d = C2399j.a(b12);
        this.f68762e = C2399j.b(a11);
        this.f68763f = C2399j.a(b11);
        this.f68764g = new b<>(this, a11, new c(a11, this.f68759b, b12, postProcessor, new a(b11, effectPublisher), reducer), middleware);
        C10727i.c(this, null, null, new C7239b(this, null), 3);
    }

    @Override // j10.InterfaceC7238a
    public final void a() {
        this.f68764g.f();
        xe.E0.b(this.f68758a, null);
    }

    @Override // j10.InterfaceC7238a
    @NotNull
    public final C6997c<I> b() {
        return this.f68760c.getValue();
    }

    @Override // j10.InterfaceC7238a
    public final void c(@NotNull A00.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(this, null, null, new C1125d(this, event, null), 3);
    }

    @Override // j10.InterfaceC7238a
    @NotNull
    public final InterfaceC2395h<AbstractC10819a> d() {
        return this.f68763f;
    }

    @NotNull
    public final b<I> f() {
        return this.f68764g;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f68758a;
    }

    @Override // j10.InterfaceC7238a
    @NotNull
    public final InterfaceC2395h<A00.a> getEvents() {
        return this.f68761d;
    }

    @Override // j10.InterfaceC7238a
    @NotNull
    public final InterfaceC2395h<C6997c<I>> getState() {
        return this.f68762e;
    }
}
