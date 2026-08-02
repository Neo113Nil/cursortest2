package com.vk.core.compose.reorder;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.d0g0;
import xsna.e0g0;
import xsna.ksr;
import xsna.lsr;
import xsna.nr2;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ssr;
import xsna.yzs;

/* compiled from: Merge.kt */
@b6l(c = "com.vk.core.compose.reorder.ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1", f = "ReorderableState.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1 extends SuspendLambda implements yzs<lsr<? super List<Object>>, Boolean, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d0g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1(spj spjVar, d0g0 d0g0Var) {
        super(3, spjVar);
        this.this$0 = d0g0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super List<Object>> lsrVar, Boolean bool, spj<? super s3q0> spjVar) {
        ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1 reorderableState$visibleItemsChanged$$inlined$flatMapLatest$1 = new ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1(spjVar, this.this$0);
        reorderableState$visibleItemsChanged$$inlined$flatMapLatest$1.L$0 = lsrVar;
        reorderableState$visibleItemsChanged$$inlined$flatMapLatest$1.L$1 = bool;
        return reorderableState$visibleItemsChanged$$inlined$flatMapLatest$1.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            ksr M = ((Boolean) this.L$1).booleanValue() ? nr2.M(new e0g0(this.this$0)) : new ssr(null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (rsr.m(lsrVar, M, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }
}
