package e3;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.E0;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {172}, m = "invokeSuspend")
/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6284a extends kotlin.coroutines.jvm.internal.j implements Function2<E0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61870d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f61871e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f61872f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v.b f61873g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f61874h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f61875i;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {174, 175}, m = "invokeSuspend")
    /* renamed from: e3.a$a, reason: collision with other inner class name */
    static final class C0968a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61876d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f61877e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f61878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ E0<Object> f61879g;

        /* renamed from: e3.a$a$a, reason: collision with other inner class name */
        static final class C0969a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0<T> f61880a;

            C0969a(E0<T> e02) {
                this.f61880a = e02;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                this.f61880a.setValue(t2);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {176}, m = "invokeSuspend")
        /* renamed from: e3.a$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61881d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h<Object> f61882e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ E0<Object> f61883f;

            /* renamed from: e3.a$a$b$a, reason: collision with other inner class name */
            static final class C0970a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E0<T> f61884a;

                C0970a(E0<T> e02) {
                    this.f61884a = e02;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                    this.f61884a.setValue(t2);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC2395h<Object> interfaceC2395h, E0<Object> e02, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f61882e = interfaceC2395h;
                this.f61883f = e02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f61882e, this.f61883f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61881d;
                if (i11 == 0) {
                    s.b(obj);
                    C0970a c0970a = new C0970a(this.f61883f);
                    this.f61881d = 1;
                    if (this.f61882e.collect(c0970a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0968a(CoroutineContext coroutineContext, InterfaceC2395h<Object> interfaceC2395h, E0<Object> e02, kotlin.coroutines.d<? super C0968a> dVar) {
            super(2, dVar);
            this.f61877e = coroutineContext;
            this.f61878f = interfaceC2395h;
            this.f61879g = e02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new C0968a(this.f61877e, this.f61878f, this.f61879g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0968a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            if (r5.collect(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            if (xe.C10727i.f(r1, r7, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61876d;
            if (i11 == 0) {
                s.b(obj);
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
                CoroutineContext coroutineContext = this.f61877e;
                boolean d11 = Intrinsics.d(coroutineContext, gVar);
                E0<Object> e02 = this.f61879g;
                InterfaceC2395h<Object> interfaceC2395h = this.f61878f;
                if (d11) {
                    C0969a c0969a = new C0969a(e02);
                    this.f61876d = 1;
                } else {
                    b bVar = new b(interfaceC2395h, e02, null);
                    this.f61876d = 2;
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6284a(AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, CoroutineContext coroutineContext, InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C6284a> dVar) {
        super(2, dVar);
        this.f61872f = abstractC5434v;
        this.f61873g = bVar;
        this.f61874h = coroutineContext;
        this.f61875i = interfaceC2395h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C6284a c6284a = new C6284a(this.f61872f, this.f61873g, this.f61874h, this.f61875i, dVar);
        c6284a.f61871e = obj;
        return c6284a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E0<Object> e02, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6284a) create(e02, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61870d;
        if (i11 == 0) {
            s.b(obj);
            C0968a c0968a = new C0968a(this.f61874h, this.f61875i, (E0) this.f61871e, null);
            this.f61870d = 1;
            if (C5412d0.a(this.f61872f, this.f61873g, c0968a, this) == aVar) {
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
