package wg0;

import Ae.C0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wg0.InterfaceC10556c;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugViewModel$sendActivityEvent$1", f = "SentryHelperDebugViewModel.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104546d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f104547e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC10556c.a f104548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, InterfaceC10556c.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f104547e = mVar;
        this.f104548f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f104547e, this.f104548f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104546d;
        if (i11 == 0) {
            s.b(obj);
            c02 = this.f104547e.f104555c;
            this.f104546d = 1;
            if (c02.emit(this.f104548f, this) == aVar) {
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
