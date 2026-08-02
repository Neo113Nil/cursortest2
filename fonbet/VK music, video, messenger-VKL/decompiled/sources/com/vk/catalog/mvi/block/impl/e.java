package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.impl.HeaderView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.enn0;
import xsna.m7a;
import xsna.rnn0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: HeaderView.kt */
@b6l(c = "com.vk.catalog.mvi.block.impl.HeaderView$InlineActor$switchSection$1$switchJob$1", f = "HeaderView.kt", l = {162, 166}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $filterBlockId;
    final /* synthetic */ String $sectionId;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ HeaderView.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HeaderView.c cVar, String str, String str2, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
        this.$sectionId = str;
        this.$filterBlockId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.this$0, this.$sectionId, this.$filterBlockId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1.a(r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r6.a(r1, r5) == r0) goto L17;
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
            m7a m7aVar = this.this$0.c;
            rnn0 rnn0Var = new rnn0(this.$sectionId);
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
        String str = this.$filterBlockId;
        if (str != null) {
            m7a m7aVar2 = this.this$0.c;
            enn0 enn0Var = new enn0(str);
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 2;
        }
        return s3q0.a;
    }
}
