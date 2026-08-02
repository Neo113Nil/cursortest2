package r0;

import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x1.EnumC10640o;
import x1.InterfaceC10628c;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
/* renamed from: r0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9118T extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f82501d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f82502e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x1.F f82503f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f82504g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f82505h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9146z f82506i;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
    /* renamed from: r0.T$a */
    static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82507d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82508e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ xe.M f82509f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f82510g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f82511h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C9146z f82512i;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
        /* renamed from: r0.T$a$a, reason: collision with other inner class name */
        static final class C1404a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f82513d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9146z f82514e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1404a(C9146z c9146z, kotlin.coroutines.d<? super C1404a> dVar) {
                super(2, dVar);
                this.f82514e = c9146z;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C1404a(this.f82514e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1404a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f82513d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f82513d = 1;
                    if (this.f82514e.t(this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: r0.T$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f82515d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f82516e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9146z f82517f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ x1.x f82518g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, C9146z c9146z, x1.x xVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f82516e = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                this.f82517f = c9146z;
                this.f82518g = xVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f82516e, this.f82517f, this.f82518g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f82515d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C7459e a11 = C7459e.a(this.f82518g.f());
                    this.f82515d = 1;
                    if (this.f82516e.invoke(this.f82517f, a11, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: r0.T$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C9146z f82519d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C9146z c9146z, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f82519d = c9146z;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new c(this.f82519d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f82519d.m();
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: r0.T$a$d */
        /* loaded from: classes8.dex */
        static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C9146z f82520d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C9146z c9146z, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f82520d = c9146z;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new d(this.f82520d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f82520d.s();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(xe.M m11, InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, Function1<? super C7459e, Unit> function1, C9146z c9146z, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f82509f = m11;
            this.f82510g = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
            this.f82511h = (AbstractC7737t) function1;
            this.f82512i = c9146z;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            ?? r32 = this.f82511h;
            C9146z c9146z = this.f82512i;
            a aVar = new a(this.f82509f, this.f82510g, r32, c9146z, dVar);
            aVar.f82508e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (r10 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        
            if (r10 == r0) goto L18;
         */
        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        /* JADX WARN: Type inference failed for: r8v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC10628c interfaceC10628c;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82507d;
            C9146z c9146z = this.f82512i;
            xe.M m11 = this.f82509f;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC10628c = (InterfaceC10628c) this.f82508e;
                C10727i.c(m11, null, null, new C1404a(c9146z, null), 3);
                this.f82508e = interfaceC10628c;
                this.f82507d = 1;
                obj = C9115P.d(interfaceC10628c, null, this, 3);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    x1.x xVar = (x1.x) obj;
                    if (xVar == null) {
                        C10727i.c(m11, null, null, new c(c9146z, null), 3);
                    } else {
                        xVar.a();
                        C10727i.c(m11, null, null, new d(c9146z, null), 3);
                        this.f82511h.invoke(C7459e.a(xVar.f()));
                    }
                    return Unit.f71690a;
                }
                interfaceC10628c = (InterfaceC10628c) this.f82508e;
                Sc.s.b(obj);
            }
            x1.x xVar2 = (x1.x) obj;
            xVar2.a();
            InterfaceC6511n interfaceC6511n = C9115P.f82441a;
            ?? r82 = this.f82510g;
            if (r82 != interfaceC6511n) {
                C10727i.c(m11, null, null, new b(r82, c9146z, xVar2, null), 3);
            }
            this.f82508e = null;
            this.f82507d = 2;
            obj = C9115P.h(interfaceC10628c, EnumC10640o.Main, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9118T(x1.F f7, InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, Function1<? super C7459e, Unit> function1, C9146z c9146z, kotlin.coroutines.d<? super C9118T> dVar) {
        super(2, dVar);
        this.f82503f = f7;
        this.f82504g = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
        this.f82505h = (AbstractC7737t) function1;
        this.f82506i = c9146z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        ?? r32 = this.f82505h;
        C9146z c9146z = this.f82506i;
        C9118T c9118t = new C9118T(this.f82503f, this.f82504g, r32, c9146z, dVar);
        c9118t.f82502e = obj;
        return c9118t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9118T) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82501d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((xe.M) this.f82502e, this.f82504g, this.f82505h, this.f82506i, null);
            this.f82501d = 1;
            if (C9140t.b(this.f82503f, aVar2, this) == aVar) {
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
