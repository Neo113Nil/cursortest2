package d40;

import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.s;
import h3.C6788a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;

/* renamed from: d40.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6085c implements InterfaceC6083a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f61151a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f61152b = new LinkedHashMap();

    @e(c = "ru.ozon.fintech.exchanger.ExchangerImpl$observe$2", f = "ExchangerImpl.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: d40.c$a */
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61153d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f61154e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6085c f61155f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f61156g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f61157h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f61158i;

        /* renamed from: d40.c$a$a, reason: collision with other inner class name */
        static final class C0944a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<T, Unit> f61159a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f61160b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6085c f61161c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f61162d;

            /* JADX WARN: Multi-variable type inference failed */
            C0944a(Function1<? super T, Unit> function1, boolean z11, C6085c c6085c, String str) {
                this.f61159a = function1;
                this.f61160b = z11;
                this.f61161c = c6085c;
                this.f61162d = str;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, d<? super Unit> dVar) {
                this.f61159a.invoke(t2);
                if (this.f61160b) {
                    this.f61161c.a(this.f61162d);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, C6085c c6085c, String str, Function1 function1, boolean z11, d dVar) {
            super(2, dVar);
            this.f61154e = w0Var;
            this.f61155f = c6085c;
            this.f61156g = str;
            this.f61157h = function1;
            this.f61158i = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f61154e, this.f61155f, this.f61156g, this.f61157h, this.f61158i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61153d;
            if (i11 == 0) {
                s.b(obj);
                C6085c c6085c = this.f61155f;
                String str = this.f61156g;
                if (!this.f61154e.equals(C6085c.g(c6085c, str))) {
                    return Unit.f71690a;
                }
                w0 g10 = C6085c.g(c6085c, str);
                C0944a c0944a = new C0944a(this.f61157h, this.f61158i, c6085c, str);
                this.f61153d = 1;
                if (g10.collect(c0944a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    public static final w0 f(C6085c c6085c, Class cls) {
        return c6085c.h(cls);
    }

    public static final w0 g(C6085c c6085c, String str) {
        return c6085c.i(str);
    }

    private final <T> w0<T> h(Class<T> cls) {
        LinkedHashMap linkedHashMap = this.f61151a;
        if (linkedHashMap.get(cls) == null) {
            linkedHashMap.put(cls, E0.a(1, 0, EnumC11113a.DROP_OLDEST));
        }
        Object obj = linkedHashMap.get(cls);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<T of ru.ozon.fintech.exchanger.ExchangerImpl.getOrPut>");
        return (w0) obj;
    }

    private final <T> w0<T> i(String str) {
        LinkedHashMap linkedHashMap = this.f61152b;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, E0.a(1, 0, EnumC11113a.DROP_OLDEST));
        }
        Object obj = linkedHashMap.get(str);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<T of ru.ozon.fintech.exchanger.ExchangerImpl.getOrPut>");
        return (w0) obj;
    }

    @Override // d40.InterfaceC6083a
    public final void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f61152b.remove(key);
    }

    @Override // d40.InterfaceC6083a
    public final <T> void b(@NotNull String key, @NotNull M scope, boolean z11, @NotNull Function1<? super T, Unit> f7) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(f7, "f");
        C10727i.c(scope, null, null, new a(i(key), this, key, f7, z11, null), 3);
    }

    @Override // d40.InterfaceC6083a
    public final void c(@NotNull Object data, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        i(key).tryEmit(data);
    }

    @Override // d40.InterfaceC6083a
    public final <T> void d(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f61151a.remove(clazz);
    }

    @Override // d40.InterfaceC6083a
    public final void e(@NotNull Class clazz, @NotNull C6788a scope, boolean z11, @NotNull Function1 f7) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(f7, "f");
        C10727i.c(scope, null, null, new C6084b(h(clazz), this, clazz, f7, z11, null), 3);
    }

    @Override // d40.InterfaceC6083a
    public final <T> void push(@NotNull T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        h(data.getClass()).tryEmit(data);
    }
}
