package n0;

import Je.InterfaceC3394a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8374O;
import org.jetbrains.annotations.NotNull;
import xe.B0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {214, 167}, m = "invokeSuspend")
/* renamed from: n0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8376Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f76109d;

    /* renamed from: e, reason: collision with root package name */
    Object f76110e;

    /* renamed from: f, reason: collision with root package name */
    Object f76111f;

    /* renamed from: g, reason: collision with root package name */
    C8374O f76112g;

    /* renamed from: h, reason: collision with root package name */
    int f76113h;

    /* renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f76114i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ EnumC8372M f76115j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C8374O f76116k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f76117l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Object f76118m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8376Q(EnumC8372M enumC8372M, C8374O c8374o, Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, Object obj, kotlin.coroutines.d<? super C8376Q> dVar) {
        super(2, dVar);
        this.f76115j = enumC8372M;
        this.f76116k = c8374o;
        this.f76117l = (kotlin.coroutines.jvm.internal.j) function2;
        this.f76118m = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C8376Q c8376q = new C8376Q(this.f76115j, this.f76116k, this.f76117l, this.f76118m, dVar);
        c8376q.f76114i = obj;
        return c8376q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C8376Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C8374O c8374o;
        Je.d dVar;
        Object obj2;
        C8374O.a aVar;
        InterfaceC3394a interfaceC3394a;
        ?? r52;
        C8374O c8374o2;
        Throwable th2;
        C8374O.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f76113h;
        try {
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((xe.M) this.f76114i).getCoroutineContext().get(B0.f105374o0);
                    Intrinsics.f(element);
                    C8374O.a aVar4 = new C8374O.a(this.f76115j, (B0) element);
                    c8374o = this.f76116k;
                    C8374O.c(c8374o, aVar4);
                    dVar = c8374o.f76098b;
                    this.f76114i = aVar4;
                    this.f76109d = dVar;
                    kotlin.coroutines.jvm.internal.j jVar = this.f76117l;
                    this.f76110e = jVar;
                    Object obj3 = this.f76118m;
                    this.f76111f = obj3;
                    this.f76112g = c8374o;
                    this.f76113h = 1;
                    if (dVar.a(this) != aVar3) {
                        obj2 = obj3;
                        aVar = aVar4;
                        interfaceC3394a = dVar;
                        r52 = jVar;
                    }
                    return aVar3;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8374o2 = (C8374O) this.f76110e;
                    interfaceC3394a = this.f76109d;
                    aVar2 = (C8374O.a) this.f76114i;
                    try {
                        Sc.s.b(obj);
                        atomicReference2 = c8374o2.f76097a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        interfaceC3394a.c(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = c8374o2.f76097a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                C8374O c8374o3 = this.f76112g;
                obj2 = this.f76111f;
                Function2 function2 = (Function2) this.f76110e;
                InterfaceC3394a interfaceC3394a2 = this.f76109d;
                aVar = (C8374O.a) this.f76114i;
                Sc.s.b(obj);
                c8374o = c8374o3;
                interfaceC3394a = interfaceC3394a2;
                r52 = function2;
                this.f76114i = aVar;
                this.f76109d = interfaceC3394a;
                this.f76110e = c8374o;
                this.f76111f = null;
                this.f76112g = null;
                this.f76113h = 2;
                Object invoke = r52.invoke(obj2, this);
                if (invoke != aVar3) {
                    c8374o2 = c8374o;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = c8374o2.f76097a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    interfaceC3394a.c(null);
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
        } catch (Throwable th5) {
            r12.c(null);
            throw th5;
        }
    }
}
