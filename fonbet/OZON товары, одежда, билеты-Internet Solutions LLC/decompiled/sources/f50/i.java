package f50;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2PdfDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$onRestartDownloading$1", f = "CbottomPdfPreviewViewModel.kt", l = {438}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62912d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f62913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(f fVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f62913e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f62913e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String url;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62912d;
        if (i11 == 0) {
            s.b(obj);
            f fVar = this.f62913e;
            Cbottom2PdfDTO E02 = fVar.E0();
            if (E02 != null && (url = E02.getUrl()) != null) {
                this.f62912d = 1;
                if (f.B0(fVar, url, this) == aVar) {
                    return aVar;
                }
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
