package f50;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$startDownloading$2", f = "CbottomPdfPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f62920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(f fVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f62920d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f62920d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f62920d.handleState();
        return Unit.f71690a;
    }
}
