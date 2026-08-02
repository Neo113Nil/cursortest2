package pj0;

import Sc.s;
import fj0.g;
import ij0.InterfaceC7086a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import rj0.InterfaceC9287a;
import xe.M;

@e(c = "ru.ozon.tracker.debug.menu.shared.configuration.presentation.viewmodel.ConfigurationViewModel$onChangedConfiguration$1", f = "ConfigurationViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81242d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d<InterfaceC9287a> f81243e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g<?> f81244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d<InterfaceC9287a> dVar, g<?> gVar, kotlin.coroutines.d<? super b> dVar2) {
        super(2, dVar2);
        this.f81243e = dVar;
        this.f81244f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f81243e, this.f81244f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7086a interfaceC7086a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81242d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC7086a = ((d) this.f81243e).f81249b;
            this.f81242d = 1;
            if (interfaceC7086a.a(this.f81244f, this) == aVar) {
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
