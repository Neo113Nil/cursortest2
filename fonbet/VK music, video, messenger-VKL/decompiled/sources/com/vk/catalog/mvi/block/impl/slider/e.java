package com.vk.catalog.mvi.block.impl.slider;

import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
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

/* compiled from: SliderView.kt */
@b6l(c = "com.vk.catalog.mvi.block.impl.slider.SliderView$InlineActor$handleNearEndTrigger$1$2", f = "SliderView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class e extends SuspendLambda implements wzs<Result<? extends SliderView.State>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SliderView.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SliderView.a aVar, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        e eVar = new e(this.this$0, spjVar);
        eVar.L$0 = ((Result) obj).d();
        return eVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Result<? extends SliderView.State> result, spj<? super s3q0> spjVar) {
        return ((e) create(new Result(result.d()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        SliderView.a aVar = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            final SliderView.State state = (SliderView.State) obj2;
            aVar.getClass();
            for (CatalogBlockData catalogBlockData : state.d) {
                catalogBlockData.c = aVar.w(catalogBlockData);
            }
            aVar.m(new izs() { // from class: com.vk.catalog.mvi.block.impl.slider.c
                @Override // xsna.izs
                public final Object invoke(Object obj3) {
                    SliderView.State state2 = (SliderView.State) obj3;
                    List<CatalogBlockData> list = state2.d;
                    SliderView.State state3 = SliderView.State.this;
                    return SliderView.State.a(state2, j5g.u0(state3.d, list), state3.e, false, 51);
                }
            });
        }
        return s3q0.a;
    }
}
