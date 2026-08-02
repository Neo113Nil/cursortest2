package kc0;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import jc0.AbstractC7343f;
import jc0.C7340c;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$1", f = "EntryCredentialsViewModel.kt", l = {191, 196}, m = "invokeSuspend")
/* renamed from: kc0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7628B extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71196d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7629C f71197e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$1$1", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kc0.B$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC7643a.e, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7629C f71198d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7629C c7629c, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71198d = c7629c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f71198d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7643a.e eVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(eVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f71198d.f71221J = true;
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$1$2", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kc0.B$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC7343f.a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f71199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7629C f71200e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7629C c7629c, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f71200e = c7629c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f71200e, dVar);
            bVar.f71199d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC7343f.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C7629C.i1(this.f71200e, ((AbstractC7343f.a) this.f71199d).b());
            return Unit.f71690a;
        }
    }

    /* renamed from: kc0.B$c */
    public static final class c implements InterfaceC2395h<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f71201a;

        /* renamed from: kc0.B$c$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f71202a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "EntryCredentialsViewModel.kt", l = {223}, m = "emit")
            /* renamed from: kc0.B$c$a$a, reason: collision with other inner class name */
            public static final class C1164a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71203d;

                /* renamed from: e, reason: collision with root package name */
                int f71204e;

                public C1164a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71203d = obj;
                    this.f71204e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f71202a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1164a c1164a;
                int i11;
                if (dVar instanceof C1164a) {
                    c1164a = (C1164a) dVar;
                    int i12 = c1164a.f71204e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1164a.f71204e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1164a.f71203d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1164a.f71204e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            if (obj instanceof InterfaceC7643a.e) {
                                c1164a.f71204e = 1;
                                if (this.f71202a.emit(obj, c1164a) == aVar) {
                                    return aVar;
                                }
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
                c1164a = new C1164a(dVar);
                Object obj22 = c1164a.f71203d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1164a.f71204e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public c(w0 w0Var) {
            this.f71201a = w0Var;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f71201a.collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* renamed from: kc0.B$d */
    public static final class d implements InterfaceC2395h<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f71206a;

        /* renamed from: kc0.B$d$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f71207a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$1$invokeSuspend$$inlined$filterIsInstance$2$2", f = "EntryCredentialsViewModel.kt", l = {223}, m = "emit")
            /* renamed from: kc0.B$d$a$a, reason: collision with other inner class name */
            public static final class C1165a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71208d;

                /* renamed from: e, reason: collision with root package name */
                int f71209e;

                public C1165a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71208d = obj;
                    this.f71209e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f71207a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1165a c1165a;
                int i11;
                if (dVar instanceof C1165a) {
                    c1165a = (C1165a) dVar;
                    int i12 = c1165a.f71209e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1165a.f71209e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1165a.f71208d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1165a.f71209e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            if (obj instanceof AbstractC7343f.a) {
                                c1165a.f71209e = 1;
                                if (this.f71207a.emit(obj, c1165a) == aVar) {
                                    return aVar;
                                }
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
                c1165a = new C1165a(dVar);
                Object obj22 = c1165a.f71208d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1165a.f71209e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public d(InterfaceC2395h interfaceC2395h) {
            this.f71206a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f71206a.collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7628B(C7629C c7629c, kotlin.coroutines.d<? super C7628B> dVar) {
        super(2, dVar);
        this.f71197e = c7629c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7628B(this.f71197e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7628B) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (Ae.C2399j.N(r2, r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (Ae.C2399j.N(r6, r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C7340c D02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71196d;
        C7629C c7629c = this.f71197e;
        if (i11 == 0) {
            Sc.s.b(obj);
            C2408n0 c2408n0 = new C2408n0(new c(c7629c.f71214C), new a(c7629c, null));
            C6788a a11 = x0.a(c7629c);
            this.f71196d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        D02 = c7629c.D0();
        C2408n0 c2408n02 = new C2408n0(new d(D02.g()), new b(c7629c, null));
        C6788a a12 = x0.a(c7629c);
        this.f71196d = 2;
    }
}
