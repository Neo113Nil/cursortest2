package com.vk.catalog.mvi.block.impl.pager;

import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: HorizontalPagerView.kt */
@b6l(c = "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$InlineActor$handleNearEndTrigger$1$2", f = "HorizontalPagerView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class f extends SuspendLambda implements wzs<Result<? extends HorizontalPagerView.State>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HorizontalPagerView.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HorizontalPagerView.c cVar, spj<? super f> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        f fVar = new f(this.this$0, spjVar);
        fVar.L$0 = ((Result) obj).d();
        return fVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Result<? extends HorizontalPagerView.State> result, spj<? super s3q0> spjVar) {
        return ((f) create(new Result(result.d()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        HorizontalPagerView.c cVar = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            final HorizontalPagerView.State state = (HorizontalPagerView.State) obj2;
            cVar.getClass();
            for (CatalogBlockData catalogBlockData : state.d) {
                catalogBlockData.c = cVar.w(catalogBlockData);
            }
            cVar.m(new izs() { // from class: com.vk.catalog.mvi.block.impl.pager.c
                @Override // xsna.izs
                public final Object invoke(Object obj3) {
                    HorizontalPagerView.State state2 = (HorizontalPagerView.State) obj3;
                    List<CatalogBlockData> list = state2.d;
                    HorizontalPagerView.State state3 = HorizontalPagerView.State.this;
                    ArrayList u0 = j5g.u0(state3.d, list);
                    String str = state3.e;
                    int i = state2.f;
                    int size = (state3.d.size() + list.size()) - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    if (i <= size) {
                        size = i;
                    }
                    return HorizontalPagerView.State.a(state2, u0, str, size, false, 35);
                }
            });
        }
        return s3q0.a;
    }
}
