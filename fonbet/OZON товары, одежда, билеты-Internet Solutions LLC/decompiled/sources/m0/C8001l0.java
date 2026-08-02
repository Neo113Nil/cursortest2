package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {509}, m = "invokeSuspend")
/* renamed from: m0.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8001l0 extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73805d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f73806e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f73807f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73808g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73809h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f73810i;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {531}, m = "invokeSuspend")
    /* renamed from: m0.l0$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73811d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f73812e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f73813f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f73814g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C7989f0<Object> f73815h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D0<Object> f73816i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f73817j;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {527}, m = "invokeSuspend")
        /* renamed from: m0.l0$a$a, reason: collision with other inner class name */
        static final class C1250a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73818d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C7989f0<Object> f73819e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1250a(C7989f0<Object> c7989f0, kotlin.coroutines.d<? super C1250a> dVar) {
                super(2, dVar);
                this.f73819e = c7989f0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C1250a(this.f73819e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1250a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73818d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f73818d = 1;
                    if (C7989f0.s(this.f73819e, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, Object obj2, C7989f0<Object> c7989f0, D0<Object> d02, float f7, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f73813f = obj;
            this.f73814g = obj2;
            this.f73815h = c7989f0;
            this.f73816i = d02;
            this.f73817j = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f73813f, this.f73814g, this.f73815h, this.f73816i, this.f73817j, dVar);
            aVar.f73812e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            androidx.collection.J j11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73811d;
            C7989f0<Object> c7989f0 = this.f73815h;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f73812e;
                Object obj2 = this.f73813f;
                Object obj3 = this.f73814g;
                if (Intrinsics.d(obj2, obj3)) {
                    ((C7989f0) c7989f0).f73733n = null;
                    if (Intrinsics.d(c7989f0.a(), obj2)) {
                        return Unit.f71690a;
                    }
                } else {
                    C7989f0.q(c7989f0);
                }
                boolean d11 = Intrinsics.d(obj2, obj3);
                float f7 = this.f73817j;
                if (!d11) {
                    D0<Object> d02 = this.f73816i;
                    d02.E(obj2);
                    d02.B(0L);
                    c7989f0.O(obj2);
                    d02.w(f7);
                }
                C7989f0.v(c7989f0, f7);
                j11 = ((C7989f0) c7989f0).f73732m;
                if (j11.f38647b != 0) {
                    C10727i.c(m11, null, null, new C1250a(c7989f0, null), 3);
                } else {
                    ((C7989f0) c7989f0).f73731l = Long.MIN_VALUE;
                }
                this.f73811d = 1;
                if (C7989f0.y(c7989f0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            c7989f0.L();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8001l0(Object obj, Object obj2, C7989f0<Object> c7989f0, D0<Object> d02, float f7, kotlin.coroutines.d<? super C8001l0> dVar) {
        super(1, dVar);
        this.f73806e = obj;
        this.f73807f = obj2;
        this.f73808g = c7989f0;
        this.f73809h = d02;
        this.f73810i = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C8001l0(this.f73806e, this.f73807f, this.f73808g, this.f73809h, this.f73810i, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8001l0) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73805d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f73806e, this.f73807f, this.f73808g, this.f73809h, this.f73810i, null);
            this.f73805d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
