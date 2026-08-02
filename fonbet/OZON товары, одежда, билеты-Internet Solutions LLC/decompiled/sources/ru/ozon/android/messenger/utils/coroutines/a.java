package ru.ozon.android.messenger.utils.coroutines;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.O;
import xe.U;

/* loaded from: classes10.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<U<T>> f91865a = new AtomicReference<>(null);

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.ControlledRunner", f = "ControlledRunner.kt", l = {66, 68}, m = "cancelPreviousThenRun")
    /* renamed from: ru.ozon.android.messenger.utils.coroutines.a$a, reason: collision with other inner class name */
    static final class C1718a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        a f91866d;

        /* renamed from: e, reason: collision with root package name */
        Function1 f91867e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91868f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a<T> f91869g;

        /* renamed from: h, reason: collision with root package name */
        int f91870h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1718a(a<T> aVar, kotlin.coroutines.d<? super C1718a> dVar) {
            super(dVar);
            this.f91869g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f91868f = obj;
            this.f91870h |= LinearLayoutManager.INVALID_OFFSET;
            return this.f91869g.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2", f = "ControlledRunner.kt", l = {81, 82, 84}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91871d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f91872e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<T> f91873f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f91874g;

        /* renamed from: ru.ozon.android.messenger.utils.coroutines.a$b$a, reason: collision with other inner class name */
        static final class C1719a extends AbstractC7737t implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f91875b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U<T> f91876c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1719a(a<T> aVar, U<? extends T> u11) {
                super(1);
                this.f91875b = aVar;
                this.f91876c = u11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                U<T> u11;
                AtomicReference atomicReference = ((a) this.f91875b).f91865a;
                do {
                    u11 = this.f91876c;
                    if (atomicReference.compareAndSet(u11, null)) {
                        break;
                    }
                } while (atomicReference.get() == u11);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$newTask$1", f = "ControlledRunner.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.utils.coroutines.a$b$b, reason: collision with other inner class name */
        static final class C1720b extends j implements Function2<M, kotlin.coroutines.d<? super T>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f91877d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f91878e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1720b(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super C1720b> dVar) {
                super(2, dVar);
                this.f91878e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1720b(this.f91878e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, Object obj) {
                return ((C1720b) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f91877d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                this.f91877d = 1;
                Object invoke = this.f91878e.invoke(this);
                return invoke == aVar ? aVar : invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a<T> aVar, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f91873f = aVar;
            this.f91874g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f91873f, this.f91874g, dVar);
            bVar.f91872e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, Object obj) {
            return ((b) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            r10 = (xe.U) ((ru.ozon.android.messenger.utils.coroutines.a) r6).f91865a.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            if (r10 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            r9.f91872e = r1;
            r9.f91871d = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            if (xe.E0.c(r10, r9) != r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if (xe.l1.a(r9) != r0) goto L14;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:12:0x004e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            U u11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91871d;
            a<T> aVar2 = this.f91873f;
            if (i11 == 0) {
                s.b(obj);
                U a11 = C10727i.a((M) this.f91872e, null, O.LAZY, new C1720b(this.f91874g, null), 1);
                ((H0) a11).y(new C1719a(aVar2, a11));
                u11 = a11;
            } else if (i11 == 1) {
                u11 = (U) this.f91872e;
                s.b(obj);
                this.f91872e = u11;
                this.f91871d = 2;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                u11 = (U) this.f91872e;
                s.b(obj);
            }
            AtomicReference atomicReference = ((a) aVar2).f91865a;
            while (true) {
                if (!atomicReference.compareAndSet(null, u11)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                } else {
                    this.f91872e = null;
                    this.f91871d = 3;
                    Object s11 = u11.s(this);
                    if (s11 != aVar) {
                        return s11;
                    }
                }
            }
            this.f91872e = u11;
            this.f91871d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.ControlledRunner$joinPreviousOrRun$3", f = "ControlledRunner.kt", l = {140, 143, 146}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91879d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f91880e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<T> f91881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f91882g;

        /* renamed from: ru.ozon.android.messenger.utils.coroutines.a$c$a, reason: collision with other inner class name */
        static final class C1721a extends AbstractC7737t implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f91883b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U<T> f91884c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1721a(a<T> aVar, U<? extends T> u11) {
                super(1);
                this.f91883b = aVar;
                this.f91884c = u11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                U<T> u11;
                AtomicReference atomicReference = ((a) this.f91883b).f91865a;
                do {
                    u11 = this.f91884c;
                    if (atomicReference.compareAndSet(u11, null)) {
                        break;
                    }
                } while (atomicReference.get() == u11);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.ControlledRunner$joinPreviousOrRun$3$newTask$1", f = "ControlledRunner.kt", l = {126}, m = "invokeSuspend")
        static final class b extends j implements Function2<M, kotlin.coroutines.d<? super T>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f91885d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f91886e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f91886e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f91886e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, Object obj) {
                return ((b) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f91885d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                this.f91885d = 1;
                Object invoke = this.f91886e.invoke(this);
                return invoke == aVar ? aVar : invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a<T> aVar, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f91881f = aVar;
            this.f91882g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f91881f, this.f91882g, dVar);
            cVar.f91880e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, Object obj) {
            return ((c) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        
            r10 = (xe.U) ((ru.ozon.android.messenger.utils.coroutines.a) r6).f91865a.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        
            if (r10 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        
            r9.f91880e = r1;
            r9.f91879d = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
        
            if (xe.l1.a(r9) != r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        
            r1.j(null);
            r9.f91880e = null;
            r9.f91879d = 1;
            r10 = r10.s(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            if (r10 != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        
            return r10;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            U u11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91879d;
            a<T> aVar2 = this.f91881f;
            if (i11 == 0) {
                s.b(obj);
                U a11 = C10727i.a((M) this.f91880e, null, O.LAZY, new b(this.f91882g, null), 1);
                ((H0) a11).y(new C1721a(aVar2, a11));
                u11 = a11;
            } else {
                if (i11 == 1) {
                    s.b(obj);
                    return obj;
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                u11 = (U) this.f91880e;
                s.b(obj);
            }
            while (true) {
                AtomicReference atomicReference = ((a) aVar2).f91865a;
                while (true) {
                    if (atomicReference.compareAndSet(null, u11)) {
                        this.f91880e = null;
                        this.f91879d = 3;
                        Object s11 = u11.s(this);
                        if (s11 == aVar) {
                            break;
                        }
                        return s11;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (xe.E0.c(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        C1718a c1718a;
        int i11;
        a<T> aVar;
        if (dVar instanceof C1718a) {
            c1718a = (C1718a) dVar;
            int i12 = c1718a.f91870h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1718a.f91870h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c1718a.f91868f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1718a.f91870h;
                if (i11 != 0) {
                    s.b(obj);
                    U<T> u11 = this.f91865a.get();
                    if (u11 != null) {
                        c1718a.f91866d = this;
                        c1718a.f91867e = function1;
                        c1718a.f91870h = 1;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    function1 = c1718a.f91867e;
                    aVar = c1718a.f91866d;
                    s.b(obj);
                }
                b bVar = new b(aVar, function1, null);
                c1718a.f91866d = null;
                c1718a.f91867e = null;
                c1718a.f91870h = 2;
                Object d11 = N.d(bVar, c1718a);
                return d11 != aVar2 ? aVar2 : d11;
            }
        }
        c1718a = new C1718a(this, dVar);
        Object obj2 = c1718a.f91868f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c1718a.f91870h;
        if (i11 != 0) {
        }
        b bVar2 = new b(aVar, function1, null);
        c1718a.f91866d = null;
        c1718a.f91867e = null;
        c1718a.f91870h = 2;
        Object d112 = N.d(bVar2, c1718a);
        if (d112 != aVar22) {
        }
    }

    public final boolean c() {
        U<T> u11 = this.f91865a.get();
        if (u11 != null) {
            return u11.isActive();
        }
        return false;
    }

    public final Object d(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        U<T> u11 = this.f91865a.get();
        return u11 != null ? u11.s(dVar) : N.d(new c(this, function1, null), dVar);
    }
}
