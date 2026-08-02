package oe0;

import Ae.InterfaceC2397i;
import Je.InterfaceC3394a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import te0.C9867b;
import xe.d1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$selectBestFlowBySamples$1$catchLocationError$1", f = "FusedSubscribeLocationUpdates.kt", l = {345}, m = "invokeSuspend")
/* renamed from: oe0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8715f extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.I f78164d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC7737t f78165e;

    /* renamed from: f, reason: collision with root package name */
    int f78166f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f78167g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f78168h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Je.d f78169i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f78170j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f78171k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8715f(String str, Je.d dVar, kotlin.jvm.internal.I i11, Function0 function0, kotlin.coroutines.d dVar2) {
        super(3, dVar2);
        this.f78168h = str;
        this.f78169i = dVar;
        this.f78170j = i11;
        this.f78171k = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        C8715f c8715f = new C8715f(this.f78168h, this.f78169i, this.f78170j, this.f78171k, dVar);
        c8715f.f78167g = th2;
        return c8715f.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        kotlin.jvm.internal.I i11;
        ?? r02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f78166f;
        try {
            if (i12 == 0) {
                Sc.s.b(obj);
                boolean z11 = ((Throwable) this.f78167g) instanceof d1;
                String str = this.f78168h;
                if (!z11) {
                    C9867b c9867b = C9867b.f99466a;
                    C9867b.g("catch Exception in selectBestFlowBySamples.".concat(str), null, 6);
                    return Unit.f71690a;
                }
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.g("catch TimeoutCancellationException, loose:".concat(str), null, 6);
                interfaceC3394a = this.f78169i;
                this.f78167g = interfaceC3394a;
                i11 = this.f78170j;
                this.f78164d = i11;
                AbstractC7737t abstractC7737t = this.f78171k;
                this.f78165e = abstractC7737t;
                this.f78166f = 1;
                if (interfaceC3394a.a(this) == aVar) {
                    return aVar;
                }
                r02 = abstractC7737t;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0 function0 = (Function0) this.f78165e;
                i11 = this.f78164d;
                interfaceC3394a = (InterfaceC3394a) this.f78167g;
                Sc.s.b(obj);
                r02 = function0;
            }
            i11.f71783a = true;
            r02.invoke();
            Unit unit = Unit.f71690a;
            return Unit.f71690a;
        } finally {
            interfaceC3394a.c(null);
        }
    }
}
