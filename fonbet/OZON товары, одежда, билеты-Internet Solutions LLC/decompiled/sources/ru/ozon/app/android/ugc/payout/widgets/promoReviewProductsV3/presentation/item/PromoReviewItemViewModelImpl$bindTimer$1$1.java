package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModelImpl$bindTimer$1$1", f = "PromoReviewItemViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoReviewItemViewModelImpl$bindTimer$1$1 extends j implements Function2<InterfaceC2397i<? super Long>, d<? super Unit>, Object> {
    final /* synthetic */ PromoReviewItemVO.TimerVO $newTimer;
    int label;
    final /* synthetic */ PromoReviewItemViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoReviewItemViewModelImpl$bindTimer$1$1(PromoReviewItemViewModelImpl promoReviewItemViewModelImpl, PromoReviewItemVO.TimerVO timerVO, d<? super PromoReviewItemViewModelImpl$bindTimer$1$1> dVar) {
        super(2, dVar);
        this.this$0 = promoReviewItemViewModelImpl;
        this.$newTimer = timerVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoReviewItemViewModelImpl$bindTimer$1$1(this.this$0, this.$newTimer, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Long> interfaceC2397i, d<? super Unit> dVar) {
        return ((PromoReviewItemViewModelImpl$bindTimer$1$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object updateTimeRemain;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            PromoReviewItemViewModelImpl promoReviewItemViewModelImpl = this.this$0;
            PromoReviewItemVO.TimerVO timerVO = this.$newTimer;
            this.label = 1;
            updateTimeRemain = promoReviewItemViewModelImpl.updateTimeRemain(timerVO, this);
            if (updateTimeRemain == aVar) {
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
