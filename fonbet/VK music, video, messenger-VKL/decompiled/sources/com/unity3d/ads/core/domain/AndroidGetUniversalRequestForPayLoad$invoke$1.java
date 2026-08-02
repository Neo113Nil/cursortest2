package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidGetUniversalRequestForPayLoad.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidGetUniversalRequestForPayLoad$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetUniversalRequestForPayLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetUniversalRequestForPayLoad$invoke$1(AndroidGetUniversalRequestForPayLoad androidGetUniversalRequestForPayLoad, spj<? super AndroidGetUniversalRequestForPayLoad$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidGetUniversalRequestForPayLoad;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
