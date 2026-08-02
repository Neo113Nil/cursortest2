package com.vk.musc.kidsmode.impl;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: MusicKidsModeRepositoryImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeRepositoryImpl", f = "MusicKidsModeRepositoryImpl.kt", l = {27}, m = "setMode-gIAlu-s")
/* loaded from: classes3.dex */
public final class a extends ContinuationImpl {
    int I$0;
    int I$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(false, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
