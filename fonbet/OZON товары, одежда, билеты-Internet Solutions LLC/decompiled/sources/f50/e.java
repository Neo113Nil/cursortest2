package f50;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$1$1$1$1", f = "CbottomPdfPreviewViewModel.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62853d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f62854e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f62855f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f62856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, String str, String str2, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f62854e = fVar;
        this.f62855f = str;
        this.f62856g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f62854e, this.f62855f, this.f62856g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62853d;
        if (i11 == 0) {
            s.b(obj);
            this.f62853d = 1;
            if (f.u0(this.f62854e, this.f62855f, this.f62856g, this) == aVar) {
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
