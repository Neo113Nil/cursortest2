package ru.ozon.android.messenger.framework.presentation.search;

import Ae.C0;
import Ae.C2399j;
import Ae.C2417s0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeSearchPipeline$1", f = "ChatSearchViewModel.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91814d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f91815e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9527g f91816f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeSearchPipeline$1$2", f = "ChatSearchViewModel.kt", l = {383}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<K, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91817d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f91818e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C9527g f91819f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9527g c9527g, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f91819f = c9527g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f91819f, dVar);
            aVar.f91818e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(k11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91817d;
            if (i11 == 0) {
                Sc.s.b(obj);
                K k11 = (K) this.f91818e;
                this.f91817d = 1;
                if (C9527g.D0(this.f91819f, k11, this) == aVar) {
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

    public static final class b implements InterfaceC2395h<K> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f91820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M0 f91821b;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f91822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M0 f91823b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeSearchPipeline$1$invokeSuspend$$inlined$map$1$2", f = "ChatSearchViewModel.kt", l = {223}, m = "emit")
            /* renamed from: ru.ozon.android.messenger.framework.presentation.search.y$b$a$a, reason: collision with other inner class name */
            public static final class C1717a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f91824d;

                /* renamed from: e, reason: collision with root package name */
                int f91825e;

                public C1717a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f91824d = obj;
                    this.f91825e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, M0 m02) {
                this.f91822a = interfaceC2397i;
                this.f91823b = m02;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1717a c1717a;
                int i11;
                if (dVar instanceof C1717a) {
                    c1717a = (C1717a) dVar;
                    int i12 = c1717a.f91825e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1717a.f91825e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1717a.f91824d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1717a.f91825e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            Object value = this.f91823b.getValue();
                            c1717a.f91825e = 1;
                            if (this.f91822a.emit(value, c1717a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1717a = new C1717a(dVar);
                Object obj22 = c1717a.f91824d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1717a.f91825e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(C0 c02, M0 m02) {
            this.f91820a = c02;
            this.f91821b = m02;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super K> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f91820a.collect(new a(interfaceC2397i, this.f91821b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeSearchPipeline$1$keyFlow$1", f = "ChatSearchViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<String, String, kotlin.coroutines.d<? super K>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ String f91827d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ String f91828e;

        @Override // fd.InterfaceC6511n
        public final Object invoke(String str, String str2, kotlin.coroutines.d<? super K> dVar) {
            c cVar = new c(3, dVar);
            cVar.f91827d = str;
            cVar.f91828e = str2;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return new K(this.f91827d, this.f91828e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(C9527g c9527g, kotlin.coroutines.d<? super y> dVar) {
        super(2, dVar);
        this.f91816f = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        y yVar = new y(this.f91816f, dVar);
        yVar.f91815e = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        long j11;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91814d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f91815e;
            C9527g c9527g = this.f91816f;
            x0Var = c9527g.f91749v;
            j11 = c9527g.f91741n;
            InterfaceC2395h o11 = C2399j.o(C2399j.l(x0Var, j11));
            x0Var2 = c9527g.f91751x;
            C2417s0 c2417s0 = new C2417s0(o11, x0Var2, new c(3, null));
            int i12 = I0.f818a;
            I0 c11 = I0.a.c();
            x0Var3 = c9527g.f91749v;
            String str = (String) x0Var3.getValue();
            x0Var4 = c9527g.f91751x;
            M0 M11 = C2399j.M(c2417s0, m11, c11, new K(str, (String) x0Var4.getValue()));
            c02 = c9527g.f91750w;
            Be.n F11 = C2399j.F(M11, new b(c02, M11));
            a aVar2 = new a(c9527g, null);
            this.f91814d = 1;
            if (C2399j.h(F11, aVar2, this) == aVar) {
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
