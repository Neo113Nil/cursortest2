package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import com.vk.ecomm.product_list.presentation.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.aqd0;
import xsna.b6l;
import xsna.c530;
import xsna.c5g;
import xsna.s3q0;
import xsna.spj;
import xsna.vpd0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: ProductListMviTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviTaskExecutor$recalculateRestrictions$1", f = "ProductListMviTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class n extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, spj<? super n> spjVar) {
        super(2, spjVar);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List<vpd0> list = ((aqd0) this.this$0.b.getCurrentState()).e;
        o oVar = this.this$0;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (vpd0 vpd0Var : list) {
            c530 c530Var = vpd0Var.h;
            arrayList.add(vpd0.a(vpd0Var, false, oVar.h.a(c530Var.b, c530Var.a) != ModerationCheckAdultResult.ADULT_NOT_REQUIRED, 131071));
        }
        this.this$0.e(new k.d(arrayList));
        return s3q0.a;
    }
}
