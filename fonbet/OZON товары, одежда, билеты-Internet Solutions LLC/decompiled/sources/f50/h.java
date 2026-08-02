package f50;

import Sc.s;
import e50.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.network.models.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$handleDownloadingResult$2", f = "CbottomPdfPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f62909d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f62910e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f62911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f62909d = str;
        this.f62910e = fVar;
        this.f62911f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f62910e, this.f62909d, this.f62911f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean z12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        f fVar = this.f62910e;
        z11 = fVar.f62889v;
        StringBuilder sb2 = new StringBuilder("handleDownloadingResult fileType is ");
        String str = this.f62909d;
        sb2.append(str);
        sb2.append(" wasErrorWithPdfPreview ");
        sb2.append(z11);
        L80.a.a("CbottomPdfPreviewViewModel", sb2.toString());
        if (str.length() <= 0 || !kotlin.text.h.t(str, "pdf", false)) {
            fVar.f62887t = new a.C2102a(null);
            fVar.f62888u = d.a.f62013a;
        } else {
            a.b bVar = a.b.f96629a;
            fVar.f62887t = bVar;
            z12 = fVar.f62889v;
            if (!z12 && f.v0(fVar)) {
                fVar.f62888u = new d.b();
                fVar.handleState();
                return Unit.f71690a;
            }
            fVar.f62888u = new d.c(this.f62911f);
            fVar.f62887t = bVar;
        }
        fVar.handleState();
        return Unit.f71690a;
    }
}
