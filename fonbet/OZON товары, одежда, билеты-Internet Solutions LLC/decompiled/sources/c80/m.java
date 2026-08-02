package c80;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$onRestartDownloading$1", f = "SharingPreviewViewModel.kt", l = {258}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56790d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f56791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(i iVar, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f56791e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new m(this.f56791e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56790d;
        if (i11 == 0) {
            s.b(obj);
            i iVar = this.f56791e;
            str = iVar.f56759p;
            if (str != null && (str2 = iVar.f56762s) != null) {
                this.f56790d = 1;
                if (i.y0(iVar, str, str2, this) == aVar) {
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
