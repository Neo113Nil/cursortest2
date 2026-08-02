package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.PromoReviewRefreshConfigurator$onCreate$1", f = "PromoReviewRefreshConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoReviewRefreshConfigurator$onCreate$1 extends j implements Function2<Long, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromoReviewRefreshConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoReviewRefreshConfigurator$onCreate$1(PromoReviewRefreshConfigurator promoReviewRefreshConfigurator, d<? super PromoReviewRefreshConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = promoReviewRefreshConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PromoReviewRefreshConfigurator$onCreate$1 promoReviewRefreshConfigurator$onCreate$1 = new PromoReviewRefreshConfigurator$onCreate$1(this.this$0, dVar);
        promoReviewRefreshConfigurator$onCreate$1.L$0 = obj;
        return promoReviewRefreshConfigurator$onCreate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l11, d<? super Unit> dVar) {
        return ((PromoReviewRefreshConfigurator$onCreate$1) create(l11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.productId = (Long) this.L$0;
        return Unit.f71690a;
    }
}
