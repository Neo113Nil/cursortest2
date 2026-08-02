package qe0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Be.u;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import we0.o;
import xe.Y;

/* renamed from: qe0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9046a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M0<C9048c> f82013a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o<C9048c> f82014b;

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.CompassFlackFilter$getFilteredFlow$$inlined$transform$1", f = "CompassFlackFilter.kt", l = {40}, m = "invokeSuspend")
    /* renamed from: qe0.a$a, reason: collision with other inner class name */
    public static final class C1385a extends j implements Function2<InterfaceC2397i<? super C9048c>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82015d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82016e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f82017f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9046a f82018g;

        /* renamed from: qe0.a$a$a, reason: collision with other inner class name */
        public static final class C1386a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i<C9048c> f82019a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C9046a f82020b;

            @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.CompassFlackFilter$getFilteredFlow$$inlined$transform$1$1", f = "CompassFlackFilter.kt", l = {223, 229, 238, 242}, m = "emit")
            /* renamed from: qe0.a$a$a$a, reason: collision with other inner class name */
            public static final class C1387a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82021d;

                /* renamed from: e, reason: collision with root package name */
                int f82022e;

                /* renamed from: g, reason: collision with root package name */
                C1386a f82024g;

                /* renamed from: h, reason: collision with root package name */
                C9048c f82025h;

                /* renamed from: i, reason: collision with root package name */
                InterfaceC2397i f82026i;

                public C1387a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f82021d = obj;
                    this.f82022e |= LinearLayoutManager.INVALID_OFFSET;
                    return C1386a.this.emit(null, this);
                }
            }

            public C1386a(InterfaceC2397i interfaceC2397i, C9046a c9046a) {
                this.f82020b = c9046a;
                this.f82019a = interfaceC2397i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0161, code lost:
            
                if (xe.Y.b(0, r0) == r1) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L49;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                C1387a c1387a;
                int i11;
                C9048c c9048c;
                InterfaceC2397i<C9048c> interfaceC2397i;
                C1386a<T> c1386a;
                if (dVar instanceof C1387a) {
                    c1387a = (C1387a) dVar;
                    int i12 = c1387a.f82022e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1387a.f82022e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c1387a.f82021d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1387a.f82022e;
                        if (i11 != 0) {
                            s.b(obj);
                            c9048c = (C9048c) t2;
                            c1387a.f82024g = this;
                            c1387a.f82025h = c9048c;
                            interfaceC2397i = this.f82019a;
                            c1387a.f82026i = interfaceC2397i;
                            c1387a.f82022e = 1;
                            if (Y.b(0L, c1387a) != aVar) {
                                c1386a = this;
                            }
                            return aVar;
                        }
                        if (i11 == 1) {
                            interfaceC2397i = c1387a.f82026i;
                            c9048c = c1387a.f82025h;
                            c1386a = c1387a.f82024g;
                            s.b(obj);
                        } else {
                            if (i11 != 2 && i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj);
                                return Unit.f71690a;
                            }
                            s.b(obj);
                            c1387a.f82024g = null;
                            c1387a.f82025h = null;
                            c1387a.f82026i = null;
                            c1387a.f82022e = 4;
                        }
                        if (c9048c != null) {
                            C9867b c9867b = C9867b.f99466a;
                            C9867b.g("Received new compass data " + c9048c, null, 6);
                            int h11 = c1386a.f82020b.f82014b.h();
                            C9046a c9046a = c1386a.f82020b;
                            if (h11 < 2) {
                                c9046a.f82014b.b(c9048c);
                                C9867b.g("Size of history cache is less then 2, historyCache.size() = " + c9046a.f82014b.h() + " ", null, 6);
                                c1387a.f82024g = null;
                                c1387a.f82025h = null;
                                c1387a.f82026i = null;
                                c1387a.f82022e = 2;
                            } else {
                                C9048c c9048c2 = (C9048c) c9046a.f82014b.c();
                                Float f7 = c9048c2 != null ? new Float(Math.abs(c9048c2.a() - c9048c.a())) : null;
                                C9048c c9048c3 = (C9048c) c9046a.f82014b.e();
                                Float f11 = c9048c3 != null ? new Float(Math.abs(c9048c3.a() - c9048c.a())) : null;
                                C9867b.g("Calculating diff with history: first = " + f7 + ", last = " + f11, null, 6);
                                if (f7 != null && f7.floatValue() > 4.0f && f11 != null && f11.floatValue() > 2.0f) {
                                    C9867b.g("Filtering done, emit new " + c9048c, null, 6);
                                    c9046a.f82014b.b(c9048c);
                                    c1387a.f82024g = null;
                                    c1387a.f82025h = null;
                                    c1387a.f82026i = null;
                                    c1387a.f82022e = 3;
                                }
                            }
                            return Unit.f71690a;
                        }
                        c1387a.f82024g = null;
                        c1387a.f82025h = null;
                        c1387a.f82026i = null;
                        c1387a.f82022e = 4;
                    }
                }
                c1387a = new C1387a(dVar);
                Object obj2 = c1387a.f82021d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1387a.f82022e;
                if (i11 != 0) {
                }
                if (c9048c != null) {
                }
                c1387a.f82024g = null;
                c1387a.f82025h = null;
                c1387a.f82026i = null;
                c1387a.f82022e = 4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1385a(u uVar, kotlin.coroutines.d dVar, C9046a c9046a) {
            super(2, dVar);
            this.f82017f = uVar;
            this.f82018g = c9046a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            C1385a c1385a = new C1385a(this.f82017f, dVar, this.f82018g);
            c1385a.f82016e = obj;
            return c1385a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super C9048c> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1385a) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82015d;
            if (i11 == 0) {
                s.b(obj);
                C1386a c1386a = new C1386a((InterfaceC2397i) this.f82016e, this.f82018g);
                this.f82015d = 1;
                if (this.f82017f.collect(c1386a, this) == aVar) {
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

    public C9046a(@NotNull M0<C9048c> compassUpdateFlow) {
        Intrinsics.checkNotNullParameter(compassUpdateFlow, "compassUpdateFlow");
        this.f82013a = compassUpdateFlow;
        this.f82014b = new o<>(3);
    }

    @NotNull
    public final InterfaceC2395h<C9048c> b() {
        return C2399j.l(C2399j.A(new C1385a(C2399j.J(this.f82013a, 150L), null, this)), 150L);
    }
}
