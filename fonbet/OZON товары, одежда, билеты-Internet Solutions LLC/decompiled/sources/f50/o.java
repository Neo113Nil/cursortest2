package f50;

import L30.l;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.PdfPageViewModel$onCreate$1", f = "PdfPageViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f62936d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f62937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, int i11, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f62936d = pVar;
        this.f62937e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f62936d, this.f62937e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        L30.l lVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        p pVar = this.f62936d;
        lVar = pVar.f62938a;
        lVar.h(new l.b(this.f62937e, pVar.e0()));
        return Unit.f71690a;
    }
}
