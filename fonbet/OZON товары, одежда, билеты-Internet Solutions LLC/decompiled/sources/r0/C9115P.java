package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import x1.C10638m;
import x1.C10639n;
import x1.C10641p;
import x1.EnumC10640o;
import x1.InterfaceC10628c;
import xe.C10727i;

/* renamed from: r0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9115P {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> f82441a = new a(3, null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82442b = 0;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r0.P$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC9143w interfaceC9143w, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
            c7459e.n();
            return new a(3, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    /* renamed from: r0.P$b */
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC10628c f82443d;

        /* renamed from: e, reason: collision with root package name */
        EnumC10640o f82444e;

        /* renamed from: f, reason: collision with root package name */
        boolean f82445f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82446g;

        /* renamed from: h, reason: collision with root package name */
        int f82447h;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f82446g = obj;
            this.f82447h |= LinearLayoutManager.INVALID_OFFSET;
            return C9115P.c(null, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {Logger.NONE}, m = "invokeSuspend")
    /* renamed from: r0.P$c */
    /* loaded from: classes8.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82448d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82449e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1.F f82450f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f82451g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<C7459e, Unit> f82452h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<C7459e, Unit> f82453i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<C7459e, Unit> f82454j;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend")
        /* renamed from: r0.P$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            Object f82455d;

            /* renamed from: e, reason: collision with root package name */
            Object f82456e;

            /* renamed from: f, reason: collision with root package name */
            kotlin.jvm.internal.M f82457f;

            /* renamed from: g, reason: collision with root package name */
            long f82458g;

            /* renamed from: h, reason: collision with root package name */
            int f82459h;

            /* renamed from: i, reason: collision with root package name */
            private /* synthetic */ Object f82460i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ xe.M f82461j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f82462k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1<C7459e, Unit> f82463l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function1<C7459e, Unit> f82464m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1<C7459e, Unit> f82465n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ C9146z f82466o;

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$a, reason: collision with other inner class name */
            static final class C1401a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C9146z f82467d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1401a(C9146z c9146z, kotlin.coroutines.d<? super C1401a> dVar) {
                    super(2, dVar);
                    this.f82467d = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C1401a(this.f82467d, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1401a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    this.f82467d.s();
                    return Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82468d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C9146z f82469e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C9146z c9146z, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f82469e = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new b(this.f82469e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82468d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        this.f82468d = 1;
                        if (this.f82469e.t(this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$c, reason: collision with other inner class name */
            static final class C1402c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82470d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.jvm.internal.j f82471e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C9146z f82472f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ x1.x f82473g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1402c(InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, C9146z c9146z, x1.x xVar, kotlin.coroutines.d<? super C1402c> dVar) {
                    super(2, dVar);
                    this.f82471e = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                    this.f82472f = c9146z;
                    this.f82473g = xVar;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C1402c(this.f82471e, this.f82472f, this.f82473g, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1402c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82470d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        C7459e a11 = C7459e.a(this.f82473g.f());
                        this.f82470d = 1;
                        if (this.f82471e.invoke(this.f82472f, a11, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$d */
            static final class d extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super x1.x>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82474d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f82475e;

                d() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    d dVar2 = new d(2, dVar);
                    dVar2.f82475e = obj;
                    return dVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super x1.x> dVar) {
                    return ((d) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82474d;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return obj;
                    }
                    Sc.s.b(obj);
                    InterfaceC10628c interfaceC10628c = (InterfaceC10628c) this.f82475e;
                    this.f82474d = 1;
                    Object h11 = C9115P.h(interfaceC10628c, EnumC10640o.Main, this);
                    return h11 == aVar ? aVar : h11;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$e */
            static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C9146z f82476d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C9146z c9146z, kotlin.coroutines.d<? super e> dVar) {
                    super(2, dVar);
                    this.f82476d = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new e(this.f82476d, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    this.f82476d.m();
                    return Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$f */
            static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C9146z f82477d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(C9146z c9146z, kotlin.coroutines.d<? super f> dVar) {
                    super(2, dVar);
                    this.f82477d = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new f(this.f82477d, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    this.f82477d.s();
                    return Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$g */
            static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C9146z f82478d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(C9146z c9146z, kotlin.coroutines.d<? super g> dVar) {
                    super(2, dVar);
                    this.f82478d = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new g(this.f82478d, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    this.f82478d.s();
                    return Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$h */
            static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82479d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C9146z f82480e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C9146z c9146z, kotlin.coroutines.d<? super h> dVar) {
                    super(2, dVar);
                    this.f82480e = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new h(this.f82480e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82479d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        this.f82479d = 1;
                        if (this.f82480e.t(this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$i */
            static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82481d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.jvm.internal.j f82482e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C9146z f82483f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ x1.x f82484g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, C9146z c9146z, x1.x xVar, kotlin.coroutines.d<? super i> dVar) {
                    super(2, dVar);
                    this.f82482e = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                    this.f82483f = c9146z;
                    this.f82484g = xVar;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new i(this.f82482e, this.f82483f, this.f82484g, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82481d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        C7459e a11 = C7459e.a(this.f82484g.f());
                        this.f82481d = 1;
                        if (this.f82482e.invoke(this.f82483f, a11, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            /* renamed from: r0.P$c$a$j */
            static final class j extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f82485d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f82486e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ xe.M f82487f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1<C7459e, Unit> f82488g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1<C7459e, Unit> f82489h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.M<x1.x> f82490i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ C9146z f82491j;

                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                /* renamed from: r0.P$c$a$j$a, reason: collision with other inner class name */
                static final class C1403a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C9146z f82492d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1403a(C9146z c9146z, kotlin.coroutines.d<? super C1403a> dVar) {
                        super(2, dVar);
                        this.f82492d = c9146z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                        return new C1403a(this.f82492d, dVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C1403a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        Sc.s.b(obj);
                        this.f82492d.s();
                        return Unit.f71690a;
                    }
                }

                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                /* renamed from: r0.P$c$a$j$b */
                static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C9146z f82493d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(C9146z c9146z, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f82493d = c9146z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                        return new b(this.f82493d, dVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        Sc.s.b(obj);
                        this.f82493d.m();
                        return Unit.f71690a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(xe.M m11, Function1<? super C7459e, Unit> function1, Function1<? super C7459e, Unit> function12, kotlin.jvm.internal.M<x1.x> m12, C9146z c9146z, kotlin.coroutines.d<? super j> dVar) {
                    super(2, dVar);
                    this.f82487f = m11;
                    this.f82488g = function1;
                    this.f82489h = function12;
                    this.f82490i = m12;
                    this.f82491j = c9146z;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    j jVar = new j(this.f82487f, this.f82488g, this.f82489h, this.f82490i, this.f82491j, dVar);
                    jVar.f82486e = obj;
                    return jVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((j) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f82485d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        InterfaceC10628c interfaceC10628c = (InterfaceC10628c) this.f82486e;
                        this.f82485d = 1;
                        obj = C9115P.h(interfaceC10628c, EnumC10640o.Main, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    x1.x xVar = (x1.x) obj;
                    C9146z c9146z = this.f82491j;
                    xe.M m11 = this.f82487f;
                    if (xVar != null) {
                        xVar.a();
                        C10727i.c(m11, null, null, new C1403a(c9146z, null), 3);
                        this.f82488g.invoke(C7459e.a(xVar.f()));
                        return Unit.f71690a;
                    }
                    C10727i.c(m11, null, null, new b(c9146z, null), 3);
                    Function1<C7459e, Unit> function1 = this.f82489h;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(C7459e.a(this.f82490i.f71787a.f()));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(xe.M m11, InterfaceC6511n<? super InterfaceC9143w, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, Function1<? super C7459e, Unit> function1, Function1<? super C7459e, Unit> function12, Function1<? super C7459e, Unit> function13, C9146z c9146z, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f82461j = m11;
                this.f82462k = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                this.f82463l = function1;
                this.f82464m = function12;
                this.f82465n = function13;
                this.f82466o = c9146z;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C9146z c9146z = this.f82466o;
                a aVar = new a(this.f82461j, this.f82462k, this.f82463l, this.f82464m, this.f82465n, c9146z, dVar);
                aVar.f82460i = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x01ee, code lost:
            
                if (r0.C9115P.a(r4, r20) == r1) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x01be, code lost:
            
                if (r12.k1(r18, r4, r20) == r1) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
            
                if (r0.C9115P.a(r7, r20) != r1) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0093, code lost:
            
                if (r4 == r1) goto L72;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01c5  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01d6  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00eb A[Catch: p -> 0x00f5, TryCatch #4 {p -> 0x00f5, blocks: (B:51:0x00e5, B:53:0x00eb, B:55:0x00f9), top: B:50:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[Catch: p -> 0x00f5, TRY_LEAVE, TryCatch #4 {p -> 0x00f5, blocks: (B:51:0x00e5, B:53:0x00eb, B:55:0x00f9), top: B:50:0x00e5 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
            /* JADX WARN: Type inference failed for: r3v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC10628c interfaceC10628c;
                Object d11;
                InterfaceC10628c interfaceC10628c2;
                x1.x xVar;
                long e11;
                kotlin.jvm.internal.M m11;
                Object k12;
                InterfaceC10628c interfaceC10628c3;
                x1.x xVar2;
                kotlin.jvm.internal.M m12;
                InterfaceC10628c interfaceC10628c4;
                int i11;
                T t2;
                T t11;
                T t12;
                Object J02;
                long j11;
                x1.x xVar3;
                kotlin.jvm.internal.M m13;
                InterfaceC10628c interfaceC10628c5;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f82459h;
                ?? r32 = this.f82462k;
                C9146z c9146z = this.f82466o;
                Function1<C7459e, Unit> function1 = this.f82464m;
                xe.M m14 = this.f82461j;
                Function1<C7459e, Unit> function12 = this.f82465n;
                Function1<C7459e, Unit> function13 = this.f82463l;
                switch (i12) {
                    case 0:
                        Sc.s.b(obj);
                        interfaceC10628c = (InterfaceC10628c) this.f82460i;
                        this.f82460i = interfaceC10628c;
                        this.f82459h = 1;
                        d11 = C9115P.d(interfaceC10628c, null, this, 3);
                        break;
                    case 1:
                        interfaceC10628c = (InterfaceC10628c) this.f82460i;
                        Sc.s.b(obj);
                        d11 = obj;
                        interfaceC10628c2 = interfaceC10628c;
                        xVar = (x1.x) d11;
                        xVar.a();
                        C10727i.c(m14, null, null, new b(c9146z, null), 3);
                        if (r32 != C9115P.f82441a) {
                            C10727i.c(m14, null, null, new C1402c(r32, c9146z, xVar, null), 3);
                        }
                        e11 = function13 != null ? interfaceC10628c2.b().e() : 4611686018427387903L;
                        m11 = new kotlin.jvm.internal.M();
                        try {
                            d dVar = new d(2, null);
                            this.f82460i = interfaceC10628c2;
                            this.f82455d = xVar;
                            this.f82456e = m11;
                            this.f82457f = m11;
                            this.f82458g = e11;
                            this.f82459h = 2;
                            k12 = interfaceC10628c2.k1(e11, dVar, this);
                        } catch (C10641p unused) {
                            interfaceC10628c4 = interfaceC10628c2;
                            if (function13 != null) {
                            }
                            this.f82460i = interfaceC10628c4;
                            this.f82455d = m11;
                            this.f82456e = null;
                            this.f82457f = null;
                            this.f82458g = e11;
                            i11 = 3;
                            this.f82459h = 3;
                            break;
                        }
                        if (k12 != aVar) {
                            interfaceC10628c3 = interfaceC10628c2;
                            xVar2 = xVar;
                            m12 = m11;
                            t2 = k12;
                            try {
                                m11.f71787a = t2;
                                t11 = m12.f71787a;
                                if (t11 != 0) {
                                    C10727i.c(m14, null, null, new e(c9146z, null), 3);
                                } else {
                                    ((x1.x) t11).a();
                                    C10727i.c(m14, null, null, new f(c9146z, null), 3);
                                }
                                m11 = m12;
                            } catch (C10641p unused2) {
                                m11 = m12;
                                xVar = xVar2;
                                interfaceC10628c4 = interfaceC10628c3;
                                if (function13 != null) {
                                }
                                this.f82460i = interfaceC10628c4;
                                this.f82455d = m11;
                                this.f82456e = null;
                                this.f82457f = null;
                                this.f82458g = e11;
                                i11 = 3;
                                this.f82459h = 3;
                            }
                            t12 = m11.f71787a;
                            if (t12 != 0) {
                                if (function1 != null) {
                                    this.f82460i = interfaceC10628c3;
                                    this.f82455d = m11;
                                    this.f82456e = null;
                                    this.f82457f = null;
                                    this.f82458g = e11;
                                    this.f82459h = 4;
                                    int i13 = C9115P.f82442b;
                                    long j12 = e11;
                                    J02 = interfaceC10628c3.J0(interfaceC10628c3.b().d(), new C9116Q((x1.x) t12, null), this);
                                    if (J02 != aVar) {
                                        j11 = j12;
                                        kotlin.jvm.internal.M m15 = m11;
                                        xVar3 = (x1.x) J02;
                                        if (xVar3 == null) {
                                            C10727i.c(m14, null, null, new h(c9146z, null), 3);
                                            if (r32 != C9115P.f82441a) {
                                                C10727i.c(m14, null, null, new i(r32, c9146z, xVar3, null), 3);
                                            }
                                            try {
                                                j jVar = new j(this.f82461j, function1, this.f82465n, m15, c9146z, null);
                                                this.f82460i = interfaceC10628c3;
                                                this.f82455d = m15;
                                                this.f82456e = xVar3;
                                                this.f82459h = 5;
                                                break;
                                            } catch (C10641p unused3) {
                                                m13 = m15;
                                                interfaceC10628c5 = interfaceC10628c3;
                                                if (function12 != null) {
                                                }
                                                if (function13 != null) {
                                                }
                                                this.f82460i = null;
                                                this.f82455d = null;
                                                this.f82456e = null;
                                                this.f82459h = 6;
                                                break;
                                            }
                                        } else if (function12 != null) {
                                            function12.invoke(C7459e.a(((x1.x) m15.f71787a).f()));
                                        }
                                    }
                                } else if (function12 != null) {
                                    function12.invoke(C7459e.a(((x1.x) t12).f()));
                                }
                            }
                            return Unit.f71690a;
                        }
                        return aVar;
                    case 2:
                        e11 = this.f82458g;
                        m11 = this.f82457f;
                        kotlin.jvm.internal.M m16 = (kotlin.jvm.internal.M) this.f82456e;
                        xVar = (x1.x) this.f82455d;
                        interfaceC10628c2 = (InterfaceC10628c) this.f82460i;
                        try {
                            Sc.s.b(obj);
                            interfaceC10628c3 = interfaceC10628c2;
                            xVar2 = xVar;
                            m12 = m16;
                            t2 = obj;
                            m11.f71787a = t2;
                            t11 = m12.f71787a;
                            if (t11 != 0) {
                            }
                            m11 = m12;
                        } catch (C10641p unused4) {
                            m11 = m16;
                            interfaceC10628c4 = interfaceC10628c2;
                            if (function13 != null) {
                                function13.invoke(C7459e.a(xVar.f()));
                            }
                            this.f82460i = interfaceC10628c4;
                            this.f82455d = m11;
                            this.f82456e = null;
                            this.f82457f = null;
                            this.f82458g = e11;
                            i11 = 3;
                            this.f82459h = 3;
                            break;
                        }
                        t12 = m11.f71787a;
                        if (t12 != 0) {
                        }
                        return Unit.f71690a;
                    case 3:
                        e11 = this.f82458g;
                        m11 = (kotlin.jvm.internal.M) this.f82455d;
                        interfaceC10628c4 = (InterfaceC10628c) this.f82460i;
                        Sc.s.b(obj);
                        i11 = 3;
                        C10727i.c(m14, null, null, new g(c9146z, null), i11);
                        interfaceC10628c3 = interfaceC10628c4;
                        t12 = m11.f71787a;
                        if (t12 != 0) {
                        }
                        return Unit.f71690a;
                    case 4:
                        long j13 = this.f82458g;
                        m11 = (kotlin.jvm.internal.M) this.f82455d;
                        InterfaceC10628c interfaceC10628c6 = (InterfaceC10628c) this.f82460i;
                        Sc.s.b(obj);
                        j11 = j13;
                        interfaceC10628c3 = interfaceC10628c6;
                        J02 = obj;
                        kotlin.jvm.internal.M m152 = m11;
                        xVar3 = (x1.x) J02;
                        if (xVar3 == null) {
                        }
                        return Unit.f71690a;
                    case 5:
                        xVar3 = (x1.x) this.f82456e;
                        m13 = (kotlin.jvm.internal.M) this.f82455d;
                        interfaceC10628c5 = (InterfaceC10628c) this.f82460i;
                        try {
                            Sc.s.b(obj);
                        } catch (C10641p unused5) {
                            if (function12 != null) {
                                function12.invoke(C7459e.a(((x1.x) m13.f71787a).f()));
                            }
                            if (function13 != null) {
                                function13.invoke(C7459e.a(xVar3.f()));
                            }
                            this.f82460i = null;
                            this.f82455d = null;
                            this.f82456e = null;
                            this.f82459h = 6;
                            break;
                        }
                        return Unit.f71690a;
                    case 6:
                        Sc.s.b(obj);
                        C10727i.c(m14, null, null, new C1401a(c9146z, null), 3);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar, Function1 function1, Function1 function12, Function1 function13, x1.F f7) {
            super(2, dVar);
            this.f82450f = f7;
            this.f82451g = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
            this.f82452h = function1;
            this.f82453i = function12;
            this.f82454j = function13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            Function1<C7459e, Unit> function1 = this.f82453i;
            c cVar = new c(this.f82451g, dVar, this.f82452h, function1, this.f82454j, this.f82450f);
            cVar.f82449e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82448d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f82449e;
                x1.F f7 = this.f82450f;
                C9146z c9146z = new C9146z(f7);
                a aVar2 = new a(m11, this.f82451g, this.f82452h, this.f82453i, this.f82454j, c9146z, null);
                this.f82448d = 1;
                if (C9140t.b(f7, aVar2, this) == aVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[LOOP:0: B:11:0x004d->B:12:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC10628c interfaceC10628c, kotlin.coroutines.jvm.internal.a aVar) {
        C9117S c9117s;
        int i11;
        int size;
        int i12;
        int i13;
        int size2;
        if (aVar instanceof C9117S) {
            c9117s = (C9117S) aVar;
            int i14 = c9117s.f82500f;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9117s.f82500f = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9117s.f82499e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9117s.f82500f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c9117s.f82498d = interfaceC10628c;
                    c9117s.f82500f = 1;
                    obj = interfaceC10628c.i0(EnumC10640o.Main, c9117s);
                    if (obj == aVar2) {
                    }
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b11 = c10638m.b();
                    size = b11.size();
                    i12 = 0;
                    while (i13 < size) {
                    }
                    List<x1.x> b12 = c10638m.b();
                    size2 = b12.size();
                    while (i12 < size2) {
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC10628c = c9117s.f82498d;
                Sc.s.b(obj);
                C10638m c10638m2 = (C10638m) obj;
                List<x1.x> b112 = c10638m2.b();
                size = b112.size();
                i12 = 0;
                for (i13 = 0; i13 < size; i13++) {
                    b112.get(i13).a();
                }
                List<x1.x> b122 = c10638m2.b();
                size2 = b122.size();
                while (i12 < size2) {
                    if (b122.get(i12).g()) {
                        c9117s.f82498d = interfaceC10628c;
                        c9117s.f82500f = 1;
                        obj = interfaceC10628c.i0(EnumC10640o.Main, c9117s);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C10638m c10638m22 = (C10638m) obj;
                        List<x1.x> b1122 = c10638m22.b();
                        size = b1122.size();
                        i12 = 0;
                        while (i13 < size) {
                        }
                        List<x1.x> b1222 = c10638m22.b();
                        size2 = b1222.size();
                        while (i12 < size2) {
                        }
                    } else {
                        i12++;
                    }
                }
                return Unit.f71690a;
            }
        }
        c9117s = new C9117S(aVar);
        Object obj2 = c9117s.f82499e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9117s.f82500f;
        if (i11 != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull x1.InterfaceC10628c r10, boolean r11, @org.jetbrains.annotations.NotNull x1.EnumC10640o r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super x1.x> r13) {
        /*
            boolean r0 = r13 instanceof r0.C9115P.b
            if (r0 == 0) goto L13
            r0 = r13
            r0.P$b r0 = (r0.C9115P.b) r0
            int r1 = r0.f82447h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82447h = r1
            goto L18
        L13:
            r0.P$b r0 = new r0.P$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f82446g
            Wc.a r1 = Wc.a.COROUTINE_SUSPENDED
            int r2 = r0.f82447h
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f82445f
            x1.o r11 = r0.f82444e
            x1.c r12 = r0.f82443d
            Sc.s.b(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            Sc.s.b(r13)
        L3c:
            r0.f82443d = r10
            r0.f82444e = r12
            r0.f82445f = r11
            r0.f82447h = r3
            java.lang.Object r13 = r10.i0(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            x1.m r13 = (x1.C10638m) r13
            java.util.List r2 = r13.b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L57:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            x1.x r7 = (x1.x) r7
            if (r11 == 0) goto L77
            boolean r8 = r7.n()
            if (r8 != 0) goto L75
            boolean r8 = r7.j()
            if (r8 != 0) goto L75
            boolean r7 = r7.g()
            if (r7 == 0) goto L75
            r7 = r3
            goto L7b
        L75:
            r7 = r5
            goto L7b
        L77:
            boolean r7 = x1.C10639n.a(r7)
        L7b:
            if (r7 != 0) goto L7f
            r2 = r5
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L57
        L82:
            r2 = r3
        L83:
            if (r2 == 0) goto L3c
            java.util.List r10 = r13.b()
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C9115P.c(x1.c, boolean, x1.o, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object d(InterfaceC10628c interfaceC10628c, EnumC10640o enumC10640o, kotlin.coroutines.d dVar, int i11) {
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 2) != 0) {
            enumC10640o = EnumC10640o.Main;
        }
        return c(interfaceC10628c, z11, enumC10640o, dVar);
    }

    public static final Object e(@NotNull x1.F f7, @NotNull InterfaceC6511n interfaceC6511n, Function1 function1, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11 = xe.N.d(new C9118T(f7, interfaceC6511n, function1, new C9146z(f7), null), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public static final Object f(@NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.d dVar, Function1 function1, Function1 function12, Function1 function13, @NotNull x1.F f7) {
        Object d11 = xe.N.d(new c(interfaceC6511n, null, function12, function1, function13, f7), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(@NotNull InterfaceC10628c interfaceC10628c, @NotNull EnumC10640o enumC10640o, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        C9119U c9119u;
        int i11;
        InterfaceC10628c interfaceC10628c2;
        EnumC10640o enumC10640o2;
        int size;
        int i12;
        if (aVar instanceof C9119U) {
            c9119u = (C9119U) aVar;
            int i13 = c9119u.f82524g;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9119u.f82524g = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9119u.f82523f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9119u.f82524g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c9119u.f82521d = interfaceC10628c;
                    c9119u.f82522e = enumC10640o;
                    c9119u.f82524g = 1;
                    obj = interfaceC10628c.i0(enumC10640o, c9119u);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 == 1) {
                    enumC10640o2 = c9119u.f82522e;
                    interfaceC10628c2 = c9119u.f82521d;
                    Sc.s.b(obj);
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b11 = c10638m.b();
                    size = b11.size();
                    while (i12 < size) {
                    }
                    return c10638m.b().get(0);
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC10640o2 = c9119u.f82522e;
                interfaceC10628c2 = c9119u.f82521d;
                Sc.s.b(obj);
                InterfaceC10628c interfaceC10628c3 = interfaceC10628c2;
                enumC10640o = enumC10640o2;
                interfaceC10628c = interfaceC10628c3;
                List<x1.x> b12 = ((C10638m) obj).b();
                int size2 = b12.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (b12.get(i14).n()) {
                        return null;
                    }
                }
                c9119u.f82521d = interfaceC10628c;
                c9119u.f82522e = enumC10640o;
                c9119u.f82524g = 1;
                obj = interfaceC10628c.i0(enumC10640o, c9119u);
                if (obj != aVar2) {
                    EnumC10640o enumC10640o3 = enumC10640o;
                    interfaceC10628c2 = interfaceC10628c;
                    enumC10640o2 = enumC10640o3;
                    C10638m c10638m2 = (C10638m) obj;
                    List<x1.x> b112 = c10638m2.b();
                    size = b112.size();
                    for (i12 = 0; i12 < size; i12++) {
                        if (!C10639n.b(b112.get(i12))) {
                            List<x1.x> b13 = c10638m2.b();
                            int size3 = b13.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                x1.x xVar = b13.get(i15);
                                if (xVar.n() || C10639n.e(xVar, interfaceC10628c2.a(), interfaceC10628c2.W0())) {
                                    return null;
                                }
                            }
                            EnumC10640o enumC10640o4 = EnumC10640o.Final;
                            c9119u.f82521d = interfaceC10628c2;
                            c9119u.f82522e = enumC10640o2;
                            c9119u.f82524g = 2;
                            obj = interfaceC10628c2.i0(enumC10640o4, c9119u);
                        }
                    }
                    return c10638m2.b().get(0);
                }
                return aVar2;
            }
        }
        c9119u = new C9119U(aVar);
        Object obj2 = c9119u.f82523f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9119u.f82524g;
        if (i11 != 0) {
        }
    }
}
