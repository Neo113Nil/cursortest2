package com.vk.core.compose.component.topbar;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.f870;
import xsna.if2;
import xsna.l5g;
import xsna.mtk0;
import xsna.q6x;
import xsna.s3q0;
import xsna.spj;
import xsna.sq2;
import xsna.v4j0;
import xsna.vq2;
import xsna.wzs;
import xsna.yvj;

/* compiled from: TopBar.kt */
@b6l(c = "com.vk.core.compose.component.topbar.TopBar$Middle$Text$Subtitle$Content$1$1", f = "TopBar.kt", l = {810, 817}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Float> $fraction;
    final /* synthetic */ if2<l5g, vq2> $subtitleColor;
    final /* synthetic */ long $subtitleColorOverlay;
    final /* synthetic */ long $subtitleColorRegular;
    final /* synthetic */ v4j0 $subtitleShadowOverlay;
    final /* synthetic */ if2<Float, sq2> $subtitleShadowRadius;
    final /* synthetic */ v4j0 $subtitleShadowRegular;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(if2<l5g, vq2> if2Var, long j, long j2, mtk0<Float> mtk0Var, if2<Float, sq2> if2Var2, v4j0 v4j0Var, v4j0 v4j0Var2, spj<? super h> spjVar) {
        super(2, spjVar);
        this.$subtitleColor = if2Var;
        this.$subtitleColorRegular = j;
        this.$subtitleColorOverlay = j2;
        this.$fraction = mtk0Var;
        this.$subtitleShadowRadius = if2Var2;
        this.$subtitleShadowRegular = v4j0Var;
        this.$subtitleShadowOverlay = v4j0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h(this.$subtitleColor, this.$subtitleColorRegular, this.$subtitleColorOverlay, this.$fraction, this.$subtitleShadowRadius, this.$subtitleShadowRegular, this.$subtitleShadowOverlay, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r9.e(r3, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r9.e(r1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<l5g, vq2> if2Var = this.$subtitleColor;
            l5g l5gVar = new l5g(f870.D(this.$subtitleColorRegular, this.$subtitleColorOverlay, this.$fraction.getValue().floatValue()));
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        if2<Float, sq2> if2Var2 = this.$subtitleShadowRadius;
        Float f = new Float(q6x.z(this.$subtitleShadowRegular.c, this.$subtitleShadowOverlay.c, this.$fraction.getValue().floatValue()));
        this.label = 2;
    }
}
