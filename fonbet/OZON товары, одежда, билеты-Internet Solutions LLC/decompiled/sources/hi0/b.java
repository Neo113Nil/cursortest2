package hi0;

import Sc.r;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;

/* loaded from: classes7.dex */
public final class b implements InterfaceC6959a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f65529a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.CoroutineCronImpl$start$2", f = "CoroutineCron.kt", l = {22}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65530d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f65532f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f65533g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.CoroutineCronImpl$start$2$1", f = "CoroutineCron.kt", l = {}, m = "invokeSuspend")
        /* renamed from: hi0.b$a$a, reason: collision with other inner class name */
        static final class C1069a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f65534d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f65535e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f65536f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f65537g;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.CoroutineCronImpl$start$2$1$1", f = "CoroutineCron.kt", l = {28}, m = "invokeSuspend")
            /* renamed from: hi0.b$a$a$a, reason: collision with other inner class name */
            static final class C1070a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f65538d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f65539e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f65540f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1070a(Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C1070a> dVar) {
                    super(2, dVar);
                    this.f65540f = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C1070a c1070a = new C1070a(this.f65540f, dVar);
                    c1070a.f65539e = obj;
                    return c1070a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1070a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f65538d;
                    try {
                        if (i11 == 0) {
                            s.b(obj);
                            M m11 = (M) this.f65539e;
                            Function2<M, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f65540f;
                            r.Companion companion = r.INSTANCE;
                            this.f65538d = 1;
                            if (function2.invoke(m11, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                        }
                        Unit unit = Unit.f71690a;
                        r.Companion companion2 = r.INSTANCE;
                    } catch (Throwable th2) {
                        r.Companion companion3 = r.INSTANCE;
                        s.a(th2);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1069a(b bVar, long j11, Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C1069a> dVar) {
                super(2, dVar);
                this.f65535e = bVar;
                this.f65536f = j11;
                this.f65537g = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1069a c1069a = new C1069a(this.f65535e, this.f65536f, this.f65537g, dVar);
                c1069a.f65534d = obj;
                return c1069a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1069a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                M repeatByInterval = (M) this.f65534d;
                I context = this.f65535e.f65529a;
                C1070a block = new C1070a(this.f65537g, null);
                int i11 = d.f65547f;
                Intrinsics.checkNotNullParameter(repeatByInterval, "$this$repeatByInterval");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                C10727i.c(repeatByInterval, context, null, new e(this.f65536f, block, null), 2);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j11, Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f65532f = j11;
            this.f65533g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(this.f65532f, this.f65533g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65530d;
            if (i11 == 0) {
                s.b(obj);
                I i12 = b.this.f65529a;
                C1069a c1069a = new C1069a(b.this, this.f65532f, this.f65533g, null);
                this.f65530d = 1;
                if (C10727i.f(i12, c1069a, this) == aVar) {
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

    public b(@NotNull I dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f65529a = dispatcher;
    }

    @Override // hi0.InterfaceC6959a
    public final Object a(long j11, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = N.d(new a(j11, function2, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
