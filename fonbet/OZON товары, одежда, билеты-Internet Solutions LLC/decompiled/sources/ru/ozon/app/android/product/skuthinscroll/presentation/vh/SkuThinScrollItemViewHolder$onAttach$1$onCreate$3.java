package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import Ae.InterfaceC2397i;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder$onAttach$1$onCreate$3", f = "SkuThinScrollItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SkuThinScrollItemViewHolder$onAttach$1$onCreate$3 extends j implements InterfaceC6511n<InterfaceC2397i<? super SkuThinScrollVO.ItemVO>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    SkuThinScrollItemViewHolder$onAttach$1$onCreate$3(d<? super SkuThinScrollItemViewHolder$onAttach$1$onCreate$3> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super SkuThinScrollVO.ItemVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        SkuThinScrollItemViewHolder$onAttach$1$onCreate$3 skuThinScrollItemViewHolder$onAttach$1$onCreate$3 = new SkuThinScrollItemViewHolder$onAttach$1$onCreate$3(dVar);
        skuThinScrollItemViewHolder$onAttach$1$onCreate$3.L$0 = th2;
        return skuThinScrollItemViewHolder$onAttach$1$onCreate$3.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
