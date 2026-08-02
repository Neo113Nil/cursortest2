package iZ;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Be.m;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import hZ.C6894a;
import java.util.Iterator;
import java.util.List;
import kZ.C7620a;
import kZ.C7622c;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;
import xe.X0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$1", f = "PoPReachabilityInteractor.kt", l = {53}, m = "invokeSuspend")
/* renamed from: iZ.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7035b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f66172d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ x0 f66173e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7036c f66174f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7620a f66175g;

    /* renamed from: iZ.b$a */
    /* synthetic */ class a extends C7719a implements InterfaceC6511n<C6894a, Boolean, kotlin.coroutines.d<? super Pair<? extends C6894a, ? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66176a = new a(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

        @Override // fd.InterfaceC6511n
        public final Object invoke(C6894a c6894a, Boolean bool, kotlin.coroutines.d<? super Pair<? extends C6894a, ? extends Boolean>> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return new Pair(c6894a, bool2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$1$4", f = "PoPReachabilityInteractor.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: iZ.b$b, reason: collision with other inner class name */
    static final class C1086b extends j implements Function2<C6894a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66177d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f66178e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7036c f66179f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1086b(C7036c c7036c, kotlin.coroutines.d<? super C1086b> dVar) {
            super(2, dVar);
            this.f66179f = c7036c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1086b c1086b = new C1086b(this.f66179f, dVar);
            c1086b.f66178e = obj;
            return c1086b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6894a c6894a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1086b) create(c6894a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66177d;
            if (i11 == 0) {
                s.b(obj);
                C6894a.c e11 = ((C6894a) this.f66178e).e();
                if (e11 != null) {
                    this.f66177d = 1;
                    C7036c c7036c = this.f66179f;
                    c7036c.getClass();
                    if (X0.c(new iZ.d(e11, c7036c, null), this) == aVar) {
                        return aVar;
                    }
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$1$invokeSuspend$$inlined$flatMapLatest$1", f = "PoPReachabilityInteractor.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: iZ.b$c */
    public static final class c extends j implements InterfaceC6511n<InterfaceC2397i<? super C6894a>, Pair<? extends C6894a, ? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66180d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f66181e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C7036c f66183g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C7620a f66184h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.coroutines.d dVar, C7036c c7036c, C7620a c7620a) {
            super(3, dVar);
            this.f66183g = c7036c;
            this.f66184h = c7620a;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super C6894a> interfaceC2397i, Pair<? extends C6894a, ? extends Boolean> pair, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(dVar, this.f66183g, this.f66184h);
            cVar.f66181e = interfaceC2397i;
            cVar.f66182f = pair;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00df A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC2395h t2;
            C6894a.c e11;
            boolean z11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66180d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = this.f66181e;
                Pair pair = (Pair) this.f66182f;
                C6894a c6894a = (C6894a) pair.a();
                if (((Boolean) pair.b()).booleanValue() && (e11 = c6894a.e()) != null) {
                    this.f66183g.getClass();
                    boolean isEmpty = e11.b().isEmpty();
                    List<C6894a.c.b> b11 = e11.b();
                    boolean z12 = false;
                    if (!b11.isEmpty()) {
                        Iterator<T> it = b11.iterator();
                        while (it.hasNext()) {
                            if (!((C6894a.c.b) it.next()).a().isEmpty()) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (e11.c() > 0 && e11.a().b() > 0 && e11.a().a() > e11.a().b()) {
                        z12 = true;
                    }
                    if (!isEmpty && z11 && z12) {
                        C6894a.c e12 = c6894a.e();
                        jZ.b timerConfig = new jZ.b(e12.c(), e12.a().b(), e12.a().a());
                        this.f66184h.getClass();
                        Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
                        t2 = new d(new C7622c(timerConfig).c(), c6894a);
                        this.f66180d = 1;
                        if (C2399j.r(interfaceC2397i, t2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                t2 = C2399j.t();
                this.f66180d = 1;
                if (C2399j.r(interfaceC2397i, t2, this) == aVar) {
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

    /* renamed from: iZ.b$d */
    public static final class d implements InterfaceC2395h<C6894a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f66185a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6894a f66186b;

        /* renamed from: iZ.b$d$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f66187a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6894a f66188b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2", f = "PoPReachabilityInteractor.kt", l = {223}, m = "emit")
            /* renamed from: iZ.b$d$a$a, reason: collision with other inner class name */
            public static final class C1087a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f66189d;

                /* renamed from: e, reason: collision with root package name */
                int f66190e;

                public C1087a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f66189d = obj;
                    this.f66190e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, C6894a c6894a) {
                this.f66187a = interfaceC2397i;
                this.f66188b = c6894a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1087a c1087a;
                int i11;
                if (dVar instanceof C1087a) {
                    c1087a = (C1087a) dVar;
                    int i12 = c1087a.f66190e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1087a.f66190e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1087a.f66189d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1087a.f66190e;
                        if (i11 != 0) {
                            s.b(obj2);
                            c1087a.f66190e = 1;
                            if (this.f66187a.emit(this.f66188b, c1087a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1087a = new C1087a(dVar);
                Object obj22 = c1087a.f66189d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1087a.f66190e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public d(InterfaceC2395h interfaceC2395h, C6894a c6894a) {
            this.f66185a = interfaceC2395h;
            this.f66186b = c6894a;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super C6894a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f66185a.collect(new a(interfaceC2397i, this.f66186b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7035b(x0 x0Var, C7036c c7036c, C7620a c7620a, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f66173e = x0Var;
        this.f66174f = c7036c;
        this.f66175g = c7620a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7035b(this.f66173e, this.f66174f, this.f66175g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7035b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f66172d;
        if (i11 == 0) {
            s.b(obj);
            C7036c c7036c = this.f66174f;
            x0Var = c7036c.f66194c;
            m Q11 = C2399j.Q(new C2417s0(this.f66173e, x0Var, a.f66176a), new c(null, c7036c, this.f66175g));
            C1086b c1086b = new C1086b(c7036c, null);
            this.f66172d = 1;
            if (C2399j.h(Q11, c1086b, this) == aVar) {
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
