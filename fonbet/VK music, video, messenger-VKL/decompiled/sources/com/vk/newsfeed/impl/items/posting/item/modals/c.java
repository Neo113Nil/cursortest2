package com.vk.newsfeed.impl.items.posting.item.modals;

import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.n87;
import xsna.q7v0;
import xsna.rs80;
import xsna.s3q0;
import xsna.spj;
import xsna.wh50;
import xsna.wzs;
import xsna.yvj;

/* compiled from: SimplePostingCreateBottomSheet.kt */
@b6l(c = "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet$1$1$4$1", f = "SimplePostingCreateBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<VkOnboardingCampaign> $occupiedCampaign$delegate;
    final /* synthetic */ wh50<List<a>> $postingItems$delegate;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, wh50<List<a>> wh50Var, wh50<VkOnboardingCampaign> wh50Var2, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$postingItems$delegate = wh50Var;
        this.$occupiedCampaign$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$postingItems$delegate, this.$occupiedCampaign$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q7v0 q7v0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        d dVar = this.this$0;
        rs80 rs80Var = dVar.a;
        if (rs80Var.g && rs80Var.e && (q7v0Var = (q7v0) dVar.g.getValue()) != null) {
            d dVar2 = this.this$0;
            n87 n87Var = new n87(dVar2, this.$postingItems$delegate, this.$occupiedCampaign$delegate, 7);
            dVar2.getClass();
            q7v0Var.init();
            q7v0Var.c(new com.vk.catalog2.common.ui.holders.a(27, q7v0Var, n87Var));
        }
        return s3q0.a;
    }
}
