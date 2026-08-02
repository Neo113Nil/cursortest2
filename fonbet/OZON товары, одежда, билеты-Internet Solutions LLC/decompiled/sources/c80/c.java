package c80;

import L30.l;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.PdfPageViewModel$onCreate$1", f = "PdfPageViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f56720d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f56721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, int i11, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f56720d = dVar;
        this.f56721e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f56720d, this.f56721e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        L30.l lVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        d dVar = this.f56720d;
        lVar = dVar.f56722a;
        lVar.h(new l.b(this.f56721e, dVar.e0()));
        return Unit.f71690a;
    }
}
