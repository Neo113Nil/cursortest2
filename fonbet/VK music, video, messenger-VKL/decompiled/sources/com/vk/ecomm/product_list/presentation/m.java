package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.c530;
import xsna.c5g;
import xsna.s3q0;
import xsna.spj;
import xsna.tpd0;
import xsna.vpd0;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: ProductListMviTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviTaskExecutor$loadProducts$1", f = "ProductListMviTaskExecutor.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<String> $productIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, List<String> list, spj<? super m> spjVar) {
        super(2, spjVar);
        this.this$0 = oVar;
        this.$productIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        m mVar = new m(this.this$0, this.$productIds, spjVar);
        mVar.L$0 = obj;
        return mVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                tpd0 tpd0Var = this.this$0.g;
                List<String> list = this.$productIds;
                this.L$0 = yvjVar;
                this.label = 1;
                obj = tpd0Var.a.a(list, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            zvj.e(yvjVar);
            List<vpd0> list2 = (List) obj;
            o oVar = this.this$0;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (vpd0 vpd0Var : list2) {
                c530 c530Var = vpd0Var.h;
                arrayList.add(vpd0.a(vpd0Var, false, oVar.h.a(c530Var.b, c530Var.a) != ModerationCheckAdultResult.ADULT_NOT_REQUIRED, 131071));
            }
        } catch (Exception e) {
            zvj.e(yvjVar);
        }
        return s3q0.a;
    }
}
