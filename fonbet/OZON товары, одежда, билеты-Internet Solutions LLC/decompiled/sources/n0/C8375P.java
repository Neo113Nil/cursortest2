package n0;

import Je.InterfaceC3394a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8374O;
import org.jetbrains.annotations.NotNull;
import xe.B0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {214, 126}, m = "invokeSuspend")
/* renamed from: n0.P, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8375P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f76101d;

    /* renamed from: e, reason: collision with root package name */
    Object f76102e;

    /* renamed from: f, reason: collision with root package name */
    C8374O f76103f;

    /* renamed from: g, reason: collision with root package name */
    int f76104g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f76105h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ EnumC8372M f76106i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C8374O f76107j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f76108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8375P(EnumC8372M enumC8372M, C8374O c8374o, Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super C8375P> dVar) {
        super(2, dVar);
        this.f76106i = enumC8372M;
        this.f76107j = c8374o;
        this.f76108k = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C8375P c8375p = new C8375P(this.f76106i, this.f76107j, this.f76108k, dVar);
        c8375p.f76105h = obj;
        return c8375p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C8375P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C8374O c8374o;
        InterfaceC3394a interfaceC3394a;
        ?? r32;
        C8374O.a aVar;
        InterfaceC3394a interfaceC3394a2;
        C8374O c8374o2;
        Throwable th2;
        C8374O.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f76104g;
        try {
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((xe.M) this.f76105h).getCoroutineContext().get(B0.f105374o0);
                    Intrinsics.f(element);
                    C8374O.a aVar4 = new C8374O.a(this.f76106i, (B0) element);
                    c8374o = this.f76107j;
                    C8374O.c(c8374o, aVar4);
                    interfaceC3394a = c8374o.f76098b;
                    this.f76105h = aVar4;
                    this.f76101d = interfaceC3394a;
                    kotlin.coroutines.jvm.internal.j jVar = this.f76108k;
                    this.f76102e = jVar;
                    this.f76103f = c8374o;
                    this.f76104g = 1;
                    if (interfaceC3394a.a(this) != aVar3) {
                        r32 = jVar;
                        aVar = aVar4;
                    }
                    return aVar3;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8374o2 = (C8374O) this.f76102e;
                    interfaceC3394a2 = this.f76101d;
                    aVar2 = (C8374O.a) this.f76105h;
                    try {
                        Sc.s.b(obj);
                        atomicReference2 = c8374o2.f76097a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        interfaceC3394a2.c(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = c8374o2.f76097a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                C8374O c8374o3 = this.f76103f;
                Function1 function1 = (Function1) this.f76102e;
                interfaceC3394a = this.f76101d;
                aVar = (C8374O.a) this.f76105h;
                Sc.s.b(obj);
                c8374o = c8374o3;
                r32 = function1;
                this.f76105h = aVar;
                this.f76101d = interfaceC3394a2;
                this.f76102e = c8374o;
                this.f76103f = null;
                this.f76104g = 2;
                Object invoke = r32.invoke(this);
                if (invoke != aVar3) {
                    c8374o2 = c8374o;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = c8374o2.f76097a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    interfaceC3394a2.c(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                c8374o2 = c8374o;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = c8374o2.f76097a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th2;
            }
            interfaceC3394a2 = interfaceC3394a;
        } catch (Throwable th5) {
            r12.c(null);
            throw th5;
        }
    }
}
