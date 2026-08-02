package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Mapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.mapper.Mapper$DefaultImpls", f = "Mapper.kt", i = {0, 0}, l = {6}, m = "map", n = {"$this", "destination$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class Mapper$map$1<I, O> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    Mapper$map$1(Continuation<? super Mapper$map$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Mapper.DefaultImpls.map(null, null, this);
    }
}
