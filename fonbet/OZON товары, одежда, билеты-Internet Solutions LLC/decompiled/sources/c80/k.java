package c80;

import Sc.s;
import a80.InterfaceC4961a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.network.models.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$handleDownloadingResult$2", f = "SharingPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f56780d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f56781e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f56782f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f56783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(String str, i iVar, String str2, long j11, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f56780d = str;
        this.f56781e = iVar;
        this.f56782f = str2;
        this.f56783g = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f56780d, this.f56781e, this.f56782f, this.f56783g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean z12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        i iVar = this.f56781e;
        z11 = iVar.f56768y;
        StringBuilder sb2 = new StringBuilder("handleDownloadingResult fileType is ");
        String str = this.f56780d;
        sb2.append(str);
        sb2.append(" wasErrorWithPdfPreview ");
        sb2.append(z11);
        L80.a.a("SharingPreviewViewModel", sb2.toString());
        if (str.length() > 0) {
            a.b bVar = a.b.f96629a;
            iVar.f56766w = bVar;
            a80.b bVar2 = kotlin.text.h.t(str, U30.d.PDF.b(), false) ? a80.b.PDF : (kotlin.text.h.t(str, U30.d.XLS.b(), false) || kotlin.text.h.t(str, "vnd.openxmlformats-officedocument.spreadsheetml.sheet", false)) ? a80.b.XLS : kotlin.text.h.t(str, "txt", false) ? a80.b.ONE_C : kotlin.text.h.t(str, U30.d.XML.b(), false) ? a80.b.XML : kotlin.text.h.t(str, U30.d.ZIP.b(), false) ? a80.b.ZIP : a80.b.TXT;
            if (bVar2 == a80.b.PDF) {
                z12 = iVar.f56768y;
                if (!z12 && i.r0(iVar)) {
                    iVar.f56767x = new InterfaceC4961a.b();
                    iVar.handleState();
                    return Unit.f71690a;
                }
            }
            iVar.f56767x = new InterfaceC4961a.c(this.f56782f, bVar2, i.z0(iVar, this.f56783g));
            iVar.f56766w = bVar;
        } else {
            iVar.f56766w = new a.C2102a(null);
            iVar.f56767x = InterfaceC4961a.C0701a.f36435a;
        }
        iVar.handleState();
        return Unit.f71690a;
    }
}
