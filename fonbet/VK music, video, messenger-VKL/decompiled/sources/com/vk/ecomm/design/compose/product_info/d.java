package com.vk.ecomm.design.compose.product_info;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MarketProductCardMainInfoRichRating.kt */
@b6l(c = "com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfoRichRatingKt$MarketProductCardMainInfoRichRating$2$1", f = "MarketProductCardMainInfoRichRating.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onRatingShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gzs<s3q0> gzsVar, spj<? super d> spjVar) {
        super(2, spjVar);
        this.$onRatingShown = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d(this.$onRatingShown, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onRatingShown.invoke();
        return s3q0.a;
    }
}
