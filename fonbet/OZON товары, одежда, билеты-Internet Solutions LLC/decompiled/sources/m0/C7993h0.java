package m0;

import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C7989f0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {623}, m = "invokeSuspend")
/* renamed from: m0.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7993h0 extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73760d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73761e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73762f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f73763g;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2191, 636, 638, 690, 692}, m = "invokeSuspend")
    /* renamed from: m0.h0$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Je.d f73764d;

        /* renamed from: e, reason: collision with root package name */
        C7989f0 f73765e;

        /* renamed from: f, reason: collision with root package name */
        int f73766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C7989f0<Object> f73767g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f73768h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D0<Object> f73769i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, kotlin.coroutines.d dVar, C7989f0 c7989f0, D0 d02) {
            super(2, dVar);
            this.f73767g = c7989f0;
            this.f73768h = obj;
            this.f73769i = d02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f73768h, dVar, this.f73767g, this.f73769i);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0177, code lost:
        
            if (m0.C7989f0.x(r12, r20) == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
        
            r2 = ((m0.C7989f0) r12).f73733n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x016b, code lost:
        
            if (m0.C7989f0.s(r12, r20) == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
        
            if (m0.C7989f0.y(r12, r20) == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x008d, code lost:
        
            if (m0.C7989f0.h(r12, r20) == r0) goto L68;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Je.d dVar;
            C7989f0<Object> c7989f0;
            C7989f0.b bVar;
            C8008p c8008p;
            C8008p c8008p2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73766f;
            Object obj2 = this.f73768h;
            C7989f0<Object> c7989f02 = this.f73767g;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Object b11 = c7989f02.b();
                    if (!obj2.equals(b11)) {
                        C7989f0.q(c7989f02);
                        C7989f0.v(c7989f02, 0.0f);
                        D0<Object> d02 = this.f73769i;
                        d02.E(obj2);
                        d02.B(0L);
                        c7989f02.d(b11);
                        c7989f02.O(obj2);
                    }
                    Je.d E11 = c7989f02.E();
                    this.f73764d = E11;
                    this.f73765e = c7989f02;
                    this.f73766f = 1;
                    if (E11.a(this) != aVar) {
                        dVar = E11;
                        c7989f0 = c7989f02;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    c7989f0 = this.f73765e;
                    dVar = this.f73764d;
                    Sc.s.b(obj);
                } else if (i11 == 2) {
                    Sc.s.b(obj);
                    this.f73766f = 3;
                } else {
                    if (i11 == 3) {
                        Sc.s.b(obj);
                        if (!Intrinsics.d(c7989f02.a(), obj2)) {
                            if (c7989f02.F() < 1.0f && (bVar == null || !Intrinsics.d(null, bVar.a()))) {
                                X0<C8008p> a11 = bVar != null ? bVar.a() : null;
                                if (a11 != null) {
                                    long e11 = bVar.e();
                                    C8008p f7 = bVar.f();
                                    c8008p2 = C7989f0.f73719s;
                                    C8008p d11 = bVar.d();
                                    if (d11 == null) {
                                        d11 = C7989f0.f73718r;
                                    }
                                    c8008p = a11.d(e11, f7, c8008p2, d11);
                                } else if (bVar == null || bVar.e() == 0) {
                                    c8008p = C7989f0.f73718r;
                                } else {
                                    long c11 = bVar.c();
                                    if (c11 == Long.MIN_VALUE) {
                                        c11 = c7989f02.G();
                                    }
                                    float f11 = c11 / 1.0E9f;
                                    c8008p = f11 <= 0.0f ? C7989f0.f73718r : new C8008p(1.0f / f11);
                                }
                                if (bVar == null) {
                                    bVar = new C7989f0.b();
                                }
                                bVar.i(null);
                                bVar.k(false);
                                bVar.o(c7989f02.F());
                                bVar.f().e(c7989f02.F(), 0);
                                bVar.l(c7989f02.G());
                                bVar.n(0L);
                                bVar.m(c8008p);
                                bVar.j(C6915b.d((1.0d - c7989f02.F()) * c7989f02.G()));
                                ((C7989f0) c7989f02).f73733n = bVar;
                            }
                            this.f73764d = null;
                            this.f73765e = null;
                            this.f73766f = 4;
                        }
                        return Unit.f71690a;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        C7989f0.v(c7989f02, 0.0f);
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                    c7989f02.d(obj2);
                    this.f73766f = 5;
                }
                Object C11 = c7989f0.C();
                dVar.c(null);
                if (!obj2.equals(C11)) {
                    this.f73764d = null;
                    this.f73765e = null;
                    this.f73766f = 2;
                }
                if (!Intrinsics.d(c7989f02.a(), obj2)) {
                }
                return Unit.f71690a;
            } catch (Throwable th2) {
                dVar.c(null);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7993h0(Object obj, kotlin.coroutines.d dVar, C7989f0 c7989f0, D0 d02) {
        super(1, dVar);
        this.f73761e = d02;
        this.f73762f = c7989f0;
        this.f73763g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C7993h0(this.f73763g, dVar, this.f73762f, this.f73761e);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7993h0) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73760d;
        D0<Object> d02 = this.f73761e;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f73763g, null, this.f73762f, d02);
            this.f73760d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        d02.t();
        return Unit.f71690a;
    }
}
