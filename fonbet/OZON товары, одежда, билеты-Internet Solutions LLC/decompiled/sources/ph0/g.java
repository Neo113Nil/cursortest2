package ph0;

import Je.InterfaceC3394a;
import Sc.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.debug.UnfinishedActionsTrackerImpl$launchWithLock$1", f = "UnfinishedActionsTracker.kt", l = {84, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f80553d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.coroutines.jvm.internal.j f80554e;

    /* renamed from: f, reason: collision with root package name */
    int f80555f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f80556g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ h<Object> f80557h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f80558i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(h<Object> hVar, Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f80557h = hVar;
        this.f80558i = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f80557h, this.f80558i, dVar);
        gVar.f80556g = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r8.a(r7) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Je.d dVar;
        ?? r12;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f80555f;
        try {
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.f80556g;
                dVar = ((h) this.f80557h).f80563e;
                this.f80556g = m11;
                this.f80553d = dVar;
                kotlin.coroutines.jvm.internal.j jVar = this.f80558i;
                this.f80554e = jVar;
                this.f80555f = 1;
                r12 = jVar;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3394a = (InterfaceC3394a) this.f80556g;
                    try {
                        s.b(obj);
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC3394a.c(null);
                        throw th2;
                    }
                }
                Function2 function2 = (Function2) this.f80554e;
                Je.d dVar2 = this.f80553d;
                m11 = (M) this.f80556g;
                s.b(obj);
                dVar = dVar2;
                r12 = function2;
            }
            this.f80556g = dVar;
            this.f80553d = null;
            this.f80554e = null;
            this.f80555f = 2;
            if (r12.invoke(m11, this) != aVar) {
                interfaceC3394a = dVar;
                Unit unit2 = Unit.f71690a;
                interfaceC3394a.c(null);
                return Unit.f71690a;
            }
            return aVar;
        } catch (Throwable th4) {
            interfaceC3394a = dVar;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
    }
}
