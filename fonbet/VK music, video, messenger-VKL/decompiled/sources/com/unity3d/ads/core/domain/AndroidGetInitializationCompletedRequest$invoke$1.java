package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidGetInitializationCompletedRequest.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", l = {21, 34}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidGetInitializationCompletedRequest$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetInitializationCompletedRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetInitializationCompletedRequest$invoke$1(AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest, spj<? super AndroidGetInitializationCompletedRequest$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidGetInitializationCompletedRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
