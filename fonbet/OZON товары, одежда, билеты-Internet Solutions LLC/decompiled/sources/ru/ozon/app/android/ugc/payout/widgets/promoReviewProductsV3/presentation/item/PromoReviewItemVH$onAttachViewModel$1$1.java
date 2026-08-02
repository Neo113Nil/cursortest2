package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVH$onAttachViewModel$1$1", f = "PromoReviewItemVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoReviewItemVH$onAttachViewModel$1$1 extends j implements Function2<PromoReviewItemVO.TimerVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromoReviewItemVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoReviewItemVH$onAttachViewModel$1$1(PromoReviewItemVH promoReviewItemVH, d<? super PromoReviewItemVH$onAttachViewModel$1$1> dVar) {
        super(2, dVar);
        this.this$0 = promoReviewItemVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PromoReviewItemVH$onAttachViewModel$1$1 promoReviewItemVH$onAttachViewModel$1$1 = new PromoReviewItemVH$onAttachViewModel$1$1(this.this$0, dVar);
        promoReviewItemVH$onAttachViewModel$1$1.L$0 = obj;
        return promoReviewItemVH$onAttachViewModel$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PromoReviewItemView promoReviewItemView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PromoReviewItemVO.TimerVO timerVO = (PromoReviewItemVO.TimerVO) this.L$0;
        promoReviewItemView = this.this$0.view;
        promoReviewItemView.bindTimer(timerVO);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PromoReviewItemVO.TimerVO timerVO, d<? super Unit> dVar) {
        return ((PromoReviewItemVH$onAttachViewModel$1$1) create(timerVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
