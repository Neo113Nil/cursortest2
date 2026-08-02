package pj0;

import Sc.s;
import ij0.f;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import rj0.InterfaceC9287a;
import xe.M;

@e(c = "ru.ozon.tracker.debug.menu.shared.configuration.presentation.viewmodel.ConfigurationViewModel$onResetConfiguration$1", f = "ConfigurationViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d<InterfaceC9287a> f81246e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ fj0.d<?> f81247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d<InterfaceC9287a> dVar, fj0.d<?> dVar2, kotlin.coroutines.d<? super c> dVar3) {
        super(2, dVar3);
        this.f81246e = dVar;
        this.f81247f = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f81246e, this.f81247f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81245d;
        if (i11 == 0) {
            s.b(obj);
            fVar = ((d) this.f81246e).f81250c;
            this.f81245d = 1;
            if (fVar.a(this.f81247f, this) == aVar) {
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
