package m0;

import Je.InterfaceC3394a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C7981b0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend")
/* renamed from: m0.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7983c0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f73678d;

    /* renamed from: e, reason: collision with root package name */
    Object f73679e;

    /* renamed from: f, reason: collision with root package name */
    C7981b0 f73680f;

    /* renamed from: g, reason: collision with root package name */
    int f73681g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f73682h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Z f73683i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C7981b0 f73684j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f73685k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C7983c0(Z z11, C7981b0 c7981b0, Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super C7983c0> dVar) {
        super(2, dVar);
        this.f73683i = z11;
        this.f73684j = c7981b0;
        this.f73685k = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C7983c0 c7983c0 = new C7983c0(this.f73683i, this.f73684j, this.f73685k, dVar);
        c7983c0.f73682h = obj;
        return c7983c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C7983c0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C7981b0 c7981b0;
        InterfaceC3394a interfaceC3394a;
        ?? r32;
        C7981b0.a aVar;
        InterfaceC3394a interfaceC3394a2;
        C7981b0 c7981b02;
        Throwable th2;
        C7981b0.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f73681g;
        try {
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((xe.M) this.f73682h).getCoroutineContext().get(xe.B0.f105374o0);
                    Intrinsics.f(element);
                    C7981b0.a aVar4 = new C7981b0.a(this.f73683i, (xe.B0) element);
                    c7981b0 = this.f73684j;
                    C7981b0.c(c7981b0, aVar4);
                    interfaceC3394a = c7981b0.f73674b;
                    this.f73682h = aVar4;
                    this.f73678d = interfaceC3394a;
                    kotlin.coroutines.jvm.internal.j jVar = this.f73685k;
                    this.f73679e = jVar;
                    this.f73680f = c7981b0;
                    this.f73681g = 1;
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
                    c7981b02 = (C7981b0) this.f73679e;
                    interfaceC3394a2 = this.f73678d;
                    aVar2 = (C7981b0.a) this.f73682h;
                    try {
                        Sc.s.b(obj);
                        atomicReference2 = c7981b02.f73673a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        interfaceC3394a2.c(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = c7981b02.f73673a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                C7981b0 c7981b03 = this.f73680f;
                Function1 function1 = (Function1) this.f73679e;
                interfaceC3394a = this.f73678d;
                aVar = (C7981b0.a) this.f73682h;
                Sc.s.b(obj);
                c7981b0 = c7981b03;
                r32 = function1;
                this.f73682h = aVar;
                this.f73678d = interfaceC3394a2;
                this.f73679e = c7981b0;
                this.f73680f = null;
                this.f73681g = 2;
                Object invoke = r32.invoke(this);
                if (invoke != aVar3) {
                    c7981b02 = c7981b0;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = c7981b02.f73673a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    interfaceC3394a2.c(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                c7981b02 = c7981b0;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = c7981b02.f73673a;
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
