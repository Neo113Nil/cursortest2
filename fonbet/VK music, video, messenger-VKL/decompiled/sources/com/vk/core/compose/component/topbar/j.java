package com.vk.core.compose.component.topbar;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.f870;
import xsna.if2;
import xsna.l5g;
import xsna.mtk0;
import xsna.s3q0;
import xsna.spj;
import xsna.vq2;
import xsna.wzs;
import xsna.yvj;

/* compiled from: TopBar.kt */
@b6l(c = "com.vk.core.compose.component.topbar.TopBar$Middle$Text$Title$Content$1$1", f = "TopBar.kt", l = {608}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class j extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Float> $fraction;
    final /* synthetic */ if2<l5g, vq2> $titleColor;
    final /* synthetic */ long $titleColorOverlay;
    final /* synthetic */ long $titleColorRegular;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(if2<l5g, vq2> if2Var, long j, long j2, mtk0<Float> mtk0Var, spj<? super j> spjVar) {
        super(2, spjVar);
        this.$titleColor = if2Var;
        this.$titleColorRegular = j;
        this.$titleColorOverlay = j2;
        this.$fraction = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j(this.$titleColor, this.$titleColorRegular, this.$titleColorOverlay, this.$fraction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<l5g, vq2> if2Var = this.$titleColor;
            l5g l5gVar = new l5g(f870.D(this.$titleColorRegular, this.$titleColorOverlay, this.$fraction.getValue().floatValue()));
            this.label = 1;
            if (if2Var.e(l5gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
